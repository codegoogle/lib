package com.p7700g.p99005;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class n10<D> {
    public int a;
    public c<D> b;
    public b<D> c;
    public Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            n10.this.p();
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface b<D> {
        void a(@x1 n10<D> n10Var);
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface c<D> {
        void a(@x1 n10<D> n10Var, @z1 D d);
    }

    public n10(@x1 Context context) {
        this.d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }

    @u1
    public void B(@x1 c<D> cVar) {
        c<D> cVar2 = this.b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (cVar2 == cVar) {
            this.b = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }

    @u1
    public void C(@x1 b<D> bVar) {
        b<D> bVar2 = this.c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 == bVar) {
            this.c = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }

    @u1
    public void a() {
        this.f = true;
        n();
    }

    @u1
    public boolean b() {
        return o();
    }

    public void c() {
        this.i = false;
    }

    @x1
    public String d(@z1 D d) {
        StringBuilder sb = new StringBuilder(64);
        zo.a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @u1
    public void e() {
        b<D> bVar = this.c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @u1
    public void f(@z1 D d) {
        c<D> cVar = this.b;
        if (cVar != null) {
            cVar.a(this, d);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
    }

    @u1
    public void h() {
        q();
    }

    @x1
    public Context i() {
        return this.d;
    }

    public int j() {
        return this.a;
    }

    public boolean k() {
        return this.f;
    }

    public boolean l() {
        return this.g;
    }

    public boolean m() {
        return this.e;
    }

    @u1
    public void n() {
    }

    @u1
    public boolean o() {
        return false;
    }

    @u1
    public void p() {
        if (this.e) {
            h();
        } else {
            this.h = true;
        }
    }

    @u1
    public void q() {
    }

    @u1
    public void r() {
    }

    @u1
    public void s() {
    }

    @u1
    public void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        zo.a(this, sb);
        sb.append(" id=");
        return wo1.z(sb, this.a, "}");
    }

    @u1
    public void u(int i, @x1 c<D> cVar) {
        if (this.b == null) {
            this.b = cVar;
            this.a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @u1
    public void v(@x1 b<D> bVar) {
        if (this.c == null) {
            this.c = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @u1
    public void w() {
        r();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void x() {
        if (this.i) {
            p();
        }
    }

    @u1
    public final void y() {
        this.e = true;
        this.g = false;
        this.f = false;
        s();
    }

    @u1
    public void z() {
        this.e = false;
        t();
    }
}