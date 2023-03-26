package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.p7700g.p99005.rw;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class AppCompatEmojiEditTextHelper {
    @x1
    private final rw mEmojiEditTextHelper;
    @x1
    private final EditText mView;

    public AppCompatEmojiEditTextHelper(@x1 EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new rw(editText, false);
    }

    @z1
    public KeyListener getKeyListener(@z1 KeyListener keyListener) {
        return isEmojiCapableKeyListener(keyListener) ? this.mEmojiEditTextHelper.b(keyListener) : keyListener;
    }

    public boolean isEmojiCapableKeyListener(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean isEnabled() {
        return this.mEmojiEditTextHelper.d();
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

    @z1
    public InputConnection onCreateInputConnection(@z1 InputConnection inputConnection, @x1 EditorInfo editorInfo) {
        return this.mEmojiEditTextHelper.e(inputConnection, editorInfo);
    }

    public void setEnabled(boolean z) {
        this.mEmojiEditTextHelper.g(z);
    }
}