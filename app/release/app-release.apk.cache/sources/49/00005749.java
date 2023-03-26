package com.p7700g.p99005;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.GGParentViewGroup;
import com.p7700g.p99005.b03;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class q13 extends s23 {
    @NotNull
    public static final a h = new a(null);
    @NotNull
    private final yb3 i;
    @NotNull
    private final gc3 j;
    @Nullable
    private n13<?> k;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q13(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.i = yb3Var;
        this.j = gc3.s.a();
    }

    private final void A() {
        x();
        Activity f = a().f();
        int i = b03.h.W1;
        View findViewById = f.findViewById(i);
        c25.o(findViewById, "baseView.activity.findViewById(R.id.gg_container)");
        t(findViewById);
        GGParentViewGroup gGParentViewGroup = (GGParentViewGroup) a().f().findViewById(i);
        if (gGParentViewGroup == null) {
            return;
        }
        gGParentViewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.j13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q13.z(q13.this, view);
            }
        });
    }

    public static final void v(q13 q13Var, View view) {
        c25.p(q13Var, "this$0");
        q13Var.w(true);
    }

    public static /* synthetic */ void z(q13 q13Var, View view) {
        v(q13Var, view);
    }

    @Override // com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.i;
    }

    @Override // com.p7700g.p99005.s23
    public void b(@NotNull Configuration configuration) {
        c25.p(configuration, "newConfig");
        if (this.k != null) {
            A();
        } else {
            a().a();
        }
    }

    @Override // com.p7700g.p99005.s23
    public void c(@Nullable Bundle bundle) {
        super.c(bundle);
        Ad p = p();
        yq4 yq4Var = null;
        if (p != null) {
            f83 a2 = this.j.a(p);
            u(a2 != null ? a2.a() : null);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            a().a();
        }
        A();
    }

    public void t(@NotNull View view) {
        c25.p(view, com.anythink.expressad.a.B);
    }

    public final void u(@Nullable n13<?> n13Var) {
        this.k = n13Var;
    }

    public void w(boolean z) {
        Ad p = p();
        if (p != null) {
            p.k();
        }
        Ad p2 = p();
        if (p2 == null) {
            return;
        }
        p2.l();
    }

    public abstract void x();

    @Nullable
    public final n13<?> y() {
        return this.k;
    }
}