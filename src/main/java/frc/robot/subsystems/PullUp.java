/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Lift;

/**
 * Add your docs here.
 */
public class PullUp extends Subsystem {
  private VictorSPX pullUpLeft = new VictorSPX(RobotMap.PULLUP_LEFT_ID);
  private VictorSPX pullUpRight = new VictorSPX(RobotMap.PULLUP_RIGHT_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void setLeftLift(double speed){
    pullUpLeft.set(ControlMode.PercentOutput, speed);
  }

  public void setRightLift(double speed){
    pullUpRight.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Lift());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  

}
