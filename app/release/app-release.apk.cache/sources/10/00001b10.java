package com.google.android.gms.common;

import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import com.p7700g.p99005.x1;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@CheckReturnValue
/* loaded from: classes2.dex */
public class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    public final boolean zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final Throwable zzc;
    public final int zzd;

    private zzx(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzx zzb() {
        return zze;
    }

    public static zzx zzc(@x1 String str) {
        return new zzx(false, 1, 5, str, null);
    }

    public static zzx zzd(@x1 String str, @x1 Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    public static zzx zzf(int i) {
        return new zzx(true, i, 1, null, null);
    }

    public static zzx zzg(int i, int i2, @x1 String str, @Nullable Throwable th) {
        return new zzx(false, i, i2, str, th);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            zza();
        } else {
            zza();
        }
    }
}