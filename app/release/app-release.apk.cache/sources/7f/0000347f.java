package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class BaseAdInteractionAdapter<NetworkAdapter extends AdapterBaseInterface, Listener extends AdapterAdInteractionListener> extends BaseAdAdapter<NetworkAdapter, Listener> {
    public BaseAdInteractionAdapter(@NotNull IronSource.AD_UNIT ad_unit, @NotNull NetworkSettings networkSettings) {
        super(ad_unit, networkSettings);
    }

    public abstract boolean isAdAvailable(@NotNull AdData adData);

    public abstract void showAd(@NotNull AdData adData, @NotNull Listener listener);
}