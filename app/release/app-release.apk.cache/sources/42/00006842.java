package com.p7700g.p99005;

import com.p7700g.p99005.wy5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Elf64Header.java */
/* loaded from: classes4.dex */
public class yy5 extends wy5.b {
    private final zy5 m;

    public yy5(boolean z, zy5 zy5Var) throws IOException {
        this.d = z;
        this.m = zy5Var;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.e = zy5Var.h(allocate, 16L);
        this.f = zy5Var.j(allocate, 32L);
        this.g = zy5Var.j(allocate, 40L);
        this.h = zy5Var.h(allocate, 54L);
        this.i = zy5Var.h(allocate, 56L);
        this.j = zy5Var.h(allocate, 58L);
        this.k = zy5Var.h(allocate, 60L);
        this.l = zy5Var.h(allocate, 62L);
    }

    @Override // com.p7700g.p99005.wy5.b
    public wy5.a a(long j, int i) throws IOException {
        return new vy5(this.m, this, j, i);
    }

    @Override // com.p7700g.p99005.wy5.b
    public wy5.c b(long j) throws IOException {
        return new bz5(this.m, this, j);
    }

    @Override // com.p7700g.p99005.wy5.b
    public wy5.d c(int i) throws IOException {
        return new dz5(this.m, this, i);
    }
}