package com.brownee.grabb.domain.cards.model.entity;

import com.brownee.grabb.common.enums.CommonEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@Entity
@Table(name = "cover")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CoverEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cover_id", columnDefinition = "bigint(10)")
    BigInteger id;

    @Column(name = "size")
    CommonEnum.CoverSize size;

    @Column(name = "color")
    String color;

    @Column(name = "brightness")
    String brightness;

    @Column(name = "photo_url")
    String photoUrl;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    CardEntity card;


}
