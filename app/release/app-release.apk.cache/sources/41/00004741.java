package com.p7700g.p99005;

import android.content.Context;
import java.io.File;

/* compiled from: ReLinker.java */
/* loaded from: classes.dex */
public class hu0 {

    /* compiled from: ReLinker.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, iu0 iu0Var);
    }

    /* compiled from: ReLinker.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);

        String b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* compiled from: ReLinker.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b(Throwable th);
    }

    /* compiled from: ReLinker.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(String str);
    }

    private hu0() {
    }

    public static iu0 a() {
        return new iu0().c();
    }

    public static void b(Context context, String str) {
        e(context, str, null, null);
    }

    public static void c(Context context, String str, c cVar) {
        e(context, str, null, cVar);
    }

    public static void d(Context context, String str, String str2) {
        e(context, str, str2, null);
    }

    public static void e(Context context, String str, String str2, c cVar) {
        new iu0().i(context, str, str2, cVar);
    }

    public static iu0 f(d dVar) {
        return new iu0().k(dVar);
    }

    public static iu0 g() {
        return new iu0().n();
    }
}