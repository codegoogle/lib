package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.0E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0E implements Comparator<File> {
    public C0E() {
    }

    private int A00(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A01 */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}