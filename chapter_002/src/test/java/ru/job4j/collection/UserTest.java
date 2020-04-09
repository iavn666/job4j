package ru.job4j.collection;

import org.junit.Test;

import javax.swing.*;
import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void UserByName() {
        Comparator<User> cmpName = new UserDescByName();
        List<User> result = Arrays.asList(
                new User("ivan",1),
                new User("Petya",3)
        );
        Collections.sort(result,cmpName);
        List<User> excepted = Arrays.asList(
                new User("Petya",3),
                new User("ivan",1)
        );
        assertThat(result, is (excepted));
    }

    @Test
    public void UserByNameDown() {
        Comparator<User> cmpNameDown = new UserDescByNameDown();
        List<User> result = Arrays.asList(
                new User("ivan",1),
                new User("Petya",3)
        );
        Collections.sort(result,cmpNameDown);
        List<User> excepted = Arrays.asList(
                new User("ivan",1),
                new User("Petya",3)

        );
        assertThat(result, is (excepted));
    }

    @Test
    public void UserByPrioriti() {
        Comparator<User> cmpPrioriti = new UserDescByPriority();
        List<User> result = Arrays.asList(
                new User("ivan",1),
                new User("Petya",3)
        );
        Collections.sort(result,cmpPrioriti);
        List<User> excepted = Arrays.asList(
                new User("ivan",1),
                new User("Petya",3)

        );
        assertThat(result, is (excepted));
    }



    @Test
    public void UserByPrioritiDown() {
        Comparator<User> cmpPrioritiDown = new UserDescByPriorityDown();
        List<User> result = Arrays.asList(
                new User("ivan",1),
                new User("Petya",3)
        );
        Collections.sort(result,cmpPrioritiDown);
        List<User> excepted = Arrays.asList(
                new User("Petya",3),
                new User("ivan",1)

        );
        assertThat(result, is (excepted));
    }


    }
