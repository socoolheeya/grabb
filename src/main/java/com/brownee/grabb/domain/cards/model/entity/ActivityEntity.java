package com.brownee.grabb.domain.cards.model.entity;

import com.brownee.grabb.domain.members.model.entity.MemberEntity;
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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@Entity
@Table(name = "activity")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActivityEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_id", columnDefinition = "bigint(10)")
    BigInteger id;

    @Column(name = "comment", columnDefinition = "varchar(1000)")
    String comment;

    @OneToOne(mappedBy = "activity")
    MemberEntity member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    CardEntity card;

    @Builder
    public ActivityEntity(BigInteger id, String comment, MemberEntity member, CardEntity card) {
        this.id = id;
        this.comment = comment;
        this.member = member;
        this.card = card;
    }
}
