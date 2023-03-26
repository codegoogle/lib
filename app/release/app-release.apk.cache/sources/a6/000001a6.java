package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class TooltipCompat {

    @e2(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @e1
        public static void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private TooltipCompat() {
    }

    public static void setTooltipText(@x1 View view, @z1 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(view, charSequence);
        } else {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }
}