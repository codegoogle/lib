package com.squareup.moshi;

import com.p7700g.p99005.f14;
import com.p7700g.p99005.h95;
import com.p7700g.p99005.wo1;

/* loaded from: classes3.dex */
public final class JsonScope {
    public static final int CLOSED = 8;
    public static final int DANGLING_NAME = 4;
    public static final int EMPTY_ARRAY = 1;
    public static final int EMPTY_DOCUMENT = 6;
    public static final int EMPTY_OBJECT = 3;
    public static final int NONEMPTY_ARRAY = 2;
    public static final int NONEMPTY_DOCUMENT = 7;
    public static final int NONEMPTY_OBJECT = 5;
    public static final int STREAMING_VALUE = 9;

    private JsonScope() {
    }

    public static String getPath(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder F = wo1.F(h95.c);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                F.append(f14.u);
                F.append(iArr2[i2]);
                F.append(f14.v);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                F.append('.');
                if (strArr[i2] != null) {
                    F.append(strArr[i2]);
                }
            }
        }
        return F.toString();
    }
}