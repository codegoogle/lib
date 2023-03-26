package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.anythink.expressad.a;
import com.anythink.expressad.foundation.d.c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.p7700g.p99005.e31;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmh implements zzfkx {
    private final Object zza;
    private final zzfmi zzb;
    private final zzfmt zzc;
    private final zzfku zzd;

    public zzfmh(@x1 Object obj, @x1 zzfmi zzfmiVar, @x1 zzfmt zzfmtVar, @x1 zzfku zzfkuVar) {
        this.zza = obj;
        this.zzb = zzfmiVar;
        this.zzc = zzfmtVar;
        this.zzd = zzfkuVar;
    }

    @z1
    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzamk zza = zzaml.zza();
        zza.zzc(5);
        zza.zza(zzgji.zzv(bArr));
        return Base64.encodeToString(((zzaml) zza.zzal()).zzaw(), 11);
    }

    @z1
    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    @z1
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put(a.B, view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    @z1
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", v.a);
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put(a.B, view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    @z1
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfmr {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfmr((int) IronSourceConstants.IS_INSTANCE_OPENED, e);
        }
    }

    public final synchronized int zze() throws zzfmr {
        try {
        } catch (Exception e) {
            throw new zzfmr(2006, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfmi zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfmr {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod(c.cd, new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfmr(2003, e);
        }
    }

    public final synchronized boolean zzh() throws zzfmr {
        try {
        } catch (Exception e) {
            throw new zzfmr(2001, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod(e31.b, new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}