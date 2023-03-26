package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p5;
import com.p7700g.p99005.x1;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int s;
    private final int t;

    public BrowserActionsFallbackMenuView(@x1 Context context, @x1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = getResources().getDimensionPixelOffset(p5.b.b);
        this.t = getResources().getDimensionPixelOffset(p5.b.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.s * 2), this.t), 1073741824), i2);
    }
}