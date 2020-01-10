package ru.job4j.tracker;

import com.sun.istack.internal.NotNull;
import java.util.Comparator;

import java.util.Objects;

public class Item implements Comparable<Item> {
    
    private String id;
    private String name;
    private String decs;
    private long time;

    public Item(String name, String decs, long time) {
        this.name = name;
        this.decs = decs;
        this.time = time;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time && name.equals(item.name) && decs.equals(item.decs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, decs, time);
    }

    @Override
    public int compareTo(@NotNull Item b) {
        return getName().compareTo(b.getName());
    }
}