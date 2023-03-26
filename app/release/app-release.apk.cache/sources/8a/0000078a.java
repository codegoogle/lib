package com.anythink.expressad.atsignalcommon.mraid;

import com.anythink.expressad.foundation.d.c;

/* loaded from: classes2.dex */
public interface IMraidJSBridge {
    void close();

    void expand(String str, boolean z);

    c getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z);
}