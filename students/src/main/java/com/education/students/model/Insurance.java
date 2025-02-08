package com.education.students.model;

import lombok.*;

import java.util.UUID;
// lombok tsehil 3lia l5idma ta3melli hia automatiquement :
// - getter
// - setter
// - getter + setter => Data
// - constructeur vide
// - constructeur rempli
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // ✅ This enables the Builder pattern
public class Insurance {
    private UUID id;
    private String teacherName;
    private Integer insNo;
}
