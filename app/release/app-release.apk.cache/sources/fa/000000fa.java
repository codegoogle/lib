package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nt;
import com.p7700g.p99005.qr;
import com.p7700g.p99005.qt;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.st;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements qt, qr, EmojiCompatConfigurationView, st {
    @x1
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatCheckedTextViewHelper mCheckedHelper;
    private final AppCompatTextHelper mTextHelper;

    public AppCompatCheckedTextView(@x1 Context context) {
        this(context, null);
    }

    @x1
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.applyCheckMarkTint();
        }
    }

    @Override // android.widget.TextView
    @z1
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return nt.G(super.getCustomSelectionActionModeCallback());
    }

    @Override // com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintList();
        }
        return null;
    }

    @Override // com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintMode();
        }
        return null;
    }

    @Override // com.p7700g.p99005.qt
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public ColorStateList getSupportCheckMarkTintList() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.getSupportCheckMarkTintList();
        }
        return null;
    }

    @Override // com.p7700g.p99005.qt
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.getSupportCheckMarkTintMode();
        }
        return null;
    }

    @Override // com.p7700g.p99005.st
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.getCompoundDrawableTintList();
    }

    @Override // com.p7700g.p99005.st
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.getCompoundDrawableTintMode();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    @z1
    public InputConnection onCreateInputConnection(@x1 EditorInfo editorInfo) {
        return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().setAllCaps(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@z1 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@f1 int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@z1 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.onSetCheckMarkDrawable();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    @e2(17)
    public void setCompoundDrawablesRelative(@z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@z1 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(nt.H(this, callback));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().setEnabled(z);
    }

    @Override // com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@z1 ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // com.p7700g.p99005.qr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@z1 PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // com.p7700g.p99005.qt
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@z1 ColorStateList colorStateList) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.setSupportCheckMarkTintList(colorStateList);
        }
    }

    @Override // com.p7700g.p99005.qt
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@z1 PorterDuff.Mode mode) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.setSupportCheckMarkTintMode(mode);
        }
    }

    @Override // com.p7700g.p99005.st
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@z1 ColorStateList colorStateList) {
        this.mTextHelper.setCompoundDrawableTintList(colorStateList);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    @Override // com.p7700g.p99005.st
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@z1 PorterDuff.Mode mode) {
        this.mTextHelper.setCompoundDrawableTintMode(mode);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@x1 Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetTextAppearance(context, i);
        }
    }

    public AppCompatCheckedTextView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, x2.b.w0);
    }

    public AppCompatCheckedTextView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        appCompatTextHelper.applyCompoundDrawablesTints();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = new AppCompatCheckedTextViewHelper(this);
        this.mCheckedHelper = appCompatCheckedTextViewHelper;
        appCompatCheckedTextViewHelper.loadFromAttributes(attributeSet, i);
        getEmojiTextViewHelper().loadFromAttributes(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@f1 int i) {
        setCheckMarkDrawable(r3.b(getContext(), i));
    }
}