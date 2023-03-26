package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.oi;
import com.p7700g.p99005.vj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class tn {
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String a = "font_results";
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int b = -1;
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int c = -2;

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements BaseColumns {
        public static final String a = "file_id";
        public static final String b = "font_ttc_index";
        public static final String c = "font_variation_settings";
        public static final String d = "font_weight";
        public static final String e = "font_italic";
        public static final String f = "result_code";
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        private final int d;
        private final c[] e;

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i, @z1 c[] cVarArr) {
            this.d = i;
            this.e = cVarArr;
        }

        public static b a(int i, @z1 c[] cVarArr) {
            return new b(i, cVarArr);
        }

        public c[] b() {
            return this.e;
        }

        public int c() {
            return this.d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@x1 Uri uri, @p1(from = 0) int i, @p1(from = 1, to = 1000) int i2, boolean z, int i3) {
            this.a = (Uri) jp.l(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public static c a(@x1 Uri uri, @p1(from = 0) int i, @p1(from = 1, to = 1000) int i2, boolean z, int i3) {
            return new c(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        @p1(from = 0)
        public int c() {
            return this.b;
        }

        @x1
        public Uri d() {
            return this.a;
        }

        @p1(from = 1, to = og3.a)
        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = -1;
        public static final int d = -2;
        public static final int e = -3;
        public static final int f = -4;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;

        /* compiled from: FontsContractCompat.java */
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public void a(int i2) {
        }

        public void b(Typeface typeface) {
        }
    }

    private tn() {
    }

    @z1
    public static Typeface a(@x1 Context context, @z1 CancellationSignal cancellationSignal, @x1 c[] cVarArr) {
        return vj.c(context, cancellationSignal, cVarArr, 0);
    }

    @x1
    public static b b(@x1 Context context, @z1 CancellationSignal cancellationSignal, @x1 rn rnVar) throws PackageManager.NameNotFoundException {
        return qn.d(context, rnVar, cancellationSignal);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, rn rnVar, @z1 oi.g gVar, @z1 Handler handler, boolean z, int i, int i2) {
        return f(context, rnVar, i2, z, i, oi.g.getHandler(handler), new vj.a(gVar));
    }

    @z1
    @Deprecated
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    public static ProviderInfo d(@x1 PackageManager packageManager, @x1 rn rnVar, @z1 Resources resources) throws PackageManager.NameNotFoundException {
        return qn.e(packageManager, rnVar, resources);
    }

    @e2(19)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return ck.h(context, cVarArr, cancellationSignal);
    }

    @i2({i2.a.LIBRARY})
    @z1
    public static Typeface f(@x1 Context context, @x1 rn rnVar, int i, boolean z, @p1(from = 0) int i2, @x1 Handler handler, @x1 d dVar) {
        nn nnVar = new nn(dVar, handler);
        if (z) {
            return sn.e(context, rnVar, nnVar, i, i2);
        }
        return sn.d(context, rnVar, i, null, nnVar);
    }

    public static void g(@x1 Context context, @x1 rn rnVar, @x1 d dVar, @x1 Handler handler) {
        nn nnVar = new nn(dVar);
        sn.d(context.getApplicationContext(), rnVar, 0, un.b(handler), nnVar);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void h() {
        sn.f();
    }

    @i2({i2.a.TESTS})
    @r2
    public static void i() {
        sn.f();
    }
}