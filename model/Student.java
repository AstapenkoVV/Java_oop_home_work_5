package ru.gb.oop.dz_task_5.model;

public class Student extends User{
    private Integer studentId;
    private Double average;

    public Student(String name, Integer age, Double average) {
        super(name, age);
        this.average = average;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "Id = " + studentId +
                ", имя = '" + name + '\'' +
                ", возраст = " + age +
                ", средний бал = " + average;
    }
}
