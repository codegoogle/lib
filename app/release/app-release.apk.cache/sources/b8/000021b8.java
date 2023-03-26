package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.sm4;
import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjd implements zzays {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzayr zzf;
    private final zzayy zzg;
    private zzayl zzh;
    private HttpURLConnection zzi;
    private final Queue zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcjd(String str, zzayy zzayyVar, int i, int i2, long j, long j2) {
        zzayz.zzb(str);
        this.zze = str;
        this.zzg = zzayyVar;
        this.zzf = new zzayr();
        this.zzc = i;
        this.zzd = i2;
        this.zzj = new ArrayDeque();
        this.zzr = j;
        this.zzs = j2;
    }

    private final void zzg() {
        while (!this.zzj.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzj.remove()).disconnect();
            } catch (Exception e) {
                zzcfi.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i, int i2) throws zzayp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            long j2 = this.zzn;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = i2;
            long j4 = this.zzs;
            long j5 = this.zzq;
            long j6 = j5 + 1;
            if (this.zzo + j2 + j3 + j4 > j6) {
                long j7 = this.zzp;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.zzr + j6) - j4) - 1, (-1) + j6 + j3));
                    zzf(j6, min, 2);
                    this.zzq = min;
                    j5 = min;
                }
            }
            int read = this.zzk.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzayy zzayyVar = this.zzg;
                if (zzayyVar != null) {
                    ((zzciz) zzayyVar).zzW(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzayp(e, this.zzh, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzaylVar) throws zzayp {
        this.zzh = zzaylVar;
        this.zzn = 0L;
        long j = zzaylVar.zzc;
        long j2 = zzaylVar.zzd;
        long min = j2 == -1 ? this.zzr : Math.min(this.zzr, j2);
        this.zzo = j;
        HttpURLConnection zzf = zzf(j, (min + j) - 1, 1);
        this.zzi = zzf;
        String headerField = zzf.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = zzaylVar.zzd;
                    if (j3 != -1) {
                        this.zzm = j3;
                        this.zzp = Math.max(parseLong, (this.zzo + j3) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzl = true;
                    zzayy zzayyVar = this.zzg;
                    if (zzayyVar != null) {
                        ((zzciz) zzayyVar).zzk(this, zzaylVar);
                    }
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcfi.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcjb(headerField, zzaylVar);
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    @z1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws zzayp {
        try {
            InputStream inputStream = this.zzk;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzayp(e, this.zzh, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzg();
            if (this.zzl) {
                this.zzl = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzays
    @z1
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzf(long j, long j2, int i) throws zzayp {
        String uri = this.zzh.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty(sm4.v, this.zze);
            httpURLConnection.setRequestProperty(sm4.c, "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzj.add(httpURLConnection);
            String uri2 = this.zzh.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzk != null) {
                            inputStream = new SequenceInputStream(this.zzk, inputStream);
                        }
                        this.zzk = inputStream;
                        return httpURLConnection;
                    } catch (IOException e) {
                        zzg();
                        throw new zzayp(e, this.zzh, i);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzg();
                throw new zzcjc(responseCode, headerFields, this.zzh, i);
            } catch (IOException e2) {
                zzg();
                throw new zzayp("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.zzh, i);
            }
        } catch (IOException e3) {
            throw new zzayp("Unable to connect to ".concat(String.valueOf(uri)), e3, this.zzh, i);
        }
    }
}