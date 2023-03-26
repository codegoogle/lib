package com.p7700g.p99005;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: ResourceReader.java */
/* loaded from: classes.dex */
public class c81 {
    @x1
    private final Context a;

    public c81(@x1 Context context) {
        this.a = context;
    }

    public String a(@x1 File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String str = new String(o81.a(fileInputStream), Charset.forName("UTF-8"));
            fileInputStream.close();
            return str;
        } catch (IOException unused) {
            return "";
        }
    }

    @x1
    public String b(@d2 int i) throws IOException {
        return d81.e(this.a.getResources(), i);
    }

    public String c(@x1 String str) {
        try {
            return n81.n(this.a.getResources().openRawResource(wn1.a(this.a, str, 0)));
        } catch (Throwable unused) {
            return "";
        }
    }
}