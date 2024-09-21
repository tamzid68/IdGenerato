package com.model;

import jakarta.persistence.*;
import lombok.*;

import javax.naming.Name;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserInfo")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Id")
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
    @Column(name = "Department")
    private String department;
    @Column(name = "Session")
    private String session;

}
