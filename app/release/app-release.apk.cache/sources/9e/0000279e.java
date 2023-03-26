package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.tm4;
import com.p7700g.p99005.z1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzen extends zzek {
    private final ContentResolver zza;
    @z1
    private Uri zzb;
    @z1
    private AssetFileDescriptor zzc;
    @z1
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzen(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzem {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzem(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i3 = zzeg.zza;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zze;
            if (j2 != -1) {
                this.zze = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws zzem {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = zzevVar.zza;
                this.zzb = uri;
                zzi(zzevVar);
                if ("content".equals(zzevVar.zza.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, tm4.h, bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i2 != 0 && zzevVar.zzf > length) {
                        throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzevVar.zzf + startOffset) - startOffset;
                    if (skip == zzevVar.zzf) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j = -1;
                            } else {
                                j = size - channel.position();
                                this.zze = j;
                                if (j < 0) {
                                    throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.zze = j;
                            if (j < 0) {
                                throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                        long j2 = zzevVar.zzg;
                        if (j2 != -1) {
                            if (j != -1) {
                                j2 = Math.min(j, j2);
                            }
                            this.zze = j2;
                        }
                        this.zzf = true;
                        zzj(zzevVar);
                        long j3 = zzevVar.zzg;
                        return j3 != -1 ? j3 : this.zze;
                    }
                    throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                i = 2000;
                try {
                    throw new zzem(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
                } catch (IOException e) {
                    e = e;
                    if (true == (e instanceof FileNotFoundException)) {
                        i = IronSourceConstants.IS_INSTANCE_OPENED;
                    }
                    throw new zzem(e, i);
                }
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (zzem e3) {
            throw e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    @z1
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzem {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new zzem(e, 2000);
                    }
                } finally {
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    throw new zzem(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new zzem(e3, 2000);
        }
    }
}