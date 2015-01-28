package org.usfirst.frc.team5759.robot;

import javax.swing.ViewportLayout;

import org.usfirst.frc.team5759.robot.commands.ExampleCommand;
import org.usfirst.frc.team5759.robot.commands.ObstructionEvasionNomad;
import org.usfirst.frc.team5759.robot.subsystems.DriveTerrain;
import org.usfirst.frc.team5759.robot.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogOutput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
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

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static OI oi;
	
	Command autonomousCommand;
	AnalogInput analogInput;
	AnalogOutput analogOutput;
	public static final int PING_CHANNEL = 1;
	public static final int ECHO_CHANNEL = 2;
	private double range;
	Ultrasonic ultrasonic;
	
//	RobotDrive drive;
//	double outputMagnitude = 0.5;
//	double curve = 0;
	// ObstructionEvasionNomad obstructionEvasion;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */

	/* (non-Javadoc)
	 * @see edu.wpi.first.wpilibj.IterativeRobot#robotInit()
	 */
	public void robotInit()
	{
		oi = new OI();
		// instantiate the command used for the autonomous period
		autonomousCommand = new ExampleCommand();
//		drive = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);
//		ultrasonic = new Ultrasonic(ECHO_CHANNEL, PING_CHANNEL);
		ultrasonic = new Ultrasonic(PING_CHANNEL, ECHO_CHANNEL);
		ultrasonic.setEnabled(true);
//		ultrasonic.setAutomaticMode(false); setting this to true causes the robot to lose the code
		/* ***************************************** */
		System.out.println("***** ROBOT SYSTEMS INITIALIZED *****");
	}

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
/*		
*/
	
	}

	public void teleopInit()
	{
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		
		
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
	public void teleopPeriodic()
	{
		Scheduler.getInstance().run();	
//		double voltage = analogInput.getVoltage();
//		double range = voltage/58;
//		System.out.println("range " + range);

		System.out.println(ultrasonic.getRangeInches());
		
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic()
	{
		LiveWindow.run();
	}
}
