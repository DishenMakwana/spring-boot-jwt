package com.jwt.dishen.JwtSetup.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String userId;

    private String name;

    private  String email;
}
