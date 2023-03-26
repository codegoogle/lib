package com.p7700g.p99005;

import com.p7700g.p99005.wy5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Dynamic32Structure.java */
/* loaded from: classes4.dex */
public class uy5 extends wy5.a {
    public uy5(zy5 zy5Var, wy5.b bVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 8);
        this.d = zy5Var.l(allocate, j2);
        this.e = zy5Var.l(allocate, j2 + 4);
    }
}