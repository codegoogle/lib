package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzavp {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    private final String zze;
    private final MediaCodecInfo.CodecCapabilities zzf;

    private zzavp(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zze = str2;
        this.zzf = codecCapabilities;
        boolean z3 = true;
        this.zzb = !z && codecCapabilities != null && zzazo.zza >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.zzc = codecCapabilities != null && zzazo.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || zzazo.zza < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.zzd = z3;
    }

    public static zzavp zza(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzavp(str, str2, codecCapabilities, z, z2);
    }

    public static zzavp zzb(String str) {
        return new zzavp("OMX.google.raw.decoder", null, null, false, false);
    }

    private final void zzh(String str) {
        String str2 = zzazo.zze;
    }

    @TargetApi(21)
    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d != -1.0d && d > zg2.s) {
            return videoCapabilities.areSizeAndRateSupported(i, i2, d);
        }
        return videoCapabilities.isSizeSupported(i, i2);
    }

    @TargetApi(21)
    public final boolean zzc(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() < i) {
            zzh(wo1.l("channelCount.support, ", i));
            return false;
        } else {
            return true;
        }
    }

    @TargetApi(21)
    public final boolean zzd(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            zzh(wo1.l("sampleRate.support, ", i));
            return false;
        }
    }

    public final boolean zze(String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] zzg;
        if (str == null || this.zze == null) {
            return true;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            str2 = "video/avc";
        } else if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            str2 = "video/hevc";
        } else if (trim.startsWith("vp9")) {
            str2 = "video/x-vnd.on2.vp9";
        } else if (trim.startsWith("vp8")) {
            str2 = "video/x-vnd.on2.vp8";
        } else if (trim.startsWith("mp4a")) {
            str2 = "audio/mp4a-latm";
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            str2 = "audio/ac3";
        } else if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            str2 = "audio/eac3";
        } else if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            str2 = "audio/vnd.dts";
        } else if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            str2 = "audio/vnd.dts.hd";
        } else if (trim.startsWith("opus")) {
            str2 = "audio/opus";
        } else {
            str2 = trim.startsWith("vorbis") ? "audio/vorbis" : null;
        }
        if (str2 == null) {
            return true;
        }
        if (!this.zze.equals(str2)) {
            zzh(wo1.v("codec.mime ", str, ", ", str2));
            return false;
        }
        Pair zzb = zzawb.zzb(str);
        if (zzb == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzg()) {
            if (codecProfileLevel.profile == ((Integer) zzb.first).intValue() && codecProfileLevel.level >= ((Integer) zzb.second).intValue()) {
                return true;
            }
        }
        zzh(wo1.v("codec.profileLevel, ", str, ", ", str2));
        return false;
    }

    @TargetApi(21)
    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        } else if (zzi(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && zzi(videoCapabilities, i2, i, d)) {
                StringBuilder J = wo1.J("sizeAndRate.rotated, ", i, "x", i2, "x");
                J.append(d);
                String str = zzazo.zze;
                J.toString();
                return true;
            }
            StringBuilder J2 = wo1.J("sizeAndRate.support, ", i, "x", i2, "x");
            J2.append(d);
            zzh(J2.toString());
            return false;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}