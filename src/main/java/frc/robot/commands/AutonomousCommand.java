package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TracaoSubsystem;

public class AutonomousCommand extends CommandBase {
    TracaoSubsystem tracaoSubsystem;
    double speed;
    
    public AutonomousCommand(TracaoSubsystem tracaoSubsystem, double speed){
        this.speed = speed;
        this.tracaoSubsystem = tracaoSubsystem;
        addRequirements(tracaoSubsystem);
    }   
    @Override
    public void initialize() {
    }

    @Override
    public void execute() {

        tracaoSubsystem.controllerGroup.arcadeDrive(0.0, speed);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
