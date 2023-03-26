package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrd implements zzst {
    private final zzyy zza;
    @z1
    private zzyr zzb;
    @z1
    private zzys zzc;

    public zzrd(zzyy zzyyVar) {
        this.zza = zzyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zza(zzzr zzzrVar) throws IOException {
        zzyr zzyrVar = this.zzb;
        Objects.requireNonNull(zzyrVar);
        zzys zzysVar = this.zzc;
        Objects.requireNonNull(zzysVar);
        return zzyrVar.zza(zzysVar, zzzrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final long zzb() {
        zzys zzysVar = this.zzc;
        if (zzysVar != null) {
            return zzysVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzc() {
        zzyr zzyrVar = this.zzb;
        if (zzyrVar instanceof zzado) {
            ((zzado) zzyrVar).zze();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzst
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzp zzpVar, Uri uri, Map map, long j, long j2, zzyu zzyuVar) throws IOException {
        zzyl zzylVar = new zzyl(zzpVar, j, j2);
        this.zzc = zzylVar;
        if (this.zzb != null) {
            return;
        }
        zzyr[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        boolean z = false;
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzyr zzyrVar = zzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzcw.zzf((this.zzb != null || zzylVar.zzf() == j) ? true : true);
                    zzylVar.zzj();
                    throw th;
                }
                if (zzyrVar.zzd(zzylVar)) {
                    this.zzb = zzyrVar;
                    zzcw.zzf(true);
                    zzylVar.zzj();
                    break;
                }
                if (this.zzb == null) {
                }
                boolean z2 = true;
                zzcw.zzf(z2);
                zzylVar.zzj();
                i++;
            }
            if (this.zzb == null) {
                throw new zztz(wo1.u("None of the available extractors (", zzeg.zzJ(zzb), ") could read the stream."), uri);
            }
        }
        this.zzb.zzb(zzyuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzf(long j, long j2) {
        zzyr zzyrVar = this.zzb;
        Objects.requireNonNull(zzyrVar);
        zzyrVar.zzc(j, j2);
    }
}