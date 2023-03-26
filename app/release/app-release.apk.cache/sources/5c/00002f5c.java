package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(17)
/* loaded from: classes2.dex */
public final class zzxc implements DisplayManager.DisplayListener, zzxa {
    private final DisplayManager zza;
    @z1
    private zzwy zzb;

    private zzxc(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    @z1
    public static zzxa zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(rs2.f.a.v0);
        if (displayManager != null) {
            return new zzxc(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzwy zzwyVar = this.zzb;
        if (zzwyVar == null || i != 0) {
            return;
        }
        zzxe.zzb(zzwyVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwy zzwyVar) {
        this.zzb = zzwyVar;
        this.zza.registerDisplayListener(this, zzeg.zzC(null));
        zzxe.zzb(zzwyVar.zza, zzd());
    }
}