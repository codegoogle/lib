package com.p7700g.p99005;

import com.p7700g.p99005.nu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Dynamic64Structure.java */
/* loaded from: classes.dex */
public class mu0 extends nu0.a {
    public mu0(qu0 qu0Var, nu0.b bVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 16);
        this.d = qu0Var.j(allocate, j2);
        this.e = qu0Var.j(allocate, j2 + 8);
    }
}