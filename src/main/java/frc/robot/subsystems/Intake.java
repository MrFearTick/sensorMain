// Intake Main

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

  // Variables //

  public TalonFX motorIntake1;
  public DigitalInput sensorIntake1 = new DigitalInput(1);

  // Functions //

  public Intake() {
    motorIntake1 = new TalonFX(1);
  }

  //

  public void setSpeed(double speed) {
    motorIntake1.set(speed);
  }

  public boolean getSensor() {
    return sensorIntake1.get();
  }

  //

  @Override
  public void periodic() {}
}
