package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import com.p7700g.p99005.d4;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    /* loaded from: classes.dex */
    public static final class Helper {
        private final Context mContext;
        private LayoutInflater mDropDownInflater;
        private final LayoutInflater mInflater;

        public Helper(@x1 Context context) {
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
        }

        @x1
        public LayoutInflater getDropDownViewInflater() {
            LayoutInflater layoutInflater = this.mDropDownInflater;
            return layoutInflater != null ? layoutInflater : this.mInflater;
        }

        @z1
        public Resources.Theme getDropDownViewTheme() {
            LayoutInflater layoutInflater = this.mDropDownInflater;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void setDropDownViewTheme(@z1 Resources.Theme theme) {
            if (theme == null) {
                this.mDropDownInflater = null;
            } else if (theme == this.mContext.getTheme()) {
                this.mDropDownInflater = this.mInflater;
            } else {
                this.mDropDownInflater = LayoutInflater.from(new d4(this.mContext, theme));
            }
        }
    }

    @z1
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@z1 Resources.Theme theme);
}