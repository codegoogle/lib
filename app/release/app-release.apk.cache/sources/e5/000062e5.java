package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.greedygame.core.uii.GGParentViewGroup;
import com.p7700g.p99005.f73;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class w23 extends s23 {
    @NotNull
    public static final a h = new a(null);
    @NotNull
    private static final String i = "GGUiiAc";
    private static int j = -1;
    private static int k = -1;
    @NotNull
    private final yb3 l;
    private v23 m;
    @Nullable
    private u23 n;
    @NotNull
    private final AtomicBoolean o;
    @NotNull
    private final b p;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return w23.j;
        }

        public final int b() {
            return w23.k;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements f73.b {

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public final /* synthetic */ Object s;
            public final /* synthetic */ w23 t;

            public a(Object obj, w23 w23Var) {
                this.s = obj;
                this.t = w23Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = (b) this.s;
                this.t.o().setVisibility(4);
                this.t.o().bringToFront();
            }
        }

        /* renamed from: com.p7700g.p99005.w23$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class RunnableC0263b implements Runnable {
            public final /* synthetic */ Object s;
            public final /* synthetic */ w23 t;

            public RunnableC0263b(Object obj, w23 w23Var) {
                this.s = obj;
                this.t = w23Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = (b) this.s;
                this.t.o().bringToFront();
                this.t.o().setVisibility(0);
            }
        }

        public b() {
        }

        @Override // com.p7700g.p99005.f73.b
        public void a() {
            w23.this.a().a();
        }

        @Override // com.p7700g.p99005.f73.b
        public void b() {
            w23 w23Var = w23.this;
            if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                w23Var.o().setVisibility(4);
                w23Var.o().bringToFront();
                return;
            }
            new Handler(Looper.getMainLooper()).post(new a(this, w23Var));
        }

        @Override // com.p7700g.p99005.f73.b
        public void c() {
            w23 w23Var = w23.this;
            if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                w23Var.o().bringToFront();
                w23Var.o().setVisibility(0);
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0263b(this, w23Var));
        }

        @Override // com.p7700g.p99005.f73.b
        public void d() {
            w23.this.o.set(false);
        }

        @Override // com.p7700g.p99005.f73.b
        public void e() {
            w23.this.o.set(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w23(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.l = yb3Var;
        this.o = new AtomicBoolean(true);
        this.p = new b();
    }

    @Override // com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.l;
    }

    @Override // com.p7700g.p99005.s23
    public void c(@Nullable Bundle bundle) {
        String c;
        String c2;
        super.c(bundle);
        if (a().e(bundle)) {
            a().a();
            return;
        }
        u23 b2 = t23.a.a().b();
        this.n = b2;
        String str = "";
        if (b2 != null) {
            n03 c3 = a().c();
            if (c3 == null || (c2 = c3.c()) == null) {
                c2 = "";
            }
            b2.setUnitID(c2);
        }
        if (this.n == null) {
            xz2.c(i, "[ERROR] UiiWebView not available. So closing");
            a().a();
            return;
        }
        Context context = a().getContext();
        n03 c4 = a().c();
        if (c4 != null && (c = c4.c()) != null) {
            str = c;
        }
        u23 u23Var = this.n;
        c25.m(u23Var);
        v23 v23Var = new v23(context, str, u23Var);
        this.m = v23Var;
        if (v23Var != null) {
            v23Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            v23 v23Var2 = this.m;
            if (v23Var2 != null) {
                v23Var2.setWebInterfaceListener(this.p);
                v23 v23Var3 = this.m;
                if (v23Var3 != null) {
                    my2.c(v23Var3);
                    GGParentViewGroup n = n();
                    v23 v23Var4 = this.m;
                    if (v23Var4 != null) {
                        n.addView(v23Var4);
                        return;
                    } else {
                        c25.S("webFrame");
                        throw null;
                    }
                }
                c25.S("webFrame");
                throw null;
            }
            c25.S("webFrame");
            throw null;
        }
        c25.S("webFrame");
        throw null;
    }

    @Override // com.p7700g.p99005.s23
    public void h(boolean z) {
        j = n().getHeight();
        k = n().getWidth();
    }

    @Override // com.p7700g.p99005.s23
    public void k() {
        u23 u23Var = this.n;
        if (u23Var == null) {
            return;
        }
        u23Var.loadUrl("javascript:sdk_pause()");
    }

    @Override // com.p7700g.p99005.s23
    public void l() {
        super.l();
        u23 u23Var = this.n;
        if (u23Var == null) {
            return;
        }
        u23Var.loadUrl("javascript:sdk_resume()");
    }

    @Override // com.p7700g.p99005.s23
    public void m() {
        if (a().b()) {
            return;
        }
        u23 u23Var = this.n;
        if (u23Var != null) {
            u23Var.loadUrl("javascript:sdk_close()");
        }
        v23 v23Var = this.m;
        if (v23Var != null) {
            v23Var.a();
        } else {
            c25.S("webFrame");
            throw null;
        }
    }
}