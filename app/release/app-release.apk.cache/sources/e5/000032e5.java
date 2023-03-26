package com.greedygame.core.mediation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRatingBar;
import com.p7700g.p99005.c25;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class GGRatingBar extends AppCompatRatingBar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGRatingBar(@NotNull Context context) {
        super(context);
        c25.p(context, "context");
        a();
    }

    public final void a() {
        if (getRating() == 0.0f) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    @Override // android.widget.RatingBar
    public void setRating(float f) {
        super.setRating(f);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGRatingBar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGRatingBar(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        a();
    }
}