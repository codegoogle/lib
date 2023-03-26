package com.p7700g.p99005;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule.java */
@x52
/* loaded from: classes2.dex */
public abstract class q42 {
    @y52
    @rl4
    public static Executor a() {
        return new t42(Executors.newSingleThreadExecutor());
    }
}