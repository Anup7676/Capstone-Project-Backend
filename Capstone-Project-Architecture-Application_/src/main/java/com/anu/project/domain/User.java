package com.anu.project.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name="user", uniqueConstraints = @UniqueConstraint(columnNames = { "email" }))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    //created 3rd table user+role
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL) //when ever the parent entity will perform operations that will affect to child
    @JoinTable(
        name="Users_roles",
        joinColumns = @JoinColumn(
            name="user_id", referencedColumnName = "id"
        ),
        inverseJoinColumns = @JoinColumn(
            name="role_id", referencedColumnName = "id"
        )
    )
    private Collection<Role> roles;

    public User(String name,String email, String password, Collection<Role> roles){
        super();
        this.name=name;
        this.email=email;
        this.password=password;
        this.roles=roles;
    }
}