package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
public final class pk extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    public pk(@z1 pk pkVar) {
        this.c = null;
        this.d = nk.s;
        if (pkVar != null) {
            this.a = pkVar.a;
            this.b = pkVar.b;
            this.c = pkVar.c;
            this.d = pkVar.d;
        }
    }

    public boolean a() {
        return this.b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @x1
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @x1
    public Drawable newDrawable(@z1 Resources resources) {
        return new ok(this, resources);
    }
}