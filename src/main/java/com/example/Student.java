package com.example;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
/*@Table(name = "Student",uniqueConstraints = {@UniqueConstraint(
        name="Name_AGE_UNIQUE",
        columnNames = {"NAME","AGE"}
)})*///유니크 제약 조건을 만들어 줄 수 있다.

/*@SequenceGenerator(name = "Student_seq",sequenceName = "Student",
initialValue = 1,allocationSize = 1)//squence 사용법
*/

@TableGenerator(name="Student_generator",
table = "kp",
pkColumnName = "kp_id",allocationSize = 1)

@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "Student_seq")*/
    //@GeneratedValue(strategy = GenerationType.TABLE,generator ="Student_generator")
    @Column(name = "id")
    private int id;

    @Column(name="age")
    private int age;

    @Column(name="name")
    private String name;

    @Column(name="department",nullable = false,length = 100)//제약조건
    private String department;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    private  Date lastTime;

    @Lob
    private String description;


    public enum RoleType{
        Admin,User
    }

}