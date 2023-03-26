package com.p7700g.p99005;

import com.p7700g.p99005.kb;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: HelperReference.java */
/* loaded from: classes.dex */
public class fb extends db implements rb {
    public final kb j0;
    public final kb.e k0;
    public ArrayList<Object> l0;
    private ec m0;

    public fb(kb kbVar, kb.e eVar) {
        super(kbVar);
        this.l0 = new ArrayList<>();
        this.j0 = kbVar;
        this.k0 = eVar;
    }

    public fb M0(Object... objArr) {
        Collections.addAll(this.l0, objArr);
        return this;
    }

    public ec N0() {
        return this.m0;
    }

    public kb.e O0() {
        return this.k0;
    }

    public void P0(ec ecVar) {
        this.m0 = ecVar;
    }

    @Override // com.p7700g.p99005.db, com.p7700g.p99005.hb
    public void a() {
    }

    @Override // com.p7700g.p99005.db, com.p7700g.p99005.hb
    public zb b() {
        return N0();
    }
}