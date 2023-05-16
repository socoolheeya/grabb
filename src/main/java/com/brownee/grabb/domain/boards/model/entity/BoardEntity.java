package com.brownee.grabb.domain.boards.model.entity;

import com.brownee.grabb.common.enums.CommonEnum;
import com.brownee.grabb.domain.cards.model.Card;
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
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "board")
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
    @OneToMany(mappedBy = "")
    List<Card> cards = new ArrayList<>();


}
