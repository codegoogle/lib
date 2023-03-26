package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzer extends IOException {
    public final int zza;

    public zzer(int i) {
        this.zza = i;
    }

    public zzer(@z1 String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzer(@z1 String str, @z1 Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzer(@z1 Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}