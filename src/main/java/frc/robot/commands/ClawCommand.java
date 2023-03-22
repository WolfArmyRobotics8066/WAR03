package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ClawSubsystem;

public class ClawCommand extends CommandBase {
    
    ClawSubsystem clawSubsystem;
    Supplier<Double> getTrigger;

    public ClawCommand(ClawSubsystem clawSubsystem, Supplier<Double> getTrigger){
        this.clawSubsystem = clawSubsystem;
        this.getTrigger = getTrigger;
        addRequirements(clawSubsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        double value = getTrigger.get();
        if (value >= 0.5)
            clawSubsystem.claw.set(Value.kForward);
        else
            clawSubsystem.claw.set(Value.kReverse);
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
