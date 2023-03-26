package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.p7700g.p99005.z1;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhj implements zzfhh {
    private final Context zza;
    private final int zzl;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzm = 2;
    private int zzn = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private boolean zzj = false;
    private boolean zzk = false;

    public zzfhj(Context context, int i) {
        this.zza = context;
        this.zzl = i;
    }

    public final synchronized zzfhj zzA(int i) {
        this.zzm = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzb(zzfbw zzfbwVar) {
        zzp(zzfbwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzc(String str) {
        zzq(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzd(String str) {
        zzr(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zze(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzf() {
        zzt();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzg() {
        zzu();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final synchronized boolean zzh() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final boolean zzi() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    @z1
    public final synchronized zzfhl zzj() {
        if (this.zzj) {
            return null;
        }
        this.zzj = true;
        if (!this.zzk) {
            zzt();
        }
        if (this.zzc < 0) {
            zzu();
        }
        return new zzfhl(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final /* bridge */ /* synthetic */ zzfhh zzk(int i) {
        zzA(i);
        return this;
    }

    public final synchronized zzfhj zzo(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzdbm zzdbmVar = (zzdbm) iBinder;
        String zzj = zzdbmVar.zzj();
        if (!TextUtils.isEmpty(zzj)) {
            this.zzf = zzj;
        }
        String zzh = zzdbmVar.zzh();
        if (!TextUtils.isEmpty(zzh)) {
            this.zzg = zzh;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfhj zzp(zzfbw zzfbwVar) {
        if (!TextUtils.isEmpty(zzfbwVar.zzb.zzb)) {
            this.zzf = zzfbwVar.zzb.zzb;
        }
        Iterator it = zzfbwVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfbl zzfblVar = (zzfbl) it.next();
            if (!TextUtils.isEmpty(zzfblVar.zzac)) {
                break;
            }
        }
        return this;
    }

    public final synchronized zzfhj zzq(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhj zzr(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhj zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfhj zzt() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzn = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        this.zzk = true;
        return this;
    }

    public final synchronized zzfhj zzu() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        return this;
    }
}