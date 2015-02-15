package org.usfirst.frc.team5759.robot.subsystems;

import org.usfirst.frc.team5759.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveControl extends Subsystem {
  	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Talon leftFrontMotor = RobotMap.driveLeftFrontMotor;
	Talon leftBackMotor = RobotMap.driveLeftBackMotor;
	
	Talon rightFrontMotor = RobotMap.driveRightFrontMotor;
	Talon rightBackMotor = RobotMap.driveRightBackMotor;
	
    public void initDefaultCommand() {
        
    }
    
    public void move(double speed) {
    	leftFrontMotor.set(-speed);
    	leftBackMotor.set(-speed);
    	
    	rightFrontMotor.set(speed);
    	rightBackMotor.set(speed);
    }
    
    public void turn(double speed) {
    	leftFrontMotor.set(speed * 0.5);
    	leftBackMotor.set(speed * 0.5);
    	
    	rightFrontMotor.set(speed * 0.5);
    	rightBackMotor.set(speed * 0.5);
    }
}

