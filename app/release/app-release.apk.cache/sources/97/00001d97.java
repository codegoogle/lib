package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import android.util.SparseIntArray;
import com.anythink.expressad.foundation.g.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzawb {
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map zzf;
    private static final zzavp zza = zzavp.zzb("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzf = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static int zza() throws zzavw {
        int i = zzg;
        if (i == -1) {
            zzavp zzc2 = zzc("video/avc", false);
            if (zzc2 != null) {
                int i2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i3 = codecProfileLevel.level;
                    int i4 = 9437184;
                    if (i3 == 1 || i3 == 2) {
                        i4 = 25344;
                    } else {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                continue;
                            case 64:
                                i4 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i4 = 414720;
                                continue;
                            case 512:
                                i4 = 921600;
                                continue;
                            case 1024:
                                i4 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                continue;
                            case 8192:
                                i4 = 2228224;
                                continue;
                            case 16384:
                                i4 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                continue;
                        }
                    }
                    i2 = Math.max(i4, i2);
                }
                i = Math.max(i2, zzazo.zza >= 21 ? 345600 : 172800);
            } else {
                i = 0;
            }
            zzg = i;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair zzb(String str) {
        char c;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2 || c == 3) {
                int length = split.length;
                if (length < 2) {
                    "Ignoring malformed AVC codec string: ".concat(str);
                    return null;
                }
                try {
                    if (split[1].length() == 6) {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                    } else if (length < 3) {
                        return null;
                    } else {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                    }
                    return new Pair(Integer.valueOf(zzd.get(valueOf.intValue())), Integer.valueOf(zze.get(valueOf2.intValue())));
                } catch (NumberFormatException unused) {
                    "Ignoring malformed AVC codec string: ".concat(str);
                    return null;
                }
            }
            return null;
        } else if (split.length < 4) {
            "Ignoring malformed HEVC codec string: ".concat(str);
            return null;
        } else {
            Matcher matcher = zzb.matcher(split[1]);
            if (!matcher.matches()) {
                "Ignoring malformed HEVC codec string: ".concat(str);
                return null;
            }
            String group = matcher.group(1);
            if ("1".equals(group)) {
                i = 1;
            } else if (!"2".equals(group)) {
                "Unknown HEVC profile string: ".concat(String.valueOf(group));
                return null;
            }
            Integer num = (Integer) zzf.get(split[3]);
            if (num == null) {
                "Unknown HEVC level string: ".concat(String.valueOf(matcher.group(1)));
                return null;
            }
            return new Pair(Integer.valueOf(i), num);
        }
    }

    public static zzavp zzc(String str, boolean z) throws zzavw {
        List zzd2 = zzd(str, z);
        if (zzd2.isEmpty()) {
            return null;
        }
        return (zzavp) zzd2.get(0);
    }

    public static synchronized List zzd(String str, boolean z) throws zzavw {
        zzavx zzavzVar;
        synchronized (zzawb.class) {
            zzavu zzavuVar = new zzavu(str, z);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzavuVar);
            if (list != null) {
                return list;
            }
            int i = zzazo.zza;
            if (i >= 21) {
                zzavzVar = new zzawa(z);
            } else {
                zzavzVar = new zzavz(null);
            }
            List zze2 = zze(zzavuVar, zzavzVar);
            if (z && zze2.isEmpty() && i >= 21 && i <= 23) {
                zze2 = zze(zzavuVar, new zzavz(null));
                if (!zze2.isEmpty()) {
                    String str2 = ((zzavp) zze2.get(0)).zza;
                }
            }
            List unmodifiableList = Collections.unmodifiableList(zze2);
            hashMap.put(zzavuVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01bc A[Catch: Exception -> 0x01b7, TryCatch #2 {Exception -> 0x01b7, blocks: (B:102:0x0193, B:104:0x019d, B:106:0x01a5, B:108:0x01ad, B:115:0x01bc, B:120:0x01c5), top: B:151:0x0193 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List zze(zzavu zzavuVar, zzavx zzavxVar) throws zzavw {
        int i;
        int i2;
        boolean z;
        zzavx zzavxVar2 = zzavxVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = zzavuVar.zza;
            int zza2 = zzavxVar.zza();
            boolean zzd2 = zzavxVar.zzd();
            int i3 = 0;
            while (i3 < zza2) {
                MediaCodecInfo zzb2 = zzavxVar2.zzb(i3);
                String name = zzb2.getName();
                if (!zzb2.isEncoder() && ((zzd2 || !name.endsWith(".secure")) && (((i = zzazo.zza) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((i >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && (i >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(zzazo.zzb)))))) {
                    if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                        String str2 = zzazo.zzb;
                        if ("dlxu".equals(str2)) {
                            continue;
                        } else if ("protou".equals(str2)) {
                            continue;
                        } else if ("ville".equals(str2)) {
                            continue;
                        } else if ("villeplus".equals(str2)) {
                            continue;
                        } else if ("villec2".equals(str2)) {
                            continue;
                        } else if (str2.startsWith("gee")) {
                            continue;
                        } else if ("C6602".equals(str2)) {
                            continue;
                        } else if ("C6603".equals(str2)) {
                            continue;
                        } else if ("C6606".equals(str2)) {
                            continue;
                        } else if ("C6616".equals(str2)) {
                            continue;
                        } else if ("L36h".equals(str2)) {
                            continue;
                        } else if ("SO-02E".equals(str2)) {
                            continue;
                        }
                    }
                    if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                        String str3 = zzazo.zzb;
                        if ("C1504".equals(str3)) {
                            continue;
                        } else if ("C1505".equals(str3)) {
                            continue;
                        } else if ("C1604".equals(str3)) {
                            continue;
                        } else if ("C1605".equals(str3)) {
                            continue;
                        }
                    }
                    if (i <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zzazo.zzc)) {
                        String str4 = zzazo.zzb;
                        if (str4.startsWith(a.O)) {
                            continue;
                        } else if (str4.startsWith("serrano")) {
                            continue;
                        } else if (str4.startsWith("jflte")) {
                            continue;
                        } else if (str4.startsWith("santos")) {
                            continue;
                        } else if (str4.startsWith("t0")) {
                            continue;
                        }
                    }
                    if (i > 19 || !zzazo.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (i4 < length) {
                            String str5 = supportedTypes[i4];
                            if (str5.equalsIgnoreCase(str)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb2.getCapabilitiesForType(str5);
                                    boolean zzc2 = zzavxVar2.zzc(str, capabilitiesForType);
                                    i2 = zza2;
                                    if (zzazo.zza <= 22) {
                                        try {
                                            String str6 = zzazo.zzd;
                                            if ((str6.equals("ODROID-XU3") || str6.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                                z = true;
                                                try {
                                                    if (zzd2) {
                                                        if (zzavuVar.zzb == zzc2) {
                                                        }
                                                        arrayList.add(zzavp.zza(name, str, capabilitiesForType, z, false));
                                                    }
                                                    arrayList.add(zzavp.zza(name, str, capabilitiesForType, z, false));
                                                } catch (Exception e) {
                                                    e = e;
                                                    if (zzazo.zza <= 23) {
                                                    }
                                                    throw e;
                                                }
                                                if (!zzd2 || zzavuVar.zzb) {
                                                    if (!zzd2 && zzc2) {
                                                        arrayList.add(zzavp.zza(name + ".secure", str, capabilitiesForType, z, true));
                                                        return arrayList;
                                                    }
                                                }
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            if (zzazo.zza <= 23 || arrayList.isEmpty()) {
                                                throw e;
                                            }
                                            i4++;
                                            zzavxVar2 = zzavxVar;
                                            zza2 = i2;
                                        }
                                    }
                                    z = false;
                                    if (zzd2) {
                                    }
                                    if (!zzd2) {
                                    }
                                    if (!zzd2) {
                                        arrayList.add(zzavp.zza(name + ".secure", str, capabilitiesForType, z, true));
                                        return arrayList;
                                    }
                                    continue;
                                } catch (Exception e3) {
                                    e = e3;
                                    i2 = zza2;
                                }
                            } else {
                                i2 = zza2;
                            }
                            i4++;
                            zzavxVar2 = zzavxVar;
                            zza2 = i2;
                        }
                        continue;
                    }
                }
                i3++;
                zzavxVar2 = zzavxVar;
                zza2 = zza2;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zzavw(e4, null);
        }
    }
}