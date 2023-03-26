package com.p7700g.p99005;

import android.graphics.Paint;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public class em0 implements pl0 {
    private final String a;
    @z1
    private final zk0 b;
    private final List<zk0> c;
    private final yk0 d;
    private final bl0 e;
    private final zk0 f;
    private final b g;
    private final c h;
    private final float i;
    private final boolean j;

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            c.values();
            int[] iArr = new int[3];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b.values();
            int[] iArr2 = new int[3];
            a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap f() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join f() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return null;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }
    }

    public em0(String str, @z1 zk0 zk0Var, List<zk0> list, yk0 yk0Var, bl0 bl0Var, zk0 zk0Var2, b bVar, c cVar, float f, boolean z) {
        this.a = str;
        this.b = zk0Var;
        this.c = list;
        this.d = yk0Var;
        this.e = bl0Var;
        this.f = zk0Var2;
        this.g = bVar;
        this.h = cVar;
        this.i = f;
        this.j = z;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new qj0(hi0Var, im0Var, this);
    }

    public b b() {
        return this.g;
    }

    public yk0 c() {
        return this.d;
    }

    public zk0 d() {
        return this.b;
    }

    public c e() {
        return this.h;
    }

    public List<zk0> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public bl0 i() {
        return this.e;
    }

    public zk0 j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}