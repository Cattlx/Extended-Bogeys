package com.rabbitminers.extendedbogeys.base.utility;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;

public class NBTHelper {

    public static <T extends Enum<?>> T readEnum(CompoundTag nbt, String key, Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        if (enumConstants == null)
            throw new IllegalArgumentException("Non-Enum class passed to readEnum: " + enumClass.getName());
        if (nbt.contains(key, Tag.TAG_STRING)) {
            String name = nbt.getString(key);
            for (T t : enumConstants) {
                if (t.name()
                        .equals(name))
                    return t;
            }
        }
        return enumConstants[0];
    }

    public static <T extends Enum<?>> void writeEnum(CompoundTag nbt, String key, T enumConstant) {
        nbt.putString(key, enumConstant.name());
    }
}