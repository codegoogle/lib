package com.p7700g.p99005;

import java.io.File;

/* compiled from: LogDelegate.java */
/* loaded from: classes2.dex */
public interface jj1 {
    public static final jj1 a = new a();

    /* compiled from: LogDelegate.java */
    /* loaded from: classes2.dex */
    public class a implements jj1 {
        @Override // com.p7700g.p99005.jj1
        public void a(int i, @z1 Throwable th, @x1 String str, @x1 String str2, @z1 Object... objArr) {
        }

        @Override // com.p7700g.p99005.jj1
        @z1
        public File b(@x1 File file) {
            return null;
        }
    }

    void a(int i, @z1 Throwable th, @x1 String str, @x1 String str2, @z1 Object... objArr);

    @z1
    File b(@x1 File file);
}