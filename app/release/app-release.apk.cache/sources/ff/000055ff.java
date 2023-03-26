package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.greedygame.mystique2.models.NativeAdViewTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pd3 implements ld3, nd3 {
    @Override // com.p7700g.p99005.ld3
    @Nullable
    public ViewGroup a(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                Object tag = childAt.getTag();
                NativeAdViewTypes nativeAdViewTypes = NativeAdViewTypes.MEDIA_VIEW;
                if (c25.g(tag, nativeAdViewTypes.getValue())) {
                    FrameLayout frameLayout = (FrameLayout) childAt;
                    Context context = viewGroup.getContext();
                    c25.o(context, "view.context");
                    w33 w33Var = new w33(context, null, 0, 6, null);
                    ImageView imageView = new ImageView(viewGroup.getContext());
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    frameLayout.setTag(nativeAdViewTypes.getValue());
                    frameLayout.addView(imageView, layoutParams);
                    frameLayout.addView(w33Var, layoutParams);
                    break;
                } else if (i2 >= childCount) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return new FrameLayout(viewGroup.getContext());
    }

    @Override // com.p7700g.p99005.nd3
    @Nullable
    public ViewGroup b(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        return new FrameLayout(viewGroup.getContext());
    }
}