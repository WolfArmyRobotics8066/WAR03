package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.AutonomousContants;
import frc.robot.commands.AutonomousCommand;
import frc.robot.subsystems.TracaoSubsystem;

public class LowAndLeave extends SequentialCommandGroup{
    TracaoSubsystem tracaoSubsystem;

    public LowAndLeave(TracaoSubsystem tracaoSubsystem){
        this.tracaoSubsystem = tracaoSubsystem;
        addRequirements(tracaoSubsystem);
        addCommands(//
            new ParallelRaceGroup(new WaitCommand(1), new AutonomousCommand(tracaoSubsystem, AutonomousContants.autonomousSpeed)) //
            , new ParallelRaceGroup(new WaitCommand(3), new AutonomousCommand(tracaoSubsystem, -AutonomousContants.autonomousSpeed)));

    }
}
