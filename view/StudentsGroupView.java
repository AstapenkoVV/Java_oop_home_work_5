package ru.gb.oop.dz_task_5.view;

import ru.gb.oop.dz_task_5.model.StudentsGroup;

import java.util.List;

public class StudentsGroupView {
    public void printStudentsGroup(List<StudentsGroup> studentsGroupList){
        System.out.println("Список всех групп учащихся: \n" + studentsGroupList);
    }
}
