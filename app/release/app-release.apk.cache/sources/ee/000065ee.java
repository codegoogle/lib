package com.p7700g.p99005;

import java.util.HashSet;
import java.util.Set;

/* compiled from: LogcatLogger.java */
/* loaded from: classes.dex */
public class xo0 implements ki0 {
    private static final Set<String> a = new HashSet();

    @Override // com.p7700g.p99005.ki0
    public void a(String str, Throwable th) {
        boolean z = ci0.a;
    }

    @Override // com.p7700g.p99005.ki0
    public void b(String str) {
        e(str, null);
    }

    @Override // com.p7700g.p99005.ki0
    public void c(String str) {
        d(str, null);
    }

    @Override // com.p7700g.p99005.ki0
    public void d(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    @Override // com.p7700g.p99005.ki0
    public void e(String str, Throwable th) {
        boolean z = ci0.a;
    }
}