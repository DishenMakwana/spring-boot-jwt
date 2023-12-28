package com.jwt.dishen.JwtSetup.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {

    private String email;
    private String password;
}
