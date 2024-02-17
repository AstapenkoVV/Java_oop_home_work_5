package ru.gb.oop.dz_task_5.controller;

import ru.gb.oop.dz_task_5.model.Student;
import ru.gb.oop.dz_task_5.model.StudentsGroup;
import ru.gb.oop.dz_task_5.model.Teacher;
import ru.gb.oop.dz_task_5.model.User;
import ru.gb.oop.dz_task_5.service.DataStudent;
import ru.gb.oop.dz_task_5.service.DataStudentsGroup;
import ru.gb.oop.dz_task_5.service.DataTeacher;
import ru.gb.oop.dz_task_5.view.StudentView;
import ru.gb.oop.dz_task_5.view.StudentsGroupView;
import ru.gb.oop.dz_task_5.view.TeacherView;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private DataStudent dataStudent;
    private StudentView studentView;
    private DataTeacher dataTeacher;
    private TeacherView teacherView;
    private DataStudentsGroup dataStudentsGroup;
    private StudentsGroupView studentsGroupView;


    public Controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        dataStudentsGroup = new DataStudentsGroup();
        studentsGroupView = new StudentsGroupView();
    }

    public void start() {
        User user1 = new Student("Иван", 14, 4.3);
        User user2 = new Student("Антон", 13, 4.6);
        User user3 = new Student("Тимур", 17, 4.5);
        User user4 = new Student("Андрей", 15, 4.2);
        User user5 = new Teacher("Евгений", 45, "Литература");
        User user6 = new Teacher("Артур", 43, "Математика");

        List<Student> studentsList1 = new ArrayList<>();
        List<Student> studentsList2 = new ArrayList<>();

        studentsList1.add(createStudent(user1));
        studentsList1.add(createStudent(user2));
        studentsList2.add(createStudent(user3));
        studentsList2.add(createStudent(user4));

        createStudentsGroup(createTeacher(user5), studentsList1);
        createStudentsGroup(createTeacher(user6), studentsList2);

        List<StudentsGroup> studentsGroupList = dataStudentsGroup.read();
        studentsGroupView.printStudentsGroup(studentsGroupList);
    }

    private Student createStudent(User user) {
        return dataStudent.create(user);
    }
    private Teacher createTeacher(User user) {
        return dataTeacher.create(user);
    }
    private StudentsGroup createStudentsGroup(Teacher teacher, List<Student> studentList) {
        return dataStudentsGroup.create(teacher, studentList);
    }
}