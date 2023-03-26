package com.p7700g.p99005;

import java.io.File;

/* compiled from: RootToolsInternalMethods.java */
/* loaded from: classes3.dex */
public class hn3 {
    public static boolean a() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            try {
                String str = strArr[i];
                if (new File(str + "su").exists()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}