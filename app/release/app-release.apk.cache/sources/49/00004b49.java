package com.p7700g.p99005;

import com.p7700g.p99005.kt3;
import java.text.ParseException;

/* compiled from: HttpHeaderListAdapter.java */
/* loaded from: classes3.dex */
public class jt3 extends kt3 {
    private kt3 i;
    public boolean j;

    public jt3(kt3 kt3Var) {
        this.i = kt3Var;
    }

    public void M() {
        this.j = false;
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j a() {
        return this.i.a();
    }

    @Override // com.p7700g.p99005.kt3
    public String b() {
        return this.i.b();
    }

    @Override // com.p7700g.p99005.kt3
    public int c() {
        return this.i.c();
    }

    @Override // com.p7700g.p99005.kt3
    public String d() {
        return this.i.d();
    }

    @Override // com.p7700g.p99005.kt3
    public boolean e() {
        if (!this.j && this.i.e()) {
            if (this.i.f(e14.f0, true)) {
                this.j = true;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.kt3
    public boolean f(char c, boolean z) {
        if (this.j) {
            return false;
        }
        if (this.i.f(e14.f0, z)) {
            this.j = true;
            return false;
        }
        return this.i.f(c, z);
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j i() throws ParseException {
        return j(true);
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j j(boolean z) throws ParseException {
        return k(z, false);
    }

    @Override // com.p7700g.p99005.kt3
    public kt3.j k(boolean z, boolean z2) throws ParseException {
        if (!this.j) {
            if (!this.i.f(e14.f0, z)) {
                return this.i.k(z, z2);
            }
            this.j = true;
            throw new ParseException("End of header", c());
        }
        throw new ParseException("End of header", c());
    }

    @Override // com.p7700g.p99005.kt3
    public String m(char c, char c2) throws ParseException {
        if (!this.j) {
            if (!this.i.f(e14.f0, true)) {
                return this.i.m(c, c2);
            }
            this.j = true;
            throw new ParseException("End of header", c());
        }
        throw new ParseException("End of header", c());
    }
}