package org.usfirst.frc.team1571.robot;



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
	//Drive system
  //  public static int frontLeftMotor = 2;
  //  public static int frontRightMotor = 0;
  //  public static int backLeftMotor = 3;
  //  public static int backRightMotor = 1;
    public class DriveMap {
    	public static final int PWM_LEFT_FRONT = 2;
    	public static final int PWM_LEFT_BACK = 3;
    	public static final int PWM_RIGHT_FRONT = 0;
    	public static final int PWM_RIGHT_BACK = 1;
    }
    //Box Lifter motor
    //public static  boxLifter = 4;
    
    //Holder motors
    public static int holderLeft = 5;
    public static int holderRight = 6;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
