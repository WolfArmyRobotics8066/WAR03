package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    VictorSP motor = new VictorSP(6);
    
    public ArmSubsystem (){
    }

    public void moveArm (double speed){
        motor.set(speed);
    }
}
