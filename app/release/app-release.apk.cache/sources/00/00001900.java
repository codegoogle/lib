package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;
import com.p7700g.p99005.gx;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public class SupportErrorDialogFragment extends gx {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    @z1
    private Dialog zac;

    @x1
    public static SupportErrorDialogFragment newInstance(@x1 Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // com.p7700g.p99005.gx, android.content.DialogInterface.OnCancelListener
    public void onCancel(@x1 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // com.p7700g.p99005.gx
    @x1
    public Dialog onCreateDialog(@z1 Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.zac == null) {
                this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getContext())).create();
            }
            return this.zac;
        }
        return dialog;
    }

    @Override // com.p7700g.p99005.gx
    public void show(@x1 FragmentManager fragmentManager, @z1 String str) {
        super.show(fragmentManager, str);
    }

    @x1
    public static SupportErrorDialogFragment newInstance(@x1 Dialog dialog, @z1 DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zab = onCancelListener;
        }
        return supportErrorDialogFragment;
    }
}