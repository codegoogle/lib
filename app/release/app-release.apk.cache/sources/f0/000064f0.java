package com.p7700g.p99005;

/* compiled from: RetryPolicy.java */
/* loaded from: classes3.dex */
public interface x43 {
    void a(b53 error) throws b53;

    int getCurrentRetryCount();

    int getCurrentTimeout();
}