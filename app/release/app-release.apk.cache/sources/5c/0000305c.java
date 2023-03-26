package com.google.android.gms.internal.firebase_messaging;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.p7700g.p99005.av2;
import com.p7700g.p99005.tp2;
import com.p7700g.p99005.up2;
import com.p7700g.p99005.vp2;
import com.p7700g.p99005.zj3;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zza implements up2<av2> {
    public static final zza zza = new zza();
    private static final tp2 zzb;
    private static final tp2 zzc;
    private static final tp2 zzd;
    private static final tp2 zze;
    private static final tp2 zzf;
    private static final tp2 zzg;
    private static final tp2 zzh;
    private static final tp2 zzi;
    private static final tp2 zzj;
    private static final tp2 zzk;
    private static final tp2 zzl;
    private static final tp2 zzm;
    private static final tp2 zzn;
    private static final tp2 zzo;
    private static final tp2 zzp;

    static {
        tp2.b a = tp2.a("projectNumber");
        zzv zzvVar = new zzv();
        zzvVar.zza(1);
        zzb = a.b(zzvVar.zzb()).a();
        tp2.b a2 = tp2.a(zj3.a);
        zzv zzvVar2 = new zzv();
        zzvVar2.zza(2);
        zzc = a2.b(zzvVar2.zzb()).a();
        tp2.b a3 = tp2.a(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID);
        zzv zzvVar3 = new zzv();
        zzvVar3.zza(3);
        zzd = a3.b(zzvVar3.zzb()).a();
        tp2.b a4 = tp2.a("messageType");
        zzv zzvVar4 = new zzv();
        zzvVar4.zza(4);
        zze = a4.b(zzvVar4.zzb()).a();
        tp2.b a5 = tp2.a("sdkPlatform");
        zzv zzvVar5 = new zzv();
        zzvVar5.zza(5);
        zzf = a5.b(zzvVar5.zzb()).a();
        tp2.b a6 = tp2.a("packageName");
        zzv zzvVar6 = new zzv();
        zzvVar6.zza(6);
        zzg = a6.b(zzvVar6.zzb()).a();
        tp2.b a7 = tp2.a("collapseKey");
        zzv zzvVar7 = new zzv();
        zzvVar7.zza(7);
        zzh = a7.b(zzvVar7.zzb()).a();
        tp2.b a8 = tp2.a("priority");
        zzv zzvVar8 = new zzv();
        zzvVar8.zza(8);
        zzi = a8.b(zzvVar8.zzb()).a();
        tp2.b a9 = tp2.a("ttl");
        zzv zzvVar9 = new zzv();
        zzvVar9.zza(9);
        zzj = a9.b(zzvVar9.zzb()).a();
        tp2.b a10 = tp2.a("topic");
        zzv zzvVar10 = new zzv();
        zzvVar10.zza(10);
        zzk = a10.b(zzvVar10.zzb()).a();
        tp2.b a11 = tp2.a("bulkId");
        zzv zzvVar11 = new zzv();
        zzvVar11.zza(11);
        zzl = a11.b(zzvVar11.zzb()).a();
        tp2.b a12 = tp2.a("event");
        zzv zzvVar12 = new zzv();
        zzvVar12.zza(12);
        zzm = a12.b(zzvVar12.zzb()).a();
        tp2.b a13 = tp2.a("analyticsLabel");
        zzv zzvVar13 = new zzv();
        zzvVar13.zza(13);
        zzn = a13.b(zzvVar13.zzb()).a();
        tp2.b a14 = tp2.a("campaignId");
        zzv zzvVar14 = new zzv();
        zzvVar14.zza(14);
        zzo = a14.b(zzvVar14.zzb()).a();
        tp2.b a15 = tp2.a("composerLabel");
        zzv zzvVar15 = new zzv();
        zzvVar15.zza(15);
        zzp = a15.b(zzvVar15.zzb()).a();
    }

    private zza() {
    }

    @Override // com.p7700g.p99005.rp2
    public final /* bridge */ /* synthetic */ void encode(Object obj, vp2 vp2Var) throws IOException {
        av2 av2Var = (av2) obj;
        vp2 vp2Var2 = vp2Var;
        vp2Var2.add(zzb, av2Var.m());
        vp2Var2.add(zzc, av2Var.i());
        vp2Var2.add(zzd, av2Var.h());
        vp2Var2.add(zze, av2Var.j());
        vp2Var2.add(zzf, av2Var.n());
        vp2Var2.add(zzg, av2Var.k());
        vp2Var2.add(zzh, av2Var.d());
        vp2Var2.add(zzi, av2Var.l());
        vp2Var2.add(zzj, av2Var.p());
        vp2Var2.add(zzk, av2Var.o());
        vp2Var2.add(zzl, av2Var.b());
        vp2Var2.add(zzm, av2Var.g());
        vp2Var2.add(zzn, av2Var.a());
        vp2Var2.add(zzo, av2Var.c());
        vp2Var2.add(zzp, av2Var.e());
    }
}