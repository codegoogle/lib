package com.google.android.gms.internal.ads;

import android.view.View;
import com.anythink.expressad.foundation.g.a;
import com.ironsource.sdk.controller.v;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaow implements zzfmt {
    private final zzfkw zza;
    private final zzfln zzb;
    private final zzapj zzc;
    private final zzaov zzd;
    private final zzaog zze;
    private final zzapl zzf;

    public zzaow(@x1 zzfkw zzfkwVar, @x1 zzfln zzflnVar, @x1 zzapj zzapjVar, @x1 zzaov zzaovVar, @z1 zzaog zzaogVar, @z1 zzapl zzaplVar) {
        this.zza = zzfkwVar;
        this.zzb = zzflnVar;
        this.zzc = zzapjVar;
        this.zzd = zzaovVar;
        this.zze = zzaogVar;
        this.zzf = zzaplVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzaly zzb = this.zzb.zzb();
        hashMap.put(v.a, this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfmt
    public final Map zza() {
        Map zze = zze();
        zze.put("lts", Long.valueOf(this.zzc.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfmt
    public final Map zzb() {
        Map zze = zze();
        zzaly zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzak() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzah()));
        zzaog zzaogVar = this.zze;
        if (zzaogVar != null) {
            zze.put(a.S, Long.valueOf(zzaogVar.zza()));
        }
        zzapl zzaplVar = this.zzf;
        if (zzaplVar != null) {
            zze.put("vs", Long.valueOf(zzaplVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfmt
    public final Map zzc() {
        return zze();
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}