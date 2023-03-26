package com.p7700g.p99005;

/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes3.dex */
public class j43 implements x43 {
    public static final int a = 2500;
    public static final int b = 1;
    public static final float c = 1.0f;
    private int d;
    private int e;
    private final int f;
    private final float g;

    public j43() {
        this(2500, 1, 1.0f);
    }

    @Override // com.p7700g.p99005.x43
    public void a(b53 error) throws b53 {
        this.e++;
        int i = this.d;
        this.d = i + ((int) (i * this.g));
        if (!c()) {
            throw error;
        }
    }

    public float b() {
        return this.g;
    }

    public boolean c() {
        return this.e <= this.f;
    }

    @Override // com.p7700g.p99005.x43
    public int getCurrentRetryCount() {
        return this.e;
    }

    @Override // com.p7700g.p99005.x43
    public int getCurrentTimeout() {
        return this.d;
    }

    public j43(int initialTimeoutMs, int maxNumRetries, float backoffMultiplier) {
        this.d = initialTimeoutMs;
        this.f = maxNumRetries;
        this.g = backoffMultiplier;
    }
}