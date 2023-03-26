package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.p7700g.p99005.z1;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznu {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zznt zza;
    private final long[] zzb;
    @z1
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    @z1
    private zzns zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    @z1
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zznu(zznt zzntVar) {
        this.zza = zzntVar;
        int i = zzeg.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final long zzn() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000) + this.zzz);
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzeg.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzo() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzn() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long j;
        long j2;
        zznn zznnVar;
        zznn zznnVar2;
        zznj zznjVar;
        Method method;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzm = zzm(zzn());
            if (zzm != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzm >= 30000) {
                    long[] jArr = this.zzb;
                    int i = this.zzv;
                    jArr[i] = zzm - nanoTime;
                    this.zzv = (i + 1) % 10;
                    int i2 = this.zzw;
                    if (i2 < 10) {
                        this.zzw = i2 + 1;
                    }
                    this.zzm = nanoTime;
                    this.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzl = (this.zzb[i3] / i4) + this.zzl;
                        i3++;
                    }
                }
                if (!this.zzh) {
                    zzns zznsVar = this.zzf;
                    Objects.requireNonNull(zznsVar);
                    if (zznsVar.zzg(nanoTime)) {
                        long zzb = zznsVar.zzb();
                        long zza = zznsVar.zza();
                        if (Math.abs(zzb - nanoTime) > 5000000) {
                            zzoh zzohVar = (zzoh) this.zza;
                            zzohVar.zza.zzE();
                            zzohVar.zza.zzF();
                            zznsVar.zzd();
                        } else if (Math.abs(zzm(zza) - zzm) > 5000000) {
                            zzoh zzohVar2 = (zzoh) this.zza;
                            zzohVar2.zza.zzE();
                            zzohVar2.zza.zzF();
                            zznsVar.zzd();
                        } else {
                            zznsVar.zzc();
                        }
                    }
                    if (this.zzq && (method = this.zzn) != null && nanoTime - this.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.zzc;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = zzeg.zza;
                            long intValue = (((Integer) method.invoke(audioTrack2, new Object[0])).intValue() * 1000) - this.zzi;
                            this.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzo = max;
                            if (max > 5000000) {
                                this.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzn = null;
                        }
                        this.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzns zznsVar2 = this.zzf;
        Objects.requireNonNull(zznsVar2);
        boolean zzf = zznsVar2.zzf();
        if (zzf) {
            j2 = zzeg.zzs(nanoTime2 - zznsVar2.zzb(), this.zzj) + zzm(zznsVar2.zza());
        } else {
            if (this.zzw == 0) {
                j = zzm(zzn());
            } else {
                j = this.zzl + nanoTime2;
            }
            j2 = j;
            if (!z) {
                j2 = Math.max(0L, j2 - this.zzo);
            }
        }
        if (this.zzD != zzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j3 = nanoTime2 - this.zzF;
        if (j3 < 1000000) {
            long j4 = (j3 * 1000) / 1000000;
            j2 = (((zzeg.zzs(j3, this.zzj) + this.zzE) * (1000 - j4)) + (j2 * j4)) / 1000;
        }
        if (!this.zzk) {
            long j5 = this.zzB;
            if (j2 > j5) {
                this.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzeg.zzz(zzeg.zzu(zzeg.zzz(j2 - j5), this.zzj));
                zzom zzomVar = ((zzoh) this.zza).zza;
                zznnVar = zzomVar.zzn;
                if (zznnVar != null) {
                    zznnVar2 = zzomVar.zzn;
                    zznjVar = ((zzor) zznnVar2).zza.zzc;
                    zznjVar.zzr(currentTimeMillis);
                }
            }
        }
        this.zzC = nanoTime2;
        this.zzB = j2;
        this.zzD = zzf;
        return j2;
    }

    public final long zzc(long j) {
        return zzeg.zzz(zzm(j - zzn()));
    }

    public final void zzd(long j) {
        this.zzz = zzn();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zze() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zzns(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        boolean z2 = true;
        if (z && zzeg.zza < 23) {
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.zzh = z2;
            boolean zzU = zzeg.zzU(i);
            this.zzq = zzU;
            this.zzi = !zzU ? zzm(i3 / i2) : -9223372036854775807L;
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzu = 0L;
            this.zzp = false;
            this.zzx = -9223372036854775807L;
            this.zzy = -9223372036854775807L;
            this.zzr = 0L;
            this.zzo = 0L;
            this.zzj = 1.0f;
        }
        z2 = false;
        this.zzh = z2;
        boolean zzU2 = zzeg.zzU(i);
        this.zzq = zzU2;
        this.zzi = !zzU2 ? zzm(i3 / i2) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzp = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final void zzg() {
        zzns zznsVar = this.zzf;
        Objects.requireNonNull(zznsVar);
        zznsVar.zze();
    }

    public final boolean zzh(long j) {
        if (j <= zzn()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && zzn() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzj(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzk(long j) {
        zznn zznnVar;
        long j2;
        zznn zznnVar2;
        zznj zznjVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzn() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzh = zzh(j);
        this.zzp = zzh;
        if (z && !zzh && playState != 1) {
            zznt zzntVar = this.zza;
            int i = this.zze;
            long zzz = zzeg.zzz(this.zzi);
            zzoh zzohVar = (zzoh) zzntVar;
            zznnVar = zzohVar.zza.zzn;
            if (zznnVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzom zzomVar = zzohVar.zza;
                j2 = zzomVar.zzS;
                zznnVar2 = zzomVar.zzn;
                zznjVar = ((zzor) zznnVar2).zza.zzc;
                zznjVar.zzt(i, zzz, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzx == -9223372036854775807L) {
            zzns zznsVar = this.zzf;
            Objects.requireNonNull(zznsVar);
            zznsVar.zze();
            return true;
        }
        return false;
    }
}