package ru.gb.oop.dz_task_5.service;

import ru.gb.oop.dz_task_5.model.Student;
import ru.gb.oop.dz_task_5.model.StudentsGroup;
import ru.gb.oop.dz_task_5.model.Teacher;

import java.util.List;

public interface ServiceStudentsGroup {
    StudentsGroup create(Teacher teacher, List<Student> studentList);

    List<StudentsGroup> read();
}
