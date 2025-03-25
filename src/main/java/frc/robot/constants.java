package frc.robot;

import frc.robot.generated.TunerConstants;
 
import static edu.wpi.first.units.Units.*;

public class constants {

    public static final class ClimbConstants {
        public static final int LIFT_MAIN = 16;             //PWM
        public static final int LIFT_CUR_LMT = 50;   //const

        public static final double LIFT_MOTOR_VOLTAGE_COMP = 10;
        public static final double LIFT_SPEED_DOWN = 0.5;
        public static final double LIFT_SPEED_UP = -0.5;
        public static final double LIFT_HOLD_DOWN = 0;
        public static final double LIFT_HOLD_UP = 0;
      }
   
      

      public static final class CorAlConstants {
        public static final int CorAl_MAIN = 14;             //PWM
        public static final int CorAl_CUR_LMT = 50;   //const

        public static final double CorAl_MOTOR_VOLTAGE_COMP = 10;
        public static final double CorAl_SPEED_DOWN = 0.5;
        public static final double CorAl_SPEED_UP = -0.5;
        public static final double CorAl_HOLD_DOWN = 0;
        public static final double CorAl_HOLD_UP = 0;
      }


      public static final class PivotConstants {
        public static final int Pivot_MAIN = 15;             //PWM
        public static final int Pivot_CUR_LMT = 50;   //const

        public static final double Pivot_MOTOR_VOLTAGE_COMP = 10;
        public static final double Pivot_SPEED_DOWN = 0.25;
        public static final double Pivot_SPEED_UP = -0.25;
        public static final double Pivot_HOLD_DOWN = 0;
        public static final double Pivot_HOLD_UP = 0.1;
      }

      public final class VisionConstants {
        public static final String CAM_NAME="Replace Me";
    
      }

      public static class SwerveConstants {
        public static final double kMaxSpeed = TunerConstants.kSpeedAt12Volts.in(MetersPerSecond); // kSpeedAt12Volts desired top speed
        public static final double kMaxAngularRate = RotationsPerSecond.of(0.75).in(RadiansPerSecond); // 3/4 of a rotation per second max angular velocity

        public static final double kTranslationalDeadband = kMaxSpeed * 0.1;
        public static final double kRotationalDeadband = kMaxAngularRate * 0.1;
  }
} ;


