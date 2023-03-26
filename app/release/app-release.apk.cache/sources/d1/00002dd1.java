package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzim extends zzk implements zzhe {
    public static final /* synthetic */ int zzd = 0;
    private final zzkf zzA;
    private final zzkg zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzjw zzH;
    private zzbx zzI;
    private zzbh zzJ;
    private zzbh zzK;
    @z1
    private zzad zzL;
    @z1
    private zzad zzM;
    @z1
    private AudioTrack zzN;
    @z1
    private Object zzO;
    @z1
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    @z1
    private zzgl zzT;
    @z1
    private zzgl zzU;
    private int zzV;
    private zzi zzW;
    private float zzX;
    private boolean zzY;
    private List zzZ;
    private boolean zzaa;
    private boolean zzab;
    private zzr zzac;
    private zzcv zzad;
    private zzbh zzae;
    private zzjn zzaf;
    private int zzag;
    private long zzah;
    private final zzhp zzai;
    private zztt zzaj;
    public final zzvn zzb;
    public final zzbx zzc;
    private final zzcz zze;
    private final Context zzf;
    private final zzcb zzg;
    private final zzjt[] zzh;
    private final zzvm zzi;
    private final zzdg zzj;
    private final zziw zzk;
    private final zzdm zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcf zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzrz zzq;
    private final zzkh zzr;
    private final Looper zzs;
    private final zzvu zzt;
    private final zzcx zzu;
    private final zzii zzv;
    private final zzik zzw;
    private final zzgf zzx;
    private final zzgj zzy;
    private final zzke zzz;

    static {
        zzbc.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzkh, com.google.android.gms.internal.ads.zzvt, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public zzim(zzhd zzhdVar, @z1 zzcb zzcbVar) {
        zzmu zza;
        Object obj;
        zzcz zzczVar = new zzcz(zzcx.zza);
        this.zze = zzczVar;
        try {
            Integer.toHexString(System.identityHashCode(this));
            String str = zzeg.zze;
            Context applicationContext = zzhdVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzhdVar.zzh.apply(zzhdVar.zzb);
            this.zzr = apply;
            this.zzW = zzhdVar.zzj;
            this.zzQ = 1;
            this.zzY = false;
            this.zzC = 2000L;
            zzii zziiVar = new zzii(this, null);
            this.zzv = zziiVar;
            zzik zzikVar = new zzik(null);
            this.zzw = zzikVar;
            Handler handler = new Handler(zzhdVar.zzi);
            zzjt[] zza2 = ((zzgx) zzhdVar.zzc).zza.zza(handler, zziiVar, zziiVar, zziiVar, zziiVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzvm zzvmVar = (zzvm) zzhdVar.zze.zza();
            this.zzi = zzvmVar;
            this.zzq = zzhd.zza(((zzgy) zzhdVar.zzd).zza);
            zzvy zzg = zzvy.zzg(((zzhb) zzhdVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = true;
            this.zzH = zzhdVar.zzk;
            Looper looper = zzhdVar.zzi;
            this.zzs = looper;
            zzcx zzcxVar = zzhdVar.zzb;
            this.zzu = zzcxVar;
            this.zzg = zzcbVar;
            zzdm zzdmVar = new zzdm(looper, zzcxVar, new zzdk() { // from class: com.google.android.gms.internal.ads.zzho
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj2, zzy zzyVar) {
                    zzby zzbyVar = (zzby) obj2;
                }
            });
            this.zzl = zzdmVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzaj = new zztt(0);
            int length2 = zza2.length;
            zzvn zzvnVar = new zzvn(new zzjv[2], new zzvg[2], zzct.zza, null);
            this.zzb = zzvnVar;
            this.zzn = new zzcf();
            zzbv zzbvVar = new zzbv();
            zzbvVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzvmVar.zzh();
            zzbvVar.zzd(29, true);
            zzbx zze = zzbvVar.zze();
            this.zzc = zze;
            zzbv zzbvVar2 = new zzbv();
            zzbvVar2.zzb(zze);
            zzbvVar2.zza(4);
            zzbvVar2.zza(10);
            this.zzI = zzbvVar2.zze();
            this.zzj = zzcxVar.zzb(looper, null);
            zzhp zzhpVar = new zzhp(this);
            this.zzai = zzhpVar;
            this.zzaf = zzjn.zzh(zzvnVar);
            apply.zzS(zzcbVar, looper);
            int i = zzeg.zza;
            if (i < 31) {
                zza = new zzmu();
            } else {
                zza = zzib.zza(applicationContext, this, true);
            }
            this.zzk = new zziw(zza2, zzvmVar, zzvnVar, (zzja) zzhdVar.zzf.zza(), zzg, 0, false, apply, this.zzH, zzhdVar.zzm, 500L, false, looper, zzcxVar, zzhpVar, zza, null);
            this.zzX = 1.0f;
            zzbh zzbhVar = zzbh.zza;
            this.zzJ = zzbhVar;
            this.zzK = zzbhVar;
            this.zzae = zzbhVar;
            this.zzag = -1;
            if (i < 21) {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                obj = null;
                this.zzV = zzeg.zzi(applicationContext);
            }
            this.zzZ = zzfrj.zzo();
            this.zzaa = true;
            Objects.requireNonNull(apply);
            zzdmVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zziiVar);
            this.zzx = new zzgf(zzhdVar.zza, handler, zziiVar);
            this.zzy = new zzgj(zzhdVar.zza, handler, zziiVar);
            zzeg.zzS(obj, obj);
            zzke zzkeVar = new zzke(zzhdVar.zza, handler, zziiVar);
            this.zzz = zzkeVar;
            int i2 = this.zzW.zzc;
            zzkeVar.zzf(3);
            this.zzA = new zzkf(zzhdVar.zza);
            this.zzB = new zzkg(zzhdVar.zza);
            this.zzac = zzam(zzkeVar);
            this.zzad = zzcv.zza;
            zzaq(1, 10, Integer.valueOf(this.zzV));
            zzaq(2, 10, Integer.valueOf(this.zzV));
            zzaq(1, 3, this.zzW);
            zzaq(2, 4, Integer.valueOf(this.zzQ));
            zzaq(2, 5, 0);
            zzaq(1, 9, Boolean.valueOf(this.zzY));
            zzaq(2, 7, zzikVar);
            zzaq(6, 8, zzikVar);
            zzczVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzN(zzim zzimVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzimVar.zzas(surface);
        zzimVar.zzP = surface;
    }

    private final int zzag() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzjn zzjnVar = this.zzaf;
        return zzjnVar.zza.zzn(zzjnVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzah(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzai(zzjn zzjnVar) {
        if (zzjnVar.zza.zzo()) {
            return zzeg.zzv(this.zzah);
        }
        if (zzjnVar.zzb.zzb()) {
            return zzjnVar.zzs;
        }
        zzci zzciVar = zzjnVar.zza;
        zzsa zzsaVar = zzjnVar.zzb;
        long j = zzjnVar.zzs;
        zzak(zzciVar, zzsaVar, j);
        return j;
    }

    private static long zzaj(zzjn zzjnVar) {
        zzch zzchVar = new zzch();
        zzcf zzcfVar = new zzcf();
        zzjnVar.zza.zzn(zzjnVar.zzb.zza, zzcfVar);
        long j = zzjnVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzjnVar.zza.zze(zzcfVar.zzd, zzchVar, 0L).zzm;
            return 0L;
        }
        return j;
    }

    private final long zzak(zzci zzciVar, zzsa zzsaVar, long j) {
        zzciVar.zzn(zzsaVar.zza, this.zzn);
        return j;
    }

    @z1
    private final Pair zzal(zzci zzciVar, int i, long j) {
        if (zzciVar.zzo()) {
            this.zzag = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzah = j;
            return null;
        }
        if (i == -1 || i >= zzciVar.zzc()) {
            i = zzciVar.zzg(false);
            long j2 = zzciVar.zze(i, this.zza, 0L).zzm;
            j = zzeg.zzz(0L);
        }
        return zzciVar.zzl(this.zza, this.zzn, i, zzeg.zzv(j));
    }

    public static zzr zzam(zzke zzkeVar) {
        return new zzr(0, zzkeVar.zzb(), zzkeVar.zza());
    }

    private final zzjn zzan(zzjn zzjnVar, zzci zzciVar, @z1 Pair pair) {
        zzsa zzsaVar;
        zzty zztyVar;
        zzsa zzsaVar2;
        zzvn zzvnVar;
        List list;
        int i;
        zzjn zzb;
        long j;
        zzcw.zzd(zzciVar.zzo() || pair != null);
        zzci zzciVar2 = zzjnVar.zza;
        zzjn zzg = zzjnVar.zzg(zzciVar);
        if (zzciVar.zzo()) {
            zzsa zzi = zzjn.zzi();
            long zzv = zzeg.zzv(this.zzah);
            zzjn zza = zzg.zzb(zzi, zzv, zzv, zzv, 0L, zzty.zza, this.zzb, zzfrj.zzo()).zza(zzi);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzg.zzb.zza;
        int i2 = zzeg.zza;
        boolean z = !obj.equals(pair.first);
        if (z) {
            zzsaVar = new zzsa(pair.first);
        } else {
            zzsaVar = zzg.zzb;
        }
        zzsa zzsaVar3 = zzsaVar;
        long longValue = ((Long) pair.second).longValue();
        long zzv2 = zzeg.zzv(zzk());
        if (!zzciVar2.zzo()) {
            zzciVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzv2) {
            zzcw.zzf(!zzsaVar3.zzb());
            if (z) {
                zztyVar = zzty.zza;
            } else {
                zztyVar = zzg.zzh;
            }
            zzty zztyVar2 = zztyVar;
            if (z) {
                zzsaVar2 = zzsaVar3;
                zzvnVar = this.zzb;
            } else {
                zzsaVar2 = zzsaVar3;
                zzvnVar = zzg.zzi;
            }
            zzvn zzvnVar2 = zzvnVar;
            if (z) {
                list = zzfrj.zzo();
            } else {
                list = zzg.zzj;
            }
            zzjn zza2 = zzg.zzb(zzsaVar2, longValue, longValue, longValue, 0L, zztyVar2, zzvnVar2, list).zza(zzsaVar2);
            zza2.zzq = longValue;
            return zza2;
        }
        if (i == 0) {
            int zza3 = zzciVar.zza(zzg.zzk.zza);
            if (zza3 != -1 && zzciVar.zzd(zza3, this.zzn, false).zzd == zzciVar.zzn(zzsaVar3.zza, this.zzn).zzd) {
                return zzg;
            }
            zzciVar.zzn(zzsaVar3.zza, this.zzn);
            if (zzsaVar3.zzb()) {
                j = this.zzn.zzg(zzsaVar3.zzb, zzsaVar3.zzc);
            } else {
                j = this.zzn.zze;
            }
            zzb = zzg.zzb(zzsaVar3, zzg.zzs, zzg.zzs, zzg.zzd, j - zzg.zzs, zzg.zzh, zzg.zzi, zzg.zzj).zza(zzsaVar3);
            zzb.zzq = j;
        } else {
            zzcw.zzf(!zzsaVar3.zzb());
            long max = Math.max(0L, zzg.zzr - (longValue - zzv2));
            long j2 = zzg.zzq;
            if (zzg.zzk.equals(zzg.zzb)) {
                j2 = longValue + max;
            }
            zzb = zzg.zzb(zzsaVar3, longValue, longValue, longValue, max, zzg.zzh, zzg.zzi, zzg.zzj);
            zzb.zzq = j2;
        }
        return zzb;
    }

    private final zzjq zzao(zzjp zzjpVar) {
        int zzag = zzag();
        zziw zziwVar = this.zzk;
        return new zzjq(zziwVar, zzjpVar, this.zzaf.zza, zzag == -1 ? 0 : zzag, this.zzu, zziwVar.zzb());
    }

    public final void zzap(final int i, final int i2) {
        if (i == this.zzR && i2 == this.zzS) {
            return;
        }
        this.zzR = i;
        this.zzS = i2;
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(24, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhs
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = zzim.zzd;
                ((zzby) obj).zzr(i3, i4);
            }
        });
        zzdmVar.zzc();
    }

    private final void zzaq(int i, int i2, @z1 Object obj) {
        zzjt[] zzjtVarArr = this.zzh;
        int length = zzjtVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzjt zzjtVar = zzjtVarArr[i3];
            if (zzjtVar.zzb() == i) {
                zzjq zzao = zzao(zzjtVar);
                zzao.zzf(i2);
                zzao.zze(obj);
                zzao.zzd();
            }
        }
    }

    public final void zzar() {
        zzaq(1, 2, Float.valueOf(this.zzy.zza() * this.zzX));
    }

    public final void zzas(@z1 Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zzjt[] zzjtVarArr = this.zzh;
        int length = zzjtVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzjt zzjtVar = zzjtVarArr[i];
            if (zzjtVar.zzb() == 2) {
                zzjq zzao = zzao(zzjtVar);
                zzao.zzf(1);
                zzao.zze(obj);
                zzao.zzd();
                arrayList.add(zzao);
            }
            i++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzjq) it.next()).zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzat(false, zzgt.zzd(new zziy(3), 1003));
        }
    }

    private final void zzat(boolean z, @z1 zzgt zzgtVar) {
        zzjn zzjnVar = this.zzaf;
        zzjn zza = zzjnVar.zza(zzjnVar.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0L;
        zzjn zzf = zza.zzf(1);
        if (zzgtVar != null) {
            zzf = zzf.zze(zzgtVar);
        }
        zzjn zzjnVar2 = zzf;
        this.zzD++;
        this.zzk.zzo();
        zzav(zzjnVar2, 0, 1, false, zzjnVar2.zza.zzo() && !this.zzaf.zza.zzo(), 4, zzai(zzjnVar2), -1);
    }

    public final void zzau(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzjn zzjnVar = this.zzaf;
        if (zzjnVar.zzl == z2 && zzjnVar.zzm == i3) {
            return;
        }
        this.zzD++;
        zzjn zzd2 = zzjnVar.zzd(z2, i3);
        this.zzk.zzn(z2, i3);
        zzav(zzd2, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzav(final zzjn zzjnVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        Pair pair;
        int i5;
        final zzbb zzbbVar;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        Object obj;
        zzbb zzbbVar2;
        Object obj2;
        int i8;
        long j2;
        long zzaj;
        Object obj3;
        zzbb zzbbVar3;
        Object obj4;
        int i9;
        zzjn zzjnVar2 = this.zzaf;
        this.zzaf = zzjnVar;
        boolean z6 = !zzjnVar2.zza.equals(zzjnVar.zza);
        zzci zzciVar = zzjnVar2.zza;
        zzci zzciVar2 = zzjnVar.zza;
        if (zzciVar2.zzo() && zzciVar.zzo()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (zzciVar2.zzo() != zzciVar.zzo()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!zzciVar.zze(zzciVar.zzn(zzjnVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzciVar2.zze(zzciVar2.zzn(zzjnVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
            if (z2 && i3 == 0) {
                i5 = 1;
            } else if (z2 && i3 == 1) {
                i5 = 2;
            } else if (!z6) {
                throw new IllegalStateException();
            } else {
                i5 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
        } else if (z2 && i3 == 0 && zzjnVar2.zzb.zzd < zzjnVar.zzb.zzd) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        zzbh zzbhVar = this.zzJ;
        if (booleanValue) {
            zzbbVar = !zzjnVar.zza.zzo() ? zzjnVar.zza.zze(zzjnVar.zza.zzn(zzjnVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzd : null;
            this.zzae = zzbh.zza;
        } else {
            zzbbVar = null;
        }
        if (booleanValue || !zzjnVar2.zzj.equals(zzjnVar.zzj)) {
            zzbf zza = this.zzae.zza();
            List list = zzjnVar.zzj;
            for (int i10 = 0; i10 < list.size(); i10++) {
                zzbl zzblVar = (zzbl) list.get(i10);
                for (int i11 = 0; i11 < zzblVar.zza(); i11++) {
                    zzblVar.zzb(i11).zza(zza);
                }
            }
            this.zzae = zza.zzv();
            zzci zzn = zzn();
            if (zzn.zzo()) {
                zzbhVar = this.zzae;
            } else {
                zzbb zzbbVar4 = zzn.zze(zzf(), this.zza, 0L).zzd;
                zzbf zza2 = this.zzae.zza();
                zza2.zzb(zzbbVar4.zzg);
                zzbhVar = zza2.zzv();
            }
        }
        boolean z7 = !zzbhVar.equals(this.zzJ);
        this.zzJ = zzbhVar;
        boolean z8 = zzjnVar2.zzl;
        boolean z9 = zzjnVar.zzl;
        int i12 = zzjnVar2.zze;
        int i13 = zzjnVar.zze;
        if (i12 != i13 || z8 != z9) {
            zzaw();
        }
        boolean z10 = zzjnVar2.zzg;
        boolean z11 = zzjnVar.zzg;
        if (zzjnVar2.zza.equals(zzjnVar.zza)) {
            z3 = z8;
        } else {
            z3 = z8;
            this.zzl.zzd(0, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhu
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj5) {
                    zzjn zzjnVar3 = zzjn.this;
                    int i14 = i;
                    int i15 = zzim.zzd;
                    ((zzby) obj5).zzs(zzjnVar3.zza, i14);
                }
            });
        }
        if (z2) {
            zzcf zzcfVar = new zzcf();
            if (zzjnVar2.zza.zzo()) {
                z4 = z9;
                i6 = i13;
                z5 = z10;
                i7 = i4;
                obj = null;
                zzbbVar2 = null;
                obj2 = null;
                i8 = -1;
            } else {
                Object obj5 = zzjnVar2.zzb.zza;
                zzjnVar2.zza.zzn(obj5, zzcfVar);
                int i14 = zzcfVar.zzd;
                z4 = z9;
                i6 = i13;
                z5 = z10;
                i8 = zzjnVar2.zza.zza(obj5);
                obj2 = obj5;
                obj = zzjnVar2.zza.zze(i14, this.zza, 0L).zzc;
                zzbbVar2 = this.zza.zzd;
                i7 = i14;
            }
            if (i3 == 0) {
                if (zzjnVar2.zzb.zzb()) {
                    zzsa zzsaVar = zzjnVar2.zzb;
                    j2 = zzcfVar.zzg(zzsaVar.zzb, zzsaVar.zzc);
                    zzaj = zzaj(zzjnVar2);
                    long zzz = zzeg.zzz(j2);
                    zzsa zzsaVar2 = zzjnVar2.zzb;
                    final zzca zzcaVar = new zzca(obj, i7, zzbbVar2, obj2, i8, zzz, zzeg.zzz(zzaj), zzsaVar2.zzb, zzsaVar2.zzc);
                    int zzf = zzf();
                    if (this.zzaf.zza.zzo()) {
                        zzjn zzjnVar3 = this.zzaf;
                        Object obj6 = zzjnVar3.zzb.zza;
                        zzjnVar3.zza.zzn(obj6, this.zzn);
                        i9 = this.zzaf.zza.zza(obj6);
                        obj3 = this.zzaf.zza.zze(zzf, this.zza, 0L).zzc;
                        zzbbVar3 = this.zza.zzd;
                        obj4 = obj6;
                    } else {
                        obj3 = null;
                        zzbbVar3 = null;
                        obj4 = null;
                        i9 = -1;
                    }
                    long zzz2 = zzeg.zzz(j);
                    long zzz3 = !this.zzaf.zzb.zzb() ? zzeg.zzz(zzaj(this.zzaf)) : zzz2;
                    zzsa zzsaVar3 = this.zzaf.zzb;
                    final zzca zzcaVar2 = new zzca(obj3, zzf, zzbbVar3, obj4, i9, zzz2, zzz3, zzsaVar3.zzb, zzsaVar3.zzc);
                    this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzia
                        @Override // com.google.android.gms.internal.ads.zzdj
                        public final void zza(Object obj7) {
                            int i15 = i3;
                            zzca zzcaVar3 = zzcaVar;
                            zzca zzcaVar4 = zzcaVar2;
                            int i16 = zzim.zzd;
                            ((zzby) obj7).zzo(zzcaVar3, zzcaVar4, i15);
                        }
                    });
                } else {
                    j2 = zzjnVar2.zzb.zze != -1 ? zzaj(this.zzaf) : zzcfVar.zze;
                    zzaj = j2;
                    long zzz4 = zzeg.zzz(j2);
                    zzsa zzsaVar22 = zzjnVar2.zzb;
                    final zzca zzcaVar3 = new zzca(obj, i7, zzbbVar2, obj2, i8, zzz4, zzeg.zzz(zzaj), zzsaVar22.zzb, zzsaVar22.zzc);
                    int zzf2 = zzf();
                    if (this.zzaf.zza.zzo()) {
                    }
                    long zzz22 = zzeg.zzz(j);
                    if (!this.zzaf.zzb.zzb()) {
                    }
                    zzsa zzsaVar32 = this.zzaf.zzb;
                    final zzca zzcaVar22 = new zzca(obj3, zzf2, zzbbVar3, obj4, i9, zzz22, zzz3, zzsaVar32.zzb, zzsaVar32.zzc);
                    this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzia
                        @Override // com.google.android.gms.internal.ads.zzdj
                        public final void zza(Object obj7) {
                            int i15 = i3;
                            zzca zzcaVar32 = zzcaVar3;
                            zzca zzcaVar4 = zzcaVar22;
                            int i16 = zzim.zzd;
                            ((zzby) obj7).zzo(zzcaVar32, zzcaVar4, i15);
                        }
                    });
                }
            } else if (zzjnVar2.zzb.zzb()) {
                j2 = zzjnVar2.zzs;
                zzaj = zzaj(zzjnVar2);
                long zzz42 = zzeg.zzz(j2);
                zzsa zzsaVar222 = zzjnVar2.zzb;
                final zzca zzcaVar32 = new zzca(obj, i7, zzbbVar2, obj2, i8, zzz42, zzeg.zzz(zzaj), zzsaVar222.zzb, zzsaVar222.zzc);
                int zzf22 = zzf();
                if (this.zzaf.zza.zzo()) {
                }
                long zzz222 = zzeg.zzz(j);
                if (!this.zzaf.zzb.zzb()) {
                }
                zzsa zzsaVar322 = this.zzaf.zzb;
                final zzca zzcaVar222 = new zzca(obj3, zzf22, zzbbVar3, obj4, i9, zzz222, zzz3, zzsaVar322.zzb, zzsaVar322.zzc);
                this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzia
                    @Override // com.google.android.gms.internal.ads.zzdj
                    public final void zza(Object obj7) {
                        int i15 = i3;
                        zzca zzcaVar322 = zzcaVar32;
                        zzca zzcaVar4 = zzcaVar222;
                        int i16 = zzim.zzd;
                        ((zzby) obj7).zzo(zzcaVar322, zzcaVar4, i15);
                    }
                });
            } else {
                j2 = zzjnVar2.zzs;
                zzaj = j2;
                long zzz422 = zzeg.zzz(j2);
                zzsa zzsaVar2222 = zzjnVar2.zzb;
                final zzca zzcaVar322 = new zzca(obj, i7, zzbbVar2, obj2, i8, zzz422, zzeg.zzz(zzaj), zzsaVar2222.zzb, zzsaVar2222.zzc);
                int zzf222 = zzf();
                if (this.zzaf.zza.zzo()) {
                }
                long zzz2222 = zzeg.zzz(j);
                if (!this.zzaf.zzb.zzb()) {
                }
                zzsa zzsaVar3222 = this.zzaf.zzb;
                final zzca zzcaVar2222 = new zzca(obj3, zzf222, zzbbVar3, obj4, i9, zzz2222, zzz3, zzsaVar3222.zzb, zzsaVar3222.zzc);
                this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzia
                    @Override // com.google.android.gms.internal.ads.zzdj
                    public final void zza(Object obj7) {
                        int i15 = i3;
                        zzca zzcaVar3222 = zzcaVar322;
                        zzca zzcaVar4 = zzcaVar2222;
                        int i16 = zzim.zzd;
                        ((zzby) obj7).zzo(zzcaVar3222, zzcaVar4, i15);
                    }
                });
            }
        } else {
            z4 = z9;
            i6 = i13;
            z5 = z10;
        }
        if (booleanValue) {
            this.zzl.zzd(1, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhf
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzbb zzbbVar5 = zzbb.this;
                    int i15 = intValue;
                    int i16 = zzim.zzd;
                    ((zzby) obj7).zzf(zzbbVar5, i15);
                }
            });
        }
        if (zzjnVar2.zzf != zzjnVar.zzf) {
            this.zzl.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhg
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i15 = zzim.zzd;
                    ((zzby) obj7).zzm(zzjnVar4.zzf);
                }
            });
            if (zzjnVar.zzf != null) {
                this.zzl.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhh
                    @Override // com.google.android.gms.internal.ads.zzdj
                    public final void zza(Object obj7) {
                        zzjn zzjnVar4 = zzjn.this;
                        int i15 = zzim.zzd;
                        ((zzby) obj7).zzl(zzjnVar4.zzf);
                    }
                });
            }
        }
        zzvn zzvnVar = zzjnVar2.zzi;
        zzvn zzvnVar2 = zzjnVar.zzi;
        if (zzvnVar != zzvnVar2) {
            this.zzi.zzk(zzvnVar2.zze);
            this.zzl.zzd(2, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhi
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i15 = zzim.zzd;
                    ((zzby) obj7).zzt(zzjnVar4.zzi.zzd);
                }
            });
        }
        if (z7) {
            final zzbh zzbhVar2 = this.zzJ;
            this.zzl.zzd(14, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhj
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzbh zzbhVar3 = zzbh.this;
                    int i15 = zzim.zzd;
                    ((zzby) obj7).zzg(zzbhVar3);
                }
            });
        }
        if (z5 != z11) {
            this.zzl.zzd(3, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhk
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i15 = zzim.zzd;
                    ((zzby) obj7).zzd(zzjnVar4.zzg);
                }
            });
        }
        int i15 = i6;
        boolean z12 = z4;
        boolean z13 = z3;
        if (i12 != i15 || z13 != z12) {
            this.zzl.zzd(-1, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhl
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i16 = zzim.zzd;
                    ((zzby) obj7).zzn(zzjnVar4.zzl, zzjnVar4.zze);
                }
            });
        }
        if (i12 != i15) {
            this.zzl.zzd(4, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhm
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i16 = zzim.zzd;
                    ((zzby) obj7).zzj(zzjnVar4.zze);
                }
            });
        }
        if (z13 != z12) {
            this.zzl.zzd(5, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhv
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i16 = i2;
                    int i17 = zzim.zzd;
                    ((zzby) obj7).zzh(zzjnVar4.zzl, i16);
                }
            });
        }
        if (zzjnVar2.zzm != zzjnVar.zzm) {
            this.zzl.zzd(6, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhw
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i16 = zzim.zzd;
                    ((zzby) obj7).zzk(zzjnVar4.zzm);
                }
            });
        }
        if (zzay(zzjnVar2) != zzay(zzjnVar)) {
            this.zzl.zzd(7, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhx
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    ((zzby) obj7).zze(zzim.zzay(zzjn.this));
                }
            });
        }
        if (!zzjnVar2.zzn.equals(zzjnVar.zzn)) {
            this.zzl.zzd(12, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhy
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjn zzjnVar4 = zzjn.this;
                    int i16 = zzim.zzd;
                    ((zzby) obj7).zzi(zzjnVar4.zzn);
                }
            });
        }
        if (z) {
            this.zzl.zzd(-1, zzhz.zza);
        }
        zzbx zzbxVar = this.zzI;
        zzbx zzF = zzeg.zzF(this.zzg, this.zzc);
        this.zzI = zzF;
        if (!zzF.equals(zzbxVar)) {
            this.zzl.zzd(13, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhn
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzim.this.zzU((zzby) obj7);
                }
            });
        }
        this.zzl.zzc();
        if (zzjnVar2.zzo != zzjnVar.zzo) {
            Iterator it = this.zzm.iterator();
            while (it.hasNext()) {
                ((zzgu) it.next()).zza(zzjnVar.zzo);
            }
        }
        if (zzjnVar2.zzp != zzjnVar.zzp) {
            Iterator it2 = this.zzm.iterator();
            while (it2.hasNext()) {
                ((zzgu) it2.next()).zzb(zzjnVar.zzp);
            }
        }
    }

    public final void zzaw() {
        int zzh = zzh();
        if (zzh == 2 || zzh == 3) {
            zzax();
            boolean z = this.zzaf.zzp;
            zzq();
            zzq();
        }
    }

    private final void zzax() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzH = zzeg.zzH("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzaa) {
                zzdn.zzb("ExoPlayerImpl", zzH, this.zzab ? null : new IllegalStateException());
                this.zzab = true;
                return;
            }
            throw new IllegalStateException(zzH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzay(zzjn zzjnVar) {
        return zzjnVar.zze == 3 && zzjnVar.zzl && zzjnVar.zzm == 0;
    }

    @z1
    public final zzgt zzA() {
        zzax();
        return this.zzaf.zzf;
    }

    public final void zzR(zzkk zzkkVar) {
        Objects.requireNonNull(zzkkVar);
        this.zzr.zzw(zzkkVar);
    }

    public final /* synthetic */ void zzS(zziu zziuVar) {
        long j;
        boolean z;
        long j2;
        int i = this.zzD - zziuVar.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zziuVar.zzc) {
            this.zzE = zziuVar.zzd;
            this.zzF = true;
        }
        if (zziuVar.zze) {
            this.zzG = zziuVar.zzf;
        }
        if (i == 0) {
            zzci zzciVar = zziuVar.zza.zza;
            if (!this.zzaf.zza.zzo() && zzciVar.zzo()) {
                this.zzag = -1;
                this.zzah = 0L;
            }
            if (!zzciVar.zzo()) {
                List zzw = ((zzjr) zzciVar).zzw();
                zzcw.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzil) this.zzo.get(i2)).zzb = (zzci) zzw.get(i2);
                }
            }
            if (this.zzF) {
                if (zziuVar.zza.zzb.equals(this.zzaf.zzb) && zziuVar.zza.zzd == this.zzaf.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (!zzciVar.zzo() && !zziuVar.zza.zzb.zzb()) {
                        zzjn zzjnVar = zziuVar.zza;
                        zzsa zzsaVar = zzjnVar.zzb;
                        j2 = zzjnVar.zzd;
                        zzak(zzciVar, zzsaVar, j2);
                    } else {
                        j2 = zziuVar.zza.zzd;
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzav(zziuVar.zza, 1, this.zzG, false, z, this.zzE, j, -1);
        }
    }

    public final /* synthetic */ void zzT(final zziu zziuVar) {
        this.zzj.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhq
            @Override // java.lang.Runnable
            public final void run() {
                zzim.this.zzS(zziuVar);
            }
        });
    }

    public final /* synthetic */ void zzU(zzby zzbyVar) {
        zzbyVar.zza(this.zzI);
    }

    public final void zzW() {
        zzax();
        boolean zzq = zzq();
        int zzb = this.zzy.zzb(zzq, 2);
        zzau(zzq, zzb, zzah(zzq, zzb));
        zzjn zzjnVar = this.zzaf;
        if (zzjnVar.zze != 1) {
            return;
        }
        zzjn zze = zzjnVar.zze(null);
        zzjn zzf = zze.zzf(true == zze.zza.zzo() ? 4 : 2);
        this.zzD++;
        this.zzk.zzk();
        zzav(zzf, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void zzX() {
        AudioTrack audioTrack;
        Integer.toHexString(System.identityHashCode(this));
        String str = zzeg.zze;
        zzbc.zza();
        zzax();
        if (zzeg.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdm zzdmVar = this.zzl;
            zzdmVar.zzd(10, zzhr.zza);
            zzdmVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd(null);
        this.zzt.zzf(this.zzr);
        zzjn zzf = this.zzaf.zzf(1);
        this.zzaf = zzf;
        zzjn zza = zzf.zza(zzf.zzb);
        this.zzaf = zza;
        zza.zzq = zza.zzs;
        this.zzaf.zzr = 0L;
        this.zzr.zzQ();
        this.zzi.zzo();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = zzfrj.zzo();
    }

    public final void zzY(zzkk zzkkVar) {
        this.zzr.zzR(zzkkVar);
    }

    public final void zzZ(zzsc zzscVar) {
        zzax();
        List singletonList = Collections.singletonList(zzscVar);
        zzax();
        zzax();
        zzag();
        zzl();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzaj = this.zzaj.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzjk zzjkVar = new zzjk((zzsc) singletonList.get(i2), this.zzp);
            arrayList.add(zzjkVar);
            this.zzo.add(i2, new zzil(zzjkVar.zzb, zzjkVar.zza.zzA()));
        }
        this.zzaj = this.zzaj.zzg(0, arrayList.size());
        zzjr zzjrVar = new zzjr(this.zzo, this.zzaj, null);
        if (!zzjrVar.zzo() && zzjrVar.zzc() < 0) {
            throw new zzae(zzjrVar, -1, -9223372036854775807L);
        }
        int zzg = zzjrVar.zzg(false);
        zzjn zzan = zzan(this.zzaf, zzjrVar, zzal(zzjrVar, zzg, -9223372036854775807L));
        int i3 = zzan.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = (zzjrVar.zzo() || zzg >= zzjrVar.zzc()) ? 4 : 2;
        }
        zzjn zzf = zzan.zzf(i3);
        this.zzk.zzq(arrayList, zzg, zzeg.zzv(-9223372036854775807L), this.zzaj);
        zzav(zzf, 0, 1, false, (this.zzaf.zzb.zza.equals(zzf.zzb.zza) || this.zzaf.zza.zzo()) ? false : true, 4, zzai(zzf), -1);
    }

    public final void zzaa(boolean z) {
        zzax();
        int zzb = this.zzy.zzb(z, zzh());
        zzau(z, zzb, zzah(z, zzb));
    }

    public final void zzab(boolean z) {
        this.zzaa = false;
    }

    public final void zzac(@z1 Surface surface) {
        zzax();
        zzas(surface);
        int i = surface == null ? 0 : -1;
        zzap(i, i);
    }

    public final void zzad(float f) {
        zzax();
        final float zza = zzeg.zza(f, 0.0f, 1.0f);
        if (this.zzX == zza) {
            return;
        }
        this.zzX = zza;
        zzar();
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(22, new zzdj() { // from class: com.google.android.gms.internal.ads.zzht
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                float f2 = zza;
                int i = zzim.zzd;
                ((zzby) obj).zzv(f2);
            }
        });
        zzdmVar.zzc();
    }

    public final void zzae() {
        zzax();
        zzax();
        this.zzy.zzb(zzq(), 1);
        zzat(false, null);
        this.zzZ = zzfrj.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzd() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zze() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzf() {
        zzax();
        int zzag = zzag();
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzg() {
        zzax();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzjn zzjnVar = this.zzaf;
        return zzjnVar.zza.zza(zzjnVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzh() {
        zzax();
        return this.zzaf.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzi() {
        zzax();
        return this.zzaf.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzj() {
        zzax();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzk() {
        zzax();
        if (zzs()) {
            zzjn zzjnVar = this.zzaf;
            zzjnVar.zza.zzn(zzjnVar.zzb.zza, this.zzn);
            zzjn zzjnVar2 = this.zzaf;
            if (zzjnVar2.zzc == -9223372036854775807L) {
                long j = zzjnVar2.zza.zze(zzf(), this.zza, 0L).zzm;
                return zzeg.zzz(0L);
            }
            return zzeg.zzz(0L) + zzeg.zzz(this.zzaf.zzc);
        }
        return zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzl() {
        zzax();
        return zzeg.zzz(zzai(this.zzaf));
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzm() {
        zzax();
        return zzeg.zzz(this.zzaf.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzci zzn() {
        zzax();
        return this.zzaf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzct zzo() {
        zzax();
        return this.zzaf.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final void zzp(int i, long j) {
        zzax();
        this.zzr.zzx();
        zzci zzciVar = this.zzaf.zza;
        if (i >= 0 && (zzciVar.zzo() || i < zzciVar.zzc())) {
            this.zzD++;
            if (zzs()) {
                zziu zziuVar = new zziu(this.zzaf);
                zziuVar.zza(1);
                this.zzai.zza.zzT(zziuVar);
                return;
            }
            int i2 = zzh() != 1 ? 2 : 1;
            int zzf = zzf();
            zzjn zzan = zzan(this.zzaf.zzf(i2), zzciVar, zzal(zzciVar, i, j));
            this.zzk.zzl(zzciVar, i, zzeg.zzv(j));
            zzav(zzan, 0, 1, true, true, 1, zzai(zzan), zzf);
            return;
        }
        throw new zzae(zzciVar, i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzq() {
        zzax();
        return this.zzaf.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzr() {
        zzax();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzs() {
        zzax();
        return this.zzaf.zzb.zzb();
    }

    public final int zzu() {
        zzax();
        int length = this.zzh.length;
        return 2;
    }

    public final long zzv() {
        zzax();
        if (zzs()) {
            zzjn zzjnVar = this.zzaf;
            if (zzjnVar.zzk.equals(zzjnVar.zzb)) {
                return zzeg.zzz(this.zzaf.zzq);
            }
            return zzw();
        }
        zzax();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzjn zzjnVar2 = this.zzaf;
        long j = 0;
        if (zzjnVar2.zzk.zzd != zzjnVar2.zzb.zzd) {
            return zzeg.zzz(zzjnVar2.zza.zze(zzf(), this.zza, 0L).zzn);
        }
        long j2 = zzjnVar2.zzq;
        if (this.zzaf.zzk.zzb()) {
            zzjn zzjnVar3 = this.zzaf;
            zzjnVar3.zza.zzn(zzjnVar3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j = j2;
        }
        zzjn zzjnVar4 = this.zzaf;
        zzak(zzjnVar4.zza, zzjnVar4.zzk, j);
        return zzeg.zzz(j);
    }

    public final long zzw() {
        zzax();
        if (!zzs()) {
            zzci zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzeg.zzz(zzn.zze(zzf(), this.zza, 0L).zzn);
        }
        zzjn zzjnVar = this.zzaf;
        zzsa zzsaVar = zzjnVar.zzb;
        zzjnVar.zza.zzn(zzsaVar.zza, this.zzn);
        return zzeg.zzz(this.zzn.zzg(zzsaVar.zzb, zzsaVar.zzc));
    }
}