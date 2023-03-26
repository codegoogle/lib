package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p7700g.p99005.ww;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class AppCompatEmojiTextHelper {
    @x1
    private final ww mEmojiTextViewHelper;
    @x1
    private final TextView mView;

    public AppCompatEmojiTextHelper(@x1 TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new ww(textView, false);
    }

    @x1
    public InputFilter[] getFilters(@x1 InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.a(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.b();
    }

    public void loadFromAttributes(@z1 AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, x2.m.v0, i, 0);
        try {
            int i2 = x2.m.K0;
            boolean z = obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getBoolean(i2, true) : true;
            obtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setAllCaps(boolean z) {
        this.mEmojiTextViewHelper.c(z);
    }

    public void setEnabled(boolean z) {
        this.mEmojiTextViewHelper.d(z);
    }

    @z1
    public TransformationMethod wrapTransformationMethod(@z1 TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.f(transformationMethod);
    }
}