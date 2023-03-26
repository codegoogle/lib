package com.p7700g.p99005;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.p7700g.p99005.zg3;

/* compiled from: Sdk_Native.java */
/* loaded from: classes3.dex */
public class gg3 {
    public static final String a = "Sdk_Native";

    public static void a(Activity mactivity) {
    }

    public static void b(Activity mactivity) {
    }

    public static void c(Activity mactivity) {
    }

    public static void d(Activity mactivity) {
    }

    public static void e(Activity mactivity) {
    }

    public static void f(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (yg3.e(bh3.f).equals("1")) {
            h(activity, viewGroup, null, nativeType, direction);
        } else if (direction.equals(bh3.b1)) {
            l(activity, viewGroup, null, nativeType, direction);
        }
    }

    public static void g(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        k(activity, viewGroup, null, nativeType, direction);
    }

    private static void h(Activity activity, ViewGroup viewGroup, String bannerBottom, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            hg3.b(activity, viewGroup, null, nativeType, direction);
        } catch (Exception e) {
            viewGroup.setVisibility(8);
            e.toString();
            e.printStackTrace();
        }
    }

    private static void i(Activity activity, ViewGroup viewGroup, String bannerTop, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            hg3.e(activity, viewGroup, null, nativeType, direction);
        } catch (Exception e) {
            viewGroup.setVisibility(8);
            e.toString();
            e.printStackTrace();
        }
    }

    private static void j(Activity activity, ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.Q, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            hg3.e(activity, viewGroup, null, nativeType, direction);
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    private static void k(Activity activity, ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (yg3.e(bh3.E0).equals("1")) {
                hg3.d(activity, viewGroup, null, nativeType, direction);
            } else if (direction.equals(bh3.a1)) {
                hg3.d(activity, viewGroup, null, nativeType, direction);
            } else if (direction.equals(bh3.b1)) {
                hg3.c(activity, viewGroup, null, nativeType, direction);
            }
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    private static void l(Activity activity, ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (yg3.e(bh3.G0).equals("1")) {
                hg3.b(activity, viewGroup, null, nativeType, direction);
            } else {
                hg3.b(activity, viewGroup, null, nativeType, direction);
            }
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    private static void m(Activity activity, ViewGroup viewGroup, String nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (yg3.e(bh3.F0).equals("1")) {
                hg3.e(activity, viewGroup, null, nativeType, direction);
            } else {
                hg3.e(activity, viewGroup, null, nativeType, direction);
            }
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    public static void n(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeType.equals(bh3.W0)) {
            j(activity, viewGroup, null, nativeType, direction);
            e(activity);
        } else if (direction.equals(bh3.a1)) {
            if (yg3.e(bh3.e).equals("1")) {
                i(activity, viewGroup, null, nativeType, direction);
                b(activity);
                return;
            }
            m(activity, viewGroup, null, nativeType, direction);
            e(activity);
        }
    }
}