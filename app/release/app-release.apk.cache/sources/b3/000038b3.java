package com.p7700g.p99005;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* compiled from: ColorResourcesLoaderCreator.java */
@e2(30)
/* loaded from: classes3.dex */
public final class ac2 {
    private static final String a = "ac2";

    private ac2() {
    }

    @z1
    public static ResourcesLoader a(@x1 Context context, @x1 Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        try {
            byte[] i = bc2.i(context, map);
            int length = i.length;
            if (i.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    fileOutputStream.write(i);
                    ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                    ResourcesLoader resourcesLoader = new ResourcesLoader();
                    resourcesLoader.addProvider(ResourcesProvider.loadFromTable(dup, null));
                    if (dup != null) {
                        dup.close();
                    }
                    fileOutputStream.close();
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    return resourcesLoader;
                } catch (Throwable th) {
                    th = th;
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileDescriptor = null;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}