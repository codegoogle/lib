package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzqf {
    public final String zza;
    public final String zzb;
    public final String zzc;
    @z1
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    @r2
    public zzqf(String str, String str2, String str3, @z1 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbo.zzh(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzqf zzc(String str, String str2, String str3, @z1 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null) {
            int i = zzeg.zza;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (i <= 22) {
                    String str4 = zzeg.zzd;
                    if (!"ODROID-XU3".equals(str4)) {
                    }
                    if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                    }
                }
                z6 = true;
                return new zzqf(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
            }
        }
        z6 = false;
        return new zzqf(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    @e2(21)
    private static Point zzh(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzeg.zze(i, widthAlignment) * widthAlignment, zzeg.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzi(String str) {
        String str2 = zzeg.zze;
    }

    @e2(21)
    private static boolean zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzh = zzh(videoCapabilities, i, i2);
        int i3 = zzh.x;
        int i4 = zzh.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public final String toString() {
        return this.zza;
    }

    @e2(21)
    @z1
    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzh(videoCapabilities, i, i2);
    }

    public final zzgm zzb(zzad zzadVar, zzad zzadVar2) {
        int i = true != zzeg.zzS(zzadVar.zzm, zzadVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzadVar.zzu != zzadVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzadVar.zzr != zzadVar2.zzr || zzadVar.zzs != zzadVar2.zzs)) {
                i |= 512;
            }
            if (!zzeg.zzS(zzadVar.zzy, zzadVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzeg.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzadVar.zzd(zzadVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgm(this.zza, zzadVar, zzadVar2, true != zzadVar.zzd(zzadVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzadVar.zzz != zzadVar2.zzz) {
                i |= 4096;
            }
            if (zzadVar.zzA != zzadVar2.zzA) {
                i |= 8192;
            }
            if (zzadVar.zzB != zzadVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzqx.zzb(zzadVar);
                Pair zzb2 = zzqx.zzb(zzadVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgm(this.zza, zzadVar, zzadVar2, 3, 0);
                    }
                }
            }
            if (!zzadVar.zzd(zzadVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgm(this.zza, zzadVar, zzadVar2, 1, 0);
            }
        }
        return new zzgm(this.zza, zzadVar, zzadVar2, 0, i);
    }

    public final boolean zzd(zzad zzadVar) throws zzqr {
        int i;
        Pair zzb;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.zzb.equals(zzadVar.zzm) || this.zzb.equals(zzqx.zze(zzadVar))) {
            int i2 = 16;
            if (zzadVar.zzj != null && (zzb = zzqx.zzb(zzadVar)) != null) {
                int intValue = ((Integer) zzb.first).intValue();
                int intValue2 = ((Integer) zzb.second).intValue();
                int i3 = 2;
                if ("video/dolby-vision".equals(zzadVar.zzm)) {
                    if ("video/avc".equals(this.zzb)) {
                        intValue2 = 0;
                        intValue = 8;
                    } else if ("video/hevc".equals(this.zzb)) {
                        intValue2 = 0;
                        intValue = 2;
                    }
                }
                if (!this.zzh) {
                    if (intValue == 42) {
                        intValue = 42;
                    }
                }
                MediaCodecInfo.CodecProfileLevel[] zzg = zzg();
                if (zzeg.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzg.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i3 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i3 = 512;
                    } else if (intValue3 >= 60000000) {
                        i3 = 256;
                    } else if (intValue3 >= 30000000) {
                        i3 = 128;
                    } else if (intValue3 >= 18000000) {
                        i3 = 64;
                    } else if (intValue3 >= 12000000) {
                        i3 = 32;
                    } else if (intValue3 >= 7200000) {
                        i3 = 16;
                    } else if (intValue3 >= 3600000) {
                        i3 = 8;
                    } else if (intValue3 >= 1800000) {
                        i3 = 4;
                    } else if (intValue3 < 800000) {
                        i3 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i3;
                    zzg = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzg) {
                    if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                    }
                }
                zzi(wo1.v("codec.profileLevel, ", zzadVar.zzj, ", ", this.zzc));
                return false;
            }
            if (this.zzh) {
                int i4 = zzadVar.zzr;
                if (i4 <= 0 || (i = zzadVar.zzs) <= 0) {
                    return true;
                }
                if (zzeg.zza >= 21) {
                    return zzf(i4, i, zzadVar.zzt);
                }
                boolean z = i4 * i <= zzqx.zza();
                if (!z) {
                    zzi(wo1.o("legacyFrameSize, ", zzadVar.zzr, "x", zzadVar.zzs));
                }
                return z;
            }
            int i5 = zzeg.zza;
            if (i5 >= 21) {
                int i6 = zzadVar.zzA;
                if (i6 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 == null) {
                        zzi("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        zzi("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i6)) {
                        zzi(wo1.l("sampleRate.support, ", i6));
                        return false;
                    }
                }
                int i7 = zzadVar.zzz;
                if (i7 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                    if (codecCapabilities3 == null) {
                        zzi("channelCount.caps");
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            zzi("channelCount.aCaps");
                        } else {
                            String str = this.zzb;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str) && !"audio/3gpp".equals(str) && !"audio/amr-wb".equals(str) && !"audio/mp4a-latm".equals(str) && !"audio/vorbis".equals(str) && !"audio/opus".equals(str) && !"audio/raw".equals(str) && !"audio/flac".equals(str) && !"audio/g711-alaw".equals(str) && !"audio/g711-mlaw".equals(str) && !"audio/gsm".equals(str))) {
                                if ("audio/ac3".equals(str)) {
                                    i2 = 6;
                                } else if (!"audio/eac3".equals(str)) {
                                    i2 = 30;
                                }
                                maxInputChannelCount = i2;
                            }
                            if (maxInputChannelCount < i7) {
                                zzi(wo1.l("channelCount.support, ", i7));
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean zze(zzad zzadVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzqx.zzb(zzadVar);
        return zzb != null && ((Integer) zzb.first).intValue() == 42;
    }

    @e2(21)
    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzi("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzi("sizeAndRate.vCaps");
            return false;
        } else if (zzj(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzeg.zzb)) && zzj(videoCapabilities, i2, i, d))) {
                StringBuilder J = wo1.J("sizeAndRate.rotated, ", i, "x", i2, "x");
                J.append(d);
                String str = zzeg.zze;
                J.toString();
                return true;
            }
            StringBuilder J2 = wo1.J("sizeAndRate.support, ", i, "x", i2, "x");
            J2.append(d);
            zzi(J2.toString());
            return false;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}