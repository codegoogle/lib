package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: VpnTransport.java */
/* loaded from: classes2.dex */
public abstract class hn1 {
    @x1
    private List<jn1> s = new CopyOnWriteArrayList();

    public abstract void A(@x1 fo1 fo1Var, @x1 ln1 ln1Var) throws gc1;

    public abstract void B();

    public void C(@x1 fo1 fo1Var) {
        throw new UnsupportedOperationException();
    }

    @x1
    public abstract String D();

    public void j() {
    }

    public void k(@x1 jn1 jn1Var) {
        this.s.add(jn1Var);
    }

    @x1
    public abstract lm1 l();

    public int m(@x1 String str) {
        throw new UnsupportedOperationException();
    }

    public int n() {
        throw new UnsupportedOperationException();
    }

    @x1
    public abstract String o();

    @x1
    public List<ld1> p() {
        return Collections.emptyList();
    }

    public boolean q() {
        return true;
    }

    public void r() {
        for (jn1 jn1Var : this.s) {
            jn1Var.h();
        }
    }

    public final void s(@x1 kc1 kc1Var) {
        for (jn1 jn1Var : this.s) {
            jn1Var.i(kc1Var);
        }
    }

    public final void t(long j, long j2) {
        for (jn1 jn1Var : this.s) {
            jn1Var.a(j, j2);
        }
    }

    public final void u(@x1 Parcelable parcelable) {
        for (jn1 jn1Var : this.s) {
            jn1Var.b(parcelable);
        }
    }

    public void v(int i, @x1 Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void w(@x1 Bundle bundle) {
    }

    public void x(@x1 jn1 jn1Var) {
        this.s.remove(jn1Var);
    }

    public void y() {
        throw new UnsupportedOperationException();
    }

    public void z(@x1 String str, @x1 String str2) {
    }
}