package com.p7700g.p99005;

import android.net.Uri;
import com.p7700g.p99005.du1;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes2.dex */
public class nu1<Data> implements du1<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final du1<wt1, Data> b;

    /* compiled from: UrlUriLoader.java */
    /* loaded from: classes2.dex */
    public static class a implements eu1<Uri, InputStream> {
        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Uri, InputStream> c(hu1 hu1Var) {
            return new nu1(hu1Var.d(wt1.class, InputStream.class));
        }
    }

    public nu1(du1<wt1, Data> du1Var) {
        this.b = du1Var;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<Data> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        return this.b.b(new wt1(uri.toString()), i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 Uri uri) {
        return a.contains(uri.getScheme());
    }
}