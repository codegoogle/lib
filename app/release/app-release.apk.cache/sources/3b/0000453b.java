package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* compiled from: ImageViewCompat.java */
/* loaded from: classes.dex */
public class gt {

    /* compiled from: ImageViewCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @e1
        public static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @e1
        public static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @e1
        public static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private gt() {
    }

    @z1
    public static ColorStateList a(@x1 ImageView imageView) {
        return a.a(imageView);
    }

    @z1
    public static PorterDuff.Mode b(@x1 ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@x1 ImageView imageView, @z1 ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        a.c(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || a.a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    public static void d(@x1 ImageView imageView, @z1 PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        a.d(imageView, mode);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || a.a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}