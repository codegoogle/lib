package com.anythink.expressad.foundation.g.f.c;

import com.p7700g.p99005.tm4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements Serializable {
    private byte[] a;
    private InputStream b;
    private File c;
    private long d;
    private String e;
    private String f;
    private String g;

    private b(String str, byte[] bArr, long j, String str2, String str3) {
        this.g = tm4.x;
        this.e = str;
        this.f = str2;
        this.a = bArr;
        this.d = j;
        if (str3 != null) {
            this.g = str3;
        }
    }

    private long g() {
        return this.d;
    }

    public final File a() {
        return this.c;
    }

    public final InputStream b() {
        return this.b;
    }

    public final byte[] c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    private void a(String str) {
        this.e = str;
    }

    private void b(String str) {
        this.f = str;
    }

    private void c(String str) {
        this.g = str;
    }

    public b(String str, File file, String str2) {
        this.g = tm4.x;
        this.e = str;
        this.f = str2;
        try {
            this.b = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.d = file.length();
        this.c = file;
    }

    private b(InputStream inputStream, int i, String str, String str2, String str3) {
        this.g = tm4.x;
        this.e = str;
        this.f = str2;
        this.b = inputStream;
        this.d = i;
        this.g = str3;
    }
}