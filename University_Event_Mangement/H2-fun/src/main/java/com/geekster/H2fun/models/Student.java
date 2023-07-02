package com.geekster.H2fun.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Student_Id")
    private Integer studentId;

    @NotBlank(message = "firstName cannot be blank")
//    @Column(name = "First_Name")
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String firstName;

    @NotBlank(message = "lastName cannot be blank")
//    @Column(name = "Last_Name")
    private String lastName;

    @Max(value = 25)
    @Min(value = 18)
//    @Column(name = "Age")
    private String age;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DepartmentName department;
}
