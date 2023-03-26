package com.p7700g.p99005;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: EmojiKeyListener.java */
@e2(19)
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class vw implements KeyListener {
    private final KeyListener a;
    private final a b;

    /* compiled from: EmojiKeyListener.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@x1 Editable editable, int i, @x1 KeyEvent keyEvent) {
            return fv.h(editable, i, keyEvent);
        }
    }

    public vw(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.b.a(editable, i, keyEvent) || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }

    public vw(KeyListener keyListener, a aVar) {
        this.a = keyListener;
        this.b = aVar;
    }
}