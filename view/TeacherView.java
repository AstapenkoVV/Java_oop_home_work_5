package ru.gb.oop.dz_task_5.view;

import ru.gb.oop.z5.model.Teacher;

import java.util.List;

public class TeacherView {
    public void printTeacher(List<Teacher> teacherList){
        System.out.println("Список всех учителей: \n" + teacherList);
    }
}
