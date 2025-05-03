package com.ms30.ms_solid;

public class L_Principle {
    public class Phone {
        public void loginToInet() {
            System.out.println("Подключаемся к интернету");
        }
    }

    public class Nokia extends Phone {
        @Override
        public void loginToInet() {
            throw new UnsupportedOperationException("Нокиа не поддерживает эту функцию");
        }
    }
//--------------------------------------------------------------


    public interface Phone2 {}

    public interface InetConnectable {
        void loginToInet();
    }

    public class Samsung implements Phone2, InetConnectable {
        public void loginToInet() {
            System.out.println("Подключаемся к интернету");
        }
    }

    public class Nokia2 implements Phone2 {

    }

}
