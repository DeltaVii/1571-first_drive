package org.usfirst.frc.team1571.robot.subsystems;


import org.usfirst.frc.team1571.robot.RobotMap;
import org.usfirst.frc.team1571.robot.commands.DriveWithJoystick;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive myRobot = new RobotDrive(
			RobotMap.frontLeftMotor, RobotMap.backLeftMotor,
			RobotMap.frontRightMotor, RobotMap.backRightMotor);
	
	
		
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }
    
   public void arcadeDrive(Joystick buttonStick) {
	   myRobot.arcadeDrive(buttonStick);
   }
   
   public void stopDriving() {
	   myRobot.drive(0.0, 0.0);
   }
    
}

