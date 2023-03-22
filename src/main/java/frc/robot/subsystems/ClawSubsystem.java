package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClawSubsystem extends SubsystemBase {
    public DoubleSolenoid claw = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
    
    public ClawSubsystem (){
    }
}