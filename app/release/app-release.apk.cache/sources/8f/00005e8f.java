package com.p7700g.p99005;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes3.dex */
public class tn2 implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @x1
    public final Exception getException(@x1 Status status) {
        if (status.getStatusCode() == 8) {
            return new sn2(status.zza());
        }
        return new on2(status.zza());
    }
}