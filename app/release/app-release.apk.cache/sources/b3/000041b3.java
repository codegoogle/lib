package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShareTarget.java */
/* loaded from: classes.dex */
public final class f7 {
    @SuppressLint({"IntentName"})
    public static final String a = "androidx.browser.trusted.sharing.KEY_ACTION";
    public static final String b = "androidx.browser.trusted.sharing.KEY_METHOD";
    public static final String c = "androidx.browser.trusted.sharing.KEY_ENCTYPE";
    public static final String d = "androidx.browser.trusted.sharing.KEY_PARAMS";
    public static final String e = "GET";
    public static final String f = "POST";
    public static final String g = "application/x-www-form-urlencoded";
    public static final String h = "multipart/form-data";
    @x1
    public final String i;
    @z1
    public final String j;
    @z1
    public final String k;
    @x1
    public final c l;

    /* compiled from: ShareTarget.java */
    @i2({i2.a.s})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* compiled from: ShareTarget.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final String a = "androidx.browser.trusted.sharing.KEY_FILE_NAME";
        public static final String b = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
        @x1
        public final String c;
        @x1
        public final List<String> d;

        public b(@x1 String str, @x1 List<String> list) {
            this.c = str;
            this.d = Collections.unmodifiableList(list);
        }

        @z1
        public static b a(@z1 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(a);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(b);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new b(string, stringArrayList);
        }

        @x1
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(a, this.c);
            bundle.putStringArrayList(b, new ArrayList<>(this.d));
            return bundle;
        }
    }

    /* compiled from: ShareTarget.java */
    /* loaded from: classes.dex */
    public static class c {
        public static final String a = "androidx.browser.trusted.sharing.KEY_TITLE";
        public static final String b = "androidx.browser.trusted.sharing.KEY_TEXT";
        public static final String c = "androidx.browser.trusted.sharing.KEY_FILES";
        @z1
        public final String d;
        @z1
        public final String e;
        @z1
        public final List<b> f;

        public c(@z1 String str, @z1 String str2, @z1 List<b> list) {
            this.d = str;
            this.e = str2;
            this.f = list;
        }

        @z1
        public static c a(@z1 Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(c);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                for (Bundle bundle2 : parcelableArrayList) {
                    arrayList.add(b.a(bundle2));
                }
            }
            return new c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @x1
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.d);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.e);
            if (this.f != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (b bVar : this.f) {
                    arrayList.add(bVar.b());
                }
                bundle.putParcelableArrayList(c, arrayList);
            }
            return bundle;
        }
    }

    /* compiled from: ShareTarget.java */
    @i2({i2.a.s})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public f7(@x1 String str, @z1 String str2, @z1 String str3, @x1 c cVar) {
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = cVar;
    }

    @z1
    public static f7 a(@x1 Bundle bundle) {
        String string = bundle.getString(a);
        String string2 = bundle.getString(b);
        String string3 = bundle.getString(c);
        c a2 = c.a(bundle.getBundle(d));
        if (string == null || a2 == null) {
            return null;
        }
        return new f7(string, string2, string3, a2);
    }

    @x1
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(a, this.i);
        bundle.putString(b, this.j);
        bundle.putString(c, this.k);
        bundle.putBundle(d, this.l.b());
        return bundle;
    }
}