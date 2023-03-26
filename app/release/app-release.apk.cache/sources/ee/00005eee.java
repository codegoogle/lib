package com.p7700g.p99005;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.p7700g.p99005.i2;

/* compiled from: EmojiInputConnection.java */
@e2(19)
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class tw extends InputConnectionWrapper {
    private final TextView a;
    private final a b;

    /* compiled from: EmojiInputConnection.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@x1 InputConnection inputConnection, @x1 Editable editable, @p1(from = 0) int i, @p1(from = 0) int i2, boolean z) {
            return fv.g(inputConnection, editable, i, i2, z);
        }

        public void b(@x1 EditorInfo editorInfo) {
            if (fv.n()) {
                fv.b().D(editorInfo);
            }
        }
    }

    public tw(@x1 TextView textView, @x1 InputConnection inputConnection, @x1 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.b.a(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.b.a(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public tw(@x1 TextView textView, @x1 InputConnection inputConnection, @x1 EditorInfo editorInfo, @x1 a aVar) {
        super(inputConnection, false);
        this.a = textView;
        this.b = aVar;
        aVar.b(editorInfo);
    }
}