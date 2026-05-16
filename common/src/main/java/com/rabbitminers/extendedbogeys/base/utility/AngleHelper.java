// Source: https://github.com/Creators-of-Create/Create/blob/mc1.20.1/0.5.1/src/main/java/com/simibubi/create/foundation/utility/AngleHelper.java

package com.rabbitminers.extendedbogeys.base.utility;

public class AngleHelper {
    public static float rad(double angle) {
        if (angle == 0)
            return 0;
        return (float) (angle / 180 * Math.PI);
    }

    public static float deg(double angle) {
        if (angle == 0)
            return 0;
        return (float) (angle * 180 / Math.PI);
    }
}