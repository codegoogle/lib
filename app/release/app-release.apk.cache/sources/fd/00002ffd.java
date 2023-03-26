package com.google.android.gms.internal.common;

import com.p7700g.p99005.f14;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzv implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzx zzb;

    public zzv(zzx zzxVar, CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzh;
        zzh = this.zzb.zzh(this.zza);
        return zzh;
    }

    public final String toString() {
        StringBuilder F = wo1.F(f14.u);
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                F.append(zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    F.append((CharSequence) ", ");
                    F.append(zzq.zza(it.next(), ", "));
                }
            }
            F.append(f14.v);
            return F.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}