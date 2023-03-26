package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: NotificationConfig.java */
/* loaded from: classes.dex */
public class tq0 implements Parcelable {
    public static final Parcelable.Creator<tq0> CREATOR = new a();
    public static final int s = 0;
    @z1
    private b A;
    @z1
    private b B;
    @z1
    private b C;
    private int D;
    @z1
    private String E;
    private final long t;
    @z1
    private final String u;
    @z1
    private final Bitmap v;
    private final boolean w;
    @x1
    private final String x;
    @z1
    private b y;
    @z1
    private b z;

    /* compiled from: NotificationConfig.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<tq0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public tq0 createFromParcel(Parcel parcel) {
            return new tq0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public tq0[] newArray(int i) {
            return new tq0[i];
        }
    }

    @r2
    public tq0(@z1 String str, @x1 String str2, @z1 b bVar) {
        this.D = 0;
        this.u = str;
        this.w = false;
        this.v = null;
        this.t = System.currentTimeMillis();
        this.x = str2;
        this.y = bVar;
    }

    @x1
    public String c() {
        return this.x;
    }

    @z1
    public String d() {
        return this.E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public b e() {
        return this.z;
    }

    @z1
    public b g() {
        return this.B;
    }

    @z1
    public b i() {
        return this.C;
    }

    @z1
    public Bitmap j() {
        return this.v;
    }

    @z1
    public b k() {
        return this.y;
    }

    @z1
    public b l() {
        return this.A;
    }

    public int m() {
        return this.D;
    }

    @z1
    public String n() {
        return this.u;
    }

    public boolean o() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeLong(this.t);
        parcel.writeString(this.u);
        parcel.writeParcelable(this.v, i);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.D);
        parcel.writeString(this.x);
        parcel.writeParcelable(this.y, i);
        parcel.writeParcelable(this.A, i);
        parcel.writeParcelable(this.B, i);
        parcel.writeParcelable(this.C, i);
        parcel.writeParcelable(this.z, i);
        parcel.writeString(this.E);
    }

    /* compiled from: NotificationConfig.java */
    /* loaded from: classes.dex */
    public static class b implements Parcelable {
        @x1
        public static final Parcelable.Creator<b> CREATOR = new a();
        @x1
        private final String s;
        @x1
        private final String t;

        /* compiled from: NotificationConfig.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        @r2
        public b(@x1 String str, @x1 String str2) {
            this.s = str;
            this.t = str2;
        }

        @x1
        public String c() {
            return this.t;
        }

        @x1
        public String d() {
            return this.s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("StateNotification{");
            stringBuffer.append("title='");
            stringBuffer.append(this.s);
            stringBuffer.append('\'');
            stringBuffer.append(", message='");
            stringBuffer.append(this.t);
            stringBuffer.append('\'');
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            parcel.writeString(this.s);
            parcel.writeString(this.t);
        }

        public b(@x1 Parcel parcel) {
            this.s = parcel.readString();
            this.t = parcel.readString();
        }
    }

    public tq0(@x1 Parcel parcel) {
        this.D = 0;
        this.t = parcel.readLong();
        this.u = parcel.readString();
        this.v = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.w = parcel.readByte() != 0;
        this.D = parcel.readInt();
        this.x = parcel.readString();
        this.y = (b) parcel.readParcelable(b.class.getClassLoader());
        this.A = (b) parcel.readParcelable(b.class.getClassLoader());
        this.B = (b) parcel.readParcelable(b.class.getClassLoader());
        this.C = (b) parcel.readParcelable(b.class.getClassLoader());
        this.z = (b) parcel.readParcelable(b.class.getClassLoader());
        this.E = parcel.readString();
    }
}