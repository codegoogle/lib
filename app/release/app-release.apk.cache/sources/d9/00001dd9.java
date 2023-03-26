package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.p7700g.p99005.sm4;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayn implements zzays {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzayr zzg;
    private final zzayy zzh;
    private zzayl zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public zzayn(String str, zzazj zzazjVar, zzayy zzayyVar, int i, int i2, boolean z, zzayr zzayrVar) {
        zzayz.zzb(str);
        this.zzf = str;
        this.zzh = zzayyVar;
        this.zzg = new zzayr();
        this.zzd = i;
        this.zze = i2;
    }

    private final void zzf() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i, int i2) throws zzayp {
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j != j2) {
                        int read = this.zzk.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzo += read;
                            zzayy zzayyVar = this.zzh;
                            if (zzayyVar != null) {
                                zzayyVar.zzj(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        zzc.set(bArr2);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzayy zzayyVar2 = this.zzh;
            if (zzayyVar2 != null) {
                zzayyVar2.zzj(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new zzayp(e, this.zzi, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
        if (r3 != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1 A[Catch: IOException -> 0x0210, TryCatch #4 {IOException -> 0x0210, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:7:0x0042, B:9:0x0048, B:16:0x006c, B:18:0x0086, B:19:0x0097, B:20:0x009c, B:33:0x00d2, B:88:0x01b6, B:90:0x01c1, B:92:0x01d2, B:95:0x01db, B:96:0x01ea, B:98:0x01f1, B:99:0x01f8, B:100:0x01f9, B:101:0x020f), top: B:114:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzayj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzayl zzaylVar) throws zzayp {
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        long parseLong;
        String headerField2;
        this.zzi = zzaylVar;
        long j2 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzaylVar.zza.toString());
            long j3 = zzaylVar.zzc;
            long j4 = zzaylVar.zzd;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(this.zzd);
                    httpURLConnection.setReadTimeout(this.zze);
                    for (Map.Entry entry : this.zzg.zza().entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (j3 == j2) {
                        if (j4 != -1) {
                        }
                        httpURLConnection.setRequestProperty(sm4.v, this.zzf);
                        httpURLConnection.setRequestProperty(sm4.c, "identity");
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.zzj = httpURLConnection;
                            try {
                                responseCode2 = httpURLConnection.getResponseCode();
                                if (responseCode2 < 200 && responseCode2 <= 299) {
                                    this.zzj.getContentType();
                                    if (responseCode2 == 200) {
                                        j = zzaylVar.zzc;
                                    }
                                    j = 0;
                                    this.zzm = j;
                                    long j5 = zzaylVar.zzd;
                                    if (j5 != -1) {
                                        this.zzn = j5;
                                    } else {
                                        HttpURLConnection httpURLConnection2 = this.zzj;
                                        String headerField3 = httpURLConnection2.getHeaderField(sm4.i);
                                        if (!TextUtils.isEmpty(headerField3)) {
                                            try {
                                                parseLong = Long.parseLong(headerField3);
                                            } catch (NumberFormatException unused) {
                                            }
                                            headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                            if (!TextUtils.isEmpty(headerField2)) {
                                                Matcher matcher = zzb.matcher(headerField2);
                                                if (matcher.find()) {
                                                    try {
                                                        long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                        if (parseLong < 0) {
                                                            parseLong = parseLong2;
                                                        } else if (parseLong != parseLong2) {
                                                            parseLong = Math.max(parseLong, parseLong2);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                }
                                            }
                                            this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                        }
                                        parseLong = -1;
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                        }
                                        this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                    }
                                    try {
                                        this.zzk = this.zzj.getInputStream();
                                        this.zzl = true;
                                        zzayy zzayyVar = this.zzh;
                                        if (zzayyVar != null) {
                                            zzayyVar.zzk(this, zzaylVar);
                                        }
                                        return this.zzn;
                                    } catch (IOException e) {
                                        zzf();
                                        throw new zzayp(e, zzaylVar, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.zzj.getHeaderFields();
                                zzf();
                                zzayq zzayqVar = new zzayq(responseCode2, headerFields, zzaylVar);
                                if (responseCode2 == 416) {
                                    zzayqVar.initCause(new zzayk(0));
                                }
                                throw zzayqVar;
                            } catch (IOException e2) {
                                zzf();
                                throw new zzayp("Unable to connect to ".concat(String.valueOf(zzaylVar.zza.toString())), e2, zzaylVar, 1);
                            }
                        }
                        headerField = httpURLConnection.getHeaderField("Location");
                        httpURLConnection.disconnect();
                        if (headerField == null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                                throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                            }
                            url = url2;
                            i = i2;
                            j2 = 0;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        j2 = j3;
                    }
                    String str = "bytes=" + j2 + "-";
                    if (j4 != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append((j2 + j4) - 1);
                        str = sb.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", str);
                    httpURLConnection.setRequestProperty(sm4.v, this.zzf);
                    httpURLConnection.setRequestProperty(sm4.c, "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300) {
                        this.zzj = httpURLConnection;
                        responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 < 200) {
                        }
                        Map<String, List<String>> headerFields2 = this.zzj.getHeaderFields();
                        zzf();
                        zzayq zzayqVar2 = new zzayq(responseCode2, headerFields2, zzaylVar);
                        if (responseCode2 == 416) {
                        }
                        throw zzayqVar2;
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField == null) {
                    }
                } else {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
            }
        } catch (IOException e3) {
            throw new zzayp("Unable to connect to ".concat(String.valueOf(zzaylVar.zza.toString())), e3, zzaylVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws zzayp {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j = this.zzn;
                if (j != -1) {
                    j -= this.zzp;
                }
                int i = zzazo.zza;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= PlaybackStateCompat.D) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzk.close();
                } catch (IOException e) {
                    throw new zzayp(e, this.zzi, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzf();
            if (this.zzl) {
                this.zzl = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}