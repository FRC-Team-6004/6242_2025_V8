package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.PivotConstants;;

public class PivotSub extends SubsystemBase {

    private final SparkMax pivotMotor;
    
    /**
     * This subsytem that controls the arm.
     */
    public PivotSub() {

    // Set up the arm motor as a brushed motor
    pivotMotor = new SparkMax(PivotConstants.Pivot_MAIN, MotorType.kBrushless);


    // Set can timeout. Because this project only sets parameters once on
    // construction, the timeout can be long without blocking robot operation. Code
    // which sets or gets parameters during operation may need a shorter timeout.
    pivotMotor.setCANTimeout(250);


    // Create and apply configuration for arm motor. Voltage compensation helps
    // the arm behave the same as the battery
    // voltage dips. The current limit helps prevent breaker trips or burning out
    // the motor in the event the arm stalls.
    SparkMaxConfig pivotConfig = new SparkMaxConfig();
    pivotConfig.voltageCompensation(10);
    pivotConfig.smartCurrentLimit(PivotConstants.Pivot_CUR_LMT);
    pivotConfig.idleMode(IdleMode.kBrake);
    pivotMotor.configure(pivotConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    @Override
    public void periodic() {
    }
    /** 
     * This is a method that makes the arm move at your desired speed
     *  Positive values make it spin forward and negative values spin it in reverse
     * 
     * @param speed motor speed from -1.0 to 1, with 0 stopping it
     */
    public void movePivot(double speed){
        pivotMotor.set(speed * 0.5);
    }

}