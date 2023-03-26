package com.p7700g.p99005;

import com.p7700g.p99005.wy5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Dynamic64Structure.java */
/* loaded from: classes4.dex */
public class vy5 extends wy5.a {
    public vy5(zy5 zy5Var, wy5.b bVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 16);
        this.d = zy5Var.j(allocate, j2);
        this.e = zy5Var.j(allocate, j2 + 8);
    }
}