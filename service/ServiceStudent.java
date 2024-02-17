package ru.gb.oop.dz_task_5.service;

import ru.gb.oop.dz_task_5.model.Student;
import ru.gb.oop.dz_task_5.model.User;

import java.util.List;

public interface ServiceStudent {
    Student create(User user);

    List<Student> read();
}
