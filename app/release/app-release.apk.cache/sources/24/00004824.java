package com.p7700g.p99005;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes2.dex */
public class ib2 extends i3 {
    private boolean s;

    /* compiled from: BottomSheetDialogFragment.java */
    /* loaded from: classes2.dex */
    public class b extends BottomSheetBehavior.f {
        private b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@x1 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@x1 View view, int i) {
            if (i == 5) {
                ib2.this.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.s) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void e(@x1 BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.s = z;
        if (bottomSheetBehavior.u0() == 5) {
            d();
            return;
        }
        if (getDialog() instanceof hb2) {
            ((hb2) getDialog()).v();
        }
        bottomSheetBehavior.Y(new b());
        bottomSheetBehavior.W0(5);
    }

    private boolean f(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof hb2) {
            hb2 hb2Var = (hb2) dialog;
            BottomSheetBehavior<FrameLayout> s = hb2Var.s();
            if (s.A0() && hb2Var.t()) {
                e(s, z);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.gx
    public void dismiss() {
        if (f(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // com.p7700g.p99005.gx
    public void dismissAllowingStateLoss() {
        if (f(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // com.p7700g.p99005.i3, com.p7700g.p99005.gx
    @x1
    public Dialog onCreateDialog(@z1 Bundle bundle) {
        return new hb2(getContext(), getTheme());
    }
}