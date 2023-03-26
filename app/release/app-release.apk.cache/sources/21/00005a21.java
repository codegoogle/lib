package com.p7700g.p99005;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes3.dex */
public abstract class ri2 {
    public TextInputLayout a;
    public Context b;
    public CheckableImageButton c;
    @f1
    public final int d;

    public ri2(@x1 TextInputLayout textInputLayout, @f1 int i) {
        this.a = textInputLayout;
        this.b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
        this.d = i;
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }

    public boolean d() {
        return false;
    }
}