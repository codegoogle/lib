package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.z1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzej extends zzek {
    private final AssetManager zza;
    @z1
    private Uri zzb;
    @z1
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzej(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzei {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzei(e, 2000);
                }
            }
            InputStream inputStream = this.zzc;
            int i3 = zzeg.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zzd;
            if (j2 != -1) {
                this.zzd = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws zzei {
        try {
            Uri uri = zzevVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzevVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzevVar.zzf) >= zzevVar.zzf) {
                long j = zzevVar.zzg;
                if (j != -1) {
                    this.zzd = j;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == TTL.MAX_VALUE) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzj(zzevVar);
                return this.zzd;
            }
            throw new zzei(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (zzei e) {
            throw e;
        } catch (IOException e2) {
            throw new zzei(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : IronSourceConstants.IS_INSTANCE_OPENED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    @z1
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzei {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzei(e, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}