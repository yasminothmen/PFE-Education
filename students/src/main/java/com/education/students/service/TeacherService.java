package com.education.students.service;

import com.education.students.model.Teacher;
import com.education.students.model.TeacherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeacherService {

    @Autowired
    private TeacherModel teacherModel;

    // Method to get a teacher by name
    public Teacher printName(String name) {
        Optional<Teacher> teacher = teacherModel.getTeachers()
                .stream()
                .filter(i -> i.getName().equals(name)) // Case insensitive comparison
                .findFirst();

        return teacher.orElse(new Teacher("Not Found", 0));
    }

    // Method to search by name OR age
    public Teacher searchName(String name, Integer age) {
        return teacherModel.getTeachers()
                .stream()
                .filter(i -> i.getName().equals(name) || i.getAge().equals(age))
                .findFirst()
                .orElse(new Teacher("Not Found", 0));
    }

    // Method to get all teachers
    public List<Teacher> getTeachers() {
        return teacherModel.getTeachers()
                .stream()
                .map(i -> new Teacher(i.getName(), i.getAge())) // Make a copy
                .collect(Collectors.toList());
    }

    // ajouter (sauvegarder) un nouveau enseignant:
    public Teacher addTeacher(Teacher teacher) {
        teacherModel.getTeachers().add(teacher);
        return teacher;
    }
}
