package com.p7700g.p99005;

import com.p7700g.p99005.wy5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Program64Header.java */
/* loaded from: classes4.dex */
public class bz5 extends wy5.c {
    public bz5(zy5 zy5Var, wy5.b bVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * bVar.h) + bVar.f;
        this.c = zy5Var.l(allocate, j2);
        this.d = zy5Var.j(allocate, 8 + j2);
        this.e = zy5Var.j(allocate, 16 + j2);
        this.f = zy5Var.j(allocate, j2 + 40);
    }
}