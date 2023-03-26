package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.anythink.expressad.foundation.g.a.f;
import com.p7700g.p99005.z1;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqq implements zzetg {
    private final zzfvm zza;
    @z1
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeqq(zzfvm zzfvmVar, @z1 ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfvmVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqq.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqr zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeR)).booleanValue() && this.zzb != null && this.zzd.contains(f.e)) {
            return new zzeqr(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeS)).booleanValue() && this.zzd.contains(f.a)) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new zzeqr(bool);
            }
        }
        return new zzeqr(null);
    }
}