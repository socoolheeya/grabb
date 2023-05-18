package com.brownee.grabb.domain.members.model.entity;

import com.brownee.grabb.common.model.BaseTimeEntity;
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
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.math.BigInteger;

@Getter
@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MemberEntity extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    BigInteger id;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @CreatedBy
    @Column(name = "created_by")
    String createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    String updatedBy;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_id")
    ActivityEntity activity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    CardEntity cardEntity;
}
