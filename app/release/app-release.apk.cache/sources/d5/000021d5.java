package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.facebook.ads.AdError;
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
public final class zzckf extends zzek implements zzfn {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzfm zzh;
    private zzev zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    public zzckf(String str, zzfs zzfsVar, int i, int i2, int i3) {
        super(true);
        this.zzd = new zzcke(this);
        this.zzs = new HashSet();
        zzcw.zzc(str);
        this.zzg = str;
        this.zzh = new zzfm();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
        if (zzfsVar != null) {
            zzf(zzfsVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzcfi.zzh("Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzfj {
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
                        int read = this.zzk.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzg(read);
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
            int read2 = this.zzk.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzg(read2);
            return read2;
        } catch (IOException e) {
            throw new zzfj(e, this.zzi, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r2 != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x0291, TryCatch #3 {IOException -> 0x0291, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x0236, B:96:0x0241, B:98:0x0252, B:101:0x025b, B:102:0x026a, B:104:0x0272, B:105:0x0279, B:106:0x027a, B:107:0x0290), top: B:117:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0241 A[Catch: IOException -> 0x0291, TryCatch #3 {IOException -> 0x0291, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x0236, B:96:0x0241, B:98:0x0252, B:101:0x025b, B:102:0x026a, B:104:0x0272, B:105:0x0279, B:106:0x027a, B:107:0x0290), top: B:117:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzev zzevVar) throws zzfj {
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        long parseLong;
        String headerField2;
        this.zzi = zzevVar;
        long j2 = 0;
        this.zzq = 0L;
        this.zzp = 0L;
        try {
            URL url = new URL(zzevVar.zza.toString());
            long j3 = zzevVar.zzf;
            long j4 = zzevVar.zzg;
            boolean zzb2 = zzevVar.zzb(1);
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
                        if (!zzb2) {
                            httpURLConnection.setRequestProperty(sm4.c, "identity");
                        }
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.zzj = httpURLConnection;
                            try {
                                responseCode2 = httpURLConnection.getResponseCode();
                                this.zzm = responseCode2;
                                if (responseCode2 < 200 && responseCode2 <= 299) {
                                    if (responseCode2 == 200) {
                                        j = zzevVar.zzf;
                                    }
                                    j = 0;
                                    this.zzn = j;
                                    if (!zzevVar.zzb(1)) {
                                        long j5 = zzevVar.zzg;
                                        if (j5 != -1) {
                                            this.zzo = j5;
                                        } else {
                                            HttpURLConnection httpURLConnection2 = this.zzj;
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
                                    } else {
                                        this.zzo = zzevVar.zzg;
                                    }
                                    try {
                                        this.zzk = this.zzj.getInputStream();
                                        this.zzl = true;
                                        zzj(zzevVar);
                                        return this.zzo;
                                    } catch (IOException e) {
                                        zzn();
                                        throw new zzfj(e, zzevVar, 2000, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.zzj.getHeaderFields();
                                zzn();
                                zzfl zzflVar = new zzfl(this.zzm, null, null, headerFields, zzevVar, zzeg.zzf);
                                if (this.zzm == 416) {
                                    zzflVar.initCause(new zzer(AdError.REMOTE_ADS_SERVICE_ERROR));
                                }
                                throw zzflVar;
                            } catch (IOException e2) {
                                zzn();
                                throw new zzfj("Unable to connect to ".concat(String.valueOf(zzevVar.zza.toString())), e2, zzevVar, 2000, 1);
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
                    if (!zzb2) {
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300) {
                        this.zzj = httpURLConnection;
                        responseCode2 = httpURLConnection.getResponseCode();
                        this.zzm = responseCode2;
                        if (responseCode2 < 200) {
                        }
                        Map<String, List<String>> headerFields2 = this.zzj.getHeaderFields();
                        zzn();
                        zzfl zzflVar2 = new zzfl(this.zzm, null, null, headerFields2, zzevVar, zzeg.zzf);
                        if (this.zzm == 416) {
                        }
                        throw zzflVar2;
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
            throw new zzfj("Unable to connect to ".concat(String.valueOf(zzevVar.zza.toString())), e3, zzevVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    @z1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfj {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
                }
                int i = zzeg.zza;
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
                    throw new zzfj(e, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    @z1
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i) {
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