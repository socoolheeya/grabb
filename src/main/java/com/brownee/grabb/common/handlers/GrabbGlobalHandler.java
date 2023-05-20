package com.brownee.grabb.common.handlers;

import com.brownee.grabb.common.exception.GrabbBadRequestException;
import com.brownee.grabb.common.exception.GrabbUnAuthorizationException;
import com.brownee.grabb.common.model.errors.GrabbError;
import com.brownee.grabb.common.model.errors.GrabbErrorEnum;
import com.brownee.grabb.common.model.errors.GrabbValidationError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class GrabbGlobalHandler {

    @ExceptionHandler(GrabbBadRequestException.class)
    public ResponseEntity<GrabbError> badRequest(GrabbBadRequestException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        GrabbError.builder()
                                .status(GrabbErrorEnum.ERR_API_400.getStatus())
                                .code(GrabbErrorEnum.ERR_API_400.getCode())
                                .message(e.getMessage().isEmpty() ? GrabbErrorEnum.ERR_API_400.getMessage() : e.getMessage())
                                .build()
                );
    }

    @ExceptionHandler(GrabbUnAuthorizationException.class)
    public ResponseEntity<GrabbError> unAuthorize(GrabbUnAuthorizationException e) {
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(
                        GrabbError.builder()
                                .status(GrabbErrorEnum.ERR_API_401.getStatus())
                                .code(GrabbErrorEnum.ERR_API_401.getCode())
                                .message(e.getMessage().isEmpty() ? GrabbErrorEnum.ERR_API_401.getMessage() : e.getMessage())
                                .build()
                );
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<GrabbError> illegalBadRequest(IllegalArgumentException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        GrabbError.builder()
                                .status(GrabbErrorEnum.ERR_API_400.getStatus())
                                .code(GrabbErrorEnum.ERR_API_400.getCode())
                                .message(GrabbErrorEnum.ERR_API_400.getMessage())
                                .build()
                );
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<GrabbError> valid(MethodArgumentTypeMismatchException e) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        GrabbError.builder()
                                .status(GrabbErrorEnum.ERR_API_451.getStatus())
                                .code(GrabbErrorEnum.ERR_API_451.getCode())
                                .message(GrabbErrorEnum.ERR_API_451.getMessage())
                                .build()
                );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<GrabbError> valid(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();

        List<GrabbValidationError> errors = new ArrayList<>();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            errors.add(
                    GrabbValidationError.builder()
                            .field(fieldError.getField())
                            .code(fieldError.getCode())
                            .rejectedValue(fieldError.getRejectedValue())
                            .build()
            );
        }

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        GrabbError.builder()
                                .status(GrabbErrorEnum.ERR_API_455.getStatus())
                                .code(GrabbErrorEnum.ERR_API_455.getCode())
                                .message(GrabbErrorEnum.ERR_API_455.getMessage())
                                .validationErrors(errors)
                                .build()
                );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GrabbError> valid(Exception e) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(
                        GrabbError.builder()
                                .status(GrabbErrorEnum.ERR_API_500.getStatus())
                                .code(GrabbErrorEnum.ERR_API_500.getCode())
                                .message(GrabbErrorEnum.ERR_API_500.getMessage())
                                .build()
                );
    }


}
