package ru.gb.oop.dz_task_5.service;

import ru.gb.oop.dz_task_5.model.Student;
import ru.gb.oop.dz_task_5.model.StudentsGroup;
import ru.gb.oop.dz_task_5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataStudentsGroup implements ServiceStudentsGroup{
    List<StudentsGroup> studentsGroupList = new ArrayList<>();

    @Override
    public StudentsGroup create(Teacher teacher, List<Student> studentList) {
        StudentsGroup studentsGroup = new StudentsGroup(teacher, studentList);
        studentsGroup.setGroupID(studentsGroupList.size() + 1);
        studentsGroupList.add(studentsGroup);
        return studentsGroup;
    }

    @Override
    public List<StudentsGroup> read() {
        return studentsGroupList;
    }
}
