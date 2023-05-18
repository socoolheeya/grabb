package com.brownee.grabb.domain.cards.model.entity;

import com.brownee.grabb.domain.cards.model.Card;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "card_list")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardListEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_list_id")
    BigInteger id;

    @Column(name = "name")
    String name;

    @Column(name = "position")
    int position;

    @OneToMany(mappedBy = "cardList")
    List<CardEntity> cards = new ArrayList<>();

}
