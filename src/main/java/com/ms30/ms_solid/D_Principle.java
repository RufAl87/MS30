package com.ms30.ms_solid;

public class D_Principle {


    class Tea {
        public void makeTea() {
            System.out.println("Приготовлен чай");
        }
    }

    class TeaPot {
        private Tea tea;

        public TeaPot() {
            this.tea = new Tea();
        }

        public void makeTea() {
            tea.makeTea();
        }
    }
    //------------------------------------------------------------------------

    interface TeaMaker {
        void prepareTea();
    }

    static class SimpleTea implements TeaMaker {
        @Override
        public void prepareTea() {
            System.out.println("Приготовлен чай");
        }
    }

     static class GreenTea implements TeaMaker {
        @Override
        public void prepareTea() {
            System.out.println("Приготовлен зеленый чай");
        }
    }

    static class BlackTea implements TeaMaker {
        @Override
        public void prepareTea() {
            System.out.println("Приготовлен черный чай");
        }
    }

    static class SmartTeaPot {
        private TeaMaker teaMaker;

        public SmartTeaPot(TeaMaker teaMaker) {
            this.teaMaker = teaMaker;
        }

        public void makeTea() {
            teaMaker.prepareTea();
        }
    }

    public static void main(String[] args) {
        SmartTeaPot greenPot = new SmartTeaPot(new GreenTea());
        greenPot.makeTea();

        SmartTeaPot blackPot = new SmartTeaPot(new BlackTea());
        blackPot.makeTea();

        SmartTeaPot simplePot = new SmartTeaPot(new SimpleTea());
        simplePot.makeTea();
    }

    }
