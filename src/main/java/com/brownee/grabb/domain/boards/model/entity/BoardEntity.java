package com.brownee.grabb.domain.boards.model.entity;

import com.brownee.grabb.common.enums.CommonEnum;
import com.brownee.grabb.domain.cards.model.Card;
import com.brownee.grabb.domain.cards.model.CardList;
import com.brownee.grabb.domain.cards.model.entity.CardEntity;
import com.brownee.grabb.domain.cards.model.entity.CardListEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BoardEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    BigInteger id;

    @Column(name = "title")
    String title;

    @Column(name = "visibility")
    @Enumerated(EnumType.STRING)
    CommonEnum.BoardVisibility visibility;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    CommonEnum.BoardStatus status;

    @OneToMany(mappedBy = "board")
    List<CardListEntity> cardLists = new ArrayList<>();

    @Builder
    public BoardEntity(BigInteger id, String title, CommonEnum.BoardVisibility visibility, CommonEnum.BoardStatus status, List<CardListEntity> cardLists) {
        this.id = id;
        this.title = title;
        this.visibility = visibility;
        this.status = status;
        this.cardLists = cardLists;
    }
}
