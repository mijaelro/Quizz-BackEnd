package com.mijael.Quizz.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Builder
@Data
@Scope("prototype")
@Table(name = "questions")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private Category category;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    @ElementCollection(targetClass = String.class)
    private List<String> options = new ArrayList<>();

    @Column(nullable = false)
    private String answer;
}
