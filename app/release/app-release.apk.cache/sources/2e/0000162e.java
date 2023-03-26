package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

/* compiled from: Api18TraceUtils.java */
@e
@TargetApi(18)
/* loaded from: classes2.dex */
public class a {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}