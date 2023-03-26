package com.p7700g.p99005;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ConnectionProbeFactory.java */
/* loaded from: classes.dex */
public class v21 {
    @x1
    private final e41 a;
    private ui1 b;
    private o51 c;
    @x1
    private final a51 d;
    @x1
    private final x21 e;
    @x1
    private final f41 f;
    @x1
    private final ScheduledExecutorService g;

    public v21(@x1 e41 e41Var, @x1 ui1 ui1Var, @x1 o51 o51Var, @x1 a51 a51Var, @x1 x21 x21Var, @x1 f41 f41Var, @x1 ScheduledExecutorService scheduledExecutorService) {
        this.a = e41Var;
        this.b = ui1Var;
        this.c = o51Var;
        this.d = a51Var;
        this.e = x21Var;
        this.f = f41Var;
        this.g = scheduledExecutorService;
    }

    public e51 a(@x1 y41 y41Var) {
        return new e51(this.a, this.c, this.b, y41Var, this.e, this.f, this.d, this.g);
    }
}