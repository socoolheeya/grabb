package com.brownee.grabb.domain.boards.model;

import com.brownee.grabb.common.enums.CommonEnum;
import com.brownee.grabb.domain.cards.model.Card;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Board {
    BigInteger id;
    String title;
    CommonEnum.BoardVisibility visibility;
    CommonEnum.BoardStatus status;
    List<Card> cards;


}
