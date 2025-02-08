package com.education.students.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherModel {
    private List<Teacher> teachers = new ArrayList<>();

    public TeacherModel() {
        teachers.add(new Teacher("Mbape", 9));
        teachers.add(new Teacher("Cristiano", 40));
        teachers.add(new Teacher("Benzema", 30));
        teachers.add(new Teacher("Maradona", 7));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
