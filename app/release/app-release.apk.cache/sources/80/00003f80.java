package com.p7700g.p99005;

import com.p7700g.p99005.sv3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: IoCProviderFactory.java */
/* loaded from: classes3.dex */
public class dw3 extends sv3 {
    private final List<yv3> d;

    /* compiled from: IoCProviderFactory.java */
    /* loaded from: classes3.dex */
    public static class a implements pv3 {
        private final Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // com.p7700g.p99005.pv3
        public Object b() {
            return this.a;
        }
    }

    /* compiled from: IoCProviderFactory.java */
    /* loaded from: classes3.dex */
    public static class b implements pv3, sv3.a {
        private final Object a;
        private final zv3 b;
        private final nv3 c;

        public b(ky3 ky3Var, bw3 bw3Var, Class cls) {
            zv3 zv3Var = bw3Var instanceof zv3 ? (zv3) bw3Var : null;
            this.b = zv3Var;
            Object b = bw3Var.b();
            this.a = b;
            this.c = zv3Var == null ? new nv3(cls) : null;
            if (zv3Var == null) {
                new ov3(ky3Var, cls).a(bw3Var.c(b));
            }
        }

        @Override // com.p7700g.p99005.pv3
        public Object b() {
            return this.a;
        }

        @Override // com.p7700g.p99005.sv3.a
        public void destroy() {
            zv3 zv3Var = this.b;
            if (zv3Var != null) {
                zv3Var.a(this.a);
                return;
            }
            try {
                this.c.a(this.a);
            } catch (IllegalAccessException e) {
                sv3.a.log(Level.SEVERE, "Unable to destroy resource", (Throwable) e);
            } catch (IllegalArgumentException e2) {
                sv3.a.log(Level.SEVERE, "Unable to destroy resource", (Throwable) e2);
            } catch (InvocationTargetException e3) {
                sv3.a.log(Level.SEVERE, "Unable to destroy resource", (Throwable) e3);
            }
        }
    }

    /* compiled from: IoCProviderFactory.java */
    /* loaded from: classes3.dex */
    public static class c implements pv3 {
        private final Object a;

        public c(ky3 ky3Var, bw3 bw3Var, Class cls) {
            ov3 ov3Var = new ov3(ky3Var, cls);
            Object b = bw3Var.b();
            this.a = b;
            ov3Var.a(bw3Var.c(b));
        }

        @Override // com.p7700g.p99005.pv3
        public Object b() {
            return this.a;
        }
    }

    /* compiled from: IoCProviderFactory.java */
    /* loaded from: classes3.dex */
    public static class d implements pv3, sv3.a {
        private final sv3.a a;
        private final Object b;

        public d(ew3 ew3Var, pv3 pv3Var, Class cls) {
            this.a = pv3Var instanceof sv3.a ? (sv3.a) pv3Var : null;
            Object b = pv3Var.b();
            Object d = ew3Var.d(b);
            this.b = d;
            if (d.getClass().isAssignableFrom(b.getClass())) {
                return;
            }
            StringBuilder G = wo1.G("Proxied object class ");
            G.append(d.getClass());
            G.append(" is not assignable from object class ");
            G.append(b.getClass());
            throw new IllegalStateException(G.toString());
        }

        @Override // com.p7700g.p99005.pv3
        public Object b() {
            return this.b;
        }

        @Override // com.p7700g.p99005.sv3.a
        public void destroy() {
            sv3.a aVar = this.a;
            if (aVar != null) {
                aVar.destroy();
            }
        }
    }

    public dw3(ky3 ky3Var, yv3 yv3Var) {
        this(ky3Var, Collections.singletonList(yv3Var));
    }

    private pv3 n(Class cls, xv3 xv3Var) {
        if (xv3Var instanceof cw3) {
            cw3 cw3Var = (cw3) xv3Var;
            if (cw3Var.a() == rv3.Singleton) {
                return new c(g(), cw3Var, cls);
            }
            throw new RuntimeException("The scope of the component " + cls + " must be a singleton");
        } else if (xv3Var instanceof aw3) {
            return new a(((aw3) xv3Var).b());
        } else {
            if (xv3Var instanceof bw3) {
                return new b(g(), (bw3) xv3Var, cls);
            } else if (xv3Var instanceof ew3) {
                ew3 ew3Var = (ew3) xv3Var;
                pv3 d2 = super.d(cls);
                if (d2 == null) {
                    return null;
                }
                return new d(ew3Var, d2, cls);
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    @Override // com.p7700g.p99005.sv3
    public pv3 d(Class cls) {
        Iterator<yv3> it = this.d.iterator();
        xv3 xv3Var = null;
        while (it.hasNext() && (xv3Var = it.next().a((Class<?>) cls)) == null) {
        }
        return xv3Var == null ? super.d(cls) : n(cls, xv3Var);
    }

    public dw3(ky3 ky3Var, List<yv3> list) {
        super(ky3Var);
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, hx3.b);
        this.d = Collections.unmodifiableList(arrayList);
    }
}