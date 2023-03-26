package com.greedygame.core.network.model.responses;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.qh3;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class TemplateMeta implements Parcelable {
    @NotNull
    public static final a CREATOR = new a(null);
    @NotNull
    public static final String s = "";
    @NotNull
    private final String t;
    @NotNull
    private final String u;
    @NotNull
    private transient String v;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<TemplateMeta> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public TemplateMeta createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new TemplateMeta(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public TemplateMeta[] newArray(int i) {
            return new TemplateMeta[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();
        @NotNull
        private static final TemplateMeta b = new TemplateMeta("", "");

        private b() {
        }

        @NotNull
        public final TemplateMeta a() {
            return b;
        }
    }

    public TemplateMeta() {
        this(null, null, 3, null);
    }

    public /* synthetic */ TemplateMeta(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public TemplateMeta(@Json(name = "url") @NotNull String str, @Json(name = "ver") @NotNull String str2) {
        c25.p(str, "url");
        c25.p(str2, "rVersion");
        this.t = str;
        this.u = str2;
        this.v = "";
    }

    @NotNull
    public final String c() {
        return this.v;
    }

    @NotNull
    public final String d() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.t;
    }

    @NotNull
    public final String g() {
        return (c25.g(this.u, "v1") || c25.g(this.u, qh3.x)) ? this.u : qh3.x;
    }

    public final boolean i(@NotNull String str) {
        c25.p(str, "unitId");
        return false;
    }

    public final boolean j() {
        return (TextUtils.isEmpty(this.t) && TextUtils.isEmpty(g())) ? false : true;
    }

    public final void k(@NotNull String str) {
        c25.p(str, "localPath");
    }

    public final void l(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.v = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "parcel");
        parcel.writeString(this.t);
        parcel.writeString(g());
        parcel.writeString(this.v);
    }

    public /* synthetic */ TemplateMeta(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? qh3.x : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TemplateMeta(Parcel parcel) {
        this(r0, r2 == null ? qh3.x : r2);
        String readString = parcel.readString();
        readString = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        this.v = readString3 != null ? readString3 : "";
    }
}