package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfj extends zzer {
    public final zzev zzb;
    public final int zzc;

    public zzfj(zzev zzevVar, int i, int i2) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzevVar;
        this.zzc = 1;
    }

    public static zzfj zza(IOException iOException, zzev zzevVar, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfoc.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new zzfi(iOException, zzevVar);
        }
        return new zzfj(iOException, zzevVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzfj(IOException iOException, zzev zzevVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzevVar;
        this.zzc = i2;
    }

    public zzfj(String str, zzev zzevVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzevVar;
        this.zzc = i2;
    }

    public zzfj(String str, @z1 IOException iOException, zzev zzevVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzevVar;
        this.zzc = i2;
    }
}