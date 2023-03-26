package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.p7700g.p99005.sm4;
import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcil implements zzays {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzayr zzh;
    private final zzayy zzi;
    private zzayl zzj;
    private HttpURLConnection zzk;
    private InputStream zzl;
    private boolean zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final SSLSocketFactory zzd = new zzcik(this);
    private final Set zzs = new HashSet();

    public zzcil(String str, zzayy zzayyVar, int i, int i2, int i3) {
        zzayz.zzb(str);
        this.zzg = str;
        this.zzi = zzayyVar;
        this.zzh = new zzayr();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
    }

    private final void zzi() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzcfi.zzh("Unexpected error while disconnecting", e);
            }
            this.zzk = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i, int i2) throws zzayp {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j != j2) {
                        int read = this.zzl.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzayy zzayyVar = this.zzi;
                            if (zzayyVar != null) {
                                ((zzciz) zzayyVar).zzW(this, read);
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
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzl.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzayy zzayyVar2 = this.zzi;
            if (zzayyVar2 != null) {
                ((zzciz) zzayyVar2).zzW(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new zzayp(e, this.zzj, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        if (r3 != 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a A[Catch: IOException -> 0x0269, TryCatch #0 {IOException -> 0x0269, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:19:0x0078, B:21:0x0092, B:22:0x00a3, B:23:0x00a8, B:36:0x00de, B:91:0x020f, B:93:0x021a, B:95:0x022b, B:98:0x0234, B:99:0x0243, B:101:0x024a, B:102:0x0251, B:103:0x0252, B:104:0x0268), top: B:108:0x000e }] */
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
        this.zzj = zzaylVar;
        long j2 = 0;
        this.zzq = 0L;
        this.zzp = 0L;
        try {
            URL url = new URL(zzaylVar.zza.toString());
            long j3 = zzaylVar.zzc;
            long j4 = zzaylVar.zzd;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzd);
                    }
                    httpURLConnection.setConnectTimeout(this.zze);
                    httpURLConnection.setReadTimeout(this.zzf);
                    for (Map.Entry entry : this.zzh.zza().entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (j3 == j2) {
                        if (j4 != -1) {
                        }
                        httpURLConnection.setRequestProperty(sm4.v, this.zzg);
                        httpURLConnection.setRequestProperty(sm4.c, "identity");
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.zzk = httpURLConnection;
                            try {
                                responseCode2 = httpURLConnection.getResponseCode();
                                if (responseCode2 < 200 && responseCode2 <= 299) {
                                    if (responseCode2 == 200) {
                                        j = zzaylVar.zzc;
                                    }
                                    j = 0;
                                    this.zzn = j;
                                    long j5 = zzaylVar.zzd;
                                    if (j5 != -1) {
                                        this.zzo = j5;
                                    } else {
                                        HttpURLConnection httpURLConnection2 = this.zzk;
                                        String headerField3 = httpURLConnection2.getHeaderField(sm4.i);
                                        if (!TextUtils.isEmpty(headerField3)) {
                                            try {
                                                parseLong = Long.parseLong(headerField3);
                                            } catch (NumberFormatException unused) {
                                                zzcfi.zzg("Unexpected Content-Length [" + headerField3 + "]");
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
                                                            zzcfi.zzj("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                            parseLong = Math.max(parseLong, parseLong2);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                        zzcfi.zzg("Unexpected Content-Range [" + headerField2 + "]");
                                                    }
                                                }
                                            }
                                            this.zzo = parseLong != -1 ? parseLong - this.zzn : -1L;
                                        }
                                        parseLong = -1;
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                        }
                                        this.zzo = parseLong != -1 ? parseLong - this.zzn : -1L;
                                    }
                                    try {
                                        this.zzl = this.zzk.getInputStream();
                                        this.zzm = true;
                                        zzayy zzayyVar = this.zzi;
                                        if (zzayyVar != null) {
                                            ((zzciz) zzayyVar).zzk(this, zzaylVar);
                                        }
                                        return this.zzo;
                                    } catch (IOException e) {
                                        zzi();
                                        throw new zzayp(e, zzaylVar, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.zzk.getHeaderFields();
                                zzi();
                                zzayq zzayqVar = new zzayq(responseCode2, headerFields, zzaylVar);
                                if (responseCode2 == 416) {
                                    zzayqVar.initCause(new zzayk(0));
                                }
                                throw zzayqVar;
                            } catch (IOException e2) {
                                zzi();
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
                    httpURLConnection.setRequestProperty(sm4.v, this.zzg);
                    httpURLConnection.setRequestProperty(sm4.c, "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300) {
                        this.zzk = httpURLConnection;
                        responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 < 200) {
                        }
                        Map<String, List<String>> headerFields2 = this.zzk.getHeaderFields();
                        zzi();
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
    @z1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws zzayp {
        try {
            if (this.zzl != null) {
                HttpURLConnection httpURLConnection = this.zzk;
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
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
                    this.zzl.close();
                } catch (IOException e) {
                    throw new zzayp(e, this.zzj, 3);
                }
            }
        } finally {
            this.zzl = null;
            zzi();
            if (this.zzm) {
                this.zzm = false;
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzays
    @z1
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzh(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    zzcfi.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}