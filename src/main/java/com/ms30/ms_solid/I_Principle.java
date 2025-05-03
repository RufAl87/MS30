package com.ms30.ms_solid;

public class I_Principle {

    public interface Lawyer {
        void prosecute();
        void defend();
    }

    public class Prosecutor implements Lawyer {
        public void prosecute() {
            System.out.println("Выдвигает обвинение");
        }

        public void defend() {
            throw new UnsupportedOperationException("Прокурор не защищает в суде");
        }
    }
//-------------------------------------------------------------

    public interface Prosecutable {
        void prosecute();
    }

    public interface Defendable {
        void defend();
    }

    public class Advocate implements Prosecutable, Defendable {
        public void prosecute() { System.out.println("Выдвигает обвинение"); }
        public void defend() { System.out.println("Защищает в суде"); }
    }

    public class Prosecutor2 implements Prosecutable {
        public void prosecute() { System.out.println("Выдвигает обвинение"); }
    }

}
