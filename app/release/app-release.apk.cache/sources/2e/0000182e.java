package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(@x1 Context context, @x1 CustomEventNativeListener customEventNativeListener, @z1 String str, @x1 NativeMediationAdRequest nativeMediationAdRequest, @z1 Bundle bundle);
}