package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import com.ironsource.mediationsdk.C1272d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {
    @NotNull
    private final IronSource.AD_UNIT a;
    @NotNull
    private final NetworkSettings b;

    public BaseAdAdapter(@NotNull IronSource.AD_UNIT ad_unit, @NotNull NetworkSettings networkSettings) {
        this.a = ad_unit;
        this.b = networkSettings;
    }

    @Nullable
    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) C1272d.a().a(this.b, this.a);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    public abstract void loadAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull Listener listener);

    public void releaseMemory() {
    }
}