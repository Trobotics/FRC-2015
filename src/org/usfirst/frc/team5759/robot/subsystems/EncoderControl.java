package org.usfirst.frc.team5759.robot.subsystems;

import org.usfirst.frc.team5759.robot.RobotMap;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/** Encoder class with handler methods for 
 * 		 resetting distance and count */
public class EncoderControl extends Subsystem
{
	private Encoder encoder = RobotMap.encoder;
	private double distance = encoder.getDistance();
	private int counter = encoder.get();

	@Override
	protected void initDefaultCommand()
	{
		// TODO Auto-generated method stub		
	}

	
	/*
	 * Need some logic handling for scaling conversion
	 * setDistancePerPulse()
	 */
	
	
	
	/* **************************************************************** */
/*
	*//** gets the distance *//*
	public double getDistance()
	{
		return distance;
	}*/
	
	/** resetDistance() resets distance to 0 */ 
	public void resetDistance()
	{
		distance = 0;
	}

	/* **************************************************************** */
	
/*	*//** gets the number of revolutions *//*
	public int getCounter()
	{
		return counter;
	}*/

	/** resetCounter() resets counter to 0 */
	public void resetCounter()
	{
		counter = 0;
	}
	
	/* **************************************************************** */
	
	/** reset() resets distance and count to zero */
	public void resetAll()
	{
		encoder.reset();
	}
	
}
