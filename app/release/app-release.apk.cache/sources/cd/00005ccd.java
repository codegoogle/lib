package com.p7700g.p99005;

import com.p7700g.p99005.tv3;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ProviderFactory.java */
/* loaded from: classes3.dex */
public class sv3 implements qv3<pv3> {
    public static final Logger a = Logger.getLogger(sv3.class.getName());
    private final Map<Class, pv3> b = new HashMap();
    private final ky3 c;

    /* compiled from: ProviderFactory.java */
    /* loaded from: classes3.dex */
    public interface a {
        void destroy();
    }

    /* compiled from: ProviderFactory.java */
    /* loaded from: classes3.dex */
    public static final class b implements pv3, a {
        private final Object a;
        private final nv3 b;
        private final ov3 c;

        public b(ov3 ov3Var, Object obj) {
            this.b = new nv3(obj.getClass());
            this.c = ov3Var;
            this.a = obj;
        }

        @Override // com.p7700g.p99005.pv3
        public Object b() {
            return this.a;
        }

        @Override // com.p7700g.p99005.sv3.a
        public void destroy() {
            try {
                this.b.a(this.a);
            } catch (IllegalAccessException e) {
                sv3.a.log(Level.SEVERE, "Unable to destroy resource", (Throwable) e);
            } catch (IllegalArgumentException e2) {
                sv3.a.log(Level.SEVERE, "Unable to destroy resource", (Throwable) e2);
            } catch (InvocationTargetException e3) {
                sv3.a.log(Level.SEVERE, "Unable to destroy resource", (Throwable) e3);
            }
        }

        public void e() {
            this.c.a(this.a);
        }
    }

    public sv3(ky3 ky3Var) {
        this.c = ky3Var;
    }

    private pv3 c(Class cls) {
        try {
            ov3 ov3Var = new ov3(this.c, cls);
            return new b(ov3Var, new lv3(this.c, cls, ov3Var).c());
        } catch (Exception e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            logger.log(level, "The provider class, " + cls + ", could not be instantiated. Processing will continue but the class will not be utilized", (Throwable) e);
            return null;
        } catch (NoClassDefFoundError e2) {
            Logger logger2 = a;
            Level level2 = Level.CONFIG;
            StringBuilder G = wo1.G("A dependent class, ");
            G.append(e2.getLocalizedMessage());
            G.append(", of the component ");
            G.append(cls);
            G.append(" is not found.");
            G.append(" The component is ignored.");
            logger2.log(level2, G.toString());
            return null;
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof NoClassDefFoundError) {
                Logger logger3 = a;
                Level level3 = Level.CONFIG;
                StringBuilder G2 = wo1.G("A dependent class, ");
                G2.append(((NoClassDefFoundError) e3.getCause()).getLocalizedMessage());
                G2.append(", of the component ");
                G2.append(cls);
                G2.append(" is not found.");
                G2.append(" The component is ignored.");
                logger3.log(level3, G2.toString());
                return null;
            }
            Logger logger4 = a;
            Level level4 = Level.SEVERE;
            logger4.log(level4, "The provider class, " + cls + ", could not be instantiated. Processing will continue but the class will not be utilized", e3.getTargetException());
            return null;
        }
    }

    @Override // com.p7700g.p99005.qv3
    public final pv3 a(Class cls) {
        pv3 pv3Var = this.b.get(cls);
        if (pv3Var != null) {
            return pv3Var;
        }
        pv3 d = d(cls);
        if (d != null) {
            this.b.put(cls, d);
        }
        return d;
    }

    public pv3 d(Class cls) {
        return c(cls);
    }

    public void e() {
        for (pv3 pv3Var : this.b.values()) {
            if (pv3Var instanceof a) {
                ((a) pv3Var).destroy();
            }
        }
    }

    public final pv3 f(tv3.a aVar) {
        if (!aVar.a) {
            return a(aVar.b);
        }
        pv3 pv3Var = this.b.get(aVar.b);
        if (pv3Var != null) {
            return pv3Var;
        }
        pv3 c = c(aVar.b);
        if (c != null) {
            this.b.put(aVar.b, c);
        }
        return c;
    }

    public ky3 g() {
        return this.c;
    }

    public void h() {
        for (pv3 pv3Var : this.b.values()) {
            if (pv3Var instanceof b) {
                ((b) pv3Var).e();
            }
        }
    }

    public void i(Object obj) {
        new ov3(this.c, obj.getClass()).a(obj);
    }

    public void j(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
    }
}