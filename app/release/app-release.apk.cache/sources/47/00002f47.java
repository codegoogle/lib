package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwi extends IOException {
    public zzwi(Throwable th) {
        super(wo1.v("Unexpected ", th.getClass().getSimpleName(), ": ", th.getMessage()), th);
    }
}