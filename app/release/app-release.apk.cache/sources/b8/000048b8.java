package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: RoundedBitmapDrawable21.java */
@e2(21)
/* loaded from: classes.dex */
public class ik extends jk {
    public ik(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // com.p7700g.p99005.jk
    public void f(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@x1 Outline outline) {
        t();
        outline.setRoundRect(this.i, c());
    }

    @Override // com.p7700g.p99005.jk
    public boolean h() {
        Bitmap bitmap = this.b;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // com.p7700g.p99005.jk
    public void o(boolean z) {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}