package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfms {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfmt zzc;
    private final zzfku zzd;
    private final zzfkp zze;
    @z1
    private zzfmh zzf;
    private final Object zzg = new Object();

    public zzfms(@x1 Context context, @x1 zzfmt zzfmtVar, @x1 zzfku zzfkuVar, @x1 zzfkp zzfkpVar) {
        this.zzb = context;
        this.zzc = zzfmtVar;
        this.zzd = zzfkuVar;
        this.zze = zzfkpVar;
    }

    private final synchronized Class zzd(@x1 zzfmi zzfmiVar) throws zzfmr {
        String zzk = zzfmiVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfmiVar.zzc())) {
                try {
                    File zzb = zzfmiVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(zzfmiVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new zzfmr((int) AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            }
            throw new zzfmr(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new zzfmr(2026, e2);
        }
    }

    @z1
    public final zzfkx zza() {
        zzfmh zzfmhVar;
        synchronized (this.zzg) {
            zzfmhVar = this.zzf;
        }
        return zzfmhVar;
    }

    @z1
    public final zzfmi zzb() {
        synchronized (this.zzg) {
            zzfmh zzfmhVar = this.zzf;
            if (zzfmhVar != null) {
                return zzfmhVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(@x1 zzfmi zzfmiVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfmh zzfmhVar = new zzfmh(zzd(zzfmiVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfmiVar.zze(), null, new Bundle(), 2), zzfmiVar, this.zzc, this.zzd);
                if (zzfmhVar.zzh()) {
                    int zze = zzfmhVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfmh zzfmhVar2 = this.zzf;
                            if (zzfmhVar2 != null) {
                                try {
                                    zzfmhVar2.zzg();
                                } catch (zzfmr e) {
                                    this.zzd.zzc(e.zza(), -1L, e);
                                }
                            }
                            this.zzf = zzfmhVar;
                        }
                        this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfmr(4001, "ci: " + zze);
                }
                throw new zzfmr(4000, "init failed");
            } catch (Exception e2) {
                throw new zzfmr(2004, e2);
            }
        } catch (zzfmr e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}