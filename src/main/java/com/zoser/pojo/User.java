package com.zoser.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    @Id
    private int userId;
    private String nick;
    private String mobile;
    private String password;
    private Date updateTime;
    private Date createTime;
}
