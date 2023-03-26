package com.p7700g.p99005;

import com.p7700g.p99005.nu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Program64Header.java */
/* loaded from: classes.dex */
public class su0 extends nu0.c {
    public su0(qu0 qu0Var, nu0.b bVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * bVar.h) + bVar.f;
        this.c = qu0Var.l(allocate, j2);
        this.d = qu0Var.j(allocate, 8 + j2);
        this.e = qu0Var.j(allocate, 16 + j2);
        this.f = qu0Var.j(allocate, j2 + 40);
    }
}