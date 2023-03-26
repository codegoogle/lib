package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.pq;

/* compiled from: ComponentActivity.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class bg extends Activity implements qz, pq.a {
    private y7<Class<? extends a>, a> s = new y7<>();
    private rz t = new rz(this);

    /* compiled from: ComponentActivity.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
    }

    private static boolean A(@z1 String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 1;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Build.VERSION.SDK_INT >= 31;
            case 1:
                return Build.VERSION.SDK_INT >= 29;
            case 2:
                return Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !pq.d(decorView, keyEvent)) {
            return pq.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !pq.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @x1
    public mz getLifecycle() {
        return this.t;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        b00.g(this);
    }

    @Override // android.app.Activity
    @t0
    public void onSaveInstanceState(@x1 Bundle bundle) {
        this.t.l(mz.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.p7700g.p99005.pq.a
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean s(@x1 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends a> T x(Class<T> cls) {
        return (T) this.s.get(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void y(a aVar) {
        this.s.put(aVar.getClass(), aVar);
    }

    public final boolean z(@z1 String[] strArr) {
        return !A(strArr);
    }
}