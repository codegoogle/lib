package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.f73;
import com.p7700g.p99005.u23;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class v23 extends FrameLayout {
    @NotNull
    public static final b s = new b(null);
    @NotNull
    private final String t;
    @NotNull
    private final u23 u;
    private ProgressBar v;

    /* loaded from: classes3.dex */
    public static final class a extends e25 implements uz4<yq4> {
        public a() {
            super(0);
        }

        public final void a() {
            v23.this.c();
        }

        @Override // com.p7700g.p99005.uz4
        public /* synthetic */ yq4 x() {
            a();
            return yq4.a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v23(@NotNull Context context, @NotNull String str, @NotNull u23 u23Var) {
        super(context);
        c25.p(context, "context");
        c25.p(str, "unitId");
        c25.p(u23Var, "uiiWebView");
        this.t = str;
        this.u = u23Var;
        u23Var.setAlreadyClicked$com_greedygame_sdkx_core(false);
        u23Var.setPageLoadListener$com_greedygame_sdkx_core(new a());
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.u.getState$com_greedygame_sdkx_core() == u23.b.LOADED) {
            this.u.setVisibility(0);
            ProgressBar progressBar = this.v;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                u23 u23Var = this.u;
                StringBuilder G = wo1.G("javascript:sdk_open(\"");
                G.append(this.t);
                G.append("\")");
                u23Var.loadUrl(G.toString());
                xz2.c("WebFrme", "Engagement Window gg_open JS hook called. LoaderView has been hidden");
                return;
            }
            c25.S("loadingProgress");
            throw null;
        }
    }

    private final void d() {
        f();
        g();
        c();
    }

    private final void e() {
        this.u.a();
    }

    private final void f() {
        this.u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        my2.b(this.u, this, null, 4, null);
    }

    private final void g() {
        ProgressBar progressBar = new ProgressBar(getContext(), null, 16842874);
        this.v = progressBar;
        if (progressBar != null) {
            progressBar.setIndeterminate(true);
            int dimensionPixelSize = getResources().getDimensionPixelSize(b03.f.S0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 17;
            View view = this.v;
            if (view != null) {
                addView(view, layoutParams);
                return;
            } else {
                c25.S("loadingProgress");
                throw null;
            }
        }
        c25.S("loadingProgress");
        throw null;
    }

    public final void a() {
        removeView(this.u);
        e();
    }

    public final void setWebInterfaceListener(@NotNull f73.b bVar) {
        c25.p(bVar, "webInterfaceListener");
        this.u.setWebInterfaceListener$com_greedygame_sdkx_core(bVar);
    }
}