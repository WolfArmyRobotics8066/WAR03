package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TracaoSubsystem extends SubsystemBase{
    VictorSP leftController = new VictorSP(8);
    VictorSP rightController = new VictorSP(9);
    public DifferentialDrive controllerGroup = new DifferentialDrive(leftController, rightController);
    
    public TracaoSubsystem (){
        leftController.getInverted();
    }

}
