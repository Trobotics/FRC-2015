package org.usfirst.frc.team5759.robot;

import org.usfirst.frc.team5759.robot.commands.LiftDown;
import org.usfirst.frc.team5759.robot.commands.LiftUp;
import org.usfirst.frc.team5759.robot.subsystems.DriveControl;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot
{
	public static OI oi;
	
    Command autonomousCommand;
    
	/*AnalogInput analogInput;
	AnalogOutput analogOutput;
	private double range;
	
	double outputMagnitude = 0.5;
	double curve = 0;*/

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period      
        
        /* ***************************************** */
        System.out.println("ROBOT SYSTEMS INITIALIZED");
    }

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.IterativeRobot#robotInit()
	 */

	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void autonomousInit()
	{
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic()
	{
		Scheduler.getInstance().run();
//		drive.drive(outputMagnitude, curve);
		
	}

	public void teleopInit()
	{
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) 
        	autonomousCommand.cancel();
        
        RobotMap.encoder.setDistancePerPulse(10.5);
	}

	/**
	 * This function is called when the disabled button is hit. You can use it
	 * to reset subsystems before shutting down.
	 */
	public void disabledInit()
	{
		
	}
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
        oi.rotateLiftUp.whenPressed(new LiftUp());
        oi.rotateLiftDown.whenPressed(new LiftDown());
        
        if (RobotMap.joystickDrive.getRawButton(2))
        	RobotMap.drive.turn(RobotMap.joystickDrive.getRawAxis(2));
        else
        	RobotMap.drive.move(RobotMap.joystickDrive.getRawAxis(1));
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
