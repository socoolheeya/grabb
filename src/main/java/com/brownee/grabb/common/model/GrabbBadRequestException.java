package com.brownee.grabb.common.model;

public class GrabbBadRequestException extends RuntimeException {
        public GrabbBadRequestException() {
            super();
        }

        public GrabbBadRequestException(String message) {
            super(message);
        }
}
