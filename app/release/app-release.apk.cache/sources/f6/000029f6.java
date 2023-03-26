package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfje {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfje zza = new zzfje();
    private Context zzb;
    private BroadcastReceiver zzc;
    private boolean zzd;
    private boolean zze;
    private zzfjj zzf;

    private zzfje() {
    }

    public static zzfje zza() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfje zzfjeVar, boolean z) {
        if (zzfjeVar.zze != z) {
            zzfjeVar.zze = z;
            if (zzfjeVar.zzd) {
                zzfjeVar.zzh();
                if (zzfjeVar.zzf != null) {
                    if (zzfjeVar.zzf()) {
                        zzfkf.zzd().zzi();
                    } else {
                        zzfkf.zzd().zzh();
                    }
                }
            }
        }
    }

    private final void zzh() {
        boolean z = this.zze;
        for (zzfir zzfirVar : zzfjc.zza().zzc()) {
            zzfjp zzg = zzfirVar.zzg();
            if (zzg.zzk()) {
                zzfji.zza().zzb(zzg.zza(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void zzc(@x1 Context context) {
        this.zzb = context.getApplicationContext();
    }

    public final void zzd() {
        this.zzc = new zzfjd(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzb.registerReceiver(this.zzc, intentFilter);
        this.zzd = true;
        zzh();
    }

    public final void zze() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.zzb;
        if (context != null && (broadcastReceiver = this.zzc) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.zzc = null;
        }
        this.zzd = false;
        this.zze = false;
        this.zzf = null;
    }

    public final boolean zzf() {
        return !this.zze;
    }

    public final void zzg(zzfjj zzfjjVar) {
        this.zzf = zzfjjVar;
    }
}