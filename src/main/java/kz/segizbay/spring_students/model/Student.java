package kz.segizbay.spring_students.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;


@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBitrh;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge(){
        return Period.between(dateOfBitrh, LocalDate.now()).getYears();
    }
}
