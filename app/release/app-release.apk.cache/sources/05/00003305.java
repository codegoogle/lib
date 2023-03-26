package com.greedygame.core.network.model.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.greedygame.core.ad.models.AdUnitMeasurements;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.TemplateMeta;
import com.greedygame.core.signals.AdInvalidSignal;
import com.greedygame.core.signals.AdRewardSignal;
import com.greedygame.core.signals.ImpressionSignal;
import com.greedygame.core.signals.UiiClickSignal;
import com.greedygame.core.signals.UnitClickSignal;
import com.p7700g.p99005.a95;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.cz2;
import com.p7700g.p99005.cz4;
import com.p7700g.p99005.kb3;
import com.p7700g.p99005.lb3;
import com.p7700g.p99005.mb3;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.qb3;
import com.p7700g.p99005.qh3;
import com.p7700g.p99005.rb3;
import com.p7700g.p99005.rs4;
import com.p7700g.p99005.sb3;
import com.p7700g.p99005.tb3;
import com.p7700g.p99005.ub3;
import com.p7700g.p99005.xz2;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Ad implements Parcelable {
    private final boolean A;
    @NotNull
    private TemplateMeta B;
    @Nullable
    private final UiiConfiguration C;
    @NotNull
    private final NativeMediatedAsset D;
    @Nullable
    private final List<String> E;
    @Nullable
    private final List<String> F;
    @Nullable
    private final List<String> G;
    private final boolean H;
    @Nullable
    private final String u;
    @Nullable
    private final String v;
    @NotNull
    private final String w;
    @Nullable
    private String x;
    @Nullable
    private final Partner y;
    @Nullable
    private final String z;
    @NotNull
    public static final b s = new b(null);
    @cz4
    @NotNull
    public static final Parcelable.Creator<Ad> CREATOR = new a();
    @NotNull
    private static final Ad t = new Ad(null, null, "", null, null, null, false, TemplateMeta.b.a.a(), UiiConfiguration.s.a(), new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), null, null, null, false, 8192, null);

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Ad> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public Ad createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new Ad(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public Ad[] newArray(int i) {
            return new Ad[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Ad a() {
            return Ad.t;
        }
    }

    public /* synthetic */ Ad(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public Ad(@Json(name = "campaign_id") @Nullable String str, @Json(name = "session_id") @Nullable String str2, @Json(name = "screen_time") @NotNull String str3, @Json(name = "redirect") @Nullable String str4, @Json(name = "partner") @Nullable Partner partner, @Json(name = "engagement_url") @Nullable String str5, @Json(name = "external") boolean z, @Json(name = "template") @NotNull TemplateMeta templateMeta, @Json(name = "uii") @Nullable UiiConfiguration uiiConfiguration, @Json(name = "config") @NotNull NativeMediatedAsset nativeMediatedAsset, @Json(name = "uii_click") @Nullable List<String> list, @Json(name = "unit_click") @Nullable List<String> list2, @Json(name = "impressions") @Nullable List<String> list3, @Json(name = "clickable") boolean z2) {
        c25.p(str3, "rScreenTime");
        c25.p(templateMeta, "templateMeta");
        c25.p(nativeMediatedAsset, "nativeMediatedAsset");
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = str4;
        this.y = partner;
        this.z = str5;
        this.A = z;
        this.B = templateMeta;
        this.C = uiiConfiguration;
        this.D = nativeMediatedAsset;
        this.E = list;
        this.F = list2;
        this.G = list3;
        this.H = z2;
    }

    public static /* synthetic */ void p(Ad ad, boolean z, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        ad.o(z, l);
    }

    @Nullable
    public final String B() {
        return this.v;
    }

    @NotNull
    public final TemplateMeta C() {
        return this.B;
    }

    @Nullable
    public final List<String> D() {
        return this.E;
    }

    @Nullable
    public final UiiConfiguration F() {
        return this.C;
    }

    @Nullable
    public final List<String> G() {
        return this.F;
    }

    public final boolean H() {
        return this.H;
    }

    public final boolean I() {
        String str = this.u;
        return str != null && str.length() > 0;
    }

    public final void J(@Nullable String str) {
        this.x = str;
    }

    public final void K(@NotNull TemplateMeta templateMeta) {
        c25.p(templateMeta, "<set-?>");
        this.B = templateMeta;
    }

    public final void d(@NotNull String str) {
        c25.p(str, "error");
        new kb3(new AdInvalidSignal(0L, this.v, null, null, null, str, 29, null), null).q();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e() {
        xz2.c(cz2.c(this), c25.C("Ad Reward Signal fired for ", this.v));
        String str = this.v;
        String str2 = str == null ? pg1.d : str;
        String str3 = this.u;
        String str4 = str3 == null ? pg1.d : str3;
        Partner partner = this.y;
        new lb3(new AdRewardSignal(0L, str2, null, null, str4, partner == null ? null : partner.g(), null, 77, null), null).q();
    }

    public final void g(@NotNull AdUnitMeasurements adUnitMeasurements) {
        c25.p(adUnitMeasurements, "stat");
        xz2.c(cz2.c(this), c25.C("Partner Impression Fired for ", this.v));
        String str = this.v;
        String str2 = str == null ? pg1.d : str;
        String str3 = this.u;
        new mb3(new ImpressionSignal(0L, str2, null, null, str3 == null ? pg1.d : str3, null, adUnitMeasurements, 45, null), null).q();
    }

    public final void i() {
        List<String> list = this.G;
        if (list == null) {
            return;
        }
        for (String str : list) {
            new ub3(str, new LinkedHashMap(), null, 4, null).q();
        }
    }

    public final void j() {
        String str = this.v;
        String str2 = str == null ? pg1.d : str;
        String str3 = this.u;
        String str4 = str3 == null ? pg1.d : str3;
        Partner partner = this.y;
        new mb3(new ImpressionSignal(0L, str2, "partner_imp", null, str4, partner == null ? null : partner.g(), null, 73, null), null).q();
    }

    public final void k() {
        String str = this.v;
        String str2 = str == null ? pg1.d : str;
        String str3 = this.u;
        new qb3(new UiiClickSignal(0L, str2, "uii_click", null, str3 == null ? pg1.d : str3, null, 41, null), null).q();
    }

    public final void l() {
        List<String> list = this.E;
        if (list == null) {
            return;
        }
        for (String str : list) {
            new ub3(str, new LinkedHashMap(), null, 4, null).q();
        }
    }

    public final void m() {
        String str = this.v;
        String str2 = str == null ? pg1.d : str;
        String str3 = this.u;
        new rb3(new UiiClickSignal(0L, str2, "uii_close", null, str3 == null ? pg1.d : str3, null, 41, null), null).q();
    }

    public final void n() {
        String str = this.v;
        String str2 = str == null ? pg1.d : str;
        String str3 = this.u;
        new sb3(new ImpressionSignal(0L, str2, "uii_open", null, str3 == null ? pg1.d : str3, null, null, 105, null), null).q();
    }

    public final void o(boolean z, @Nullable Long l) {
        xz2.c(cz2.c(this), c25.C("Click Fired for ", this.v));
        String str = this.v;
        String str2 = str == null ? pg1.d : str;
        String str3 = this.u;
        new tb3(new UnitClickSignal(0L, str2, null, null, str3 == null ? pg1.d : str3, null, z ? Boolean.TRUE : null, l != null ? Long.valueOf(System.currentTimeMillis() - l.longValue()) : null, 45, null), null).q();
    }

    public final void q() {
        List<String> list = this.F;
        if (list == null) {
            return;
        }
        for (String str : list) {
            new ub3(str, new LinkedHashMap(), null, 4, null).q();
        }
    }

    @Nullable
    public final String r() {
        return this.u;
    }

    @Nullable
    public final String s() {
        return this.z;
    }

    public final boolean t() {
        return this.A;
    }

    @Nullable
    public final List<String> u() {
        return this.G;
    }

    @NotNull
    public final NativeMediatedAsset v() {
        return this.D;
    }

    @Nullable
    public final Partner w() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Nullable Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeString(r());
        parcel.writeString(B());
        parcel.writeString(x());
        parcel.writeString(y());
        parcel.writeParcelable(w(), 0);
        parcel.writeString(s());
        parcel.writeValue(Boolean.valueOf(t()));
        parcel.writeParcelable(C(), 0);
        parcel.writeParcelable(F(), 0);
        parcel.writeParcelable(v(), 0);
        parcel.writeStringList(D());
        parcel.writeStringList(G());
        parcel.writeStringList(u());
        parcel.writeValue(Boolean.valueOf(H()));
    }

    @NotNull
    public final String x() {
        return this.w;
    }

    @Nullable
    public final String y() {
        return this.x;
    }

    public final long z() {
        Long Z0 = a95.Z0(this.w);
        if (Z0 == null) {
            return 60000L;
        }
        return Z0.longValue();
    }

    public /* synthetic */ Ad(String str, String str2, String str3, String str4, Partner partner, String str5, boolean z, TemplateMeta templateMeta, UiiConfiguration uiiConfiguration, NativeMediatedAsset nativeMediatedAsset, List list, List list2, List list3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, str4, partner, str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? new TemplateMeta("", qh3.x) : templateMeta, uiiConfiguration, (i & 512) != 0 ? new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null) : nativeMediatedAsset, list, list2, list3, (i & 8192) != 0 ? true : z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Ad(Parcel parcel) {
        this(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, ((Boolean) r0).booleanValue());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        readString3 = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        Partner partner = (Partner) parcel.readParcelable(Partner.class.getClassLoader());
        String readString5 = parcel.readString();
        Object readValue = parcel.readValue(null);
        Objects.requireNonNull(readValue, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) readValue).booleanValue();
        TemplateMeta templateMeta = (TemplateMeta) parcel.readParcelable(TemplateMeta.class.getClassLoader());
        templateMeta = templateMeta == null ? TemplateMeta.b.a.a() : templateMeta;
        UiiConfiguration uiiConfiguration = (UiiConfiguration) parcel.readParcelable(UiiConfiguration.class.getClassLoader());
        uiiConfiguration = uiiConfiguration == null ? UiiConfiguration.s.a() : uiiConfiguration;
        NativeMediatedAsset nativeMediatedAsset = (NativeMediatedAsset) parcel.readParcelable(NativeMediatedAsset.class.getClassLoader());
        nativeMediatedAsset = nativeMediatedAsset == null ? new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null) : nativeMediatedAsset;
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        List Q5 = createStringArrayList == null ? null : rs4.Q5(createStringArrayList);
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        List Q52 = createStringArrayList2 == null ? null : rs4.Q5(createStringArrayList2);
        ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
        List Q53 = createStringArrayList3 == null ? null : rs4.Q5(createStringArrayList3);
        Object readValue2 = parcel.readValue(null);
        Objects.requireNonNull(readValue2, "null cannot be cast to non-null type kotlin.Boolean");
    }
}