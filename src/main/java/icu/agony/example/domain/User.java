package icu.agony.example.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;

    private String username;

    private String sex;

    private String hometown;

    private Date birthday;

}
