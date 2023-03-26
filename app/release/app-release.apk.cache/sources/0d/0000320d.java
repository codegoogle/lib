package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.x4;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements x4 {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // com.p7700g.p99005.x4
    public int getWindowAnimations() {
        return 0;
    }

    @Override // com.p7700g.p99005.x4
    public void initialize(p4 p4Var) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}