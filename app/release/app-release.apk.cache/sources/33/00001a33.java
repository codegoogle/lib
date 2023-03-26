package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @x1
    @KeepForSdk
    Task<Void> log(@x1 TelemetryData telemetryData);
}