package com.google.android.gms.internal.ads;

import com.p7700g.p99005.sm4;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import com.squareup.moshi.adapters.Iso8601Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzajy {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                zzajn.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzajn.zzd("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @z1
    public static zzaik zzb(zzaix zzaixVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaixVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(sm4.l);
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get(sm4.f);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get(sm4.n);
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get(sm4.t);
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get(sm4.m);
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zza <= 0 || zza2 < zza) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zza2 - zza);
                j3 = j4;
            }
        }
        zzaik zzaikVar = new zzaik();
        zzaikVar.zza = zzaixVar.zzb;
        zzaikVar.zzb = str5;
        zzaikVar.zzf = j4;
        zzaikVar.zze = j3;
        zzaikVar.zzc = zza;
        zzaikVar.zzd = zza3;
        zzaikVar.zzg = map;
        zzaikVar.zzh = zzaixVar.zzd;
        return zzaikVar;
    }

    public static String zzc(long j) {
        return wo1.j(j, zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'"));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Iso8601Utils.GMT_ID));
        return simpleDateFormat;
    }
}