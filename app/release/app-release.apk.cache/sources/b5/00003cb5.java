package com.p7700g.p99005;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.p7700g.p99005.zg3;

/* compiled from: Qureka_Native.java */
/* loaded from: classes3.dex */
public class cg3 {
    public static final String a = "Qureka_Native";

    public static void a(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (yg3.e(bh3.f).equals("1")) {
            c(activity, viewGroup, nativeType, direction);
        } else if (direction.equals(bh3.b1)) {
            g(activity, viewGroup, nativeType, direction);
        }
    }

    public static void b(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        f(activity, viewGroup, nativeType, direction);
    }

    private static void c(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            dg3.o(activity, viewGroup);
        } catch (Exception e) {
            viewGroup.setVisibility(8);
            e.toString();
            e.printStackTrace();
        }
    }

    private static void d(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            dg3.o(activity, viewGroup);
        } catch (Exception e) {
            viewGroup.setVisibility(8);
            e.toString();
            e.printStackTrace();
        }
    }

    private static void e(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.Q, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            dg3.p(activity, viewGroup, nativeType, direction);
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    private static void f(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (yg3.e(bh3.E0).equals("1")) {
                dg3.m(activity, viewGroup, nativeType, direction);
            } else if (direction.equals(bh3.a1)) {
                dg3.i(activity, viewGroup, nativeType, direction);
            } else if (direction.equals(bh3.b1)) {
                dg3.k(activity, viewGroup, nativeType, direction);
            }
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    private static void g(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (yg3.e(bh3.G0).equals("1")) {
                dg3.n(activity, viewGroup, nativeType, direction);
            } else if (yg3.e(bh3.G0).equals("2")) {
                dg3.j(activity, viewGroup, nativeType, direction);
            } else {
                dg3.i(activity, viewGroup, nativeType, direction);
            }
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    private static void h(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (yg3.e(bh3.F0).equals("1")) {
                dg3.m(activity, viewGroup, nativeType, direction);
            } else if (yg3.e(bh3.F0).equals("2")) {
                dg3.l(activity, viewGroup, nativeType, direction);
            } else {
                dg3.k(activity, viewGroup, nativeType, direction);
            }
        } catch (Exception e) {
            e.toString();
            e.printStackTrace();
        }
    }

    public static void i(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeType.equals(bh3.W0)) {
            e(activity, viewGroup, nativeType, direction);
        } else if (direction.equals(bh3.a1)) {
            if (yg3.e(bh3.e).equals("1")) {
                d(activity, viewGroup, nativeType, direction);
            } else {
                h(activity, viewGroup, nativeType, direction);
            }
        }
    }
}