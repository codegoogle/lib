package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.p7700g.p99005.u0;
import com.p7700g.p99005.z1;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzpc {
    public final int zza;
    @z1
    public final zzsa zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpc() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzpc(CopyOnWriteArrayList copyOnWriteArrayList, int i, @z1 zzsa zzsaVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsaVar;
    }

    @u0
    public final zzpc zza(int i, @z1 zzsa zzsaVar) {
        return new zzpc(this.zzc, i, zzsaVar);
    }

    public final void zzb(Handler handler, zzpd zzpdVar) {
        Objects.requireNonNull(zzpdVar);
        this.zzc.add(new zzpb(handler, zzpdVar));
    }

    public final void zzc(zzpd zzpdVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzpb zzpbVar = (zzpb) it.next();
            if (zzpbVar.zzb == zzpdVar) {
                this.zzc.remove(zzpbVar);
            }
        }
    }
}