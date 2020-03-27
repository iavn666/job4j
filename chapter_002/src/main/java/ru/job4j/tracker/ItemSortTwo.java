package ru.job4j.tracker;

import java.util.Comparator;

public class ItemSortTwo implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return a.getName().compareTo(b.getName());
    }
}
