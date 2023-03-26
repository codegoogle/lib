package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.AdError;
import com.p7700g.p99005.sm4;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfd extends zzek implements zzfn {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    @z1
    private final String zze;
    @z1
    private final zzfm zzf;
    private final zzfm zzg;
    @z1
    private zzev zzh;
    @z1
    private HttpURLConnection zzi;
    @z1
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzfd() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, @z1 byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(this.zzg.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.zze;
                if (str != null) {
                    httpURLConnection.setRequestProperty(sm4.v, str);
                }
                httpURLConnection.setRequestProperty(sm4.c, true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod(zzev.zza(1));
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.zze;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty(sm4.c, true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(zzev.zza(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, @z1 String str, zzev zzevVar) throws zzfj {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new zzfj("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzevVar, 2001, 1);
                }
                if (this.zzb || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new zzfj(wo1.w("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzevVar, 2001, 1);
            } catch (MalformedURLException e) {
                throw new zzfj(e, zzevVar, 2001, 1);
            }
        }
        throw new zzfj("Null location redirect", zzevVar, 2001, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdn.zza("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzfj {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.zzj;
            int i3 = zzeg.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            zzev zzevVar = this.zzh;
            int i4 = zzeg.zza;
            throw zzfj.zza(e, zzevVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ec, code lost:
        throw new com.google.android.gms.internal.ads.zzfj(new java.net.NoRouteToHostException("Too many redirects: " + r6), r25, 2001, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r8 != 0) goto L15;
     */
    @Override // com.google.android.gms.internal.ads.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzev zzevVar) throws zzfj {
        int i;
        URL url;
        long j;
        long j2;
        boolean zzb;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.zzh = zzevVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzi(zzevVar);
        try {
            url = new URL(zzevVar.zza.toString());
            j = zzevVar.zzf;
            j2 = zzevVar.zzg;
            zzb = zzevVar.zzb(1);
        } catch (IOException e) {
            e = e;
            i = 1;
        }
        if (this.zzb) {
            URL url2 = url;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 > 20) {
                    break;
                }
                long j4 = j2;
                long j5 = j;
                URL url3 = url2;
                HttpURLConnection zzk = zzk(url2, 1, null, j, j2, zzb, false, zzevVar.zzd);
                int responseCode = zzk.getResponseCode();
                String headerField = zzk.getHeaderField("Location");
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = zzk;
                    break;
                }
                i = 1;
                try {
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzevVar);
                    i2 = i3;
                    j2 = j4;
                    j = j5;
                } catch (IOException e2) {
                    e = e2;
                }
                e = e2;
                zzm();
                throw zzfj.zza(e, zzevVar, i);
            }
        }
        httpURLConnection = zzk(url, 1, null, j, j2, zzb, true, zzevVar.zzd);
        this.zzi = httpURLConnection;
        this.zzl = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i4 = this.zzl;
        if (i4 >= 200 && i4 <= 299) {
            httpURLConnection.getContentType();
            if (this.zzl == 200) {
                j3 = zzevVar.zzf;
            }
            j3 = 0;
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (!equalsIgnoreCase) {
                long j6 = zzevVar.zzg;
                if (j6 != -1) {
                    this.zzm = j6;
                } else {
                    long zza = zzfo.zza(httpURLConnection.getHeaderField(sm4.i), httpURLConnection.getHeaderField("Content-Range"));
                    this.zzm = zza != -1 ? zza - j3 : -1L;
                }
            } else {
                this.zzm = zzevVar.zzg;
            }
            try {
                this.zzj = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.zzj = new GZIPInputStream(this.zzj);
                }
                this.zzk = true;
                zzj(zzevVar);
                if (j3 != 0) {
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (j3 > 0) {
                            int min = (int) Math.min(j3, (long) PlaybackStateCompat.E);
                            InputStream inputStream = this.zzj;
                            int i5 = zzeg.zza;
                            int read = inputStream.read(bArr2, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new zzfj(new InterruptedIOException(), zzevVar, 2000, 1);
                            }
                            if (read != -1) {
                                j3 -= read;
                                zzg(read);
                            } else {
                                throw new zzfj(zzevVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                            }
                        }
                    } catch (IOException e3) {
                        zzm();
                        if (e3 instanceof zzfj) {
                            throw ((zzfj) e3);
                        }
                        throw new zzfj(e3, zzevVar, 2000, 1);
                    }
                }
                return this.zzm;
            } catch (IOException e4) {
                zzm();
                throw new zzfj(e4, zzevVar, 2000, 1);
            }
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (this.zzl == 416) {
            str = responseMessage;
            if (zzevVar.zzf == zzfo.zzb(httpURLConnection.getHeaderField("Content-Range"))) {
                this.zzk = true;
                zzj(zzevVar);
                long j7 = zzevVar.zzg;
                if (j7 != -1) {
                    return j7;
                }
                return 0L;
            }
        } else {
            str = responseMessage;
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        try {
            bArr = errorStream != null ? zzeg.zzaa(errorStream) : zzeg.zzf;
        } catch (IOException unused) {
            bArr = zzeg.zzf;
        }
        byte[] bArr3 = bArr;
        zzm();
        throw new zzfl(this.zzl, str, this.zzl == 416 ? new zzer(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, zzevVar, bArr3);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    @z1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfj {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                long j = this.zzm;
                long j2 = j == -1 ? -1L : j - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                try {
                    if (httpURLConnection != null) {
                        if (zzeg.zza <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j2 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j2 <= PlaybackStateCompat.D) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    Objects.requireNonNull(superclass);
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    zzev zzevVar = this.zzh;
                    int i = zzeg.zza;
                    throw new zzfj(e, zzevVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfrm.zzd() : new zzfb(httpURLConnection.getHeaderFields());
    }

    private zzfd(@z1 String str, int i, int i2, boolean z, @z1 zzfm zzfmVar, @z1 zzfov zzfovVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzfmVar;
        this.zzg = new zzfm();
    }
}