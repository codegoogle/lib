package com.p7700g.p99005;

import com.p7700g.p99005.nu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Section32Header.java */
/* loaded from: classes.dex */
public class tu0 extends nu0.d {
    public tu0(qu0 qu0Var, nu0.b bVar, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.a = qu0Var.l(allocate, bVar.g + (i * bVar.j) + 28);
    }
}