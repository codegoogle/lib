package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.oe2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect s;
    private boolean t;

    public TextInputEditText(@x1 Context context) {
        this(context, null);
    }

    @x1
    private String a(@x1 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        String charSequence = TextUtils.isEmpty(hint) ^ true ? hint.toString() : "";
        if (!z) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append(TextUtils.isEmpty(charSequence) ? "" : wo1.t(", ", charSequence));
        return sb.toString();
    }

    private boolean c(@z1 TextInputLayout textInputLayout) {
        return textInputLayout != null && this.t;
    }

    @z1
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @z1
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public boolean b() {
        return this.t;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@z1 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!c(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.s);
        rect.bottom = this.s.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@z1 Rect rect, @z1 Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (c(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @z1
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Z()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Z() && super.getHint() == null && oe2.c()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @z1
    public InputConnection onCreateInputConnection(@x1 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(a(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@z1 Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (c(textInputLayout) && rect != null) {
            this.s.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.s);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.t = z;
    }

    public TextInputEditText(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.o5);
    }

    public TextInputEditText(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, 0), attributeSet, i);
        this.s = new Rect();
        TypedArray j = cf2.j(context, attributeSet, ga2.o.Mt, i, ga2.n.je, new int[0]);
        setTextInputLayoutFocusedRectEnabled(j.getBoolean(ga2.o.Nt, false));
        j.recycle();
    }
}