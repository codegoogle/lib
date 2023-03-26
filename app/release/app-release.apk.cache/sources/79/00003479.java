package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

/* loaded from: classes3.dex */
public class AdapterBaseWrapper {
    public AdapterBaseInterface a;
    public NetworkSettings b;

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.a = adapterBaseInterface;
        this.b = networkSettings;
    }

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.a;
    }

    public NetworkSettings getSettings() {
        return this.b;
    }
}