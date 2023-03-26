package com.p7700g.p99005;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* compiled from: BlendModeUtils.java */
/* loaded from: classes.dex */
public class cj {

    /* compiled from: BlendModeUtils.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            bj.values();
            int[] iArr = new int[29];
            a = iArr;
            try {
                iArr[bj.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[bj.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[bj.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[bj.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[bj.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[bj.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[bj.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[bj.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[bj.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[bj.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[bj.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[bj.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[bj.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[bj.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[bj.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[bj.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[bj.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[bj.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[bj.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[bj.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[bj.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[bj.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[bj.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[bj.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[bj.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[bj.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[bj.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[bj.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[bj.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* compiled from: BlendModeUtils.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        @z1
        public static Object a(@x1 bj bjVar) {
            switch (bjVar.ordinal()) {
                case 0:
                    return BlendMode.CLEAR;
                case 1:
                    return BlendMode.SRC;
                case 2:
                    return BlendMode.DST;
                case 3:
                    return BlendMode.SRC_OVER;
                case 4:
                    return BlendMode.DST_OVER;
                case 5:
                    return BlendMode.SRC_IN;
                case 6:
                    return BlendMode.DST_IN;
                case 7:
                    return BlendMode.SRC_OUT;
                case 8:
                    return BlendMode.DST_OUT;
                case 9:
                    return BlendMode.SRC_ATOP;
                case 10:
                    return BlendMode.DST_ATOP;
                case 11:
                    return BlendMode.XOR;
                case 12:
                    return BlendMode.PLUS;
                case 13:
                    return BlendMode.MODULATE;
                case 14:
                    return BlendMode.SCREEN;
                case 15:
                    return BlendMode.OVERLAY;
                case 16:
                    return BlendMode.DARKEN;
                case 17:
                    return BlendMode.LIGHTEN;
                case 18:
                    return BlendMode.COLOR_DODGE;
                case 19:
                    return BlendMode.COLOR_BURN;
                case 20:
                    return BlendMode.HARD_LIGHT;
                case 21:
                    return BlendMode.SOFT_LIGHT;
                case 22:
                    return BlendMode.DIFFERENCE;
                case 23:
                    return BlendMode.EXCLUSION;
                case 24:
                    return BlendMode.MULTIPLY;
                case 25:
                    return BlendMode.HUE;
                case 26:
                    return BlendMode.SATURATION;
                case 27:
                    return BlendMode.COLOR;
                case 28:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    private cj() {
    }

    @z1
    public static PorterDuff.Mode a(@z1 bj bjVar) {
        if (bjVar == null) {
            return null;
        }
        switch (bjVar.ordinal()) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.ADD;
            case 13:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case 16:
                return PorterDuff.Mode.DARKEN;
            case 17:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }
}