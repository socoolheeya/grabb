package com.brownee.grabb.domain.boards.model.http;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BoardResponse {

    @Getter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Save {

    }
}
