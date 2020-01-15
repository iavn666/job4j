package ru.job4j.collection;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;
    private int priority;


    public User(String name, int age, int priority) {
        this.name = name;
        this.age = age;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(@NotNull User o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


  }
