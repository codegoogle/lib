package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: NoEndIconDelegate.java */
/* loaded from: classes3.dex */
public class vi2 extends ri2 {
    public vi2(@x1 TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    @Override // com.p7700g.p99005.ri2
    public void a() {
        this.a.setEndIconOnClickListener(null);
        this.a.setEndIconDrawable((Drawable) null);
        this.a.setEndIconContentDescription((CharSequence) null);
    }
}