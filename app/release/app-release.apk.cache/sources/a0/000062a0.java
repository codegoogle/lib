package com.p7700g.p99005;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: GifRenderingExecutor.java */
/* loaded from: classes4.dex */
public final class vx5 extends ScheduledThreadPoolExecutor {

    /* compiled from: GifRenderingExecutor.java */
    /* loaded from: classes4.dex */
    public static final class b {
        private static final vx5 a = new vx5();

        private b() {
        }
    }

    public static vx5 a() {
        return b.a;
    }

    private vx5() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}