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
  //Driver controller 1
  public static final int DRIVER_CONTROLLER_1 = 0;
  public static final int LEFT_STICK1_Y = 1;
  public static final int RIGHT_STICK1_Y = 5;
  public static final int BUTTON1_A_ID = 1;
  public static final int BUTTON1_Y_ID = 2;
  public static final int BUTTON1_X_ID = 3;
  public static final int BUTTON1_B_ID = 4; 
  //Driver controller 2
  public static final int DRIVER_CONTROLLER_2 = 1;
  public static final int BUTTON2_A_ID = 1;
  public static final int BUTTON2_B_ID = 2;
  public static final int BUTTON2_X_ID = 3;
  public static final int BUTTON2_Y_ID = 4;
  //Drive train
  public static final int MOTOR_LEFT_1_ID = 2;
	public static final int MOTOR_LEFT_2_ID = 3;
	public static final int MOTOR_RIGHT_1_ID = 0;
	public static final int MOTOR_RIGHT_2_ID = 1;
  //Transfer
  public static final int TRANSFER_BACK_ID = 0;
  public static final int TRANSFER_FRONT_ID = 0;
  //Wheel of fortune
  public static final int WHEEL_MOTOR_ID = 0;
  //Shooter
  public static final int RIGHT_SHOOTER_ID = 0;
  public static final int LEFT_SHOOTER_ID = 0;
  //Collection
  public static final int COLLECTION_ID = 3;
  //Pull-up 
  public static final int PULLUP_LEFT_ID = 0;
  public static final int PULLUP_RIGHT_ID = 0;


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // none of the above numbers are known at this point and will be 0 until these numbers are 
  //found using the phenox tuner !!!!!!!!!!
}
