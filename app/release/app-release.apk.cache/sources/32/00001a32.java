package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    @x1
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@x1 Context context) {
        return getClient(context, TelemetryLoggingOptions.zaa);
    }

    @x1
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@x1 Context context, @x1 TelemetryLoggingOptions telemetryLoggingOptions) {
        return new com.google.android.gms.common.internal.service.zao(context, telemetryLoggingOptions);
    }
}