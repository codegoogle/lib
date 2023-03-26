package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfnf implements Closeable {
    public static zzfnr zza() {
        return new zzfnr();
    }

    public static zzfnr zzb(final int i, zzfnq zzfnqVar) {
        return new zzfnr(new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnd
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnf.zzd(i);
            }
        }, zzfne.zza, zzfnqVar);
    }

    public static zzfnr zzc(zzfpj<Integer> zzfpjVar, zzfpj<Integer> zzfpjVar2, zzfnq zzfnqVar) {
        return new zzfnr(zzfpjVar, zzfpjVar2, zzfnqVar);
    }

    public static /* synthetic */ Integer zzd(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}