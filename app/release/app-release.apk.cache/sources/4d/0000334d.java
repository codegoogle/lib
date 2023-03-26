package com.greedygame.mystique2;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.c25;
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
    private final String t;
    @Nullable
    private final String u;
    @Nullable
    private final Integer v;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Partner> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final Partner createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new Partner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final Partner[] newArray(int i) {
            return new Partner[i];
        }
    }

    public Partner(@Json(name = "name") @Nullable String str, @Json(name = "placement_id") @Nullable String str2, @Json(name = "app_id") @Nullable String str3, @Json(name = "banner_type") @Nullable Integer num) {
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int intValue;
        c25.p(parcel, "out");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        Integer num = this.v;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}