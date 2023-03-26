package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.gl4;
import com.p7700g.p99005.rn2;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.yg1;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.xbill.DNS.TTL;
import org.xbill.DNS.Type;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadg implements zzyr {
    public static final zzyy zza = zzadc.zza;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzeg.zzZ("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zze = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID zzf = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map zzg;
    private long zzA;
    @z1
    private zzadf zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    @z1
    private zzdo zzJ;
    @z1
    private zzdo zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzyu zzai;
    private final zzadb zzh;
    private final zzadi zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzdy zzl;
    private final zzdy zzm;
    private final zzdy zzn;
    private final zzdy zzo;
    private final zzdy zzp;
    private final zzdy zzq;
    private final zzdy zzr;
    private final zzdy zzs;
    private final zzdy zzt;
    private final zzdy zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzadg() {
        this(0);
    }

    @t0
    public static final int zzn(int i) {
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
            case 238:
            case 241:
            case Type.IXFR /* 251 */:
            case 16871:
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
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case WKSRecord.Service.INGRES_NET /* 134 */:
            case rn2.u /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case yg1.D /* 183 */:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
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
            case 165:
            case 16877:
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
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    @t0
    public static final boolean zzo(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @RequiresNonNull({"#2.output"})
    private final int zzp(zzys zzysVar, zzadf zzadfVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzadfVar.zzb)) {
            zzx(zzysVar, zzb, i);
            int i3 = this.zzaa;
            zzw();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzadfVar.zzb)) {
            zzx(zzysVar, zzd, i);
            int i4 = this.zzaa;
            zzw();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzadfVar.zzb)) {
            zzx(zzysVar, zze, i);
            int i5 = this.zzaa;
            zzw();
            return i5;
        } else {
            zzzy zzzyVar = zzadfVar.zzV;
            if (!this.zzac) {
                if (zzadfVar.zzg) {
                    this.zzV &= -1073741825;
                    if (!this.zzad) {
                        ((zzyl) zzysVar).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & g15.b) != 128) {
                            this.zzag = this.zzn.zzH()[0];
                            this.zzad = true;
                        } else {
                            throw zzbp.zza("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b = this.zzag;
                    if ((b & 1) == 1) {
                        int i6 = b & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzyl) zzysVar).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            this.zzn.zzH()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                            this.zzn.zzF(0);
                            zzzyVar.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzzyVar.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i6 == 2) {
                            if (!this.zzae) {
                                ((zzyl) zzysVar).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i7 = this.zzaf * 4;
                            this.zzn.zzC(i7);
                            ((zzyl) zzysVar).zzn(this.zzn.zzH(), 0, i7, false);
                            this.zzZ += i7;
                            int i8 = (this.zzaf >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.zzv = ByteBuffer.allocate(i9);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.zzaf;
                                if (i10 >= i2) {
                                    break;
                                }
                                int zzn = this.zzn.zzn();
                                if (i10 % 2 == 0) {
                                    this.zzv.putShort((short) (zzn - i11));
                                } else {
                                    this.zzv.putInt(zzn - i11);
                                }
                                i10++;
                                i11 = zzn;
                            }
                            int i12 = (i - this.zzZ) - i11;
                            if ((i2 & 1) == 1) {
                                this.zzv.putInt(i12);
                            } else {
                                this.zzv.putShort((short) i12);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i9);
                            zzzyVar.zzr(this.zzt, i9, 1);
                            this.zzaa += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzadfVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzadfVar.zzb) ? zzadfVar.zzf > 0 : z) {
                    this.zzV |= 268435456;
                    this.zzu.zzC(0);
                    int zzd2 = (this.zzq.zzd() + i) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((zzd2 >> 24) & 255);
                    this.zzn.zzH()[1] = (byte) ((zzd2 >> 16) & 255);
                    this.zzn.zzH()[2] = (byte) ((zzd2 >> 8) & 255);
                    this.zzn.zzH()[3] = (byte) (zzd2 & 255);
                    zzzyVar.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = this.zzq.zzd() + i;
            if (!"V_MPEG4/ISO/AVC".equals(zzadfVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzadfVar.zzb)) {
                if (zzadfVar.zzS != null) {
                    zzcw.zzf(this.zzq.zzd() == 0);
                    zzadfVar.zzS.zzd(zzysVar);
                }
                while (true) {
                    int i13 = this.zzZ;
                    if (i13 >= zzd3) {
                        break;
                    }
                    int zzq = zzq(zzysVar, zzzyVar, zzd3 - i13);
                    this.zzZ += zzq;
                    this.zzaa += zzq;
                }
            } else {
                byte[] zzH = this.zzm.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i14 = zzadfVar.zzW;
                int i15 = 4 - i14;
                while (this.zzZ < zzd3) {
                    int i16 = this.zzab;
                    if (i16 == 0) {
                        int min = Math.min(i14, this.zzq.zza());
                        ((zzyl) zzysVar).zzn(zzH, i15 + min, i14 - min, false);
                        if (min > 0) {
                            this.zzq.zzB(zzH, i15, min);
                        }
                        this.zzZ += i14;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzzw.zzb(zzzyVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzq2 = zzq(zzysVar, zzzyVar, i16);
                        this.zzZ += zzq2;
                        this.zzaa += zzq2;
                        this.zzab -= zzq2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzadfVar.zzb)) {
                this.zzo.zzF(0);
                zzzw.zzb(zzzyVar, this.zzo, 4);
                this.zzaa += 4;
            }
            int i17 = this.zzaa;
            zzw();
            return i17;
        }
    }

    private final int zzq(zzys zzysVar, zzzy zzzyVar, int i) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 > 0) {
            int min = Math.min(i, zza2);
            zzzw.zzb(zzzyVar, this.zzq, min);
            return min;
        }
        return zzzw.zza(zzzyVar, zzysVar, i, false);
    }

    private final long zzr(long j) throws zzbp {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzeg.zzw(j, j2, 1000L);
        }
        throw zzbp.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i) throws zzbp {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbp.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzt(int i) throws zzbp {
        if (this.zzB != null) {
            return;
        }
        throw zzbp.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4 A[EDGE_INSN: B:61:0x00d4->B:50:0x00d4 ?: BREAK  , SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzu(zzadf zzadfVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzy;
        int i4;
        int zzc2;
        int zzd2;
        zzzz zzzzVar = zzadfVar.zzS;
        if (zzzzVar != null) {
            zzzzVar.zzc(zzadfVar.zzV, j, i, i2, i3, zzadfVar.zzi);
        } else {
            if (("S_TEXT/UTF8".equals(zzadfVar.zzb) || "S_TEXT/ASS".equals(zzadfVar.zzb) || "S_TEXT/WEBVTT".equals(zzadfVar.zzb)) && this.zzR <= 1) {
                long j2 = this.zzP;
                if (j2 != -9223372036854775807L) {
                    String str = zzadfVar.zzb;
                    byte[] zzH = this.zzr.zzH();
                    int hashCode = str.hashCode();
                    if (hashCode == 738597099) {
                        if (str.equals("S_TEXT/ASS")) {
                            c = 1;
                            if (c != 0) {
                            }
                            System.arraycopy(zzy, 0, zzH, i4, zzy.length);
                            zzc2 = this.zzr.zzc();
                            while (true) {
                                if (zzc2 >= this.zzr.zzd()) {
                                }
                                zzc2++;
                            }
                            zzzy zzzyVar = zzadfVar.zzV;
                            zzdy zzdyVar = this.zzr;
                            zzzw.zzb(zzzyVar, zzdyVar, zzdyVar.zzd());
                            zzd2 = this.zzr.zzd() + i2;
                            if ((i & 268435456) != 0) {
                            }
                            zzadfVar.zzV.zzs(j, i, zzd2, i3, zzadfVar.zzi);
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        System.arraycopy(zzy, 0, zzH, i4, zzy.length);
                        zzc2 = this.zzr.zzc();
                        while (true) {
                            if (zzc2 >= this.zzr.zzd()) {
                            }
                            zzc2++;
                        }
                        zzzy zzzyVar2 = zzadfVar.zzV;
                        zzdy zzdyVar2 = this.zzr;
                        zzzw.zzb(zzzyVar2, zzdyVar2, zzdyVar2.zzd());
                        zzd2 = this.zzr.zzd() + i2;
                        if ((i & 268435456) != 0) {
                        }
                        zzadfVar.zzV.zzs(j, i, zzd2, i3, zzadfVar.zzi);
                    } else if (hashCode != 1045209816) {
                        if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                            c = 0;
                            if (c != 0) {
                                zzy = zzy(j2, "%02d:%02d:%02d,%03d", 1000L);
                                i4 = 19;
                            } else if (c == 1) {
                                zzy = zzy(j2, "%01d:%02d:%02d:%02d", gc0.c);
                                i4 = 21;
                            } else if (c == 2) {
                                zzy = zzy(j2, "%02d:%02d:%02d.%03d", 1000L);
                                i4 = 25;
                            } else {
                                throw new IllegalArgumentException();
                            }
                            System.arraycopy(zzy, 0, zzH, i4, zzy.length);
                            zzc2 = this.zzr.zzc();
                            while (true) {
                                if (zzc2 >= this.zzr.zzd()) {
                                    break;
                                } else if (this.zzr.zzH()[zzc2] == 0) {
                                    this.zzr.zzE(zzc2);
                                    break;
                                } else {
                                    zzc2++;
                                }
                            }
                            zzzy zzzyVar22 = zzadfVar.zzV;
                            zzdy zzdyVar22 = this.zzr;
                            zzzw.zzb(zzzyVar22, zzdyVar22, zzdyVar22.zzd());
                            zzd2 = this.zzr.zzd() + i2;
                            if ((i & 268435456) != 0) {
                                if (this.zzR > 1) {
                                    this.zzu.zzC(0);
                                } else {
                                    int zzd3 = this.zzu.zzd();
                                    zzadfVar.zzV.zzr(this.zzu, zzd3, 2);
                                    zzd2 += zzd3;
                                }
                            }
                            zzadfVar.zzV.zzs(j, i, zzd2, i3, zzadfVar.zzi);
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        System.arraycopy(zzy, 0, zzH, i4, zzy.length);
                        zzc2 = this.zzr.zzc();
                        while (true) {
                            if (zzc2 >= this.zzr.zzd()) {
                            }
                            zzc2++;
                        }
                        zzzy zzzyVar222 = zzadfVar.zzV;
                        zzdy zzdyVar222 = this.zzr;
                        zzzw.zzb(zzzyVar222, zzdyVar222, zzdyVar222.zzd());
                        zzd2 = this.zzr.zzd() + i2;
                        if ((i & 268435456) != 0) {
                        }
                        zzadfVar.zzV.zzs(j, i, zzd2, i3, zzadfVar.zzi);
                    } else {
                        if (str.equals("S_TEXT/WEBVTT")) {
                            c = 2;
                            if (c != 0) {
                            }
                            System.arraycopy(zzy, 0, zzH, i4, zzy.length);
                            zzc2 = this.zzr.zzc();
                            while (true) {
                                if (zzc2 >= this.zzr.zzd()) {
                                }
                                zzc2++;
                            }
                            zzzy zzzyVar2222 = zzadfVar.zzV;
                            zzdy zzdyVar2222 = this.zzr;
                            zzzw.zzb(zzzyVar2222, zzdyVar2222, zzdyVar2222.zzd());
                            zzd2 = this.zzr.zzd() + i2;
                            if ((i & 268435456) != 0) {
                            }
                            zzadfVar.zzV.zzs(j, i, zzd2, i3, zzadfVar.zzi);
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        System.arraycopy(zzy, 0, zzH, i4, zzy.length);
                        zzc2 = this.zzr.zzc();
                        while (true) {
                            if (zzc2 >= this.zzr.zzd()) {
                            }
                            zzc2++;
                        }
                        zzzy zzzyVar22222 = zzadfVar.zzV;
                        zzdy zzdyVar22222 = this.zzr;
                        zzzw.zzb(zzzyVar22222, zzdyVar22222, zzdyVar22222.zzd());
                        zzd2 = this.zzr.zzd() + i2;
                        if ((i & 268435456) != 0) {
                        }
                        zzadfVar.zzV.zzs(j, i, zzd2, i3, zzadfVar.zzi);
                    }
                }
            }
            zzd2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzadfVar.zzV.zzs(j, i, zzd2, i3, zzadfVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzv(zzys zzysVar, int i) throws IOException {
        if (this.zzn.zzd() >= i) {
            return;
        }
        if (this.zzn.zzb() < i) {
            zzdy zzdyVar = this.zzn;
            int zzb2 = zzdyVar.zzb();
            zzdyVar.zzz(Math.max(zzb2 + zzb2, i));
        }
        ((zzyl) zzysVar).zzn(this.zzn.zzH(), this.zzn.zzd(), i - this.zzn.zzd(), false);
        this.zzn.zzE(i);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzx(zzys zzysVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzdy zzdyVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzdyVar.zzD(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzyl) zzysVar).zzn(this.zzr.zzH(), length, i, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzcw.zzd(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return zzeg.zzZ(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] zzz(@z1 int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzysVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzadf zzadfVar = (zzadf) this.zzj.valueAt(i);
                    zzadf.zzd(zzadfVar);
                    zzzz zzzzVar = zzadfVar.zzS;
                    if (zzzzVar != null) {
                        zzzzVar.zza(zzadfVar.zzV, zzadfVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzysVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzzrVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            } else if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzzrVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzai = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    @t0
    public final void zzc(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzw();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzzz zzzzVar = ((zzadf) this.zzj.valueAt(i)).zzS;
            if (zzzzVar != null) {
                zzzzVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return new zzadh().zza(zzysVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x027f, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("EBML lacing sample size out of range.", null);
     */
    @t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(int i, int i2, zzys zzysVar) throws IOException {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = 1;
        int i9 = 0;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzadf zzadfVar = (zzadf) this.zzj.get(this.zzT);
                if (this.zzW == 4 && "V_VP9".equals(zzadfVar.zzb)) {
                    this.zzu.zzC(i2);
                    ((zzyl) zzysVar).zzn(this.zzu.zzH(), 0, i2, false);
                    return;
                }
                ((zzyl) zzysVar).zzo(i2, false);
                return;
            } else if (i7 == 16877) {
                zzt(i);
                zzadf zzadfVar2 = this.zzB;
                if (zzadf.zza(zzadfVar2) != 1685485123 && zzadf.zza(zzadfVar2) != 1685480259) {
                    ((zzyl) zzysVar).zzo(i2, false);
                    return;
                }
                byte[] bArr = new byte[i2];
                zzadfVar2.zzM = bArr;
                ((zzyl) zzysVar).zzn(bArr, 0, i2, false);
                return;
            } else if (i7 == 16981) {
                zzt(i);
                byte[] bArr2 = new byte[i2];
                this.zzB.zzh = bArr2;
                ((zzyl) zzysVar).zzn(bArr2, 0, i2, false);
                return;
            } else if (i7 == 18402) {
                byte[] bArr3 = new byte[i2];
                ((zzyl) zzysVar).zzn(bArr3, 0, i2, false);
                zzt(i);
                this.zzB.zzi = new zzzx(1, bArr3, 0, 0);
                return;
            } else if (i7 == 21419) {
                Arrays.fill(this.zzp.zzH(), (byte) 0);
                ((zzyl) zzysVar).zzn(this.zzp.zzH(), 4 - i2, i2, false);
                this.zzp.zzF(0);
                this.zzD = (int) this.zzp.zzs();
                return;
            } else if (i7 == 25506) {
                zzt(i);
                byte[] bArr4 = new byte[i2];
                this.zzB.zzj = bArr4;
                ((zzyl) zzysVar).zzn(bArr4, 0, i2, false);
                return;
            } else if (i7 == 30322) {
                zzt(i);
                byte[] bArr5 = new byte[i2];
                this.zzB.zzu = bArr5;
                ((zzyl) zzysVar).zzn(bArr5, 0, i2, false);
                return;
            } else {
                throw zzbp.zza("Unexpected id: " + i7, null);
            }
        }
        int i10 = 8;
        if (this.zzN == 0) {
            this.zzT = (int) this.zzi.zzd(zzysVar, false, true, 8);
            this.zzU = this.zzi.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzC(0);
        }
        zzadf zzadfVar3 = (zzadf) this.zzj.get(this.zzT);
        if (zzadfVar3 == null) {
            ((zzyl) zzysVar).zzo(i2 - this.zzU, false);
            this.zzN = 0;
            return;
        }
        zzadf.zzd(zzadfVar3);
        if (this.zzN == 1) {
            zzv(zzysVar, 3);
            int i11 = (this.zzn.zzH()[2] & 6) >> 1;
            byte b = 255;
            if (i11 == 0) {
                this.zzR = 1;
                int[] zzz = zzz(this.zzS, 1);
                this.zzS = zzz;
                zzz[0] = (i2 - this.zzU) - 3;
            } else {
                zzv(zzysVar, 4);
                int i12 = (this.zzn.zzH()[3] & 255) + 1;
                this.zzR = i12;
                int[] zzz2 = zzz(this.zzS, i12);
                this.zzS = zzz2;
                if (i11 == 2) {
                    int i13 = this.zzU;
                    int i14 = this.zzR;
                    Arrays.fill(zzz2, 0, i14, ((i2 - i13) - 4) / i14);
                } else if (i11 == 1) {
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 4;
                    while (true) {
                        i3 = this.zzR - 1;
                        if (i15 >= i3) {
                            break;
                        }
                        this.zzS[i15] = 0;
                        do {
                            i17++;
                            zzv(zzysVar, i17);
                            i4 = this.zzn.zzH()[i17 - 1] & 255;
                            int[] iArr = this.zzS;
                            i5 = iArr[i15] + i4;
                            iArr[i15] = i5;
                        } while (i4 == 255);
                        i16 += i5;
                        i15++;
                    }
                    this.zzS[i3] = ((i2 - this.zzU) - i17) - i16;
                } else if (i11 != 3) {
                    throw zzbp.zza("Unexpected lacing value: 2", null);
                } else {
                    int i18 = 0;
                    int i19 = 4;
                    int i20 = 0;
                    while (true) {
                        int i21 = this.zzR - 1;
                        if (i18 < i21) {
                            this.zzS[i18] = i9;
                            i19++;
                            zzv(zzysVar, i19);
                            int i22 = i19 - 1;
                            if (this.zzn.zzH()[i22] == 0) {
                                throw zzbp.zza("No valid varint length mask found", null);
                            }
                            int i23 = 0;
                            while (true) {
                                if (i23 >= i10) {
                                    j = 0;
                                    break;
                                }
                                int i24 = i8 << (7 - i23);
                                if ((this.zzn.zzH()[i22] & i24) != 0) {
                                    i19 += i23;
                                    zzv(zzysVar, i19);
                                    int i25 = i22 + 1;
                                    j = (~i24) & this.zzn.zzH()[i22] & b;
                                    while (i25 < i19) {
                                        j = (j << i10) | (this.zzn.zzH()[i25] & 255);
                                        i25++;
                                        i10 = 8;
                                    }
                                    if (i18 > 0) {
                                        j -= (1 << ((i23 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i23++;
                                    i8 = 1;
                                    i10 = 8;
                                    b = 255;
                                }
                            }
                            if (j < -2147483648L || j > TTL.MAX_VALUE) {
                                break;
                            }
                            int i26 = (int) j;
                            int[] iArr2 = this.zzS;
                            if (i18 != 0) {
                                i26 += iArr2[i18 - 1];
                            }
                            iArr2[i18] = i26;
                            i20 += i26;
                            i18++;
                            i8 = 1;
                            i9 = 0;
                            i10 = 8;
                            b = 255;
                        } else {
                            this.zzS[i21] = ((i2 - this.zzU) - i19) - i20;
                            break;
                        }
                    }
                }
            }
            this.zzO = this.zzI + zzr((this.zzn.zzH()[0] << 8) | (this.zzn.zzH()[1] & 255));
            if (zzadfVar3.zzd != 2) {
                if (i7 == 163) {
                    if ((this.zzn.zzH()[2] & g15.b) == 128) {
                        i7 = 163;
                    } else {
                        i7 = 163;
                    }
                }
                i6 = 0;
                this.zzV = i6;
                this.zzN = 2;
                this.zzQ = 0;
            }
            i6 = 1;
            this.zzV = i6;
            this.zzN = 2;
            this.zzQ = 0;
        }
        if (i7 == 163) {
            while (true) {
                int i27 = this.zzQ;
                if (i27 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzu(zzadfVar3, ((this.zzQ * zzadfVar3.zze) / 1000) + this.zzO, this.zzV, zzp(zzysVar, zzadfVar3, this.zzS[i27], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i28 = this.zzQ;
                if (i28 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i28] = zzp(zzysVar, zzadfVar3, iArr3[i28], true);
                this.zzQ++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d1, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    @t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(int i) throws zzbp {
        int i2;
        int i3;
        zzzu zzztVar;
        int i4;
        zzcw.zzb(this.zzai);
        char c = '\b';
        if (i == 160) {
            if (this.zzN != 2) {
                return;
            }
            zzadf zzadfVar = (zzadf) this.zzj.get(this.zzT);
            zzadf.zzd(zzadfVar);
            if (this.zzY > 0 && "A_OPUS".equals(zzadfVar.zzb)) {
                zzdy zzdyVar = this.zzu;
                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                zzdyVar.zzD(array, array.length);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.zzR; i6++) {
                i5 += this.zzS[i6];
            }
            int i7 = 0;
            while (i7 < this.zzR) {
                long j = this.zzO + ((zzadfVar.zze * i7) / 1000);
                int i8 = this.zzV;
                if (i7 == 0) {
                    if (!this.zzX) {
                        i8 |= 1;
                    }
                    i3 = i8;
                    i2 = 0;
                } else {
                    i2 = i7;
                    i3 = i8;
                }
                int i9 = this.zzS[i2];
                int i10 = i5 - i9;
                zzu(zzadfVar, j, i3, i9, i10);
                i7 = i2 + 1;
                i5 = i10;
            }
            this.zzN = 0;
        } else if (i == 174) {
            zzadf zzadfVar2 = this.zzB;
            zzcw.zzb(zzadfVar2);
            String str = zzadfVar2.zzb;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2095576542:
                        if (str.equals("V_MPEG4/ISO/AP")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -2095575984:
                        if (str.equals("V_MPEG4/ISO/SP")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1985379776:
                        if (str.equals("A_MS/ACM")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1784763192:
                        if (str.equals("A_TRUEHD")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1730367663:
                        if (str.equals("A_VORBIS")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641358:
                        if (str.equals("A_MPEG/L2")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1482641357:
                        if (str.equals("A_MPEG/L3")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1373388978:
                        if (str.equals("V_MS/VFW/FOURCC")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -933872740:
                        if (str.equals("S_DVBSUB")) {
                            c = gl4.R;
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363189:
                        if (str.equals("V_MPEG4/ISO/ASP")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -538363109:
                        if (str.equals("V_MPEG4/ISO/AVC")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -425012669:
                        if (str.equals("S_VOBSUB")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -356037306:
                        if (str.equals("A_DTS/LOSSLESS")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923557:
                        if (str.equals("A_AAC")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 62923603:
                        if (str.equals("A_AC3")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 62927045:
                        if (str.equals("A_DTS")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82318131:
                        if (str.equals("V_AV1")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82338133:
                        if (str.equals("V_VP8")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 82338134:
                        if (str.equals("V_VP9")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99146302:
                        if (str.equals("S_HDMV/PGS")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 444813526:
                        if (str.equals("V_THEORA")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 542569478:
                        if (str.equals("A_DTS/EXPRESS")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 635596514:
                        if (str.equals("A_PCM/FLOAT/IEEE")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725948237:
                        if (str.equals("A_PCM/INT/BIG")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 725957860:
                        if (str.equals("A_PCM/INT/LIT")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 738597099:
                        if (str.equals("S_TEXT/ASS")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 855502857:
                        break;
                    case 1045209816:
                        if (str.equals("S_TEXT/WEBVTT")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1422270023:
                        if (str.equals("S_TEXT/UTF8")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1809237540:
                        if (str.equals("V_MPEG2")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950749482:
                        if (str.equals("A_EAC3")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1950789798:
                        if (str.equals("A_FLAC")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1951062397:
                        if (str.equals("A_OPUS")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                        zzadfVar2.zze(this.zzai, zzadfVar2.zzc);
                        this.zzj.put(zzadfVar2.zzc, zzadfVar2);
                        break;
                }
                this.zzB = null;
                return;
            }
            throw zzbp.zza("CodecId is missing in TrackEntry element", null);
        } else if (i == 19899) {
            int i11 = this.zzD;
            if (i11 != -1) {
                long j2 = this.zzE;
                if (j2 != -1) {
                    if (i11 == 475249515) {
                        this.zzG = j2;
                        return;
                    }
                    return;
                }
            }
            throw zzbp.zza("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i == 25152) {
            zzt(i);
            zzadf zzadfVar3 = this.zzB;
            if (zzadfVar3.zzg) {
                if (zzadfVar3.zzi != null) {
                    zzadfVar3.zzk = new zzv(null, new zzu(zzm.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                throw zzbp.zza("Encrypted Track found but ContentEncKeyID was not found", null);
            }
        } else if (i == 28032) {
            zzt(i);
            zzadf zzadfVar4 = this.zzB;
            if (zzadfVar4.zzg && zzadfVar4.zzh != null) {
                throw zzbp.zza("Combining encryption and compression is not supported", null);
            }
        } else if (i == 357149030) {
            if (this.zzy == -9223372036854775807L) {
                this.zzy = 1000000L;
            }
            long j3 = this.zzz;
            if (j3 != -9223372036854775807L) {
                this.zzA = zzr(j3);
            }
        } else if (i == 374648427) {
            if (this.zzj.size() != 0) {
                this.zzai.zzB();
                return;
            }
            throw zzbp.zza("No valid tracks were found", null);
        } else if (i == 475249515) {
            if (!this.zzC) {
                zzyu zzyuVar = this.zzai;
                zzdo zzdoVar = this.zzJ;
                zzdo zzdoVar2 = this.zzK;
                if (this.zzx != -1 && this.zzA != -9223372036854775807L && zzdoVar != null && zzdoVar.zza() != 0 && zzdoVar2 != null && zzdoVar2.zza() == zzdoVar.zza()) {
                    int zza2 = zzdoVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i12 = 0; i12 < zza2; i12++) {
                        jArr3[i12] = zzdoVar.zzb(i12);
                        jArr[i12] = zzdoVar2.zzb(i12) + this.zzx;
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = zza2 - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArr[i13] = (int) (jArr[i14] - jArr[i13]);
                        jArr2[i13] = jArr3[i14] - jArr3[i13];
                        i13 = i14;
                    }
                    iArr[i4] = (int) ((this.zzx + this.zzw) - jArr[i4]);
                    long j4 = this.zzA - jArr3[i4];
                    jArr2[i4] = j4;
                    if (j4 <= 0) {
                        iArr = Arrays.copyOf(iArr, i4);
                        jArr = Arrays.copyOf(jArr, i4);
                        jArr2 = Arrays.copyOf(jArr2, i4);
                        jArr3 = Arrays.copyOf(jArr3, i4);
                    }
                    zzztVar = new zzyj(iArr, jArr, jArr2, jArr3);
                } else {
                    zzztVar = new zzzt(this.zzA, 0L);
                }
                zzyuVar.zzL(zzztVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
        }
    }

    @t0
    public final void zzi(int i, double d) throws zzbp {
        if (i == 181) {
            zzt(i);
            this.zzB.zzP = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzt(i);
                    this.zzB.zzC = (float) d;
                    return;
                case 21970:
                    zzt(i);
                    this.zzB.zzD = (float) d;
                    return;
                case 21971:
                    zzt(i);
                    this.zzB.zzE = (float) d;
                    return;
                case 21972:
                    zzt(i);
                    this.zzB.zzF = (float) d;
                    return;
                case 21973:
                    zzt(i);
                    this.zzB.zzG = (float) d;
                    return;
                case 21974:
                    zzt(i);
                    this.zzB.zzH = (float) d;
                    return;
                case 21975:
                    zzt(i);
                    this.zzB.zzI = (float) d;
                    return;
                case 21976:
                    zzt(i);
                    this.zzB.zzJ = (float) d;
                    return;
                case 21977:
                    zzt(i);
                    this.zzB.zzK = (float) d;
                    return;
                case 21978:
                    zzt(i);
                    this.zzB.zzL = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzt(i);
                            this.zzB.zzr = (float) d;
                            return;
                        case 30324:
                            zzt(i);
                            this.zzB.zzs = (float) d;
                            return;
                        case 30325:
                            zzt(i);
                            this.zzB.zzt = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d;
        }
    }

    @t0
    public final void zzj(int i, long j) throws zzbp {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzbp.zza("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzbp.zza("ContentEncodingScope " + j + " not supported", null);
        } else {
            switch (i) {
                case WKSRecord.Service.CISCO_TNA /* 131 */:
                    zzt(i);
                    this.zzB.zzd = (int) j;
                    return;
                case WKSRecord.Service.PROFILE /* 136 */:
                    zzt(i);
                    this.zzB.zzU = j == 1;
                    return;
                case 155:
                    this.zzP = zzr(j);
                    return;
                case 159:
                    zzt(i);
                    this.zzB.zzN = (int) j;
                    return;
                case 176:
                    zzt(i);
                    this.zzB.zzl = (int) j;
                    return;
                case 179:
                    zzs(i);
                    this.zzJ.zzc(zzr(j));
                    return;
                case yg1.G /* 186 */:
                    zzt(i);
                    this.zzB.zzm = (int) j;
                    return;
                case 215:
                    zzt(i);
                    this.zzB.zzc = (int) j;
                    return;
                case 231:
                    this.zzI = zzr(j);
                    return;
                case 238:
                    this.zzW = (int) j;
                    return;
                case 241:
                    if (this.zzL) {
                        return;
                    }
                    zzs(i);
                    this.zzK.zzc(j);
                    this.zzL = true;
                    return;
                case Type.IXFR /* 251 */:
                    this.zzX = true;
                    return;
                case 16871:
                    zzt(i);
                    zzadf.zzb(this.zzB, (int) j);
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw zzbp.zza("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j < 1 || j > 2) {
                        throw zzbp.zza("DocTypeReadVersion " + j + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw zzbp.zza("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw zzbp.zza("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw zzbp.zza("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.zzE = j + this.zzx;
                    return;
                case 21432:
                    zzt(i);
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.zzB.zzv = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzB.zzv = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzB.zzv = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzB.zzv = 3;
                        return;
                    }
                case 21680:
                    zzt(i);
                    this.zzB.zzn = (int) j;
                    return;
                case 21682:
                    zzt(i);
                    this.zzB.zzp = (int) j;
                    return;
                case 21690:
                    zzt(i);
                    this.zzB.zzo = (int) j;
                    return;
                case 21930:
                    zzt(i);
                    this.zzB.zzT = j == 1;
                    return;
                case 21998:
                    zzt(i);
                    this.zzB.zzf = (int) j;
                    return;
                case 22186:
                    zzt(i);
                    this.zzB.zzQ = j;
                    return;
                case 22203:
                    zzt(i);
                    this.zzB.zzR = j;
                    return;
                case 25188:
                    zzt(i);
                    this.zzB.zzO = (int) j;
                    return;
                case 30114:
                    this.zzY = j;
                    return;
                case 30321:
                    zzt(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        this.zzB.zzq = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzB.zzq = 1;
                        return;
                    } else if (i3 == 2) {
                        this.zzB.zzq = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.zzB.zzq = 3;
                        return;
                    }
                case 2352003:
                    zzt(i);
                    this.zzB.zze = (int) j;
                    return;
                case 2807729:
                    this.zzy = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            zzt(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                this.zzB.zzz = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzB.zzz = 1;
                                return;
                            }
                        case 21946:
                            zzt(i);
                            int zzb2 = zzo.zzb((int) j);
                            if (zzb2 != -1) {
                                this.zzB.zzy = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzt(i);
                            zzadf zzadfVar = this.zzB;
                            zzadfVar.zzw = true;
                            int zza2 = zzo.zza((int) j);
                            if (zza2 != -1) {
                                zzadfVar.zzx = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzt(i);
                            this.zzB.zzA = (int) j;
                            return;
                        case 21949:
                            zzt(i);
                            this.zzB.zzB = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    @t0
    public final void zzk(int i, long j, long j2) throws zzbp {
        zzcw.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
        } else if (i == 174) {
            this.zzB = new zzadf();
        } else if (i == 187) {
            this.zzL = false;
        } else if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
        } else if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
        } else if (i == 21968) {
            zzt(i);
            this.zzB.zzw = true;
        } else if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzbp.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
        } else if (i == 475249515) {
            this.zzJ = new zzdo(32);
            this.zzK = new zzdo(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
                return;
            }
            this.zzai.zzL(new zzzt(this.zzA, 0L));
            this.zzC = true;
        }
    }

    @t0
    public final void zzl(int i, String str) throws zzbp {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbp.zza("DocType " + str + " not supported", null);
        } else if (i == 21358) {
            zzt(i);
            this.zzB.zza = str;
        } else if (i != 2274716) {
        } else {
            zzt(i);
            zzadf.zzc(this.zzB, str);
        }
    }

    public zzadg(int i) {
        zzacz zzaczVar = new zzacz();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzaczVar;
        zzaczVar.zza(new zzade(this, null));
        this.zzk = true;
        this.zzi = new zzadi();
        this.zzj = new SparseArray();
        this.zzn = new zzdy(4);
        this.zzo = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdy(4);
        this.zzl = new zzdy(zzzo.zza);
        this.zzm = new zzdy(4);
        this.zzq = new zzdy();
        this.zzr = new zzdy();
        this.zzs = new zzdy(8);
        this.zzt = new zzdy();
        this.zzu = new zzdy();
        this.zzS = new int[1];
    }
}