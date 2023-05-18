package com.brownee.grabb.domain.pricing.model.entity;

import com.brownee.grabb.common.enums.CommonEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@Entity
@Table(name = "pricing")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PricingEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pricing_id")
    BigInteger id;

    @Enumerated
    @Column(name = "pricing_plan")
    CommonEnum.PricingPlan pricingPlan;

    @Column(name = "price")
    double price;
}
