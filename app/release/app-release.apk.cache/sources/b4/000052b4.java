package com.p7700g.p99005;

import android.graphics.Typeface;
import android.os.Handler;
import com.p7700g.p99005.sn;
import com.p7700g.p99005.tn;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public class nn {
    @x1
    private final tn.d a;
    @x1
    private final Handler b;

    /* compiled from: CallbackWithHandler.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ tn.d s;
        public final /* synthetic */ Typeface t;

        public a(tn.d dVar, Typeface typeface) {
            this.s = dVar;
            this.t = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.b(this.t);
        }
    }

    /* compiled from: CallbackWithHandler.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ tn.d s;
        public final /* synthetic */ int t;

        public b(tn.d dVar, int i) {
            this.s = dVar;
            this.t = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.a(this.t);
        }
    }

    public nn(@x1 tn.d dVar, @x1 Handler handler) {
        this.a = dVar;
        this.b = handler;
    }

    private void a(int i) {
        this.b.post(new b(this.a, i));
    }

    private void c(@x1 Typeface typeface) {
        this.b.post(new a(this.a, typeface));
    }

    public void b(@x1 sn.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public nn(@x1 tn.d dVar) {
        this.a = dVar;
        this.b = on.a();
    }
}