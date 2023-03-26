package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.anythink.expressad.foundation.h.h;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Json(name = h.e)
@Keep
/* loaded from: classes3.dex */
public final class Style {
    @NotNull
    private final String key;
    @Nullable
    private final String value;

    public Style(@NotNull String str, @Nullable String str2) {
        c25.p(str, "key");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ Style copy$default(Style style, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = style.key;
        }
        if ((i & 2) != 0) {
            str2 = style.value;
        }
        return style.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @Nullable
    public final String component2() {
        return this.value;
    }

    @NotNull
    public final Style copy(@NotNull String str, @Nullable String str2) {
        c25.p(str, "key");
        return new Style(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Style) {
            Style style = (Style) obj;
            return c25.g(this.key, style.key) && c25.g(this.value, style.value);
        }
        return false;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Style(key=");
        G.append(this.key);
        G.append(", value=");
        G.append((Object) this.value);
        G.append(')');
        return G.toString();
    }
}