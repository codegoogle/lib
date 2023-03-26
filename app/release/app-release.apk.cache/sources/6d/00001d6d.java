package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaun {
    public boolean zzL;
    public zzauf zzN;
    public int zzO;
    public String zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public boolean zze;
    public byte[] zzf;
    public zzaue zzg;
    public byte[] zzh;
    public zzats zzi;
    public int zzj = -1;
    public int zzk = -1;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = 0;
    public byte[] zzo = null;
    public int zzp = -1;
    public boolean zzq = false;
    public int zzr = -1;
    public int zzs = -1;
    public int zzt = -1;
    public int zzu = 1000;
    public int zzv = 200;
    public float zzw = -1.0f;
    public float zzx = -1.0f;
    public float zzy = -1.0f;
    public float zzz = -1.0f;
    public float zzA = -1.0f;
    public float zzB = -1.0f;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public int zzG = 1;
    public int zzH = -1;
    public int zzI = 8000;
    public long zzJ = 0;
    public long zzK = 0;
    public boolean zzM = true;
    private String zzP = "eng";

    private zzaun() {
    }

    public /* synthetic */ zzaun(zzaum zzaumVar) {
    }

    private static List zzc(zzazh zzazhVar) throws zzarw {
        try {
            zzazhVar.zzw(16);
            if (zzazhVar.zzk() != 826496599) {
                return null;
            }
            int zzc = zzazhVar.zzc() + 20;
            byte[] bArr = zzazhVar.zza;
            while (true) {
                int length = bArr.length;
                if (zzc < length - 4) {
                    if (bArr[zzc] == 0 && bArr[zzc + 1] == 0 && bArr[zzc + 2] == 1 && bArr[zzc + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, zzc, length));
                    }
                    zzc++;
                } else {
                    throw new zzarw("Failed to find FourCC VC1 initialization data");
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarw("Error parsing FourCC VC1 codec private");
        }
    }

    private static List zzd(byte[] bArr) throws zzarw {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if (i != -1) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if (i2 != -1) {
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
                        throw new zzarw("Error parsing vorbis codec private");
                    }
                    throw new zzarw("Error parsing vorbis codec private");
                }
                throw new zzarw("Error parsing vorbis codec private");
            }
            throw new zzarw("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarw("Error parsing vorbis codec private");
        }
    }

    private static boolean zze(zzazh zzazhVar) throws zzarw {
        UUID uuid;
        UUID uuid2;
        try {
            int zzf = zzazhVar.zzf();
            if (zzf == 1) {
                return true;
            }
            if (zzf == 65534) {
                zzazhVar.zzv(24);
                long zzl = zzazhVar.zzl();
                uuid = zzauo.zzd;
                if (zzl == uuid.getMostSignificantBits()) {
                    long zzl2 = zzazhVar.zzl();
                    uuid2 = zzauo.zzd;
                    if (zzl2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarw("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x01a4, code lost:
        if (r1 == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01a7, code lost:
        r26 = r1;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x01c0, code lost:
        if (r1 != 0) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(zzatx zzatxVar, int i) throws zzarw {
        char c;
        List list;
        String str;
        int i2;
        int i3;
        ArrayList arrayList;
        int zzh;
        List list2;
        zzart zzi;
        int i4;
        zzazr zzazrVar;
        byte[] bArr;
        int i5;
        String str2 = this.zza;
        int i6 = 2;
        switch (str2.hashCode()) {
            case -2095576542:
                if (str2.equals("V_MPEG4/ISO/AP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str2.equals("V_MPEG4/ISO/SP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str2.equals("A_MS/ACM")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str2.equals("A_TRUEHD")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str2.equals("A_VORBIS")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str2.equals("A_MPEG/L2")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str2.equals("A_MPEG/L3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str2.equals("V_MS/VFW/FOURCC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str2.equals("S_DVBSUB")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str2.equals("V_MPEG4/ISO/ASP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str2.equals("V_MPEG4/ISO/AVC")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str2.equals("S_VOBSUB")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str2.equals("A_DTS/LOSSLESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str2.equals("A_AAC")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str2.equals("A_AC3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str2.equals("A_DTS")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str2.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str2.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str2.equals("S_HDMV/PGS")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str2.equals("V_THEORA")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str2.equals("A_DTS/EXPRESS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str2.equals("A_PCM/INT/LIT")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str2.equals("V_MPEGH/ISO/HEVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str2.equals("S_TEXT/UTF8")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str2.equals("V_MPEG2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str2.equals("A_EAC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str2.equals("A_FLAC")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str2.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str3 = "audio/raw";
        switch (c) {
            case 0:
                str3 = "video/x-vnd.on2.vp8";
                list2 = null;
                i2 = -1;
                List list3 = list2;
                i3 = -1;
                arrayList = list3;
                break;
            case 1:
                str3 = "video/x-vnd.on2.vp9";
                list2 = null;
                i2 = -1;
                List list32 = list2;
                i3 = -1;
                arrayList = list32;
                break;
            case 2:
                str3 = "video/mpeg2";
                list2 = null;
                i2 = -1;
                List list322 = list2;
                i3 = -1;
                arrayList = list322;
                break;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.zzh;
                str3 = "video/mp4v-es";
                list2 = bArr2 == null ? null : Collections.singletonList(bArr2);
                i2 = -1;
                List list3222 = list2;
                i3 = -1;
                arrayList = list3222;
                break;
            case 6:
                zzazp zza = zzazp.zza(new zzazh(this.zzh));
                list = zza.zza;
                this.zzO = zza.zzb;
                str = "video/avc";
                i2 = -1;
                i3 = -1;
                List list4 = list;
                str3 = str;
                arrayList = list4;
                break;
            case 7:
                zzazv zza2 = zzazv.zza(new zzazh(this.zzh));
                list = zza2.zza;
                this.zzO = zza2.zzb;
                str = "video/hevc";
                i2 = -1;
                i3 = -1;
                List list42 = list;
                str3 = str;
                arrayList = list42;
                break;
            case '\b':
                List zzc = zzc(new zzazh(this.zzh));
                if (zzc != null) {
                    str3 = "video/wvc1";
                    list2 = zzc;
                } else {
                    str3 = "video/x-unknown";
                    list2 = zzc;
                }
                i2 = -1;
                List list32222 = list2;
                i3 = -1;
                arrayList = list32222;
                break;
            case '\t':
                str3 = "video/x-unknown";
                list2 = null;
                i2 = -1;
                List list322222 = list2;
                i3 = -1;
                arrayList = list322222;
                break;
            case '\n':
                str3 = "audio/vorbis";
                i2 = -1;
                i3 = 8192;
                arrayList = zzd(this.zzh);
                break;
            case 11:
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.zzh);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzJ).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzK).array());
                str3 = "audio/opus";
                i2 = -1;
                i3 = 5760;
                arrayList = arrayList2;
                break;
            case '\f':
                str3 = "audio/mp4a-latm";
                list2 = Collections.singletonList(this.zzh);
                i2 = -1;
                List list3222222 = list2;
                i3 = -1;
                arrayList = list3222222;
                break;
            case '\r':
                str3 = "audio/mpeg-L2";
                arrayList = null;
                i2 = -1;
                i3 = 4096;
                break;
            case 14:
                str3 = "audio/mpeg";
                arrayList = null;
                i2 = -1;
                i3 = 4096;
                break;
            case 15:
                str3 = "audio/ac3";
                list2 = null;
                i2 = -1;
                List list32222222 = list2;
                i3 = -1;
                arrayList = list32222222;
                break;
            case 16:
                str3 = "audio/eac3";
                list2 = null;
                i2 = -1;
                List list322222222 = list2;
                i3 = -1;
                arrayList = list322222222;
                break;
            case 17:
                str3 = "audio/true-hd";
                list2 = null;
                i2 = -1;
                List list3222222222 = list2;
                i3 = -1;
                arrayList = list3222222222;
                break;
            case 18:
            case 19:
                str3 = "audio/vnd.dts";
                list2 = null;
                i2 = -1;
                List list32222222222 = list2;
                i3 = -1;
                arrayList = list32222222222;
                break;
            case 20:
                str3 = "audio/vnd.dts.hd";
                list2 = null;
                i2 = -1;
                List list322222222222 = list2;
                i3 = -1;
                arrayList = list322222222222;
                break;
            case 21:
                str3 = "audio/x-flac";
                list2 = Collections.singletonList(this.zzh);
                i2 = -1;
                List list3222222222222 = list2;
                i3 = -1;
                arrayList = list3222222222222;
                break;
            case 22:
                if (zze(new zzazh(this.zzh))) {
                    zzh = zzazo.zzh(this.zzH);
                    break;
                }
                str3 = "audio/x-unknown";
                list2 = null;
                i2 = -1;
                List list32222222222222 = list2;
                i3 = -1;
                arrayList = list32222222222222;
                break;
            case 23:
                zzh = zzazo.zzh(this.zzH);
                break;
            case 24:
                str3 = "application/x-subrip";
                list2 = null;
                i2 = -1;
                List list322222222222222 = list2;
                i3 = -1;
                arrayList = list322222222222222;
                break;
            case 25:
                str3 = "application/vobsub";
                list2 = Collections.singletonList(this.zzh);
                i2 = -1;
                List list3222222222222222 = list2;
                i3 = -1;
                arrayList = list3222222222222222;
                break;
            case 26:
                str3 = "application/pgs";
                list2 = null;
                i2 = -1;
                List list32222222222222222 = list2;
                i3 = -1;
                arrayList = list32222222222222222;
                break;
            case 27:
                byte[] bArr3 = this.zzh;
                byte[] bArr4 = {bArr3[0], bArr3[1], bArr3[2], bArr3[3]};
                str3 = "application/dvbsubs";
                list2 = Collections.singletonList(bArr4);
                i2 = -1;
                List list322222222222222222 = list2;
                i3 = -1;
                arrayList = list322222222222222222;
                break;
            default:
                throw new zzarw("Unrecognized codec identifier.");
        }
        int i7 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
        if (zzaze.zza(str3)) {
            zzi = zzart.zzh(Integer.toString(i), str3, null, -1, i3, this.zzG, this.zzI, i2, -1, -1, arrayList, this.zzi, i7, this.zzP, null);
            i6 = 1;
        } else if (zzaze.zzb(str3)) {
            if (this.zzn == 0) {
                int i8 = this.zzl;
                if (i8 == -1) {
                    i8 = this.zzj;
                }
                this.zzl = i8;
                int i9 = this.zzm;
                if (i9 == -1) {
                    i9 = this.zzk;
                }
                this.zzm = i9;
            }
            float f = (this.zzl == -1 || (i5 = this.zzm) == -1) ? -1.0f : (this.zzk * i4) / (this.zzj * i5);
            if (this.zzq) {
                if (this.zzw == -1.0f || this.zzx == -1.0f || this.zzy == -1.0f || this.zzz == -1.0f || this.zzA == -1.0f || this.zzB == -1.0f || this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f) {
                    bArr = null;
                } else {
                    bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((this.zzw * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzx * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzy * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzz * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzA * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzB * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    wrap.putShort((short) (this.zzE + 0.5f));
                    wrap.putShort((short) (this.zzF + 0.5f));
                    wrap.putShort((short) this.zzu);
                    wrap.putShort((short) this.zzv);
                }
                zzazrVar = new zzazr(this.zzr, this.zzt, this.zzs, bArr);
            } else {
                zzazrVar = null;
            }
            zzi = zzart.zzl(Integer.toString(i), str3, null, -1, i3, this.zzj, this.zzk, -1.0f, arrayList, -1, f, this.zzo, this.zzp, zzazrVar, this.zzi);
        } else {
            if ("application/x-subrip".equals(str3)) {
                zzi = zzart.zzk(Integer.toString(i), str3, null, -1, i7, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
            } else if (!"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                throw new zzarw("Unexpected MIME type.");
            } else {
                zzi = zzart.zzi(Integer.toString(i), str3, null, -1, arrayList, this.zzP, this.zzi);
            }
            i6 = 3;
        }
        zzauf zzbi = zzatxVar.zzbi(this.zzb, i6);
        this.zzN = zzbi;
        zzbi.zza(zzi);
    }
}