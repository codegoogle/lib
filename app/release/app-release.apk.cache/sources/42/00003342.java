package com.greedygame.mystique.models;

import android.text.TextUtils;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Operation {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "name";
    @NotNull
    private static final String c = "argument";
    @NotNull
    private static final String d = "opacity";
    @NotNull
    private static final String e = "distance";
    @NotNull
    private static final String f = "angle";
    @NotNull
    private static final String g = "width";
    @NotNull
    private static final String h = "color";
    @Nullable
    private String i;
    @Nullable
    private final Object j;
    @Nullable
    private final Float k;
    @Nullable
    private final Integer l;
    @Nullable
    private final Integer m;
    @Nullable
    private Float n;
    @Nullable
    private String o;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return Operation.f;
        }

        @NotNull
        public final String b() {
            return Operation.c;
        }

        @NotNull
        public final String c() {
            return Operation.h;
        }

        @NotNull
        public final String d() {
            return Operation.e;
        }

        @NotNull
        public final String e() {
            return Operation.b;
        }

        @NotNull
        public final String f() {
            return Operation.d;
        }

        @NotNull
        public final String g() {
            return Operation.g;
        }
    }

    public Operation(@Nullable String str, @Nullable Object obj, @Nullable Float f2, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f3, @Nullable String str2) {
        this.i = str;
        this.j = obj;
        this.k = f2;
        this.l = num;
        this.m = num2;
        this.n = f3;
        this.o = str2;
    }

    @Nullable
    public final Integer h() {
        return this.m;
    }

    @Nullable
    public final Object i() {
        return this.j;
    }

    @Nullable
    public final String j() {
        return this.o;
    }

    @Nullable
    public final Integer k() {
        return this.l;
    }

    @Nullable
    public final String l() {
        return this.i;
    }

    @Nullable
    public final Float m() {
        return this.k;
    }

    @Nullable
    public final Float n() {
        return this.n;
    }

    public final boolean o() {
        return !TextUtils.isEmpty(this.i);
    }

    public final void p(@Nullable String str) {
        this.o = str;
    }

    public final void q(@Nullable String str) {
        this.i = str;
    }

    public final void r(@Nullable Float f2) {
        this.n = f2;
    }

    public /* synthetic */ Operation(String str, Object obj, Float f2, Integer num, Integer num2, Float f3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, obj, f2, num, num2, (i & 32) != 0 ? null : f3, (i & 64) != 0 ? null : str2);
    }
}