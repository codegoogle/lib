package com.p7700g.p99005;

/* compiled from: SpriteFactory.java */
/* loaded from: classes2.dex */
public class g12 {

    /* compiled from: SpriteFactory.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            h12.values();
            int[] iArr = new int[15];
            a = iArr;
            try {
                iArr[h12.ROTATING_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h12.DOUBLE_BOUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h12.WAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h12.WANDERING_CUBES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h12.PULSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h12.CHASING_DOTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h12.THREE_BOUNCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h12.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h12.CUBE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h12.FADING_CIRCLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h12.FOLDING_CUBE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h12.ROTATING_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[h12.MULTIPLE_PULSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[h12.PULSE_RING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[h12.MULTIPLE_PULSE_RING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static x12 a(h12 h12Var) {
        switch (h12Var.ordinal()) {
            case 0:
                return new k22();
            case 1:
                return new c22();
            case 2:
                return new n22();
            case 3:
                return new m22();
            case 4:
                return new h22();
            case 5:
                return new z12();
            case 6:
                return new l22();
            case 7:
                return new a22();
            case 8:
                return new b22();
            case 9:
                return new d22();
            case 10:
                return new e22();
            case 11:
                return new j22();
            case 12:
                return new f22();
            case 13:
                return new i22();
            case 14:
                return new g22();
            default:
                return null;
        }
    }
}