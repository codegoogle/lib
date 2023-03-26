package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.p7700g.p99005.e2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(17)
/* loaded from: classes2.dex */
public final class zzww extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzwu zzd;
    private boolean zze;

    public /* synthetic */ zzww(zzwu zzwuVar, SurfaceTexture surfaceTexture, boolean z, zzwv zzwvVar) {
        super(surfaceTexture);
        this.zzd = zzwuVar;
        this.zza = z;
    }

    public static zzww zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzcw.zzf(z2);
        return new zzwu().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        String eglQueryString;
        synchronized (zzww.class) {
            if (!zzc) {
                int i2 = zzeg.zza;
                int i3 = 2;
                if (i2 >= 24 && ((i2 >= 26 || (!"samsung".equals(zzeg.zzc) && !"XT1650".equals(zzeg.zzd))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i3 = 1;
                    }
                    zzb = i3;
                    zzc = true;
                }
                i3 = 0;
                zzb = i3;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}