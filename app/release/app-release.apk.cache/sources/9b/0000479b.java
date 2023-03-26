package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: IntentSenderRequest.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    @x1
    public static final Parcelable.Creator<i0> CREATOR = new a();
    @x1
    private final IntentSender s;
    @z1
    private final Intent t;
    private final int u;
    private final int v;

    /* compiled from: IntentSenderRequest.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public i0 createFromParcel(Parcel parcel) {
            return new i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public i0[] newArray(int i) {
            return new i0[i];
        }
    }

    public i0(@x1 IntentSender intentSender, @z1 Intent intent, int i, int i2) {
        this.s = intentSender;
        this.t = intent;
        this.u = i;
        this.v = i2;
    }

    @z1
    public Intent c() {
        return this.t;
    }

    public int d() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.v;
    }

    @x1
    public IntentSender g() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeParcelable(this.s, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
    }

    /* compiled from: IntentSenderRequest.java */
    /* loaded from: classes.dex */
    public static final class b {
        private IntentSender a;
        private Intent b;
        private int c;
        private int d;

        public b(@x1 IntentSender intentSender) {
            this.a = intentSender;
        }

        @x1
        public i0 a() {
            return new i0(this.a, this.b, this.c, this.d);
        }

        @x1
        public b b(@z1 Intent intent) {
            this.b = intent;
            return this;
        }

        @x1
        public b c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }

        public b(@x1 PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    public i0(@x1 Parcel parcel) {
        this.s = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.t = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.u = parcel.readInt();
        this.v = parcel.readInt();
    }
}