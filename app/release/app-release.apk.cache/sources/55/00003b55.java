package com.p7700g.p99005;

import android.os.Parcel;

/* compiled from: ParcelCompat.java */
/* loaded from: classes.dex */
public final class bn {
    private bn() {
    }

    public static boolean a(@x1 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(@x1 Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}