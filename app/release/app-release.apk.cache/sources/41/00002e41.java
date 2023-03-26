package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(31)
/* loaded from: classes2.dex */
public final class zzmq implements zzkk, zzmr {
    private final Context zza;
    private final zzms zzb;
    private final PlaybackSession zzc;
    @z1
    private String zzi;
    @z1
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    @z1
    private zzbr zzn;
    @z1
    private zzmp zzo;
    @z1
    private zzmp zzp;
    @z1
    private zzmp zzq;
    @z1
    private zzad zzr;
    @z1
    private zzad zzs;
    @z1
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzch zze = new zzch();
    private final zzcf zzf = new zzcf();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzmq(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmo zzmoVar = new zzmo(zzmo.zza);
        this.zzb = zzmoVar;
        zzmoVar.zzg(this);
    }

    @z1
    public static zzmq zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmq(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i) {
        switch (zzeg.zzl(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, @z1 zzad zzadVar, int i) {
        if (zzeg.zzS(this.zzs, zzadVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzadVar;
        zzx(0, j, zzadVar, i2);
    }

    private final void zzu(long j, @z1 zzad zzadVar, int i) {
        if (zzeg.zzS(this.zzt, zzadVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzadVar;
        zzx(2, j, zzadVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzci zzciVar, @z1 zzsa zzsaVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzsaVar == null || (zza = zzciVar.zza(zzsaVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzciVar.zzd(zza, this.zzf, false);
        zzciVar.zze(this.zzf.zzd, this.zze, 0L);
        zzaw zzawVar = this.zze.zzd.zzd;
        if (zzawVar != null) {
            int zzp = zzeg.zzp(zzawVar.zza);
            i = zzp != 0 ? zzp != 1 ? zzp != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzch zzchVar = this.zze;
        if (zzchVar.zzn != -9223372036854775807L && !zzchVar.zzl && !zzchVar.zzi && !zzchVar.zzb()) {
            builder.setMediaDurationMillis(zzeg.zzz(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, @z1 zzad zzadVar, int i) {
        if (zzeg.zzS(this.zzr, zzadVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzadVar;
        zzx(1, j, zzadVar, i2);
    }

    private final void zzx(int i, long j, @z1 zzad zzadVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzadVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzadVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzadVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzadVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzadVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzadVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzadVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzadVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzadVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzadVar.zzd;
            if (str4 != null) {
                String[] zzaf = zzeg.zzaf(str4, "-");
                Pair create = Pair.create(zzaf[0], zzaf.length >= 2 ? zzaf[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzadVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(@z1 zzmp zzmpVar) {
        return zzmpVar != null && zzmpVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzc(zzki zzkiVar, String str) {
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar == null || !zzsaVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-alpha03");
            zzv(zzkiVar.zzb, zzkiVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzd(zzki zzkiVar, String str, boolean z) {
        zzsa zzsaVar = zzkiVar.zzd;
        if ((zzsaVar == null || !zzsaVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zze(zzki zzkiVar, zzad zzadVar, zzgm zzgmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzf(zzki zzkiVar, int i, long j, long j2) {
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar != null) {
            String zze = this.zzb.zze(zzkiVar.zzb, zzsaVar);
            Long l = (Long) this.zzh.get(zze);
            Long l2 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zze, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzki zzkiVar, zzrw zzrwVar) {
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar == null) {
            return;
        }
        zzad zzadVar = zzrwVar.zzb;
        Objects.requireNonNull(zzadVar);
        zzmp zzmpVar = new zzmp(zzadVar, 0, this.zzb.zze(zzkiVar.zzb, zzsaVar));
        int i = zzrwVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzmpVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzmpVar;
                return;
            }
        }
        this.zzo = zzmpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzh(zzki zzkiVar, int i, long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzcb zzcbVar, zzkj zzkjVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int zzr;
        zzv zzvVar;
        int i5;
        int i6;
        if (zzkjVar.zzb() == 0) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < zzkjVar.zzb(); i8++) {
            int zza = zzkjVar.zza(i8);
            zzki zzc = zzkjVar.zzc(zza);
            if (zza == 0) {
                this.zzb.zzj(zzc);
            } else if (zza == 11) {
                this.zzb.zzi(zzc, this.zzk);
            } else {
                this.zzb.zzh(zzc);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzkjVar.zzd(0)) {
            zzki zzc2 = zzkjVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzc2.zzb, zzc2.zzd);
            }
        }
        if (zzkjVar.zzd(2) && this.zzj != null) {
            zzfrj zza2 = zzcbVar.zzo().zza();
            int size = zza2.size();
            int i9 = 0;
            loop1: while (true) {
                if (i9 >= size) {
                    zzvVar = null;
                    break;
                }
                zzcs zzcsVar = (zzcs) zza2.get(i9);
                int i10 = 0;
                while (true) {
                    int i11 = zzcsVar.zzb;
                    i6 = i9 + 1;
                    if (i10 <= 0) {
                        if (zzcsVar.zzd(i10) && (zzvVar = zzcsVar.zzb(i10).zzp) != null) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                i9 = i6;
            }
            if (zzvVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i12 = zzeg.zza;
                int i13 = 0;
                while (true) {
                    if (i13 >= zzvVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzvVar.zza(i13).zza;
                    if (uuid.equals(zzm.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzm.zze)) {
                        i5 = 2;
                        break;
                    } else if (uuid.equals(zzm.zzc)) {
                        i5 = 6;
                        break;
                    } else {
                        i13++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (zzkjVar.zzd(1011)) {
            this.zzy++;
        }
        zzbr zzbrVar = this.zzn;
        if (zzbrVar != null) {
            Context context = this.zza;
            int i14 = 23;
            if (zzbrVar.zzb == 1001) {
                i14 = 20;
            } else {
                zzgt zzgtVar = (zzgt) zzbrVar;
                int i15 = zzgtVar.zze;
                int i16 = zzgtVar.zzi;
                Throwable cause = zzbrVar.getCause();
                Objects.requireNonNull(cause);
                if (cause instanceof IOException) {
                    if (cause instanceof zzfl) {
                        i7 = ((zzfl) cause).zzd;
                        i14 = 5;
                    } else if ((cause instanceof zzfk) || (cause instanceof zzbp)) {
                        i7 = 0;
                        i14 = 11;
                    } else {
                        boolean z2 = cause instanceof zzfj;
                        if (!z2 && !(cause instanceof zzft)) {
                            if (zzbrVar.zzb == 1002) {
                                i7 = 0;
                                i14 = 21;
                            } else if (cause instanceof zzpa) {
                                Throwable cause2 = cause.getCause();
                                Objects.requireNonNull(cause2);
                                int i17 = zzeg.zza;
                                if (i17 >= 21 && (cause2 instanceof MediaDrm.MediaDrmStateException)) {
                                    i7 = zzeg.zzm(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                    zzr = zzr(i7);
                                    i14 = zzr;
                                } else if (i17 >= 23 && (cause2 instanceof MediaDrmResetException)) {
                                    i7 = 0;
                                    i14 = 27;
                                } else if (cause2 instanceof NotProvisionedException) {
                                    i7 = 0;
                                    i14 = 24;
                                } else if (cause2 instanceof DeniedByServerException) {
                                    i7 = 0;
                                    i14 = 29;
                                } else {
                                    if (!(cause2 instanceof zzpl)) {
                                        if (cause2 instanceof zzoy) {
                                            i7 = 0;
                                            i14 = 28;
                                        } else {
                                            i7 = 0;
                                            i14 = 30;
                                        }
                                    }
                                    i7 = 0;
                                }
                            } else if ((cause instanceof zzff) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause3 = cause.getCause();
                                Objects.requireNonNull(cause3);
                                Throwable cause4 = cause3.getCause();
                                if (zzeg.zza >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                    i7 = 0;
                                    i14 = 32;
                                } else {
                                    i7 = 0;
                                    i14 = 31;
                                }
                            } else {
                                i7 = 0;
                                i14 = 9;
                            }
                        } else if (zzdw.zzb(context).zza() == 1) {
                            i7 = 0;
                            i14 = 3;
                        } else {
                            Throwable cause5 = cause.getCause();
                            if (cause5 instanceof UnknownHostException) {
                                i7 = 0;
                                i14 = 6;
                            } else if (cause5 instanceof SocketTimeoutException) {
                                i7 = 0;
                                i14 = 7;
                            } else if (z2 && ((zzfj) cause).zzc == 1) {
                                i7 = 0;
                                i14 = 4;
                            } else {
                                i7 = 0;
                                i14 = 8;
                            }
                        }
                    }
                } else if (i15 == 1 && (i16 == 0 || i16 == 1)) {
                    i7 = 0;
                    i14 = 35;
                } else if (i15 == 1 && i16 == 3) {
                    i7 = 0;
                    i14 = 15;
                } else {
                    if (i15 != 1 || i16 != 2) {
                        if (cause instanceof zzqh) {
                            i7 = zzeg.zzm(((zzqh) cause).zzd);
                            i14 = 13;
                        } else {
                            if (cause instanceof zzqe) {
                                i7 = zzeg.zzm(((zzqe) cause).zzb);
                            } else if (cause instanceof OutOfMemoryError) {
                                i7 = 0;
                            } else if (cause instanceof zznm) {
                                i7 = ((zznm) cause).zza;
                                i14 = 17;
                            } else if (cause instanceof zznp) {
                                i7 = ((zznp) cause).zza;
                                i14 = 18;
                            } else {
                                int i18 = zzeg.zza;
                                if (cause instanceof MediaCodec.CryptoException) {
                                    i7 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    zzr = zzr(i7);
                                    i14 = zzr;
                                } else {
                                    i7 = 0;
                                    i14 = 22;
                                }
                            }
                            i14 = 14;
                        }
                    }
                    i7 = 0;
                }
            }
            this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i14).setSubErrorCode(i7).setException(zzbrVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzkjVar.zzd(2)) {
            zzct zzo = zzcbVar.zzo();
            boolean zzb = zzo.zzb(2);
            boolean zzb2 = zzo.zzb(1);
            boolean zzb3 = zzo.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (zzb) {
                i4 = 0;
            } else {
                i4 = 0;
                zzw(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzt(elapsedRealtime, null, i4);
            }
            if (!zzb3) {
                zzu(elapsedRealtime, null, i4);
            }
        }
        if (zzy(this.zzo)) {
            zzad zzadVar = this.zzo.zza;
            if (zzadVar.zzs != -1) {
                i = 0;
                zzw(elapsedRealtime, zzadVar, 0);
                this.zzo = null;
                if (zzy(this.zzp)) {
                    zzt(elapsedRealtime, this.zzp.zza, i);
                    this.zzp = null;
                }
                if (zzy(this.zzq)) {
                    zzu(elapsedRealtime, this.zzq.zza, i);
                    this.zzq = null;
                }
                switch (zzdw.zzb(this.zza).zza()) {
                    case 0:
                        i2 = 0;
                        break;
                    case 1:
                        i2 = 9;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                    case 8:
                    default:
                        i2 = 1;
                        break;
                    case 7:
                        i2 = 3;
                        break;
                    case 9:
                        i2 = 8;
                        break;
                    case 10:
                        i2 = 7;
                        break;
                }
                if (i2 != this.zzm) {
                    this.zzm = i2;
                    this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i2).setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).build());
                }
                if (zzcbVar.zzh() == 2) {
                    z = false;
                    this.zzu = false;
                } else {
                    z = false;
                }
                if (((zzjy) zzcbVar).zzw() != null) {
                    this.zzv = z;
                } else if (zzkjVar.zzd(10)) {
                    this.zzv = true;
                }
                int zzh = zzcbVar.zzh();
                if (!this.zzu) {
                    i3 = 5;
                } else if (this.zzv) {
                    i3 = 13;
                } else {
                    i3 = 4;
                    if (zzh == 4) {
                        i3 = 11;
                    } else if (zzh == 2) {
                        int i19 = this.zzl;
                        if (i19 == 0 || i19 == 2) {
                            i3 = 2;
                        } else if (zzcbVar.zzq()) {
                            i3 = zzcbVar.zzi() != 0 ? 10 : 6;
                        } else {
                            i3 = 7;
                        }
                    } else if (zzh != 3) {
                        i3 = (zzh != 1 || this.zzl == 0) ? this.zzl : 12;
                    } else if (zzcbVar.zzq()) {
                        i3 = zzcbVar.zzi() != 0 ? 9 : 3;
                    }
                }
                if (this.zzl != i3) {
                    this.zzl = i3;
                    this.zzz = true;
                    this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).build());
                }
                if (zzkjVar.zzd(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                    return;
                }
                this.zzb.zzf(zzkjVar.zzc(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED));
                return;
            }
        }
        i = 0;
        if (zzy(this.zzp)) {
        }
        if (zzy(this.zzq)) {
        }
        switch (zzdw.zzb(this.zza).zza()) {
        }
        if (i2 != this.zzm) {
        }
        if (zzcbVar.zzh() == 2) {
        }
        if (((zzjy) zzcbVar).zzw() != null) {
        }
        int zzh2 = zzcbVar.zzh();
        if (!this.zzu) {
        }
        if (this.zzl != i3) {
        }
        if (zzkjVar.zzd(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzj(zzki zzkiVar, zzrr zzrrVar, zzrw zzrwVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzk(zzki zzkiVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzl(zzki zzkiVar, zzbr zzbrVar) {
        this.zzn = zzbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzm(zzki zzkiVar, zzca zzcaVar, zzca zzcaVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzn(zzki zzkiVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzo(zzki zzkiVar, zzgl zzglVar) {
        this.zzw += zzglVar.zzg;
        this.zzx += zzglVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzp(zzki zzkiVar, zzad zzadVar, zzgm zzgmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzq(zzki zzkiVar, zzcv zzcvVar) {
        zzmp zzmpVar = this.zzo;
        if (zzmpVar != null) {
            zzad zzadVar = zzmpVar.zza;
            if (zzadVar.zzs == -1) {
                zzab zzb = zzadVar.zzb();
                zzb.zzX(zzcvVar.zzc);
                zzb.zzF(zzcvVar.zzd);
                this.zzo = new zzmp(zzb.zzY(), 0, zzmpVar.zzc);
            }
        }
    }
}