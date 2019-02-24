package com.zoser.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "t_user")
public class Test implements Serializable {

    @Id
    private int userId;
    private String mobile;
    private String password;
    private String aaa;
}
