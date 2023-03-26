package com.p7700g.p99005;

import com.p7700g.p99005.zb;

/* compiled from: Dimension.java */
/* loaded from: classes.dex */
public class eb {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static final Object f = new Object();
    private final int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public String l;
    public Object m;
    public boolean n;

    /* compiled from: Dimension.java */
    /* loaded from: classes.dex */
    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private eb() {
        this.g = -2;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = 1.0f;
        this.k = 0;
        this.l = null;
        this.m = b;
        this.n = false;
    }

    public static eb a(int i) {
        eb ebVar = new eb(a);
        ebVar.l(i);
        return ebVar;
    }

    public static eb b(Object obj) {
        eb ebVar = new eb(a);
        ebVar.m(obj);
        return ebVar;
    }

    public static eb c() {
        return new eb(d);
    }

    public static eb d(Object obj, float f2) {
        eb ebVar = new eb(e);
        ebVar.s(obj, f2);
        return ebVar;
    }

    public static eb e(String str) {
        eb ebVar = new eb(f);
        ebVar.t(str);
        return ebVar;
    }

    public static eb f() {
        return new eb(c);
    }

    public static eb g(int i) {
        eb ebVar = new eb();
        ebVar.v(i);
        return ebVar;
    }

    public static eb h(Object obj) {
        eb ebVar = new eb();
        ebVar.w(obj);
        return ebVar;
    }

    public static eb i() {
        return new eb(b);
    }

    public void j(kb kbVar, zb zbVar, int i) {
        String str = this.l;
        if (str != null) {
            zbVar.n1(str);
        }
        int i2 = 2;
        if (i == 0) {
            if (this.n) {
                zbVar.D1(zb.b.MATCH_CONSTRAINT);
                Object obj = this.m;
                if (obj == b) {
                    i2 = 1;
                } else if (obj != e) {
                    i2 = 0;
                }
                zbVar.E1(i2, this.h, this.i, this.j);
                return;
            }
            int i3 = this.h;
            if (i3 > 0) {
                zbVar.P1(i3);
            }
            int i4 = this.i;
            if (i4 < Integer.MAX_VALUE) {
                zbVar.M1(i4);
            }
            Object obj2 = this.m;
            if (obj2 == b) {
                zbVar.D1(zb.b.WRAP_CONTENT);
            } else if (obj2 == d) {
                zbVar.D1(zb.b.MATCH_PARENT);
            } else if (obj2 == null) {
                zbVar.D1(zb.b.FIXED);
                zbVar.c2(this.k);
            }
        } else if (this.n) {
            zbVar.Y1(zb.b.MATCH_CONSTRAINT);
            Object obj3 = this.m;
            if (obj3 == b) {
                i2 = 1;
            } else if (obj3 != e) {
                i2 = 0;
            }
            zbVar.Z1(i2, this.h, this.i, this.j);
        } else {
            int i5 = this.h;
            if (i5 > 0) {
                zbVar.O1(i5);
            }
            int i6 = this.i;
            if (i6 < Integer.MAX_VALUE) {
                zbVar.L1(i6);
            }
            Object obj4 = this.m;
            if (obj4 == b) {
                zbVar.Y1(zb.b.WRAP_CONTENT);
            } else if (obj4 == d) {
                zbVar.Y1(zb.b.MATCH_PARENT);
            } else if (obj4 == null) {
                zbVar.Y1(zb.b.FIXED);
                zbVar.y1(this.k);
            }
        }
    }

    public boolean k(int i) {
        return this.m == null && this.k == i;
    }

    public eb l(int i) {
        this.m = null;
        this.k = i;
        return this;
    }

    public eb m(Object obj) {
        this.m = obj;
        if (obj instanceof Integer) {
            this.k = ((Integer) obj).intValue();
            this.m = null;
        }
        return this;
    }

    public int n() {
        return this.k;
    }

    public eb o(int i) {
        if (this.i >= 0) {
            this.i = i;
        }
        return this;
    }

    public eb p(Object obj) {
        Object obj2 = b;
        if (obj == obj2 && this.n) {
            this.m = obj2;
            this.i = Integer.MAX_VALUE;
        }
        return this;
    }

    public eb q(int i) {
        if (i >= 0) {
            this.h = i;
        }
        return this;
    }

    public eb r(Object obj) {
        if (obj == b) {
            this.h = -2;
        }
        return this;
    }

    public eb s(Object obj, float f2) {
        this.j = f2;
        return this;
    }

    public eb t(String str) {
        this.l = str;
        return this;
    }

    public void u(int i) {
        this.n = false;
        this.m = null;
        this.k = i;
    }

    public eb v(int i) {
        this.n = true;
        if (i >= 0) {
            this.i = i;
        }
        return this;
    }

    public eb w(Object obj) {
        this.m = obj;
        this.n = true;
        return this;
    }

    private eb(Object obj) {
        this.g = -2;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = 1.0f;
        this.k = 0;
        this.l = null;
        this.m = b;
        this.n = false;
        this.m = obj;
    }
}