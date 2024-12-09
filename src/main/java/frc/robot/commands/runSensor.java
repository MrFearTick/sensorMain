// Command

package frc.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Intake;

public class runSensor extends Command {

  // Variables //

  // Feeder

  public Feeder m_motorFeeder;
  public DigitalInput m_sensorFeeder;
  public double m_speedFeeder;

  // Intake

  public Intake m_motorIntake;
  public DigitalInput m_sensorIntake;
  public double m_speedIntake;

  // Functions //

  public runSensor
  (Feeder motorFeeder, DigitalInput sensorFeeder, double speedFeeder
  ,Intake motorIntake, DigitalInput sensorIntake, double speedIntake) {

    this.m_motorFeeder = motorFeeder; 
    this.m_sensorFeeder = sensorFeeder;
    this.m_speedFeeder = speedFeeder;

    this.m_motorIntake = motorIntake; 
    this.m_sensorIntake = sensorIntake;
    this.m_speedIntake = speedIntake;
    addRequirements(m_motorFeeder, m_motorIntake);
  }

  // Command //

  @Override
  public void initialize() {}

  @Override
  public void execute() {

    // Feeder

     if (!m_motorFeeder.getSensor()) {
        m_motorFeeder.setSpeed(m_speedFeeder);
     } else {
        m_motorFeeder.setSpeed(0);
     }

     // Intake

     if (!m_motorIntake.getSensor()) {
        m_motorIntake.setSpeed(m_speedIntake);
     } else {
        m_motorIntake.setSpeed(0);
     }
  }

  //

  @Override
  public void end(boolean interrupted) {
    m_motorIntake.setSpeed(0); m_motorFeeder.setSpeed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
