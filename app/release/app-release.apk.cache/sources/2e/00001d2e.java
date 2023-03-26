package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzase {
    public static final zzase zza = new zzasb();

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzasc zzd(int i, zzasc zzascVar, boolean z);

    public abstract zzasd zze(int i, zzasd zzasdVar, boolean z, long j);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((zzc() - 1) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzf(int i, zzasc zzascVar, zzasd zzasdVar, int i2) {
        zzd(i, zzascVar, false);
        zzg(0, zzasdVar, false);
        int i3 = 1;
        if (i == 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                }
                i3 = 0;
            } else if (zzc() - 1 == 0) {
                i3 = -1;
            }
            if (i3 == -1) {
                return -1;
            }
            zzg(i3, zzasdVar, false);
            return 0;
        }
        return i + 1;
    }

    public final zzasd zzg(int i, zzasd zzasdVar, boolean z) {
        return zze(i, zzasdVar, false, 0L);
    }

    public final boolean zzh() {
        return zzc() == 0;
    }
}