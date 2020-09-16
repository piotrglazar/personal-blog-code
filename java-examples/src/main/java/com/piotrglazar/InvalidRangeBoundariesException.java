package com.piotrglazar;

public class InvalidRangeBoundariesException extends RuntimeException {

    public InvalidRangeBoundariesException(int low, int high) {
        super(String.format("Low %d must be <= than high %d", low, high));
    }
}
