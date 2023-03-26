package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzarr implements Handler.Callback, zzawy, zzayd, zzaxa {
    private zzarp zzA;
    private long zzB;
    private zzarn zzC;
    private zzarn zzD;
    private zzarn zzE;
    private zzase zzF;
    private boolean zzG;
    private boolean zzH;
    private int zzI;
    private volatile int zzJ;
    private volatile int zzK;
    private final zzcio zzL;
    private final zzary[] zza;
    private final zzaye zzc;
    private final zzazk zzd;
    private final Handler zze;
    private final HandlerThread zzf;
    private final Handler zzg;
    private final zzarj zzh;
    private final zzasd zzi;
    private final zzasc zzj;
    private zzaro zzk;
    private zzarx zzl;
    private zzary zzm;
    private zzazd zzn;
    private zzaxb zzo;
    private zzary[] zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;
    private int zzv = 0;
    private int zzu = 1;
    private final zzarz[] zzb = new zzarz[2];

    public zzarr(zzary[] zzaryVarArr, zzaye zzayeVar, zzcio zzcioVar, boolean z, int i, Handler handler, zzaro zzaroVar, zzarj zzarjVar, byte[] bArr) {
        this.zza = zzaryVarArr;
        this.zzc = zzayeVar;
        this.zzL = zzcioVar;
        this.zzr = z;
        this.zzg = handler;
        this.zzk = zzaroVar;
        this.zzh = zzarjVar;
        for (int i2 = 0; i2 < 2; i2++) {
            zzaryVarArr[i2].zzw(i2);
            this.zzb[i2] = zzaryVarArr[i2].zzf();
        }
        this.zzd = new zzazk();
        this.zzp = new zzary[0];
        this.zzi = new zzasd();
        this.zzj = new zzasc();
        zzayeVar.zzf(this);
        this.zzl = zzarx.zza;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zze = new Handler(handlerThread.getLooper(), this);
    }

    private final void zzA(Object obj, int i) {
        this.zzk = new zzaro(0, 0L);
        zzD(obj, i);
        this.zzk = new zzaro(0, -9223372036854775807L);
        zzJ(4);
        zzE(false);
    }

    private final void zzB() {
        zzarn zzarnVar = this.zzC;
        long zza = !zzarnVar.zzj ? 0L : zzarnVar.zza.zza();
        if (zza == Long.MIN_VALUE) {
            zzH(false);
            return;
        }
        zzarn zzarnVar2 = this.zzC;
        long j = this.zzB - (zzarnVar2.zzf - zzarnVar2.zzh);
        boolean zzj = this.zzL.zzj(zza - j);
        zzH(zzj);
        if (zzj) {
            this.zzC.zza.zzbj(j);
        }
    }

    private final void zzC() throws IOException {
        zzarn zzarnVar = this.zzC;
        if (zzarnVar == null || zzarnVar.zzj) {
            return;
        }
        zzarn zzarnVar2 = this.zzD;
        if (zzarnVar2 == null || zzarnVar2.zzl == zzarnVar) {
            for (zzary zzaryVar : this.zzp) {
                if (!zzaryVar.zzA()) {
                    return;
                }
            }
            this.zzC.zza.zzs();
        }
    }

    private final void zzD(Object obj, int i) {
        this.zzg.obtainMessage(6, new zzarq(this.zzF, obj, this.zzk, i)).sendToTarget();
    }

    private final void zzE(boolean z) {
        zzary[] zzaryVarArr;
        this.zze.removeMessages(2);
        this.zzs = false;
        this.zzd.zzc();
        this.zzn = null;
        this.zzm = null;
        this.zzB = 60000000L;
        for (zzary zzaryVar : this.zzp) {
            try {
                zzQ(zzaryVar);
                zzaryVar.zzj();
            } catch (zzarf | RuntimeException unused) {
            }
        }
        this.zzp = new zzary[0];
        zzarn zzarnVar = this.zzE;
        if (zzarnVar == null) {
            zzarnVar = this.zzC;
        }
        zzR(zzarnVar);
        this.zzC = null;
        this.zzD = null;
        this.zzE = null;
        zzH(false);
        if (z) {
            zzaxb zzaxbVar = this.zzo;
            if (zzaxbVar != null) {
                zzaxbVar.zzd();
                this.zzo = null;
            }
            this.zzF = null;
        }
    }

    private final void zzF(long j) throws zzarf {
        zzarn zzarnVar = this.zzE;
        long j2 = zzarnVar == null ? j + 60000000 : j + (zzarnVar.zzf - zzarnVar.zzh);
        this.zzB = j2;
        this.zzd.zza(j2);
        for (zzary zzaryVar : this.zzp) {
            zzaryVar.zzu(this.zzB);
        }
    }

    private final void zzG(long j, long j2) {
        this.zze.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.zze.sendEmptyMessage(2);
        } else {
            this.zze.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final void zzH(boolean z) {
        if (this.zzt != z) {
            this.zzt = z;
            this.zzg.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzI(zzarn zzarnVar) throws zzarf {
        if (this.zzE == zzarnVar) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            zzary zzaryVar = this.zza[i2];
            zArr[i2] = zzaryVar.zzb() != 0;
            zzaxu zza = zzarnVar.zzm.zzb.zza(i2);
            if (zza != null) {
                i++;
            }
            if (zArr[i2] && (zza == null || (zzaryVar.zzB() && zzaryVar.zzh() == this.zzE.zzd[i2]))) {
                if (zzaryVar == this.zzm) {
                    this.zzd.zzd(this.zzn);
                    this.zzn = null;
                    this.zzm = null;
                }
                zzQ(zzaryVar);
                zzaryVar.zzj();
            }
        }
        this.zzE = zzarnVar;
        this.zzg.obtainMessage(3, zzarnVar.zzm).sendToTarget();
        zzz(zArr, i);
    }

    private final void zzJ(int i) {
        if (this.zzu != i) {
            this.zzu = i;
            this.zzg.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzK() throws zzarf {
        this.zzs = false;
        this.zzd.zzb();
        for (zzary zzaryVar : this.zzp) {
            zzaryVar.zzy();
        }
    }

    private final void zzL() {
        zzE(true);
        this.zzL.zzc();
        zzJ(1);
    }

    private final void zzM() throws zzarf {
        this.zzd.zzc();
        for (zzary zzaryVar : this.zzp) {
            zzQ(zzaryVar);
        }
    }

    private final void zzN() throws zzarf {
        zzarn zzarnVar = this.zzE;
        if (zzarnVar == null) {
            return;
        }
        long zzh = zzarnVar.zza.zzh();
        if (zzh != -9223372036854775807L) {
            zzF(zzh);
        } else {
            zzary zzaryVar = this.zzm;
            if (zzaryVar != null && !zzaryVar.zzE()) {
                long zzI = this.zzn.zzI();
                this.zzB = zzI;
                this.zzd.zza(zzI);
            } else {
                this.zzB = this.zzd.zzI();
            }
            zzarn zzarnVar2 = this.zzE;
            zzh = this.zzB - (zzarnVar2.zzf - zzarnVar2.zzh);
        }
        this.zzk.zzc = zzh;
        this.zzy = SystemClock.elapsedRealtime() * 1000;
        long zzg = this.zzp.length == 0 ? Long.MIN_VALUE : this.zzE.zza.zzg();
        zzaro zzaroVar = this.zzk;
        if (zzg == Long.MIN_VALUE) {
            zzg = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
        }
        zzaroVar.zzd = zzg;
    }

    private final boolean zzO(int i) {
        this.zzF.zzd(i, this.zzj, false);
        this.zzF.zzg(0, this.zzi, false);
        return this.zzF.zzf(i, this.zzj, this.zzi, this.zzv) == -1;
    }

    private final boolean zzP(long j) {
        zzarn zzarnVar;
        return j == -9223372036854775807L || this.zzk.zzc < j || ((zzarnVar = this.zzE.zzl) != null && zzarnVar.zzj);
    }

    private static final void zzQ(zzary zzaryVar) throws zzarf {
        if (zzaryVar.zzb() == 2) {
            zzaryVar.zzz();
        }
    }

    private static final void zzR(zzarn zzarnVar) {
        while (zzarnVar != null) {
            zzarnVar.zzc();
            zzarnVar = zzarnVar.zzl;
        }
    }

    private final int zzt(int i, zzase zzaseVar, zzase zzaseVar2) {
        int zzb = zzaseVar.zzb();
        int i2 = -1;
        for (int i3 = 0; i3 < zzb && i2 == -1; i3++) {
            i = zzaseVar.zzf(i, this.zzj, this.zzi, this.zzv);
            i2 = zzaseVar2.zza(zzaseVar.zzd(i, this.zzj, true).zzb);
        }
        return i2;
    }

    private final long zzu(int i, long j) throws zzarf {
        zzarn zzarnVar;
        zzM();
        this.zzs = false;
        zzJ(2);
        zzarn zzarnVar2 = this.zzE;
        if (zzarnVar2 == null) {
            zzarn zzarnVar3 = this.zzC;
            if (zzarnVar3 != null) {
                zzarnVar3.zzc();
            }
            zzarnVar = null;
        } else {
            zzarnVar = null;
            while (zzarnVar2 != null) {
                if (zzarnVar2.zzg == i && zzarnVar2.zzj) {
                    zzarnVar = zzarnVar2;
                } else {
                    zzarnVar2.zzc();
                }
                zzarnVar2 = zzarnVar2.zzl;
            }
        }
        zzarn zzarnVar4 = this.zzE;
        if (zzarnVar4 != zzarnVar || zzarnVar4 != this.zzD) {
            for (zzary zzaryVar : this.zzp) {
                zzaryVar.zzj();
            }
            this.zzp = new zzary[0];
            this.zzn = null;
            this.zzm = null;
            this.zzE = null;
        }
        if (zzarnVar != null) {
            zzarnVar.zzl = null;
            this.zzC = zzarnVar;
            this.zzD = zzarnVar;
            zzI(zzarnVar);
            zzarn zzarnVar5 = this.zzE;
            if (zzarnVar5.zzk) {
                j = zzarnVar5.zza.zzi(j);
            }
            zzF(j);
            zzB();
        } else {
            this.zzC = null;
            this.zzD = null;
            this.zzE = null;
            zzF(j);
        }
        this.zze.sendEmptyMessage(2);
        return j;
    }

    private final Pair zzv(int i, long j) {
        return zzw(this.zzF, 0, -9223372036854775807L);
    }

    private final Pair zzw(zzase zzaseVar, int i, long j) {
        return zzx(zzaseVar, 0, j, 0L);
    }

    private final Pair zzx(zzase zzaseVar, int i, long j, long j2) {
        zzayz.zza(0, 0, zzaseVar.zzc());
        zzaseVar.zze(0, this.zzi, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = zzaseVar.zzd(0, this.zzj, false).zzc;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    private final Pair zzy(zzarp zzarpVar) {
        zzase zzaseVar = zzarpVar.zza;
        if (zzaseVar.zzh()) {
            zzaseVar = this.zzF;
        }
        try {
            Pair zzw = zzw(zzaseVar, 0, zzarpVar.zzc);
            zzase zzaseVar2 = this.zzF;
            if (zzaseVar2 == zzaseVar) {
                return zzw;
            }
            if (zzaseVar2.zza(zzaseVar.zzd(((Integer) zzw.first).intValue(), this.zzj, true).zzb) != -1) {
                return Pair.create(0, (Long) zzw.second);
            }
            if (zzt(((Integer) zzw.first).intValue(), zzaseVar, this.zzF) != -1) {
                this.zzF.zzd(0, this.zzj, false);
                return zzv(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzarv(this.zzF, 0, zzarpVar.zzc);
        }
    }

    private final void zzz(boolean[] zArr, int i) throws zzarf {
        int i2;
        this.zzp = new zzary[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            zzary zzaryVar = this.zza[i3];
            zzaxu zza = this.zzE.zzm.zzb.zza(i3);
            if (zza != null) {
                int i5 = i4 + 1;
                this.zzp[i4] = zzaryVar;
                if (zzaryVar.zzb() == 0) {
                    zzasa zzasaVar = this.zzE.zzm.zzd[i3];
                    boolean z = this.zzr && this.zzu == 3;
                    boolean z2 = !zArr[i3] && z;
                    zza.zzb();
                    zzart[] zzartVarArr = new zzart[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzartVarArr[i6] = zza.zzc(i6);
                    }
                    zzarn zzarnVar = this.zzE;
                    i2 = i3;
                    zzaryVar.zzk(zzasaVar, zzartVarArr, zzarnVar.zzd[i3], this.zzB, z2, zzarnVar.zzf - zzarnVar.zzh);
                    zzazd zzi = zzaryVar.zzi();
                    if (zzi != null) {
                        if (this.zzn == null) {
                            this.zzn = zzi;
                            this.zzm = zzaryVar;
                            zzi.zzK(this.zzl);
                        } else {
                            throw zzarf.zzc(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        zzaryVar.zzy();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0330, code lost:
        if (r2 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0332, code lost:
        r2 = r33.zzE.zzg;
        r33.zzk = new com.google.android.gms.internal.ads.zzaro(r2, zzu(r2, r33.zzk.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0346, code lost:
        r33.zzC = r3;
        r3.zzl = null;
        zzR(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        zzR(r12);
        r2.zzl = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0798, code lost:
        if (zzP(r1) != false) goto L372;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0268 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026c A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0271 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ea A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f1 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x050b A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0546 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0558 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0572 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, LOOP:9: B:305:0x0572->B:309:0x0582, LOOP_START, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06c7 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07a2 A[Catch: IOException -> 0x0872, zzarf -> 0x0878, RuntimeException -> 0x087e, TryCatch #5 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        int i;
        IOException iOException;
        boolean z2;
        int i2;
        zzarf zzarfVar;
        zzarn zzarnVar;
        int zzf;
        long j;
        zzarn zzarnVar2;
        zzarn zzarnVar3;
        int i3;
        zzayf zzayfVar;
        long j2;
        zzarn zzarnVar4;
        zzary[] zzaryVarArr;
        long zzg;
        boolean zzk;
        boolean z3;
        Message obtainMessage;
        int i4;
        zzarn zzarnVar5;
        zzari[] zzariVarArr;
        zzarn zzarnVar6;
        int i5;
        int i6 = 1;
        try {
            try {
                long j3 = 0;
                try {
                    switch (message.what) {
                        case 0:
                            zzaxb zzaxbVar = (zzaxb) message.obj;
                            int i7 = message.arg1;
                            this.zzg.sendEmptyMessage(0);
                            zzE(true);
                            this.zzL.zza();
                            if (i7 != 0) {
                                this.zzk = new zzaro(0, -9223372036854775807L);
                            }
                            this.zzo = zzaxbVar;
                            zzaxbVar.zzb(this.zzh, true, this);
                            zzJ(2);
                            this.zze.sendEmptyMessage(2);
                            return true;
                        case 1:
                            boolean z4 = message.arg1 != 0;
                            this.zzs = false;
                            this.zzr = z4;
                            if (z4) {
                                int i8 = this.zzu;
                                if (i8 == 3) {
                                    zzK();
                                    this.zze.sendEmptyMessage(2);
                                } else if (i8 == 2) {
                                    this.zze.sendEmptyMessage(2);
                                }
                            } else {
                                zzM();
                                zzN();
                            }
                            return true;
                        case 2:
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.zzF == null) {
                                this.zzo.zza();
                                j = elapsedRealtime;
                            } else {
                                zzarn zzarnVar7 = this.zzC;
                                if (zzarnVar7 == null) {
                                    zzf = this.zzk.zza;
                                } else {
                                    int i9 = zzarnVar7.zzg;
                                    if (!zzarnVar7.zzi && zzarnVar7.zzd() && this.zzF.zzd(i9, this.zzj, false).zzc != -9223372036854775807L && ((zzarnVar = this.zzE) == null || this.zzC.zzc - zzarnVar.zzc != 100)) {
                                        zzf = this.zzF.zzf(i9, this.zzj, this.zzi, this.zzv);
                                    }
                                    j = elapsedRealtime;
                                    zzarnVar2 = this.zzC;
                                    if (zzarnVar2 != null && !zzarnVar2.zzd()) {
                                        if (this.zzC != null && !this.zzt) {
                                            zzB();
                                        }
                                        if (this.zzE != null) {
                                            while (true) {
                                                zzarn zzarnVar8 = this.zzE;
                                                zzarnVar3 = this.zzD;
                                                if (zzarnVar8 != zzarnVar3 && this.zzB >= zzarnVar8.zzl.zzf) {
                                                    zzarnVar8.zzc();
                                                    zzI(this.zzE.zzl);
                                                    zzarn zzarnVar9 = this.zzE;
                                                    this.zzk = new zzaro(zzarnVar9.zzg, zzarnVar9.zzh);
                                                    zzN();
                                                    this.zzg.obtainMessage(5, this.zzk).sendToTarget();
                                                }
                                            }
                                            if (zzarnVar3.zzi) {
                                                for (int i10 = 0; i10 < 2; i10++) {
                                                    zzary zzaryVar = this.zza[i10];
                                                    zzaxl zzaxlVar = this.zzD.zzd[i10];
                                                    if (zzaxlVar != null && zzaryVar.zzh() == zzaxlVar && zzaryVar.zzA()) {
                                                        zzaryVar.zzv();
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (i3 < 2) {
                                                        zzary zzaryVar2 = this.zza[i3];
                                                        zzaxl zzaxlVar2 = this.zzD.zzd[i3];
                                                        i3 = (zzaryVar2.zzh() == zzaxlVar2 && (zzaxlVar2 == null || zzaryVar2.zzA())) ? i3 + 1 : 0;
                                                    } else {
                                                        zzarn zzarnVar10 = this.zzD;
                                                        zzarn zzarnVar11 = zzarnVar10.zzl;
                                                        if (zzarnVar11 != null && zzarnVar11.zzj) {
                                                            zzayf zzayfVar2 = zzarnVar10.zzm;
                                                            this.zzD = zzarnVar11;
                                                            zzayf zzayfVar3 = zzarnVar11.zzm;
                                                            long zzh = zzarnVar11.zza.zzh();
                                                            int i11 = 0;
                                                            int i12 = 2;
                                                            while (i11 < i12) {
                                                                zzary zzaryVar3 = this.zza[i11];
                                                                if (zzayfVar2.zzb.zza(i11) != null) {
                                                                    if (zzh != -9223372036854775807L) {
                                                                        zzaryVar3.zzv();
                                                                    } else if (!zzaryVar3.zzB()) {
                                                                        zzaxu zza = zzayfVar3.zzb.zza(i11);
                                                                        zzasa zzasaVar = zzayfVar2.zzd[i11];
                                                                        zzasa zzasaVar2 = zzayfVar3.zzd[i11];
                                                                        if (zza != null && zzasaVar2.equals(zzasaVar)) {
                                                                            zza.zzb();
                                                                            zzart[] zzartVarArr = new zzart[i6];
                                                                            for (int i13 = 0; i13 <= 0; i13++) {
                                                                                zzartVarArr[i13] = zza.zzc(i13);
                                                                            }
                                                                            zzarn zzarnVar12 = this.zzD;
                                                                            zzayfVar = zzayfVar3;
                                                                            j2 = zzh;
                                                                            zzaryVar3.zzt(zzartVarArr, zzarnVar12.zzd[i11], zzarnVar12.zzf - zzarnVar12.zzh);
                                                                        } else {
                                                                            zzayfVar = zzayfVar3;
                                                                            j2 = zzh;
                                                                            zzaryVar3.zzv();
                                                                        }
                                                                        i11++;
                                                                        zzayfVar3 = zzayfVar;
                                                                        zzh = j2;
                                                                        i12 = 2;
                                                                        i6 = 1;
                                                                    }
                                                                }
                                                                zzayfVar = zzayfVar3;
                                                                j2 = zzh;
                                                                i11++;
                                                                zzayfVar3 = zzayfVar;
                                                                zzh = j2;
                                                                i12 = 2;
                                                                i6 = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    zzH(false);
                                    if (this.zzE != null) {
                                    }
                                }
                                if (zzf >= this.zzF.zzb()) {
                                    this.zzo.zza();
                                    j = elapsedRealtime;
                                    zzarnVar2 = this.zzC;
                                    if (zzarnVar2 != null) {
                                        if (this.zzC != null) {
                                            zzB();
                                        }
                                        if (this.zzE != null) {
                                        }
                                    }
                                    zzH(false);
                                    if (this.zzE != null) {
                                    }
                                } else {
                                    if (this.zzC == null) {
                                        j3 = this.zzk.zzc;
                                    } else {
                                        this.zzF.zzd(zzf, this.zzj, false);
                                        this.zzF.zzg(0, this.zzi, false);
                                        if (zzf == 0) {
                                            zzarn zzarnVar13 = this.zzC;
                                            j = elapsedRealtime;
                                            Pair zzx = zzx(this.zzF, 0, -9223372036854775807L, Math.max(0L, ((zzarnVar13.zzf - zzarnVar13.zzh) + this.zzF.zzd(zzarnVar13.zzg, this.zzj, false).zzc) - this.zzB));
                                            if (zzx != null) {
                                                int intValue = ((Integer) zzx.first).intValue();
                                                j3 = ((Long) zzx.second).longValue();
                                                zzf = intValue;
                                                zzarn zzarnVar14 = this.zzC;
                                                long j4 = zzarnVar14 != null ? 60000000 + j3 : (zzarnVar14.zzf - zzarnVar14.zzh) + this.zzF.zzd(zzarnVar14.zzg, this.zzj, false).zzc;
                                                zzarn zzarnVar15 = this.zzC;
                                                int i14 = zzarnVar15 != null ? 0 : zzarnVar15.zzc + 1;
                                                boolean zzO = zzO(zzf);
                                                this.zzF.zzd(zzf, this.zzj, true);
                                                zzarn zzarnVar16 = new zzarn(this.zza, this.zzb, j4, this.zzc, this.zzL, this.zzo, this.zzj.zzb, i14, zzf, zzO, j3, null);
                                                zzarnVar4 = this.zzC;
                                                if (zzarnVar4 != null) {
                                                    zzarnVar4.zzl = zzarnVar16;
                                                }
                                                this.zzC = zzarnVar16;
                                                zzarnVar16.zza.zzw(this, j3);
                                                zzH(true);
                                            }
                                            zzarnVar2 = this.zzC;
                                            if (zzarnVar2 != null) {
                                            }
                                            zzH(false);
                                            if (this.zzE != null) {
                                            }
                                        }
                                    }
                                    j = elapsedRealtime;
                                    zzarn zzarnVar142 = this.zzC;
                                    long j42 = zzarnVar142 != null ? 60000000 + j3 : (zzarnVar142.zzf - zzarnVar142.zzh) + this.zzF.zzd(zzarnVar142.zzg, this.zzj, false).zzc;
                                    zzarn zzarnVar152 = this.zzC;
                                    if (zzarnVar152 != null) {
                                    }
                                    boolean zzO2 = zzO(zzf);
                                    this.zzF.zzd(zzf, this.zzj, true);
                                    zzarn zzarnVar162 = new zzarn(this.zza, this.zzb, j42, this.zzc, this.zzL, this.zzo, this.zzj.zzb, i14, zzf, zzO2, j3, null);
                                    zzarnVar4 = this.zzC;
                                    if (zzarnVar4 != null) {
                                    }
                                    this.zzC = zzarnVar162;
                                    zzarnVar162.zza.zzw(this, j3);
                                    zzH(true);
                                    zzarnVar2 = this.zzC;
                                    if (zzarnVar2 != null) {
                                    }
                                    zzH(false);
                                    if (this.zzE != null) {
                                    }
                                }
                            }
                            if (this.zzE == null) {
                                zzC();
                                zzG(j, 10L);
                            } else {
                                zzazm.zza("doSomeWork");
                                zzN();
                                this.zzE.zza.zzq(this.zzk.zzc);
                                boolean z5 = true;
                                boolean z6 = true;
                                for (zzary zzaryVar4 : this.zzp) {
                                    zzaryVar4.zzD(this.zzB, this.zzy);
                                    z6 = z6 && zzaryVar4.zzE();
                                    if (!zzaryVar4.zzF() && !zzaryVar4.zzE()) {
                                        z3 = false;
                                        if (!z3) {
                                            zzaryVar4.zzm();
                                        }
                                        z5 = !z5 && z3;
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    if (z5) {
                                    }
                                }
                                if (!z5) {
                                    zzC();
                                }
                                zzazd zzazdVar = this.zzn;
                                if (zzazdVar != null) {
                                    zzarx zzJ = zzazdVar.zzJ();
                                    if (!zzJ.equals(this.zzl)) {
                                        this.zzl = zzJ;
                                        this.zzd.zzd(this.zzn);
                                        this.zzg.obtainMessage(7, zzJ).sendToTarget();
                                    }
                                }
                                long j5 = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
                                if (z6 && ((j5 == -9223372036854775807L || j5 <= this.zzk.zzc) && this.zzE.zzi)) {
                                    zzJ(4);
                                    zzM();
                                } else {
                                    int i15 = this.zzu;
                                    if (i15 == 2) {
                                        if (this.zzp.length <= 0) {
                                            break;
                                        } else if (z5) {
                                            boolean z7 = this.zzs;
                                            zzarn zzarnVar17 = this.zzC;
                                            if (!zzarnVar17.zzj) {
                                                zzg = zzarnVar17.zzh;
                                            } else {
                                                zzg = zzarnVar17.zza.zzg();
                                            }
                                            if (zzg == Long.MIN_VALUE) {
                                                zzarn zzarnVar18 = this.zzC;
                                                if (!zzarnVar18.zzi) {
                                                    zzg = this.zzF.zzd(zzarnVar18.zzg, this.zzj, false).zzc;
                                                } else {
                                                    zzJ(3);
                                                    if (this.zzr) {
                                                        zzK();
                                                    }
                                                }
                                            }
                                            if (this.zzG) {
                                                zzcio zzcioVar = this.zzL;
                                                long j6 = this.zzk.zzd;
                                                zzarn zzarnVar19 = this.zzC;
                                                zzk = zzcioVar.zzk(j6 - (this.zzB - (zzarnVar19.zzf - zzarnVar19.zzh)), z7);
                                            } else {
                                                zzcio zzcioVar2 = this.zzL;
                                                zzarn zzarnVar20 = this.zzC;
                                                zzk = zzcioVar2.zzk(zzg - (this.zzB - (zzarnVar20.zzf - zzarnVar20.zzh)), z7);
                                            }
                                            if (zzk) {
                                                zzJ(3);
                                                if (this.zzr) {
                                                }
                                            }
                                        }
                                    } else if (i15 == 3) {
                                        if (this.zzp.length <= 0) {
                                            z5 = zzP(j5);
                                        }
                                        if (!z5) {
                                            this.zzs = this.zzr;
                                            zzJ(2);
                                            zzM();
                                        }
                                    }
                                }
                                if (this.zzu == 2) {
                                    for (zzary zzaryVar5 : this.zzp) {
                                        zzaryVar5.zzm();
                                    }
                                }
                                if ((this.zzr && this.zzu == 3) || this.zzu == 2) {
                                    zzG(j, this.zzJ > 0 ? this.zzJ : 10L);
                                } else if (this.zzp.length != 0) {
                                    zzG(j, this.zzK > 0 ? this.zzK : 1000L);
                                } else {
                                    this.zze.removeMessages(2);
                                }
                                zzazm.zzb();
                            }
                            return true;
                        case 3:
                            zzarp zzarpVar = (zzarp) message.obj;
                            if (this.zzF == null) {
                                this.zzz++;
                                this.zzA = zzarpVar;
                            } else {
                                Pair zzy = zzy(zzarpVar);
                                if (zzy == null) {
                                    zzaro zzaroVar = new zzaro(0, 0L);
                                    this.zzk = zzaroVar;
                                    this.zzg.obtainMessage(4, 1, 0, zzaroVar).sendToTarget();
                                    this.zzk = new zzaro(0, -9223372036854775807L);
                                    zzJ(4);
                                    zzE(false);
                                } else {
                                    int i16 = zzarpVar.zzc == -9223372036854775807L ? 1 : 0;
                                    int intValue2 = ((Integer) zzy.first).intValue();
                                    long longValue = ((Long) zzy.second).longValue();
                                    try {
                                        zzaro zzaroVar2 = this.zzk;
                                        if (intValue2 == zzaroVar2.zza && longValue / 1000 == zzaroVar2.zzc / 1000) {
                                            zzaro zzaroVar3 = new zzaro(intValue2, longValue);
                                            this.zzk = zzaroVar3;
                                            obtainMessage = this.zzg.obtainMessage(4, i16, 0, zzaroVar3);
                                        } else {
                                            long zzu = zzu(intValue2, longValue);
                                            int i17 = i16 | (longValue != zzu ? 1 : 0);
                                            zzaro zzaroVar4 = new zzaro(intValue2, zzu);
                                            this.zzk = zzaroVar4;
                                            obtainMessage = this.zzg.obtainMessage(4, i17, 0, zzaroVar4);
                                        }
                                        obtainMessage.sendToTarget();
                                    } catch (Throwable th) {
                                        zzaro zzaroVar5 = new zzaro(intValue2, longValue);
                                        this.zzk = zzaroVar5;
                                        this.zzg.obtainMessage(4, i16, 0, zzaroVar5).sendToTarget();
                                        throw th;
                                    }
                                }
                            }
                            return true;
                        case 4:
                            zzarx zzarxVar = (zzarx) message.obj;
                            zzazd zzazdVar2 = this.zzn;
                            if (zzazdVar2 != null) {
                                zzarxVar = zzazdVar2.zzK(zzarxVar);
                            } else {
                                this.zzd.zzK(zzarxVar);
                            }
                            this.zzl = zzarxVar;
                            this.zzg.obtainMessage(7, zzarxVar).sendToTarget();
                            return true;
                        case 5:
                            zzL();
                            return true;
                        case 6:
                            zzE(true);
                            this.zzL.zzb();
                            zzJ(1);
                            synchronized (this) {
                                this.zzq = true;
                                notifyAll();
                            }
                            return true;
                        case 7:
                            Pair pair = (Pair) message.obj;
                            zzase zzaseVar = this.zzF;
                            zzase zzaseVar2 = (zzase) pair.first;
                            this.zzF = zzaseVar2;
                            Object obj = pair.second;
                            if (zzaseVar == null) {
                                if (this.zzz > 0) {
                                    Pair zzy2 = zzy(this.zzA);
                                    i4 = this.zzz;
                                    this.zzz = 0;
                                    this.zzA = null;
                                    if (zzy2 == null) {
                                        zzA(obj, i4);
                                    } else {
                                        this.zzk = new zzaro(((Integer) zzy2.first).intValue(), ((Long) zzy2.second).longValue());
                                        zzarnVar5 = this.zzE;
                                        if (zzarnVar5 == null) {
                                            zzarnVar5 = this.zzC;
                                        }
                                        if (zzarnVar5 != null) {
                                            zzD(obj, i4);
                                        } else {
                                            int zza2 = this.zzF.zza(zzarnVar5.zzb);
                                            if (zza2 == -1) {
                                                if (zzt(zzarnVar5.zzg, zzaseVar, this.zzF) == -1) {
                                                    zzA(obj, i4);
                                                } else {
                                                    this.zzF.zzd(0, this.zzj, false);
                                                    Pair zzv = zzv(0, -9223372036854775807L);
                                                    int intValue3 = ((Integer) zzv.first).intValue();
                                                    long longValue2 = ((Long) zzv.second).longValue();
                                                    this.zzF.zzd(intValue3, this.zzj, true);
                                                    Object obj2 = this.zzj.zzb;
                                                    zzarnVar5.zzg = -1;
                                                    while (true) {
                                                        zzarnVar5 = zzarnVar5.zzl;
                                                        if (zzarnVar5 != null) {
                                                            zzarnVar5.zzg = true != zzarnVar5.zzb.equals(obj2) ? -1 : intValue3;
                                                        } else {
                                                            this.zzk = new zzaro(intValue3, zzu(intValue3, longValue2));
                                                            zzD(obj, i4);
                                                        }
                                                    }
                                                }
                                            } else {
                                                boolean zzO3 = zzO(0);
                                                zzarnVar5.zzg = 0;
                                                zzarnVar5.zzi = zzO3;
                                                boolean z8 = zzarnVar5 == this.zzD;
                                                zzaro zzaroVar6 = this.zzk;
                                                if (zzaroVar6.zza != 0) {
                                                    zzaro zzaroVar7 = new zzaro(0, zzaroVar6.zzb);
                                                    zzaroVar7.zzc = zzaroVar6.zzc;
                                                    zzaroVar7.zzd = zzaroVar6.zzd;
                                                    this.zzk = zzaroVar7;
                                                }
                                                while (true) {
                                                    zzarn zzarnVar21 = zzarnVar5.zzl;
                                                    if (zzarnVar21 != null) {
                                                        zza2 = this.zzF.zzf(zza2, this.zzj, this.zzi, this.zzv);
                                                        if (zza2 != -1 && zzarnVar21.zzb.equals(this.zzF.zzd(zza2, this.zzj, true).zzb)) {
                                                            boolean zzO4 = zzO(zza2);
                                                            zzarnVar21.zzg = zza2;
                                                            zzarnVar21.zzi = zzO4;
                                                            z8 |= zzarnVar21 == this.zzD;
                                                            zzarnVar5 = zzarnVar21;
                                                        }
                                                    }
                                                }
                                                zzD(obj, i4);
                                            }
                                        }
                                    }
                                } else if (this.zzk.zzb == -9223372036854775807L) {
                                    if (zzaseVar2.zzh()) {
                                        zzA(obj, 0);
                                    } else {
                                        Pair zzv2 = zzv(0, -9223372036854775807L);
                                        this.zzk = new zzaro(((Integer) zzv2.first).intValue(), ((Long) zzv2.second).longValue());
                                    }
                                }
                                return true;
                            }
                            i4 = 0;
                            zzarnVar5 = this.zzE;
                            if (zzarnVar5 == null) {
                            }
                            if (zzarnVar5 != null) {
                            }
                            return true;
                        case 8:
                            zzawz zzawzVar = (zzawz) message.obj;
                            zzarn zzarnVar22 = this.zzC;
                            if (zzarnVar22 != null && zzarnVar22.zza == zzawzVar) {
                                zzarnVar22.zzj = true;
                                zzarnVar22.zze();
                                zzarnVar22.zzh = zzarnVar22.zza(zzarnVar22.zzh, false);
                                if (this.zzE == null) {
                                    zzarn zzarnVar23 = this.zzC;
                                    this.zzD = zzarnVar23;
                                    zzF(zzarnVar23.zzh);
                                    zzI(this.zzD);
                                }
                                zzB();
                            }
                            return true;
                        case 9:
                            zzawz zzawzVar2 = (zzawz) message.obj;
                            zzarn zzarnVar24 = this.zzC;
                            if (zzarnVar24 != null && zzarnVar24.zza == zzawzVar2) {
                                zzB();
                            }
                            return true;
                        case 10:
                            zzarn zzarnVar25 = this.zzE;
                            if (zzarnVar25 != null) {
                                boolean z9 = true;
                                while (true) {
                                    if (zzarnVar25 != null && zzarnVar25.zzj) {
                                        if (zzarnVar25.zze()) {
                                            if (z9) {
                                                zzarn zzarnVar26 = this.zzD;
                                                zzarn zzarnVar27 = this.zzE;
                                                boolean z10 = zzarnVar26 != zzarnVar27;
                                                zzR(zzarnVar27.zzl);
                                                zzarn zzarnVar28 = this.zzE;
                                                zzarnVar28.zzl = null;
                                                this.zzC = zzarnVar28;
                                                this.zzD = zzarnVar28;
                                                boolean[] zArr = new boolean[2];
                                                long zzb = zzarnVar28.zzb(this.zzk.zzc, z10, zArr);
                                                if (zzb != this.zzk.zzc) {
                                                    this.zzk.zzc = zzb;
                                                    zzF(zzb);
                                                }
                                                boolean[] zArr2 = new boolean[2];
                                                int i18 = 0;
                                                for (int i19 = 0; i19 < 2; i19++) {
                                                    zzary zzaryVar6 = this.zza[i19];
                                                    boolean z11 = zzaryVar6.zzb() != 0;
                                                    zArr2[i19] = z11;
                                                    zzaxl zzaxlVar3 = this.zzE.zzd[i19];
                                                    if (zzaxlVar3 != null) {
                                                        i18++;
                                                    }
                                                    if (z11) {
                                                        if (zzaxlVar3 != zzaryVar6.zzh()) {
                                                            if (zzaryVar6 == this.zzm) {
                                                                if (zzaxlVar3 == null) {
                                                                    this.zzd.zzd(this.zzn);
                                                                }
                                                                this.zzn = null;
                                                                this.zzm = null;
                                                            }
                                                            zzQ(zzaryVar6);
                                                            zzaryVar6.zzj();
                                                        } else if (zArr[i19]) {
                                                            zzaryVar6.zzu(this.zzB);
                                                        }
                                                    }
                                                }
                                                this.zzg.obtainMessage(3, zzarnVar25.zzm).sendToTarget();
                                                zzz(zArr2, i18);
                                            } else {
                                                this.zzC = zzarnVar25;
                                                for (zzarn zzarnVar29 = zzarnVar25.zzl; zzarnVar29 != null; zzarnVar29 = zzarnVar29.zzl) {
                                                    zzarnVar29.zzc();
                                                }
                                                zzarn zzarnVar30 = this.zzC;
                                                zzarnVar30.zzl = null;
                                                if (zzarnVar30.zzj) {
                                                    long j7 = zzarnVar30.zzh;
                                                    this.zzC.zza(Math.max(j7, this.zzB - (zzarnVar30.zzf - j7)), false);
                                                }
                                            }
                                            zzB();
                                            zzN();
                                            this.zze.sendEmptyMessage(2);
                                        } else {
                                            z9 &= zzarnVar25 != this.zzD;
                                            zzarnVar25 = zzarnVar25.zzl;
                                        }
                                    }
                                }
                            }
                            return true;
                        case 11:
                            try {
                                for (zzari zzariVar : (zzari[]) message.obj) {
                                    zzariVar.zza.zzl(zzariVar.zzb, zzariVar.zzc);
                                }
                                if (this.zzo != null) {
                                    this.zze.sendEmptyMessage(2);
                                }
                                synchronized (this) {
                                    this.zzx++;
                                    notifyAll();
                                }
                                return true;
                            } catch (Throwable th2) {
                                synchronized (this) {
                                    this.zzx++;
                                    notifyAll();
                                    throw th2;
                                }
                            }
                        case 12:
                            int i20 = message.arg1;
                            this.zzv = i20;
                            zzarn zzarnVar31 = this.zzE;
                            if (zzarnVar31 == null) {
                                zzarnVar31 = this.zzC;
                            }
                            if (zzarnVar31 != null) {
                                boolean z12 = zzarnVar31 == this.zzD;
                                boolean z13 = zzarnVar31 == this.zzC;
                                int zzf2 = this.zzF.zzf(zzarnVar31.zzg, this.zzj, this.zzi, i20);
                                while (true) {
                                    zzarn zzarnVar32 = zzarnVar31.zzl;
                                    if (zzarnVar32 != null && zzf2 != -1 && (i5 = zzarnVar32.zzg) == zzf2) {
                                        z12 |= zzarnVar32 == this.zzD;
                                        z13 |= zzarnVar32 == this.zzC;
                                        zzf2 = this.zzF.zzf(i5, this.zzj, this.zzi, i20);
                                        zzarnVar31 = zzarnVar32;
                                    }
                                }
                                zzarnVar31.zzi = zzO(zzarnVar31.zzg);
                                if (!z13) {
                                    this.zzC = zzarnVar31;
                                }
                                if (!z12 && (zzarnVar6 = this.zzE) != null) {
                                    int i21 = zzarnVar6.zzg;
                                    this.zzk = new zzaro(i21, zzu(i21, this.zzk.zzc));
                                }
                                if (this.zzu == 4 && i20 != 0) {
                                    zzJ(2);
                                }
                            }
                            return true;
                        default:
                            return false;
                    }
                } catch (zzarf e) {
                    zzarfVar = e;
                    z2 = true;
                    i2 = 8;
                    this.zzg.obtainMessage(i2, zzarfVar).sendToTarget();
                    zzL();
                    return z2;
                } catch (IOException e2) {
                    iOException = e2;
                    z = true;
                    i = 8;
                    this.zzg.obtainMessage(i, zzarf.zzb(iOException)).sendToTarget();
                    zzL();
                    return z;
                }
            } catch (zzarf e3) {
                z2 = true;
                i2 = 8;
                zzarfVar = e3;
            } catch (IOException e4) {
                z = true;
                i = 8;
                iOException = e4;
            }
        } catch (RuntimeException e5) {
            this.zzg.obtainMessage(8, zzarf.zzc(e5)).sendToTarget();
            zzL();
            return true;
        }
    }

    public final synchronized void zza(zzari... zzariVarArr) {
        if (this.zzq) {
            return;
        }
        int i = this.zzw;
        this.zzw = i + 1;
        this.zze.obtainMessage(11, zzariVarArr).sendToTarget();
        while (this.zzx <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void zzb() {
        this.zzG = true;
    }

    public final void zzc(int i) {
        this.zzI = i;
    }

    public final void zzd() {
        this.zzH = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final /* bridge */ /* synthetic */ void zze(zzaxn zzaxnVar) {
        this.zze.obtainMessage(9, (zzawz) zzaxnVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzf(zzawz zzawzVar) {
        this.zze.obtainMessage(8, zzawzVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzg(zzase zzaseVar, Object obj) {
        this.zze.obtainMessage(7, Pair.create(zzaseVar, null)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final void zzh() {
        this.zze.sendEmptyMessage(10);
    }

    public final void zzi(zzaxb zzaxbVar, boolean z) {
        this.zze.obtainMessage(0, 1, 0, zzaxbVar).sendToTarget();
    }

    public final synchronized void zzj() {
        if (this.zzq) {
            return;
        }
        this.zze.sendEmptyMessage(6);
        while (!this.zzq) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.zzf.quit();
    }

    public final void zzk(zzase zzaseVar, int i, long j) {
        this.zze.obtainMessage(3, new zzarp(zzaseVar, 0, j)).sendToTarget();
    }

    public final void zzl(zzari... zzariVarArr) {
        if (this.zzq) {
            return;
        }
        this.zzw++;
        this.zze.obtainMessage(11, zzariVarArr).sendToTarget();
    }

    public final void zzm(int i) {
        this.zzK = i;
    }

    public final void zzn(int i) {
        this.zzJ = i;
    }

    public final void zzo(boolean z) {
        this.zze.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zzp() {
        this.zze.sendEmptyMessage(5);
    }

    public final synchronized boolean zzq(zzari... zzariVarArr) {
        int i;
        if (this.zzq) {
            return true;
        }
        int i2 = this.zzw;
        this.zzw = i2 + 1;
        this.zze.obtainMessage(11, zzariVarArr).sendToTarget();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zzI;
        long j2 = elapsedRealtime + j;
        while (true) {
            i = this.zzx;
            if (i > i2 || j <= 0) {
                break;
            }
            try {
                wait(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            j = j2 - SystemClock.elapsedRealtime();
        }
        return i2 < i;
    }

    public final boolean zzr() {
        return this.zzH && this.zzI > 0;
    }

    public final synchronized boolean zzs() {
        if (this.zzq) {
            return true;
        }
        this.zze.sendEmptyMessage(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zzI;
        long j2 = elapsedRealtime + j;
        while (true) {
            if (!this.zzq) {
                if (j <= 0) {
                    break;
                }
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                j = j2 - SystemClock.elapsedRealtime();
            } else {
                this.zzf.quit();
                break;
            }
        }
        return this.zzq;
    }
}