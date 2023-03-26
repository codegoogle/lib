package com.p7700g.p99005;

import com.p7700g.p99005.wy5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Section32Header.java */
/* loaded from: classes4.dex */
public class cz5 extends wy5.d {
    public cz5(zy5 zy5Var, wy5.b bVar, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.a = zy5Var.l(allocate, bVar.g + (i * bVar.j) + 28);
    }
}