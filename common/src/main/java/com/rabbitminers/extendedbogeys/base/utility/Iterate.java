package com.rabbitminers.extendedbogeys.base.utility;

import java.util.List;

public class Iterate {

    public static final int[] positiveAndNegative = { 1, -1 };

    public static <T> T cycleValue(List<T> list, T current) {
        int currentIndex = list.indexOf(current);
        if (currentIndex == -1) {
            throw new IllegalArgumentException("Current value not found in list");
        }
        int nextIndex = (currentIndex + 1) % list.size();
        return list.get(nextIndex);
    }
}