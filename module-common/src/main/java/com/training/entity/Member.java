package com.training.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NonNull
    private String name;
}
