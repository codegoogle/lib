package com.p7700g.p99005;

import com.p7700g.p99005.nu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Dynamic32Structure.java */
/* loaded from: classes.dex */
public class lu0 extends nu0.a {
    public lu0(qu0 qu0Var, nu0.b bVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 8);
        this.d = qu0Var.l(allocate, j2);
        this.e = qu0Var.l(allocate, j2 + 4);
    }
}