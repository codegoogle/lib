package com.p7700g.p99005;

import com.p7700g.p99005.nu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Elf64Header.java */
/* loaded from: classes.dex */
public class pu0 extends nu0.b {
    private final qu0 m;

    public pu0(boolean z, qu0 qu0Var) throws IOException {
        this.d = z;
        this.m = qu0Var;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.e = qu0Var.h(allocate, 16L);
        this.f = qu0Var.j(allocate, 32L);
        this.g = qu0Var.j(allocate, 40L);
        this.h = qu0Var.h(allocate, 54L);
        this.i = qu0Var.h(allocate, 56L);
        this.j = qu0Var.h(allocate, 58L);
        this.k = qu0Var.h(allocate, 60L);
        this.l = qu0Var.h(allocate, 62L);
    }

    @Override // com.p7700g.p99005.nu0.b
    public nu0.a a(long j, int i) throws IOException {
        return new mu0(this.m, this, j, i);
    }

    @Override // com.p7700g.p99005.nu0.b
    public nu0.c b(long j) throws IOException {
        return new su0(this.m, this, j);
    }

    @Override // com.p7700g.p99005.nu0.b
    public nu0.d c(int i) throws IOException {
        return new uu0(this.m, this, i);
    }
}