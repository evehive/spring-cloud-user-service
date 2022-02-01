package com.example.userservice.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // Entity 로 활용됨을 선언
@Table(name = "users") // 테이블명 지정
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false, unique = true)
    private String encryptedPwd;

}
