package com.p7700g.p99005;

import com.p7700g.p99005.kb;
import java.util.Iterator;

/* compiled from: AlignHorizontallyReference.java */
/* loaded from: classes.dex */
public class nb extends fb {
    private float n0;

    public nb(kb kbVar) {
        super(kbVar, kb.e.ALIGN_VERTICALLY);
        this.n0 = 0.5f;
    }

    @Override // com.p7700g.p99005.fb, com.p7700g.p99005.db, com.p7700g.p99005.hb
    public void a() {
        Iterator<Object> it = this.l0.iterator();
        while (it.hasNext()) {
            db e = this.j0.e(it.next());
            e.v();
            Object obj = this.O;
            if (obj != null) {
                e.B0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    e.A0(obj2);
                } else {
                    e.B0(kb.e);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                e.B(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    e.A(obj4);
                } else {
                    e.A(kb.e);
                }
            }
            float f = this.n0;
            if (f != 0.5f) {
                e.Y(f);
            }
        }
    }
}