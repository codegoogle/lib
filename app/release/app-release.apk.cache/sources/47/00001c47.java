package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.video.module.a.a.m;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.sm4;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzajq implements zzaiu {
    public final zzajs zza;
    @Deprecated
    public final zzajp zzb;
    private final zzajp zzc;

    public zzajq(zzajp zzajpVar) {
        zzajs zzajsVar = new zzajs(4096);
        this.zzc = zzajpVar;
        this.zzb = zzajpVar;
        this.zza = zzajsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaiu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaix zza(zzajb zzajbVar) throws zzajk {
        zzajz zzajzVar;
        byte[] bArr;
        zzake zzakeVar;
        zzake zzakeVar2;
        int zzb;
        String str;
        zzajk zzajkVar;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                zzaik zzd = zzajbVar.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.zzb;
                    if (str3 != null) {
                        hashMap.put(sm4.r, str3);
                    }
                    long j = zzd.zzd;
                    if (j > 0) {
                        hashMap.put(sm4.q, zzajy.zzc(j));
                    }
                    map = hashMap;
                }
                String zzk = zzajbVar.zzk();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(zzajbVar.zzl());
                URL url = new URL(zzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int zzb2 = zzajbVar.zzb();
                httpURLConnection.setConnectTimeout(zzb2);
                httpURLConnection.setReadTimeout(zzb2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (zzajbVar.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] zzx = zzajbVar.zzx();
                        if (zzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(zzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != -1) {
                        zzajbVar.zza();
                        if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                            try {
                                zzajzVar = new zzajz(responseCode, zzakc.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaka(httpURLConnection));
                            } catch (Throwable th) {
                                th = th;
                                if (!z) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (IOException e) {
                                        e = e;
                                        zzajzVar = null;
                                        bArr = null;
                                        if (e instanceof SocketTimeoutException) {
                                            zzakeVar = new zzake("socket", new zzajj(), null);
                                        } else if (e instanceof MalformedURLException) {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzajbVar.zzk())), e);
                                        } else {
                                            if (zzajzVar != null) {
                                                int zzb3 = zzajzVar.zzb();
                                                zzajn.zzb("Unexpected response code %d for %s", Integer.valueOf(zzb3), zzajbVar.zzk());
                                                if (bArr != null) {
                                                    zzaix zzaixVar = new zzaix(zzb3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzajzVar.zzd());
                                                    if (zzb3 != 401 && zzb3 != 403) {
                                                        if (zzb3 >= 400 && zzb3 <= 499) {
                                                            throw new zzaio(zzaixVar);
                                                        }
                                                        throw new zzaji(zzaixVar);
                                                    }
                                                    zzakeVar = new zzake("auth", new zzaij(zzaixVar), null);
                                                } else {
                                                    zzakeVar = new zzake("network", new zzaiw(), null);
                                                }
                                            } else {
                                                throw new zzaiy(e);
                                            }
                                        }
                                        zzakeVar2 = zzakeVar;
                                        zzaip zzy = zzajbVar.zzy();
                                        zzb = zzajbVar.zzb();
                                        try {
                                            zzajkVar = zzakeVar2.zzb;
                                            zzy.zzc(zzajkVar);
                                            str2 = zzakeVar2.zza;
                                            zzajbVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                        } catch (zzajk e2) {
                                            str = zzakeVar2.zza;
                                            zzajbVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzb)));
                                            throw e2;
                                        }
                                    }
                                }
                                throw th;
                                break;
                            }
                        } else {
                            zzajzVar = new zzajz(responseCode, zzakc.zza(httpURLConnection.getHeaderFields()), -1, null);
                            httpURLConnection.disconnect();
                        }
                        try {
                            int zzb4 = zzajzVar.zzb();
                            List<zzait> zzd2 = zzajzVar.zzd();
                            if (zzb4 == 304) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                zzaik zzd3 = zzajbVar.zzd();
                                if (zzd3 == null) {
                                    return new zzaix(304, (byte[]) null, true, elapsedRealtime2, zzd2);
                                }
                                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                                if (!zzd2.isEmpty()) {
                                    for (zzait zzaitVar : zzd2) {
                                        treeSet.add(zzaitVar.zza());
                                    }
                                }
                                ArrayList arrayList = new ArrayList(zzd2);
                                List list = zzd3.zzh;
                                if (list != null) {
                                    if (!list.isEmpty()) {
                                        for (zzait zzaitVar2 : zzd3.zzh) {
                                            if (!treeSet.contains(zzaitVar2.zza())) {
                                                arrayList.add(zzaitVar2);
                                            }
                                        }
                                    }
                                } else if (!zzd3.zzg.isEmpty()) {
                                    for (Map.Entry entry : zzd3.zzg.entrySet()) {
                                        if (!treeSet.contains(entry.getKey())) {
                                            arrayList.add(new zzait((String) entry.getKey(), (String) entry.getValue()));
                                        }
                                    }
                                }
                                return new zzaix(304, zzd3.zza, true, elapsedRealtime2, (List) arrayList);
                            }
                            InputStream zzc = zzajzVar.zzc();
                            if (zzc != null) {
                                int zza = zzajzVar.zza();
                                try {
                                    zzajs zzajsVar = this.zza;
                                    zzakf zzakfVar = new zzakf(zzajsVar, zza);
                                    try {
                                        bArr3 = zzajsVar.zzb(1024);
                                        while (true) {
                                            try {
                                                int read = zzc.read(bArr3);
                                                if (read == -1) {
                                                    break;
                                                }
                                                zzakfVar.write(bArr3, 0, read);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                try {
                                                    zzc.close();
                                                } catch (IOException unused) {
                                                    zzajn.zzd("Error occurred when closing InputStream", new Object[0]);
                                                }
                                                zzajsVar.zza(bArr3);
                                                zzakfVar.close();
                                                throw th;
                                                break;
                                            }
                                        }
                                        bArr2 = zzakfVar.toByteArray();
                                        try {
                                            zzc.close();
                                        } catch (IOException unused2) {
                                            zzajn.zzd("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        zzajsVar.zza(bArr3);
                                        zzakfVar.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bArr3 = null;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                    }
                                    zzakeVar2 = zzakeVar;
                                    zzaip zzy2 = zzajbVar.zzy();
                                    zzb = zzajbVar.zzb();
                                    zzajkVar = zzakeVar2.zzb;
                                    zzy2.zzc(zzajkVar);
                                    str2 = zzakeVar2.zza;
                                    zzajbVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                }
                            } else {
                                bArr2 = new byte[0];
                            }
                            try {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (!zzajn.zzb) {
                                    if (elapsedRealtime3 > m.af) {
                                    }
                                    if (zzb4 < 200 && zzb4 <= 299) {
                                        return new zzaix(zzb4, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzd2);
                                    }
                                    throw new IOException();
                                }
                                Object[] objArr = new Object[5];
                                objArr[0] = zzajbVar;
                                objArr[1] = Long.valueOf(elapsedRealtime3);
                                objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : pg1.d;
                                objArr[3] = Integer.valueOf(zzb4);
                                objArr[4] = Integer.valueOf(zzajbVar.zzy().zza());
                                zzajn.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                                if (zzb4 < 200) {
                                }
                                throw new IOException();
                            } catch (IOException e4) {
                                e = e4;
                                bArr = bArr2;
                                if (e instanceof SocketTimeoutException) {
                                }
                                zzakeVar2 = zzakeVar;
                                zzaip zzy22 = zzajbVar.zzy();
                                zzb = zzajbVar.zzb();
                                zzajkVar = zzakeVar2.zzb;
                                zzy22.zzc(zzajkVar);
                                str2 = zzakeVar2.zza;
                                zzajbVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                            }
                        } catch (IOException e5) {
                            e = e5;
                        }
                    } else {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                            break;
                        } catch (Throwable th4) {
                            th = th4;
                            z = false;
                            if (!z) {
                            }
                            throw th;
                            break;
                            break;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
            str2 = zzakeVar2.zza;
            zzajbVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
        }
    }
}