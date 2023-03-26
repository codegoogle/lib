package com.p7700g.p99005;

import com.p7700g.p99005.nu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Section64Header.java */
/* loaded from: classes.dex */
public class uu0 extends nu0.d {
    public uu0(qu0 qu0Var, nu0.b bVar, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.a = qu0Var.l(allocate, bVar.g + (i * bVar.j) + 44);
    }
}