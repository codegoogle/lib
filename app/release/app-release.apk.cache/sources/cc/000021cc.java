package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjx extends zzcju {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcjx(zzchr zzchrVar) {
        super(zzchrVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            zzcfi.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            zzcfi.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
        } else {
            zzcfi.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zzi(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0343, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0349, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0351, code lost:
        if (com.google.android.gms.internal.ads.zzcfi.zzm(3) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0353, code lost:
        com.google.android.gms.internal.ads.zzcfi.zze("Preloaded " + com.google.android.gms.internal.ads.zzcjx.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0376, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037f, code lost:
        if (r0.isFile() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0381, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0389, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040d  */
    @Override // com.google.android.gms.internal.ads.zzcju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzq(final String str) {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        int i2;
        String str6;
        com.google.android.gms.ads.internal.util.zzbz zzbzVar;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i3;
        int i4;
        int responseCode;
        File[] listFiles;
        boolean z;
        FileOutputStream fileOutputStream2 = null;
        if (this.zzg != null) {
            do {
                File file2 = this.zzg;
                if (file2 == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().endsWith(".done")) {
                            i++;
                        }
                    }
                }
                if (i > ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzs)).intValue()) {
                    File file4 = this.zzg;
                    if (file4 == null) {
                        break;
                    }
                    long j = Long.MAX_VALUE;
                    File file5 = null;
                    for (File file6 : file4.listFiles()) {
                        if (!file6.getName().endsWith(".done")) {
                            long lastModified = file6.lastModified();
                            if (lastModified < j) {
                                file5 = file6;
                                j = lastModified;
                            }
                        }
                    }
                    if (file5 != null) {
                        z = file5.delete();
                        File zzi = zzi(file5);
                        if (zzi.isFile()) {
                            z &= zzi.delete();
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        z = false;
                        continue;
                    }
                } else {
                    file = new File(this.zzg, zzcfb.zze(str));
                    File zzi2 = zzi(file);
                    if (file.isFile() && zzi2.isFile()) {
                        long length = file.length();
                        zzcfi.zze("Stream cache hit at ".concat(String.valueOf(str)));
                        zzd(str, file.getAbsolutePath(), (int) length);
                        return true;
                    }
                    String concat = String.valueOf(this.zzg.getAbsolutePath()).concat(String.valueOf(str));
                    Set set = zze;
                    synchronized (set) {
                        if (set.contains(concat)) {
                            zzcfi.zzj("Stream cache already in progress at " + str);
                            zzc(str, file.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        str2 = "error";
                        try {
                            HttpURLConnection zzn = zzfnf.zza().zzn(new zzfnq() { // from class: com.google.android.gms.internal.ads.zzcjw
                                @Override // com.google.android.gms.internal.ads.zzfnq
                                public final URLConnection zza() {
                                    String str7 = str;
                                    int i5 = zzcjx.zzd;
                                    com.google.android.gms.ads.internal.zzt.zzw();
                                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzx)).intValue();
                                    URL url = new URL(str7);
                                    int i6 = 0;
                                    while (true) {
                                        i6++;
                                        if (i6 <= 20) {
                                            URLConnection openConnection = url.openConnection();
                                            openConnection.setConnectTimeout(intValue);
                                            openConnection.setReadTimeout(intValue);
                                            if (openConnection instanceof HttpURLConnection) {
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                                zzcfh zzcfhVar = new zzcfh(null);
                                                zzcfhVar.zzc(httpURLConnection, null);
                                                httpURLConnection.setInstanceFollowRedirects(false);
                                                int responseCode2 = httpURLConnection.getResponseCode();
                                                zzcfhVar.zze(httpURLConnection, responseCode2);
                                                if (responseCode2 / 100 != 3) {
                                                    return httpURLConnection;
                                                }
                                                String headerField = httpURLConnection.getHeaderField("Location");
                                                if (headerField != null) {
                                                    URL url2 = new URL(url, headerField);
                                                    String protocol = url2.getProtocol();
                                                    if (protocol != null) {
                                                        if (!protocol.equals("http") && !protocol.equals("https")) {
                                                            throw new IOException("Unsupported scheme: ".concat(protocol));
                                                        }
                                                        zzcfi.zze("Redirecting to ".concat(headerField));
                                                        httpURLConnection.disconnect();
                                                        url = url2;
                                                    } else {
                                                        throw new IOException("Protocol is null");
                                                    }
                                                } else {
                                                    throw new IOException("Missing Location header in redirect");
                                                }
                                            } else {
                                                throw new IOException("Invalid protocol.");
                                            }
                                        } else {
                                            throw new IOException("Too many redirects (20)");
                                        }
                                    }
                                }
                            }, 265, -1);
                            if ((zzn instanceof HttpURLConnection) && (responseCode = zzn.getResponseCode()) >= 400) {
                                str2 = "badUrl";
                                try {
                                    String str7 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                    try {
                                        throw new IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (IOException | RuntimeException e) {
                                        e = e;
                                        str4 = str7;
                                        str3 = concat;
                                        if (e instanceof RuntimeException) {
                                        }
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException | NullPointerException unused) {
                                        }
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzc(str, file.getAbsolutePath(), str2, str4);
                                        zze.remove(str3);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e2) {
                                    e = e2;
                                    str4 = null;
                                }
                            }
                            int contentLength = zzn.getContentLength();
                            if (contentLength < 0) {
                                zzcfi.zzj("Stream cache aborted, missing content-length header at " + str);
                                zzc(str, file.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(concat);
                                return false;
                            }
                            String format = zzf.format(contentLength);
                            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzt)).intValue();
                            if (contentLength > intValue) {
                                zzcfi.zzj("Content length " + format + " exceeds limit at " + str);
                                StringBuilder sb = new StringBuilder();
                                sb.append("File too big for full file cache. Size: ");
                                sb.append(format);
                                zzc(str, file.getAbsolutePath(), "sizeExceeded", sb.toString());
                                set.remove(concat);
                                return false;
                            }
                            zzcfi.zze("Caching " + format + " bytes from " + str);
                            ReadableByteChannel newChannel = Channels.newChannel(zzn.getInputStream());
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                            try {
                                FileChannel channel = fileOutputStream3.getChannel();
                                ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                Clock zzA = com.google.android.gms.ads.internal.zzt.zzA();
                                long currentTimeMillis = zzA.currentTimeMillis();
                                com.google.android.gms.ads.internal.util.zzbz zzbzVar2 = new com.google.android.gms.ads.internal.util.zzbz(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzw)).longValue());
                                zzbhr zzbhrVar = zzbhz.zzv;
                                zzbhx zzc = com.google.android.gms.ads.internal.client.zzay.zzc();
                                long longValue = ((Long) zzc.zzb(zzbhrVar)).longValue();
                                i2 = 0;
                                while (true) {
                                    int read = newChannel.read(allocate);
                                    if (read < 0) {
                                        break;
                                    }
                                    i2 += read;
                                    try {
                                        try {
                                            if (i2 <= intValue) {
                                                try {
                                                    allocate.flip();
                                                    do {
                                                    } while (channel.write(allocate) > 0);
                                                    allocate.clear();
                                                    if (zzA.currentTimeMillis() - currentTimeMillis <= 1000 * longValue) {
                                                        ByteBuffer byteBuffer = allocate;
                                                        if (!this.zzh) {
                                                            if (zzbzVar2.zzb()) {
                                                                str5 = str2;
                                                                try {
                                                                    zzbzVar = zzbzVar2;
                                                                    str6 = concat;
                                                                    fileChannel = channel;
                                                                    fileOutputStream = fileOutputStream3;
                                                                    readableByteChannel = newChannel;
                                                                    i3 = intValue;
                                                                    i4 = contentLength;
                                                                } catch (IOException e3) {
                                                                    e = e3;
                                                                    fileOutputStream = fileOutputStream3;
                                                                    str3 = concat;
                                                                    str2 = str5;
                                                                    fileOutputStream2 = fileOutputStream;
                                                                    str4 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                    }
                                                                    fileOutputStream2.close();
                                                                    if (this.zzh) {
                                                                    }
                                                                    if (file.exists()) {
                                                                    }
                                                                    zzc(str, file.getAbsolutePath(), str2, str4);
                                                                    zze.remove(str3);
                                                                    return false;
                                                                } catch (RuntimeException e4) {
                                                                    e = e4;
                                                                    fileOutputStream = fileOutputStream3;
                                                                    str3 = concat;
                                                                    str2 = str5;
                                                                    fileOutputStream2 = fileOutputStream;
                                                                    str4 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                    }
                                                                    fileOutputStream2.close();
                                                                    if (this.zzh) {
                                                                    }
                                                                    if (file.exists()) {
                                                                    }
                                                                    zzc(str, file.getAbsolutePath(), str2, str4);
                                                                    zze.remove(str3);
                                                                    return false;
                                                                }
                                                                try {
                                                                    try {
                                                                        zzcfb.zza.post(new zzcjo(this, str, file.getAbsolutePath(), i2, contentLength, false));
                                                                    } catch (RuntimeException e5) {
                                                                        e = e5;
                                                                        str3 = str6;
                                                                        str2 = str5;
                                                                        fileOutputStream2 = fileOutputStream;
                                                                        str4 = null;
                                                                        if (e instanceof RuntimeException) {
                                                                        }
                                                                        fileOutputStream2.close();
                                                                        if (this.zzh) {
                                                                        }
                                                                        if (file.exists()) {
                                                                            zzcfi.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                        }
                                                                        zzc(str, file.getAbsolutePath(), str2, str4);
                                                                        zze.remove(str3);
                                                                        return false;
                                                                    }
                                                                } catch (IOException e6) {
                                                                    e = e6;
                                                                    str3 = str6;
                                                                    str2 = str5;
                                                                    fileOutputStream2 = fileOutputStream;
                                                                    str4 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamFullFileCache.preload");
                                                                    }
                                                                    fileOutputStream2.close();
                                                                    if (this.zzh) {
                                                                        zzcfi.zzi("Preload aborted for URL \"" + str + "\"");
                                                                    } else {
                                                                        zzcfi.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                    }
                                                                    if (file.exists() && !file.delete()) {
                                                                        zzcfi.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                    }
                                                                    zzc(str, file.getAbsolutePath(), str2, str4);
                                                                    zze.remove(str3);
                                                                    return false;
                                                                }
                                                            } else {
                                                                zzbzVar = zzbzVar2;
                                                                fileChannel = channel;
                                                                fileOutputStream = fileOutputStream3;
                                                                readableByteChannel = newChannel;
                                                                i3 = intValue;
                                                                i4 = contentLength;
                                                                str6 = concat;
                                                                str5 = str2;
                                                            }
                                                            allocate = byteBuffer;
                                                            newChannel = readableByteChannel;
                                                            str2 = str5;
                                                            zzbzVar2 = zzbzVar;
                                                            concat = str6;
                                                            channel = fileChannel;
                                                            fileOutputStream3 = fileOutputStream;
                                                            intValue = i3;
                                                            contentLength = i4;
                                                        } else {
                                                            throw new IOException("abort requested");
                                                        }
                                                    } else {
                                                        String str8 = "Timeout exceeded. Limit: " + Long.toString(longValue) + " sec";
                                                        throw new IOException("stream cache time limit exceeded");
                                                    }
                                                } catch (IOException | RuntimeException e7) {
                                                    e = e7;
                                                    fileOutputStream = fileOutputStream3;
                                                    str5 = str2;
                                                }
                                            } else {
                                                String str9 = "File too big for full file cache. Size: " + Integer.toString(i2);
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                        } catch (IOException | RuntimeException e8) {
                                            e = e8;
                                            str3 = str6;
                                            fileOutputStream2 = fileOutputStream;
                                            str4 = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream2.close();
                                            if (this.zzh) {
                                            }
                                            if (file.exists()) {
                                            }
                                            zzc(str, file.getAbsolutePath(), str2, str4);
                                            zze.remove(str3);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e9) {
                                        e = e9;
                                        str4 = zzc;
                                        str3 = str6;
                                        fileOutputStream2 = fileOutputStream;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzc(str, file.getAbsolutePath(), str2, str4);
                                        zze.remove(str3);
                                        return false;
                                    }
                                }
                            } catch (IOException | RuntimeException e10) {
                                e = e10;
                                fileOutputStream = fileOutputStream3;
                                str3 = concat;
                                str5 = str2;
                            }
                        } catch (IOException | RuntimeException e11) {
                            e = e11;
                            str3 = concat;
                            str2 = "error";
                            str4 = null;
                            fileOutputStream2 = null;
                        }
                    }
                }
            } while (z);
            zzcfi.zzj("Unable to expire stream cache");
            zzc(str, null, "expireFailed", null);
            return false;
        }
        zzc(str, null, "noCacheDir", null);
        return false;
        zzd(str, file.getAbsolutePath(), i2);
        str3 = str6;
        try {
            zze.remove(str3);
            return true;
        } catch (IOException e12) {
            e = e12;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzc(str, file.getAbsolutePath(), str2, str4);
            zze.remove(str3);
            return false;
        } catch (RuntimeException e13) {
            e = e13;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzc(str, file.getAbsolutePath(), str2, str4);
            zze.remove(str3);
            return false;
        }
    }
}