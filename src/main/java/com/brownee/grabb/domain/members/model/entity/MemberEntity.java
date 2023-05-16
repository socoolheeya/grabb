package com.brownee.grabb.domain.members.model.entity;

import com.brownee.grabb.domain.cards.model.entity.ActivityEntity;
import com.brownee.grabb.domain.cards.model.entity.CardEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@Entity
@Table(name = "member")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MemberEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    BigInteger id;

    @Column(name = "name")
    String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_id")
    ActivityEntity activity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    CardEntity cardEntity;
}
