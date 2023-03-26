package com.p7700g.p99005;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.GGParentViewGroup;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.f83;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class s23 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "GGBseAc";
    @NotNull
    private static final String c = "engagement_url";
    @NotNull
    private final yb3 d;
    public GGParentViewGroup e;
    public ImageView f;
    @Nullable
    private Ad g;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public s23(@NotNull yb3 yb3Var) {
        c25.p(yb3Var, "baseView");
        this.d = yb3Var;
    }

    public static final void f(s23 s23Var, View view) {
        c25.p(s23Var, "this$0");
        s23Var.a().a();
    }

    public static /* synthetic */ void s(s23 s23Var, View view) {
        f(s23Var, view);
    }

    @NotNull
    public yb3 a() {
        return this.d;
    }

    public void b(@NotNull Configuration configuration) {
        c25.p(configuration, "newConfig");
    }

    public void c(@Nullable Bundle bundle) {
        String c2;
        this.g = a().d();
        f83.b bVar = f83.a;
        n03 c3 = a().c();
        String str = "";
        if (c3 != null && (c2 = c3.c()) != null) {
            str = c2;
        }
        bVar.c(str);
        a().f().setContentView(b03.k.a0);
        a().f().getWindow().setLayout(-1, -1);
        View findViewById = a().f().findViewById(b03.h.W1);
        c25.o(findViewById, "baseView.activity.findViewById(R.id.gg_container)");
        e((GGParentViewGroup) findViewById);
        View findViewById2 = a().f().findViewById(b03.h.Z0);
        c25.o(findViewById2, "baseView.activity.findViewById(R.id.close)");
        d((ImageView) findViewById2);
        o().setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.q23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s23.s(s23.this, view);
            }
        });
    }

    public final void d(@NotNull ImageView imageView) {
        c25.p(imageView, "<set-?>");
        this.f = imageView;
    }

    public final void e(@NotNull GGParentViewGroup gGParentViewGroup) {
        c25.p(gGParentViewGroup, "<set-?>");
        this.e = gGParentViewGroup;
    }

    public void g(@NotNull Bundle bundle) {
        c25.p(bundle, "outState");
    }

    public void h(boolean z) {
    }

    public void i() {
    }

    public void j(@Nullable Bundle bundle) {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
        f83.a.c("");
    }

    @NotNull
    public final GGParentViewGroup n() {
        GGParentViewGroup gGParentViewGroup = this.e;
        if (gGParentViewGroup != null) {
            return gGParentViewGroup;
        }
        c25.S("container");
        throw null;
    }

    @NotNull
    public final ImageView o() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView;
        }
        c25.S(com.anythink.expressad.foundation.d.c.cd);
        throw null;
    }

    @Nullable
    public final Ad p() {
        return this.g;
    }

    public void q() {
    }

    public void r() {
    }
}