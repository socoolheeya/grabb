package com.brownee.grabb.domain.boards.model.http;

import com.brownee.grabb.common.enums.CommonEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

import java.math.BigInteger;

@UtilityClass
public class BoardRequest {
    @Getter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Save {
        BigInteger id;
        String title;
        CommonEnum.BoardVisibility visibility;
        CommonEnum.BoardStatus status;
    }
}
