package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.greedygame.core.ad.models.AdUnitMeasurements;
import com.greedygame.core.network.model.responses.Ad;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ia3 implements Parcelable {
    @NotNull
    public static final a CREATOR = new a(null);
    @NotNull
    private static final ia3 s = new ia3(Ad.s.a(), false, false, false, false, 28, null);
    @NotNull
    private AtomicBoolean A;
    @Nullable
    private g03 B;
    @NotNull
    private Ad t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final int y;
    private long z;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ia3> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public ia3 createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new ia3(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public ia3[] newArray(int i) {
            return new ia3[i];
        }
    }

    public ia3(@NotNull Ad ad, boolean z, boolean z2, boolean z3, boolean z4) {
        c25.p(ad, "ad");
        this.t = ad;
        this.u = z;
        this.v = z2;
        this.w = z3;
        this.x = z4;
        this.y = 300000;
        this.z = -1L;
        this.A = new AtomicBoolean(false);
        this.x = this.t.H();
        this.z = System.currentTimeMillis();
    }

    @NotNull
    public final Ad c() {
        return this.t;
    }

    public final void d(@Nullable g03 g03Var) {
        this.B = g03Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(@NotNull AdUnitMeasurements adUnitMeasurements) {
        c25.p(adUnitMeasurements, "measurements");
        this.w = true;
        this.t.g(adUnitMeasurements);
        this.t.i();
    }

    public final void g(boolean z) {
        this.u = z;
    }

    public final boolean i() {
        return this.u;
    }

    public final boolean j() {
        return this.w;
    }

    public final boolean k() {
        return this.x;
    }

    @NotNull
    public final AtomicBoolean l() {
        return this.A;
    }

    public final boolean m() {
        return c25.g(this.t.C().g(), "v1");
    }

    public final void n() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.t.j();
    }

    public final boolean o() {
        return System.currentTimeMillis() > this.z + ((long) this.y);
    }

    public final void p() {
        this.A.set(true);
        g03 g03Var = this.B;
        if (g03Var == null) {
            return;
        }
        g03Var.f();
    }

    public final void q() {
        this.A.set(false);
        g03 g03Var = this.B;
        if (g03Var == null) {
            return;
        }
        g03Var.h();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "parcel");
        parcel.writeParcelable(this.t, 0);
        parcel.writeValue(Boolean.valueOf(this.u));
        parcel.writeValue(Boolean.valueOf(this.v));
        parcel.writeValue(Boolean.valueOf(this.w));
        parcel.writeValue(Boolean.valueOf(this.x));
    }

    public /* synthetic */ ia3(Ad ad, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? true : z4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"ParcelClassLoader"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ia3(@NotNull Parcel parcel) {
        this(r2, r4, r5, r6, ((Boolean) r8).booleanValue());
        c25.p(parcel, "parcel");
        Ad ad = (Ad) parcel.readParcelable(Ad.class.getClassLoader());
        Ad a2 = ad == null ? Ad.s.a() : ad;
        c25.o(a2, "parcel.readParcelable<Ad>(\n            Ad::class.java.classLoader\n        ) ?: Ad.INVALID");
        Object readValue = parcel.readValue(null);
        Objects.requireNonNull(readValue, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) readValue).booleanValue();
        Object readValue2 = parcel.readValue(null);
        Objects.requireNonNull(readValue2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue2 = ((Boolean) readValue2).booleanValue();
        Object readValue3 = parcel.readValue(null);
        Objects.requireNonNull(readValue3, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue3 = ((Boolean) readValue3).booleanValue();
        Object readValue4 = parcel.readValue(null);
        Objects.requireNonNull(readValue4, "null cannot be cast to non-null type kotlin.Boolean");
    }
}