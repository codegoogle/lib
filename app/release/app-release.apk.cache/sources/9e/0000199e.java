package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaci {
    public final RegisterListenerMethod<Api.AnyClient, ?> zaa;
    public final UnregisterListenerMethod<Api.AnyClient, ?> zab;
    public final Runnable zac;

    public zaci(@x1 RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @x1 UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @x1 Runnable runnable) {
        this.zaa = registerListenerMethod;
        this.zab = unregisterListenerMethod;
        this.zac = runnable;
    }
}