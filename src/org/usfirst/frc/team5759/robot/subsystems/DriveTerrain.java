package org.usfirst.frc.team5759.robot.subsystems;

import org.usfirst.frc.team5759.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTerrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Jaguar leftMotor = RobotMap.leftMotor;
	Jaguar rightMotor = RobotMap.rightMotor;
	
	Joystick joystickDrive = RobotMap.joystickDrive;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void forward() {
    	
    }
    
    enum Quadrant {
    	TopLeft,
    	TopRight,
    	BottomLeft,
    	BottomRight,
    }
    
    public Quadrant getQuadrant(double x, double y)
    {
    	if (x < 0 && y < 0)
    	
    		return Quadrant.TopLeft;
    	
    	else if (x > 0 && y < 0)
    	
    		return Quadrant.TopRight;
    	
    	else if (x < 0 && y > 0)
    	
    		return Quadrant.BottomLeft;
    	
    	else if (x > 0 && y > 0)
    	
    		return Quadrant.BottomLeft;
    	
    	else
    		return null;
    }
}

