package com.example.khoaservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Khoa {
    @Id
    @GeneratedValue
    private Long id;
    private String khoaName;
    private String khoaCode;

}
