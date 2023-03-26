package com.p7700g.p99005;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.p7700g.p99005.gy5;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: GifViewUtils.java */
/* loaded from: classes4.dex */
public final class ay5 {
    public static final String a = "http://schemas.android.com/apk/res/android";
    public static final List<String> b = Arrays.asList("raw", com.anythink.expressad.foundation.h.h.c, "mipmap");

    private ay5() {
    }

    public static void a(int i, Drawable drawable) {
        if (drawable instanceof ox5) {
            ((ox5) drawable).I(i);
        }
    }

    public static float b(@x1 Resources resources, @f1 @d2 int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = 160;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        if (i2 <= 0 || i3 <= 0) {
            return 1.0f;
        }
        return i3 / i2;
    }

    public static a c(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null && !imageView.isInEditMode()) {
            a aVar = new a(imageView, attributeSet, i, i2);
            int i3 = aVar.b;
            if (i3 >= 0) {
                a(i3, imageView.getDrawable());
                a(i3, imageView.getBackground());
            }
            return aVar;
        }
        return new a();
    }

    public static boolean d(ImageView imageView, Uri uri) {
        if (uri != null) {
            try {
                imageView.setImageDrawable(new ox5(imageView.getContext().getContentResolver(), uri));
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean e(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (b.contains(resources.getResourceTypeName(i))) {
                    ox5 ox5Var = new ox5(resources, i);
                    if (z) {
                        imageView.setImageDrawable(ox5Var);
                        return true;
                    }
                    imageView.setBackground(ox5Var);
                    return true;
                }
                return false;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }

    /* compiled from: GifViewUtils.java */
    /* loaded from: classes4.dex */
    public static class a extends b {
        public final int c;
        public final int d;

        public a(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
            super(imageView, attributeSet, i, i2);
            this.c = a(imageView, attributeSet, true);
            this.d = a(imageView, attributeSet, false);
        }

        private static int a(ImageView imageView, AttributeSet attributeSet, boolean z) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(ay5.a, z ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (ay5.b.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !ay5.e(imageView, z, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }

        public a() {
            this.c = 0;
            this.d = 0;
        }
    }

    /* compiled from: GifViewUtils.java */
    /* loaded from: classes4.dex */
    public static class b {
        public boolean a;
        public final int b;

        public b(View view, AttributeSet attributeSet, int i, int i2) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, gy5.b.d, i, i2);
            this.a = obtainStyledAttributes.getBoolean(gy5.b.e, false);
            this.b = obtainStyledAttributes.getInt(gy5.b.f, -1);
            obtainStyledAttributes.recycle();
        }

        public b() {
            this.a = false;
            this.b = -1;
        }
    }
}