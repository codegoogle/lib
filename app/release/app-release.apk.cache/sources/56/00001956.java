package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@x1 T t, @x1 U u) throws RemoteException;
}