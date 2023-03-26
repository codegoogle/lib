package com.anythink.expressad.video.signal;

/* loaded from: classes2.dex */
public interface j {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = -1;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 0;
    public static final int r = 1;

    void alertWebViewShowed();

    void closeVideoOperate(int i2, int i3);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i2);

    boolean isH5Canvas();

    void notifyCloseBtn(int i2);

    void progressBarOperate(int i2);

    void progressOperate(int i2, int i3);

    void setCover(boolean z);

    void setInstallDialogState(boolean z);

    void setMiniEndCardState(boolean z);

    void setScaleFitXY(int i2);

    void setVisible(int i2);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    void soundOperate(int i2, int i3);

    void soundOperate(int i2, int i3, String str);

    void videoOperate(int i2);
}