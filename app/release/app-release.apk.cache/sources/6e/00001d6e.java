package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.q95;
import com.p7700g.p99005.rn2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.yg1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import org.xbill.DNS.TTL;
import org.xbill.DNS.Type;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzauo implements zzatw {
    public static final zzaty zza = new zzauj();
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzd = new UUID(72057594037932032L, -9223371306706625679L);
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private zzazc zzE;
    private zzazc zzF;
    private boolean zzG;
    private int zzH;
    private long zzI;
    private long zzJ;
    private int zzK;
    private int zzL;
    private int[] zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private byte zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzatx zzab;
    private final zzaui zzac;
    private final zzauq zze;
    private final SparseArray zzf;
    private final boolean zzg;
    private final zzazh zzh;
    private final zzazh zzi;
    private final zzazh zzj;
    private final zzazh zzk;
    private final zzazh zzl;
    private final zzazh zzm;
    private final zzazh zzn;
    private final zzazh zzo;
    private final zzazh zzp;
    private ByteBuffer zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private zzaun zzw;
    private boolean zzx;
    private int zzy;
    private long zzz;

    public zzauo() {
        this(0);
    }

    public static final int zzl(int i) {
        switch (i) {
            case WKSRecord.Service.CISCO_TNA /* 131 */:
            case WKSRecord.Service.PROFILE /* 136 */:
            case 155:
            case 159:
            case 176:
            case 179:
            case yg1.G /* 186 */:
            case 215:
            case 231:
            case 241:
            case Type.IXFR /* 251 */:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case WKSRecord.Service.INGRES_NET /* 134 */:
            case rn2.u /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case yg1.D /* 183 */:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean zzm(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    private final long zzn(long j) throws zzarw {
        long j2 = this.zzt;
        if (j2 != -9223372036854775807L) {
            return zzazo.zzj(j, j2, 1000L);
        }
        throw new zzarw("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void zzo(zzaun zzaunVar, long j) {
        byte[] zzq;
        if ("S_TEXT/UTF8".equals(zzaunVar.zza)) {
            byte[] bArr = this.zzn.zza;
            long j2 = this.zzJ;
            if (j2 == -9223372036854775807L) {
                zzq = zzc;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                int i3 = (int) (j4 / 1000000);
                zzq = zzazo.zzq(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * q95.a)) / 1000))));
            }
            System.arraycopy(zzq, 0, bArr, 19, 12);
            zzauf zzaufVar = zzaunVar.zzN;
            zzazh zzazhVar = this.zzn;
            zzaufVar.zzb(zzazhVar, zzazhVar.zzd());
            this.zzY = this.zzn.zzd() + this.zzY;
        }
        zzaunVar.zzN.zzc(j, this.zzP, this.zzY, 0, zzaunVar.zzg);
        this.zzZ = true;
        zzp();
    }

    private final void zzp() {
        this.zzQ = 0;
        this.zzY = 0;
        this.zzX = 0;
        this.zzR = false;
        this.zzS = false;
        this.zzU = false;
        this.zzW = 0;
        this.zzV = (byte) 0;
        this.zzT = false;
        this.zzm.zzr();
    }

    private static int[] zzq(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final int zzr(zzatv zzatvVar, zzauf zzaufVar, int i) throws IOException, InterruptedException {
        int zzd2;
        int zza2 = this.zzm.zza();
        if (zza2 > 0) {
            zzd2 = Math.min(i, zza2);
            zzaufVar.zzb(this.zzm, zzd2);
        } else {
            zzd2 = zzaufVar.zzd(zzatvVar, i, false);
        }
        this.zzQ += zzd2;
        this.zzY += zzd2;
        return zzd2;
    }

    private final void zzs(zzatv zzatvVar, int i) throws IOException, InterruptedException {
        if (this.zzj.zzd() >= i) {
            return;
        }
        if (this.zzj.zzb() < i) {
            zzazh zzazhVar = this.zzj;
            byte[] bArr = zzazhVar.zza;
            int length = bArr.length;
            zzazhVar.zzt(Arrays.copyOf(bArr, Math.max(length + length, i)), this.zzj.zzd());
        }
        zzazh zzazhVar2 = this.zzj;
        zzatvVar.zzh(zzazhVar2.zza, zzazhVar2.zzd(), i - this.zzj.zzd(), false);
        this.zzj.zzu(i);
    }

    private final void zzt(zzatv zzatvVar, zzaun zzaunVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaunVar.zza)) {
            int i3 = i + 32;
            if (this.zzn.zzb() < i3) {
                this.zzn.zza = Arrays.copyOf(zzb, i3 + i);
            }
            zzatvVar.zzh(this.zzn.zza, 32, i, false);
            this.zzn.zzv(0);
            this.zzn.zzu(i3);
            return;
        }
        zzauf zzaufVar = zzaunVar.zzN;
        if (!this.zzR) {
            if (zzaunVar.zze) {
                this.zzP &= -1073741825;
                if (!this.zzS) {
                    zzatvVar.zzh(this.zzj.zza, 0, 1, false);
                    this.zzQ++;
                    byte b = this.zzj.zza[0];
                    if ((b & g15.b) != 128) {
                        this.zzV = b;
                        this.zzS = true;
                    } else {
                        throw new zzarw("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.zzV;
                if ((b2 & 1) == 1) {
                    int i4 = b2 & 2;
                    this.zzP |= 1073741824;
                    if (!this.zzT) {
                        zzatvVar.zzh(this.zzo.zza, 0, 8, false);
                        this.zzQ += 8;
                        this.zzT = true;
                        zzazh zzazhVar = this.zzj;
                        zzazhVar.zza[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                        zzazhVar.zzv(0);
                        zzaufVar.zzb(this.zzj, 1);
                        this.zzY++;
                        this.zzo.zzv(0);
                        zzaufVar.zzb(this.zzo, 8);
                        this.zzY += 8;
                    }
                    if (i4 == 2) {
                        if (!this.zzU) {
                            zzatvVar.zzh(this.zzj.zza, 0, 1, false);
                            this.zzQ++;
                            this.zzj.zzv(0);
                            this.zzW = this.zzj.zzg();
                            this.zzU = true;
                        }
                        int i5 = this.zzW * 4;
                        this.zzj.zzs(i5);
                        zzatvVar.zzh(this.zzj.zza, 0, i5, false);
                        this.zzQ += i5;
                        int i6 = (this.zzW >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzq;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.zzq = ByteBuffer.allocate(i7);
                        }
                        this.zzq.position(0);
                        this.zzq.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.zzW;
                            if (i8 >= i2) {
                                break;
                            }
                            int zzi = this.zzj.zzi();
                            if (i8 % 2 == 0) {
                                this.zzq.putShort((short) (zzi - i9));
                            } else {
                                this.zzq.putInt(zzi - i9);
                            }
                            i8++;
                            i9 = zzi;
                        }
                        int i10 = (i - this.zzQ) - i9;
                        if ((i2 & 1) == 1) {
                            this.zzq.putInt(i10);
                        } else {
                            this.zzq.putShort((short) i10);
                            this.zzq.putInt(0);
                        }
                        this.zzp.zzt(this.zzq.array(), i7);
                        zzaufVar.zzb(this.zzp, i7);
                        this.zzY += i7;
                    }
                }
            } else {
                byte[] bArr = zzaunVar.zzf;
                if (bArr != null) {
                    this.zzm.zzt(bArr, bArr.length);
                }
            }
            this.zzR = true;
        }
        int zzd2 = this.zzm.zzd() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzaunVar.zza) && !"V_MPEGH/ISO/HEVC".equals(zzaunVar.zza)) {
            while (true) {
                int i11 = this.zzQ;
                if (i11 >= zzd2) {
                    break;
                }
                zzr(zzatvVar, zzaufVar, zzd2 - i11);
            }
        } else {
            byte[] bArr2 = this.zzi.zza;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i12 = zzaunVar.zzO;
            int i13 = 4 - i12;
            while (this.zzQ < zzd2) {
                int i14 = this.zzX;
                if (i14 == 0) {
                    int min = Math.min(i12, this.zzm.zza());
                    zzatvVar.zzh(bArr2, i13 + min, i12 - min, false);
                    if (min > 0) {
                        this.zzm.zzq(bArr2, i13, min);
                    }
                    this.zzQ += i12;
                    this.zzi.zzv(0);
                    this.zzX = this.zzi.zzi();
                    this.zzh.zzv(0);
                    zzaufVar.zzb(this.zzh, 4);
                    this.zzY += 4;
                } else {
                    this.zzX = i14 - zzr(zzatvVar, zzaufVar, i14);
                }
            }
        }
        if ("A_VORBIS".equals(zzaunVar.zza)) {
            this.zzk.zzv(0);
            zzaufVar.zzb(this.zzk, 4);
            this.zzY += 4;
        }
    }

    public final void zzb(int i) throws zzarw {
        zzaud zzaucVar;
        zzazc zzazcVar;
        zzazc zzazcVar2;
        int i2;
        int i3 = 0;
        if (i == 160) {
            if (this.zzH != 2) {
                return;
            }
            if (!this.zzaa) {
                this.zzP |= 1;
            }
            zzo((zzaun) this.zzf.get(this.zzN), this.zzI);
            this.zzH = 0;
        } else if (i == 174) {
            String str = this.zzw.zza;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                zzaun zzaunVar = this.zzw;
                zzaunVar.zzb(this.zzab, zzaunVar.zzb);
                SparseArray sparseArray = this.zzf;
                zzaun zzaunVar2 = this.zzw;
                sparseArray.put(zzaunVar2.zzb, zzaunVar2);
            }
            this.zzw = null;
        } else if (i == 19899) {
            int i4 = this.zzy;
            if (i4 != -1) {
                long j = this.zzz;
                if (j != -1) {
                    if (i4 == 475249515) {
                        this.zzB = j;
                        return;
                    }
                    return;
                }
            }
            throw new zzarw("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            zzaun zzaunVar3 = this.zzw;
            if (zzaunVar3.zze) {
                if (zzaunVar3.zzg != null) {
                    zzaunVar3.zzi = new zzats(new zzatr(zzare.zzb, "video/webm", this.zzw.zzg.zzb, false));
                    return;
                }
                throw new zzarw("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (i == 28032) {
            zzaun zzaunVar4 = this.zzw;
            if (zzaunVar4.zze && zzaunVar4.zzf != null) {
                throw new zzarw("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (this.zzt == -9223372036854775807L) {
                this.zzt = 1000000L;
            }
            long j2 = this.zzu;
            if (j2 != -9223372036854775807L) {
                this.zzv = zzn(j2);
            }
        } else if (i != 374648427) {
            if (i == 475249515 && !this.zzx) {
                zzatx zzatxVar = this.zzab;
                if (this.zzs != -1 && this.zzv != -9223372036854775807L && (zzazcVar = this.zzE) != null && zzazcVar.zza() != 0 && (zzazcVar2 = this.zzF) != null && zzazcVar2.zza() == zzazcVar.zza()) {
                    int zza2 = zzazcVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i5 = 0; i5 < zza2; i5++) {
                        jArr3[i5] = this.zzE.zzb(i5);
                        jArr[i5] = this.zzF.zzb(i5) + this.zzs;
                    }
                    while (true) {
                        i2 = zza2 - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i6 = i3 + 1;
                        iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                        jArr2[i3] = jArr3[i6] - jArr3[i3];
                        i3 = i6;
                    }
                    iArr[i2] = (int) ((this.zzs + this.zzr) - jArr[i2]);
                    jArr2[i2] = this.zzv - jArr3[i2];
                    this.zzE = null;
                    this.zzF = null;
                    zzaucVar = new zzatu(iArr, jArr, jArr2, jArr3);
                } else {
                    this.zzE = null;
                    this.zzF = null;
                    zzaucVar = new zzauc(this.zzv);
                }
                zzatxVar.zzc(zzaucVar);
                this.zzx = true;
            }
        } else if (this.zzf.size() != 0) {
            this.zzab.zzb();
        } else {
            throw new zzarw("No valid tracks were found");
        }
    }

    public final void zzc(int i, double d) {
        if (i == 181) {
            this.zzw.zzI = (int) d;
        } else if (i == 17545) {
            this.zzu = (long) d;
        } else {
            switch (i) {
                case 21969:
                    this.zzw.zzw = (float) d;
                    return;
                case 21970:
                    this.zzw.zzx = (float) d;
                    return;
                case 21971:
                    this.zzw.zzy = (float) d;
                    return;
                case 21972:
                    this.zzw.zzz = (float) d;
                    return;
                case 21973:
                    this.zzw.zzA = (float) d;
                    return;
                case 21974:
                    this.zzw.zzB = (float) d;
                    return;
                case 21975:
                    this.zzw.zzC = (float) d;
                    return;
                case 21976:
                    this.zzw.zzD = (float) d;
                    return;
                case 21977:
                    this.zzw.zzE = (float) d;
                    return;
                case 21978:
                    this.zzw.zzF = (float) d;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatxVar) {
        this.zzab = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zze(long j, long j2) {
        this.zzD = -9223372036854775807L;
        this.zzH = 0;
        this.zzac.zza();
        this.zze.zzd();
        zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final int zzf(zzatv zzatvVar, zzaub zzaubVar) throws IOException, InterruptedException {
        this.zzZ = false;
        while (!this.zzZ) {
            if (!this.zzac.zzc(zzatvVar)) {
                return -1;
            }
            long zzd2 = zzatvVar.zzd();
            if (this.zzA) {
                this.zzC = zzd2;
                zzaubVar.zza = this.zzB;
                this.zzA = false;
                return 1;
            } else if (this.zzx) {
                long j = this.zzC;
                if (j != -1) {
                    zzaubVar.zza = j;
                    this.zzC = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatvVar) throws IOException, InterruptedException {
        return new zzaup().zza(zzatvVar);
    }

    public final void zzh(int i, long j) throws zzarw {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new zzarw("ContentEncodingOrder " + j + " not supported");
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new zzarw("ContentEncodingScope " + j + " not supported");
        } else {
            switch (i) {
                case WKSRecord.Service.CISCO_TNA /* 131 */:
                    this.zzw.zzc = (int) j;
                    return;
                case WKSRecord.Service.PROFILE /* 136 */:
                    this.zzw.zzL = j == 1;
                    return;
                case 155:
                    this.zzJ = zzn(j);
                    return;
                case 159:
                    this.zzw.zzG = (int) j;
                    return;
                case 176:
                    this.zzw.zzj = (int) j;
                    return;
                case 179:
                    this.zzE.zzc(zzn(j));
                    return;
                case yg1.G /* 186 */:
                    this.zzw.zzk = (int) j;
                    return;
                case 215:
                    this.zzw.zzb = (int) j;
                    return;
                case 231:
                    this.zzD = zzn(j);
                    return;
                case 241:
                    if (this.zzG) {
                        return;
                    }
                    this.zzF.zzc(j);
                    this.zzG = true;
                    return;
                case Type.IXFR /* 251 */:
                    this.zzaa = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw new zzarw("ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw new zzarw("DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw new zzarw("EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw new zzarw("ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw new zzarw("AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    this.zzz = j + this.zzs;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.zzw.zzp = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzw.zzp = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzw.zzp = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzw.zzp = 3;
                        return;
                    }
                case 21680:
                    this.zzw.zzl = (int) j;
                    return;
                case 21682:
                    this.zzw.zzn = (int) j;
                    return;
                case 21690:
                    this.zzw.zzm = (int) j;
                    return;
                case 21930:
                    this.zzw.zzM = j == 1;
                    return;
                case 22186:
                    this.zzw.zzJ = j;
                    return;
                case 22203:
                    this.zzw.zzK = j;
                    return;
                case 25188:
                    this.zzw.zzH = (int) j;
                    return;
                case 2352003:
                    this.zzw.zzd = (int) j;
                    return;
                case 2807729:
                    this.zzt = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.zzw.zzt = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.zzw.zzt = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.zzw.zzs = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.zzw.zzs = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.zzw.zzs = 3;
                            return;
                        case 21947:
                            zzaun zzaunVar = this.zzw;
                            zzaunVar.zzq = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                zzaunVar.zzr = 1;
                                return;
                            } else if (i5 == 9) {
                                zzaunVar.zzr = 6;
                                return;
                            } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                zzaunVar.zzr = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzw.zzu = (int) j;
                            return;
                        case 21949:
                            this.zzw.zzv = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void zzi(int i, long j, long j2) throws zzarw {
        if (i == 160) {
            this.zzaa = false;
        } else if (i == 174) {
            this.zzw = new zzaun(null);
        } else if (i == 187) {
            this.zzG = false;
        } else if (i == 19899) {
            this.zzy = -1;
            this.zzz = -1L;
        } else if (i == 20533) {
            this.zzw.zze = true;
        } else if (i == 21968) {
            this.zzw.zzq = true;
        } else if (i == 408125543) {
            long j3 = this.zzs;
            if (j3 != -1 && j3 != j) {
                throw new zzarw("Multiple Segment elements not supported");
            }
            this.zzs = j;
            this.zzr = j2;
        } else if (i == 475249515) {
            this.zzE = new zzazc(32);
            this.zzF = new zzazc(32);
        } else if (i == 524531317 && !this.zzx) {
            if (this.zzg && this.zzB != -1) {
                this.zzA = true;
                return;
            }
            this.zzab.zzc(new zzauc(this.zzv));
            this.zzx = true;
        }
    }

    public final void zzj(int i, String str) throws zzarw {
        if (i == 134) {
            this.zzw.zza = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            zzaun.zza(this.zzw, str);
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new zzarw(wo1.u("DocType ", str, " not supported"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzk(int i, int i2, zzatv zzatvVar) throws IOException, InterruptedException {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = 1;
        int i9 = 0;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 16981) {
                byte[] bArr = new byte[i2];
                this.zzw.zzf = bArr;
                zzatvVar.zzh(bArr, 0, i2, false);
                return;
            } else if (i7 == 18402) {
                byte[] bArr2 = new byte[i2];
                zzatvVar.zzh(bArr2, 0, i2, false);
                this.zzw.zzg = new zzaue(1, bArr2);
                return;
            } else if (i7 == 21419) {
                Arrays.fill(this.zzl.zza, (byte) 0);
                zzatvVar.zzh(this.zzl.zza, 4 - i2, i2, false);
                this.zzl.zzv(0);
                this.zzy = (int) this.zzl.zzm();
                return;
            } else if (i7 == 25506) {
                byte[] bArr3 = new byte[i2];
                this.zzw.zzh = bArr3;
                zzatvVar.zzh(bArr3, 0, i2, false);
                return;
            } else if (i7 == 30322) {
                byte[] bArr4 = new byte[i2];
                this.zzw.zzo = bArr4;
                zzatvVar.zzh(bArr4, 0, i2, false);
                return;
            } else {
                throw new zzarw(wo1.l("Unexpected id: ", i7));
            }
        }
        int i10 = 8;
        if (this.zzH == 0) {
            this.zzN = (int) this.zze.zze(zzatvVar, false, true, 8);
            this.zzO = this.zze.zza();
            this.zzJ = -9223372036854775807L;
            this.zzH = 1;
            this.zzj.zzr();
        }
        zzaun zzaunVar = (zzaun) this.zzf.get(this.zzN);
        if (zzaunVar == null) {
            zzatvVar.zzi(i2 - this.zzO, false);
            this.zzH = 0;
            return;
        }
        if (this.zzH == 1) {
            zzs(zzatvVar, 3);
            int i11 = (this.zzj.zza[2] & 6) >> 1;
            byte b = 255;
            if (i11 == 0) {
                this.zzL = 1;
                int[] zzq = zzq(this.zzM, 1);
                this.zzM = zzq;
                zzq[0] = (i2 - this.zzO) - 3;
            } else if (i7 == 163) {
                int i12 = 4;
                zzs(zzatvVar, 4);
                int i13 = (this.zzj.zza[3] & 255) + 1;
                this.zzL = i13;
                int[] zzq2 = zzq(this.zzM, i13);
                this.zzM = zzq2;
                if (i11 == 2) {
                    int i14 = this.zzO;
                    int i15 = this.zzL;
                    Arrays.fill(zzq2, 0, i15, ((i2 - i14) - 4) / i15);
                } else if (i11 == 1) {
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        i3 = this.zzL - 1;
                        if (i16 >= i3) {
                            break;
                        }
                        this.zzM[i16] = 0;
                        do {
                            i12++;
                            zzs(zzatvVar, i12);
                            i4 = this.zzj.zza[i12 - 1] & 255;
                            int[] iArr = this.zzM;
                            i5 = iArr[i16] + i4;
                            iArr[i16] = i5;
                        } while (i4 == 255);
                        i17 += i5;
                        i16++;
                    }
                    this.zzM[i3] = ((i2 - this.zzO) - i12) - i17;
                } else {
                    if (i11 == 3) {
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = this.zzL - 1;
                            if (i18 < i20) {
                                this.zzM[i18] = i9;
                                i12++;
                                zzs(zzatvVar, i12);
                                int i21 = i12 - 1;
                                if (this.zzj.zza[i21] == 0) {
                                    throw new zzarw("No valid varint length mask found");
                                }
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= i10) {
                                        j = 0;
                                        break;
                                    }
                                    int i23 = i8 << (7 - i22);
                                    if ((this.zzj.zza[i21] & i23) != 0) {
                                        i12 += i22;
                                        zzs(zzatvVar, i12);
                                        int i24 = i10;
                                        j = (~i23) & this.zzj.zza[i21] & b;
                                        for (int i25 = i21 + 1; i25 < i12; i25++) {
                                            j = (j << i24) | (this.zzj.zza[i25] & b);
                                            i24 = 8;
                                            b = 255;
                                        }
                                        if (i18 > 0) {
                                            j -= (1 << ((i22 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i22++;
                                        i8 = 1;
                                        i10 = 8;
                                        b = 255;
                                    }
                                }
                                if (j < -2147483648L || j > TTL.MAX_VALUE) {
                                    break;
                                }
                                int i26 = (int) j;
                                int[] iArr2 = this.zzM;
                                if (i18 != 0) {
                                    i26 += iArr2[i18 - 1];
                                }
                                iArr2[i18] = i26;
                                i19 += i26;
                                i18++;
                                i8 = 1;
                                i10 = 8;
                                b = 255;
                                i9 = 0;
                            } else {
                                this.zzM[i20] = ((i2 - this.zzO) - i12) - i19;
                                break;
                            }
                        }
                        throw new zzarw("EBML lacing sample size out of range.");
                    }
                    throw new zzarw("Unexpected lacing value: 2");
                }
            } else {
                throw new zzarw("Lacing only supported in SimpleBlocks.");
            }
            byte[] bArr5 = this.zzj.zza;
            this.zzI = this.zzD + zzn((bArr5[1] & 255) | (bArr5[0] << 8));
            byte b2 = this.zzj.zza[2];
            int i27 = b2 & 8;
            if (zzaunVar.zzc != 2) {
                if (i7 == 163) {
                    if ((b2 & g15.b) == 128) {
                        i7 = 163;
                    } else {
                        i7 = 163;
                    }
                }
                i6 = 0;
                this.zzP = i6 | (i27 != 8 ? Integer.MIN_VALUE : 0);
                this.zzH = 2;
                this.zzK = 0;
            }
            i6 = 1;
            this.zzP = i6 | (i27 != 8 ? Integer.MIN_VALUE : 0);
            this.zzH = 2;
            this.zzK = 0;
        }
        if (i7 != 163) {
            zzt(zzatvVar, zzaunVar, this.zzM[0]);
            return;
        }
        while (true) {
            int i28 = this.zzK;
            if (i28 >= this.zzL) {
                this.zzH = 0;
                return;
            }
            zzt(zzatvVar, zzaunVar, this.zzM[i28]);
            zzo(zzaunVar, this.zzI + ((this.zzK * zzaunVar.zzd) / 1000));
            this.zzK++;
        }
    }

    public zzauo(int i) {
        zzaui zzauiVar = new zzaui();
        this.zzs = -1L;
        this.zzt = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzB = -1L;
        this.zzC = -1L;
        this.zzD = -9223372036854775807L;
        this.zzac = zzauiVar;
        zzauiVar.zzb(new zzaul(this, null));
        this.zzg = true;
        this.zze = new zzauq();
        this.zzf = new SparseArray();
        this.zzj = new zzazh(4);
        this.zzk = new zzazh(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzl = new zzazh(4);
        this.zzh = new zzazh(zzazf.zza);
        this.zzi = new zzazh(4);
        this.zzm = new zzazh();
        this.zzn = new zzazh();
        this.zzo = new zzazh(8);
        this.zzp = new zzazh();
    }
}