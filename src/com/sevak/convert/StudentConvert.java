package com.sevak.convert;

import com.sevak.model.Student;

public class StudentConvert {
    public static Student createStudent(String studentParameters){
        String[] split = studentParameters.split(", ");
Student student = new Student(split[0], split[1], Integer.parseInt(split[2]), split[3], Double.parseDouble(split[4]));
        return new Student(split[0], split[1], Integer.parseInt(split[2]), split[3], Double.parseDouble(split[4]));
    }
}
