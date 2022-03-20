package com.summer.weibo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author Summer
 * @Since 2022/3/20 9:25 PM
 * @Version 1.0
 */
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "email_verified_at", nullable = true)
    private Date emailVerifiedAt;
    @Column(name = "password")
    private String password;
    @Column(name = "remember_token", nullable = true)
    private String rememberToken;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
}
