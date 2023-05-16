package com.brownee.grabb.domain.cards.model;

import com.brownee.grabb.domain.members.model.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {

    BigInteger id;
    String title;
    String description;
    List<Activity> activities;
    List<Label> labels;
    List<Member> members;
    LocalDateTime dueDate;


}
