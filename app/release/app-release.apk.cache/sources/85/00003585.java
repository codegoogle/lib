package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* loaded from: classes3.dex */
public final class o {
    private static o a;
    private int b = 1;
    private int c = 1;
    private int d = 1;
    private int e = 1;
    private com.ironsource.sdk.f.a f = new com.ironsource.sdk.f.a();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            IronSource.AD_UNIT.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private o() {
        d(this.b);
        e(this.c);
        f(this.e);
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (a == null) {
                a = new o();
            }
            oVar = a;
        }
        return oVar;
    }

    private static IronSource.AD_UNIT c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return IronSource.AD_UNIT.BANNER;
                }
                return IronSource.AD_UNIT.INTERSTITIAL;
            }
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        return IronSource.AD_UNIT.OFFERWALL;
    }

    private void d(int i) {
        this.b = i;
        this.f.b(i);
    }

    private void e(int i) {
        this.c = i;
        this.f.a(i);
    }

    private void f(int i) {
        this.e = i;
        this.f.c(i);
    }

    public final synchronized void a(int i) {
        a(c(i));
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        int i = a.a[ad_unit.ordinal()];
        if (i == 1) {
            this.d++;
        } else if (i == 2) {
            d(this.b + 1);
        } else if (i == 3) {
            e(this.c + 1);
        } else {
            if (i == 4) {
                f(this.e + 1);
            }
        }
    }

    public final synchronized int b(int i) {
        return b(c(i));
    }

    public final synchronized int b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i = a.a[ad_unit.ordinal()];
        if (i == 1) {
            return this.d;
        } else if (i == 2) {
            return this.b;
        } else if (i == 3) {
            return this.c;
        } else if (i != 4) {
            return -1;
        } else {
            return this.e;
        }
    }
}