package com.brownee.grabb.common.model.errors;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GrabbValidationError {
    String field;
    String code;
    Object rejectedValue;

    @Builder
    public GrabbValidationError(String field, String code, Object rejectedValue) {
        this.field = field;
        this.code = code;
        this.rejectedValue = rejectedValue;
    }
}
