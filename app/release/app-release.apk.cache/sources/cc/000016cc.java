package com.google.android.gms.ads.initialization;

import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public enum State {
        NOT_READY,
        READY
    }

    @x1
    String getDescription();

    @x1
    State getInitializationState();

    int getLatency();
}