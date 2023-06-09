package com.ironsource.mediationsdk;

/* loaded from: classes3.dex */
public class ISBannerSize {
    private int b;
    private int c;
    private String d;
    private boolean e;
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", 300, 250);
    public static final ISBannerSize a = new ISBannerSize("LEADERBOARD", 728, 90);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.d = str;
        this.b = i;
        this.c = i2;
    }

    public String getDescription() {
        return this.d;
    }

    public int getHeight() {
        return this.c;
    }

    public int getWidth() {
        return this.b;
    }

    public boolean isAdaptive() {
        return this.e;
    }

    public boolean isSmart() {
        return this.d.equals("SMART");
    }

    public void setAdaptive(boolean z) {
        this.e = z;
    }
}