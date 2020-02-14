/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int MOTOR_LEFT_1_ID = 2;// motor controller ID number
	public static final int MOTOR_LEFT_2_ID = 3;// motor controler ID number
	public static final int MOTOR_RIGHT_1_ID = 0;// motor controller ID number
	public static final int MOTOR_RIGHT_2_ID = 1;// motor controller ID number
  public static final int DRIVER_CONTROLLER_1 = 0;// controller port
  public static final int DRIVER_CONTROLLER_2 = 1;// controller port 
	public static final int LEFT_STICK_Y = 1;// stick number
  public static final int RIGHT_STICK_Y = 5;// stick number
  public static final int SHOOTER_ID = 0;
  public static final int COLLECTION_ID = 3; 
  public static final int BUTTON_A_ID = 0;
  public static final int BUTTON_B_ID = 1;
  public static final int BUTTON_Y_ID = 4;

 
  // none of the above numbers are known at this point and will be 0 until these numbers are 
  //found using the phenox tuner !!!!!!!!!!

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
