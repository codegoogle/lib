package com.greedygame.core.network.moshi;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.k13;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class FillTypeAdapter {
    @FromJson
    @NotNull
    public final k13 fromJson(@NotNull String str) {
        c25.p(str, "fillType");
        int hashCode = str.hashCode();
        if (hashCode != 112180) {
            if (hashCode != 113722) {
                if (hashCode == 93997959 && str.equals("brand")) {
                    return k13.BRAND;
                }
            } else if (str.equals("sdk")) {
                return k13.SDK;
            }
        } else if (str.equals("s2s")) {
            return k13.S2S;
        }
        return k13.INVALID;
    }

    @ToJson
    @NotNull
    public final String toJson(@NotNull k13 k13Var) {
        c25.p(k13Var, "fillType");
        return k13Var.i();
    }
}