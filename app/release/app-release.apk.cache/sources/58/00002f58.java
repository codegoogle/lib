package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(30)
/* loaded from: classes2.dex */
public final class zzwz {
    @e1
    public static void zza(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzdn.zza("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}