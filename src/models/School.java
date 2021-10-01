package models;

import java.util.ArrayList;

public class School {
    private long id;
    private String name;
    private String description;
    private ArrayList<Class> classes = new ArrayList<>();
    private SchoolType type;
    private ArrayList<Staff> staffs = new ArrayList<>();
    private Address address;
    private ArrayList<Student> students = new ArrayList<>();


}
