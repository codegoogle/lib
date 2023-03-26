package com.p7700g.p99005;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class ql2 {
    private static final ClassLoader a = ql2.class.getClassLoader();

    private ql2() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(wo1.l("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }
}