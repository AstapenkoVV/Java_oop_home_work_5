package ru.gb.oop.dz_task_5.service;

import ru.gb.oop.dz_task_5.model.Teacher;
import ru.gb.oop.dz_task_5.model.User;

import java.util.List;

public interface ServiceTeacher {
    ru.gb.oop.dz_task_5.model.Teacher create(User user);

    List<Teacher> read();
}
