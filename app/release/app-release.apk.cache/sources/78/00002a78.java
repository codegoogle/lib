package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p7700g.p99005.z1;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfo {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(@z1 String str, @z1 String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = zza.matcher(str2);
        if (matcher.matches()) {
            try {
                String group = matcher.group(2);
                Objects.requireNonNull(group);
                long parseLong = Long.parseLong(group);
                String group2 = matcher.group(1);
                Objects.requireNonNull(group2);
                long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                return j < 0 ? parseLong2 : j != parseLong2 ? Math.max(j, parseLong2) : j;
            } catch (NumberFormatException unused2) {
                return j;
            }
        }
        return j;
    }

    public static long zzb(@z1 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            return Long.parseLong(group);
        }
        return -1L;
    }
}