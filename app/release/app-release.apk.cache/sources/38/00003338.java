package com.greedygame.core.uii;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.greedygame.core.uii.GGParentViewGroup;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.uz4;
import com.p7700g.p99005.yq4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class GGParentViewGroup extends ConstraintLayout {
    @NotNull
    public static final a x0 = new a(null);
    private static final String y0 = GGParentViewGroup.class.getSimpleName();
    @Nullable
    private uz4<yq4> A0;
    private float B0;
    private float C0;
    private final int D0;
    @Nullable
    private uz4<yq4> z0;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGParentViewGroup(@NotNull Context context) {
        super(context);
        c25.p(context, "context");
        this.D0 = 200;
        C();
    }

    public static final void D(GGParentViewGroup gGParentViewGroup, View view) {
        c25.p(gGParentViewGroup, "this$0");
        uz4<yq4> uz4Var = gGParentViewGroup.A0;
        if (uz4Var == null) {
            return;
        }
        uz4Var.x();
    }

    public static /* synthetic */ void E(GGParentViewGroup gGParentViewGroup, View view) {
        D(gGParentViewGroup, view);
    }

    public final void C() {
        setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.p23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GGParentViewGroup.E(GGParentViewGroup.this, view);
            }
        });
    }

    public final int getCLICK_ACTION_THRESHOLD() {
        return this.D0;
    }

    public final float getStartX() {
        return this.B0;
    }

    public final float getStartY() {
        return this.C0;
    }

    public final void setDebugSwipeCallback(@NotNull uz4<yq4> uz4Var) {
        c25.p(uz4Var, "onTouch");
        this.z0 = uz4Var;
    }

    public final void setOnTouchCallback(@NotNull uz4<yq4> uz4Var) {
        c25.p(uz4Var, "onTouch");
        this.A0 = uz4Var;
    }

    public final void setStartX(float f) {
        this.B0 = f;
    }

    public final void setStartY(float f) {
        this.C0 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGParentViewGroup(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        this.D0 = 200;
        C();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGParentViewGroup(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        this.D0 = 200;
        C();
    }
}