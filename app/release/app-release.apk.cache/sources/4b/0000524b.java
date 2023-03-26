package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.superapp.filemanager.R;

/* compiled from: AnimationObject.java */
/* loaded from: classes.dex */
public class ng0 {

    /* compiled from: AnimationObject.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[6];
            a = iArr;
            try {
                iArr[b.slide_in_left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.slide_out_right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.fade_in.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.fade_out.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.right_to_left.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.none.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: AnimationObject.java */
    /* loaded from: classes.dex */
    public enum b {
        slide_in_left,
        slide_out_right,
        fade_in,
        fade_out,
        right_to_left,
        none
    }

    public static void a(Context context, View viewToAnimate, b animationType) {
        int ordinal = animationType.ordinal();
        Animation animation = null;
        if (ordinal == 0) {
            animation = AnimationUtils.loadAnimation(context, 17432578);
        } else if (ordinal == 1) {
            animation = AnimationUtils.loadAnimation(context, 17432579);
        } else if (ordinal == 2) {
            animation = AnimationUtils.loadAnimation(context, 17432576);
        } else if (ordinal == 3) {
            animation = AnimationUtils.loadAnimation(context, 17432577);
        } else if (ordinal == 4) {
            animation = AnimationUtils.loadAnimation(context, R.anim.right_to_left);
        }
        if (animation != null) {
            animation.setDuration(1500L);
            viewToAnimate.startAnimation(animation);
        }
    }
}