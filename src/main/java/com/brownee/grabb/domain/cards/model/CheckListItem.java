package com.brownee.grabb.domain.cards.model;

import com.brownee.grabb.common.enums.CommonEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckListItem {
    BigInteger id;
    String name;
    LocalDateTime dueDate;
    CommonEnum.CheckListItemStatus status;

}
