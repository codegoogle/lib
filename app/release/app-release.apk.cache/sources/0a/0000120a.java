package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.facebook.ads.internal.shield.NoAutoExceptionHandling;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@NoAutoExceptionHandling
@SuppressLint({"EmptyCatchBlock", "CatchGeneralException", "WrongCall"})
/* renamed from: com.facebook.ads.redexgen.X.Ka  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0768Ka extends LinearLayout {
    public static String[] A00;
    public static final AtomicBoolean A01;
    public static final AtomicReference<KS> A02;

    public static void A00() {
        A00 = new String[]{"", "JscVEJqzE5snxFf0FJHgKRbYi5fThMYN", "", "98Tc4ikzWj4puYv0qdZM5IaJNuj", "NrxE39kCKJtZUIjvLefOnsoHZY5VCkYH", "IRKWghuugEe9To8dUXYn546QiGafUd0F", "", "iGyvM3KMGXSFWH61pr"};
    }

    static {
        A00();
        A01 = new AtomicBoolean();
        A02 = new AtomicReference<>();
    }

    private final void A01() {
        super.onAttachedToWindow();
    }

    private final void A02() {
        super.onDetachedFromWindow();
    }

    private final void A03() {
        super.onFinishInflate();
    }

    private final void A04(int i) {
        super.onWindowVisibilityChanged(i);
    }

    private final void A05(int i, int i2) {
        super.onMeasure(i, i2);
    }

    private final void A06(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    private final void A07(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void A08(Throwable th) {
        C0777Kj.A00().A7t(IronSourceConstants.BN_INSTANCE_DESTROY, th);
        KS ks = A02.get();
        if (ks != null) {
            ks.ACR(th, this);
        }
    }

    private final void A09(boolean z) {
        super.onWindowFocusChanged(z);
    }

    private final void A0A(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private final void A0B(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    public static void A0C(boolean z, KS ks) {
        A01.set(z);
        A02.set(ks);
    }

    private final boolean A0D() {
        return super.performClick();
    }

    private final boolean A0E(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    private final boolean A0F(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    private final boolean A0G(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    private final boolean A0H(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            A01();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                if (A00[3].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[0] = "";
                strArr[2] = "";
                super.onAttachedToWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            A02();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onDetachedFromWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            A07(canvas);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onDraw(canvas);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            A03();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onFinishInflate();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            A0B(z, i, rect);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onFocusChanged(z, i, rect);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            return A0E(i, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onKeyDown(i, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            return A0F(i, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onKeyUp(i, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            A0A(z, i, i2, i3, i4);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            A05(i, i2);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onMeasure(i, i2);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            A06(i, i2, i3, i4);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                if (A00[3].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[5] = "MH26u4dEv805dgSIeYYXQ23GOqCTLqJu";
                strArr[5] = "MH26u4dEv805dgSIeYYXQ23GOqCTLqJu";
                super.onSizeChanged(i, i2, i3, i4);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return A0G(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onTouchEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        try {
            return A0H(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onTrackballEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        try {
            A09(z);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onWindowFocusChanged(z);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        try {
            A04(i);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onWindowVisibilityChanged(i);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        try {
            return A0D();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                boolean performClick = super.performClick();
                if (A00[7].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[3] = "AcVK2d2xNjImmhnoUD9nKEsQb";
                strArr[3] = "AcVK2d2xNjImmhnoUD9nKEsQb";
                return performClick;
            }
            throw th;
        }
    }
}