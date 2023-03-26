package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.FormatMethod;
import com.google.errorprone.annotations.FormatString;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class GmsLogger {
    private final String zza;
    @z1
    private final String zzb;

    @KeepForSdk
    public GmsLogger(@x1 String str) {
        this(str, null);
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    @FormatMethod
    private final String zzb(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzb;
        return str2 == null ? format : str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.zza, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(@x1 String str, @x1 String str2) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void e(@x1 String str, @x1 String str2) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    @FormatMethod
    public void efmt(@x1 String str, @FormatString @x1 String str2, @x1 Object... objArr) {
        if (canLog(6)) {
            zzb(str2, objArr);
        }
    }

    @KeepForSdk
    public void i(@x1 String str, @x1 String str2) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void pii(@x1 String str, @x1 String str2) {
    }

    @KeepForSdk
    public void pii(@x1 String str, @x1 String str2, @x1 Throwable th) {
    }

    @KeepForSdk
    public void v(@x1 String str, @x1 String str2) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void w(@x1 String str, @x1 String str2) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    @KeepForSdk
    @FormatMethod
    public void wfmt(@x1 String str, @FormatString @x1 String str2, @x1 Object... objArr) {
        if (canLog(5)) {
            zzb(str2, objArr);
        }
    }

    @KeepForSdk
    public void wtf(@x1 String str, @x1 String str2, @x1 Throwable th) {
        if (canLog(7)) {
            zza(str2);
            Log.wtf(str, zza(str2), th);
        }
    }

    @KeepForSdk
    public GmsLogger(@x1 String str, @z1 String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzb = null;
        } else {
            this.zzb = str2;
        }
    }

    @KeepForSdk
    public void d(@x1 String str, @x1 String str2, @x1 Throwable th) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void e(@x1 String str, @x1 String str2, @x1 Throwable th) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void i(@x1 String str, @x1 String str2, @x1 Throwable th) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void v(@x1 String str, @x1 String str2, @x1 Throwable th) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void w(@x1 String str, @x1 String str2, @x1 Throwable th) {
        if (canLog(5)) {
            zza(str2);
        }
    }
}