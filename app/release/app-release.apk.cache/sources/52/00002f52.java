package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.common.Scopes;
import com.p7700g.p99005.e14;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.f14;
import com.p7700g.p99005.gl4;
import com.p7700g.p99005.h95;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.l64;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.ni4;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.wm3;
import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import org.xbill.DNS.SimpleResolver;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwt extends zzqi {
    private static final int[] zzb = {1920, 1600, wm3.u, SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private float zzF;
    @z1
    private zzcv zzG;
    private int zzH;
    @z1
    private zzwx zzI;
    private final Context zze;
    private final zzxe zzf;
    private final zzxp zzg;
    private final boolean zzh;
    private zzws zzi;
    private boolean zzj;
    private boolean zzk;
    @z1
    private Surface zzl;
    @z1
    private zzww zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzwt(Context context, zzqc zzqcVar, zzqk zzqkVar, long j, boolean z, @z1 Handler handler, @z1 zzxq zzxqVar, int i, float f) {
        super(2, zzqcVar, zzqkVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzxe(applicationContext);
        this.zzg = new zzxp(handler, zzxqVar);
        this.zzh = "NVIDIA".equals(zzeg.zzc);
        this.zzt = -9223372036854775807L;
        this.zzC = -1;
        this.zzD = -1;
        this.zzF = -1.0f;
        this.zzo = 1;
        this.zzH = 0;
        this.zzG = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r3.equals("video/mp4v-es") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzT(zzqf zzqfVar, zzad zzadVar) {
        int i;
        int intValue;
        int i2 = zzadVar.zzr;
        int i3 = zzadVar.zzs;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        String str = zzadVar.zzm;
        char c = 1;
        int i4 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair zzb2 = zzqx.zzb(zzadVar);
            str = (zzb2 == null || !((intValue = ((Integer) zzb2.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
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
            case 3:
            case 4:
                i = i2 * i3;
                break;
            case 2:
                String str2 = zzeg.zzd;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(zzeg.zzc) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzqfVar.zzf)))) {
                    i = zzeg.zze(i3, 16) * zzeg.zze(i2, 16) * 256;
                    break;
                } else {
                    return -1;
                }
                break;
            case 5:
            case 6:
                i = i2 * i3;
                i4 = 4;
                break;
            default:
                return -1;
        }
        return (i * 3) / (i4 + i4);
    }

    public static int zzU(zzqf zzqfVar, zzad zzadVar) {
        if (zzadVar.zzn != -1) {
            int size = zzadVar.zzo.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) zzadVar.zzo.get(i2)).length;
            }
            return zzadVar.zzn + i;
        }
        return zzT(zzqfVar, zzadVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x05f6, code lost:
        if (r1.equals("A10-70F") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0758, code lost:
        if (r8 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzaB(String str) {
        char c;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzwt.class) {
            if (!zzc) {
                int i = zzeg.zza;
                char c2 = 5;
                char c3 = 65535;
                if (i <= 28) {
                    String str2 = zzeg.zzb;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                c = 5;
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
                            z = true;
                            break;
                    }
                    zzd = z;
                    zzc = true;
                }
                if (i > 27 || !"HWEML".equals(zzeg.zzb)) {
                    if (i <= 26) {
                        String str3 = zzeg.zzb;
                        switch (str3.hashCode()) {
                            case -2144781245:
                                if (str3.equals("GIONEE_SWW1609")) {
                                    c2 = '6';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -2144781185:
                                if (str3.equals("GIONEE_SWW1627")) {
                                    c2 = '7';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -2144781160:
                                if (str3.equals("GIONEE_SWW1631")) {
                                    c2 = '8';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -2097309513:
                                if (str3.equals("K50a40")) {
                                    c2 = 'J';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -2022874474:
                                if (str3.equals("CP8676_I02")) {
                                    c2 = 22;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1978993182:
                                if (str3.equals("NX541J")) {
                                    c2 = 'Y';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1978990237:
                                if (str3.equals("NX573J")) {
                                    c2 = 'Z';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1936688988:
                                if (str3.equals("PGN528")) {
                                    c2 = 'e';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1936688066:
                                if (str3.equals("PGN610")) {
                                    c2 = 'f';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1936688065:
                                if (str3.equals("PGN611")) {
                                    c2 = 'g';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1931988508:
                                if (str3.equals("AquaPowerM")) {
                                    c2 = '\r';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1885099851:
                                if (str3.equals("RAIJIN")) {
                                    c2 = 't';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1696512866:
                                if (str3.equals("XT1663")) {
                                    c2 = 137;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1680025915:
                                if (str3.equals("ComioS1")) {
                                    c2 = 21;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1615810839:
                                if (str3.equals("Phantom6")) {
                                    c2 = 'h';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1600724499:
                                if (str3.equals("pacificrim")) {
                                    c2 = n04.E;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1554255044:
                                if (str3.equals("vernee_M5")) {
                                    c2 = 130;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1481772737:
                                if (str3.equals("panell_dl")) {
                                    c2 = 'a';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1481772730:
                                if (str3.equals("panell_ds")) {
                                    c2 = 'b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1481772729:
                                if (str3.equals("panell_dt")) {
                                    c2 = 'c';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1320080169:
                                if (str3.equals("GiONEE_GBL7319")) {
                                    c2 = '4';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1217592143:
                                if (str3.equals("BRAVIA_ATV2")) {
                                    c2 = 18;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1180384755:
                                if (str3.equals("iris60")) {
                                    c2 = 'F';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1139198265:
                                if (str3.equals("Slate_Pro")) {
                                    c2 = l64.d;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1052835013:
                                if (str3.equals("namath")) {
                                    c2 = 'W';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -993250464:
                                break;
                            case -993250458:
                                if (str3.equals("A10-70L")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -965403638:
                                if (str3.equals("s905x018")) {
                                    c2 = 'x';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -958336948:
                                if (str3.equals("ELUGA_Ray_X")) {
                                    c2 = h95.b;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -879245230:
                                if (str3.equals("tcl_eu")) {
                                    c2 = '~';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -842500323:
                                if (str3.equals("nicklaus_f")) {
                                    c2 = 'X';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -821392978:
                                if (str3.equals("A7000-a")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -797483286:
                                if (str3.equals("SVP-DTV15")) {
                                    c2 = 'w';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -794946968:
                                if (str3.equals("watson")) {
                                    c2 = 131;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -788334647:
                                if (str3.equals("whyred")) {
                                    c2 = 132;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -782144577:
                                if (str3.equals("OnePlus5T")) {
                                    c2 = f14.u;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -575125681:
                                if (str3.equals("GiONEE_CBL7513")) {
                                    c2 = '3';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -521118391:
                                if (str3.equals("GIONEE_GBL7360")) {
                                    c2 = '5';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -430914369:
                                if (str3.equals("Pixi4-7_3G")) {
                                    c2 = 'i';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -290434366:
                                if (str3.equals("taido_row")) {
                                    c2 = 'y';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -282781963:
                                if (str3.equals("BLACK-1X")) {
                                    c2 = 17;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -277133239:
                                if (str3.equals("Z12_PRO")) {
                                    c2 = 138;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -173639913:
                                if (str3.equals("ELUGA_A3_Pro")) {
                                    c2 = 31;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -56598463:
                                if (str3.equals("woods_fn")) {
                                    c2 = 134;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2126:
                                if (str3.equals(AFHydra.STATUS_CONNECTED)) {
                                    c2 = 20;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2564:
                                if (str3.equals("Q5")) {
                                    c2 = 'q';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2715:
                                if (str3.equals("V1")) {
                                    c2 = 127;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2719:
                                if (str3.equals("V5")) {
                                    c2 = 129;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3091:
                                if (str3.equals("b5")) {
                                    c2 = 16;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3483:
                                if (str3.equals("mh")) {
                                    c2 = 'T';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 73405:
                                if (str3.equals("JGZ")) {
                                    c2 = 'I';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 75537:
                                if (str3.equals("M04")) {
                                    c2 = 'O';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 75739:
                                if (str3.equals("M5c")) {
                                    c2 = 'P';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 76779:
                                if (str3.equals("MX6")) {
                                    c2 = 'V';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 78669:
                                if (str3.equals("P85")) {
                                    c2 = '^';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 79305:
                                if (str3.equals("PLE")) {
                                    c2 = 'k';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 80618:
                                if (str3.equals("QX1")) {
                                    c2 = ni4.Z;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 88274:
                                if (str3.equals("Z80")) {
                                    c2 = 139;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 98846:
                                if (str3.equals("cv1")) {
                                    c2 = 26;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 98848:
                                if (str3.equals("cv3")) {
                                    c2 = 27;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 99329:
                                if (str3.equals("deb")) {
                                    c2 = 28;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 101481:
                                if (str3.equals("flo")) {
                                    c2 = '1';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1513190:
                                if (str3.equals("1601")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1514184:
                                if (str3.equals("1713")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1514185:
                                if (str3.equals("1714")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2133089:
                                if (str3.equals("F01H")) {
                                    c2 = h95.c;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2133091:
                                if (str3.equals("F01J")) {
                                    c2 = '%';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2133120:
                                if (str3.equals("F02H")) {
                                    c2 = h95.d;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2133151:
                                if (str3.equals("F03H")) {
                                    c2 = '\'';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2133182:
                                if (str3.equals("F04H")) {
                                    c2 = '(';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2133184:
                                if (str3.equals("F04J")) {
                                    c2 = ')';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2436959:
                                if (str3.equals("P681")) {
                                    c2 = f14.v;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2463773:
                                if (str3.equals("Q350")) {
                                    c2 = 'm';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2464648:
                                if (str3.equals("Q427")) {
                                    c2 = 'o';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2689555:
                                if (str3.equals("XE2X")) {
                                    c2 = 136;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3154429:
                                if (str3.equals("fugu")) {
                                    c2 = '2';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3284551:
                                if (str3.equals("kate")) {
                                    c2 = 'K';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3351335:
                                if (str3.equals("mido")) {
                                    c2 = 'U';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3386211:
                                if (str3.equals("p212")) {
                                    c2 = '\\';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 41325051:
                                if (str3.equals("MEIZU_M5")) {
                                    c2 = 'S';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 51349633:
                                if (str3.equals("601LV")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 51350594:
                                if (str3.equals("602LV")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 55178625:
                                if (str3.equals("Aura_Note_2")) {
                                    c2 = 15;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 61542055:
                                if (str3.equals("A1601")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 65355429:
                                if (str3.equals("E5643")) {
                                    c2 = 30;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66214468:
                                if (str3.equals("F3111")) {
                                    c2 = n04.z;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66214470:
                                if (str3.equals("F3113")) {
                                    c2 = '+';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66214473:
                                if (str3.equals("F3116")) {
                                    c2 = e14.f0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66215429:
                                if (str3.equals("F3211")) {
                                    c2 = '-';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66215431:
                                if (str3.equals("F3213")) {
                                    c2 = '.';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66215433:
                                if (str3.equals("F3215")) {
                                    c2 = j14.P;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 66216390:
                                if (str3.equals("F3311")) {
                                    c2 = '0';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 76402249:
                                if (str3.equals("PRO7S")) {
                                    c2 = 'l';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 76404105:
                                if (str3.equals("Q4260")) {
                                    c2 = 'n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 76404911:
                                if (str3.equals("Q4310")) {
                                    c2 = 'p';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 80963634:
                                if (str3.equals("V23GB")) {
                                    c2 = 128;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 82882791:
                                if (str3.equals("X3_HK")) {
                                    c2 = 135;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 98715550:
                                if (str3.equals("i9031")) {
                                    c2 = 'C';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 101370885:
                                if (str3.equals("l5460")) {
                                    c2 = 'L';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 102844228:
                                if (str3.equals("le_x6")) {
                                    c2 = 'M';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 165221241:
                                if (str3.equals("A2016a40")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 182191441:
                                if (str3.equals("CPY83_I00")) {
                                    c2 = 25;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 245388979:
                                if (str3.equals("marino_f")) {
                                    c2 = 'R';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 287431619:
                                if (str3.equals("griffin")) {
                                    c2 = h95.e;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 307593612:
                                if (str3.equals("A7010a48")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 308517133:
                                if (str3.equals("A7020a48")) {
                                    c2 = '\f';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 316215098:
                                if (str3.equals("TB3-730F")) {
                                    c2 = 'z';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 316215116:
                                if (str3.equals("TB3-730X")) {
                                    c2 = '{';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 316246811:
                                if (str3.equals("TB3-850F")) {
                                    c2 = gl4.T;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 316246818:
                                if (str3.equals("TB3-850M")) {
                                    c2 = '}';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 407160593:
                                if (str3.equals("Pixi5-10_4G")) {
                                    c2 = 'j';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 507412548:
                                if (str3.equals("QM16XE_U")) {
                                    c2 = 'r';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 793982701:
                                if (str3.equals("GIONEE_WBL5708")) {
                                    c2 = '9';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 794038622:
                                if (str3.equals("GIONEE_WBL7365")) {
                                    c2 = ':';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 794040393:
                                if (str3.equals("GIONEE_WBL7519")) {
                                    c2 = ';';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 835649806:
                                if (str3.equals("manning")) {
                                    c2 = 'Q';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 917340916:
                                if (str3.equals("A7000plus")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 958008161:
                                if (str3.equals("j2xlteins")) {
                                    c2 = 'H';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1060579533:
                                if (str3.equals("panell_d")) {
                                    c2 = '`';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1150207623:
                                if (str3.equals("LS-5017")) {
                                    c2 = 'N';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1176899427:
                                if (str3.equals("itel_S41")) {
                                    c2 = 'G';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1280332038:
                                if (str3.equals("hwALE-H")) {
                                    c2 = h95.f;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1306947716:
                                if (str3.equals("EverStar_S")) {
                                    c2 = '#';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1349174697:
                                if (str3.equals("htc_e56ml_dtul")) {
                                    c2 = '=';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1522194893:
                                if (str3.equals("woods_f")) {
                                    c2 = 133;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1691543273:
                                if (str3.equals("CPH1609")) {
                                    c2 = 23;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1691544261:
                                if (str3.equals("CPH1715")) {
                                    c2 = 24;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1709443163:
                                if (str3.equals("iball8735_9806")) {
                                    c2 = 'D';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1865889110:
                                if (str3.equals("santoni")) {
                                    c2 = 'u';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1906253259:
                                if (str3.equals("PB2-670M")) {
                                    c2 = 'd';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1977196784:
                                if (str3.equals("Infinix-X572")) {
                                    c2 = 'E';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2006372676:
                                if (str3.equals("BRAVIA_ATV3_4K")) {
                                    c2 = 19;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2019281702:
                                if (str3.equals("DM-01K")) {
                                    c2 = 29;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2029784656:
                                if (str3.equals("HWBLN-H")) {
                                    c2 = '?';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2030379515:
                                if (str3.equals("HWCAM-H")) {
                                    c2 = '@';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2033393791:
                                if (str3.equals("ASUS_X00AD_2")) {
                                    c2 = 14;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047190025:
                                if (str3.equals("ELUGA_Note")) {
                                    c2 = gl4.R;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047252157:
                                if (str3.equals("ELUGA_Prim")) {
                                    c2 = '!';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2048319463:
                                if (str3.equals("HWVNS-H")) {
                                    c2 = 'A';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2048855701:
                                if (str3.equals("HWWAS-H")) {
                                    c2 = 'B';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            default:
                                String str4 = zzeg.zzd;
                                int hashCode = str4.hashCode();
                                if (hashCode != -594534941) {
                                    if (hashCode != 2006354) {
                                        if (hashCode == 2006367 && str4.equals("AFTN")) {
                                            c3 = 1;
                                        }
                                    } else if (str4.equals("AFTA")) {
                                        c3 = 0;
                                    }
                                } else if (str4.equals("JSN-L21")) {
                                    c3 = 2;
                                }
                                if (c3 != 0) {
                                    if (c3 != 1) {
                                    }
                                }
                                break;
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
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                            case '{':
                            case '|':
                            case '}':
                            case '~':
                            case 127:
                            case 128:
                            case 129:
                            case WKSRecord.Service.CISCO_FNA /* 130 */:
                            case WKSRecord.Service.CISCO_TNA /* 131 */:
                            case WKSRecord.Service.CISCO_SYS /* 132 */:
                            case WKSRecord.Service.STATSRV /* 133 */:
                            case WKSRecord.Service.INGRES_NET /* 134 */:
                            case WKSRecord.Service.LOC_SRV /* 135 */:
                            case WKSRecord.Service.PROFILE /* 136 */:
                            case WKSRecord.Service.NETBIOS_NS /* 137 */:
                            case WKSRecord.Service.NETBIOS_DGM /* 138 */:
                            case WKSRecord.Service.NETBIOS_SSN /* 139 */:
                                break;
                        }
                    }
                    zzd = z;
                    zzc = true;
                }
                z = true;
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    private static List zzaC(zzqk zzqkVar, zzad zzadVar, boolean z, boolean z2) throws zzqr {
        String str = zzadVar.zzm;
        if (str == null) {
            return zzfrj.zzo();
        }
        List zzf = zzqx.zzf(str, z, z2);
        String zze = zzqx.zze(zzadVar);
        if (zze == null) {
            return zzfrj.zzm(zzf);
        }
        List zzf2 = zzqx.zzf(zze, z, z2);
        zzfrg zzi = zzfrj.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzaD() {
        int i = this.zzC;
        if (i == -1) {
            if (this.zzD == -1) {
                return;
            }
            i = -1;
        }
        zzcv zzcvVar = this.zzG;
        if (zzcvVar != null && zzcvVar.zzc == i && zzcvVar.zzd == this.zzD && zzcvVar.zze == this.zzE && zzcvVar.zzf == this.zzF) {
            return;
        }
        zzcv zzcvVar2 = new zzcv(i, this.zzD, this.zzE, this.zzF);
        this.zzG = zzcvVar2;
        this.zzg.zzt(zzcvVar2);
    }

    private final void zzaE() {
        zzcv zzcvVar = this.zzG;
        if (zzcvVar != null) {
            this.zzg.zzt(zzcvVar);
        }
    }

    @e2(17)
    private final void zzaF() {
        Surface surface = this.zzl;
        zzww zzwwVar = this.zzm;
        if (surface == zzwwVar) {
            this.zzl = null;
        }
        zzwwVar.release();
        this.zzm = null;
    }

    private static boolean zzaG(long j) {
        return j < -30000;
    }

    private final boolean zzaH(zzqf zzqfVar) {
        return zzeg.zza >= 23 && !zzaB(zzqfVar.zza) && (!zzqfVar.zzf || zzww.zzb(this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjt
    public final void zzD(float f, float f2) throws zzgt {
        super.zzD(f, f2);
        this.zzf.zze(f);
    }

    @Override // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzjt
    public final boolean zzN() {
        zzww zzwwVar;
        if (super.zzN() && (this.zzp || (((zzwwVar = this.zzm) != null && this.zzl == zzwwVar) || zzaj() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        } else if (this.zzt == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzt) {
                return true;
            }
            this.zzt = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final float zzP(float f, zzad zzadVar, zzad[] zzadVarArr) {
        float f2 = -1.0f;
        for (zzad zzadVar2 : zzadVarArr) {
            float f3 = zzadVar2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final int zzQ(zzqk zzqkVar, zzad zzadVar) throws zzqr {
        boolean z;
        if (zzbo.zzh(zzadVar.zzm)) {
            int i = 0;
            boolean z2 = zzadVar.zzp != null;
            List zzaC = zzaC(zzqkVar, zzadVar, z2, false);
            if (z2 && zzaC.isEmpty()) {
                zzaC = zzaC(zzqkVar, zzadVar, false, false);
            }
            if (zzaC.isEmpty()) {
                return 129;
            }
            if (zzqi.zzav(zzadVar)) {
                zzqf zzqfVar = (zzqf) zzaC.get(0);
                boolean zzd2 = zzqfVar.zzd(zzadVar);
                if (!zzd2) {
                    for (int i2 = 1; i2 < zzaC.size(); i2++) {
                        zzqf zzqfVar2 = (zzqf) zzaC.get(i2);
                        if (zzqfVar2.zzd(zzadVar)) {
                            zzqfVar = zzqfVar2;
                            z = false;
                            zzd2 = true;
                            break;
                        }
                    }
                }
                z = true;
                int i3 = true != zzd2 ? 3 : 4;
                int i4 = true != zzqfVar.zze(zzadVar) ? 8 : 16;
                int i5 = true != zzqfVar.zzg ? 0 : 64;
                int i6 = true != z ? 0 : 128;
                if (zzd2) {
                    List zzaC2 = zzaC(zzqkVar, zzadVar, z2, true);
                    if (!zzaC2.isEmpty()) {
                        zzqf zzqfVar3 = (zzqf) zzqx.zzg(zzaC2, zzadVar).get(0);
                        if (zzqfVar3.zzd(zzadVar) && zzqfVar3.zze(zzadVar)) {
                            i = 32;
                        }
                    }
                }
                return i3 | i4 | i | i5 | i6;
            }
            return WKSRecord.Service.CISCO_FNA;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final zzgm zzR(zzqf zzqfVar, zzad zzadVar, zzad zzadVar2) {
        int i;
        int i2;
        zzgm zzb2 = zzqfVar.zzb(zzadVar, zzadVar2);
        int i3 = zzb2.zze;
        int i4 = zzadVar2.zzr;
        zzws zzwsVar = this.zzi;
        if (i4 > zzwsVar.zza || zzadVar2.zzs > zzwsVar.zzb) {
            i3 |= 256;
        }
        if (zzU(zzqfVar, zzadVar2) > this.zzi.zzc) {
            i3 |= 64;
        }
        String str = zzqfVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb2.zzd;
            i2 = 0;
        }
        return new zzgm(str, zzadVar, zzadVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @z1
    public final zzgm zzS(zziz zzizVar) throws zzgt {
        zzgm zzS = super.zzS(zzizVar);
        this.zzg.zzf(zzizVar.zza, zzS);
        return zzS;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @TargetApi(17)
    public final zzqb zzV(zzqf zzqfVar, zzad zzadVar, @z1 MediaCrypto mediaCrypto, float f) {
        zzws zzwsVar;
        Point point;
        Pair zzb2;
        int zzT;
        zzww zzwwVar = this.zzm;
        if (zzwwVar != null && zzwwVar.zza != zzqfVar.zzf) {
            zzaF();
        }
        String str = zzqfVar.zzc;
        zzad[] zzJ = zzJ();
        int i = zzadVar.zzr;
        int i2 = zzadVar.zzs;
        int zzU = zzU(zzqfVar, zzadVar);
        int length = zzJ.length;
        if (length == 1) {
            if (zzU != -1 && (zzT = zzT(zzqfVar, zzadVar)) != -1) {
                zzU = Math.min((int) (zzU * 1.5f), zzT);
            }
            zzwsVar = new zzws(i, i2, zzU);
        } else {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                zzad zzadVar2 = zzJ[i3];
                if (zzadVar.zzy != null && zzadVar2.zzy == null) {
                    zzab zzb3 = zzadVar2.zzb();
                    zzb3.zzy(zzadVar.zzy);
                    zzadVar2 = zzb3.zzY();
                }
                if (zzqfVar.zzb(zzadVar, zzadVar2).zzd != 0) {
                    int i4 = zzadVar2.zzr;
                    z |= i4 == -1 || zzadVar2.zzs == -1;
                    i = Math.max(i, i4);
                    i2 = Math.max(i2, zzadVar2.zzs);
                    zzU = Math.max(zzU, zzU(zzqfVar, zzadVar2));
                }
            }
            if (z) {
                int i5 = zzadVar.zzs;
                int i6 = zzadVar.zzr;
                int i7 = i5 > i6 ? i5 : i6;
                int i8 = i5 <= i6 ? i5 : i6;
                float f2 = i8 / i7;
                int[] iArr = zzb;
                int i9 = 0;
                while (i9 < 9) {
                    int i10 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i11 = (int) (i10 * f2);
                    if (i10 <= i7 || i11 <= i8) {
                        break;
                    }
                    int i12 = i7;
                    int i13 = i8;
                    if (zzeg.zza >= 21) {
                        int i14 = i5 <= i6 ? i10 : i11;
                        if (i5 <= i6) {
                            i10 = i11;
                        }
                        Point zza = zzqfVar.zza(i14, i10);
                        if (zzqfVar.zzf(zza.x, zza.y, zzadVar.zzt)) {
                            point = zza;
                            break;
                        }
                        i9++;
                        iArr = iArr2;
                        i7 = i12;
                        i8 = i13;
                    } else {
                        try {
                            int zze = zzeg.zze(i10, 16) * 16;
                            int zze2 = zzeg.zze(i11, 16) * 16;
                            if (zze * zze2 <= zzqx.zza()) {
                                int i15 = i5 <= i6 ? zze : zze2;
                                if (i5 <= i6) {
                                    zze = zze2;
                                }
                                point = new Point(i15, zze);
                            } else {
                                i9++;
                                iArr = iArr2;
                                i7 = i12;
                                i8 = i13;
                            }
                        } catch (zzqr unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzab zzb4 = zzadVar.zzb();
                    zzb4.zzX(i);
                    zzb4.zzF(i2);
                    zzU = Math.max(zzU, zzT(zzqfVar, zzb4.zzY()));
                }
            }
            zzwsVar = new zzws(i, i2, zzU);
        }
        this.zzi = zzwsVar;
        boolean z2 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzadVar.zzr);
        mediaFormat.setInteger("height", zzadVar.zzs);
        zzdp.zzb(mediaFormat, zzadVar.zzo);
        float f3 = zzadVar.zzt;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        zzdp.zza(mediaFormat, "rotation-degrees", zzadVar.zzu);
        zzo zzoVar = zzadVar.zzy;
        if (zzoVar != null) {
            zzdp.zza(mediaFormat, "color-transfer", zzoVar.zzd);
            zzdp.zza(mediaFormat, "color-standard", zzoVar.zzb);
            zzdp.zza(mediaFormat, "color-range", zzoVar.zzc);
            byte[] bArr = zzoVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzadVar.zzm) && (zzb2 = zzqx.zzb(zzadVar)) != null) {
            zzdp.zza(mediaFormat, Scopes.PROFILE, ((Integer) zzb2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzwsVar.zza);
        mediaFormat.setInteger("max-height", zzwsVar.zzb);
        zzdp.zza(mediaFormat, "max-input-size", zzwsVar.zzc);
        if (zzeg.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (zzaH(zzqfVar)) {
                if (this.zzm == null) {
                    this.zzm = zzww.zza(this.zze, zzqfVar.zzf);
                }
                this.zzl = this.zzm;
            } else {
                throw new IllegalStateException();
            }
        }
        return zzqb.zzb(zzqfVar, mediaFormat, zzadVar, this.zzl, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final List zzW(zzqk zzqkVar, zzad zzadVar, boolean z) throws zzqr {
        return zzqx.zzg(zzaC(zzqkVar, zzadVar, false, false), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzY(String str, zzqb zzqbVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzj = zzaB(str);
        zzqf zzal = zzal();
        Objects.requireNonNull(zzal);
        boolean z = false;
        if (zzeg.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzg = zzal.zzg();
            int length = zzg.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzg[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzk = z;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    public final void zzaA(long j) {
        zzgl zzglVar = ((zzqi) this).zza;
        zzglVar.zzk += j;
        zzglVar.zzl++;
        this.zzA += j;
        this.zzB++;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzaa(zzad zzadVar, @z1 MediaFormat mediaFormat) {
        int integer;
        int integer2;
        zzqd zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzo);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzC = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzD = integer2;
        float f = zzadVar.zzv;
        this.zzF = f;
        if (zzeg.zza >= 21) {
            int i = zzadVar.zzu;
            if (i == 90 || i == 270) {
                int i2 = this.zzC;
                this.zzC = integer2;
                this.zzD = i2;
                this.zzF = 1.0f / f;
            }
        } else {
            this.zzE = zzadVar.zzu;
        }
        this.zzf.zzc(zzadVar.zzt);
    }

    public final void zzab() {
        this.zzr = true;
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        this.zzg.zzq(this.zzl);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzac() {
        this.zzp = false;
        int i = zzeg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @t0
    public final void zzad(zzgb zzgbVar) throws zzgt {
        this.zzx++;
        int i = zzeg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final boolean zzaf(long j, long j2, @z1 zzqd zzqdVar, @z1 ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzadVar) throws zzgt {
        boolean z3;
        int zzd2;
        Objects.requireNonNull(zzqdVar);
        if (this.zzs == -9223372036854775807L) {
            this.zzs = j;
        }
        if (j3 != this.zzy) {
            this.zzf.zzd(j3);
            this.zzy = j3;
        }
        long zzai = zzai();
        long j4 = j3 - zzai;
        if (z && !z2) {
            zzay(zzqdVar, i, j4);
            return true;
        }
        float zzah = zzah();
        int zzbe = zzbe();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j5 = (long) ((j3 - j) / zzah);
        if (zzbe == 2) {
            j5 -= elapsedRealtime - j2;
        }
        if (this.zzl == this.zzm) {
            if (zzaG(j5)) {
                zzay(zzqdVar, i, j4);
                zzaA(j5);
                return true;
            }
            return false;
        }
        long j6 = elapsedRealtime - this.zzz;
        boolean z4 = this.zzr ? !this.zzp : zzbe == 2 || this.zzq;
        if (this.zzt == -9223372036854775807L && j >= zzai && (z4 || (zzbe == 2 && zzaG(j5) && j6 > 100000))) {
            long nanoTime = System.nanoTime();
            if (zzeg.zza >= 21) {
                zzax(zzqdVar, i, j4, nanoTime);
            } else {
                zzaw(zzqdVar, i, j4);
            }
            zzaA(j5);
            return true;
        } else if (zzbe != 2 || j == this.zzs) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long zza = this.zzf.zza((j5 * 1000) + nanoTime2);
            long j7 = (zza - nanoTime2) / 1000;
            long j8 = this.zzt;
            if (j7 < -500000 && !z2 && (zzd2 = zzd(j)) != 0) {
                if (j8 != -9223372036854775807L) {
                    zzgl zzglVar = ((zzqi) this).zza;
                    zzglVar.zzd += zzd2;
                    zzglVar.zzf += this.zzx;
                } else {
                    ((zzqi) this).zza.zzj++;
                    zzaz(zzd2, this.zzx);
                }
                zzas();
                return false;
            } else if (zzaG(j7) && !z2) {
                if (j8 != -9223372036854775807L) {
                    zzay(zzqdVar, i, j4);
                    z3 = true;
                } else {
                    int i4 = zzeg.zza;
                    Trace.beginSection("dropVideoBuffer");
                    zzqdVar.zzn(i, false);
                    Trace.endSection();
                    z3 = true;
                    zzaz(0, 1);
                }
                zzaA(j7);
                return z3;
            } else if (zzeg.zza >= 21) {
                if (j7 < 50000) {
                    zzax(zzqdVar, i, j4, zza);
                    zzaA(j7);
                    return true;
                }
                return false;
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j7) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                zzaw(zzqdVar, i, j4);
                zzaA(j7);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final zzqe zzak(Throwable th, @z1 zzqf zzqfVar) {
        return new zzwr(th, zzqfVar, this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @TargetApi(29)
    public final void zzam(zzgb zzgbVar) throws zzgt {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzgbVar.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzqd zzaj = zzaj();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaj.zzp(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @t0
    public final void zzao(long j) {
        super.zzao(j);
        this.zzx--;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @t0
    public final void zzaq() {
        super.zzaq();
        this.zzx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final boolean zzau(zzqf zzqfVar) {
        return this.zzl != null || zzaH(zzqfVar);
    }

    public final void zzaw(zzqd zzqdVar, int i, long j) {
        zzaD();
        int i2 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqdVar.zzn(i, true);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzqi) this).zza.zze++;
        this.zzw = 0;
        zzab();
    }

    @e2(21)
    public final void zzax(zzqd zzqdVar, int i, long j, long j2) {
        zzaD();
        int i2 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqdVar.zzm(i, j2);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzqi) this).zza.zze++;
        this.zzw = 0;
        zzab();
    }

    public final void zzay(zzqd zzqdVar, int i, long j) {
        int i2 = zzeg.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqdVar.zzn(i, false);
        Trace.endSection();
        ((zzqi) this).zza.zzf++;
    }

    public final void zzaz(int i, int i2) {
        zzgl zzglVar = ((zzqi) this).zza;
        zzglVar.zzh += i;
        int i3 = i + i2;
        zzglVar.zzg += i3;
        this.zzv += i3;
        int i4 = this.zzw + i3;
        this.zzw = i4;
        zzglVar.zzi = Math.max(i4, zzglVar.zzi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjp
    public final void zzp(int i, @z1 Object obj) throws zzgt {
        if (i != 1) {
            if (i == 7) {
                this.zzI = (zzwx) obj;
                return;
            } else if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzH != intValue) {
                    this.zzH = intValue;
                    return;
                }
                return;
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            } else {
                int intValue2 = ((Integer) obj).intValue();
                this.zzo = intValue2;
                zzqd zzaj = zzaj();
                if (zzaj != null) {
                    zzaj.zzq(intValue2);
                    return;
                }
                return;
            }
        }
        zzww zzwwVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzwwVar == null) {
            zzww zzwwVar2 = this.zzm;
            if (zzwwVar2 != null) {
                zzwwVar = zzwwVar2;
            } else {
                zzqf zzal = zzal();
                if (zzal != null && zzaH(zzal)) {
                    zzwwVar = zzww.zza(this.zze, zzal.zzf);
                    this.zzm = zzwwVar;
                }
            }
        }
        if (this.zzl != zzwwVar) {
            this.zzl = zzwwVar;
            this.zzf.zzi(zzwwVar);
            this.zzn = false;
            int zzbe = zzbe();
            zzqd zzaj2 = zzaj();
            if (zzaj2 != null) {
                if (zzeg.zza >= 23 && zzwwVar != null && !this.zzj) {
                    zzaj2.zzo(zzwwVar);
                } else {
                    zzap();
                    zzan();
                }
            }
            if (zzwwVar != null && zzwwVar != this.zzm) {
                zzaE();
                this.zzp = false;
                int i2 = zzeg.zza;
                if (zzbe == 2) {
                    this.zzt = -9223372036854775807L;
                    return;
                }
                return;
            }
            this.zzG = null;
            this.zzp = false;
            int i3 = zzeg.zza;
        } else if (zzwwVar == null || zzwwVar == this.zzm) {
        } else {
            zzaE();
            if (this.zzn) {
                this.zzg.zzq(this.zzl);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzs() {
        this.zzG = null;
        this.zzp = false;
        int i = zzeg.zza;
        this.zzn = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(((zzqi) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzt(boolean z, boolean z2) throws zzgt {
        super.zzt(z, z2);
        zzk();
        this.zzg.zze(((zzqi) this).zza);
        this.zzq = z2;
        this.zzr = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzu(long j, boolean z) throws zzgt {
        super.zzu(j, z);
        this.zzp = false;
        int i = zzeg.zza;
        this.zzf.zzf();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    @TargetApi(17)
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzm != null) {
                zzaF();
            }
        } catch (Throwable th) {
            if (this.zzm != null) {
                zzaF();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public final void zzw() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0L;
        this.zzB = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    public final void zzx() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0L;
            this.zzB = 0;
        }
        this.zzf.zzh();
    }
}