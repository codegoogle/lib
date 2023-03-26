package com.google.android.gms.common.internal;

import com.anythink.expressad.foundation.g.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import com.p7700g.p99005.x1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzb = new LibraryVersion();
    private ConcurrentHashMap zzc = new ConcurrentHashMap();

    @x1
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @x1
    @KeepForSdk
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getVersion(@x1 String str) {
        Object obj;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzc.containsKey(str)) {
            return (String) this.zzc.get(str);
        }
        Properties properties = new Properties();
        Object obj2 = null;
        obj2 = 0;
        obj2 = 0;
        InputStream inputStream = null;
        try {
            try {
                InputStream resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        String property = properties.getProperty(a.h, null);
                        zza.v("LibraryVersion", str + " version is " + property);
                        obj2 = property;
                    } else {
                        zza.w("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                    if (resourceAsStream != null) {
                        IOUtils.closeQuietly(resourceAsStream);
                    }
                } catch (IOException e) {
                    e = e;
                    Object obj3 = obj2;
                    inputStream = resourceAsStream;
                    obj = obj3;
                    zza.e("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    if (inputStream != null) {
                        IOUtils.closeQuietly(inputStream);
                    }
                    obj2 = obj;
                    if (obj2 == 0) {
                    }
                    this.zzc.put(str, obj2);
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    obj2 = resourceAsStream;
                    if (obj2 != null) {
                        IOUtils.closeQuietly(obj2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                obj = null;
            }
            if (obj2 == 0) {
                zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                obj2 = "UNKNOWN";
            }
            this.zzc.put(str, obj2);
            return obj2;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}