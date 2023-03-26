package com.google.android.gms.tasks;

import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class CancellationToken {
    public abstract boolean isCancellationRequested();

    @x1
    public abstract CancellationToken onCanceledRequested(@x1 OnTokenCanceledListener onTokenCanceledListener);
}