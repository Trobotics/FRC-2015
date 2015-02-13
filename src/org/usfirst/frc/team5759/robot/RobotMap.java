package org.usfirst.frc.team5759.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

	/* Ports */
	
	public static int driveLeftFrontPort = 0;
	public static int driveLeftBackPort = 1;
	
	public static int driveRightFrontPort = 2;
	public static int driveRightBackPort = 3;
	
	public static int liftLeftPort = 4;
	public static int liftRightPort = 5;
	
	public static int joystickDrivePort = 0;
	
	public static int joystickLiftPort = 1;
	
	/* Actuators */
	public static Talon driveLeftFrontMotor = new Talon(driveLeftFrontPort);
	public static Talon driveLeftBackMotor = new Talon(driveLeftBackPort);
	
	public static Talon driveRightFrontMotor = new Talon(driveRightFrontPort);
	public static Talon driveRightBackMotor = new Talon(driveRightBackPort);

	public static Victor liftLeftMotor = new Victor(liftLeftPort);
	public static Victor liftRightMotor = new Victor(liftRightPort);

	public static Joystick joystickDrive = new Joystick(joystickDrivePort);
	
	public static Joystick joystickLift = new Joystick(joystickLiftPort);
//	public static Gyro gyro = new Gyro(channel);
}
