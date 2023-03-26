package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    @x1
    public final String zza;
    @x1
    public final Object zzb;
    @z1
    private Object zzd = null;

    public GservicesValue(@x1 String str, @x1 Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @x1
    @KeepForSdk
    public static GservicesValue<Float> value(@x1 String str, @x1 Float f) {
        return new zzd(str, f);
    }

    @x1
    @KeepForSdk
    public static GservicesValue<Integer> value(@x1 String str, @x1 Integer num) {
        return new zzc(str, num);
    }

    @x1
    @KeepForSdk
    public static GservicesValue<Long> value(@x1 String str, @x1 Long l) {
        return new zzb(str, l);
    }

    @x1
    @KeepForSdk
    public static GservicesValue<String> value(@x1 String str, @x1 String str2) {
        return new zze(str, str2);
    }

    @x1
    @KeepForSdk
    public static GservicesValue<Boolean> value(@x1 String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @x1
    @KeepForSdk
    public final T get() {
        T t = (T) this.zzd;
        if (t != null) {
            return t;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
        }
        try {
            return (T) zza(this.zza);
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            T t2 = (T) zza(this.zza);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return t2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @x1
    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(@x1 T t) {
        this.zzd = t;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    @x1
    public abstract Object zza(@x1 String str);
}