package com.glqdlt.ex.zuuledge;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String userId;
    private String userPw;
    private String userName;
    private Date regDate;

}
