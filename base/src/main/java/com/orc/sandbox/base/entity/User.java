package com.orc.sandbox.base.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String pwd;

}
