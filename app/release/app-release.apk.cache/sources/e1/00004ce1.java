package com.p7700g.p99005;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public class kl2 extends ApiException {
    public kl2(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i), mm2.a(i))));
    }

    public int f() {
        return super.getStatusCode();
    }
}