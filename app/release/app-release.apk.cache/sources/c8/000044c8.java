package com.p7700g.p99005;

import com.onesignal.OSUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: OSObservable.java */
/* loaded from: classes3.dex */
public class gl3<ObserverType, StateType> {
    private String a;
    private List<Object> b = new ArrayList();
    private boolean c;

    /* compiled from: OSObservable.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ Method s;
        public final /* synthetic */ Object t;
        public final /* synthetic */ Object u;

        public a(Method method, Object obj, Object obj2) {
            this.s = method;
            this.t = obj;
            this.u = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.s.invoke(this.t, this.u);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public gl3(String str, boolean z) {
        this.a = str;
        this.c = z;
    }

    public void a(ObserverType observertype) {
        this.b.add(new WeakReference(observertype));
    }

    public void b(ObserverType observertype) {
        this.b.add(observertype);
    }

    public boolean c(StateType statetype) {
        Iterator<Object> it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                try {
                    Method declaredMethod = next.getClass().getDeclaredMethod(this.a, statetype.getClass());
                    declaredMethod.setAccessible(true);
                    if (this.c) {
                        OSUtils.V(new a(declaredMethod, next, statetype));
                    } else {
                        try {
                            declaredMethod.invoke(next, statetype);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z = true;
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return z;
    }

    public void d(ObserverType observertype) {
        for (int i = 0; i < this.b.size(); i++) {
            Object obj = ((WeakReference) this.b.get(i)).get();
            if (obj != null && obj.equals(observertype)) {
                this.b.remove(i);
                return;
            }
        }
    }
}