package com.p7700g.p99005;

import com.p7700g.p99005.kb;
import java.util.Iterator;

/* compiled from: AlignVerticallyReference.java */
/* loaded from: classes.dex */
public class ob extends fb {
    private float n0;

    public ob(kb kbVar) {
        super(kbVar, kb.e.ALIGN_VERTICALLY);
        this.n0 = 0.5f;
    }

    @Override // com.p7700g.p99005.fb, com.p7700g.p99005.db, com.p7700g.p99005.hb
    public void a() {
        Iterator<Object> it = this.l0.iterator();
        while (it.hasNext()) {
            db e = this.j0.e(it.next());
            e.w();
            Object obj = this.S;
            if (obj != null) {
                e.E0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    e.D0(obj2);
                } else {
                    e.E0(kb.e);
                }
            }
            Object obj3 = this.U;
            if (obj3 != null) {
                e.q(obj3);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    e.p(obj4);
                } else {
                    e.p(kb.e);
                }
            }
            float f = this.n0;
            if (f != 0.5f) {
                e.J0(f);
            }
        }
    }
}