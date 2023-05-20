package com.brownee.grabb.domain.boards.model;

import com.brownee.grabb.common.enums.CommonEnum;
import com.brownee.grabb.domain.cards.model.Card;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Board {
    BigInteger id;
    String title;
    CommonEnum.BoardVisibility visibility;
    CommonEnum.BoardStatus status;
    String createdBy;
    LocalDateTime createdAt;
    String updatedBy;
    LocalDateTime updatedAt;
    List<Card> cards;

    @Builder
    public Board(BigInteger id, String title, CommonEnum.BoardVisibility visibility, CommonEnum.BoardStatus status, String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt, List<Card> cards) {
        this.id = id;
        this.title = title;
        this.visibility = visibility;
        this.status = status;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
        this.cards = cards;
    }
}
