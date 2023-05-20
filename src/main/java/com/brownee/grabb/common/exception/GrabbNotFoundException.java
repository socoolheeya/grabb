package com.brownee.grabb.common.exception;

public class GrabbNotFoundException extends RuntimeException {
        public GrabbNotFoundException() {
            super();
        }

        public GrabbNotFoundException(String message) {
            super(message);
        }
}
