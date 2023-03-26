package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;

/* compiled from: BaseInfoCollector.java */
/* loaded from: classes2.dex */
public abstract class q91 {
    public static final kj1 a = kj1.b("InfoCollector");

    public abstract void a(@x1 Context context, @x1 Bundle bundle);

    public void b(@x1 Bundle bundle, @x1 String str, @x1 long j) {
        if (bundle.containsKey(str)) {
            return;
        }
        bundle.putLong(str, j);
    }

    public void c(@x1 Bundle bundle, @x1 String str, @x1 String str2) {
        if (bundle.containsKey(str)) {
            return;
        }
        bundle.putString(str, str2);
    }
}