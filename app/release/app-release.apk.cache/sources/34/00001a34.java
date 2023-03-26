package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {
    @x1
    public static final TelemetryLoggingOptions zaa = builder().build();
    @z1
    private final String zab;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder {
        @z1
        private String zaa;

        private Builder() {
        }

        public /* synthetic */ Builder(zaac zaacVar) {
        }

        @x1
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.zaa, null);
        }

        @x1
        @KeepForSdk
        public Builder setApi(@z1 String str) {
            this.zaa = str;
            return this;
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str, zaad zaadVar) {
        this.zab = str;
    }

    @x1
    @KeepForSdk
    public static Builder builder() {
        return new Builder(null);
    }

    public final boolean equals(@z1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.equal(this.zab, ((TelemetryLoggingOptions) obj).zab);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zab);
    }

    @x1
    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}