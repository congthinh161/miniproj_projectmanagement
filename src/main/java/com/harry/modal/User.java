package com.harry.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "account")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullname;
    private String email;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "assignee" , cascade = CascadeType.ALL)
    private List<Issue> assignedIssues = new ArrayList<>();
    private int projectSize;
}
