package com.brownee.grabb.domain.pricing.model;

import com.brownee.grabb.common.enums.CommonEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pricing {
    BigInteger id;
    CommonEnum.PricingPlan pricingPlan;
    double price;

}
