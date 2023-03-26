package com.greedygame.core.mediation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.AppCompatButton;
import com.p7700g.p99005.ac3;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.cz2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class GGButton extends AppCompatButton {
    @Nullable
    private AttributeSet s;
    private int t;
    private float u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGButton(@NotNull Context context) {
        super(context);
        c25.p(context, "context");
        a();
    }

    public final void a() {
        Resources resources;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.s, b03.n.nc, this.t, 0);
        c25.o(obtainStyledAttributes, "context.obtainStyledAttributes(\n            mAttrs, R.styleable.GGButton, mDefStyleRes, 0\n        )");
        int dimension = (int) obtainStyledAttributes.getDimension(b03.n.oc, 0.0f);
        Context context = getContext();
        DisplayMetrics displayMetrics = null;
        if (context != null && (resources = context.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        this.u = ac3.a(dimension, displayMetrics);
        obtainStyledAttributes.recycle();
        setBackground(0);
        Context context2 = getContext();
        c25.o(context2, "context");
        int a = cz2.a(20, context2);
        Context context3 = getContext();
        c25.o(context3, "context");
        int a2 = cz2.a(12, context3);
        Context context4 = getContext();
        c25.o(context4, "context");
        int a3 = cz2.a(20, context4);
        Context context5 = getContext();
        c25.o(context5, "context");
        setPadding(a, a2, a3, cz2.a(12, context5));
        setTextAlignment(4);
    }

    @Nullable
    public final AttributeSet getMAttrs() {
        return this.s;
    }

    public final float getMBorderRadius() {
        return this.u;
    }

    public final int getMDefStyleRes() {
        return this.t;
    }

    public final void setBackground(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getMBorderRadius());
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
    }

    public final void setMAttrs(@Nullable AttributeSet attributeSet) {
        this.s = attributeSet;
    }

    public final void setMDefStyleRes(int i) {
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGButton(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        this.s = attributeSet;
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGButton(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        this.s = attributeSet;
        this.t = i;
        a();
    }
}