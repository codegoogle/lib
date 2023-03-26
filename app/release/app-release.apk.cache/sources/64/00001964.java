package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.r7;
import com.p7700g.p99005.u1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaae extends zap {
    private final r7<ApiKey<?>> zad;
    private final GoogleApiManager zae;

    @VisibleForTesting
    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zad = new r7<>();
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @u1
    public static void zad(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zaae zaaeVar = (zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if (zaaeVar == null) {
            zaaeVar = new zaae(fragment, googleApiManager, GoogleApiAvailability.getInstance());
        }
        Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaaeVar.zad.add(apiKey);
        googleApiManager.zaC(zaaeVar);
    }

    private final void zae() {
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zaC(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.zae.zaD(this);
    }

    public final r7<ApiKey<?>> zaa() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i) {
        this.zae.zaz(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        this.zae.zaA();
    }
}