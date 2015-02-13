package org.usfirst.frc.team5759.robot.subsystems;

import org.usfirst.frc.team5759.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveControl extends Subsystem {
  	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Jaguar leftMotor = RobotMap;
	Jaguar rightMotor = RobotMap.rightMotor;
	
	Joystick joystickDrive = RobotMap.joystickDrive;
	
	final int TOP_LEFT = 1;
	final int TOP_RIGHT = 2;
	final int BOTTOM_LEFT = 3;
	final int BOTTOM_RIGHT = 4;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void start() {
    	
    	
    	double XPos = joystickDrive.getX();
    	double YPos = joystickDrive.getY();
    	
    	int current = getQuadrant(XPos, YPos);
    	
    	if (current == 1) 
    	{
    		leftMotor.set(Math.abs(YPos) * Math.abs(XPos));
    		rightMotor.set(Math.abs(YPos));
    	}
    	else if (current == 2)
    	{
    		leftMotor.set(Math.abs(YPos));
    		rightMotor.set(Math.abs(YPos) * Math.abs(XPos));
    	}
    	else if (current == 3)
    	{
    		leftMotor.set(-Math.abs(YPos));
    		rightMotor.set(-(Math.abs(YPos) * Math.abs(XPos)));
    	}
    	else if (current == 4)
    	{
    		leftMotor.set(-Math.abs(YPos));
    		rightMotor.set(-(Math.abs(YPos) * Math.abs(XPos)));
    	}
    }
    
    public int getQuadrant(double x, double y)
    {
    	if (x < 0 && y < 0)
    	
    		return TOP_LEFT;
    	
    	else if (x > 0 && y < 0)
    	
    		return TOP_RIGHT;
    	
    	else if (x < 0 && y > 0)
    	
    		return BOTTOM_LEFT;
    	
    	else if (x > 0 && y > 0)
    	
    		return BOTTOM_RIGHT;
    	
    	else
    		return 0;
    }
}

