package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public abstract class ll2 implements Parcelable {
    public static final Parcelable.Creator<ll2> CREATOR = new pm2();

    public static ll2 e(PendingIntent pendingIntent, boolean z) {
        return new om2(pendingIntent, false);
    }

    public abstract PendingIntent c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(c(), 0);
        parcel.writeInt(d() ? 1 : 0);
    }
}