package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.x1;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public interface SignalCallbacks {
    void onFailure(@x1 AdError adError);

    @Deprecated
    void onFailure(@x1 String str);

    void onSuccess(@x1 String str);
}