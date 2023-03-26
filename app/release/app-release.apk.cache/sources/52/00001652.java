package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;

/* compiled from: NoopSoSource.java */
/* loaded from: classes2.dex */
public class t extends x {
    @Override // com.facebook.soloader.x
    public int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return 1;
    }

    @Override // com.facebook.soloader.x
    public File e(String str) {
        throw new UnsupportedOperationException("unpacking not supported in test mode");
    }
}