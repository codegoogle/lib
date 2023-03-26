package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.anythink.core.common.j.r;
import com.anythink.core.common.ui.component.RoundImageView;

/* loaded from: classes2.dex */
public class WrapRoundImageView extends RoundImageView {
    public WrapRoundImageView(Context context) {
        super(context);
    }

    public int[] setBitmapAndResize(Bitmap bitmap, int i, int i2) {
        setImageBitmap(bitmap);
        if (i > 0 && i2 > 0) {
            try {
                int[] a = r.a(i, i2, bitmap.getWidth() / bitmap.getHeight());
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = a[0];
                    layoutParams.height = a[1];
                    setLayoutParams(layoutParams);
                    return a;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public WrapRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}