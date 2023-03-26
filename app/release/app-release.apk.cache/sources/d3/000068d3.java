package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.util.Locale;

/* compiled from: BadgeState.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class za2 {
    private static final int a = 4;
    private static final String b = "badge";
    private final a c;
    private final a d;
    public final float e;
    public final float f;
    public final float g;

    public za2(Context context, @t2 int i, @q0 int i2, @m2 int i3, @z1 a aVar) {
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        Locale locale;
        a aVar2 = new a();
        this.d = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i != 0) {
            aVar.u = i;
        }
        TypedArray b2 = b(context, aVar.u, i2, i3);
        Resources resources = context.getResources();
        this.e = b2.getDimensionPixelSize(ga2.o.Z3, resources.getDimensionPixelSize(ga2.f.Y5));
        this.g = b2.getDimensionPixelSize(ga2.o.b4, resources.getDimensionPixelSize(ga2.f.X5));
        this.f = b2.getDimensionPixelSize(ga2.o.c4, resources.getDimensionPixelSize(ga2.f.d6));
        aVar2.x = aVar.x == -2 ? 255 : aVar.x;
        if (aVar.B != null) {
            charSequence = aVar.B;
        } else {
            charSequence = context.getString(ga2.m.A0);
        }
        aVar2.B = charSequence;
        if (aVar.C != 0) {
            i4 = aVar.C;
        } else {
            i4 = ga2.l.a;
        }
        aVar2.C = i4;
        if (aVar.D != 0) {
            i5 = aVar.D;
        } else {
            i5 = ga2.m.C0;
        }
        aVar2.D = i5;
        aVar2.F = Boolean.valueOf(aVar.F == null || aVar.F.booleanValue());
        if (aVar.z != -2) {
            i6 = aVar.z;
        } else {
            i6 = b2.getInt(ga2.o.f4, 4);
        }
        aVar2.z = i6;
        if (aVar.y != -2) {
            aVar2.y = aVar.y;
        } else {
            int i7 = ga2.o.g4;
            if (b2.hasValue(i7)) {
                aVar2.y = b2.getInt(i7, 0);
            } else {
                aVar2.y = -1;
            }
        }
        if (aVar.v != null) {
            intValue = aVar.v.intValue();
        } else {
            intValue = v(context, b2, ga2.o.X3);
        }
        aVar2.v = Integer.valueOf(intValue);
        if (aVar.w != null) {
            aVar2.w = aVar.w;
        } else {
            int i8 = ga2.o.a4;
            if (b2.hasValue(i8)) {
                aVar2.w = Integer.valueOf(v(context, b2, i8));
            } else {
                aVar2.w = Integer.valueOf(new tg2(context, ga2.n.n8).i().getDefaultColor());
            }
        }
        if (aVar.E != null) {
            intValue2 = aVar.E.intValue();
        } else {
            intValue2 = b2.getInt(ga2.o.Y3, 8388661);
        }
        aVar2.E = Integer.valueOf(intValue2);
        if (aVar.G != null) {
            intValue3 = aVar.G.intValue();
        } else {
            intValue3 = b2.getDimensionPixelOffset(ga2.o.d4, 0);
        }
        aVar2.G = Integer.valueOf(intValue3);
        if (aVar.G != null) {
            intValue4 = aVar.H.intValue();
        } else {
            intValue4 = b2.getDimensionPixelOffset(ga2.o.h4, 0);
        }
        aVar2.H = Integer.valueOf(intValue4);
        if (aVar.I != null) {
            intValue5 = aVar.I.intValue();
        } else {
            intValue5 = b2.getDimensionPixelOffset(ga2.o.e4, aVar2.G.intValue());
        }
        aVar2.I = Integer.valueOf(intValue5);
        if (aVar.J != null) {
            intValue6 = aVar.J.intValue();
        } else {
            intValue6 = b2.getDimensionPixelOffset(ga2.o.i4, aVar2.H.intValue());
        }
        aVar2.J = Integer.valueOf(intValue6);
        aVar2.K = Integer.valueOf(aVar.K == null ? 0 : aVar.K.intValue());
        aVar2.L = Integer.valueOf(aVar.L != null ? aVar.L.intValue() : 0);
        b2.recycle();
        if (aVar.A != null) {
            aVar2.A = aVar.A;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            aVar2.A = locale;
        }
        this.c = aVar;
    }

    private TypedArray b(Context context, @t2 int i, @q0 int i2, @m2 int i3) {
        AttributeSet attributeSet;
        int i4;
        if (i != 0) {
            AttributeSet a2 = td2.a(context, i, b);
            i4 = a2.getStyleAttribute();
            attributeSet = a2;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        return cf2.j(context, attributeSet, ga2.o.W3, i2, i4 == 0 ? i3 : i4, new int[0]);
    }

    private static int v(Context context, @x1 TypedArray typedArray, @n2 int i) {
        return sg2.a(context, typedArray, i).getDefaultColor();
    }

    public void A(int i) {
        this.c.E = Integer.valueOf(i);
        this.d.E = Integer.valueOf(i);
    }

    public void B(@w0 int i) {
        this.c.w = Integer.valueOf(i);
        this.d.w = Integer.valueOf(i);
    }

    public void C(@l2 int i) {
        this.c.D = i;
        this.d.D = i;
    }

    public void D(CharSequence charSequence) {
        this.c.B = charSequence;
        this.d.B = charSequence;
    }

    public void E(@b2 int i) {
        this.c.C = i;
        this.d.C = i;
    }

    public void F(@b1(unit = 1) int i) {
        this.c.I = Integer.valueOf(i);
        this.d.I = Integer.valueOf(i);
    }

    public void G(@b1(unit = 1) int i) {
        this.c.G = Integer.valueOf(i);
        this.d.G = Integer.valueOf(i);
    }

    public void H(int i) {
        this.c.z = i;
        this.d.z = i;
    }

    public void I(int i) {
        this.c.y = i;
        this.d.y = i;
    }

    public void J(Locale locale) {
        this.c.A = locale;
        this.d.A = locale;
    }

    public void K(@b1(unit = 1) int i) {
        this.c.J = Integer.valueOf(i);
        this.d.J = Integer.valueOf(i);
    }

    public void L(@b1(unit = 1) int i) {
        this.c.H = Integer.valueOf(i);
        this.d.H = Integer.valueOf(i);
    }

    public void M(boolean z) {
        this.c.F = Boolean.valueOf(z);
        this.d.F = Boolean.valueOf(z);
    }

    public void a() {
        I(-1);
    }

    @b1(unit = 1)
    public int c() {
        return this.d.K.intValue();
    }

    @b1(unit = 1)
    public int d() {
        return this.d.L.intValue();
    }

    public int e() {
        return this.d.x;
    }

    @w0
    public int f() {
        return this.d.v.intValue();
    }

    public int g() {
        return this.d.E.intValue();
    }

    @w0
    public int h() {
        return this.d.w.intValue();
    }

    @l2
    public int i() {
        return this.d.D;
    }

    public CharSequence j() {
        return this.d.B;
    }

    @b2
    public int k() {
        return this.d.C;
    }

    @b1(unit = 1)
    public int l() {
        return this.d.I.intValue();
    }

    @b1(unit = 1)
    public int m() {
        return this.d.G.intValue();
    }

    public int n() {
        return this.d.z;
    }

    public int o() {
        return this.d.y;
    }

    public Locale p() {
        return this.d.A;
    }

    public a q() {
        return this.c;
    }

    @b1(unit = 1)
    public int r() {
        return this.d.J.intValue();
    }

    @b1(unit = 1)
    public int s() {
        return this.d.H.intValue();
    }

    public boolean t() {
        return this.d.y != -1;
    }

    public boolean u() {
        return this.d.F.booleanValue();
    }

    public void w(@b1(unit = 1) int i) {
        this.c.K = Integer.valueOf(i);
        this.d.K = Integer.valueOf(i);
    }

    public void x(@b1(unit = 1) int i) {
        this.c.L = Integer.valueOf(i);
        this.d.L = Integer.valueOf(i);
    }

    public void y(int i) {
        this.c.x = i;
        this.d.x = i;
    }

    public void z(@w0 int i) {
        this.c.v = Integer.valueOf(i);
        this.d.v = Integer.valueOf(i);
    }

    /* compiled from: BadgeState.java */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0279a();
        private static final int s = -1;
        private static final int t = -2;
        private Locale A;
        @z1
        private CharSequence B;
        @b2
        private int C;
        @l2
        private int D;
        private Integer E;
        private Boolean F;
        @b1(unit = 1)
        private Integer G;
        @b1(unit = 1)
        private Integer H;
        @b1(unit = 1)
        private Integer I;
        @b1(unit = 1)
        private Integer J;
        @b1(unit = 1)
        private Integer K;
        @b1(unit = 1)
        private Integer L;
        @t2
        private int u;
        @w0
        private Integer v;
        @w0
        private Integer w;
        private int x;
        private int y;
        private int z;

        /* compiled from: BadgeState.java */
        /* renamed from: com.p7700g.p99005.za2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0279a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: a */
            public a createFromParcel(@x1 Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
            this.x = 255;
            this.y = -2;
            this.z = -2;
            this.F = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            parcel.writeInt(this.u);
            parcel.writeSerializable(this.v);
            parcel.writeSerializable(this.w);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
            parcel.writeInt(this.z);
            CharSequence charSequence = this.B;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.C);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.K);
            parcel.writeSerializable(this.L);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.A);
        }

        public a(@x1 Parcel parcel) {
            this.x = 255;
            this.y = -2;
            this.z = -2;
            this.F = Boolean.TRUE;
            this.u = parcel.readInt();
            this.v = (Integer) parcel.readSerializable();
            this.w = (Integer) parcel.readSerializable();
            this.x = parcel.readInt();
            this.y = parcel.readInt();
            this.z = parcel.readInt();
            this.B = parcel.readString();
            this.C = parcel.readInt();
            this.E = (Integer) parcel.readSerializable();
            this.G = (Integer) parcel.readSerializable();
            this.H = (Integer) parcel.readSerializable();
            this.I = (Integer) parcel.readSerializable();
            this.J = (Integer) parcel.readSerializable();
            this.K = (Integer) parcel.readSerializable();
            this.L = (Integer) parcel.readSerializable();
            this.F = (Boolean) parcel.readSerializable();
            this.A = (Locale) parcel.readSerializable();
        }
    }
}