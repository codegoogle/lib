package com.p7700g.p99005;

import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.k30;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public class p20 implements k30.a {
    public static final int a = 0;
    public static final int b = 1;
    private static final boolean c = false;
    private static final String d = "AHT";
    private ip.a<b> e;
    public final ArrayList<b> f;
    public final ArrayList<b> g;
    public final a h;
    public Runnable i;
    public final boolean j;
    public final k30 k;
    private int l;

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2);

        void b(b bVar);

        void c(int i, int i2, Object obj);

        void d(b bVar);

        RecyclerView.f0 e(int i);

        void f(int i, int i2);

        void g(int i, int i2);

        void h(int i, int i2);
    }

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        public static final int d = 8;
        public static final int e = 30;
        public int f;
        public int g;
        public Object h;
        public int i;

        public b(int i, int i2, int i3, Object obj) {
            this.f = i;
            this.g = i2;
            this.i = i3;
            this.h = obj;
        }

        public String a() {
            int i = this.f;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : com.anythink.expressad.d.a.b.ay;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f;
            if (i != bVar.f) {
                return false;
            }
            if (i == 8 && Math.abs(this.i - this.g) == 1 && this.i == bVar.g && this.g == bVar.i) {
                return true;
            }
            if (this.i == bVar.i && this.g == bVar.g) {
                Object obj2 = this.h;
                if (obj2 != null) {
                    if (!obj2.equals(bVar.h)) {
                        return false;
                    }
                } else if (bVar.h != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f * 31) + this.g) * 31) + this.i;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.g + "c:" + this.i + ",p:" + this.h + "]";
        }
    }

    public p20(a aVar) {
        this(aVar, false);
    }

    private int A(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.g.size() - 1; size >= 0; size--) {
            b bVar = this.g.get(size);
            int i5 = bVar.f;
            if (i5 == 8) {
                int i6 = bVar.g;
                int i7 = bVar.i;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.g = i6 + 1;
                            bVar.i = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.g = i6 - 1;
                            bVar.i = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.i = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.i = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.g = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.g = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.g;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.i;
                    } else if (i5 == 2) {
                        i += bVar.i;
                    }
                } else if (i2 == 1) {
                    bVar.g = i8 + 1;
                } else if (i2 == 2) {
                    bVar.g = i8 - 1;
                }
            }
        }
        for (int size2 = this.g.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.g.get(size2);
            if (bVar2.f == 8) {
                int i9 = bVar2.i;
                if (i9 == bVar2.g || i9 < 0) {
                    this.g.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.i <= 0) {
                this.g.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    private void d(b bVar) {
        w(bVar);
    }

    private void e(b bVar) {
        w(bVar);
    }

    private void g(b bVar) {
        boolean z;
        char c2;
        int i = bVar.g;
        int i2 = bVar.i + i;
        char c3 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.h.e(i3) != null || i(i3)) {
                if (c3 == 0) {
                    l(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    w(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c3 = c2;
        }
        if (i4 != bVar.i) {
            a(bVar);
            bVar = b(2, i, i4, null);
        }
        if (c3 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private void h(b bVar) {
        int i = bVar.g;
        int i2 = bVar.i + i;
        int i3 = i;
        char c2 = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.h.e(i) != null || i(i)) {
                if (c2 == 0) {
                    l(b(4, i3, i4, bVar.h));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    w(b(4, i3, i4, bVar.h));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.i) {
            Object obj = bVar.h;
            a(bVar);
            bVar = b(4, i3, i4, obj);
        }
        if (c2 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private boolean i(int i) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.g.get(i2);
            int i3 = bVar.f;
            if (i3 == 8) {
                if (o(bVar.i, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.g;
                int i5 = bVar.i + i4;
                while (i4 < i5) {
                    if (o(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void l(b bVar) {
        int i;
        int i2 = bVar.f;
        if (i2 != 1 && i2 != 8) {
            int A = A(bVar.g, i2);
            int i3 = bVar.g;
            int i4 = bVar.f;
            if (i4 == 2) {
                i = 0;
            } else if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            } else {
                i = 1;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < bVar.i; i6++) {
                int A2 = A((i * i6) + bVar.g, bVar.f);
                int i7 = bVar.f;
                if (i7 == 2 ? A2 == A : i7 == 4 && A2 == A + 1) {
                    i5++;
                } else {
                    b b2 = b(i7, A, i5, bVar.h);
                    m(b2, i3);
                    a(b2);
                    if (bVar.f == 4) {
                        i3 += i5;
                    }
                    A = A2;
                    i5 = 1;
                }
            }
            Object obj = bVar.h;
            a(bVar);
            if (i5 > 0) {
                b b3 = b(bVar.f, A, i5, obj);
                m(b3, i3);
                a(b3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void w(b bVar) {
        this.g.add(bVar);
        int i = bVar.f;
        if (i == 1) {
            this.h.g(bVar.g, bVar.i);
        } else if (i == 2) {
            this.h.f(bVar.g, bVar.i);
        } else if (i == 4) {
            this.h.c(bVar.g, bVar.i, bVar.h);
        } else if (i == 8) {
            this.h.a(bVar.g, bVar.i);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    @Override // com.p7700g.p99005.k30.a
    public void a(b bVar) {
        if (this.j) {
            return;
        }
        bVar.h = null;
        this.e.a(bVar);
    }

    @Override // com.p7700g.p99005.k30.a
    public b b(int i, int i2, int i3, Object obj) {
        b b2 = this.e.b();
        if (b2 == null) {
            return new b(i, i2, i3, obj);
        }
        b2.f = i;
        b2.g = i2;
        b2.i = i3;
        b2.h = obj;
        return b2;
    }

    public p20 c(b... bVarArr) {
        Collections.addAll(this.f, bVarArr);
        return this;
    }

    public int f(int i) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f.get(i2);
            int i3 = bVar.f;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.g;
                    if (i4 <= i) {
                        int i5 = bVar.i;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.g;
                    if (i6 == i) {
                        i = bVar.i;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.i <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.g <= i) {
                i += bVar.i;
            }
        }
        return i;
    }

    public void j() {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.h.d(this.g.get(i));
        }
        y(this.g);
        this.l = 0;
    }

    public void k() {
        j();
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f.get(i);
            int i2 = bVar.f;
            if (i2 == 1) {
                this.h.d(bVar);
                this.h.g(bVar.g, bVar.i);
            } else if (i2 == 2) {
                this.h.d(bVar);
                this.h.h(bVar.g, bVar.i);
            } else if (i2 == 4) {
                this.h.d(bVar);
                this.h.c(bVar.g, bVar.i, bVar.h);
            } else if (i2 == 8) {
                this.h.d(bVar);
                this.h.a(bVar.g, bVar.i);
            }
            Runnable runnable = this.i;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f);
        this.l = 0;
    }

    public void m(b bVar, int i) {
        this.h.b(bVar);
        int i2 = bVar.f;
        if (i2 == 2) {
            this.h.h(i, bVar.i);
        } else if (i2 == 4) {
            this.h.c(i, bVar.i, bVar.h);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int n(int i) {
        return o(i, 0);
    }

    public int o(int i, int i2) {
        int size = this.g.size();
        while (i2 < size) {
            b bVar = this.g.get(i2);
            int i3 = bVar.f;
            if (i3 == 8) {
                int i4 = bVar.g;
                if (i4 == i) {
                    i = bVar.i;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.i <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.g;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.i;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.i;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean p(int i) {
        return (i & this.l) != 0;
    }

    public boolean q() {
        return this.f.size() > 0;
    }

    public boolean r() {
        return (this.g.isEmpty() || this.f.isEmpty()) ? false : true;
    }

    public boolean s(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f.add(b(4, i, i2, obj));
        this.l |= 4;
        return this.f.size() == 1;
    }

    public boolean t(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f.add(b(1, i, i2, null));
        this.l |= 1;
        return this.f.size() == 1;
    }

    public boolean u(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f.add(b(8, i, i2, null));
            this.l |= 8;
            return this.f.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public boolean v(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f.add(b(2, i, i2, null));
        this.l |= 2;
        return this.f.size() == 1;
    }

    public void x() {
        this.k.b(this.f);
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f.get(i);
            int i2 = bVar.f;
            if (i2 == 1) {
                d(bVar);
            } else if (i2 == 2) {
                g(bVar);
            } else if (i2 == 4) {
                h(bVar);
            } else if (i2 == 8) {
                e(bVar);
            }
            Runnable runnable = this.i;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f.clear();
    }

    public void y(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    public void z() {
        y(this.f);
        y(this.g);
        this.l = 0;
    }

    public p20(a aVar, boolean z) {
        this.e = new ip.b(30);
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.l = 0;
        this.h = aVar;
        this.j = z;
        this.k = new k30(this);
    }
}