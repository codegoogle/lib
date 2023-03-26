package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Pc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0896Pc {
    void A7E();

    boolean A7L();

    boolean A7M();

    boolean A7h();

    void ABX(boolean z, int i);

    void ADE(int i);

    void ADI(EnumC0886Os enumC0886Os, int i);

    void ADO(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC0886Os getStartReason();

    EnumC0898Pe getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(InterfaceC0899Pf interfaceC0899Pf);

    void setup(Uri uri);
}