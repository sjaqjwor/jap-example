package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by seungki on 2017-03-29.
 */
@Entity
@Table(name = "TEAM")
@Getter
@Setter
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @OneToMany(mappedBy = "team")
    private Collection<Member> members;
}
