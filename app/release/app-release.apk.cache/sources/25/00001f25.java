package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbku extends NativeAd.AdChoicesInfo {
    private final zzbkt zza;
    private final List zzb = new ArrayList();
    private String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        r4.zzb.add(new com.google.android.gms.internal.ads.zzblc(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbku(zzbkt zzbktVar) {
        IBinder iBinder;
        this.zza = zzbktVar;
        try {
            this.zzc = zzbktVar.zzg();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbktVar.zzh()) {
                zzblb zzblbVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzblbVar = queryLocalInterface instanceof zzblb ? (zzblb) queryLocalInterface : new zzbkz(iBinder);
                }
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}