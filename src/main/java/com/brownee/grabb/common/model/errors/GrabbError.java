package com.brownee.grabb.common.model.errors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GrabbError {
    HttpStatus status;
    String code;
    String message;
    List<GrabbValidationError> validationErrors;


    @Builder
    public GrabbError(HttpStatus status, String code, String message, List<GrabbValidationError> validationErrors) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.validationErrors = validationErrors;
    }
}
