package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.x1;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@x1 AdError adError);

    @Deprecated
    void onFailure(@x1 String str);

    @x1
    MediationAdCallbackT onSuccess(@x1 MediationAdT mediationadt);
}