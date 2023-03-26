package com.p7700g.p99005;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.p7700g.p99005.i2;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class rw {
    private final b a;
    private int b;
    private int c;

    /* compiled from: EmojiEditTextHelper.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a extends b {
        private final EditText a;
        private final xw b;

        public a(@x1 EditText editText, boolean z) {
            this.a = editText;
            xw xwVar = new xw(editText, z);
            this.b = xwVar;
            editText.addTextChangedListener(xwVar);
            editText.setEditableFactory(sw.getInstance());
        }

        @Override // com.p7700g.p99005.rw.b
        public KeyListener a(@z1 KeyListener keyListener) {
            if (keyListener instanceof vw) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new vw(keyListener);
        }

        @Override // com.p7700g.p99005.rw.b
        public boolean b() {
            return this.b.d();
        }

        @Override // com.p7700g.p99005.rw.b
        public InputConnection c(@x1 InputConnection inputConnection, @x1 EditorInfo editorInfo) {
            return inputConnection instanceof tw ? inputConnection : new tw(this.a, inputConnection, editorInfo);
        }

        @Override // com.p7700g.p99005.rw.b
        public void d(int i) {
            this.b.f(i);
        }

        @Override // com.p7700g.p99005.rw.b
        public void e(boolean z) {
            this.b.g(z);
        }

        @Override // com.p7700g.p99005.rw.b
        public void f(int i) {
            this.b.h(i);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        @z1
        public KeyListener a(@z1 KeyListener keyListener) {
            return keyListener;
        }

        public boolean b() {
            return false;
        }

        public InputConnection c(@x1 InputConnection inputConnection, @x1 EditorInfo editorInfo) {
            return inputConnection;
        }

        public void d(int i) {
        }

        public void e(boolean z) {
        }

        public void f(int i) {
        }
    }

    public rw(@x1 EditText editText) {
        this(editText, true);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public int a() {
        return this.c;
    }

    @z1
    public KeyListener b(@z1 KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.a.b();
    }

    @z1
    public InputConnection e(@z1 InputConnection inputConnection, @x1 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.c(inputConnection, editorInfo);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void f(int i) {
        this.c = i;
        this.a.d(i);
    }

    public void g(boolean z) {
        this.a.e(z);
    }

    public void h(@p1(from = 0) int i) {
        jp.j(i, "maxEmojiCount should be greater than 0");
        this.b = i;
        this.a.f(i);
    }

    public rw(@x1 EditText editText, boolean z) {
        this.b = Integer.MAX_VALUE;
        this.c = 0;
        jp.m(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }
}