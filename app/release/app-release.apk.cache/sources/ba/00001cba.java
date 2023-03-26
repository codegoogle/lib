package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import com.p7700g.p99005.r2;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzanx {
    @r2
    public volatile Boolean zzb;
    private final zzapc zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    @r2
    public static volatile zzfmw zza = null;
    private static volatile Random zzd = null;

    public zzanx(zzapc zzapcVar) {
        this.zze = zzapcVar;
        zzapcVar.zzk().execute(new zzanw(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzanx.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaku zza2 = zzaky.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfmv zza3 = zza.zza(((zzaky) zza2.zzal()).zzaw());
            zza3.zza(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}