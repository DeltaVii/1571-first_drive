package org.usfirst.frc.team1571.robot.subsystems;

import org.usfirst.frc.team1571.robot.Robot;
import org.usfirst.frc.team1571.robot.RobotMap;
import org.usfirst.frc.team1571.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class Drive extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController leftFrontMotor;
	private SpeedController leftBackMotor;
	
	private SpeedController rightFrontMotor;
	private SpeedController rightBackMotor;
	
	public Drive() {
		leftFrontMotor = new Victor(RobotMap.DriveMap.PWM_LEFT_FRONT);
		leftBackMotor = new Victor(RobotMap.DriveMap.PWM_LEFT_BACK);
		
		rightFrontMotor = new Victor(RobotMap.DriveMap.PWM_RIGHT_FRONT);
		rightBackMotor = new Jaguar(RobotMap.DriveMap.PWM_RIGHT_BACK);
	}
	
	public void arcadeDrive(Joystick buttonStick){
		double yVal = buttonStick.getRawAxis(1);
		double xVal = buttonStick.getRawAxis(2);
		
		this.setLeftSpeed(someVal);
		this.setRightSpeed(someVal);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }
    
    public void setLeftSpeed(double speed) {
    	leftFrontMotor.set(speed);
    	leftBackMotor.set(speed);
    }
    
    public void setRightSpeed(double speed) {
    	rightFrontMotor.set(-speed);
    	rightBackMotor.set(-speed);
    }
    
    public void stop() {
    	setLeftSpeed(0);
    	setRightSpeed(0);
    }
}

