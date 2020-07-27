package com.rk.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter@Getter
@NoArgsConstructor
@Entity
public class User {

    User(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
}
