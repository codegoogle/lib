package com.google.android.gms.internal.ads;

import com.p7700g.p99005.x1;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazn implements ThreadFactory {
    public final /* synthetic */ String zza = "Loader:ExtractorMediaPeriod";

    public zzazn(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@x1 Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}