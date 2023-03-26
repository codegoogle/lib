package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.wo1;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawt {
    private final zzatw[] zza;
    private final zzatx zzb;
    private zzatw zzc;

    public zzawt(zzatw[] zzatwVarArr, zzatx zzatxVar) {
        this.zza = zzatwVarArr;
        this.zzb = zzatxVar;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzatw zzb(zzatv zzatvVar, Uri uri) throws IOException, InterruptedException {
        zzatw zzatwVar = this.zzc;
        if (zzatwVar != null) {
            return zzatwVar;
        }
        zzatw[] zzatwVarArr = this.zza;
        int length = zzatwVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzatw zzatwVar2 = zzatwVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzatvVar.zze();
                throw th;
            }
            if (zzatwVar2.zzg(zzatvVar)) {
                this.zzc = zzatwVar2;
                zzatvVar.zze();
                break;
            }
            continue;
            zzatvVar.zze();
            i++;
        }
        zzatw zzatwVar3 = this.zzc;
        if (zzatwVar3 != null) {
            zzatwVar3.zzd(this.zzb);
            return this.zzc;
        }
        throw new zzaxr(wo1.u("None of the available extractors (", zzazo.zzk(this.zza), ") could read the stream."), uri);
    }
}