package com.brownee.grabb.domain.boards.model.http;

import com.brownee.grabb.common.enums.CommonEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

import java.math.BigInteger;

@UtilityClass
public class BoardRequest {

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Search {
        BigInteger id;
    }

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Save {
        BigInteger id;
        String title;
        CommonEnum.BoardVisibility visibility;
        CommonEnum.BoardStatus status;
    }
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Remove {
        BigInteger id;
    }


}
