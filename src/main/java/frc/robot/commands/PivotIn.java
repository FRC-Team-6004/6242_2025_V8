// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.constants.PivotConstants;
import frc.robot.subsystems.PivotSub;
import edu.wpi.first.wpilibj2.command.Command;

/** An liftUpCommand that uses an lift subsystem. */
public class PivotIn extends Command {
  private final PivotSub m_pivot;

  /**
   * Powers the lift up, when finished passively holds the lift up.
   * 
   * We recommend that you use this to only move the lift into the hardstop
   * and let the passive portion hold the lift up.
   *
   * @param lift The subsystem used by this command.
   */
  public PivotIn(PivotSub lift) {
    m_pivot = lift;
    addRequirements(lift);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_pivot.movePivot(PivotConstants.Pivot_SPEED_UP);
  }

  // Called once the command ends or is interrupted.
  // Here we run a command that will hold the lift up after to ensure the lift does
  // not drop due to gravity.
  @Override
  public void end(boolean interrupted) {
    m_pivot.movePivot(PivotConstants.Pivot_HOLD_UP);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}