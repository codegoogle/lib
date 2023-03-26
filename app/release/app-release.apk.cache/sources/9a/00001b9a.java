package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.gl4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadf {
    public byte[] zzM;
    public zzzz zzS;
    public boolean zzT;
    public zzzy zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzzx zzi;
    public byte[] zzj;
    public zzv zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzdy zzdyVar) throws zzbp {
        try {
            zzdyVar.zzG(16);
            long zzq = zzdyVar.zzq();
            if (zzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzq != 826496599) {
                return new Pair("video/x-unknown", null);
            }
            int zzc = zzdyVar.zzc() + 20;
            byte[] zzH = zzdyVar.zzH();
            while (true) {
                int length = zzH.length;
                if (zzc < length - 4) {
                    if (zzH[zzc] == 0 && zzH[zzc + 1] == 0 && zzH[zzc + 2] == 1 && zzH[zzc + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH, zzc, length)));
                    }
                    zzc++;
                } else {
                    throw zzbp.zza("Failed to find FourCC VC1 initialization data", null);
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbp {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3] & 255;
                    if (i != 255) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] == 1) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, i8, bArr2, 0, i6);
                    int i10 = i8 + i6;
                    if (bArr[i10] == 3) {
                        int i11 = i10 + i9;
                        if (bArr[i11] == 5) {
                            int length = bArr.length - i11;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i11, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbp.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzbp.zza("Error parsing vorbis codec private", null);
                }
                throw zzbp.zza("Error parsing vorbis codec private", null);
            }
            throw zzbp.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzdy zzdyVar) throws zzbp {
        UUID uuid;
        UUID uuid2;
        try {
            int zzi = zzdyVar.zzi();
            if (zzi == 1) {
                return true;
            }
            if (zzi == 65534) {
                zzdyVar.zzF(24);
                long zzr = zzdyVar.zzr();
                uuid = zzadg.zzf;
                if (zzr == uuid.getMostSignificantBits()) {
                    long zzr2 = zzdyVar.zzr();
                    uuid2 = zzadg.zzf;
                    if (zzr2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbp {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbp.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0210, code lost:
        if (r9 == 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0213, code lost:
        r1 = null;
        r2 = null;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x022e, code lost:
        if (r9 != 0) goto L137;
     */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzyu zzyuVar, int i) throws zzbp {
        char c;
        List list;
        String str;
        int i2;
        String str2;
        List list2;
        ArrayList arrayList;
        int zzn;
        zzfrj zzfrjVar;
        byte[] bArr;
        int i3;
        int i4;
        Map map;
        Map map2;
        int i5;
        Map map3;
        zzyo zza;
        zzfrj zzfrjVar2;
        String str3 = this.zzb;
        int i6 = 1;
        int i7 = 3;
        int i8 = -1;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c = gl4.R;
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str3.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str3.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str3.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str3.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str3.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str4 = "audio/raw";
        zzo zzoVar = null;
        byte[] bArr2 = null;
        switch (c) {
            case 0:
                str4 = "video/x-vnd.on2.vp8";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 1:
                str4 = "video/x-vnd.on2.vp9";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 2:
                str4 = "video/av01";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 3:
                str4 = "video/mpeg2";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                str4 = "video/mp4v-es";
                zzfrjVar2 = bArr3 == null ? null : Collections.singletonList(bArr3);
                str2 = null;
                zzfrjVar = zzfrjVar2;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 7:
                zzya zza2 = zzya.zza(new zzdy(zzi(str3)));
                list = zza2.zza;
                this.zzW = zza2.zzb;
                str = zza2.zzf;
                str4 = "video/avc";
                i2 = -1;
                i7 = -1;
                List list3 = list;
                str2 = str;
                list2 = list3;
                break;
            case '\b':
                zzzh zza3 = zzzh.zza(new zzdy(zzi(str3)));
                list = zza3.zza;
                this.zzW = zza3.zzb;
                str = zza3.zzd;
                str4 = "video/hevc";
                i2 = -1;
                i7 = -1;
                List list32 = list;
                str2 = str;
                list2 = list32;
                break;
            case '\t':
                Pair zzf = zzf(new zzdy(zzi(str3)));
                str4 = (String) zzf.first;
                zzfrjVar2 = (List) zzf.second;
                str2 = null;
                zzfrjVar = zzfrjVar2;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case '\n':
                str4 = "video/x-unknown";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 11:
                str4 = "audio/vorbis";
                str2 = null;
                i2 = 8192;
                arrayList = zzg(zzi(str3));
                i7 = -1;
                list2 = arrayList;
                break;
            case '\f':
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(zzi(this.zzb));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList2.add(allocate.order(byteOrder).putLong(this.zzQ).array());
                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzR).array());
                str4 = "audio/opus";
                str2 = null;
                i2 = 5760;
                arrayList = arrayList2;
                i7 = -1;
                list2 = arrayList;
                break;
            case '\r':
                List singletonList = Collections.singletonList(zzi(str3));
                zzxs zza4 = zzxt.zza(this.zzj);
                this.zzP = zza4.zza;
                this.zzN = zza4.zzb;
                str2 = zza4.zzc;
                str4 = "audio/mp4a-latm";
                zzfrjVar = singletonList;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 14:
                str4 = "audio/mpeg-L2";
                arrayList = null;
                str2 = null;
                i2 = 4096;
                i7 = -1;
                list2 = arrayList;
                break;
            case 15:
                str4 = "audio/mpeg";
                arrayList = null;
                str2 = null;
                i2 = 4096;
                i7 = -1;
                list2 = arrayList;
                break;
            case 16:
                str4 = "audio/ac3";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 17:
                str4 = "audio/eac3";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 18:
                this.zzS = new zzzz();
                str4 = "audio/true-hd";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 19:
            case 20:
                str4 = "audio/vnd.dts";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 21:
                str4 = "audio/vnd.dts.hd";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 22:
                str4 = "audio/flac";
                zzfrjVar2 = Collections.singletonList(zzi(str3));
                str2 = null;
                zzfrjVar = zzfrjVar2;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 23:
                if (zzh(new zzdy(zzi(str3)))) {
                    zzn = zzeg.zzn(this.zzO);
                    break;
                }
                zzfrjVar = null;
                str2 = null;
                str4 = "audio/x-unknown";
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 24:
                zzn = zzeg.zzn(this.zzO);
                break;
            case 25:
                int i9 = this.zzO;
                if (i9 != 8) {
                    if (i9 == 16) {
                        list2 = null;
                        str2 = null;
                        i2 = -1;
                        i7 = 268435456;
                        break;
                    }
                    zzfrjVar = null;
                    str2 = null;
                    str4 = "audio/x-unknown";
                    i2 = -1;
                    arrayList = zzfrjVar;
                    i7 = -1;
                    list2 = arrayList;
                    break;
                } else {
                    List list4 = null;
                    str2 = null;
                    i2 = -1;
                    list2 = list4;
                    break;
                }
            case 26:
                if (this.zzO == 32) {
                    list2 = null;
                    str2 = null;
                    i2 = -1;
                    i7 = 4;
                    break;
                }
                zzfrjVar = null;
                str2 = null;
                str4 = "audio/x-unknown";
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 27:
                zzfrjVar = null;
                str2 = null;
                str4 = "application/x-subrip";
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 28:
                bArr = zzadg.zzc;
                str2 = null;
                str4 = "text/x-ssa";
                zzfrjVar = zzfrj.zzq(bArr, zzi(this.zzb));
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 29:
                zzfrjVar = null;
                str2 = null;
                str4 = "text/vtt";
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 30:
                str2 = null;
                str4 = "application/vobsub";
                zzfrjVar = zzfrj.zzp(zzi(str3));
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case 31:
                str4 = "application/pgs";
                zzfrjVar = null;
                str2 = null;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str3), 0, bArr4, 0, 4);
                str4 = "application/dvbsubs";
                zzfrjVar2 = zzfrj.zzp(bArr4);
                str2 = null;
                zzfrjVar = zzfrjVar2;
                i2 = -1;
                arrayList = zzfrjVar;
                i7 = -1;
                list2 = arrayList;
                break;
            default:
                throw zzbp.zza("Unrecognized codec identifier.", null);
        }
        byte[] bArr5 = this.zzM;
        if (bArr5 != null && (zza = zzyo.zza(new zzdy(bArr5))) != null) {
            str2 = zza.zza;
            str4 = "video/dolby-vision";
        }
        String str5 = str4;
        int i10 = (true != this.zzT ? 0 : 2) | (this.zzU ? 1 : 0);
        zzab zzabVar = new zzab();
        if (zzbo.zzg(str5)) {
            zzabVar.zzw(this.zzN);
            zzabVar.zzT(this.zzP);
            zzabVar.zzN(i7);
        } else if (zzbo.zzh(str5)) {
            if (this.zzp == 0) {
                int i11 = this.zzn;
                if (i11 == -1) {
                    i11 = this.zzl;
                }
                this.zzn = i11;
                int i12 = this.zzo;
                if (i12 == -1) {
                    i12 = this.zzm;
                }
                this.zzo = i12;
            }
            float f = (this.zzn == -1 || (i5 = this.zzo) == -1) ? -1.0f : (this.zzm * i3) / (this.zzl * i5);
            if (this.zzw) {
                if (this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzK + 0.5f));
                    order.putShort((short) (this.zzL + 0.5f));
                    order.putShort((short) this.zzA);
                    order.putShort((short) this.zzB);
                }
                zzoVar = new zzo(this.zzx, this.zzz, this.zzy, bArr2);
            }
            if (this.zza != null) {
                map = zzadg.zzg;
                if (map.containsKey(this.zza)) {
                    map2 = zzadg.zzg;
                    i8 = ((Integer) map2.get(this.zza)).intValue();
                }
            }
            if (this.zzq == 0 && Float.compare(this.zzr, 0.0f) == 0 && Float.compare(this.zzs, 0.0f) == 0) {
                if (Float.compare(this.zzt, 0.0f) == 0) {
                    i4 = 0;
                } else if (Float.compare(this.zzs, 90.0f) == 0) {
                    i4 = 90;
                } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                    i4 = 180;
                } else if (Float.compare(this.zzs, -90.0f) == 0) {
                    i4 = 270;
                }
                zzabVar.zzX(this.zzl);
                zzabVar.zzF(this.zzm);
                zzabVar.zzP(f);
                zzabVar.zzR(i4);
                zzabVar.zzQ(this.zzu);
                zzabVar.zzV(this.zzv);
                zzabVar.zzy(zzoVar);
                i6 = 2;
            }
            i4 = i8;
            zzabVar.zzX(this.zzl);
            zzabVar.zzF(this.zzm);
            zzabVar.zzP(f);
            zzabVar.zzR(i4);
            zzabVar.zzQ(this.zzu);
            zzabVar.zzV(this.zzv);
            zzabVar.zzy(zzoVar);
            i6 = 2;
        } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
            throw zzbp.zza("Unexpected MIME type.", null);
        } else {
            i6 = 3;
        }
        if (this.zza != null) {
            map3 = zzadg.zzg;
            if (!map3.containsKey(this.zza)) {
                zzabVar.zzJ(this.zza);
            }
        }
        zzabVar.zzG(i);
        zzabVar.zzS(str5);
        zzabVar.zzL(i2);
        zzabVar.zzK(this.zzY);
        zzabVar.zzU(i10);
        zzabVar.zzI(list2);
        zzabVar.zzx(str2);
        zzabVar.zzB(this.zzk);
        zzad zzY = zzabVar.zzY();
        zzzy zzv = zzyuVar.zzv(this.zzc, i6);
        this.zzV = zzv;
        zzv.zzk(zzY);
    }
}