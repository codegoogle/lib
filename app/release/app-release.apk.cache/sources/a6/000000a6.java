package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.x1;
import java.lang.reflect.Field;

@e2(19)
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements oz {
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static int v;
    private static Field w;
    private static Field x;
    private static Field y;
    private Activity z;

    public ImmLeaksCleaner(Activity activity) {
        this.z = activity;
    }

    @u1
    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void e() {
        try {
            v = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            x = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            y = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            w = declaredField3;
            declaredField3.setAccessible(true);
            v = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // com.p7700g.p99005.oz
    public void i(@x1 qz qzVar, @x1 mz.b bVar) {
        if (bVar != mz.b.ON_DESTROY) {
            return;
        }
        if (v == 0) {
            e();
        }
        if (v == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.z.getSystemService("input_method");
            try {
                Object obj = w.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) x.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                y.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}