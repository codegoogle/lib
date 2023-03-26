package com.p7700g.p99005;

import android.app.Dialog;
import android.os.Bundle;
import com.p7700g.p99005.i2;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class i3 extends gx {
    public i3() {
    }

    @Override // com.p7700g.p99005.gx
    @x1
    public Dialog onCreateDialog(@z1 Bundle bundle) {
        return new h3(getContext(), getTheme());
    }

    @Override // com.p7700g.p99005.gx
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@x1 Dialog dialog, int i) {
        if (dialog instanceof h3) {
            h3 h3Var = (h3) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            h3Var.l(1);
            return;
        }
        super.setupDialog(dialog, i);
    }

    public i3(@s1 int i) {
        super(i);
    }
}