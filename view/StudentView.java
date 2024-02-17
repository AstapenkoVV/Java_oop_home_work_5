package ru.gb.oop.dz_task_5.view;

import ru.gb.oop.dz_task_5.model.Student;

import java.util.List;

public class StudentView {
    public void printStudents(List<Student> studentList){
        System.out.println("Список всех студентов: \n" + studentList);
    }
}
