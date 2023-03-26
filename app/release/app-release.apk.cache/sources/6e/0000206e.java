package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwz extends NativeAd.Image {
    private final zzblb zza;
    @z1
    private final Drawable zzb;
    @z1
    private final Uri zzc;
    private final double zzd;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|2|3|(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|33|6|7|8|9|10|11|12|13|14|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbwz(zzblb zzblbVar) {
        Drawable drawable;
        IObjectWrapper zzf;
        this.zza = zzblbVar;
        Uri uri = null;
        try {
            zzf = zzblbVar.zzf();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
        try {
            if (zzf != null) {
                drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                double d = this.zza.zzb();
                this.zzd = d;
                this.zza.zzd();
                this.zza.zzc();
                return;
            }
            this.zza.zzc();
            return;
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
            return;
        }
        drawable = null;
        this.zzb = drawable;
        uri = this.zza.zze();
        this.zzc = uri;
        double d2 = this.zza.zzb();
        this.zzd = d2;
        this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @z1
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @z1
    public final Uri getUri() {
        return this.zzc;
    }
}