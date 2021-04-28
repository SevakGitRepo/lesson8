package com.sevak.service;

import com.sevak.model.Student;
import com.sevak.convert.StudentConvert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileService {
    public static boolean createDirectory(String name){
        File file = new File(name);
        return file.mkdir();
    }

    public static boolean createFile(String directoryName, String fileName){
        File file = new File(directoryName+File.separator+fileName+".txt");
        boolean newFile=false;
        try {
            newFile= file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        return newFile;
    }
    public static List<Student> read(String pathName){
        List<Student> list = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(new File(pathName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            list.add(StudentConvert.createStudent(line));
        }
        sc.close();
        return list;

    }
    public static void write(String pathName, String text){
        try {
            Files.write(Paths.get(pathName), (text+"\n").getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
