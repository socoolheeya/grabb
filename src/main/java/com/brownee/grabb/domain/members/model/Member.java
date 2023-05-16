package com.brownee.grabb.domain.members.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    BigInteger id;
    String name;
}
