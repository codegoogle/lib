package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import com.p7700g.p99005.f73;
import com.p7700g.p99005.x23;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"NewApi", "SetJavaScriptEnabled", "ViewConstructor"})
/* loaded from: classes3.dex */
public final class u23 extends WebView implements View.OnTouchListener, x23.b {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private static final String t = "UiWView";
    private int A;
    private x23 B;
    private float C;
    private float D;
    private float E;
    private float F;
    @Nullable
    private c G;
    private int H;
    @Nullable
    private final f73 u;
    private long v;
    @Nullable
    private b w;
    @NotNull
    private final AtomicBoolean x;
    @Nullable
    private uz4<yq4> y;
    @Nullable
    private String z;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        NOT_STARTED,
        LOADING,
        LOADED
    }

    /* loaded from: classes3.dex */
    public enum c {
        RIGHT,
        LEFT
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public final /* synthetic */ Object s;

        public d(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(((u23) this.s).getContext().getApplicationContext(), "Debug enabled", 0).show();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ Object s;

        public e(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(((u23) this.s).getContext().getApplicationContext(), "Debug already enabled", 0).show();
        }
    }

    private final void b(MotionEvent motionEvent) {
        this.C = motionEvent.getX();
        this.D = motionEvent.getY();
    }

    private final void c() {
        int i = this.H;
        if (i >= 6) {
            c25.C("Debug swipe detected with counter: ", Integer.valueOf(i));
            if (!xz2.e) {
                if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                    Toast.makeText(getContext().getApplicationContext(), "Debug enabled", 0).show();
                } else {
                    new Handler(Looper.getMainLooper()).post(new d(this));
                }
            } else if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                Toast.makeText(getContext().getApplicationContext(), "Debug already enabled", 0).show();
            } else {
                new Handler(Looper.getMainLooper()).post(new e(this));
            }
        } else {
            c25.C("Not enough swipe detected with counter : ", Integer.valueOf(i));
        }
        this.H = 0;
        this.G = null;
    }

    private final void d(MotionEvent motionEvent) {
        this.E = motionEvent.getX();
        this.F = motionEvent.getY();
        boolean z = Math.abs(this.E - this.C) > ((float) ((getWidth() * 60) / 100));
        c cVar = this.G;
        if (z) {
            float f = this.E;
            float f2 = this.C;
            boolean z2 = f > f2;
            boolean z3 = f < f2;
            if (z2) {
                this.G = c.RIGHT;
                this.C = f;
            } else if (z3) {
                this.G = c.LEFT;
                this.C = f;
            }
            if (cVar != this.G) {
                this.H++;
            }
        }
    }

    public final void a() {
        f73 f73Var = this.u;
        c25.m(f73Var);
        f73Var.a();
    }

    @Nullable
    public final b getState$com_greedygame_sdkx_core() {
        return this.w;
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String str) {
        c25.p(str, "url");
        super.loadUrl(str);
        xz2.c(t, c25.C("Loading url: ", str));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View view, @Nullable MotionEvent motionEvent) {
        String str = t;
        xz2.c(str, "Uii Web Touch");
        Integer valueOf = motionEvent == null ? null : Integer.valueOf(motionEvent.getAction());
        if (valueOf != null && valueOf.intValue() == 0) {
            b(motionEvent);
            this.v = Calendar.getInstance().getTimeInMillis();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            c();
            if (Calendar.getInstance().getTimeInMillis() - this.v < 200 && !this.x.get()) {
                String str2 = this.z;
                c25.m(str2);
                xz2.c(str, c25.C("WebView ggadclick in unitId: ", str2));
                this.x.set(true);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            d(motionEvent);
        }
        return false;
    }

    public final void setAlreadyClicked$com_greedygame_sdkx_core(boolean z) {
        this.x.set(z);
    }

    public final void setPageLoadListener$com_greedygame_sdkx_core(@NotNull uz4<yq4> uz4Var) {
        c25.p(uz4Var, "pageLoaded");
        this.y = uz4Var;
    }

    public final void setUnitID(@NotNull String str) {
        c25.p(str, "unitID");
        this.z = str;
        x23 x23Var = this.B;
        if (x23Var != null) {
            x23Var.a(str);
            f73 f73Var = this.u;
            c25.m(f73Var);
            f73Var.c(str);
            return;
        }
        c25.S("ggWebClient");
        throw null;
    }

    public final void setWebInterfaceListener$com_greedygame_sdkx_core(@NotNull f73.b bVar) {
        c25.p(bVar, "webInterfaceListener");
        f73 f73Var = this.u;
        c25.m(f73Var);
        f73Var.b(bVar);
    }

    @Override // com.p7700g.p99005.x23.b
    public void a(int i) {
        xz2.c(t, "Status code updated in WebView");
        this.A = i;
    }
}