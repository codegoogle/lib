package com.google.android.gms.ads.identifier;

import com.google.android.gms.internal.ads_identifier.zzi;
import com.p7700g.p99005.s2;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
public final class zzc {
    @s2
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        String.valueOf(str).length();
                    }
                    zzi.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                String.valueOf(str).length();
                String.valueOf(message).length();
                zzi.zza();
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                String.valueOf(str).length();
                String.valueOf(message2).length();
                zzi.zza();
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                String.valueOf(str).length();
                String.valueOf(message3).length();
                zzi.zza();
            }
        } catch (Throwable th) {
            zzi.zza();
            throw th;
        }
    }
}