package com.education.students.controller;

import com.education.students.model.Insurance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    @GetMapping("/getTeacherInsurance")
    public Insurance getTeacherInsurance() {
        return Insurance.builder()
                // insNo, teacherName, id(UUID.randomUUID()) => lezimhom dima ykounou maktoubin
                // kima fil Insurance.java bidhabt et en minuscule zeda
                .insNo(33000)
                .teacherName("don")
                .id(UUID.randomUUID())
                .build();
    }
}
