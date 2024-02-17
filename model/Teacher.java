package ru.gb.oop.dz_task_5.model;

public class Teacher extends User {
    private Integer teacherId;
    private String subject;

    public Teacher(String name, Integer age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Учитель: " +
                "Id = " + teacherId +
                ", имя = '" + name + '\'' +
                ", возраст = " + age +
                ", предмет = '" + subject + '\'';
    }
}
