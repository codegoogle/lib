package com.p7700g.p99005;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.p7700g.p99005.rs2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class eu2 extends AbstractSafeParcelable {
    @x1
    public static final Parcelable.Creator<eu2> CREATOR = new fu2();
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    @SafeParcelable.Field(id = 2)
    public Bundle v;
    private Map<String, String> w;
    private d x;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static class b {
        private final Bundle a;
        private final Map<String, String> b;

        public b(@x1 String str) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = new q7();
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid to: ".concat(valueOf) : new String("Invalid to: "));
            } else {
                bundle.putString(rs2.d.g, str);
            }
        }

        @x1
        public b a(@x1 String str, @z1 String str2) {
            this.b.put(str, str2);
            return this;
        }

        @x1
        public eu2 b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new eu2(bundle);
        }

        @x1
        public b c() {
            this.b.clear();
            return this;
        }

        @x1
        public b d(@z1 String str) {
            this.a.putString(rs2.d.e, str);
            return this;
        }

        @x1
        public b e(@x1 Map<String, String> map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }

        @x1
        public b f(@x1 String str) {
            this.a.putString(rs2.d.h, str);
            return this;
        }

        @x1
        public b g(@z1 String str) {
            this.a.putString(rs2.d.d, str);
            return this;
        }

        @x1
        @ShowFirstParty
        public b h(@x1 byte[] bArr) {
            this.a.putByteArray(rs2.d.c, bArr);
            return this;
        }

        @x1
        public b i(@p1(from = 0, to = 86400) int i) {
            this.a.putString("google.ttl", String.valueOf(i));
            return this;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface c {
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static class d {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final String o;
        private final Integer p;
        private final Integer q;
        private final Integer r;
        private final int[] s;
        private final Long t;
        private final boolean u;
        private final boolean v;
        private final boolean w;
        private final boolean x;
        private final boolean y;
        private final long[] z;

        private d(cu2 cu2Var) {
            this.a = cu2Var.p(rs2.c.g);
            this.b = cu2Var.h(rs2.c.g);
            this.c = p(cu2Var, rs2.c.g);
            this.d = cu2Var.p(rs2.c.h);
            this.e = cu2Var.h(rs2.c.h);
            this.f = p(cu2Var, rs2.c.h);
            this.g = cu2Var.p(rs2.c.i);
            this.i = cu2Var.o();
            this.j = cu2Var.p(rs2.c.k);
            this.k = cu2Var.p(rs2.c.l);
            this.l = cu2Var.p(rs2.c.A);
            this.m = cu2Var.p(rs2.c.D);
            this.n = cu2Var.f();
            this.h = cu2Var.p(rs2.c.j);
            this.o = cu2Var.p(rs2.c.m);
            this.p = cu2Var.b(rs2.c.p);
            this.q = cu2Var.b(rs2.c.u);
            this.r = cu2Var.b(rs2.c.t);
            this.u = cu2Var.a(rs2.c.o);
            this.v = cu2Var.a(rs2.c.n);
            this.w = cu2Var.a(rs2.c.q);
            this.x = cu2Var.a(rs2.c.r);
            this.y = cu2Var.a(rs2.c.s);
            this.t = cu2Var.j(rs2.c.x);
            this.s = cu2Var.e();
            this.z = cu2Var.q();
        }

        private static String[] p(cu2 cu2Var, String str) {
            Object[] g = cu2Var.g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        @z1
        public Integer A() {
            return this.q;
        }

        @z1
        public String a() {
            return this.d;
        }

        @z1
        public String[] b() {
            return this.f;
        }

        @z1
        public String c() {
            return this.e;
        }

        @z1
        public String d() {
            return this.m;
        }

        @z1
        public String e() {
            return this.l;
        }

        @z1
        public String f() {
            return this.k;
        }

        public boolean g() {
            return this.y;
        }

        public boolean h() {
            return this.w;
        }

        public boolean i() {
            return this.x;
        }

        @z1
        public Long j() {
            return this.t;
        }

        @z1
        public String k() {
            return this.g;
        }

        @z1
        public Uri l() {
            String str = this.h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @z1
        public int[] m() {
            return this.s;
        }

        @z1
        public Uri n() {
            return this.n;
        }

        public boolean o() {
            return this.v;
        }

        @z1
        public Integer q() {
            return this.r;
        }

        @z1
        public Integer r() {
            return this.p;
        }

        @z1
        public String s() {
            return this.i;
        }

        public boolean t() {
            return this.u;
        }

        @z1
        public String u() {
            return this.j;
        }

        @z1
        public String v() {
            return this.o;
        }

        @z1
        public String w() {
            return this.a;
        }

        @z1
        public String[] x() {
            return this.c;
        }

        @z1
        public String y() {
            return this.b;
        }

        @z1
        public long[] z() {
            return this.z;
        }
    }

    @SafeParcelable.Constructor
    public eu2(@x1 @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.v = bundle;
    }

    private int d(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @z1
    public d e() {
        if (this.x == null && cu2.v(this.v)) {
            this.x = new d(new cu2(this.v));
        }
        return this.x;
    }

    @z1
    public String getCollapseKey() {
        return this.v.getString(rs2.d.e);
    }

    @x1
    public Map<String, String> getData() {
        if (this.w == null) {
            this.w = rs2.d.a(this.v);
        }
        return this.w;
    }

    @z1
    public String getFrom() {
        return this.v.getString("from");
    }

    @z1
    public String getMessageId() {
        String string = this.v.getString(rs2.d.h);
        return string == null ? this.v.getString("message_id") : string;
    }

    @z1
    public String getMessageType() {
        return this.v.getString(rs2.d.d);
    }

    public int getOriginalPriority() {
        String string = this.v.getString(rs2.d.k);
        if (string == null) {
            string = this.v.getString(rs2.d.m);
        }
        return d(string);
    }

    public int getPriority() {
        String string = this.v.getString(rs2.d.l);
        if (string == null) {
            if ("1".equals(this.v.getString(rs2.d.n))) {
                return 2;
            }
            string = this.v.getString(rs2.d.m);
        }
        return d(string);
    }

    @ShowFirstParty
    @z1
    public byte[] getRawData() {
        return this.v.getByteArray(rs2.d.c);
    }

    @z1
    public String getSenderId() {
        return this.v.getString(rs2.d.p);
    }

    public long getSentTime() {
        Object obj = this.v.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                String.valueOf(obj).length();
                return 0L;
            }
        }
        return 0L;
    }

    @z1
    public String getTo() {
        return this.v.getString(rs2.d.g);
    }

    public int getTtl() {
        Object obj = this.v.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String.valueOf(obj).length();
                return 0;
            }
        }
        return 0;
    }

    public void j(Intent intent) {
        intent.putExtras(this.v);
    }

    @x1
    @KeepForSdk
    public Intent k() {
        Intent intent = new Intent();
        intent.putExtras(this.v);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        fu2.c(this, parcel, i);
    }
}