package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@JsonClass(generateAdapter = false)
@la5
/* loaded from: classes3.dex */
public enum k13 implements Parcelable {
    S2S("s2s"),
    SDK("sdk"),
    BRAND("brand"),
    INVALID("");
    
    @NotNull
    public static final Parcelable.Creator<k13> CREATOR = new Parcelable.Creator<k13>() { // from class: com.p7700g.p99005.k13.a
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final k13 createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return k13.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final k13[] newArray(int i) {
            return new k13[i];
        }
    };
    @NotNull
    private final String value;

    k13(String str) {
        this.value = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "out");
        parcel.writeString(name());
    }
}