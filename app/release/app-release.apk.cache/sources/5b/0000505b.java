package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.greedygame.mystique2.models.FacebookAdViewTypes;
import com.greedygame.mystique2.models.NativeAdViewTypes;
import com.greedygame.mystique2.models.Template;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class md3 implements ld3, nd3 {
    @Nullable
    private final Template c;

    public md3() {
        this(null, 1, null);
    }

    public md3(@Nullable Template template) {
        this.c = template;
    }

    @Override // com.p7700g.p99005.ld3
    @Nullable
    public ViewGroup a(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        NativeAdLayout nativeAdLayout = new NativeAdLayout(viewGroup.getContext());
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (c25.g(childAt.getTag(), NativeAdViewTypes.MEDIA_VIEW.getValue())) {
                    MediaView mediaView = new MediaView(viewGroup.getContext());
                    mediaView.setTag(FacebookAdViewTypes.MEDIA_VIEW.getString());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    ((ViewGroup) childAt).addView(mediaView, layoutParams);
                }
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        return nativeAdLayout;
    }

    @Override // com.p7700g.p99005.nd3
    @NotNull
    public ViewGroup b(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        return new NativeAdLayout(viewGroup.getContext());
    }

    public /* synthetic */ md3(Template template, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : template);
    }
}