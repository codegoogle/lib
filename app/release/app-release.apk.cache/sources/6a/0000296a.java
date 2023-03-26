package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(21)
/* loaded from: classes2.dex */
public final class zzfe {
    /* JADX INFO: Access modifiers changed from: private */
    @e1
    public static boolean zzb(@z1 Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}