package com.greedygame.core.models.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.la5;
import com.p7700g.p99005.zg2;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@la5
/* loaded from: classes3.dex */
public final class NativeMediatedAsset implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<NativeMediatedAsset> CREATOR = new a();
    @Nullable
    private String A;
    @Nullable
    private String B;
    @Nullable
    private String C;
    @Nullable
    private String D;
    @Nullable
    private String s;
    @Nullable
    private String t;
    @Nullable
    private String u;
    @Nullable
    private String v;
    @Nullable
    private String w;
    @Nullable
    private Double x;
    @Nullable
    private String y;
    @Nullable
    private String z;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<NativeMediatedAsset> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final NativeMediatedAsset createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new NativeMediatedAsset(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final NativeMediatedAsset[] newArray(int i) {
            return new NativeMediatedAsset[i];
        }
    }

    public NativeMediatedAsset() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public NativeMediatedAsset(@Json(name = "cta") @Nullable String str, @Json(name = "desc") @Nullable String str2, @Json(name = "icon") @Nullable String str3, @Json(name = "image") @Nullable String str4, @Json(name = "title") @Nullable String str5, @Json(name = "star_rating") @Nullable Double d, @Json(name = "store") @Nullable String str6, @Json(name = "price") @Nullable String str7, @Json(name = "advertiser") @Nullable String str8, @Json(name = "adm") @Nullable String str9) {
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = d;
        this.y = str6;
        this.z = str7;
        this.A = str8;
        this.B = str9;
        this.C = "";
    }

    public final void B(@Nullable Double d) {
        this.x = d;
    }

    public final void C(@Nullable String str) {
        this.C = str;
    }

    public final void D(@Nullable String str) {
        this.y = str;
    }

    public final void F(@Nullable String str) {
        this.w = str;
    }

    @Nullable
    public final String c() {
        return this.B;
    }

    @Nullable
    public final String d() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.s;
    }

    @Nullable
    public final String g() {
        return this.t;
    }

    @Nullable
    public final String i() {
        return this.u;
    }

    @Nullable
    public final String j() {
        return this.v;
    }

    @NotNull
    public final List<String> k() {
        ArrayList arrayList = new ArrayList();
        String str = this.u;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            String str2 = this.u;
            c25.m(str2);
            arrayList.add(str2);
        }
        String str3 = this.v;
        if (!(str3 == null || str3.length() == 0)) {
            String str4 = this.v;
            c25.m(str4);
            arrayList.add(str4);
        }
        String str5 = this.D;
        if (!((str5 == null || str5.length() == 0) ? true : true)) {
            String str6 = this.D;
            c25.m(str6);
            arrayList.add(str6);
        }
        return arrayList;
    }

    @Nullable
    public final String l() {
        return this.z;
    }

    @Nullable
    public final String m() {
        return this.D;
    }

    @Nullable
    public final Double n() {
        return this.x;
    }

    @Nullable
    public final String o() {
        return this.C;
    }

    @Nullable
    public final String p() {
        return this.y;
    }

    @Nullable
    public final String q() {
        return this.w;
    }

    public final boolean r() {
        String str = this.s;
        if (str == null || str.length() == 0) {
            return false;
        }
        String str2 = this.w;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        String str3 = this.u;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        String str4 = this.v;
        return !(str4 == null || str4.length() == 0);
    }

    public final void s(@Nullable String str) {
        this.B = str;
    }

    public final void t(@Nullable String str) {
        this.A = str;
    }

    public final void u(@Nullable String str) {
        this.s = str;
    }

    public final void v(@Nullable String str) {
        this.t = str;
    }

    public final void w(@Nullable String str) {
        this.u = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "out");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        Double d = this.x;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
    }

    public final void x(@Nullable String str) {
        this.v = str;
    }

    public final void y(@Nullable String str) {
        this.z = str;
    }

    public final void z(@Nullable String str) {
        this.D = str;
    }

    public /* synthetic */ NativeMediatedAsset(String str, String str2, String str3, String str4, String str5, Double d, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? Double.valueOf((double) zg2.s) : d, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "", (i & 512) != 0 ? null : str9);
    }
}