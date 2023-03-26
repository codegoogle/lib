package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.anythink.expressad.d.a.b;
import com.greedygame.mystique.models.Layer;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum StyleType {
    HEIGHT("height"),
    WIDTH("width"),
    MARGIN_LEFT("ml"),
    MARGIN_RIGHT("mr"),
    MARGIN_TOP("mt"),
    MARGIN_BOTTOM("mb"),
    COLOR("color"),
    BGCOLOR("bg"),
    OPACITY("opacity"),
    CENTER("center"),
    XALIGN("x-align"),
    YALIGN("y-align"),
    TEXT_XALIGN("text-x-align"),
    TEXT_YALIGN("text-y-align"),
    FONT("font"),
    BLUR_FILL("blur-fill"),
    LEFT_PADDING("pl"),
    RIGHT_PADDING("pr"),
    TOP_PADDING("pt"),
    BOTTOM_PADDING(b.av),
    VISIBILITY("visibility"),
    ELLIPSIZE(Layer.c),
    TEXT_SIZE("text-size"),
    TEXT_SIZE_MAX("text-size-max"),
    TEXT_SIZE_MIN("text-size-min"),
    MAX_LINES("max-lines"),
    SCALE_TYPE("scale-type"),
    TO_RIGHT_OF("to-right-of"),
    TO_LEFT_OF("to-left-of"),
    ABOVE("above"),
    BELOW("below"),
    Z_INDEX("z-index"),
    MAX_WIDTH("max-width"),
    MAX_HEIGHT("max-height"),
    RADIUS("radius");
    
    @NotNull
    private final String value;

    StyleType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}