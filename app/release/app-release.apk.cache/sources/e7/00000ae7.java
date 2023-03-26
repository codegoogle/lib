package com.anythink.expressad.video.signal;

/* loaded from: classes2.dex */
public interface e extends f {
    public static final int a = -1;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 100;

    void configurationChanged(int i2, int i3, int i4);

    boolean endCardShowing();

    void handlerPlayableException(String str);

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardLoaded();

    boolean miniCardShowing();

    void readyStatus(int i2);

    void resizeMiniCard(int i2, int i3, int i4);

    boolean showAlertWebView();

    void showEndcard(int i2);

    void showMiniCard(int i2, int i3, int i4, int i5, int i6);

    void showPlayableView();

    void showVideoClickView(int i2);

    void showVideoEndCover();
}