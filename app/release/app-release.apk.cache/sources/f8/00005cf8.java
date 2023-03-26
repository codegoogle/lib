package com.p7700g.p99005;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.p7700g.p99005.ay5;

/* compiled from: GifImageButton.java */
/* loaded from: classes4.dex */
public class sx5 extends ImageButton {
    private boolean s;

    public sx5(Context context) {
        super(context);
    }

    private void a(ay5.a aVar) {
        this.s = aVar.a;
        int i = aVar.c;
        if (i > 0) {
            super.setImageResource(i);
        }
        int i2 = aVar.d;
        if (i2 > 0) {
            super.setBackgroundResource(i2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof zx5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zx5 zx5Var = (zx5) parcelable;
        super.onRestoreInstanceState(zx5Var.getSuperState());
        zx5Var.c(getDrawable(), 0);
        zx5Var.c(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new zx5(super.onSaveInstanceState(), this.s ? getDrawable() : null, this.s ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (ay5.e(this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    public void setFreezesAnimation(boolean z) {
        this.s = z;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (ay5.e(this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (ay5.d(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }

    public sx5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(ay5.c(this, attributeSet, 0, 0));
    }

    public sx5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(ay5.c(this, attributeSet, i, 0));
    }

    @e2(21)
    public sx5(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(ay5.c(this, attributeSet, i, i2));
    }
}