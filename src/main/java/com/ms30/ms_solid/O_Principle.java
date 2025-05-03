package com.ms30.ms_solid;

public class O_Principle {

    public class TakeDiscount {
        public double takeDiscount(String userType) {
            if (userType.equals("Student")) return 0.5;
            if (userType.equals("Teacher")) return 0.3;
            return 0.0;
        }
    }
//--------------------------------------------------------------------

    public interface TakeDiscount2 {
        double getDiscount();
    }

    public class StudentDiscount implements TakeDiscount2 {
        public double getDiscount() { return 0.5; }
    }

    public class TeacherDiscount implements TakeDiscount2 {
        public double getDiscount() { return 0.3; }
    }

    public class DirectorDiscount implements TakeDiscount2 {
        public double getDiscount() { return 0.15; }
    }

    public class WithoutDiscount implements TakeDiscount2 {
        public double getDiscount() { return 0.0; }
    }

    public class Discount {
        public double takeDiscount(TakeDiscount2 strategy) {
            return strategy.getDiscount();
        }
    }

}
