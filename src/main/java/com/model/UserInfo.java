package com.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mid")
    private long id;

    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Age")
    private int age;
    @Column(name = "Sex")
    private char sex;
    @Column(name = "Year Of Birth")
    private int yearOfBirth;
    @Column(name = "Address")
    private String address;

}

