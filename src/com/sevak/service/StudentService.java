package com.sevak.service;

import com.sevak.model.Student;

import java.util.Comparator;
import java.util.List;

public class StudentService {




//    Task 5: Print biggest male student information
//    Task 6: Print students sorted by mark
//    Task 7: Print female students sorted by year

    public static void sortedByMark(Student[]students){
        Student[] stud = BubbleSort.sort(students);
        for (Student student : stud) {
            System.out.println(student);
        }
    }


    public static void sortedByYear(List<Student> list){
        list.stream().sorted(Comparator.comparing(Student::getYear) ).forEach(System.out::println);
    }
    public static void namesOfStudents(Student[]students){
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public static void allMaleStudents(Student[]students){
        for (Student student : students) {
            if(student.getMaleFemale().equals("male"))
                System.out.println(student);
        }
    }

    public static void allFemaleStudentsGreater50and4(Student[]students){
        for (Student student : students) {
            if(student.getMaleFemale().equals("female")&&student.getMark()>50.4)
                System.out.println(student);
        }
    }

    public static void minimalMark(Student[]students){

        Student mark = students[0];
        for (int i = 1; i < students.length; i++) {
            if(mark.getMark()>students[i].getMark())
            mark=students[i];
        }

        System.out.println(mark);
    }

    public static void biggestMaleStudent(Student[] students){
        Student student = null;
        int i = 0;
        for (; i < students.length; i++) {
            if(students[i].getMaleFemale().equals("male"));
            student=students[i];
            break;
        }
        if(student!=null) {
            for (int j = i; j < students.length; j++) {
                if(students[j].getMaleFemale().equals("male")&&student.getYear()>students[j].getYear()){
                    student = students[j];
                }
            }
        }

        System.out.println(student);
    }
}
