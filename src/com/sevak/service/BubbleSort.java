package com.sevak.service;

import com.sevak.model.Student;

public class BubbleSort {
    static Student[] sort(Student[] array) {
        boolean cycle = false;
        Student current;
        while (!cycle) {

            cycle = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getMark() > array[i + 1].getMark()) {
                    current = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = current;
                    cycle = false;
                }
            }
        }
        return array;
    }
}
