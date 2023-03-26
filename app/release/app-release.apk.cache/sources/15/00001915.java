package com.google.android.gms.common.api;

import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class ApiException extends Exception {
    @x1
    @Deprecated
    public final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(@x1 Status status) {
        super(r0 + ": " + r1);
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        this.mStatus = status;
    }

    @x1
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @z1
    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}