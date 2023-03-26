package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import com.p7700g.p99005.ct;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;

@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class AppCompatCheckedTextViewHelper {
    private ColorStateList mCheckMarkTintList = null;
    private PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    @x1
    private final CheckedTextView mView;

    public AppCompatCheckedTextViewHelper(@x1 CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    public void applyCheckMarkTint() {
        Drawable a = ct.a(this.mView);
        if (a != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                Drawable mutate = fk.r(a).mutate();
                if (this.mHasCheckMarkTint) {
                    fk.o(mutate, this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    fk.p(mutate, this.mCheckMarkTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(mutate);
            }
        }
    }

    public ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadFromAttributes(@z1 AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int resourceId;
        int resourceId2;
        Context context = this.mView.getContext();
        int[] iArr = x2.m.s3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, 0);
        CheckedTextView checkedTextView = this.mView;
        sr.y1(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            int i4 = x2.m.u3;
            if (obtainStyledAttributes.hasValue(i4) && (resourceId2 = obtainStyledAttributes.getResourceId(i4, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.mView;
                    checkedTextView2.setCheckMarkDrawable(r3.b(checkedTextView2.getContext(), resourceId2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i5 = x2.m.t3;
                    if (obtainStyledAttributes.hasValue(i5) && (resourceId = obtainStyledAttributes.getResourceId(i5, 0)) != 0) {
                        CheckedTextView checkedTextView3 = this.mView;
                        checkedTextView3.setCheckMarkDrawable(r3.b(checkedTextView3.getContext(), resourceId));
                    }
                }
                i2 = x2.m.v3;
                if (obtainStyledAttributes.hasValue(i2)) {
                    ct.d(this.mView, obtainStyledAttributes.getColorStateList(i2));
                }
                i3 = x2.m.w3;
                if (obtainStyledAttributes.hasValue(i3)) {
                    ct.e(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i3, -1), null));
                }
            }
            z = false;
            if (!z) {
            }
            i2 = x2.m.v3;
            if (obtainStyledAttributes.hasValue(i2)) {
            }
            i3 = x2.m.w3;
            if (obtainStyledAttributes.hasValue(i3)) {
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintMode(@z1 PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }
}