package com.anythink.expressad.foundation.h;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class x {
    private static final String a = "ViewUtils";
    private static boolean b = false;

    public static boolean a(View view) {
        if (view.getVisibility() != 0) {
            n.d(a, "Banner Judge : Banner's not visible.");
            return true;
        } else if (view.getAlpha() < 0.5f) {
            n.d(a, "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        } else if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            n.d(a, "View Judge : View's container is not visible.");
            return true;
        } else {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = (rect.right - rect.left) * (rect.bottom - rect.top) >= (view.getMeasuredWidth() * view.getMeasuredHeight()) / 2;
            boolean z2 = globalVisibleRect && z;
            n.d(a, "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z);
            n.d(a, "View Judge : totalViewVisible is ".concat(String.valueOf(z2)));
            if (z2) {
                ViewGroup viewGroup = view;
                while (viewGroup.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                    for (int a2 = a(viewGroup, viewGroup2) + 1; a2 < viewGroup2.getChildCount(); a2++) {
                        View childAt = viewGroup2.getChildAt(a2);
                        if (childAt.getVisibility() == 0 && a(view, childAt)) {
                            if (childAt instanceof ViewGroup) {
                                ViewGroup viewGroup3 = (ViewGroup) childAt;
                                if (viewGroup3.getChildCount() > 0) {
                                    n.d(a, "View Judge : Covered by ViewGroup.");
                                    boolean b2 = b(view, viewGroup3);
                                    b = false;
                                    if (b2) {
                                        return true;
                                    }
                                }
                            }
                            if (b(childAt)) {
                                n.d(a, "View Judge : View Covered and Cover View is not transparent.");
                                return true;
                            }
                        }
                    }
                    viewGroup = viewGroup2;
                }
                n.d(a, "View Judge : Well done, View is not covered.");
                return false;
            }
            return true;
        }
    }

    private static boolean b(View view) {
        return view.getAlpha() > 0.5f && view.getBackground() != null && view.getBackground().getAlpha() > 127;
    }

    private static boolean b(View view, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            n.d(a, "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && a(view, childAt)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    n.d(a, "View Judge : View Covered by WebView.");
                    b = true;
                }
                if (b(childAt)) {
                    n.d(a, "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    b = true;
                }
                if (b) {
                    break;
                } else if (childAt instanceof ViewGroup) {
                    b(view, (ViewGroup) childAt);
                }
            }
        }
        return b;
    }

    private static boolean a(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (Rect.intersects(rect, rect2)) {
            return ((Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)) * (Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left))) * 2 >= view.getMeasuredWidth() * view.getMeasuredHeight();
        }
        return false;
    }

    private static int a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }
}