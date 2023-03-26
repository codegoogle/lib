package com.p7700g.p99005;

import android.content.LocusId;
import android.os.Build;

/* compiled from: LocusIdCompat.java */
/* loaded from: classes.dex */
public final class kh {
    private final String a;
    private final LocusId b;

    /* compiled from: LocusIdCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @x1
        public static LocusId a(@x1 String str) {
            return new LocusId(str);
        }

        @x1
        public static String b(@x1 LocusId locusId) {
            return locusId.getId();
        }
    }

    public kh(@x1 String str) {
        this.a = (String) jp.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = a.a(str);
        } else {
            this.b = null;
        }
    }

    @x1
    private String b() {
        int length = this.a.length();
        return length + "_chars";
    }

    @e2(29)
    @x1
    public static kh d(@x1 LocusId locusId) {
        jp.m(locusId, "locusId cannot be null");
        return new kh((String) jp.q(a.b(locusId), "id cannot be empty"));
    }

    @x1
    public String a() {
        return this.a;
    }

    @e2(29)
    @x1
    public LocusId c() {
        return this.b;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kh.class == obj.getClass()) {
            kh khVar = (kh) obj;
            String str = this.a;
            if (str == null) {
                return khVar.a == null;
            }
            return str.equals(khVar.a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @x1
    public String toString() {
        return wo1.C(wo1.G("LocusIdCompat["), b(), "]");
    }
}