package com.ironsource.mediationsdk.adunit.adapter.listener;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i, @Nullable String str);

    void onInitSuccess();
}