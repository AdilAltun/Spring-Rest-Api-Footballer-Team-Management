package com.works.entities;

import com.works.util.TEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class FootTeam {

    @Id
    private Integer tid;

    private TEnum teamName;
    private Integer fid;
    private String name;
    private String surname;
    private String email;
    private Integer age;



}
