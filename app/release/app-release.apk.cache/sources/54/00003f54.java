package com.p7700g.p99005;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.p7700g.p99005.aa;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt2 implements Continuation {
    public static final Continuation a = new dt2();

    private dt2() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Integer valueOf;
        valueOf = Integer.valueOf((int) aa.c.d);
        return valueOf;
    }
}