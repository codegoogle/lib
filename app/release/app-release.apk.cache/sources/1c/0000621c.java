package com.p7700g.p99005;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes3.dex */
public final class vn2 {
    private static final String a = "google_api_key";
    private static final String b = "google_app_id";
    private static final String c = "firebase_database_url";
    private static final String d = "ga_trackingId";
    private static final String e = "gcm_defaultSenderId";
    private static final String f = "google_storage_bucket";
    private static final String g = "project_id";
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    /* compiled from: FirebaseOptions.java */
    /* loaded from: classes3.dex */
    public static final class b {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        public b() {
        }

        @x1
        public vn2 a() {
            return new vn2(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
        }

        @x1
        public b b(@x1 String str) {
            this.a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @x1
        public b c(@x1 String str) {
            this.b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @x1
        public b d(@z1 String str) {
            this.c = str;
            return this;
        }

        @x1
        @KeepForSdk
        public b e(@z1 String str) {
            this.d = str;
            return this;
        }

        @x1
        public b f(@z1 String str) {
            this.e = str;
            return this;
        }

        @x1
        public b g(@z1 String str) {
            this.g = str;
            return this;
        }

        @x1
        public b h(@z1 String str) {
            this.f = str;
            return this;
        }

        public b(@x1 vn2 vn2Var) {
            this.b = vn2Var.i;
            this.a = vn2Var.h;
            this.c = vn2Var.j;
            this.d = vn2Var.k;
            this.e = vn2Var.l;
            this.f = vn2Var.m;
            this.g = vn2Var.n;
        }
    }

    @z1
    public static vn2 h(@x1 Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(b);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new vn2(string, stringResourceValueReader.getString(a), stringResourceValueReader.getString(c), stringResourceValueReader.getString(d), stringResourceValueReader.getString(e), stringResourceValueReader.getString(f), stringResourceValueReader.getString(g));
    }

    public boolean equals(Object obj) {
        if (obj instanceof vn2) {
            vn2 vn2Var = (vn2) obj;
            return Objects.equal(this.i, vn2Var.i) && Objects.equal(this.h, vn2Var.h) && Objects.equal(this.j, vn2Var.j) && Objects.equal(this.k, vn2Var.k) && Objects.equal(this.l, vn2Var.l) && Objects.equal(this.m, vn2Var.m) && Objects.equal(this.n, vn2Var.n);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.i, this.h, this.j, this.k, this.l, this.m, this.n);
    }

    @x1
    public String i() {
        return this.h;
    }

    @x1
    public String j() {
        return this.i;
    }

    @z1
    public String k() {
        return this.j;
    }

    @KeepForSdk
    @z1
    public String l() {
        return this.k;
    }

    @z1
    public String m() {
        return this.l;
    }

    @z1
    public String n() {
        return this.n;
    }

    @z1
    public String o() {
        return this.m;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.i).add("apiKey", this.h).add("databaseUrl", this.j).add("gcmSenderId", this.l).add("storageBucket", this.m).add("projectId", this.n).toString();
    }

    private vn2(@x1 String str, @x1 String str2, @z1 String str3, @z1 String str4, @z1 String str5, @z1 String str6, @z1 String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.i = str;
        this.h = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = str7;
    }
}