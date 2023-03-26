package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzakm extends zzgqf implements Closeable {
    private static final zzgqm zza = zzgqm.zzb(zzakm.class);

    public zzakm(zzgqg zzgqgVar, zzakl zzaklVar) throws IOException {
        zzf(zzgqgVar, zzgqgVar.zzc(), zzaklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgqf
    public final String toString() {
        String obj = this.zzd.toString();
        return wo1.D(new StringBuilder(String.valueOf(obj).length() + 7), "model(", obj, ")");
    }
}