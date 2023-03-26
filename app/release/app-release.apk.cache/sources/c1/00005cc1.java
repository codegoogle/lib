package com.p7700g.p99005;

import android.content.Context;
import android.net.Uri;
import com.p7700g.p99005.du1;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes2.dex */
public class su1 implements du1<Uri, InputStream> {
    private final Context a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* loaded from: classes2.dex */
    public static class a implements eu1<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Uri, InputStream> c(hu1 hu1Var) {
            return new su1(this.a);
        }
    }

    public su1(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean e(jq1 jq1Var) {
        Long l = (Long) jq1Var.c(hw1.d);
        return l != null && l.longValue() == -1;
    }

    @Override // com.p7700g.p99005.du1
    @z1
    /* renamed from: c */
    public du1.a<InputStream> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        if (dr1.d(i, i2) && e(jq1Var)) {
            return new du1.a<>(new k02(uri), er1.g(this.a, uri));
        }
        return null;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 Uri uri) {
        return dr1.c(uri);
    }
}