package com.brownee.grabb.common.model.errors;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum GrabbErrorEnum {

    ERR_API_400("ERR_API_400", HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    ERR_API_401("ERR_API_401", HttpStatus.UNAUTHORIZED, "접근 권한이 없습니다."),
    ERR_API_404("ERR_API_404", HttpStatus.NOT_FOUND, "요청을 찾을 수 없습니다."),
    ERR_API_451("ERR_API_451", HttpStatus.BAD_REQUEST, "잘못된 파라미터 타입 입니다."),
    ERR_API_455("ERR_API_455", HttpStatus.BAD_REQUEST, "요청 전문의 유효성 체크가 필요합니다."),
    ERR_API_500("ERR_API_500", HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 에러입니다.");

    final String code;
    final HttpStatus status;
    final String message;

}
