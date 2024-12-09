// Feeder Main

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {

  // Variables //

  public TalonFX motorFeeder1;
  public static DigitalInput sensorFeeder1 = new DigitalInput(2);

  // Functions //

  public Feeder() {
    motorFeeder1 = new TalonFX(2);
  }

  //

  public void setSpeed(double speed) {
    motorFeeder1.set(speed);
  }

  public boolean getSensor() {
    return sensorFeeder1.get();
  }

  //

  @Override
  public void periodic() {}
}
