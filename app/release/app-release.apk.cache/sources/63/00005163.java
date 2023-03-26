package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewHelper.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0006R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/p7700g/p99005/my2;", "", "Landroid/view/View;", com.anythink.expressad.a.B, "Lcom/p7700g/p99005/yq4;", "c", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/ViewGroup$LayoutParams;", "lp", "a", "(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup$LayoutParams;)V", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "sNextGeneratedId", "", "b", "Ljava/lang/String;", "TAG", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class my2 {
    @NotNull
    private static final String b = "ViewHelper";
    @NotNull
    public static final my2 a = new my2();
    @NotNull
    private static final AtomicInteger c = new AtomicInteger(1);

    private my2() {
    }

    @jz4
    public static final void a(@Nullable View view, @Nullable ViewGroup viewGroup, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (view != null && viewGroup != null) {
            d(view);
            if (layoutParams == null) {
                viewGroup.addView(view);
                return;
            } else {
                viewGroup.addView(view, layoutParams);
                return;
            }
        }
        xz2.c(b, "[ERROR] Trying to add null view object or with null parent object");
    }

    public static /* synthetic */ void b(View view, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        a(view, viewGroup, layoutParams);
    }

    @jz4
    public static final void c(@Nullable View view) {
        if (view != null) {
            view.setId(View.generateViewId());
        }
    }

    @jz4
    public static final void d(@Nullable View view) {
        if (view == null) {
            xz2.c(b, "[ERROR] Trying to remove parent for a null view object");
        } else if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            xz2.c(b, "View Already registered with another parent. Auto unregistering");
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
    }
}