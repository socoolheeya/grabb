package com.brownee.grabb.domain.cards.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckList {
    BigInteger id;
    List<CheckListItem> checkListItems;
}
