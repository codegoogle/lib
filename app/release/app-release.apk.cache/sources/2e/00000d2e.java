package com.facebook.ads.internal.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.redexgen.X.C0726Ig;
import com.facebook.ads.redexgen.X.H0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static String[] A0I;
    public static final DefaultTrackSelector$Parameters A0J;
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    @Nullable
    public final String A07;
    @Nullable
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A0G;
    public final SparseBooleanArray A0H;

    public static void A01() {
        A0I = new String[]{"1uD1IV7D8X2FSwLSySpsMcd3fQZ0OK2I", "X8JDcoZekK8R8v3vEfyFt4rHK", "De3gnuhyaRRo1wIKKb0tF8p3R", "K68eMOOAXfhu3P8i4BL4WgotL7owvGg9", "YDqiP1KrSZLqrk6j1D4tO3HA5vwhMr0w", "rlifz9RYl4Hvs6rNSrBLCbq", "exa3hMIhu9HiMPspfK9jv5JkxYqQeWLn", "xGeCbtaF5ov5ZPZJ4BZzeMzjm9y5yA79"};
    }

    static {
        A01();
        A0J = new DefaultTrackSelector$Parameters();
        CREATOR = new H0();
    }

    public DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = C0726Ig.A0g(parcel);
        this.A00 = parcel.readInt();
        this.A0D = C0726Ig.A0g(parcel);
        this.A09 = C0726Ig.A0g(parcel);
        this.A0A = C0726Ig.A0g(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = C0726Ig.A0g(parcel);
        this.A0B = C0726Ig.A0g(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = C0726Ig.A0g(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, @Nullable String str, @Nullable String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = C0726Ig.A0L(str);
        this.A08 = C0726Ig.A0L(str2);
        this.A0E = z;
        this.A00 = i;
        this.A0D = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A0C = z5;
        this.A0B = z6;
        this.A06 = i5;
        this.A05 = i6;
        this.A0F = z7;
        this.A04 = i7;
    }

    public static SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A00(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(readInt);
        for (int rendererIndex = 0; rendererIndex < readInt; rendererIndex++) {
            int overrideCount = parcel.readInt();
            int readInt2 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt2);
            for (int i = 0; i < readInt2; i++) {
                DefaultTrackSelector$SelectionOverride override = (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader());
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), override);
            }
            sparseArray.put(overrideCount, hashMap);
        }
        return sparseArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(Parcel parcel, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        int i = 0;
        while (i < size) {
            int overrideCount = sparseArray.keyAt(i);
            Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt = sparseArray.valueAt(i);
            int size2 = valueAt.size();
            parcel.writeInt(overrideCount);
            parcel.writeInt(size2);
            Iterator<Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> it = valueAt.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String[] strArr = A0I;
                if (strArr[1].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[4] = "Yf5UDYoyCKDeBovWDXdmYX2icwRNMgWM";
                strArr2[4] = "Yf5UDYoyCKDeBovWDXdmYX2icwRNMgWM";
                if (hasNext) {
                    Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> next = it.next();
                    parcel.writeParcelable(next.getKey(), 0);
                    parcel.writeParcelable(next.getValue(), 0);
                }
            }
        }
    }

    public static boolean A03(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            int indexInSecond = sparseArray2.indexOfKey(sparseArray.keyAt(i));
            if (indexInSecond < 0 || !A05(sparseArray.valueAt(i), sparseArray2.valueAt(indexInSecond))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A04(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        if (sparseBooleanArray2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A05(Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map, Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : map.entrySet()) {
            TrackGroupArray key = entry.getKey();
            if (!map2.containsKey(key) || !C0726Ig.A0h(entry.getValue(), map2.get(key))) {
                return false;
            }
            while (r3.hasNext()) {
            }
        }
        return true;
    }

    @Nullable
    public final DefaultTrackSelector$SelectionOverride A06(int i, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map = this.A0G.get(i);
        if (map != null) {
            return map.get(trackGroupArray);
        }
        return null;
    }

    public final boolean A07(int i) {
        return this.A0H.get(i);
    }

    public final boolean A08(int i, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map = this.A0G.get(i);
        return map != null && map.containsKey(trackGroupArray);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            if (A0I[5].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[0] = "PTX86aGNYIw9JX3myOulYVpgRV6aH44E";
            strArr[0] = "PTX86aGNYIw9JX3myOulYVpgRV6aH44E";
            if (cls == cls2) {
                DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
                return this.A0E == defaultTrackSelector$Parameters.A0E && this.A00 == defaultTrackSelector$Parameters.A00 && this.A0D == defaultTrackSelector$Parameters.A0D && this.A09 == defaultTrackSelector$Parameters.A09 && this.A0A == defaultTrackSelector$Parameters.A0A && this.A03 == defaultTrackSelector$Parameters.A03 && this.A02 == defaultTrackSelector$Parameters.A02 && this.A0C == defaultTrackSelector$Parameters.A0C && this.A0B == defaultTrackSelector$Parameters.A0B && this.A0F == defaultTrackSelector$Parameters.A0F && this.A06 == defaultTrackSelector$Parameters.A06 && this.A05 == defaultTrackSelector$Parameters.A05 && this.A01 == defaultTrackSelector$Parameters.A01 && this.A04 == defaultTrackSelector$Parameters.A04 && TextUtils.equals(this.A07, defaultTrackSelector$Parameters.A07) && TextUtils.equals(this.A08, defaultTrackSelector$Parameters.A08) && A04(this.A0H, defaultTrackSelector$Parameters.A0H) && A03(this.A0G, defaultTrackSelector$Parameters.A0G);
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A0D ? 1 : 0;
        int result2 = this.A0A ? 1 : 0;
        int result3 = this.A02;
        int result4 = this.A0B ? 1 : 0;
        int result5 = this.A06;
        int result6 = this.A01;
        int i = (((((((((((((((((((((((((((this.A0E ? 1 : 0) * 31) + this.A00) * 31) + result) * 31) + (this.A09 ? 1 : 0)) * 31) + result2) * 31) + this.A03) * 31) + result3) * 31) + (this.A0C ? 1 : 0)) * 31) + result4) * 31) + (this.A0F ? 1 : 0)) * 31) + result5) * 31) + this.A05) * 31) + result6) * 31) + this.A04) * 31;
        String str = this.A07;
        int result7 = str == null ? 0 : str.hashCode();
        int i2 = (i + result7) * 31;
        String str2 = this.A08;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        A02(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        C0726Ig.A0W(parcel, this.A0E);
        parcel.writeInt(this.A00);
        C0726Ig.A0W(parcel, this.A0D);
        C0726Ig.A0W(parcel, this.A09);
        C0726Ig.A0W(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        C0726Ig.A0W(parcel, this.A0C);
        C0726Ig.A0W(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        C0726Ig.A0W(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}