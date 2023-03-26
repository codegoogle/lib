package com.p7700g.p99005;

import com.p7700g.p99005.nu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Program32Header.java */
/* loaded from: classes.dex */
public class ru0 extends nu0.c {
    public ru0(qu0 qu0Var, nu0.b bVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * bVar.h) + bVar.f;
        this.c = qu0Var.l(allocate, j2);
        this.d = qu0Var.l(allocate, 4 + j2);
        this.e = qu0Var.l(allocate, 8 + j2);
        this.f = qu0Var.l(allocate, j2 + 20);
    }
}