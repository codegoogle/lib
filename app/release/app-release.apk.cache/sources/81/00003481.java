package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, @Nullable String str);

    void onAdLoadSuccess();
}