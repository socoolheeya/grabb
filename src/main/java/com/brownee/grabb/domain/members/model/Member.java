package com.brownee.grabb.domain.members.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    BigInteger id;
    String name;
    String email;
    @Builder

    public Member(BigInteger id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
