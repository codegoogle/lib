package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @z1 Intent intent, int i) {
        return new zad(intent, activity, i);
    }

    public static zag zac(@x1 Fragment fragment, @z1 Intent intent, int i) {
        return new zae(intent, fragment, i);
    }

    public static zag zad(@x1 LifecycleFragment lifecycleFragment, @z1 Intent intent, int i) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            zaa();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zaa();
}