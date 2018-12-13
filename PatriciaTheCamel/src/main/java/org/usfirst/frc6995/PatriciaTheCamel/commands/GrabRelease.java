// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6995.PatriciaTheCamel.commands;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.usfirst.frc6995.PatriciaTheCamel.Robot;
import org.usfirst.frc6995.PatriciaTheCamel.RobotMap;

/**
 *
 */
public class GrabRelease extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	private static boolean grabberOpen = false;
	private static boolean grabberCommanded = false;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public GrabRelease() {
    	

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.grabber);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	if (Robot.oi.joystick.getRawButton(2)) {
    		release();
    	}
    	if (Robot.oi.joystick.getRawButton(1)) {
    		grab();
    	}
    	else {
    		
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
    
    public static boolean getGrabberOpen() {
    	return grabberOpen;
    }
    
    public static void initMech() {
    	 /*if (!grabberCommanded) { 
    		 grab();
    	 }*/
    }
    
    public static void grab() {
    	RobotMap.grabberGrabberCylinder.set(Value.kReverse);
		grabberOpen = false;
		grabberCommanded = true;
    }
    
    public static void release() {
    	RobotMap.grabberGrabberCylinder.set(Value.kForward);
		grabberOpen = true;
		grabberCommanded = true;
    }
}