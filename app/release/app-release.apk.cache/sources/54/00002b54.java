package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftt;
import com.p7700g.p99005.wo1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvq extends zzftt.zzi implements Runnable {
    private final Runnable zza;

    public zzfvq(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final String zza() {
        StringBuilder G = wo1.G("task=[");
        G.append(this.zza);
        G.append("]");
        return G.toString();
    }
}