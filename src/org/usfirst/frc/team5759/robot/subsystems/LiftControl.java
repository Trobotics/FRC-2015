package org.usfirst.frc.team5759.robot.subsystems;

import org.usfirst.frc.team5759.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftControl extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Victor left = RobotMap.liftLeftMotor;	
	Victor right = RobotMap.liftRightMotor;
	
	Joystick driver = RobotMap.joystickLift;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void start() {
    	RobotMap.liftLeftMotor.set(-RobotMap.joystickLift.getRawAxis(1) * 0.5);
    	RobotMap.liftRightMotor.set(-RobotMap.joystickLift.getRawAxis(1) * 0.5);
    }
}

