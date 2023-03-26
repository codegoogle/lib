package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzajb implements Comparable {
    private final zzajm zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    @z1
    @k1("mLock")
    private final zzajf zzf;
    private Integer zzg;
    private zzaje zzh;
    @k1("mLock")
    private boolean zzi;
    @z1
    private zzaik zzj;
    @k1("mLock")
    private zzaja zzk;
    private final zzaip zzl;

    public zzajb(int i, String str, @z1 zzajf zzajfVar) {
        Uri parse;
        String host;
        this.zza = zzajm.zza ? new zzajm() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzajfVar;
        this.zzl = new zzaip();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzajb) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        StringBuilder M = wo1.M("[ ] ", str, " ");
        M.append(n04.t.concat(String.valueOf(hexString)));
        M.append(" NORMAL ");
        M.append(num);
        return M.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    @z1
    public final zzaik zzd() {
        return this.zzj;
    }

    public final zzajb zze(zzaik zzaikVar) {
        this.zzj = zzaikVar;
        return this;
    }

    public final zzajb zzf(zzaje zzajeVar) {
        this.zzh = zzajeVar;
        return this;
    }

    public final zzajb zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public abstract zzajh zzh(zzaix zzaixVar);

    public final String zzj() {
        String str = this.zzc;
        return this.zzb != 0 ? wo1.u(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaij {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzajm.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzajk zzajkVar) {
        zzajf zzajfVar;
        synchronized (this.zze) {
            zzajfVar = this.zzf;
        }
        if (zzajfVar != null) {
            zzajfVar.zza(zzajkVar);
        }
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzaje zzajeVar = this.zzh;
        if (zzajeVar != null) {
            zzajeVar.zzb(this);
        }
        if (zzajm.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaiz(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzaja zzajaVar;
        synchronized (this.zze) {
            zzajaVar = this.zzk;
        }
        if (zzajaVar != null) {
            zzajaVar.zza(this);
        }
    }

    public final void zzs(zzajh zzajhVar) {
        zzaja zzajaVar;
        synchronized (this.zze) {
            zzajaVar = this.zzk;
        }
        if (zzajaVar != null) {
            zzajaVar.zzb(this, zzajhVar);
        }
    }

    public final void zzt(int i) {
        zzaje zzajeVar = this.zzh;
        if (zzajeVar != null) {
            zzajeVar.zzc(this, i);
        }
    }

    public final void zzu(zzaja zzajaVar) {
        synchronized (this.zze) {
            this.zzk = zzajaVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaij {
        return null;
    }

    public final zzaip zzy() {
        return this.zzl;
    }
}