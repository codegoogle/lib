package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zzag;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @x1
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromBytes(@x1 byte[] bArr, @x1 Parcelable.Creator<T> creator) {
        Preconditions.checkNotNull(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @KeepForSdk
    @z1
    public static <T extends SafeParcelable> T deserializeFromIntentExtra(@x1 Intent intent, @x1 String str, @x1 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    @x1
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromString(@x1 String str, @x1 Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @z1
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(@x1 Bundle bundle, @x1 String str, @x1 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @KeepForSdk
    @z1
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(@x1 Bundle bundle, @x1 String str, @x1 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    @z1
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBytes(@z1 byte[] bArr, @x1 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    @z1
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(@x1 Intent intent, @x1 String str, @x1 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @KeepForSdk
    @z1
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(@x1 Intent intent, @x1 String str, @x1 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToBundle(@x1 Iterable<T> iterable, @x1 Bundle bundle, @x1 String str) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(serializeToBytes(t));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void serializeIterableToBundleSafe(@x1 Iterable<T> iterable, @x1 Bundle bundle, @x1 String str) {
        bundle.putByteArray(str, zza(iterable));
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToIntentExtra(@x1 Iterable<T> iterable, @x1 Intent intent, @x1 String str) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(serializeToBytes(t));
        }
        intent.putExtra(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(@x1 Iterable<T> iterable, @x1 Intent intent, @x1 String str) {
        intent.putExtra(str, zza(iterable));
    }

    @x1
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeToBytes(@x1 T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeToIntentExtra(@x1 T t, @x1 Intent intent, @x1 String str) {
        intent.putExtra(str, serializeToBytes(t));
    }

    @x1
    @KeepForSdk
    public static <T extends SafeParcelable> String serializeToString(@x1 T t) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }

    private static byte[] zza(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzag.zzj(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}