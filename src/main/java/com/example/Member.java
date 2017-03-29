package com.example;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by seungki on 2017-03-29.
 */
@Entity
@lombok.Getter
@lombok.Setter

@Table(name = "MEMBER")
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    @OneToMany(mappedBy = "member")
    Collection<Order> orders;

}
