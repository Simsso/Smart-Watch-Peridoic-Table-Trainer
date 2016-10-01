package com.timodenk.periodictabletrainer;

import android.graphics.Color;

public enum ElementColors {
    ALKALI_METAL(255, 102, 102),
    ALKALINE_EARTH_METAL(255, 222, 173),
    LANTHANIDE(255, 191, 255),
    ACTINIDE(255, 153, 204),
    TRANSITION_METAL(255, 192, 192),
    POST_TRANSITION_METAL(204, 204, 204),
    METALLOID(204, 204, 153),
    POLYATOMIC_NONMETAL(161, 255, 195),
    DIATOMIC_NONMETAL(231, 255, 143),
    NOBLE_GAS(192, 255, 255),
    UNKNOWN(232, 232, 232);

    private final int r;
    private final int g;
    private final int b;

    private ElementColors(final int r, final int g, final int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getColor() {
        return Color.rgb(r, g, b);
    }
}
