package com.brownee.grabb.domain.cards.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Label {
    BigInteger id;
    String title;
    String color;

}
