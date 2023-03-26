package com.p7700g.p99005;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AwaitListener.java */
/* loaded from: classes3.dex */
public final class lr2 implements OnCompleteListener<Void> {
    private final CountDownLatch a = new CountDownLatch(1);

    public boolean a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(j, timeUnit);
    }

    public void b() {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@x1 Task<Void> task) {
        this.a.countDown();
    }
}