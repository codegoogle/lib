package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzecs implements zzffi {
    public final Context zza;
    public final String zzb;
    public final zzcah zzc;

    public zzecs(Context context, String str, zzcah zzcahVar, int i, byte[] bArr) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzcahVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e6, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzj("Received error HTTP response code: " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x020c, code lost:
        throw new com.google.android.gms.internal.ads.zzdzl(1, "Received error HTTP response code: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233 A[Catch: all -> 0x0242, TryCatch #0 {all -> 0x0242, blocks: (B:12:0x0099, B:91:0x0221, B:93:0x0233, B:95:0x0241, B:13:0x009f, B:15:0x00a7, B:16:0x00ac, B:18:0x00b0, B:21:0x00c2, B:25:0x00ca, B:26:0x00cd, B:27:0x00ce, B:28:0x00e6, B:30:0x00ec, B:32:0x0104, B:33:0x010e, B:34:0x0118, B:36:0x011d, B:46:0x0154, B:48:0x0162, B:51:0x0175, B:52:0x017b, B:53:0x017c, B:60:0x0190, B:61:0x0193, B:66:0x019b, B:68:0x01a7, B:72:0x01cc, B:73:0x01d8, B:74:0x01d9, B:75:0x01e5, B:76:0x01e6, B:77:0x020c), top: B:105:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0241 A[Catch: all -> 0x0242, TRY_LEAVE, TryCatch #0 {all -> 0x0242, blocks: (B:12:0x0099, B:91:0x0221, B:93:0x0233, B:95:0x0241, B:13:0x009f, B:15:0x00a7, B:16:0x00ac, B:18:0x00b0, B:21:0x00c2, B:25:0x00ca, B:26:0x00cd, B:27:0x00ce, B:28:0x00e6, B:30:0x00ec, B:32:0x0104, B:33:0x010e, B:34:0x0118, B:36:0x011d, B:46:0x0154, B:48:0x0162, B:51:0x0175, B:52:0x017b, B:53:0x017c, B:60:0x0190, B:61:0x0193, B:66:0x019b, B:68:0x01a7, B:72:0x01cc, B:73:0x01d8, B:74:0x01d9, B:75:0x01e5, B:76:0x01e6, B:77:0x020c), top: B:105:0x0099 }] */
    @Override // com.google.android.gms.internal.ads.zzffi
    /* renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzecr zza(zzecq zzecqVar) throws zzdzl {
        int i;
        zzecr zzecrVar;
        zzcfh zzcfhVar;
        int responseCode;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        zzecs zzecsVar = this;
        String str = zzecqVar.zza;
        int i2 = zzecqVar.zzb;
        Map map = zzecqVar.zzc;
        byte[] bArr = zzecqVar.zzd;
        String str2 = zzecqVar.zze;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        try {
            zzecr zzecrVar2 = new zzecr();
            String str3 = zzecsVar.zzb;
            zzcfi.zzi("SDK version: " + str3);
            zzcfi.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                    Context context = zzecsVar.zza;
                    String str4 = zzecsVar.zzb;
                    HttpURLConnection httpURLConnection2 = httpURLConnection;
                    zzecr zzecrVar3 = zzecrVar2;
                    i = 1;
                    try {
                        zzp.zze(context, str4, false, httpURLConnection2, false, i2);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection = httpURLConnection2;
                            try {
                                try {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    httpURLConnection2 = httpURLConnection;
                                } catch (zzdzl e) {
                                    e = e;
                                    zzecrVar = zzecrVar3;
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgX)).booleanValue()) {
                                        zzecrVar.zzd = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime;
                                        httpURLConnection.disconnect();
                                        return zzecrVar;
                                    }
                                    throw e;
                                }
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection.disconnect();
                                throw th;
                            }
                        }
                        httpURLConnection = httpURLConnection2;
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        int length = bArr.length;
                        BufferedOutputStream bufferedOutputStream2 = null;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                bufferedOutputStream.write(bArr);
                                IOUtils.closeQuietly(bufferedOutputStream);
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream2 = bufferedOutputStream;
                                IOUtils.closeQuietly(bufferedOutputStream2);
                                throw th;
                            }
                        }
                        zzcfhVar = new zzcfh(null);
                        zzcfhVar.zzc(httpURLConnection, bArr);
                        responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        zzcfhVar.zze(httpURLConnection, responseCode);
                        zzecrVar = zzecrVar3;
                    } catch (zzdzl e2) {
                        e = e2;
                        httpURLConnection = httpURLConnection2;
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (zzdzl e3) {
                    e = e3;
                    zzecrVar = zzecrVar2;
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    zzecrVar.zza = responseCode;
                    zzecrVar.zzb = hashMap;
                    zzecrVar.zzc = "";
                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                        } catch (Throwable th6) {
                            th = th6;
                            inputStreamReader = null;
                        }
                        try {
                            com.google.android.gms.ads.internal.zzt.zzp();
                            StringBuilder sb = new StringBuilder(8192);
                            char[] cArr = new char[2048];
                            while (true) {
                                int read = inputStreamReader.read(cArr);
                                if (read == -1) {
                                    break;
                                }
                                sb.append(cArr, 0, read);
                            }
                            String sb2 = sb.toString();
                            IOUtils.closeQuietly(inputStreamReader);
                            zzcfhVar.zzg(sb2);
                            zzecrVar.zzc = sb2;
                            if (TextUtils.isEmpty(sb2)) {
                                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzew)).booleanValue()) {
                                    throw new zzdzl(3);
                                }
                            }
                            zzecrVar.zzd = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime;
                        } catch (Throwable th7) {
                            th = th7;
                            IOUtils.closeQuietly(inputStreamReader);
                            throw th;
                        }
                    } else if (responseCode < 300 || responseCode >= 400) {
                        break;
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            URL url2 = new URL(headerField);
                            int i4 = i3 + 1;
                            if (i4 <= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzea)).intValue()) {
                                try {
                                    httpURLConnection.disconnect();
                                    zzecsVar = this;
                                    i3 = i4;
                                    zzecrVar2 = zzecrVar;
                                    url = url2;
                                } catch (IOException e4) {
                                    e = e4;
                                    String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    zzcfi.zzj(concat);
                                    throw new zzdzl(i, concat, e);
                                }
                            } else {
                                zzcfi.zzj("Too many redirects.");
                                throw new zzdzl(1, "Too many redirects");
                            }
                        } else {
                            zzcfi.zzj("No location header to follow redirect.");
                            throw new zzdzl(1, "No location header to follow redirect");
                        }
                    }
                } catch (zzdzl e5) {
                    e = e5;
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgX)).booleanValue()) {
                    }
                }
            }
        } catch (IOException e6) {
            e = e6;
            i = 1;
        }
    }
}