package com.p7700g.p99005;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.p7700g.p99005.du1;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: classes2.dex */
public class ku1<Data> implements du1<String, Data> {
    private final du1<Uri, Data> a;

    /* compiled from: StringLoader.java */
    /* loaded from: classes2.dex */
    public static final class a implements eu1<String, AssetFileDescriptor> {
        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        public du1<String, AssetFileDescriptor> c(@x1 hu1 hu1Var) {
            return new ku1(hu1Var.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes2.dex */
    public static class b implements eu1<String, ParcelFileDescriptor> {
        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<String, ParcelFileDescriptor> c(@x1 hu1 hu1Var) {
            return new ku1(hu1Var.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes2.dex */
    public static class c implements eu1<String, InputStream> {
        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<String, InputStream> c(@x1 hu1 hu1Var) {
            return new ku1(hu1Var.d(Uri.class, InputStream.class));
        }
    }

    public ku1(du1<Uri, Data> du1Var) {
        this.a = du1Var;
    }

    @z1
    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<Data> b(@x1 String str, int i, int i2, @x1 jq1 jq1Var) {
        Uri e = e(str);
        if (e == null || !this.a.a(e)) {
            return null;
        }
        return this.a.b(e, i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 String str) {
        return true;
    }
}