package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzckv extends zzchi implements zzfs, zzkk {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzckg zze;
    private final zzve zzf;
    private final zzchq zzg;
    private final WeakReference zzh;
    private final zztf zzi;
    private zzjy zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzchh zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    @GuardedBy("httpDataSourcesLock")
    private final ArrayList zzt;
    private volatile zzcki zzu;
    private final Object zzs = new Object();
    private final Set zzv = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhz.zzbB)).booleanValue() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
        if (r7.zzj == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fb, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
        if (r7.zzo == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0100, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
        if (r7.zzi <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcko();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
        if (r7.zzj == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
        r7 = new com.google.android.gms.internal.ads.zzckp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
        if (r6.limit() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
        r6 = new byte[r5.zzk.limit()];
        r5.zzk.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzckq();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzckv(Context context, zzchq zzchqVar, zzchr zzchrVar) {
        final zzep zzepVar;
        zzyy zzyyVar;
        this.zzd = context;
        this.zzg = zzchqVar;
        this.zzh = new WeakReference(zzchrVar);
        zzckg zzckgVar = new zzckg();
        this.zze = zzckgVar;
        zzve zzveVar = new zzve(context);
        this.zzf = zzveVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzchi.zza.incrementAndGet();
        zzjx zzjxVar = new zzjx(context, new zzckr(this), null);
        zzjxVar.zzb(zzveVar);
        zzjxVar.zza(zzckgVar);
        this.zzj = zzjxVar.zzc();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbI)).booleanValue()) {
            zzix.zza(this.zzj);
        }
        this.zzj.zzx(this);
        final boolean z = false;
        this.zzn = 0;
        this.zzp = 0L;
        this.zzo = 0;
        this.zzt = new ArrayList();
        this.zzu = null;
        this.zzq = (zzchrVar == null || zzchrVar.zzt() == null) ? "" : zzchrVar.zzt();
        this.zzr = zzchrVar != null ? zzchrVar.zzh() : 0;
        final String zzc2 = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzchrVar.zzp().zza);
        if (this.zzl && this.zzk.limit() > 0) {
            final byte[] bArr = new byte[this.zzk.limit()];
            this.zzk.get(bArr);
            zzepVar = new zzep() { // from class: com.google.android.gms.internal.ads.zzckk
                @Override // com.google.android.gms.internal.ads.zzep
                public final zzeq zza() {
                    return new zzel(bArr);
                }
            };
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbK)).booleanValue()) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzm)).booleanValue()) {
            zzyyVar = zzckt.zza;
        } else {
            zzyyVar = zzcku.zza;
        }
        this.zzi = new zztf(zzepVar, new zzte(zzyyVar), null);
    }

    private final boolean zzZ() {
        return this.zzu != null && this.zzu.zzq();
    }

    public final void finalize() {
        zzchi.zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        if (zzZ()) {
            return 0L;
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if (!zzZ()) {
            synchronized (this.zzs) {
                while (!this.zzt.isEmpty()) {
                    long j = this.zzp;
                    Map zze = ((zzfn) this.zzt.remove(0)).zze();
                    long j2 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfoc.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzp = j + j2;
                }
            }
            return this.zzp;
        }
        return this.zzu.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsc zzssVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzssVar = zzW(uriArr[0]);
        } else {
            zzsc[] zzscVarArr = new zzsc[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzscVarArr[i] = zzW(uriArr[i]);
            }
            zzssVar = new zzss(false, false, zzscVarArr);
        }
        this.zzj.zzB(zzssVar);
        this.zzj.zzy();
        zzchi.zzb.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzjy zzjyVar = this.zzj;
        if (zzjyVar != null) {
            zzjyVar.zzA(this);
            this.zzj.zzz();
            this.zzj = null;
            zzchi.zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long j) {
        zzjy zzjyVar = this.zzj;
        zzjyVar.zzp(zzjyVar.zzf(), j);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int i) {
        this.zze.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int i) {
        this.zze.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchhVar) {
        this.zzm = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int i) {
        this.zze.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int i) {
        this.zze.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z) {
        this.zzj.zzC(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z) {
        if (this.zzj == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzj.zzt();
            if (i >= 2) {
                return;
            }
            zzve zzveVar = this.zzf;
            zzuv zzd = zzveVar.zzc().zzd();
            zzd.zzo(i, !z);
            zzveVar.zzg(zzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int i) {
        for (WeakReference weakReference : this.zzv) {
            zzckf zzckfVar = (zzckf) weakReference.get();
            if (zzckfVar != null) {
                zzckfVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface, boolean z) {
        zzjy zzjyVar = this.zzj;
        if (zzjyVar == null) {
            return;
        }
        zzjyVar.zzE(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f, boolean z) {
        zzjy zzjyVar = this.zzj;
        if (zzjyVar == null) {
            return;
        }
        zzjyVar.zzF(f);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.zzj.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.zzj != null;
    }

    public final /* synthetic */ zzeq zzS(String str, boolean z) {
        zzckv zzckvVar = true != z ? null : this;
        zzchq zzchqVar = this.zzg;
        return new zzcky(str, zzckvVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzp, zzchqVar.zzq);
    }

    public final /* synthetic */ zzeq zzT(String str, boolean z) {
        zzckv zzckvVar = true != z ? null : this;
        zzchq zzchqVar = this.zzg;
        zzckf zzckfVar = new zzckf(str, zzckvVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzi);
        this.zzv.add(new WeakReference(zzckfVar));
        return zzckfVar;
    }

    public final /* synthetic */ zzeq zzU(String str, boolean z) {
        zzey zzeyVar = new zzey();
        zzeyVar.zzf(str);
        zzeyVar.zze(true != z ? null : this);
        zzeyVar.zzc(this.zzg.zzd);
        zzeyVar.zzd(this.zzg.zzf);
        zzeyVar.zzb(true);
        return zzeyVar.zza();
    }

    public final /* synthetic */ zzeq zzV(zzep zzepVar) {
        return new zzcki(this.zzd, zzepVar.zza(), this.zzq, this.zzr, this, new zzckl(this), null);
    }

    @VisibleForTesting
    public final zzsc zzW(Uri uri) {
        zzah zzahVar = new zzah();
        zzahVar.zzb(uri);
        zzbb zzc2 = zzahVar.zzc();
        zztf zztfVar = this.zzi;
        zztfVar.zza(this.zzg.zzg);
        return zztfVar.zzb(zzc2);
    }

    public final /* synthetic */ void zzX(boolean z, long j) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzi(z, j);
        }
    }

    public final /* synthetic */ zzjt[] zzY(Handler handler, zzxq zzxqVar, zznk zznkVar, zzua zzuaVar, zzra zzraVar) {
        Context context = this.zzd;
        zzqk zzqkVar = zzqk.zzb;
        zzmv zzmvVar = zzmv.zza;
        zzmy[] zzmyVarArr = new zzmy[0];
        zzoa zzoaVar = new zzoa();
        if (zzmvVar == null) {
            Objects.requireNonNull(zzmvVar, "Both parameters are null");
        }
        zzoaVar.zzb(zzmvVar);
        zzoaVar.zzc(zzmyVarArr);
        zzom zzd = zzoaVar.zzd();
        zzqc zzqcVar = zzqc.zza;
        return new zzjt[]{new zzos(context, zzqcVar, zzqkVar, false, handler, zznkVar, zzd), new zzwt(this.zzd, zzqcVar, zzqkVar, 0L, false, handler, zzxqVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zza(zzeq zzeqVar, zzev zzevVar, boolean z, int i) {
        this.zzn += i;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzb(zzeq zzeqVar, zzev zzevVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzc(zzeq zzeqVar, zzev zzevVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd(zzeq zzeqVar, zzev zzevVar, boolean z) {
        if (zzeqVar instanceof zzfn) {
            synchronized (this.zzs) {
                this.zzt.add((zzfn) zzeqVar);
            }
        } else if (zzeqVar instanceof zzcki) {
            this.zzu = (zzcki) zzeqVar;
            final zzchr zzchrVar = (zzchr) this.zzh.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchrVar != null && this.zzu.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcks
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchr zzchrVar2 = zzchr.this;
                        Map map = hashMap;
                        int i = zzckv.zzc;
                        zzchrVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zze(zzki zzkiVar, zzad zzadVar, @z1 zzgm zzgmVar) {
        zzchr zzchrVar = (zzchr) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzadVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzadVar.zzl);
        hashMap.put("audioSampleMime", zzadVar.zzm);
        hashMap.put("audioCodec", zzadVar.zzj);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzf(zzki zzkiVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzg(zzki zzkiVar, zzrw zzrwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzh(zzki zzkiVar, int i, long j) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzi(zzcb zzcbVar, zzkj zzkjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzj(zzki zzkiVar, zzrr zzrrVar, zzrw zzrwVar, IOException iOException, boolean z) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            if (this.zzg.zzl) {
                zzchhVar.zzl("onLoadException", iOException);
            } else {
                zzchhVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzk(zzki zzkiVar, int i) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzl(zzki zzkiVar, zzbr zzbrVar) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzk("onPlayerError", zzbrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzm(zzki zzkiVar, zzca zzcaVar, zzca zzcaVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzn(zzki zzkiVar, Object obj, long j) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzo(zzki zzkiVar, zzgl zzglVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzp(zzki zzkiVar, zzad zzadVar, @z1 zzgm zzgmVar) {
        zzchr zzchrVar = (zzchr) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzadVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzadVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzadVar.zzi));
        int i = zzadVar.zzr;
        int i2 = zzadVar.zzs;
        hashMap.put("resolution", i + "x" + i2);
        hashMap.put("videoMime", zzadVar.zzl);
        hashMap.put("videoSampleMime", zzadVar.zzm);
        hashMap.put("videoCodec", zzadVar.zzj);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzq(zzki zzkiVar, zzcv zzcvVar) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzC(zzcvVar.zzc, zzcvVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.zzj.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.zzj.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if (zzZ() && this.zzu.zzp()) {
            return Math.min(this.zzn, this.zzu.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.zzj.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.zzj.zzv();
    }
}