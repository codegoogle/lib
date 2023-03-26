package com.anythink.splashad.api;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes2.dex */
public interface ATSplashExListener extends ATSplashAdListener {
    void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z);

    void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo);
}