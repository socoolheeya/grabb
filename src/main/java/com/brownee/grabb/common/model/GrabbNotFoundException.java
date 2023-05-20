package com.brownee.grabb.common.model;

public class GrabbNotFoundException extends RuntimeException {
        public GrabbNotFoundException() {
            super();
        }

        public GrabbNotFoundException(String message) {
            super(message);
        }
}
