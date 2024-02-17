package ru.gb.oop.dz_task_5.model;

import java.util.List;

public class StudentsGroup {
    private Integer groupID;
    private Teacher teacher;
    private List<Student> studentList;

    public StudentsGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "\nГруппа студентов: " +
                "ID = " + groupID +
                " " + teacher +
                "\nCписок студентов: " + studentList;
    }
}
