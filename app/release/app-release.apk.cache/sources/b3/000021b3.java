package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzciz extends zzchi implements zzayy, zzaww, zzbai, zzasq, zzarg {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcio zze;
    private final zzary zzf;
    private final zzary zzg;
    private final zzaya zzh;
    private final zzchq zzi;
    private zzarj zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference zzm;
    private zzchh zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    @GuardedBy("httpDataSourcesLock")
    private final ArrayList zzu;
    private volatile zzcin zzv;
    private final Object zzt = new Object();
    private final Set zzw = new HashSet();

    public zzciz(Context context, zzchq zzchqVar, zzchr zzchrVar) {
        this.zzd = context;
        this.zzi = zzchqVar;
        this.zzm = new WeakReference(zzchrVar);
        zzcio zzcioVar = new zzcio();
        this.zze = zzcioVar;
        zzavt zzavtVar = zzavt.zza;
        zzfnw zzfnwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzazx zzazxVar = new zzazx(context, zzavtVar, 0L, zzfnwVar, this, -1);
        this.zzf = zzazxVar;
        zzatf zzatfVar = new zzatf(zzavtVar, null, true, zzfnwVar, this);
        this.zzg = zzatfVar;
        zzaxw zzaxwVar = new zzaxw(null);
        this.zzh = zzaxwVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zzchi.zza.incrementAndGet();
        zzarj zza = zzark.zza(new zzary[]{zzatfVar, zzazxVar}, zzaxwVar, zzcioVar);
        this.zzj = zza;
        zza.zze(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzu = new ArrayList();
        this.zzv = null;
        this.zzr = (zzchrVar == null || zzchrVar.zzt() == null) ? "" : zzchrVar.zzt();
        this.zzs = zzchrVar != null ? zzchrVar.zzh() : 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzn)).booleanValue()) {
            this.zzj.zzg();
        }
        if (zzchrVar != null && zzchrVar.zzg() > 0) {
            this.zzj.zzp(zzchrVar.zzg());
        }
        if (zzchrVar != null && zzchrVar.zzf() > 0) {
            this.zzj.zzo(zzchrVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzp)).booleanValue()) {
            this.zzj.zzi();
            this.zzj.zzh(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzq)).intValue());
        }
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzk();
    }

    public final void finalize() throws Throwable {
        zzchi.zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if (!zzY()) {
            synchronized (this.zzt) {
                while (!this.zzu.isEmpty()) {
                    long j = this.zzq;
                    Map zze = ((zzays) this.zzu.remove(0)).zze();
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
                    this.zzq = j + j2;
                }
            }
            return this.zzq;
        }
        return this.zzv.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaxb zzaxfVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzaxfVar = zzp(uriArr[0], str);
        } else {
            zzaxb[] zzaxbVarArr = new zzaxb[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzaxbVarArr[i] = zzp(uriArr[i], str);
            }
            zzaxfVar = new zzaxf(zzaxbVarArr);
        }
        this.zzj.zzj(zzaxfVar);
        zzchi.zzb.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzarj zzarjVar = this.zzj;
        if (zzarjVar != null) {
            zzarjVar.zzl(this);
            this.zzj.zzk();
            this.zzj = null;
            zzchi.zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long j) {
        this.zzj.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int i) {
        this.zze.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int i) {
        this.zze.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchhVar) {
        this.zzn = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int i) {
        this.zze.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int i) {
        this.zze.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z) {
        this.zzj.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zze(i, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int i) {
        for (WeakReference weakReference : this.zzw) {
            zzcil zzcilVar = (zzcil) weakReference.get();
            if (zzcilVar != null) {
                zzcilVar.zzh(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface, boolean z) {
        zzarj zzarjVar = this.zzj;
        if (zzarjVar == null) {
            return;
        }
        zzari zzariVar = new zzari(this.zzf, 1, surface);
        if (z) {
            zzarjVar.zzf(zzariVar);
        } else {
            zzarjVar.zzn(zzariVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f, boolean z) {
        if (this.zzj == null) {
            return;
        }
        this.zzj.zzn(new zzari(this.zzg, 2, Float.valueOf(f)));
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.zzj.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.zzj != null;
    }

    public final /* synthetic */ zzayj zzS(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        zzcil zzcilVar = new zzcil(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzi);
        this.zzw.add(new WeakReference(zzcilVar));
        return zzcilVar;
    }

    public final /* synthetic */ zzayj zzT(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzayn(str, null, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, true, null);
    }

    public final /* synthetic */ zzayj zzU(zzayi zzayiVar) {
        return new zzcin(this.zzd, zzayiVar.zza(), this.zzr, this.zzs, this, new zzciv(this), null);
    }

    public final /* synthetic */ void zzV(boolean z, long j) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzi(z, j);
        }
    }

    public final void zzW(zzayj zzayjVar, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    /* renamed from: zzX */
    public final void zzk(zzayj zzayjVar, zzayl zzaylVar) {
        if (zzayjVar instanceof zzays) {
            synchronized (this.zzt) {
                this.zzu.add((zzays) zzayjVar);
            }
        } else if (zzayjVar instanceof zzcin) {
            this.zzv = (zzcin) zzayjVar;
            final zzchr zzchrVar = (zzchr) this.zzm.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchrVar != null && this.zzv.zzh()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzj()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzi()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchr zzchrVar2 = zzchr.this;
                        Map map = hashMap;
                        int i = zzciz.zzc;
                        zzchrVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzb(zzarx zzarxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzc(zzarf zzarfVar) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzk("onPlayerError", zzarfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzd(boolean z, int i) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzf(zzase zzaseVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final void zzg(zzaxq zzaxqVar, zzayc zzaycVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasq
    public final void zzh(zzart zzartVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzartVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzartVar.zze);
        hashMap.put("audioSampleMime", zzartVar.zzf);
        hashMap.put("audioCodec", zzartVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaww
    public final void zzi(IOException iOException) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            if (this.zzi.zzl) {
                zzchhVar.zzl("onLoadException", iOException);
            } else {
                zzchhVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final /* synthetic */ void zzj(Object obj, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzl(int i, long j) {
        this.zzp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzm(Surface surface) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzn(zzart zzartVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() || zzchrVar == null || zzartVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzartVar.zzl));
        hashMap.put("bitRate", String.valueOf(zzartVar.zzb));
        int i = zzartVar.zzj;
        int i2 = zzartVar.zzk;
        hashMap.put("resolution", i + "x" + i2);
        hashMap.put("videoMime", zzartVar.zze);
        hashMap.put("videoSampleMime", zzartVar.zzf);
        hashMap.put("videoCodec", zzartVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzo(int i, int i2, int i3, float f) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzC(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhz.zzbB)).booleanValue() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaxb zzp(Uri uri, final String str) {
        final zzayi zzayiVar;
        zzayi zzayiVar2;
        if (this.zzl && this.zzk.limit() > 0) {
            final byte[] bArr = new byte[this.zzk.limit()];
            this.zzk.get(bArr);
            zzayiVar = new zzayi() { // from class: com.google.android.gms.internal.ads.zzcip
                @Override // com.google.android.gms.internal.ads.zzayi
                public final zzayj zza() {
                    return new zzayh(bArr);
                }
            };
        } else {
            final boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbK)).booleanValue()) {
            }
            if (this.zzi.zzj) {
                z = false;
            }
            zzchq zzchqVar = this.zzi;
            if (zzchqVar.zzo) {
                zzayiVar = new zzayi() { // from class: com.google.android.gms.internal.ads.zzciq
                    @Override // com.google.android.gms.internal.ads.zzayi
                    public final zzayj zza() {
                        return zzciz.this.zzq(str, z);
                    }
                };
            } else if (zzchqVar.zzi > 0) {
                zzayiVar = new zzayi() { // from class: com.google.android.gms.internal.ads.zzcir
                    @Override // com.google.android.gms.internal.ads.zzayi
                    public final zzayj zza() {
                        return zzciz.this.zzS(str, z);
                    }
                };
            } else {
                zzayiVar = new zzayi() { // from class: com.google.android.gms.internal.ads.zzcis
                    @Override // com.google.android.gms.internal.ads.zzayi
                    public final zzayj zza() {
                        return zzciz.this.zzT(str, z);
                    }
                };
            }
            if (this.zzi.zzj) {
                zzayiVar = new zzayi() { // from class: com.google.android.gms.internal.ads.zzcit
                    @Override // com.google.android.gms.internal.ads.zzayi
                    public final zzayj zza() {
                        return zzciz.this.zzU(zzayiVar);
                    }
                };
            }
            ByteBuffer byteBuffer = this.zzk;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr2 = new byte[this.zzk.limit()];
                this.zzk.get(bArr2);
                zzayiVar2 = new zzayi() { // from class: com.google.android.gms.internal.ads.zzciu
                    @Override // com.google.android.gms.internal.ads.zzayi
                    public final zzayj zza() {
                        zzayi zzayiVar3 = zzayi.this;
                        byte[] bArr3 = bArr2;
                        int i = zzciz.zzc;
                        return new zzcja(new zzayh(bArr3), bArr3.length, zzayiVar3.zza());
                    }
                };
                zzaty zzatyVar = !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzm)).booleanValue() ? zzcix.zza : zzciy.zza;
                zzchq zzchqVar2 = this.zzi;
                return new zzawx(uri, zzayiVar2, zzatyVar, zzchqVar2.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, zzchqVar2.zzg);
            }
        }
        zzayiVar2 = zzayiVar;
        zzaty zzatyVar2 = !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzm)).booleanValue() ? zzcix.zza : zzciy.zza;
        zzchq zzchqVar22 = this.zzi;
        return new zzawx(uri, zzayiVar2, zzatyVar2, zzchqVar22.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, zzchqVar22.zzg);
    }

    public final /* synthetic */ zzayj zzq(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzcjd(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzp, zzchqVar.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if (zzY() && this.zzv.zzj()) {
            return Math.min(this.zzo, this.zzv.zze());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.zzj.zzd();
    }
}