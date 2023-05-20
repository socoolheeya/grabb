package com.brownee.grabb.domain.cards.model;

import com.brownee.grabb.common.enums.CommonEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cover {
    CommonEnum.CoverSize size;
    String color;
    String brightness;
    String photoUrl;

}
