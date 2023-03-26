package com.p7700g.p99005;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ip;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: AsyncLayoutInflater.java */
/* loaded from: classes.dex */
public final class o5 {
    private static final String a = "AsyncLayoutInflater";
    public LayoutInflater b;
    private Handler.Callback e = new a();
    public Handler c = new Handler(this.e);
    public d d = d.b();

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.d == null) {
                cVar.d = o5.this.b.inflate(cVar.c, cVar.b, false);
            }
            cVar.e.a(cVar.d, cVar.c, cVar.b);
            o5.this.d.d(cVar);
            return true;
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public static class b extends LayoutInflater {
        private static final String[] a = {"android.widget.", "android.webkit.", "android.app."};

        public b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            for (String str2 : a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public static class c {
        public o5 a;
        public ViewGroup b;
        public int c;
        public View d;
        public e e;
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public static class d extends Thread {
        private static final d s;
        private ArrayBlockingQueue<c> t = new ArrayBlockingQueue<>(10);
        private ip.c<c> u = new ip.c<>(10);

        static {
            d dVar = new d();
            s = dVar;
            dVar.start();
        }

        private d() {
        }

        public static d b() {
            return s;
        }

        public void a(c cVar) {
            try {
                this.t.put(cVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public c c() {
            c b = this.u.b();
            return b == null ? new c() : b;
        }

        public void d(c cVar) {
            cVar.e = null;
            cVar.a = null;
            cVar.b = null;
            cVar.c = 0;
            cVar.d = null;
            this.u.a(cVar);
        }

        public void e() {
            try {
                c take = this.t.take();
                try {
                    take.d = take.a.b.inflate(take.c, take.b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(take.a.c, 0, take).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                e();
            }
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(@x1 View view, @s1 int i, @z1 ViewGroup viewGroup);
    }

    public o5(@x1 Context context) {
        this.b = new b(context);
    }

    @q2
    public void a(@s1 int i, @z1 ViewGroup viewGroup, @x1 e eVar) {
        Objects.requireNonNull(eVar, "callback argument may not be null!");
        c c2 = this.d.c();
        c2.a = this;
        c2.c = i;
        c2.b = viewGroup;
        c2.e = eVar;
        this.d.a(c2);
    }
}