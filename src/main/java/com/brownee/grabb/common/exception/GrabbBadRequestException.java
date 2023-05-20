package com.brownee.grabb.common.exception;

public class GrabbBadRequestException extends RuntimeException {
        public GrabbBadRequestException() {
            super();
        }

        public GrabbBadRequestException(String message) {
            super(message);
        }
}
