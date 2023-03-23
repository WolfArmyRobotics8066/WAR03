package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.AutonomousContants;
import frc.robot.commands.AutonomousCommand;
import frc.robot.subsystems.TracaoSubsystem;

public class LeaveCommunity extends ParallelRaceGroup {
    TracaoSubsystem tracaoSubsystem;

    public LeaveCommunity(TracaoSubsystem tracao){
        this.tracaoSubsystem = tracao;
        addRequirements(tracao);
        addCommands(new WaitCommand(2), new AutonomousCommand(tracaoSubsystem, -AutonomousContants.autonomousSpeed));
    }
}
