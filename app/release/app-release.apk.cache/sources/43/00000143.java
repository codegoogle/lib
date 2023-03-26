package androidx.appcompat.widget;

import android.graphics.Rect;
import com.p7700g.p99005.i2;

@i2({i2.a.u})
/* loaded from: classes.dex */
public interface FitWindowsViewGroup {

    /* loaded from: classes.dex */
    public interface OnFitSystemWindowsListener {
        void onFitSystemWindows(Rect rect);
    }

    void setOnFitSystemWindowsListener(OnFitSystemWindowsListener onFitSystemWindowsListener);
}