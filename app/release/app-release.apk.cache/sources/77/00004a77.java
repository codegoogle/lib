package com.p7700g.p99005;

/* compiled from: BackgroundRunnable.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/p7700g/p99005/ji3;", "Ljava/lang/Runnable;", "Lcom/p7700g/p99005/yq4;", "run", "()V", "<init>", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public class ji3 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Thread currentThread = Thread.currentThread();
        c25.o(currentThread, "Thread.currentThread()");
        currentThread.setPriority(10);
    }
}