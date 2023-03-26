package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.greedygame.core.ad.models.AdUnitMeasurements;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@la5
/* loaded from: classes3.dex */
public final class n03 implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<n03> CREATOR = new a();
    @NotNull
    private String s;
    @NotNull
    private final k03 t;
    private int u;
    @Nullable
    private ViewGroup.LayoutParams v;
    @NotNull
    private final AdUnitMeasurements w;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<n03> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final n03 createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new n03(parcel.readString(), k03.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final n03[] newArray(int i) {
            return new n03[i];
        }
    }

    public n03(@NotNull String str, @NotNull k03 k03Var) {
        c25.p(str, "unitId");
        c25.p(k03Var, "adType");
        this.s = str;
        this.t = k03Var;
        this.w = new AdUnitMeasurements(null, null, null, null, null, null, 63, null);
    }

    @NotNull
    public final String c() {
        return this.s;
    }

    public final void d(int i) {
        if (i != 0) {
            this.u = i;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(@Nullable ViewGroup.LayoutParams layoutParams) {
        this.v = layoutParams;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n03) {
            n03 n03Var = (n03) obj;
            return c25.g(this.s, n03Var.s) && this.t == n03Var.t;
        }
        return false;
    }

    public final void g(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.s = str;
    }

    public int hashCode() {
        return this.t.hashCode() + (this.s.hashCode() * 31);
    }

    @NotNull
    public final k03 i() {
        return this.t;
    }

    public final int j() {
        return this.u;
    }

    @Nullable
    public final ViewGroup.LayoutParams k() {
        return this.v;
    }

    @NotNull
    public final AdUnitMeasurements l() {
        return this.w;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("UnitConfig(unitId=");
        G.append(this.s);
        G.append(", adType=");
        G.append(this.t);
        G.append(')');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "out");
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
    }

    public /* synthetic */ n03(String str, k03 k03Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, k03Var);
    }
}