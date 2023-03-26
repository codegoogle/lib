package com.p7700g.p99005;

import java.io.File;

/* compiled from: FileService.java */
/* loaded from: classes2.dex */
public class cr1 {
    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}