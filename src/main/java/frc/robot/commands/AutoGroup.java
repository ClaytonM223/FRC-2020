/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGroup extends CommandGroup {
  /**
   * Add your docs here.
   */
  public AutoGroup() {
    
    addSequential(new AutoDrive(3, 0.25, 0.25), 3);
    addSequential(new AutoDrive(2, -0.25, -0.25), 3);
    addSequential(new AutoShoot(10), 3);
    addParallel(new AutoDrive(0.3, 0, 0));
    addParallel(new AutoTransfer(10, 0.5));
    
  }


    
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  
}
