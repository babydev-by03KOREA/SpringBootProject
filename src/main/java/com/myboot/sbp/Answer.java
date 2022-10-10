package com.myboot.sbp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @CreatedDate
    private LocalDateTime createDate;

    @ManyToOne
    /* 1:N : 하나에 질문에 답변은 여러개가 달릴 수 있다. > ManyToOne
    *  N:1 : 답변은 여러개이지만 질문은 하나이다. ? OneToMany */
    private Question question;
}