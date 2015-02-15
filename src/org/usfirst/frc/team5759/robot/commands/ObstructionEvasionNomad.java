package org.usfirst.frc.team5759.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ObstructionEvasionNomad extends Command {

//	Ultrasonic ultrasonic = RobotMap.ultrasonic;
	
    public ObstructionEvasionNomad() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	ultrasonic.setEnabled(true);
//    	ultrasonic.setAutomaticMode(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	double range = ultrasonic.getRangeMM();
//    	System.out.println(range);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
//    	ultrasonic.free();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
