package com.google.android.gms.internal.ads;

import com.p7700g.p99005.la1;
import com.p7700g.p99005.wo1;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfou {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zzb = zzfpi.zzb("%s (%s) must not be negative", la1.l, Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException(wo1.l("negative size: ", i2));
            } else {
                zzb = zzfpi.zzb("%s (%s) must be less than size (%s)", la1.l, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
        return i;
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzj(i, i2, la1.l));
        }
        return i;
    }

    public static Object zzc(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(@CheckForNull Object obj, String str, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfpi.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i, int i2, int i3) {
        String zzj;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                zzj = (i2 < 0 || i2 > i3) ? zzj(i2, i3, "end index") : zzfpi.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zzj = zzj(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(zzj);
        }
    }

    public static void zzh(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i, int i2, String str) {
        if (i < 0) {
            return zzfpi.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfpi.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(wo1.l("negative size: ", i2));
    }
}