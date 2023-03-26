package com.p7700g.p99005;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* compiled from: SingleDocumentFile.java */
@e2(19)
/* loaded from: classes.dex */
public class ju extends gu {
    private Context c;
    private Uri d;

    public ju(@z1 gu guVar, Context context, Uri uri) {
        super(guVar);
        this.c = context;
        this.d = uri;
    }

    @Override // com.p7700g.p99005.gu
    public boolean a() {
        return hu.a(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public boolean b() {
        return hu.b(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public gu c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.gu
    public gu d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.gu
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p7700g.p99005.gu
    public boolean f() {
        return hu.d(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public String k() {
        return hu.f(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public String m() {
        return hu.h(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public Uri n() {
        return this.d;
    }

    @Override // com.p7700g.p99005.gu
    public boolean o() {
        return hu.i(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public boolean q() {
        return hu.j(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public boolean r() {
        return hu.k(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public long s() {
        return hu.l(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public long t() {
        return hu.m(this.c, this.d);
    }

    @Override // com.p7700g.p99005.gu
    public gu[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.gu
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}