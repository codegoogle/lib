package com.p7700g.p99005;

/* compiled from: RenderMode.java */
/* loaded from: classes.dex */
public enum si0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            si0.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[si0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[si0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[si0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean a(int i, boolean z, int i2) {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return (z && i < 28) || i2 > 4 || i <= 25;
            }
            return true;
        }
        return false;
    }
}