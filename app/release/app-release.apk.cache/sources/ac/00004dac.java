package com.p7700g.p99005;

import android.media.browse.MediaBrowser;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: ParceledListSliceAdapterApi21.java */
@e2(21)
/* loaded from: classes.dex */
public class l {
    private static Constructor a;

    static {
        try {
            a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private l() {
    }

    public static Object a(List<MediaBrowser.MediaItem> list) {
        try {
            return a.newInstance(list);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}