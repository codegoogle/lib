package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.p7700g.p99005.tk;
import com.p7700g.p99005.x1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@x1 Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(@x1 Parcel parcel, int i) {
        zzb(parcel, i);
    }

    public static void writeBigDecimal(@x1 Parcel parcel, int i, @x1 BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        zzb(parcel, zza);
    }

    public static void writeBigDecimalArray(@x1 Parcel parcel, int i, @x1 BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        zzb(parcel, zza);
    }

    public static void writeBigInteger(@x1 Parcel parcel, int i, @x1 BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeByteArray(bigInteger.toByteArray());
        zzb(parcel, zza);
    }

    public static void writeBigIntegerArray(@x1 Parcel parcel, int i, @x1 BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, zza);
    }

    public static void writeBoolean(@x1 Parcel parcel, int i, boolean z) {
        zzc(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void writeBooleanArray(@x1 Parcel parcel, int i, @x1 boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeBooleanArray(zArr);
        zzb(parcel, zza);
    }

    public static void writeBooleanList(@x1 Parcel parcel, int i, @x1 List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).booleanValue() ? 1 : 0);
        }
        zzb(parcel, zza);
    }

    public static void writeBooleanObject(@x1 Parcel parcel, int i, @x1 Boolean bool, boolean z) {
        if (bool != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeBundle(@x1 Parcel parcel, int i, @x1 Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeBundle(bundle);
        zzb(parcel, zza);
    }

    public static void writeByte(@x1 Parcel parcel, int i, byte b) {
        zzc(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void writeByteArray(@x1 Parcel parcel, int i, @x1 byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeByteArray(bArr);
        zzb(parcel, zza);
    }

    public static void writeByteArrayArray(@x1 Parcel parcel, int i, @x1 byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, zza);
    }

    public static void writeByteArraySparseArray(@x1 Parcel parcel, int i, @x1 SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeByteArray(sparseArray.valueAt(i2));
        }
        zzb(parcel, zza);
    }

    public static void writeChar(@x1 Parcel parcel, int i, char c) {
        zzc(parcel, i, 4);
        parcel.writeInt(c);
    }

    public static void writeCharArray(@x1 Parcel parcel, int i, @x1 char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeCharArray(cArr);
        zzb(parcel, zza);
    }

    public static void writeDouble(@x1 Parcel parcel, int i, double d) {
        zzc(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void writeDoubleArray(@x1 Parcel parcel, int i, @x1 double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeDoubleArray(dArr);
        zzb(parcel, zza);
    }

    public static void writeDoubleList(@x1 Parcel parcel, int i, @x1 List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeDouble(list.get(i2).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeDoubleObject(@x1 Parcel parcel, int i, @x1 Double d, boolean z) {
        if (d != null) {
            zzc(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeDoubleSparseArray(@x1 Parcel parcel, int i, @x1 SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeDouble(sparseArray.valueAt(i2).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloat(@x1 Parcel parcel, int i, float f) {
        zzc(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void writeFloatArray(@x1 Parcel parcel, int i, @x1 float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeFloatArray(fArr);
        zzb(parcel, zza);
    }

    public static void writeFloatList(@x1 Parcel parcel, int i, @x1 List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeFloat(list.get(i2).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloatObject(@x1 Parcel parcel, int i, @x1 Float f, boolean z) {
        if (f != null) {
            zzc(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeFloatSparseArray(@x1 Parcel parcel, int i, @x1 SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeFloat(sparseArray.valueAt(i2).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIBinder(@x1 Parcel parcel, int i, @x1 IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeStrongBinder(iBinder);
        zzb(parcel, zza);
    }

    public static void writeIBinderArray(@x1 Parcel parcel, int i, @x1 IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeBinderArray(iBinderArr);
        zzb(parcel, zza);
    }

    public static void writeIBinderList(@x1 Parcel parcel, int i, @x1 List<IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeBinderList(list);
        zzb(parcel, zza);
    }

    public static void writeIBinderSparseArray(@x1 Parcel parcel, int i, @x1 SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeStrongBinder(sparseArray.valueAt(i2));
        }
        zzb(parcel, zza);
    }

    public static void writeInt(@x1 Parcel parcel, int i, int i2) {
        zzc(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void writeIntArray(@x1 Parcel parcel, int i, @x1 int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeIntArray(iArr);
        zzb(parcel, zza);
    }

    public static void writeIntegerList(@x1 Parcel parcel, int i, @x1 List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIntegerObject(@x1 Parcel parcel, int i, @x1 Integer num, boolean z) {
        if (num != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeList(@x1 Parcel parcel, int i, @x1 List list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeList(list);
        zzb(parcel, zza);
    }

    public static void writeLong(@x1 Parcel parcel, int i, long j) {
        zzc(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void writeLongArray(@x1 Parcel parcel, int i, @x1 long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeLongArray(jArr);
        zzb(parcel, zza);
    }

    public static void writeLongList(@x1 Parcel parcel, int i, @x1 List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(list.get(i2).longValue());
        }
        zzb(parcel, zza);
    }

    public static void writeLongObject(@x1 Parcel parcel, int i, @x1 Long l, boolean z) {
        if (l != null) {
            zzc(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeParcel(@x1 Parcel parcel, int i, @x1 Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        zzb(parcel, zza);
    }

    public static void writeParcelArray(@x1 Parcel parcel, int i, @x1 Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelList(@x1 Parcel parcel, int i, @x1 List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcel parcel2 = list.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelSparseArray(@x1 Parcel parcel, int i, @x1 SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            Parcel valueAt = sparseArray.valueAt(i2);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelable(@x1 Parcel parcel, int i, @x1 Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        zzb(parcel, zza);
    }

    public static void writePendingIntent(@x1 Parcel parcel, int i, @x1 PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
        zzb(parcel, zza);
    }

    public static void writeShort(@x1 Parcel parcel, int i, short s) {
        zzc(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void writeSparseBooleanArray(@x1 Parcel parcel, int i, @x1 SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeSparseBooleanArray(sparseBooleanArray);
        zzb(parcel, zza);
    }

    public static void writeSparseIntArray(@x1 Parcel parcel, int i, @x1 SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseIntArray.keyAt(i2));
            parcel.writeInt(sparseIntArray.valueAt(i2));
        }
        zzb(parcel, zza);
    }

    public static void writeSparseLongArray(@x1 Parcel parcel, int i, @x1 SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseLongArray.keyAt(i2));
            parcel.writeLong(sparseLongArray.valueAt(i2));
        }
        zzb(parcel, zza);
    }

    public static void writeString(@x1 Parcel parcel, int i, @x1 String str, boolean z) {
        if (str == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeString(str);
        zzb(parcel, zza);
    }

    public static void writeStringArray(@x1 Parcel parcel, int i, @x1 String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeStringArray(strArr);
        zzb(parcel, zza);
    }

    public static void writeStringList(@x1 Parcel parcel, int i, @x1 List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeStringList(list);
        zzb(parcel, zza);
    }

    public static void writeStringSparseArray(@x1 Parcel parcel, int i, @x1 SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeString(sparseArray.valueAt(i2));
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedArray(@x1 Parcel parcel, int i, @x1 T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, i2);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedList(@x1 Parcel parcel, int i, @x1 List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, 0);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@x1 Parcel parcel, int i, @x1 SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            T valueAt = sparseArray.valueAt(i2);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzb(parcel, zza);
    }

    private static int zza(Parcel parcel, int i) {
        parcel.writeInt(i | tk.c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzc(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}