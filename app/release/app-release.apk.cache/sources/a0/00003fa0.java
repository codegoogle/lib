package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: LibraryLoader.java */
/* loaded from: classes4.dex */
public class dy5 {
    private static final String a = "pl_droidsonroids_gif";
    @SuppressLint({"StaticFieldLeak"})
    private static Context b;

    private dy5() {
    }

    private static Context a() {
        if (b == null) {
            try {
                b = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return b;
    }

    public static void b(@x1 Context context) {
        b = context.getApplicationContext();
    }

    public static void c() {
        try {
            System.loadLibrary(a);
        } catch (UnsatisfiedLinkError unused) {
            qy5.b(a(), a);
        }
    }
}