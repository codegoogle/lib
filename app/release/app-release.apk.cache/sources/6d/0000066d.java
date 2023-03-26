package com.anythink.core.common.g.a;

import com.anythink.core.common.g.a.c;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    private final int a = 0;
    public int h;
    public String i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Object obj);

        void a(Throwable th);
    }

    public final void a(int i, String str) {
        this.h = i;
        this.i = str;
    }

    public void a(String str, String str2, String str3, int i) {
    }

    public abstract int b();

    public abstract int c();

    public abstract byte[] d();

    public abstract boolean e();

    public final JSONObject f() {
        return com.anythink.core.common.g.c.a(g());
    }

    public int g() {
        return 0;
    }

    public static byte[] a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static JSONObject a() {
        return com.anythink.core.common.g.c.a();
    }

    public final void a(a aVar) {
        com.anythink.core.common.j.b.a.a().a((com.anythink.core.common.j.b.b) new c.AnonymousClass1(this, aVar), 4);
    }
}