package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxf implements zzaxb {
    private final zzaxb[] zza;
    private final ArrayList zzb;
    private zzaxa zzd;
    private zzase zze;
    private zzaxe zzg;
    private final zzasd zzc = new zzasd();
    private int zzf = -1;

    public zzaxf(zzaxb... zzaxbVarArr) {
        this.zza = zzaxbVarArr;
        this.zzb = new ArrayList(Arrays.asList(zzaxbVarArr));
    }

    public static /* bridge */ /* synthetic */ void zzf(zzaxf zzaxfVar, int i, zzase zzaseVar, Object obj) {
        zzaxe zzaxeVar;
        if (zzaxfVar.zzg == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzaseVar.zzg(i2, zzaxfVar.zzc, false);
            }
            int i3 = zzaxfVar.zzf;
            if (i3 == -1) {
                zzaxfVar.zzf = 1;
            } else if (i3 != 1) {
                zzaxeVar = new zzaxe(1);
                zzaxfVar.zzg = zzaxeVar;
            }
            zzaxeVar = null;
            zzaxfVar.zzg = zzaxeVar;
        }
        if (zzaxfVar.zzg != null) {
            return;
        }
        zzaxfVar.zzb.remove(zzaxfVar.zza[i]);
        if (i == 0) {
            zzaxfVar.zze = zzaseVar;
        }
        if (zzaxfVar.zzb.isEmpty()) {
            zzaxfVar.zzd.zzg(zzaxfVar.zze, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zza() throws IOException {
        zzaxe zzaxeVar = this.zzg;
        if (zzaxeVar != null) {
            throw zzaxeVar;
        }
        for (zzaxb zzaxbVar : this.zza) {
            zzaxbVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzb(zzarj zzarjVar, boolean z, zzaxa zzaxaVar) {
        this.zzd = zzaxaVar;
        int i = 0;
        while (true) {
            zzaxb[] zzaxbVarArr = this.zza;
            if (i >= zzaxbVarArr.length) {
                return;
            }
            zzaxbVarArr[i].zzb(zzarjVar, false, new zzaxd(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzc(zzawz zzawzVar) {
        zzaxc zzaxcVar = (zzaxc) zzawzVar;
        int i = 0;
        while (true) {
            zzaxb[] zzaxbVarArr = this.zza;
            if (i >= zzaxbVarArr.length) {
                return;
            }
            zzaxbVarArr[i].zzc(zzaxcVar.zza[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzd() {
        for (zzaxb zzaxbVar : this.zza) {
            zzaxbVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final zzawz zze(int i, zzaym zzaymVar) {
        int length = this.zza.length;
        zzawz[] zzawzVarArr = new zzawz[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzawzVarArr[i2] = this.zza[i2].zze(i, zzaymVar);
        }
        return new zzaxc(zzawzVarArr);
    }
}