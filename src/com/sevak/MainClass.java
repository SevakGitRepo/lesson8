package com.sevak;


import com.sevak.model.Student;
import com.sevak.service.FileService;
import com.sevak.service.StudentService;

import java.io.File;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {
        FileService.createDirectory("Sevak");
        FileService.createFile("Sevak", "Sevak");
        FileService.write("Sevak"+ File.separator+"Sevak.txt", "Name1, Surname1, 2000, male, 78.5");
        FileService.write("Sevak"+ File.separator+"Sevak.txt", "Name2, Surname2, 2001, female, 52.5");
        FileService.write("Sevak"+ File.separator+"Sevak.txt", "Name3, Surname3, 2002, male, 72.8");
        FileService.write("Sevak"+ File.separator+"Sevak.txt", "Name4, Surname4, 2003, female, 81.9");
        FileService.write("Sevak"+ File.separator+"Sevak.txt", "Name5, Surname5, 2004, male, 100.0");
        FileService.write("Sevak"+ File.separator+"Sevak.txt", "Name6, Surname6, 2005, female, 40.8");

        List<Student> studentList =null;
        studentList = FileService.read("Sevak"+ File.separator+"Sevak.txt");

        Student []students = new Student[studentList.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = studentList.get(i);
        }


        System.out.println("Print full names of students");
        StudentService.namesOfStudents(students);
        System.out.println("*****************************");
        System.out.println("Print all male students");
        StudentService.allMaleStudents(students);
        System.out.println("*****************************");
        System.out.println("Print all female students who has mark greater then 50.4");
        StudentService.allFemaleStudentsGreater50and4(students);
        System.out.println("*****************************");
        System.out.println("Print student information having the minimal mark");
        StudentService.minimalMark(students);
        System.out.println("*****************************");
        System.out.println("Print biggest male student information");
        StudentService.biggestMaleStudent(students);
        System.out.println("*****************************");
        System.out.println("Print students sorted by mark");
        StudentService.sortedByMark(students);
        System.out.println("*****************************");
        System.out.println("Print female students sorted by year");
        StudentService.sortedByYear(studentList);
        System.err.println("Print biggest male student information HASKACEL EM TARIQOV AMENAMETS TXAMARD@");

    }

}