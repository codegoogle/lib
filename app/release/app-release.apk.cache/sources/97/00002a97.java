package com.google.android.gms.internal.ads;

import com.p7700g.p99005.f14;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfpd implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzfpg zzb;

    public zzfpd(zzfpg zzfpgVar, CharSequence charSequence) {
        this.zzb = zzfpgVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder F = wo1.F(f14.u);
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                F.append(zzfol.zza(it.next(), ", "));
                while (it.hasNext()) {
                    F.append((CharSequence) ", ");
                    F.append(zzfol.zza(it.next(), ", "));
                }
            }
            F.append(f14.v);
            return F.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}