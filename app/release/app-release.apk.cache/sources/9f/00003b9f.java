package com.p7700g.p99005;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt2 implements Continuation {
    public static final Continuation a = new bt2();

    private bt2() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return et2.c(task);
    }
}