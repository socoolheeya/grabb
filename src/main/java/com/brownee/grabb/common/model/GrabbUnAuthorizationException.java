package com.brownee.grabb.common.model;

public class GrabbUnAuthorizationException extends RuntimeException {
        public GrabbUnAuthorizationException() {
            super();
        }

        public GrabbUnAuthorizationException(String message) {
            super(message);
        }
}
