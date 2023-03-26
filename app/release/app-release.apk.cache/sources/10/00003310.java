package com.greedygame.core.network.model.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.la5;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.Json;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@la5
/* loaded from: classes3.dex */
public final class Template implements Parcelable {
    @NotNull
    private final String u;
    @NotNull
    private final String v;
    @NotNull
    public static final a s = new a(null);
    @NotNull
    public static final Parcelable.Creator<Template> CREATOR = new b();
    @NotNull
    private static final Template t = new Template("", "");

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Template a() {
            return Template.t;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<Template> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public final Template createFromParcel(@NotNull Parcel parcel) {
            c25.p(parcel, "parcel");
            return new Template(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public final Template[] newArray(int i) {
            return new Template[i];
        }
    }

    public Template(@Json(name = "url") @NotNull String str, @Json(name = "version") @NotNull String str2) {
        c25.p(str, "url");
        c25.p(str2, com.anythink.expressad.foundation.g.a.h);
        this.u = str;
        this.v = str2;
    }

    public static /* synthetic */ Template g(Template template, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = template.u;
        }
        if ((i & 2) != 0) {
            str2 = template.v;
        }
        return template.copy(str, str2);
    }

    @NotNull
    public final Template copy(@Json(name = "url") @NotNull String str, @Json(name = "version") @NotNull String str2) {
        c25.p(str, "url");
        c25.p(str2, com.anythink.expressad.foundation.g.a.h);
        return new Template(str, str2);
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
        return this.v;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Template) {
            Template template = (Template) obj;
            return c25.g(this.u, template.u) && c25.g(this.v, template.v);
        }
        return false;
    }

    public int hashCode() {
        return this.v.hashCode() + (this.u.hashCode() * 31);
    }

    @NotNull
    public final String i() {
        return this.u;
    }

    @NotNull
    public final String j() {
        return this.v;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Template(url=");
        G.append(this.u);
        G.append(", version=");
        return wo1.B(G, this.v, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        c25.p(parcel, "out");
        parcel.writeString(this.u);
        parcel.writeString(this.v);
    }
}