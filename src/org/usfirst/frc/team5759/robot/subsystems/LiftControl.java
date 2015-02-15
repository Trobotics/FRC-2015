package org.usfirst.frc.team5759.robot.subsystems;

import org.usfirst.frc.team5759.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftControl extends Subsystem {
	Victor left = RobotMap.liftLeftMotor;	
	Victor right = RobotMap.liftRightMotor;
	
	Encoder encoder = RobotMap.encoder;
	
    public void initDefaultCommand() {
    	
    }
    
    public void turn(double speed, double distance)
    {
    	double start = encoder.getDistance();
    	double end = start + distance;
    	double current = start;
    	
    	while (current < end)
    	{
    		turn(speed);
    		current = encoder.getDistance();
    	}
    }
    
    public void reset(double speed)
    {
    	turn(speed, encoder.getDistance());
    }
    
    public void turn(double speed) {
    	left.set(speed);
    	right.set(-speed);
    }
    
    public void brake() {
    	left.set(0);
    	right.set(0);
    }
}

