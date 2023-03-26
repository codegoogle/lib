package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfq extends zzek {
    private final Resources zza;
    private final String zzb;
    @z1
    private Uri zzc;
    @z1
    private AssetFileDescriptor zzd;
    @z1
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzfq(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzfp {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzf;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzfp(null, e, 2000);
                }
            }
            InputStream inputStream = this.zze;
            int i3 = zzeg.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                if (this.zzf == -1) {
                    return -1;
                }
                throw new zzfp("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j2 = this.zzf;
            if (j2 != -1) {
                this.zzf = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    @Override // com.google.android.gms.internal.ads.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzev zzevVar) throws zzfp {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j;
        Uri uri = zzevVar.zza;
        this.zzc = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        Objects.requireNonNull(lastPathSegment);
                    }
                    if (TextUtils.equals("android.resource", uri.getScheme())) {
                        String path = uri.getPath();
                        Objects.requireNonNull(path);
                        if (path.startsWith("/")) {
                            path = path.substring(1);
                        }
                        String host = uri.getHost();
                        parseInt = this.zza.getIdentifier((TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":")).concat(String.valueOf(path)), "raw", this.zzb);
                        if (parseInt == 0) {
                            throw new zzfp("Resource not found.", null, IronSourceConstants.IS_INSTANCE_OPENED);
                        }
                        zzi(zzevVar);
                        openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                        this.zzd = openRawResourceFd;
                        if (openRawResourceFd == null) {
                            long length = openRawResourceFd.getLength();
                            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                            this.zze = fileInputStream;
                            int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                            if (i != 0) {
                                try {
                                    if (zzevVar.zzf > length) {
                                        throw new zzfp(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                    }
                                } catch (zzfp e) {
                                    throw e;
                                } catch (IOException e2) {
                                    throw new zzfp(null, e2, 2000);
                                }
                            }
                            long startOffset = openRawResourceFd.getStartOffset();
                            long skip = fileInputStream.skip(zzevVar.zzf + startOffset) - startOffset;
                            if (skip == zzevVar.zzf) {
                                if (i == 0) {
                                    FileChannel channel = fileInputStream.getChannel();
                                    if (channel.size() == 0) {
                                        this.zzf = -1L;
                                        j = -1;
                                    } else {
                                        j = channel.size() - channel.position();
                                        this.zzf = j;
                                        if (j < 0) {
                                            throw new zzfp(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                        }
                                    }
                                } else {
                                    j = length - skip;
                                    this.zzf = j;
                                    if (j < 0) {
                                        throw new zzer(AdError.REMOTE_ADS_SERVICE_ERROR);
                                    }
                                }
                                long j2 = zzevVar.zzg;
                                if (j2 != -1) {
                                    if (j != -1) {
                                        j2 = Math.min(j, j2);
                                    }
                                    this.zzf = j2;
                                }
                                this.zzg = true;
                                zzj(zzevVar);
                                long j3 = zzevVar.zzg;
                                return j3 != -1 ? j3 : this.zzf;
                            }
                            throw new zzfp(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                        throw new zzfp("Resource is compressed: ".concat(String.valueOf(uri)), null, 2000);
                    }
                    throw new zzfp("URI must either use scheme rawresource or android.resource", null, 1004);
                }
                openRawResourceFd = this.zza.openRawResourceFd(parseInt);
                this.zzd = openRawResourceFd;
                if (openRawResourceFd == null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new zzfp(null, e3, IronSourceConstants.IS_INSTANCE_OPENED);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            Objects.requireNonNull(lastPathSegment2);
            parseInt = Integer.parseInt(lastPathSegment2);
            zzi(zzevVar);
        } catch (NumberFormatException unused) {
            throw new zzfp("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    @z1
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfp {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new zzfp(null, e, 2000);
                    }
                } finally {
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    throw new zzfp(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new zzfp(null, e3, 2000);
        }
    }
}