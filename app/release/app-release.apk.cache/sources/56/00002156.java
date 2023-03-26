package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.sm4;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class zzcfn implements zzcfa {
    @z1
    private final String zza;

    public zzcfn() {
        this.zza = null;
    }

    public zzcfn(@z1 String str) {
        this.zza = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    @Override // com.google.android.gms.internal.ads.zzcfa
    @s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zza(String str) {
        HttpURLConnection httpURLConnection;
        boolean isPackageSide;
        boolean z = false;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                zzcfi.zze("Pinging URL: " + str);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                zzcfi.zzj("Error while pinging URL: " + str + ". " + message);
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                zzcfi.zzj("Error while parsing ping URL: " + str + ". " + message2);
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                zzcfi.zzj("Error while pinging URL: " + str + ". " + message3);
                if (ClientLibraryUtils.isPackageSide()) {
                }
            }
            try {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                String str2 = this.zza;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty(sm4.v, str2);
                }
                httpURLConnection.setUseCaches(false);
                zzcfh zzcfhVar = new zzcfh(null);
                zzcfhVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzcfhVar.zze(httpURLConnection, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    z = true;
                    if (isPackageSide) {
                        return z;
                    }
                    return z;
                }
                zzcfi.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                return z;
            } finally {
                httpURLConnection.disconnect();
            }
        } finally {
            if (ClientLibraryUtils.isPackageSide()) {
                TrafficStats.clearThreadStatsTag();
            }
        }
    }
}