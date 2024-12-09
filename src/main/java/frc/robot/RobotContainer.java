// Main
// Version 1.1

package frc.robot;

import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Feeder;

import frc.robot.commands.runSensor;

public class RobotContainer {

  // Variables //

  PS5Controller ps5 = new PS5Controller(0);

  Feeder motorFeeder = new Feeder();
  Intake motorIntake = new Intake();

  // Functions // 

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(ps5, 1).whileTrue(new runSensor(motorFeeder, 0.7, motorIntake, 1));
    new JoystickButton(ps5, 2).whileTrue(new runSensor(motorFeeder, -0.7, motorIntake, -1));
  }
}
