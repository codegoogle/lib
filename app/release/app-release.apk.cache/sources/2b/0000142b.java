package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/* loaded from: assets/audience_network.dex */
public class TT implements InterfaceC0784Kr {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0784Kr
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow() != null ? activity.getWindow().getCallback() : null;
        if (callback != null) {
            Window$CallbackC0781Ko window$CallbackC0781Ko = new Window$CallbackC0781Ko(callback, activity);
            Window$CallbackC0781Ko.A00(new TS(this));
            activity.getWindow().setCallback(window$CallbackC0781Ko);
        }
    }
}