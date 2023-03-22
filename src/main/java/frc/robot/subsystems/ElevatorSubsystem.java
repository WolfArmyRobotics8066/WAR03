package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
    public static final VictorSP rightMotor = new VictorSP(7);
    
    public ElevatorSubsystem (){
    }

    public void moveElevator (double speed){
        rightMotor.set(speed);
    }
}
