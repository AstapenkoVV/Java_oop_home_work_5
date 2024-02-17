package ru.gb.oop.dz_task_5.service;


import ru.gb.oop.dz_task_5.model.Teacher;
import ru.gb.oop.dz_task_5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataTeacher implements ServiceTeacher{
    List<Teacher> teacherList = new ArrayList<>();

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherId(teacherList.size() + 1);
        teacherList.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return teacherList;
    }
}
