package com.ms30.ms_solid;

public class S_Principle {

    class Student {
        private String name;
        private String surname;
        private int age;


        public void takeAssessment() {
            System.out.println("Получил оценку: ");
        }

        public void tested() {
            System.out.println("Протестирован");
        }
    }
//--------------------------------------------------------------------------------------------
    class Student2 {

        private String name;
        private String surname;
        private int age;
    }

    class Assessment {
        public void takeAssessment(Student2 student) {
            System.out.println("Получил оценку: ");
        }
    }

    class Test {
        public void tested(Student2 student) {
            System.out.println("Протестирован");
        }
    }
}
