package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.p7700g.p99005.la1;
import com.p7700g.p99005.wo1;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes2.dex */
public final class zzs {
    @CanIgnoreReturnValue
    public static int zza(int i, int i2, String str) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzy.zza("%s (%s) must not be negative", la1.l, Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException(wo1.l("negative size: ", i2));
            } else {
                zza = zzy.zza("%s (%s) must be less than size (%s)", la1.l, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i;
    }

    @CanIgnoreReturnValue
    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzd(i, i2, la1.l));
        }
        return i;
    }

    public static void zzc(int i, int i2, int i3) {
        String zzd;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                zzd = (i2 < 0 || i2 > i3) ? zzd(i2, i3, "end index") : zzy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zzd = zzd(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(zzd);
        }
    }

    private static String zzd(int i, int i2, String str) {
        if (i < 0) {
            return zzy.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(wo1.l("negative size: ", i2));
    }
}