package ru.gb.oop.dz_task_5.service;

import ru.gb.oop.dz_task_5.model.Student;
import ru.gb.oop.dz_task_5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudent implements ServiceStudent{
    List<Student> studentList = new ArrayList<>();
    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(studentList.size() + 1);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
