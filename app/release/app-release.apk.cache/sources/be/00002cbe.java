package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgj {
    private final AudioManager zza;
    private final zzgh zzb;
    @z1
    private zzgi zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgj(Context context, Handler handler, zzgi zzgiVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzgiVar;
        this.zzb = new zzgh(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzgj zzgjVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzgjVar.zzg(3);
                return;
            }
            zzgjVar.zzf(0);
            zzgjVar.zzg(2);
        } else if (i == -1) {
            zzgjVar.zzf(-1);
            zzgjVar.zze();
        } else if (i != 1) {
        } else {
            zzgjVar.zzg(1);
            zzgjVar.zzf(1);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzeg.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        zzgi zzgiVar = this.zzc;
        if (zzgiVar != null) {
            zzii zziiVar = (zzii) zzgiVar;
            boolean zzq = zziiVar.zza.zzq();
            zziiVar.zza.zzau(zzq, i, zzim.zzah(zzq, i));
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzgi zzgiVar = this.zzc;
        if (zzgiVar != null) {
            ((zzii) zzgiVar).zza.zzar();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}