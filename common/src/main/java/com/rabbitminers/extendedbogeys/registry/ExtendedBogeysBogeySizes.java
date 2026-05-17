package com.rabbitminers.extendedbogeys.registry;

import com.rabbitminers.extendedbogeys.ExtendedBogeys;
import com.simibubi.create.content.trains.bogey.BogeySizes;

public class ExtendedBogeysBogeySizes {
    public static final BogeySizes.BogeySize MEDIUM = create("medium", 9f / 16f);
    public static final BogeySizes.BogeySize EXTRA_LARGE = create("extra_large", 14f / 16f);

    public static BogeySizes.BogeySize create(String name, float size) {
        BogeySizes.BogeySize bogeySize = new BogeySizes.BogeySize(ExtendedBogeys.asResource(name), size);
        BogeySizes.register(bogeySize);
        return bogeySize;
    }

    public static void register() {

    }
}
