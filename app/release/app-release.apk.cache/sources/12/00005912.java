package com.p7700g.p99005;

import android.content.Context;
import java.io.File;

/* compiled from: ReLinker.java */
/* loaded from: classes4.dex */
public class qy5 {

    /* compiled from: ReLinker.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, ry5 ry5Var);
    }

    /* compiled from: ReLinker.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);

        String b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* compiled from: ReLinker.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a();

        void b(Throwable th);
    }

    /* compiled from: ReLinker.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a(String str);
    }

    private qy5() {
    }

    public static ry5 a() {
        return new ry5().c();
    }

    public static void b(Context context, String str) {
        d(context, str, null, null);
    }

    public static void c(Context context, String str, String str2) {
        d(context, str, str2, null);
    }

    public static void d(Context context, String str, String str2, c cVar) {
        new ry5().h(context, str, str2, cVar);
    }

    public static void e(Context context, String str, c cVar) {
        d(context, str, null, cVar);
    }

    public static ry5 f(d dVar) {
        return new ry5().k(dVar);
    }

    public static ry5 g() {
        return new ry5().n();
    }
}