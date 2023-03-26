package com.p7700g.p99005;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import com.p7700g.p99005.i2;

/* compiled from: MediaBrowserCompatUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class r10 {
    private r10() {
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.c, -1) == -1 && bundle2.getInt(MediaBrowserCompat.d, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.c, -1) == -1 && bundle.getInt(MediaBrowserCompat.d, -1) == -1 : bundle.getInt(MediaBrowserCompat.c, -1) == bundle2.getInt(MediaBrowserCompat.c, -1) && bundle.getInt(MediaBrowserCompat.d, -1) == bundle2.getInt(MediaBrowserCompat.d, -1);
    }

    public static boolean b(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        int i4 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.c, -1);
        int i5 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.c, -1);
        int i6 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.d, -1);
        int i7 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.d, -1);
        int i8 = Integer.MAX_VALUE;
        if (i4 == -1 || i6 == -1) {
            i = Integer.MAX_VALUE;
            i2 = 0;
        } else {
            i2 = i4 * i6;
            i = (i6 + i2) - 1;
        }
        if (i5 == -1 || i7 == -1) {
            i3 = 0;
        } else {
            i3 = i5 * i7;
            i8 = (i7 + i3) - 1;
        }
        return i >= i3 && i8 >= i2;
    }
}