package com.education.students.controller;

import com.education.students.model.Teacher;
import com.education.students.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")


public class TeacherController {

    @Autowired// Injecting the service
    private TeacherService teacherService; // bean

    // afficher un seul enseignant:
    @GetMapping("/print-name")
    public ResponseEntity <Teacher> printTeacherName(@RequestParam String name) {
        return ResponseEntity.ok(teacherService.printName(name));
    }

    // chercher un enseignant par nom ou par age:
    @GetMapping("/chercher-name")
    public ResponseEntity <Teacher> searchTeacherByNameAndAge(
            @RequestParam String name,
            @RequestParam("a") Integer age) {
        return ResponseEntity.ok(teacherService.searchName(name,age));
    }

    // afficher un tous les enseignants:
    @GetMapping("/get-teachers")
    public ResponseEntity<List<Teacher>> getTeachers() {
        return ResponseEntity.ok(teacherService.getTeachers());

    }

    //Post:ajouter (sauvegarder) un nouveau enseignant:
    @PostMapping ("/save")
    public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {
        return ResponseEntity.ok(teacher);

    }

}
