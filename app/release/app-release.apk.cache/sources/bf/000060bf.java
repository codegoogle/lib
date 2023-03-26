package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: classes2.dex */
public class uu1 implements du1<URL, InputStream> {
    private final du1<wt1, InputStream> a;

    /* compiled from: UrlLoader.java */
    /* loaded from: classes2.dex */
    public static class a implements eu1<URL, InputStream> {
        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<URL, InputStream> c(hu1 hu1Var) {
            return new uu1(hu1Var.d(wt1.class, InputStream.class));
        }
    }

    public uu1(du1<wt1, InputStream> du1Var) {
        this.a = du1Var;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<InputStream> b(@x1 URL url, int i, int i2, @x1 jq1 jq1Var) {
        return this.a.b(new wt1(url), i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 URL url) {
        return true;
    }
}