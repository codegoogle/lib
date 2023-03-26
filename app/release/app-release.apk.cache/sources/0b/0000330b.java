package com.greedygame.core.network.model.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.k13;
import com.p7700g.p99005.la5;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@la5
/* loaded from: classes3.dex */
public final class Partner implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<Partner> CREATOR = new a();
    @Nullable
    private final String s;
    @Nullable
    private final k13 t;
    @Nullable
    private final String u;
    @Nullable
    private final String v;
    @Nullable
    private final Integer w;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Partner> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final Partner createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new Partner(parcel.readString(), parcel.readInt() == 0 ? null : k13.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final Partner[] newArray(int i) {
            return new Partner[i];
        }
    }

    public Partner(@Json(name = "name") @Nullable String str, @Json(name = "type") @Nullable k13 k13Var, @Json(name = "placement_id") @Nullable String str2, @Json(name = "app_id") @Nullable String str3, @Json(name = "banner_type") @Nullable Integer num) {
        this.s = str;
        this.t = k13Var;
        this.u = str2;
        this.v = str3;
        this.w = num;
    }

    @Nullable
    public final String c() {
        return this.v;
    }

    @Nullable
    public final Integer d() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final k13 e() {
        return this.t;
    }

    @Nullable
    public final String g() {
        return this.s;
    }

    @NotNull
    public final String i() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.s);
        sb.append(':');
        sb.append(this.t);
        return sb.toString();
    }

    @Nullable
    public final String j() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "out");
        parcel.writeString(this.s);
        k13 k13Var = this.t;
        if (k13Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            k13Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        Integer num = this.w;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }
}