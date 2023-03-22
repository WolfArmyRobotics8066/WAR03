package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TracaoSubsystem;

public class AutonomousCommand extends CommandBase {
    TracaoSubsystem tracaoSubsystem;
   
    
    public AutonomousCommand(TracaoSubsystem tracaoSubsystem){
       
        this.tracaoSubsystem = tracaoSubsystem;
        addRequirements(tracaoSubsystem);
    }   
    @Override
    public void initialize() {
    }

    @Override
    public void execute() {

        tracaoSubsystem.controllerGroup.arcadeDrive(0.0, 0.6);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
