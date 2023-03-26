package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.z1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfg extends zzek {
    @z1
    private RandomAccessFile zza;
    @z1
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzfg() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzff {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzc;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzeg.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzff(e, 2000);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r1 != false) goto L33;
     */
    @Override // com.google.android.gms.internal.ads.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzev zzevVar) throws zzff {
        boolean zzb;
        Uri uri = zzevVar.zza;
        this.zzb = uri;
        zzi(zzevVar);
        int i = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzevVar.zzf);
                long j = zzevVar.zzg;
                if (j == -1) {
                    j = this.zza.length() - zzevVar.zzf;
                }
                this.zzc = j;
                if (j >= 0) {
                    this.zzd = true;
                    zzj(zzevVar);
                    return this.zzc;
                }
                throw new zzff(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e) {
                throw new zzff(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (zzeg.zza >= 21) {
                    zzb = zzfe.zzb(e2.getCause());
                }
                i = IronSourceConstants.IS_INSTANCE_OPENED;
                throw new zzff(e2, i);
            }
            throw new zzff(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new zzff(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzff(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    @z1
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzff {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzff(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}