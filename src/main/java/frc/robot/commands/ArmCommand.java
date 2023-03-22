package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class ArmCommand extends CommandBase {
    ArmSubsystem armSubsystem;
    double speed;

    public ArmCommand(ArmSubsystem armSubsystem, double speed){
        this.armSubsystem = armSubsystem;
        this.speed = speed;
        addRequirements(armSubsystem);
    }
    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        armSubsystem.moveArm(speed);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
