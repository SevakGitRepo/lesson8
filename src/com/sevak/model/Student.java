package com.sevak.model;

public class Student {
    private String name;
    private String surname;
    private int year;
    private String maleFemale;
    private double mark;

    public Student(String name, String surname, int year, String maleFemale, double mark) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.maleFemale = maleFemale;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public String getMaleFemale() {
        return maleFemale;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", maleFemale='" + maleFemale + '\'' +
                ", mark=" + mark +
                '}';
    }
}
