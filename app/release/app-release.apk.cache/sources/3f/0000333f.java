package com.greedygame.mystique.models;

import android.text.TextUtils;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.i33;
import com.p7700g.p99005.js4;
import com.p7700g.p99005.la1;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Layer {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    public static final String b = "operations";
    @NotNull
    public static final String c = "ellipsize";
    @NotNull
    public static final String d = "min_font_size";
    @NotNull
    public static final String e = "fallback_id";
    public static final int f = -1;
    @Nullable
    private final String g;
    @NotNull
    private final String h;
    @NotNull
    private final Placement i;
    @Nullable
    private final List<Operation> j;
    private final boolean k;
    private final float l;
    private final int m;
    @Nullable
    private final Integer n;
    private transient boolean o;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Layer(@Nullable String str, @NotNull String str2, @NotNull Placement placement, @Json(name = "operations") @Nullable List<Operation> list, @Json(name = "ellipsize") boolean z, @Json(name = "min_font_size") float f2, @Json(name = "fallback_id") int i, @Nullable Integer num) {
        c25.p(str2, la1.k);
        c25.p(placement, "placement");
        this.g = str;
        this.h = str2;
        this.i = placement;
        this.j = list;
        this.k = z;
        this.l = f2;
        this.m = i;
        this.n = num;
    }

    @Nullable
    public final String a() {
        return this.g;
    }

    @NotNull
    public final String b() {
        return this.h;
    }

    @NotNull
    public final Placement c() {
        return this.i;
    }

    @NotNull
    public final Layer copy(@Nullable String str, @NotNull String str2, @NotNull Placement placement, @Json(name = "operations") @Nullable List<Operation> list, @Json(name = "ellipsize") boolean z, @Json(name = "min_font_size") float f2, @Json(name = "fallback_id") int i, @Nullable Integer num) {
        c25.p(str2, la1.k);
        c25.p(placement, "placement");
        return new Layer(str, str2, placement, list, z, f2, i, num);
    }

    @Nullable
    public final List<Operation> d() {
        return this.j;
    }

    public final boolean e() {
        return this.k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Layer) {
            Layer layer = (Layer) obj;
            return c25.g(this.g, layer.g) && c25.g(this.h, layer.h) && c25.g(this.i, layer.i) && c25.g(this.j, layer.j) && this.k == layer.k && c25.g(Float.valueOf(this.l), Float.valueOf(layer.l)) && this.m == layer.m && c25.g(this.n, layer.n);
        }
        return false;
    }

    public final float f() {
        return this.l;
    }

    public final int g() {
        return this.m;
    }

    @Nullable
    public final Integer h() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.g;
        int hashCode = (this.i.hashCode() + wo1.x(this.h, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        List<Operation> list = this.j;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int floatToIntBits = (((Float.floatToIntBits(this.l) + ((hashCode2 + i) * 31)) * 31) + this.m) * 31;
        Integer num = this.n;
        return floatToIntBits + (num != null ? num.hashCode() : 0);
    }

    public final int j() {
        return this.m;
    }

    @Nullable
    public final Integer k() {
        return this.n;
    }

    public final float l() {
        return this.l;
    }

    @Nullable
    public final List<Operation> m() {
        return this.j;
    }

    @NotNull
    public final String n() {
        return this.h;
    }

    @NotNull
    public final Placement o() {
        return this.i;
    }

    @Nullable
    public final String p() {
        return this.g;
    }

    public final boolean q() {
        int size;
        List<Operation> list = this.j;
        if (list != null && list.size() - 1 >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (c25.g(this.j.get(i).l(), i33.a.j())) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.k;
    }

    public final boolean s() {
        return this.o;
    }

    public final boolean t() {
        return (!this.i.d() || TextUtils.isEmpty(this.g) || c25.g(this.g, "invalid")) ? false : true;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Layer(type=");
        G.append((Object) this.g);
        G.append(", path=");
        G.append(this.h);
        G.append(", placement=");
        G.append(this.i);
        G.append(", operations=");
        G.append(this.j);
        G.append(", isEllipsize=");
        G.append(this.k);
        G.append(", minFontSize=");
        G.append(this.l);
        G.append(", fallbackId=");
        G.append(this.m);
        G.append(", id=");
        G.append(this.n);
        G.append(')');
        return G.toString();
    }

    public final void u(boolean z) {
        this.o = z;
    }

    public /* synthetic */ Layer(String str, String str2, Placement placement, List list, boolean z, float f2, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new Placement(null, null, null, 7, null) : placement, (i2 & 8) != 0 ? js4.F() : list, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 10.0f : f2, (i2 & 64) != 0 ? -1 : i, num);
    }
}