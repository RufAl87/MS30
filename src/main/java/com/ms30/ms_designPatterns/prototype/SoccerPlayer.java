package com.ms30.ms_designPatterns.prototype;

public class SoccerPlayer implements Copyable{
    private String name;
    private String surname;
    private int age;
    private String position;

    public SoccerPlayer(String name, int age, String surname, String position) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        SoccerPlayer copy = new SoccerPlayer(name, age, surname, position);
        return copy;
    }
}
