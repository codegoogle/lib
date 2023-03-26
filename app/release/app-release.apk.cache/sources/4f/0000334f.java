package com.greedygame.mystique2.adapters;

import com.anythink.expressad.foundation.h.h;
import com.greedygame.mystique2.models.Style;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.c95;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class StyleJsonAdapter {
    @FromJson
    @NotNull
    public final Style fromJson(@NotNull String str) {
        c25.p(str, h.e);
        List T4 = c95.T4(str, new String[]{":"}, false, 2, 2, null);
        return new Style(T4.isEmpty() ^ true ? (String) T4.get(0) : "", T4.size() > 1 ? (String) T4.get(1) : null);
    }

    @ToJson
    @NotNull
    public final String toJson(@NotNull Style style) {
        c25.p(style, h.e);
        return style.getKey() + ':' + ((Object) style.getValue());
    }
}