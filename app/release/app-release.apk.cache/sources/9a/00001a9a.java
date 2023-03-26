package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.p7700g.p99005.f14;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(@x1 String str, @x1 String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder F = wo1.F(f14.u);
            for (String str2 : strArr) {
                if (F.length() > 1) {
                    F.append(",");
                }
                F.append(str2);
            }
            F.append("] ");
            sb = F.toString();
        }
        this.zzb = sb;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    @KeepForSdk
    public void d(@x1 String str, @x1 Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void e(@x1 String str, @x1 Throwable th, @x1 Object... objArr) {
        format(str, objArr);
    }

    @x1
    @KeepForSdk
    public String format(@x1 String str, @x1 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @x1
    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    public void i(@x1 String str, @x1 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    @KeepForSdk
    public void v(@x1 String str, @x1 Throwable th, @x1 Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void w(@x1 String str, @x1 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@x1 String str, @x1 Throwable th, @x1 Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th);
    }

    @KeepForSdk
    public void e(@x1 String str, @x1 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@x1 Throwable th) {
        Log.wtf(this.zza, th);
    }

    @KeepForSdk
    public void v(@x1 String str, @x1 Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}