package ru.gb.oop.dz_task_5.model;

public abstract class User {
    protected String name;
    protected Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
