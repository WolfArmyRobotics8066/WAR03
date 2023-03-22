package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class JoystickSubsystem extends SubsystemBase {
    public XboxController controller = new XboxController(0);

    public JoystickSubsystem (){
    }
    
}

