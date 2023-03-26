package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.p7700g.p99005.u0;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zziw implements Handler.Callback, zzrx, zzvl, zzjl, zzgq, zzjo {
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    @z1
    private zziv zzG;
    private long zzH;
    private int zzI;
    private boolean zzJ;
    @z1
    private zzgt zzK;
    private final zzhp zzM;
    private final zzgo zzN;
    private final zzjt[] zza;
    private final Set zzb;
    private final zzju[] zzc;
    private final zzvm zzd;
    private final zzvn zze;
    private final zzja zzf;
    private final zzvu zzg;
    private final zzdg zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzch zzk;
    private final zzcf zzl;
    private final long zzm;
    private final zzgr zzn;
    private final ArrayList zzo;
    private final zzcx zzp;
    private final zzjf zzq;
    private final zzjm zzr;
    private zzjw zzs;
    private zzjn zzt;
    private zziu zzu;
    private boolean zzv;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private int zzA = 0;
    private boolean zzB = false;
    private boolean zzw = false;
    private long zzL = -9223372036854775807L;

    public zziw(zzjt[] zzjtVarArr, zzvm zzvmVar, zzvn zzvnVar, zzja zzjaVar, zzvu zzvuVar, int i, boolean z, zzkh zzkhVar, zzjw zzjwVar, zzgo zzgoVar, long j, boolean z2, Looper looper, zzcx zzcxVar, zzhp zzhpVar, zzmu zzmuVar, byte[] bArr) {
        this.zzM = zzhpVar;
        this.zza = zzjtVarArr;
        this.zzd = zzvmVar;
        this.zze = zzvnVar;
        this.zzf = zzjaVar;
        this.zzg = zzvuVar;
        this.zzs = zzjwVar;
        this.zzN = zzgoVar;
        this.zzp = zzcxVar;
        this.zzm = zzjaVar.zza();
        zzjaVar.zzf();
        zzjn zzh = zzjn.zzh(zzvnVar);
        this.zzt = zzh;
        this.zzu = new zziu(zzh);
        int length = zzjtVarArr.length;
        this.zzc = new zzju[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzjtVarArr[i2].zzq(i2, zzmuVar);
            this.zzc[i2] = zzjtVarArr[i2].zzj();
        }
        this.zzn = new zzgr(this, zzcxVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzch();
        this.zzl = new zzcf();
        zzvmVar.zzm(this, zzvuVar);
        this.zzJ = true;
        Handler handler = new Handler(looper);
        this.zzq = new zzjf(zzkhVar, handler);
        this.zzr = new zzjm(this, zzkhVar, handler, zzmuVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.zzj = looper2;
        this.zzh = zzcxVar.zzb(looper2, this);
    }

    private final void zzA(zzjt zzjtVar) throws zzgt {
        if (zzac(zzjtVar)) {
            this.zzn.zzd(zzjtVar);
            zzaj(zzjtVar);
            zzjtVar.zzn();
            this.zzF--;
        }
    }

    private final void zzB() throws zzgt {
        int length = this.zza.length;
        zzC(new boolean[2]);
    }

    private final void zzC(boolean[] zArr) throws zzgt {
        zzjc zze = this.zzq.zze();
        zzvn zzi = zze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzA();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 < 2) {
                if (zzi.zzb(i2)) {
                    boolean z = zArr[i2];
                    zzjt zzjtVar = this.zza[i2];
                    if (!zzac(zzjtVar)) {
                        zzjc zze2 = this.zzq.zze();
                        boolean z2 = zze2 == this.zzq.zzd();
                        zzvn zzi2 = zze2.zzi();
                        zzjv zzjvVar = zzi2.zzb[i2];
                        zzad[] zzah = zzah(zzi2.zzc[i2]);
                        boolean z3 = zzaf() && this.zzt.zze == 3;
                        boolean z4 = !z && z3;
                        this.zzF++;
                        this.zzb.add(zzjtVar);
                        zzjtVar.zzo(zzjvVar, zzah, zze2.zzc[i2], this.zzH, z4, z2, zze2.zzf(), zze2.zze());
                        zzjtVar.zzp(11, new zzip(this));
                        this.zzn.zze(zzjtVar);
                        if (z3) {
                            zzjtVar.zzE();
                        }
                    }
                }
                i2++;
            } else {
                zze.zzg = true;
                return;
            }
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzgt zzc = zzgt.zzc(iOException, i);
        zzjc zzd = this.zzq.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzdn.zza("ExoPlayerImplInternal", "Playback error", zzc);
        zzU(false, false);
        this.zzt = this.zzt.zze(zzc);
    }

    private final void zzE(boolean z) {
        zzsa zzsaVar;
        long zzc;
        zzjc zzc2 = this.zzq.zzc();
        if (zzc2 == null) {
            zzsaVar = this.zzt.zzb;
        } else {
            zzsaVar = zzc2.zzf.zza;
        }
        boolean z2 = !this.zzt.zzk.equals(zzsaVar);
        if (z2) {
            this.zzt = this.zzt.zza(zzsaVar);
        }
        zzjn zzjnVar = this.zzt;
        if (zzc2 == null) {
            zzc = zzjnVar.zzs;
        } else {
            zzc = zzc2.zzc();
        }
        zzjnVar.zzq = zzc;
        this.zzt.zzr = zzt();
        if ((z2 || z) && zzc2 != null && zzc2.zzd) {
            zzX(zzc2.zzh(), zzc2.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:270:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x03a8  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzcf] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.zziv] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.zzci] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.zzci] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzF(zzci zzciVar, boolean z) throws zzgt {
        long j;
        zzsa zzsaVar;
        zzjf zzjfVar;
        int i;
        Object obj;
        long j2;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        long j3;
        zzsa zzh;
        boolean z6;
        long j4;
        zzsa zzsaVar2;
        boolean z7;
        boolean z8;
        zziw zziwVar;
        long j5;
        boolean z9;
        int i5;
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        boolean z13;
        long j6;
        boolean z14;
        boolean z15;
        zziv zzivVar;
        long j7;
        zzjn zzjnVar = this.zzt;
        zziv zzivVar2 = this.zzG;
        zzjf zzjfVar2 = this.zzq;
        int i7 = this.zzA;
        boolean z16 = this.zzB;
        zzch zzchVar = this.zzk;
        ?? r14 = this.zzl;
        boolean z17 = true;
        if (zzciVar.zzo()) {
            zzsaVar2 = zzjn.zzi();
            zziwVar = this;
            j4 = -9223372036854775807;
            z7 = false;
            z9 = true;
            z8 = false;
            z13 = -1;
            j5 = 0;
        } else {
            zzsa zzsaVar3 = zzjnVar.zzb;
            Object obj2 = zzsaVar3.zza;
            boolean zzae = zzae(zzjnVar, r14);
            if (!zzjnVar.zzb.zzb() && !zzae) {
                j = zzjnVar.zzs;
            } else {
                j = zzjnVar.zzc;
            }
            long j8 = j;
            if (zzivVar2 != null) {
                zzsaVar = zzsaVar3;
                zzjfVar = zzjfVar2;
                i = -1;
                Pair zzy = zzy(zzciVar, zzivVar2, true, i7, z16, zzchVar, r14);
                if (zzy == null) {
                    i6 = zzciVar.zzg(z16);
                    j2 = j8;
                    z5 = true;
                    z11 = false;
                    z12 = false;
                } else {
                    if (zzivVar2.zzc == -9223372036854775807L) {
                        i6 = zzciVar.zzn(zzy.first, r14).zzd;
                        j2 = j8;
                        z10 = false;
                    } else {
                        obj2 = zzy.first;
                        j2 = ((Long) zzy.second).longValue();
                        z10 = true;
                        i6 = -1;
                    }
                    z11 = zzjnVar.zze == 4;
                    z12 = z10;
                    z5 = false;
                }
                z2 = z11;
                i2 = i6;
                z4 = z12;
            } else {
                zzsaVar = zzsaVar3;
                zzjfVar = zzjfVar2;
                i = -1;
                if (zzjnVar.zza.zzo()) {
                    i3 = zzciVar.zzg(z16);
                } else if (zzciVar.zza(obj2) == -1) {
                    Object zze = zze(zzchVar, r14, i7, z16, obj2, zzjnVar.zza, zzciVar);
                    if (zze == null) {
                        i4 = zzciVar.zzg(z16);
                        z5 = true;
                    } else {
                        i4 = zzciVar.zzn(zze, r14).zzd;
                        z5 = false;
                    }
                    i2 = i4;
                    j2 = j8;
                    z2 = false;
                    z4 = false;
                } else if (j8 == -9223372036854775807L) {
                    i3 = zzciVar.zzn(obj2, r14).zzd;
                } else if (zzae) {
                    zzjnVar.zza.zzn(zzsaVar.zza, r14);
                    if (zzjnVar.zza.zze(r14.zzd, zzchVar, 0L).zzo == zzjnVar.zza.zza(zzsaVar.zza)) {
                        Pair zzl = zzciVar.zzl(zzchVar, r14, zzciVar.zzn(obj2, r14).zzd, j8);
                        obj2 = zzl.first;
                        j2 = ((Long) zzl.second).longValue();
                    } else {
                        j2 = j8;
                    }
                    obj = obj2;
                    i2 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                    if (i2 == i) {
                        Pair zzl2 = zzciVar.zzl(zzchVar, r14, i2, -9223372036854775807L);
                        obj = zzl2.first;
                        j3 = ((Long) zzl2.second).longValue();
                        j2 = -9223372036854775807L;
                    } else {
                        j3 = j2;
                    }
                    zzh = zzjfVar.zzh(zzciVar, obj, j3);
                    int i8 = zzh.zze;
                    z6 = (zzsaVar.zza.equals(obj) || zzsaVar.zzb() || zzh.zzb() || !(i8 != i || ((i5 = zzsaVar.zze) != i && i8 >= i5))) ? false : true;
                    zzcf zzn = zzciVar.zzn(obj, r14);
                    if (!zzae && j8 == j2 && zzsaVar.zza.equals(zzh.zza)) {
                        if (zzsaVar.zzb()) {
                            zzn.zzl(zzsaVar.zzb);
                        }
                        if (zzh.zzb()) {
                            zzn.zzl(zzh.zzb);
                        }
                    }
                    if (true == z6) {
                        zzh = zzsaVar;
                    }
                    if (zzh.zzb()) {
                        if (zzh.equals(zzsaVar)) {
                            j3 = zzjnVar.zzs;
                        } else {
                            zzciVar.zzn(zzh.zza, r14);
                            if (zzh.zzc == r14.zze(zzh.zzb)) {
                                r14.zzi();
                            }
                            j3 = 0;
                        }
                    }
                    j4 = j2;
                    zzsaVar2 = zzh;
                    z7 = z2;
                    z17 = z3;
                    z8 = z4;
                    zziwVar = this;
                    j5 = j3;
                    z9 = true;
                    z13 = i;
                } else {
                    obj = obj2;
                    j2 = j8;
                    i2 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (i2 == i) {
                    }
                    zzh = zzjfVar.zzh(zzciVar, obj, j3);
                    int i82 = zzh.zze;
                    if (zzsaVar.zza.equals(obj)) {
                    }
                    zzcf zzn2 = zzciVar.zzn(obj, r14);
                    if (!zzae) {
                        if (zzsaVar.zzb()) {
                        }
                        if (zzh.zzb()) {
                        }
                    }
                    if (true == z6) {
                    }
                    if (zzh.zzb()) {
                    }
                    j4 = j2;
                    zzsaVar2 = zzh;
                    z7 = z2;
                    z17 = z3;
                    z8 = z4;
                    zziwVar = this;
                    j5 = j3;
                    z9 = true;
                    z13 = i;
                }
                i2 = i3;
                obj = obj2;
                j2 = j8;
                z2 = false;
                z3 = false;
                z4 = false;
                if (i2 == i) {
                }
                zzh = zzjfVar.zzh(zzciVar, obj, j3);
                int i822 = zzh.zze;
                if (zzsaVar.zza.equals(obj)) {
                }
                zzcf zzn22 = zzciVar.zzn(obj, r14);
                if (!zzae) {
                }
                if (true == z6) {
                }
                if (zzh.zzb()) {
                }
                j4 = j2;
                zzsaVar2 = zzh;
                z7 = z2;
                z17 = z3;
                z8 = z4;
                zziwVar = this;
                j5 = j3;
                z9 = true;
                z13 = i;
            }
            Object obj3 = obj2;
            z3 = z5;
            obj = obj3;
            if (i2 == i) {
            }
            zzh = zzjfVar.zzh(zzciVar, obj, j3);
            int i8222 = zzh.zze;
            if (zzsaVar.zza.equals(obj)) {
            }
            zzcf zzn222 = zzciVar.zzn(obj, r14);
            if (!zzae) {
            }
            if (true == z6) {
            }
            if (zzh.zzb()) {
            }
            j4 = j2;
            zzsaVar2 = zzh;
            z7 = z2;
            z17 = z3;
            z8 = z4;
            zziwVar = this;
            j5 = j3;
            z9 = true;
            z13 = i;
        }
        boolean z18 = (zziwVar.zzt.zzb.equals(zzsaVar2) && j5 == zziwVar.zzt.zzs) ? false : true;
        if (z17) {
            try {
                if (zziwVar.zzt.zze != z9) {
                    zziwVar.zzS(4);
                }
                zziwVar.zzK(false, false, false, z9);
            } catch (Throwable th) {
                th = th;
                j6 = j4;
                z13 = true;
                j4 = 0;
                r14 = 0;
                zzjn zzjnVar2 = zziwVar.zzt;
                zzZ(zzciVar, zzsaVar2, zzjnVar2.zza, zzjnVar2.zzb, z13 != z8 ? -9223372036854775807L : j5);
                if (!z18 || j6 != zziwVar.zzt.zzc) {
                    zzjn zzjnVar3 = zziwVar.zzt;
                    Object obj4 = zzjnVar3.zzb.zza;
                    zzci zzciVar2 = zzjnVar3.zza;
                    zziwVar.zzt = zzz(zzsaVar2, j5, j6, zziwVar.zzt.zzd, (z18 || !z || zzciVar2.zzo() || zzciVar2.zzn(obj4, zziwVar.zzl).zzg) ? false : false, zzciVar.zza(obj4) == -1 ? 4 : 3);
                }
                zzL();
                zziwVar.zzN(zzciVar, zziwVar.zzt.zza);
                zziwVar.zzt = zziwVar.zzt.zzg(zzciVar);
                if (!zzciVar.zzo()) {
                    zziwVar.zzG = r14;
                }
                zziwVar.zzE(j4);
                throw th;
            }
        }
        try {
            if (!z18) {
                zzjf zzjfVar3 = zziwVar.zzq;
                long j9 = zziwVar.zzH;
                zzjc zze2 = zzjfVar3.zze();
                if (zze2 == null) {
                    j6 = j4;
                    j7 = 0;
                } else {
                    long zze3 = zze2.zze();
                    if (zze2.zzd) {
                        j7 = zze3;
                        int i9 = 0;
                        j4 = j4;
                        while (true) {
                            zzjt[] zzjtVarArr = zziwVar.zza;
                            j6 = j4;
                            try {
                                int length = zzjtVarArr.length;
                                if (i9 >= 2) {
                                    break;
                                }
                                if (zzac(zzjtVarArr[i9]) && zziwVar.zza[i9].zzm() == zze2.zzc[i9]) {
                                    long zzf = zziwVar.zza[i9].zzf();
                                    if (zzf == Long.MIN_VALUE) {
                                        j7 = Long.MIN_VALUE;
                                        break;
                                    }
                                    j7 = Math.max(zzf, j7);
                                }
                                i9++;
                                j4 = j6;
                            } catch (Throwable th2) {
                                th = th2;
                                z13 = true;
                                j4 = 0;
                                r14 = 0;
                                zzjn zzjnVar22 = zziwVar.zzt;
                                zzZ(zzciVar, zzsaVar2, zzjnVar22.zza, zzjnVar22.zzb, z13 != z8 ? -9223372036854775807L : j5);
                                if (!z18) {
                                }
                                zzjn zzjnVar32 = zziwVar.zzt;
                                Object obj42 = zzjnVar32.zzb.zza;
                                zzci zzciVar22 = zzjnVar32.zza;
                                zziwVar.zzt = zzz(zzsaVar2, j5, j6, zziwVar.zzt.zzd, (z18 || !z || zzciVar22.zzo() || zzciVar22.zzn(obj42, zziwVar.zzl).zzg) ? false : false, zzciVar.zza(obj42) == -1 ? 4 : 3);
                                zzL();
                                zziwVar.zzN(zzciVar, zziwVar.zzt.zza);
                                zziwVar.zzt = zziwVar.zzt.zzg(zzciVar);
                                if (!zzciVar.zzo()) {
                                }
                                zziwVar.zzE(j4);
                                throw th;
                            }
                        }
                    } else {
                        j6 = j4;
                        j7 = zze3;
                    }
                }
                z15 = false;
                z14 = true;
                zzivVar = null;
                if (!zzjfVar3.zzo(zzciVar, j9, j7)) {
                    zziwVar.zzP(false);
                }
            } else {
                j6 = j4;
                z14 = true;
                z15 = false;
                zzivVar = null;
                if (!zzciVar.zzo()) {
                    for (zzjc zzd = zziwVar.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
                        if (zzd.zzf.zza.equals(zzsaVar2)) {
                            zzd.zzf = zziwVar.zzq.zzg(zzciVar, zzd.zzf);
                            zzd.zzq();
                        }
                    }
                    j5 = zziwVar.zzv(zzsaVar2, j5, z7);
                }
            }
            zzjn zzjnVar4 = zziwVar.zzt;
            zzZ(zzciVar, zzsaVar2, zzjnVar4.zza, zzjnVar4.zzb, z14 != z8 ? -9223372036854775807L : j5);
            if (z18 || j6 != zziwVar.zzt.zzc) {
                zzjn zzjnVar5 = zziwVar.zzt;
                Object obj5 = zzjnVar5.zzb.zza;
                zzci zzciVar3 = zzjnVar5.zza;
                zziwVar.zzt = zzz(zzsaVar2, j5, j6, zziwVar.zzt.zzd, (!z18 || !z || zzciVar3.zzo() || zzciVar3.zzn(obj5, zziwVar.zzl).zzg) ? false : false, zzciVar.zza(obj5) == -1 ? 4 : 3);
            }
            zzL();
            zziwVar.zzN(zzciVar, zziwVar.zzt.zza);
            zziwVar.zzt = zziwVar.zzt.zzg(zzciVar);
            if (!zzciVar.zzo()) {
                zziwVar.zzG = zzivVar;
            }
            zziwVar.zzE(z15);
        } catch (Throwable th3) {
            th = th3;
            zzjn zzjnVar222 = zziwVar.zzt;
            zzZ(zzciVar, zzsaVar2, zzjnVar222.zza, zzjnVar222.zzb, z13 != z8 ? -9223372036854775807L : j5);
            if (!z18) {
            }
            zzjn zzjnVar322 = zziwVar.zzt;
            Object obj422 = zzjnVar322.zzb.zza;
            zzci zzciVar222 = zzjnVar322.zza;
            zziwVar.zzt = zzz(zzsaVar2, j5, j6, zziwVar.zzt.zzd, (z18 || !z || zzciVar222.zzo() || zzciVar222.zzn(obj422, zziwVar.zzl).zzg) ? false : false, zzciVar.zza(obj422) == -1 ? 4 : 3);
            zzL();
            zziwVar.zzN(zzciVar, zziwVar.zzt.zza);
            zziwVar.zzt = zziwVar.zzt.zzg(zzciVar);
            if (!zzciVar.zzo()) {
            }
            zziwVar.zzE(j4);
            throw th;
        }
    }

    private final void zzG(zzbt zzbtVar, boolean z) throws zzgt {
        zzH(zzbtVar, zzbtVar.zzc, true, z);
    }

    private final void zzH(zzbt zzbtVar, float f, boolean z, boolean z2) throws zzgt {
        int i;
        zziw zziwVar = this;
        if (z) {
            if (z2) {
                zziwVar.zzu.zza(1);
            }
            zzjn zzjnVar = zziwVar.zzt;
            zziwVar = this;
            zziwVar.zzt = new zzjn(zzjnVar.zza, zzjnVar.zzb, zzjnVar.zzc, zzjnVar.zzd, zzjnVar.zze, zzjnVar.zzf, zzjnVar.zzg, zzjnVar.zzh, zzjnVar.zzi, zzjnVar.zzj, zzjnVar.zzk, zzjnVar.zzl, zzjnVar.zzm, zzbtVar, zzjnVar.zzq, zzjnVar.zzr, zzjnVar.zzs, zzjnVar.zzo, zzjnVar.zzp);
        }
        float f2 = zzbtVar.zzc;
        zzjc zzd = zziwVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzd == null) {
                break;
            }
            zzvg[] zzvgVarArr = zzd.zzi().zzc;
            int length = zzvgVarArr.length;
            while (i < length) {
                zzvg zzvgVar = zzvgVarArr[i];
                i++;
            }
            zzd = zzd.zzg();
        }
        zzjt[] zzjtVarArr = zziwVar.zza;
        int length2 = zzjtVarArr.length;
        while (i < 2) {
            zzjt zzjtVar = zzjtVarArr[i];
            if (zzjtVar != null) {
                zzjtVar.zzD(f, zzbtVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long zze;
        long j;
        boolean zzg;
        if (zzab()) {
            zzjc zzc = this.zzq.zzc();
            long zzu = zzu(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzH;
                j = zzc.zze();
            } else {
                zze = this.zzH - zzc.zze();
                j = zzc.zzf.zzb;
            }
            zzg = this.zzf.zzg(zze - j, zzu, this.zzn.zzc().zzc);
        } else {
            zzg = false;
        }
        this.zzz = zzg;
        if (zzg) {
            this.zzq.zzc().zzk(this.zzH);
        }
        zzW();
    }

    private final void zzJ() {
        boolean z;
        this.zzu.zzc(this.zzt);
        z = this.zzu.zzg;
        if (z) {
            zzhp zzhpVar = this.zzM;
            zzhpVar.zza.zzT(this.zzu);
            this.zzu = new zziu(this.zzt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzK(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        zzsa zzsaVar;
        long j2;
        long j3;
        boolean z5;
        this.zzh.zze(2);
        this.zzK = null;
        this.zzy = false;
        this.zzn.zzi();
        this.zzH = 1000000000000L;
        zzjt[] zzjtVarArr = this.zza;
        int length = zzjtVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzA(zzjtVarArr[i]);
            } catch (zzgt | RuntimeException e) {
                zzdn.zza("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzjt[] zzjtVarArr2 = this.zza;
            int length2 = zzjtVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzjt zzjtVar = zzjtVarArr2[i2];
                if (this.zzb.remove(zzjtVar)) {
                    try {
                        zzjtVar.zzA();
                    } catch (RuntimeException e2) {
                        zzdn.zza("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzF = 0;
        zzjn zzjnVar = this.zzt;
        zzsa zzsaVar2 = zzjnVar.zzb;
        long j4 = zzjnVar.zzs;
        if (!this.zzt.zzb.zzb() && !zzae(this.zzt, this.zzl)) {
            j = this.zzt.zzs;
        } else {
            j = this.zzt.zzc;
        }
        if (z2) {
            this.zzG = null;
            Pair zzx = zzx(this.zzt.zza);
            zzsa zzsaVar3 = (zzsa) zzx.first;
            long longValue = ((Long) zzx.second).longValue();
            if (!zzsaVar3.equals(this.zzt.zzb)) {
                z5 = true;
                zzsaVar = zzsaVar3;
                j2 = longValue;
                j3 = -9223372036854775807L;
                this.zzq.zzi();
                this.zzz = false;
                zzjn zzjnVar2 = this.zzt;
                zzci zzciVar = zzjnVar2.zza;
                int i3 = zzjnVar2.zze;
                zzgt zzgtVar = z4 ? null : zzjnVar2.zzf;
                zzty zztyVar = !z5 ? zzty.zza : zzjnVar2.zzh;
                zzvn zzvnVar = !z5 ? this.zze : zzjnVar2.zzi;
                List zzo = !z5 ? zzfrj.zzo() : zzjnVar2.zzj;
                zzjn zzjnVar3 = this.zzt;
                this.zzt = new zzjn(zzciVar, zzsaVar, j3, j2, i3, zzgtVar, false, zztyVar, zzvnVar, zzo, zzsaVar, zzjnVar3.zzl, zzjnVar3.zzm, zzjnVar3.zzn, j2, 0L, j2, this.zzE, false);
                if (z3) {
                    return;
                }
                this.zzr.zzg();
                return;
            }
            zzsaVar = zzsaVar3;
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            zzsaVar = zzsaVar2;
            j2 = j4;
            j3 = j;
        }
        z5 = false;
        this.zzq.zzi();
        this.zzz = false;
        zzjn zzjnVar22 = this.zzt;
        zzci zzciVar2 = zzjnVar22.zza;
        int i32 = zzjnVar22.zze;
        zzgt zzgtVar2 = z4 ? null : zzjnVar22.zzf;
        zzty zztyVar2 = !z5 ? zzty.zza : zzjnVar22.zzh;
        zzvn zzvnVar2 = !z5 ? this.zze : zzjnVar22.zzi;
        List zzo2 = !z5 ? zzfrj.zzo() : zzjnVar22.zzj;
        zzjn zzjnVar32 = this.zzt;
        this.zzt = new zzjn(zzciVar2, zzsaVar, j3, j2, i32, zzgtVar2, false, zztyVar2, zzvnVar2, zzo2, zzsaVar, zzjnVar32.zzl, zzjnVar32.zzm, zzjnVar32.zzn, j2, 0L, j2, this.zzE, false);
        if (z3) {
        }
    }

    private final void zzL() {
        zzjc zzd = this.zzq.zzd();
        boolean z = false;
        if (zzd != null && zzd.zzf.zzh && this.zzw) {
            z = true;
        }
        this.zzx = z;
    }

    private final void zzM(long j) throws zzgt {
        zzvg[] zzvgVarArr;
        zzjc zzd = this.zzq.zzd();
        long zze = zzd == null ? j + 1000000000000L : j + zzd.zze();
        this.zzH = zze;
        this.zzn.zzf(zze);
        zzjt[] zzjtVarArr = this.zza;
        int length = zzjtVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzjt zzjtVar = zzjtVarArr[i];
            if (zzac(zzjtVar)) {
                zzjtVar.zzB(this.zzH);
            }
        }
        for (zzjc zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzvg zzvgVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzN(zzci zzciVar, zzci zzciVar2) {
        if (zzciVar.zzo() && zzciVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        Object obj = ((zzit) this.zzo.get(size)).zzb;
        int i = zzeg.zza;
        throw null;
    }

    private final void zzO(long j, long j2) {
        this.zzh.zze(2);
        this.zzh.zzi(2, j + j2);
    }

    private final void zzP(boolean z) throws zzgt {
        zzsa zzsaVar = this.zzq.zzd().zzf.zza;
        long zzw = zzw(zzsaVar, this.zzt.zzs, true, false);
        if (zzw != this.zzt.zzs) {
            zzjn zzjnVar = this.zzt;
            this.zzt = zzz(zzsaVar, zzw, zzjnVar.zzc, zzjnVar.zzd, z, 5);
        }
    }

    private final void zzQ(zzjq zzjqVar) throws zzgt {
        if (zzjqVar.zzb() == this.zzj) {
            zzai(zzjqVar);
            int i = this.zzt.zze;
            if (i == 3 || i == 2) {
                this.zzh.zzh(2);
                return;
            }
            return;
        }
        this.zzh.zzb(15, zzjqVar).zza();
    }

    private final void zzR(boolean z, int i, boolean z2, int i2) throws zzgt {
        zzvg[] zzvgVarArr;
        this.zzu.zza(z2 ? 1 : 0);
        this.zzu.zzb(i2);
        this.zzt = this.zzt.zzd(z, i);
        this.zzy = false;
        for (zzjc zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzvg zzvgVar : zzd.zzi().zzc) {
            }
        }
        if (!zzaf()) {
            zzV();
            zzY();
            return;
        }
        int i3 = this.zzt.zze;
        if (i3 == 3) {
            zzT();
            this.zzh.zzh(2);
        } else if (i3 == 2) {
            this.zzh.zzh(2);
        }
    }

    private final void zzS(int i) {
        zzjn zzjnVar = this.zzt;
        if (zzjnVar.zze != i) {
            if (i != 2) {
                this.zzL = -9223372036854775807L;
            }
            this.zzt = zzjnVar.zzf(i);
        }
    }

    private final void zzT() throws zzgt {
        this.zzy = false;
        this.zzn.zzh();
        zzjt[] zzjtVarArr = this.zza;
        int length = zzjtVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzjt zzjtVar = zzjtVarArr[i];
            if (zzac(zzjtVar)) {
                zzjtVar.zzE();
            }
        }
    }

    private final void zzU(boolean z, boolean z2) {
        zzK(z || !this.zzC, false, true, false);
        this.zzu.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzS(1);
    }

    private final void zzV() throws zzgt {
        this.zzn.zzi();
        zzjt[] zzjtVarArr = this.zza;
        int length = zzjtVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzjt zzjtVar = zzjtVarArr[i];
            if (zzac(zzjtVar)) {
                zzaj(zzjtVar);
            }
        }
    }

    private final void zzW() {
        zzjc zzc = this.zzq.zzc();
        boolean z = this.zzz || (zzc != null && zzc.zza.zzp());
        zzjn zzjnVar = this.zzt;
        if (z != zzjnVar.zzg) {
            this.zzt = new zzjn(zzjnVar.zza, zzjnVar.zzb, zzjnVar.zzc, zzjnVar.zzd, zzjnVar.zze, zzjnVar.zzf, z, zzjnVar.zzh, zzjnVar.zzi, zzjnVar.zzj, zzjnVar.zzk, zzjnVar.zzl, zzjnVar.zzm, zzjnVar.zzn, zzjnVar.zzq, zzjnVar.zzr, zzjnVar.zzs, zzjnVar.zzo, zzjnVar.zzp);
        }
    }

    private final void zzX(zzty zztyVar, zzvn zzvnVar) {
        this.zzf.zze(this.zza, zztyVar, zzvnVar.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ac A[LOOP:0: B:95:0x009c->B:102:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x009b -> B:95:0x009c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzY() throws zzgt {
        zzit zzitVar;
        zzjc zzd = this.zzq.zzd();
        if (zzd == null) {
            return;
        }
        long zzd2 = zzd.zzd ? zzd.zza.zzd() : -9223372036854775807L;
        if (zzd2 != -9223372036854775807L) {
            zzM(zzd2);
            if (zzd2 != this.zzt.zzs) {
                zzjn zzjnVar = this.zzt;
                this.zzt = zzz(zzjnVar.zzb, zzd2, zzjnVar.zzc, zzd2, true, 5);
            }
        } else {
            long zzb = this.zzn.zzb(zzd != this.zzq.zze());
            this.zzH = zzb;
            long zze = zzb - zzd.zze();
            long j = this.zzt.zzs;
            if (!this.zzo.isEmpty() && !this.zzt.zzb.zzb()) {
                if (this.zzJ) {
                    j--;
                    this.zzJ = false;
                }
                zzjn zzjnVar2 = this.zzt;
                int zza = zzjnVar2.zza.zza(zzjnVar2.zzb.zza);
                int min = Math.min(this.zzI, this.zzo.size());
                if (min > 0) {
                    zzitVar = (zzit) this.zzo.get(min - 1);
                    while (zzitVar != null && (zza < 0 || (zza == 0 && j < 0))) {
                        min--;
                        if (min <= 0) {
                            zzitVar = (zzit) this.zzo.get(min - 1);
                        }
                    }
                    if (min < this.zzo.size()) {
                        zzit zzitVar2 = (zzit) this.zzo.get(min);
                    }
                    this.zzI = min;
                }
                zzitVar = null;
                while (zzitVar != null) {
                    min--;
                    if (min <= 0) {
                    }
                }
                if (min < this.zzo.size()) {
                }
                this.zzI = min;
            }
            this.zzt.zzs = zze;
        }
        this.zzt.zzq = this.zzq.zzc().zzc();
        this.zzt.zzr = zzt();
        zzjn zzjnVar3 = this.zzt;
        if (zzjnVar3.zzl && zzjnVar3.zze == 3 && zzag(zzjnVar3.zza, zzjnVar3.zzb)) {
            zzjn zzjnVar4 = this.zzt;
            if (zzjnVar4.zzn.zzc == 1.0f) {
                float zza2 = this.zzN.zza(zzs(zzjnVar4.zza, zzjnVar4.zzb.zza, zzjnVar4.zzs), zzt());
                if (this.zzn.zzc().zzc != zza2) {
                    this.zzn.zzg(new zzbt(zza2, this.zzt.zzn.zzd));
                    zzH(this.zzt.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzZ(zzci zzciVar, zzsa zzsaVar, zzci zzciVar2, zzsa zzsaVar2, long j) {
        if (!zzag(zzciVar, zzsaVar)) {
            zzbt zzbtVar = zzsaVar.zzb() ? zzbt.zza : this.zzt.zzn;
            if (this.zzn.zzc().equals(zzbtVar)) {
                return;
            }
            this.zzn.zzg(zzbtVar);
            return;
        }
        zzciVar.zze(zzciVar.zzn(zzsaVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzgo zzgoVar = this.zzN;
        zzau zzauVar = this.zzk.zzk;
        int i = zzeg.zza;
        zzgoVar.zzd(zzauVar);
        if (j != -9223372036854775807L) {
            this.zzN.zze(zzs(zzciVar, zzsaVar.zza, j));
            return;
        }
        if (zzeg.zzS(!zzciVar2.zzo() ? zzciVar2.zze(zzciVar2.zzn(zzsaVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc)) {
            return;
        }
        this.zzN.zze(-9223372036854775807L);
    }

    private final synchronized void zzaa(zzfpj zzfpjVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        for (long j2 = 500; !Boolean.valueOf(((zzin) zzfpjVar).zza.zzv).booleanValue() && j2 > 0; j2 = elapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzab() {
        zzjc zzc = this.zzq.zzc();
        return (zzc == null || zzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzac(zzjt zzjtVar) {
        return zzjtVar.zzbe() != 0;
    }

    private final boolean zzad() {
        zzjc zzd = this.zzq.zzd();
        long j = zzd.zzf.zze;
        if (zzd.zzd) {
            return j == -9223372036854775807L || this.zzt.zzs < j || !zzaf();
        }
        return false;
    }

    private static boolean zzae(zzjn zzjnVar, zzcf zzcfVar) {
        zzsa zzsaVar = zzjnVar.zzb;
        zzci zzciVar = zzjnVar.zza;
        return zzciVar.zzo() || zzciVar.zzn(zzsaVar.zza, zzcfVar).zzg;
    }

    private final boolean zzaf() {
        zzjn zzjnVar = this.zzt;
        return zzjnVar.zzl && zzjnVar.zzm == 0;
    }

    private final boolean zzag(zzci zzciVar, zzsa zzsaVar) {
        if (!zzsaVar.zzb() && !zzciVar.zzo()) {
            zzciVar.zze(zzciVar.zzn(zzsaVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzch zzchVar = this.zzk;
                if (zzchVar.zzi && zzchVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzad[] zzah(zzvg zzvgVar) {
        int zzc = zzvgVar != null ? zzvgVar.zzc() : 0;
        zzad[] zzadVarArr = new zzad[zzc];
        for (int i = 0; i < zzc; i++) {
            zzadVarArr[i] = zzvgVar.zzd(i);
        }
        return zzadVarArr;
    }

    private static final void zzai(zzjq zzjqVar) throws zzgt {
        zzjqVar.zzj();
        try {
            zzjqVar.zzc().zzp(zzjqVar.zza(), zzjqVar.zzg());
        } finally {
            zzjqVar.zzh(true);
        }
    }

    private static final void zzaj(zzjt zzjtVar) throws zzgt {
        if (zzjtVar.zzbe() == 2) {
            zzjtVar.zzF();
        }
    }

    private static final void zzak(zzjt zzjtVar, long j) {
        zzjtVar.zzC();
        if (zzjtVar instanceof zzub) {
            zzub zzubVar = (zzub) zzjtVar;
            throw null;
        }
    }

    @z1
    public static Object zze(zzch zzchVar, zzcf zzcfVar, int i, boolean z, Object obj, zzci zzciVar, zzci zzciVar2) {
        int zza = zzciVar.zza(obj);
        int zzb = zzciVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzciVar.zzi(i3, zzcfVar, zzchVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzciVar2.zza(zzciVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzciVar2.zzf(i4);
    }

    public static final /* synthetic */ void zzr(zzjq zzjqVar) {
        try {
            zzai(zzjqVar);
        } catch (zzgt e) {
            zzdn.zza("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzci zzciVar, Object obj, long j) {
        zzciVar.zze(zzciVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzch zzchVar = this.zzk;
        if (zzchVar.zzf != -9223372036854775807L && zzchVar.zzb()) {
            zzch zzchVar2 = this.zzk;
            if (zzchVar2.zzi) {
                return zzeg.zzv(zzeg.zzt(zzchVar2.zzg) - this.zzk.zzf) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzt.zzq);
    }

    private final long zzu(long j) {
        zzjc zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzH - zzc.zze()));
    }

    private final long zzv(zzsa zzsaVar, long j, boolean z) throws zzgt {
        return zzw(zzsaVar, j, this.zzq.zzd() != this.zzq.zze(), z);
    }

    private final long zzw(zzsa zzsaVar, long j, boolean z, boolean z2) throws zzgt {
        zzV();
        this.zzy = false;
        if (z2 || this.zzt.zze == 3) {
            zzS(2);
        }
        zzjc zzd = this.zzq.zzd();
        zzjc zzjcVar = zzd;
        while (zzjcVar != null && !zzsaVar.equals(zzjcVar.zzf.zza)) {
            zzjcVar = zzjcVar.zzg();
        }
        if (z || zzd != zzjcVar || (zzjcVar != null && zzjcVar.zze() + j < 0)) {
            zzjt[] zzjtVarArr = this.zza;
            int length = zzjtVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzjtVarArr[i]);
            }
            if (zzjcVar != null) {
                while (this.zzq.zzd() != zzjcVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzjcVar);
                zzjcVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzjcVar != null) {
            this.zzq.zzm(zzjcVar);
            if (!zzjcVar.zzd) {
                zzjcVar.zzf = zzjcVar.zzf.zzb(j);
            } else if (zzjcVar.zze) {
                j = zzjcVar.zza.zze(j);
                zzjcVar.zza.zzj(j - this.zzm, false);
            }
            zzM(j);
            zzI();
        } else {
            this.zzq.zzi();
            zzM(j);
        }
        zzE(false);
        this.zzh.zzh(2);
        return j;
    }

    private final Pair zzx(zzci zzciVar) {
        long j = 0;
        if (zzciVar.zzo()) {
            return Pair.create(zzjn.zzi(), 0L);
        }
        Pair zzl = zzciVar.zzl(this.zzk, this.zzl, zzciVar.zzg(this.zzB), -9223372036854775807L);
        zzsa zzh = this.zzq.zzh(zzciVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzciVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzi();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j));
    }

    @z1
    private static Pair zzy(zzci zzciVar, zziv zzivVar, boolean z, int i, boolean z2, zzch zzchVar, zzcf zzcfVar) {
        Pair zzl;
        zzci zzciVar2 = zzivVar.zza;
        if (zzciVar.zzo()) {
            return null;
        }
        zzci zzciVar3 = true == zzciVar2.zzo() ? zzciVar : zzciVar2;
        try {
            zzl = zzciVar3.zzl(zzchVar, zzcfVar, zzivVar.zzb, zzivVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzciVar.equals(zzciVar3)) {
            return zzl;
        }
        if (zzciVar.zza(zzl.first) != -1) {
            return (zzciVar3.zzn(zzl.first, zzcfVar).zzg && zzciVar3.zze(zzcfVar.zzd, zzchVar, 0L).zzo == zzciVar3.zza(zzl.first)) ? zzciVar.zzl(zzchVar, zzcfVar, zzciVar.zzn(zzl.first, zzcfVar).zzd, zzivVar.zzc) : zzl;
        }
        Object zze = zze(zzchVar, zzcfVar, i, z2, zzl.first, zzciVar3, zzciVar);
        if (zze != null) {
            return zzciVar.zzl(zzchVar, zzcfVar, zzciVar.zzn(zze, zzcfVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x00b1  */
    @u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzjn zzz(zzsa zzsaVar, long j, long j2, long j3, boolean z, int i) {
        zzfrj zzfrjVar;
        zzty zztyVar;
        zzvn zzvnVar;
        this.zzJ = (!this.zzJ && j == this.zzt.zzs && zzsaVar.equals(this.zzt.zzb)) ? false : true;
        zzL();
        zzjn zzjnVar = this.zzt;
        zzty zztyVar2 = zzjnVar.zzh;
        zzvn zzvnVar2 = zzjnVar.zzi;
        List list = zzjnVar.zzj;
        if (this.zzr.zzi()) {
            zzjc zzd = this.zzq.zzd();
            if (zzd == null) {
                zztyVar2 = zzty.zza;
            } else {
                zztyVar2 = zzd.zzh();
            }
            if (zzd == null) {
                zzvnVar2 = this.zze;
            } else {
                zzvnVar2 = zzd.zzi();
            }
            zzvg[] zzvgVarArr = zzvnVar2.zzc;
            zzfrg zzfrgVar = new zzfrg();
            boolean z2 = false;
            for (zzvg zzvgVar : zzvgVarArr) {
                if (zzvgVar != null) {
                    zzbl zzblVar = zzvgVar.zzd(0).zzk;
                    if (zzblVar == null) {
                        zzfrgVar.zze(new zzbl(new zzbk[0]));
                    } else {
                        zzfrgVar.zze(zzblVar);
                        z2 = true;
                    }
                }
            }
            zzfrj zzg = z2 ? zzfrgVar.zzg() : zzfrj.zzo();
            if (zzd != null) {
                zzjd zzjdVar = zzd.zzf;
                if (zzjdVar.zzc != j2) {
                    zzd.zzf = zzjdVar.zza(j2);
                }
            }
            zzfrjVar = zzg;
        } else if (!zzsaVar.equals(this.zzt.zzb)) {
            zztyVar = zzty.zza;
            zzvnVar = this.zze;
            zzfrjVar = zzfrj.zzo();
            if (z) {
                this.zzu.zzd(i);
            }
            return this.zzt.zzb(zzsaVar, j, j2, j3, zzt(), zztyVar, zzvnVar, zzfrjVar);
        } else {
            zzfrjVar = list;
        }
        zztyVar = zztyVar2;
        zzvnVar = zzvnVar2;
        if (z) {
        }
        return this.zzt.zzb(zzsaVar, j, j2, j3, zzt(), zztyVar, zzvnVar, zzfrjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1083:0x088a, code lost:
        if (zzad() != false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1120:0x0920, code lost:
        if (r2 == false) goto L491;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x073e A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1010:0x075c A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x07a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1026:0x07b1 A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1027:0x07b8 A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x082f A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1133:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:1159:0x09ce A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1162:0x09da A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1175:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:1182:0x0a19 A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:1270:0x0710 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1287:0x0832 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:975:0x06c9 A[Catch: RuntimeException -> 0x0ac3, IOException -> 0x0aee, zzrc -> 0x0af6, zzer -> 0x0afe, zzbp -> 0x0b06, zzpa -> 0x0b1d, zzgt -> 0x0b26, TryCatch #7 {zzbp -> 0x0b06, zzer -> 0x0afe, zzgt -> 0x0b26, zzpa -> 0x0b1d, zzrc -> 0x0af6, IOException -> 0x0aee, RuntimeException -> 0x0ac3, blocks: (B:659:0x0006, B:660:0x0011, B:663:0x0016, B:664:0x001b, B:668:0x0022, B:670:0x0026, B:675:0x0033, B:676:0x003a, B:677:0x0042, B:681:0x0049, B:683:0x0052, B:685:0x0060, B:686:0x0068, B:687:0x0073, B:688:0x0087, B:689:0x009f, B:690:0x00b5, B:692:0x00c4, B:693:0x00c8, B:694:0x00d9, B:696:0x00e8, B:697:0x0104, B:698:0x0117, B:699:0x0120, B:701:0x0132, B:702:0x0137, B:703:0x0147, B:704:0x0150, B:708:0x0157, B:710:0x015f, B:712:0x0163, B:714:0x0169, B:716:0x0171, B:718:0x0179, B:719:0x017c, B:721:0x0181, B:728:0x018e, B:729:0x018f, B:733:0x0196, B:735:0x01a4, B:736:0x01a7, B:737:0x01ac, B:739:0x01bc, B:740:0x01bf, B:741:0x01c4, B:743:0x01db, B:745:0x01df, B:747:0x01ed, B:751:0x01f7, B:753:0x01fc, B:755:0x0202, B:759:0x020a, B:761:0x0212, B:763:0x0238, B:767:0x0241, B:769:0x0263, B:770:0x0266, B:771:0x026c, B:773:0x0271, B:775:0x0281, B:777:0x0287, B:778:0x028b, B:780:0x028f, B:781:0x0294, B:782:0x0299, B:786:0x02ba, B:788:0x02c5, B:783:0x029d, B:785:0x02a7, B:789:0x02d2, B:791:0x02de, B:792:0x02ea, B:794:0x02f6, B:796:0x031e, B:797:0x033e, B:798:0x0343, B:799:0x0355, B:806:0x0360, B:807:0x0361, B:808:0x0368, B:809:0x0370, B:810:0x0385, B:812:0x03b1, B:872:0x04c4, B:857:0x0492, B:856:0x048e, B:877:0x04d3, B:878:0x04e2, B:813:0x03d2, B:817:0x03e5, B:819:0x03f5, B:821:0x040c, B:823:0x0416, B:879:0x04e3, B:881:0x04f2, B:884:0x04fc, B:886:0x050b, B:888:0x0517, B:890:0x0546, B:891:0x054b, B:892:0x054f, B:894:0x0553, B:896:0x0560, B:965:0x06a2, B:967:0x06aa, B:969:0x06b2, B:972:0x06b7, B:973:0x06c3, B:975:0x06c9, B:977:0x06d1, B:981:0x06e2, B:983:0x06e8, B:984:0x0702, B:986:0x0708, B:988:0x070d, B:990:0x0712, B:992:0x0716, B:994:0x071c, B:996:0x0720, B:998:0x0728, B:1000:0x072e, B:1002:0x0738, B:1005:0x073e, B:1006:0x0741, B:1008:0x074a, B:1010:0x075c, B:1012:0x0764, B:1014:0x076c, B:1018:0x0775, B:1020:0x079c, B:1024:0x07a7, B:1026:0x07b1, B:1027:0x07b8, B:1029:0x07ca, B:1030:0x07e0, B:1032:0x07e6, B:1062:0x0832, B:1035:0x07ef, B:1037:0x07f6, B:1041:0x07ff, B:1043:0x0809, B:1049:0x0816, B:1051:0x081c, B:1061:0x082f, B:1064:0x0842, B:1066:0x0848, B:1070:0x0855, B:1072:0x085d, B:1074:0x0861, B:1075:0x086c, B:1077:0x0872, B:1131:0x0954, B:1134:0x095c, B:1136:0x0961, B:1138:0x0969, B:1140:0x0977, B:1141:0x097e, B:1142:0x0982, B:1144:0x0988, B:1146:0x0991, B:1148:0x0997, B:1150:0x09a2, B:1157:0x09c6, B:1159:0x09ce, B:1160:0x09d4, B:1162:0x09da, B:1166:0x09e8, B:1168:0x09ec, B:1172:0x09fc, B:1180:0x0a13, B:1182:0x0a19, B:1183:0x0a74, B:1171:0x09f4, B:1164:0x09e1, B:1173:0x09ff, B:1177:0x0a06, B:1178:0x0a0c, B:1151:0x09a9, B:1154:0x09b7, B:1155:0x09be, B:1156:0x09bf, B:1078:0x087b, B:1080:0x0882, B:1082:0x0886, B:1110:0x08fe, B:1112:0x090a, B:1087:0x0893, B:1089:0x0897, B:1091:0x08a9, B:1093:0x08b7, B:1095:0x08c3, B:1099:0x08cc, B:1101:0x08d6, B:1107:0x08e1, B:1113:0x090e, B:1115:0x0915, B:1117:0x0919, B:1121:0x0922, B:1123:0x0930, B:1125:0x0938, B:1127:0x0942, B:1128:0x0947, B:1129:0x094c, B:1130:0x0951, B:1063:0x083b, B:1184:0x0a7c, B:899:0x056d, B:901:0x0573, B:904:0x0579, B:907:0x0584, B:909:0x058a, B:912:0x0598, B:914:0x059e, B:915:0x05a6, B:916:0x05a9, B:918:0x05b1, B:920:0x05bf, B:922:0x05fb, B:924:0x0605, B:927:0x0610, B:929:0x0618, B:930:0x061b, B:932:0x061f, B:934:0x0625, B:936:0x062f, B:938:0x0639, B:940:0x064a, B:942:0x0650, B:943:0x065b, B:944:0x065e, B:946:0x0667, B:949:0x066c, B:951:0x0672, B:953:0x067a, B:955:0x0680, B:957:0x0686, B:961:0x0694, B:963:0x069c, B:964:0x069f, B:895:0x055d, B:1185:0x0a84, B:1189:0x0a8b, B:1190:0x0a93, B:1194:0x0ab1), top: B:1252:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzfs] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        zzjc zze;
        long j;
        int i;
        zzjc zzd;
        boolean z2;
        boolean z3;
        zzvg[] zzvgVarArr;
        boolean z4;
        zzjn zzjnVar;
        int i2;
        boolean z5;
        zzjn zzjnVar2;
        boolean z6;
        boolean z7;
        zzjc zze2;
        boolean z8;
        zzjc zzd2;
        zzjc zzg;
        zzjc zza;
        boolean z9;
        int i3;
        zzjd zzf;
        long longValue;
        long j2;
        boolean z10;
        zzsa zzsaVar;
        Throwable th;
        long j3;
        boolean z11;
        long j4;
        zzjn zzjnVar3;
        int i4;
        zzjn zzz;
        int i5;
        int i6;
        List list;
        zztt zzttVar;
        List list2;
        zztt zzttVar2;
        int i7;
        long j5;
        List list3;
        zztt zzttVar3;
        try {
            int i8 = -1;
            switch (message.what) {
                case 0:
                    this.zzu.zza(1);
                    zzK(false, false, false, true);
                    this.zzf.zzb();
                    zzS(true != this.zzt.zza.zzo() ? 2 : 4);
                    this.zzr.zzf(this.zzg);
                    this.zzh.zzh(2);
                    break;
                case 1:
                    zzR(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (!this.zzt.zza.zzo() && this.zzr.zzi()) {
                        this.zzq.zzk(this.zzH);
                        if (this.zzq.zzn() && (zzf = this.zzq.zzf(this.zzH, this.zzt)) != null) {
                            zzjc zzr = this.zzq.zzr(this.zzc, this.zzd, this.zzf.zzi(), this.zzr, zzf, this.zze);
                            zzr.zza.zzl(this, zzf.zzb);
                            if (this.zzq.zzd() == zzr) {
                                zzM(zzf.zzb);
                            }
                            zzE(false);
                        }
                        if (this.zzz) {
                            this.zzz = zzab();
                            zzW();
                        } else {
                            zzI();
                        }
                        zzjc zze3 = this.zzq.zze();
                        if (zze3 != null) {
                            if (zze3.zzg() != null && !this.zzx) {
                                zzjc zze4 = this.zzq.zze();
                                if (zze4.zzd) {
                                    int i9 = 0;
                                    while (true) {
                                        zzjt[] zzjtVarArr = this.zza;
                                        int length = zzjtVarArr.length;
                                        if (i9 < 2) {
                                            zzjt zzjtVar = zzjtVarArr[i9];
                                            zztq zztqVar = zze4.zzc[i9];
                                            if (zzjtVar.zzm() == zztqVar) {
                                                if (zztqVar == null || zzjtVar.zzG()) {
                                                    i9++;
                                                } else {
                                                    zze4.zzg();
                                                    boolean z12 = zze4.zzf.zzf;
                                                }
                                            }
                                        } else if (zze3.zzg().zzd || this.zzH >= zze3.zzg().zzf()) {
                                            zzvn zzi = zze3.zzi();
                                            zzjc zzb = this.zzq.zzb();
                                            zzvn zzi2 = zzb.zzi();
                                            zzci zzciVar = this.zzt.zza;
                                            j = uptimeMillis;
                                            zzZ(zzciVar, zzb.zzf.zza, zzciVar, zze3.zzf.zza, -9223372036854775807L);
                                            if (!zzb.zzd || zzb.zza.zzd() == -9223372036854775807L) {
                                                int i10 = 0;
                                                while (true) {
                                                    int length2 = this.zza.length;
                                                    if (i10 < 2) {
                                                        boolean zzb2 = zzi.zzb(i10);
                                                        boolean zzb3 = zzi2.zzb(i10);
                                                        if (zzb2 && !this.zza[i10].zzH()) {
                                                            this.zzc[i10].zzb();
                                                            zzjv zzjvVar = zzi.zzb[i10];
                                                            zzjv zzjvVar2 = zzi2.zzb[i10];
                                                            if (!zzb3 || !zzjvVar2.equals(zzjvVar)) {
                                                                zzak(this.zza[i10], zzb.zzf());
                                                            }
                                                        }
                                                        i10++;
                                                    }
                                                }
                                            } else {
                                                long zzf2 = zzb.zzf();
                                                zzjt[] zzjtVarArr2 = this.zza;
                                                int length3 = zzjtVarArr2.length;
                                                for (int i11 = 0; i11 < 2; i11++) {
                                                    zzjt zzjtVar2 = zzjtVarArr2[i11];
                                                    if (zzjtVar2.zzm() != null) {
                                                        zzak(zzjtVar2, zzf2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            j = uptimeMillis;
                            if (zze3.zzf.zzi || this.zzx) {
                                int i12 = 0;
                                while (true) {
                                    zzjt[] zzjtVarArr3 = this.zza;
                                    int length4 = zzjtVarArr3.length;
                                    if (i12 < 2) {
                                        zzjt zzjtVar3 = zzjtVarArr3[i12];
                                        zztq zztqVar2 = zze3.zzc[i12];
                                        if (zztqVar2 != null && zzjtVar3.zzm() == zztqVar2 && zzjtVar3.zzG()) {
                                            long j6 = zze3.zzf.zze;
                                            zzak(zzjtVar3, (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? -9223372036854775807L : zze3.zze() + j6);
                                        }
                                        i12++;
                                    }
                                }
                            }
                            zze2 = this.zzq.zze();
                            if (zze2 != null && this.zzq.zzd() != zze2 && !zze2.zzg) {
                                zzjc zze5 = this.zzq.zze();
                                zzvn zzi3 = zze5.zzi();
                                i3 = 0;
                                boolean z13 = false;
                                while (true) {
                                    zzjt[] zzjtVarArr4 = this.zza;
                                    int length5 = zzjtVarArr4.length;
                                    if (i3 >= 2) {
                                        zzjt zzjtVar4 = zzjtVarArr4[i3];
                                        if (zzac(zzjtVar4)) {
                                            zztq zzm = zzjtVar4.zzm();
                                            zztq zztqVar3 = zze5.zzc[i3];
                                            if (!zzi3.zzb(i3) || zzm != zztqVar3) {
                                                if (!zzjtVar4.zzH()) {
                                                    zzjtVar4.zzz(zzah(zzi3.zzc[i3]), zze5.zzc[i3], zze5.zzf(), zze5.zze());
                                                } else if (zzjtVar4.zzM()) {
                                                    zzA(zzjtVar4);
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                        }
                                        i3++;
                                    } else if (!z13) {
                                        zzB();
                                    }
                                }
                            }
                            z8 = false;
                            while (zzaf() && !this.zzx && (zzd2 = this.zzq.zzd()) != null && (zzg = zzd2.zzg()) != null && this.zzH >= zzg.zzf() && zzg.zzg) {
                                if (z8) {
                                    zzJ();
                                }
                                zza = this.zzq.zza();
                                Objects.requireNonNull(zza);
                                if (this.zzt.zzb.zza.equals(zza.zzf.zza.zza)) {
                                    zzsa zzsaVar2 = this.zzt.zzb;
                                    if (zzsaVar2.zzb == i8) {
                                        zzsa zzsaVar3 = zza.zzf.zza;
                                        if (zzsaVar3.zzb == i8 && zzsaVar2.zze != zzsaVar3.zze) {
                                            z9 = true;
                                            zzjd zzjdVar = zza.zzf;
                                            zzsa zzsaVar4 = zzjdVar.zza;
                                            long j7 = zzjdVar.zzb;
                                            this.zzt = zzz(zzsaVar4, j7, zzjdVar.zzc, j7, !z9, 0);
                                            zzL();
                                            zzY();
                                            z8 = true;
                                            i8 = -1;
                                        }
                                    }
                                }
                                z9 = false;
                                zzjd zzjdVar2 = zza.zzf;
                                zzsa zzsaVar42 = zzjdVar2.zza;
                                long j72 = zzjdVar2.zzb;
                                this.zzt = zzz(zzsaVar42, j72, zzjdVar2.zzc, j72, !z9, 0);
                                zzL();
                                zzY();
                                z8 = true;
                                i8 = -1;
                            }
                            i = this.zzt.zze;
                            if (i != 1 && i != 4) {
                                zzd = this.zzq.zzd();
                                if (zzd != null) {
                                    zzO(j, 10L);
                                    break;
                                } else {
                                    long j8 = j;
                                    int i13 = zzeg.zza;
                                    Trace.beginSection("doSomeWork");
                                    zzY();
                                    if (zzd.zzd) {
                                        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                        zzd.zza.zzj(this.zzt.zzs - this.zzm, false);
                                        z2 = true;
                                        z3 = true;
                                        int i14 = 0;
                                        while (true) {
                                            zzjt[] zzjtVarArr5 = this.zza;
                                            int length6 = zzjtVarArr5.length;
                                            if (i14 < 2) {
                                                zzjt zzjtVar5 = zzjtVarArr5[i14];
                                                if (zzac(zzjtVar5)) {
                                                    zzjtVar5.zzL(this.zzH, elapsedRealtime);
                                                    z3 = z3 && zzjtVar5.zzM();
                                                    zztq zztqVar4 = zzd.zzc[i14];
                                                    zztq zzm2 = zzjtVar5.zzm();
                                                    boolean z14 = zztqVar4 == zzm2 && zzjtVar5.zzG();
                                                    if (zztqVar4 == zzm2 && !z14 && !zzjtVar5.zzN() && !zzjtVar5.zzM()) {
                                                        z7 = false;
                                                        z2 = !z2 && z7;
                                                        if (z7) {
                                                            zzjtVar5.zzr();
                                                        }
                                                    }
                                                    z7 = true;
                                                    if (z2) {
                                                    }
                                                    if (z7) {
                                                    }
                                                }
                                                i14++;
                                            }
                                        }
                                    } else {
                                        zzd.zza.zzk();
                                        z2 = true;
                                        z3 = true;
                                    }
                                    long j9 = zzd.zzf.zze;
                                    if (z3 && zzd.zzd && (j9 == -9223372036854775807L || j9 <= this.zzt.zzs)) {
                                        if (this.zzx) {
                                            this.zzx = false;
                                            zzR(false, this.zzt.zzm, false, 5);
                                        }
                                        if (zzd.zzf.zzi) {
                                            zzS(4);
                                            zzV();
                                            int i15 = 2;
                                            if (this.zzt.zze == 2) {
                                                int i16 = 0;
                                                while (true) {
                                                    zzjt[] zzjtVarArr6 = this.zza;
                                                    int length7 = zzjtVarArr6.length;
                                                    if (i16 < i15) {
                                                        if (zzac(zzjtVarArr6[i16]) && this.zza[i16].zzm() == zzd.zzc[i16]) {
                                                            this.zza[i16].zzr();
                                                        }
                                                        i16++;
                                                        i15 = 2;
                                                    } else {
                                                        zzjn zzjnVar4 = this.zzt;
                                                        if (!zzjnVar4.zzg && zzjnVar4.zzr < 500000 && zzab()) {
                                                            if (this.zzL == -9223372036854775807L) {
                                                                this.zzL = SystemClock.elapsedRealtime();
                                                            } else if (SystemClock.elapsedRealtime() - this.zzL >= 4000) {
                                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                                            }
                                                            z4 = this.zzE;
                                                            zzjnVar = this.zzt;
                                                            if (z4 != zzjnVar.zzo) {
                                                                this.zzt = zzjnVar.zzc(z4);
                                                            }
                                                            if ((zzaf() || this.zzt.zze != 3) && (i2 = this.zzt.zze) != 2) {
                                                                if (this.zzF == 0 && i2 != 4) {
                                                                    zzO(j8, 1000L);
                                                                } else {
                                                                    this.zzh.zze(2);
                                                                }
                                                                z5 = false;
                                                            } else {
                                                                if (this.zzE && this.zzD) {
                                                                    z6 = false;
                                                                } else {
                                                                    zzO(j8, 10L);
                                                                    z6 = true;
                                                                }
                                                                z5 = !z6;
                                                            }
                                                            zzjnVar2 = this.zzt;
                                                            if (zzjnVar2.zzp != z5) {
                                                                this.zzt = new zzjn(zzjnVar2.zza, zzjnVar2.zzb, zzjnVar2.zzc, zzjnVar2.zzd, zzjnVar2.zze, zzjnVar2.zzf, zzjnVar2.zzg, zzjnVar2.zzh, zzjnVar2.zzi, zzjnVar2.zzj, zzjnVar2.zzk, zzjnVar2.zzl, zzjnVar2.zzm, zzjnVar2.zzn, zzjnVar2.zzq, zzjnVar2.zzr, zzjnVar2.zzs, zzjnVar2.zzo, z5);
                                                            }
                                                            this.zzD = false;
                                                            Trace.endSection();
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            this.zzL = -9223372036854775807L;
                                            z4 = this.zzE;
                                            zzjnVar = this.zzt;
                                            if (z4 != zzjnVar.zzo) {
                                            }
                                            if (zzaf()) {
                                            }
                                            if (this.zzF == 0) {
                                            }
                                            this.zzh.zze(2);
                                            z5 = false;
                                            zzjnVar2 = this.zzt;
                                            if (zzjnVar2.zzp != z5) {
                                            }
                                            this.zzD = false;
                                            Trace.endSection();
                                        }
                                    }
                                    zzjn zzjnVar5 = this.zzt;
                                    if (zzjnVar5.zze == 2) {
                                        if (this.zzF == 0) {
                                            break;
                                        } else if (z2) {
                                            if (zzjnVar5.zzg) {
                                                long zzb4 = zzag(zzjnVar5.zza, this.zzq.zzd().zzf.zza) ? this.zzN.zzb() : -9223372036854775807L;
                                                zzjc zzc = this.zzq.zzc();
                                                boolean z15 = zzc.zzr() && zzc.zzf.zzi;
                                                boolean z16 = zzc.zzf.zza.zzb() && !zzc.zzd;
                                                if (!z15) {
                                                    if (!z16) {
                                                        if (this.zzf.zzh(zzt(), this.zzn.zzc().zzc, this.zzy, zzb4)) {
                                                        }
                                                    }
                                                }
                                            }
                                            zzS(3);
                                            this.zzK = null;
                                            if (zzaf()) {
                                                zzT();
                                            }
                                        }
                                        int i152 = 2;
                                        if (this.zzt.zze == 2) {
                                        }
                                        this.zzL = -9223372036854775807L;
                                        z4 = this.zzE;
                                        zzjnVar = this.zzt;
                                        if (z4 != zzjnVar.zzo) {
                                        }
                                        if (zzaf()) {
                                        }
                                        if (this.zzF == 0) {
                                        }
                                        this.zzh.zze(2);
                                        z5 = false;
                                        zzjnVar2 = this.zzt;
                                        if (zzjnVar2.zzp != z5) {
                                        }
                                        this.zzD = false;
                                        Trace.endSection();
                                    }
                                    if (this.zzt.zze == 3) {
                                        if (this.zzF == 0) {
                                            if (!zzad()) {
                                                this.zzy = zzaf();
                                                zzS(2);
                                                if (this.zzy) {
                                                    for (zzjc zzd3 = this.zzq.zzd(); zzd3 != null; zzd3 = zzd3.zzg()) {
                                                        for (zzvg zzvgVar : zzd3.zzi().zzc) {
                                                        }
                                                    }
                                                    this.zzN.zzc();
                                                }
                                                zzV();
                                            }
                                        }
                                    }
                                    int i1522 = 2;
                                    if (this.zzt.zze == 2) {
                                    }
                                    this.zzL = -9223372036854775807L;
                                    z4 = this.zzE;
                                    zzjnVar = this.zzt;
                                    if (z4 != zzjnVar.zzo) {
                                    }
                                    if (zzaf()) {
                                    }
                                    if (this.zzF == 0) {
                                    }
                                    this.zzh.zze(2);
                                    z5 = false;
                                    zzjnVar2 = this.zzt;
                                    if (zzjnVar2.zzp != z5) {
                                    }
                                    this.zzD = false;
                                    Trace.endSection();
                                }
                            }
                            this.zzh.zze(2);
                        }
                        j = uptimeMillis;
                        zze2 = this.zzq.zze();
                        if (zze2 != null) {
                            zzjc zze52 = this.zzq.zze();
                            zzvn zzi32 = zze52.zzi();
                            i3 = 0;
                            boolean z132 = false;
                            while (true) {
                                zzjt[] zzjtVarArr42 = this.zza;
                                int length52 = zzjtVarArr42.length;
                                if (i3 >= 2) {
                                }
                                i3++;
                            }
                        }
                        z8 = false;
                        while (zzaf()) {
                            if (z8) {
                            }
                            zza = this.zzq.zza();
                            Objects.requireNonNull(zza);
                            if (this.zzt.zzb.zza.equals(zza.zzf.zza.zza)) {
                            }
                            z9 = false;
                            zzjd zzjdVar22 = zza.zzf;
                            zzsa zzsaVar422 = zzjdVar22.zza;
                            long j722 = zzjdVar22.zzb;
                            this.zzt = zzz(zzsaVar422, j722, zzjdVar22.zzc, j722, !z9, 0);
                            zzL();
                            zzY();
                            z8 = true;
                            i8 = -1;
                        }
                        i = this.zzt.zze;
                        if (i != 1) {
                            zzd = this.zzq.zzd();
                            if (zzd != null) {
                            }
                        }
                        this.zzh.zze(2);
                    }
                    j = uptimeMillis;
                    i = this.zzt.zze;
                    if (i != 1) {
                    }
                    this.zzh.zze(2);
                    break;
                case 3:
                    zziv zzivVar = (zziv) message.obj;
                    this.zzu.zza(1);
                    Pair zzy = zzy(this.zzt.zza, zzivVar, true, this.zzA, this.zzB, this.zzk, this.zzl);
                    if (zzy == null) {
                        Pair zzx = zzx(this.zzt.zza);
                        zzsaVar = (zzsa) zzx.first;
                        longValue = ((Long) zzx.second).longValue();
                        j2 = -9223372036854775807L;
                        z10 = !this.zzt.zza.zzo();
                    } else {
                        Object obj = zzy.first;
                        longValue = ((Long) zzy.second).longValue();
                        j2 = zzivVar.zzc == -9223372036854775807L ? -9223372036854775807L : longValue;
                        zzsa zzh = this.zzq.zzh(this.zzt.zza, obj, longValue);
                        if (zzh.zzb()) {
                            this.zzt.zza.zzn(zzh.zza, this.zzl);
                            if (this.zzl.zze(zzh.zzb) == zzh.zzc) {
                                this.zzl.zzi();
                            }
                            zzsaVar = zzh;
                            longValue = 0;
                            z10 = true;
                        } else {
                            z10 = zzivVar.zzc == -9223372036854775807L;
                            zzsaVar = zzh;
                        }
                    }
                    try {
                        if (this.zzt.zza.zzo()) {
                            this.zzG = zzivVar;
                        } else if (zzy == null) {
                            if (this.zzt.zze != 1) {
                                zzS(4);
                            }
                            zzK(false, true, false, true);
                        } else {
                            try {
                                if (zzsaVar.equals(this.zzt.zzb)) {
                                    zzjc zzd4 = this.zzq.zzd();
                                    j4 = (zzd4 == null || !zzd4.zzd || longValue == 0) ? longValue : zzd4.zza.zza(longValue, this.zzs);
                                    if (zzeg.zzz(j4) == zzeg.zzz(this.zzt.zzs) && ((i4 = (zzjnVar3 = this.zzt).zze) == 2 || i4 == 3)) {
                                        long j10 = zzjnVar3.zzs;
                                        zzz = zzz(zzsaVar, j10, j2, j10, z10, 2);
                                        this.zzt = zzz;
                                        break;
                                    }
                                } else {
                                    j4 = longValue;
                                }
                                zzjn zzjnVar6 = this.zzt;
                                zzci zzciVar2 = zzjnVar6.zza;
                                zzZ(zzciVar2, zzsaVar, zzciVar2, zzjnVar6.zzb, j2);
                                zzz = zzz(zzsaVar, j3, j2, j3, z11, 2);
                                this.zzt = zzz;
                            } catch (Throwable th2) {
                                th = th2;
                                this.zzt = zzz(zzsaVar, j3, j2, j3, z11, 2);
                                throw th;
                            }
                            j3 = zzv(zzsaVar, j4, this.zzt.zze == 4);
                            z11 = z10 | (longValue != j3);
                        }
                        j3 = longValue;
                        z11 = z10;
                        zzz = zzz(zzsaVar, j3, j2, j3, z11, 2);
                        this.zzt = zzz;
                    } catch (Throwable th3) {
                        th = th3;
                        j3 = longValue;
                        z11 = z10;
                    }
                    break;
                case 4:
                    this.zzn.zzg((zzbt) message.obj);
                    zzG(this.zzn.zzc(), true);
                    break;
                case 5:
                    this.zzs = (zzjw) message.obj;
                    break;
                case 6:
                    zzU(false, true);
                    break;
                case 7:
                    zzK(true, false, true, false);
                    this.zzf.zzc();
                    zzS(1);
                    this.zzi.quit();
                    synchronized (this) {
                        this.zzv = true;
                        notifyAll();
                    }
                    return true;
                case 8:
                    if (this.zzq.zzl((zzry) message.obj)) {
                        zzjc zzc2 = this.zzq.zzc();
                        zzc2.zzl(this.zzn.zzc().zzc, this.zzt.zza);
                        zzX(zzc2.zzh(), zzc2.zzi());
                        if (zzc2 == this.zzq.zzd()) {
                            zzM(zzc2.zzf.zzb);
                            zzB();
                            zzjn zzjnVar7 = this.zzt;
                            zzsa zzsaVar5 = zzjnVar7.zzb;
                            long j11 = zzc2.zzf.zzb;
                            this.zzt = zzz(zzsaVar5, j11, zzjnVar7.zzc, j11, false, 5);
                        }
                        zzI();
                        break;
                    }
                    break;
                case 9:
                    if (this.zzq.zzl((zzry) message.obj)) {
                        this.zzq.zzk(this.zzH);
                        zzI();
                        break;
                    }
                    break;
                case 10:
                    float f = this.zzn.zzc().zzc;
                    zzjc zzd5 = this.zzq.zzd();
                    zzjc zze6 = this.zzq.zze();
                    boolean z17 = true;
                    while (zzd5 != null && zzd5.zzd) {
                        zzvn zzj = zzd5.zzj(f, this.zzt.zza);
                        zzvn zzi4 = zzd5.zzi();
                        if (zzi4 != null && zzi4.zzc.length == zzj.zzc.length) {
                            for (int i17 = 0; i17 < zzj.zzc.length; i17++) {
                                if (zzj.zza(zzi4, i17)) {
                                }
                            }
                            z17 &= zzd5 != zze6;
                            zzd5 = zzd5.zzg();
                        }
                        if (z17) {
                            zzjc zzd6 = this.zzq.zzd();
                            boolean zzm3 = this.zzq.zzm(zzd6);
                            int length8 = this.zza.length;
                            boolean[] zArr = new boolean[2];
                            long zzb5 = zzd6.zzb(zzj, this.zzt.zzs, zzm3, zArr);
                            zzjn zzjnVar8 = this.zzt;
                            boolean z18 = (zzjnVar8.zze == 4 || zzb5 == zzjnVar8.zzs) ? false : true;
                            zzjn zzjnVar9 = this.zzt;
                            i5 = 2;
                            zzjc zzjcVar = zzd6;
                            this.zzt = zzz(zzjnVar9.zzb, zzb5, zzjnVar9.zzc, zzjnVar9.zzd, z18, 5);
                            if (z18) {
                                zzM(zzb5);
                            }
                            int length9 = this.zza.length;
                            boolean[] zArr2 = new boolean[2];
                            int i18 = 0;
                            while (true) {
                                zzjt[] zzjtVarArr7 = this.zza;
                                int length10 = zzjtVarArr7.length;
                                if (i18 < 2) {
                                    zzjt zzjtVar6 = zzjtVarArr7[i18];
                                    boolean zzac = zzac(zzjtVar6);
                                    zArr2[i18] = zzac;
                                    zzjc zzjcVar2 = zzjcVar;
                                    zztq zztqVar5 = zzjcVar2.zzc[i18];
                                    if (zzac) {
                                        if (zztqVar5 != zzjtVar6.zzm()) {
                                            zzA(zzjtVar6);
                                        } else if (zArr[i18]) {
                                            zzjtVar6.zzB(this.zzH);
                                        }
                                    }
                                    i18++;
                                    zzjcVar = zzjcVar2;
                                } else {
                                    zzC(zArr2);
                                }
                            }
                        } else {
                            i5 = 2;
                            this.zzq.zzm(zzd5);
                            if (zzd5.zzd) {
                                zzd5.zza(zzj, Math.max(zzd5.zzf.zzb, this.zzH - zzd5.zze()), false);
                            }
                        }
                        zzE(true);
                        if (this.zzt.zze != 4) {
                            zzI();
                            zzY();
                            this.zzh.zzh(i5);
                            break;
                        }
                    }
                    break;
                case 11:
                    int i19 = message.arg1;
                    this.zzA = i19;
                    if (!this.zzq.zzp(this.zzt.zza, i19)) {
                        zzP(true);
                    }
                    zzE(false);
                    break;
                case 12:
                    boolean z19 = message.arg1 != 0;
                    this.zzB = z19;
                    if (!this.zzq.zzq(this.zzt.zza, z19)) {
                        zzP(true);
                    }
                    zzE(false);
                    break;
                case 13:
                    boolean z20 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.zzC != z20) {
                        this.zzC = z20;
                        if (!z20) {
                            zzjt[] zzjtVarArr8 = this.zza;
                            int length11 = zzjtVarArr8.length;
                            for (int i20 = 0; i20 < 2; i20++) {
                                zzjt zzjtVar7 = zzjtVarArr8[i20];
                                if (!zzac(zzjtVar7) && this.zzb.remove(zzjtVar7)) {
                                    zzjtVar7.zzA();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    zzQ((zzjq) message.obj);
                    break;
                case 15:
                    final zzjq zzjqVar = (zzjq) message.obj;
                    Looper zzb6 = zzjqVar.zzb();
                    if (!zzb6.getThread().isAlive()) {
                        zzjqVar.zzh(false);
                        break;
                    } else {
                        this.zzp.zzb(zzb6, null).zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzio
                            @Override // java.lang.Runnable
                            public final void run() {
                                zziw.zzr(zzjqVar);
                            }
                        });
                        break;
                    }
                case 16:
                    zzG((zzbt) message.obj, false);
                    break;
                case 17:
                    zzir zzirVar = (zzir) message.obj;
                    this.zzu.zza(1);
                    i6 = zzirVar.zzb;
                    if (i6 != -1) {
                        list2 = zzirVar.zza;
                        zzttVar2 = zzirVar.zzd;
                        zzjr zzjrVar = new zzjr(list2, zzttVar2, null);
                        i7 = zzirVar.zzb;
                        j5 = zzirVar.zzc;
                        this.zzG = new zziv(zzjrVar, i7, j5);
                    }
                    zzjm zzjmVar = this.zzr;
                    list = zzirVar.zza;
                    zzttVar = zzirVar.zzd;
                    zzF(zzjmVar.zzm(list, zzttVar), false);
                    break;
                case 18:
                    zzir zzirVar2 = (zzir) message.obj;
                    int i21 = message.arg1;
                    this.zzu.zza(1);
                    zzjm zzjmVar2 = this.zzr;
                    if (i21 == -1) {
                        i21 = zzjmVar2.zza();
                    }
                    list3 = zzirVar2.zza;
                    zzttVar3 = zzirVar2.zzd;
                    zzF(zzjmVar2.zzj(i21, list3, zzttVar3), false);
                    break;
                case 19:
                    this.zzu.zza(1);
                    zzjm zzjmVar3 = this.zzr;
                    int i22 = ((zzis) message.obj).zza;
                    zzF(zzjmVar3.zzk(0, 0, 0, null), false);
                    break;
                case 20:
                    this.zzu.zza(1);
                    zzF(this.zzr.zzl(message.arg1, message.arg2, (zztt) message.obj), false);
                    break;
                case 21:
                    this.zzu.zza(1);
                    zzF(this.zzr.zzn((zztt) message.obj), false);
                    break;
                case 22:
                    zzF(this.zzr.zzb(), true);
                    break;
                case 23:
                    this.zzw = message.arg1 != 0;
                    zzL();
                    if (this.zzx && this.zzq.zze() != this.zzq.zzd()) {
                        zzP(true);
                        zzE(false);
                        break;
                    }
                    break;
                case 24:
                    boolean z21 = message.arg1 == 1;
                    if (z21 != this.zzE) {
                        this.zzE = z21;
                        zzjn zzjnVar10 = this.zzt;
                        int i23 = zzjnVar10.zze;
                        if (!z21 && i23 != 4 && i23 != 1) {
                            this.zzh.zzh(2);
                            break;
                        }
                        this.zzt = zzjnVar10.zzc(z21);
                    }
                    break;
                case 25:
                    zzP(true);
                    break;
                default:
                    return false;
            }
        } catch (zzbp e) {
            zzD(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
        } catch (zzer e2) {
            zzD(e2, e2.zza);
        } catch (zzgt e3) {
            zzgt zzgtVar = e3;
            if (zzgtVar.zze == 1 && (zze = this.zzq.zze()) != null) {
                zzgtVar = zzgtVar.zza(zze.zzf.zza);
            }
            if (zzgtVar.zzk && this.zzK == null) {
                zzdn.zzb("ExoPlayerImplInternal", "Recoverable renderer error", zzgtVar);
                this.zzK = zzgtVar;
                zzdg zzdgVar = this.zzh;
                zzdgVar.zzj(zzdgVar.zzb(25, zzgtVar));
            } else {
                zzgt zzgtVar2 = this.zzK;
                if (zzgtVar2 != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzgtVar2, zzgtVar);
                    } catch (Exception unused) {
                    }
                    zzgtVar = this.zzK;
                }
                zzdn.zza("ExoPlayerImplInternal", "Playback error", zzgtVar);
                z = true;
                zzU(true, false);
                this.zzt = this.zzt.zze(zzgtVar);
            }
        } catch (zzpa e4) {
            zzD(e4, e4.zza);
        } catch (zzrc e5) {
            zzD(e5, 1002);
        } catch (IOException e6) {
            zzD(e6, 2000);
        } catch (RuntimeException e7) {
            zzgt zzd7 = zzgt.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzdn.zza("ExoPlayerImplInternal", "Playback error", zzd7);
            zzU(true, false);
            this.zzt = this.zzt.zze(zzd7);
        }
        z = true;
        zzJ();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zza(zzbt zzbtVar) {
        this.zzh.zzb(16, zzbtVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final /* bridge */ /* synthetic */ void zzg(zzts zztsVar) {
        this.zzh.zzb(9, (zzry) zztsVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjl
    public final void zzh() {
        this.zzh.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzryVar) {
        this.zzh.zzb(8, zzryVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzj() {
        this.zzh.zzh(10);
    }

    public final void zzk() {
        this.zzh.zza(0).zza();
    }

    public final void zzl(zzci zzciVar, int i, long j) {
        this.zzh.zzb(3, new zziv(zzciVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjo
    public final synchronized void zzm(zzjq zzjqVar) {
        if (!this.zzv && this.zzi.isAlive()) {
            this.zzh.zzb(14, zzjqVar).zza();
            return;
        }
        zzjqVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzc(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zza(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzv && this.zzi.isAlive()) {
            this.zzh.zzh(7);
            zzaa(new zzin(this), 500L);
            return this.zzv;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zztt zzttVar) {
        this.zzh.zzb(17, new zzir(list, zzttVar, i, j, null, null)).zza();
    }
}