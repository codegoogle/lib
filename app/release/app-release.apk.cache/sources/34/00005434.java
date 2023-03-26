package com.p7700g.p99005;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.greedygame.mystique2.models.Template;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class od3 implements nd3 {
    @NotNull
    private final Template c;

    public od3(@NotNull Template template) {
        c25.p(template, "template");
        this.c = template;
    }

    @Override // com.p7700g.p99005.nd3
    @Nullable
    public ViewGroup b(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        return new FrameLayout(viewGroup.getContext());
    }
}