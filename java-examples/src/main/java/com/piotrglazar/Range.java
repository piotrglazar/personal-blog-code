package com.piotrglazar;

public record Range(int low, int high) {

    public Range {
        if (low > high) {
            throw new InvalidRangeBoundariesException(low, high);
        }
    }
}
