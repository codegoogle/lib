package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.2S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2S<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08;
    public int[] A01 = C2I.A00;
    public Object[] A02 = C2I.A02;
    public int A00 = 0;

    static {
        A05();
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        if (A08[5].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "Xtbm9MFCOkvOfDux5Me3XhO5K6Bs7EUd";
        strArr[1] = "PZcI0QBOeZ0LYFf6gJzuFWLZdUoY6utj";
        A07 = new byte[]{-69, 7, -5, -4, 6, -77, -32, -12, 3, -68, -62, -74, 3, 5};
    }

    public static void A05() {
        A08 = new String[]{"BrVHgBkmBksyBnnjIq0pHnqXAu9AUg3j", "iIth6RrlZFIJsCIcgsKekGbs32ChyRjv", "Uwdt1z4SmD1Mf7UvGeSYdNXOfhFYTYnY", "QITUqyWPG2VnlGrB2a6hYhF3R3KaavLD", "arDW8RiIBmWFNCZvgTvY8WvuJ76u3VTs", "pOGA2rk9V0ZEl", "438Cia9wbNYnLnXWpHR8BTCUnyjltaF2", "slnYcYZFDBEgJMtczrpzy3D6NQdPiCOq"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        int index = this.A00;
        if (index == 0) {
            return -1;
        }
        int A02 = A02(this.A01, index, 0);
        if (A02 < 0) {
            return A02;
        }
        if (this.A02[A02 << 1] == null) {
            return A02;
        }
        int i = A02 + 1;
        while (i < index) {
            int end = this.A01[i];
            if (end != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[2];
            String str2 = strArr[4];
            int charAt = str.charAt(15);
            int end2 = str2.charAt(15);
            if (charAt != end2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[5] = "5BliZlAS3QBBz9o";
            strArr2[5] = "5BliZlAS3QBBz9o";
            int end3 = i << 1;
            if (objArr[end3] == null) {
                return i;
            }
            i++;
        }
        for (int i2 = A02 - 1; i2 >= 0; i2--) {
            int end4 = this.A01[i2];
            if (end4 != 0) {
                break;
            }
            int end5 = i2 << 1;
            if (this.A02[end5] == null) {
                return i2;
            }
        }
        int end6 = i ^ (-1);
        return end6;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int end) {
        int i = this.A00;
        if (i == 0) {
            if (A08[7].charAt(6) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[7] = "y399iLZYsEEz0hzdxnUhzykHYZJwaaUE";
            strArr[7] = "y399iLZYsEEz0hzdxnUhzykHYZJwaaUE";
            return -1;
        }
        int A02 = A02(this.A01, i, end);
        if (A02 < 0) {
            return A02;
        }
        if (obj.equals(this.A02[A02 << 1])) {
            return A02;
        }
        int i2 = A02 + 1;
        while (i2 < i && this.A01[i2] == end) {
            if (obj.equals(this.A02[i2 << 1])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = A02 - 1; i3 >= 0 && this.A01[i3] == end; i3--) {
            if (obj.equals(this.A02[i3 << 1])) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public static int A02(int[] iArr, int i, int i2) {
        try {
            return C2I.A02(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A06(int i) {
        if (i == 8) {
            synchronized (S9.class) {
                if (A06 != null) {
                    Object[] objArr = A06;
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else {
            String[] strArr = A08;
            if (strArr[0].charAt(11) == strArr[1].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "y7mBVvZiAqPkicRJB5fzBa6x2fmSG8Hq";
            strArr2[7] = "y7mBVvZiAqPkicRJB5fzBa6x2fmSG8Hq";
            if (i == 4) {
                synchronized (S9.class) {
                    if (A05 != null) {
                        Object[] objArr2 = A05;
                        this.A02 = objArr2;
                        A05 = (Object[]) objArr2[0];
                        this.A01 = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        A03--;
                        return;
                    }
                }
            }
        }
        this.A01 = new int[i];
        this.A02 = new Object[i << 1];
    }

    public static void A07(int[] iArr, Object[] objArr, int i) {
        if (iArr.length != 8) {
            if (iArr.length == 4) {
                synchronized (S9.class) {
                    if (A03 < 10) {
                        objArr[0] = A05;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        A05 = objArr;
                        A03++;
                    }
                }
            }
        } else if (A08[5].length() == 11) {
            throw new RuntimeException();
        } else {
            String[] strArr = A08;
            strArr[7] = "zLkFwVZRQmO2pmmfCTMSdjo5f8ctaykz";
            strArr[7] = "zLkFwVZRQmO2pmmfCTMSdjo5f8ctaykz";
            synchronized (S9.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        int i = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    int i3 = i2 >> 1;
                    return i3;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                int i5 = i4 >> 1;
                return i5;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A09(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A0A(int i) {
        return (K) this.A02[i << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i) {
        int i2;
        Object[] objArr = this.A02;
        V v = (V) objArr[(i << 1) + 1];
        int i3 = this.A00;
        if (i3 <= 1) {
            A07(this.A01, objArr, i3);
            this.A01 = C2I.A00;
            this.A02 = C2I.A02;
            i2 = 0;
        } else {
            i2 = i3 - 1;
            int[] iArr = this.A01;
            int osize = iArr.length;
            int i4 = 8;
            if (osize > 8) {
                int i5 = this.A00;
                int osize2 = iArr.length;
                if (i5 < osize2 / 3) {
                    if (i3 > 8) {
                        int osize3 = i3 >> 1;
                        i4 = i3 + osize3;
                    }
                    int[] iArr2 = this.A01;
                    Object[] objArr2 = this.A02;
                    A06(i4);
                    if (i3 == this.A00) {
                        if (i > 0) {
                            int[] ohashes = this.A01;
                            System.arraycopy(iArr2, 0, ohashes, 0, i);
                            System.arraycopy(objArr2, 0, this.A02, 0, i << 1);
                        }
                        if (i < i2) {
                            System.arraycopy(iArr2, i + 1, this.A01, i, i2 - i);
                            System.arraycopy(objArr2, (i + 1) << 1, this.A02, i << 1, (i2 - i) << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
            }
            if (i < i2) {
                int[] iArr3 = this.A01;
                System.arraycopy(iArr3, i + 1, iArr3, i, i2 - i);
                Object[] objArr3 = this.A02;
                System.arraycopy(objArr3, (i + 1) << 1, objArr3, i << 1, (i2 - i) << 1);
            }
            Object[] objArr4 = this.A02;
            objArr4[i2 << 1] = null;
            objArr4[(i2 << 1) + 1] = null;
        }
        int i6 = this.A00;
        String[] strArr = A08;
        String str = strArr[0];
        String str2 = strArr[1];
        int charAt = str.charAt(11);
        int osize4 = str2.charAt(11);
        if (charAt != osize4) {
            String[] strArr2 = A08;
            strArr2[0] = "xFHRCOjHDqSI1UlNRZSx5FadcPcGQITj";
            strArr2[1] = "4ZMke5GLOi53P3lo3UgzHK3l5Qzb3367";
            if (i3 == i6) {
                this.A00 = i2;
                return v;
            }
            throw new ConcurrentModificationException();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i) {
        return (V) this.A02[(i << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0D(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A02;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0E(int i) {
        int i2 = this.A00;
        if (this.A01.length < i) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A06(i);
            if (this.A00 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i2);
                System.arraycopy(objArr, 0, this.A02, 0, i2 << 1);
            }
            A07(iArr, objArr, i2);
        }
        if (this.A00 == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            int i = this.A00;
            this.A01 = C2I.A00;
            Object[] oarray = C2I.A02;
            this.A02 = oarray;
            this.A00 = 0;
            A07(iArr, objArr, i);
        }
        if (this.A00 <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        return A09(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        return A08(obj) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
        return false;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<?, ?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2S) {
            C2S c2s = (C2S) obj;
            if (size() != c2s.size()) {
                return false;
            }
            int i = 0;
            while (true) {
                try {
                    int i2 = this.A00;
                    if (i >= i2) {
                        return true;
                    }
                    K A0A = A0A(i);
                    V A0C = A0C(i);
                    Object obj2 = c2s.get(A0A);
                    if (A0C == null) {
                        if (obj2 != null || !c2s.containsKey(A0A)) {
                            break;
                        }
                    } else if (!A0C.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException unused) {
                    return false;
                } catch (NullPointerException unused2) {
                    return false;
                }
            }
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map<?, ?> map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (true) {
                try {
                    int i4 = this.A00;
                    if (i3 >= i4) {
                        return true;
                    }
                    K A0A2 = A0A(i3);
                    V A0C2 = A0C(i3);
                    Object obj3 = map.get(A0A2);
                    if (A0C2 == null) {
                        if (obj3 != null || !map.containsKey(A0A2)) {
                            break;
                        }
                    } else if (!A0C2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException unused3) {
                    return false;
                } catch (NullPointerException unused4) {
                    return false;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        int A09 = A09(obj);
        if (A09 >= 0) {
            return (V) this.A02[(A09 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i = 0;
        int v = 0;
        int s = 1;
        int i2 = this.A00;
        while (v < i2) {
            Object obj = objArr[s];
            i += iArr[v] ^ (obj == null ? 0 : obj.hashCode());
            v++;
            s += 2;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V put(K k, V v) {
        int hashCode;
        int A01;
        int n = this.A00;
        if (k == null) {
            hashCode = 0;
            A01 = A00();
        } else {
            hashCode = k.hashCode();
            A01 = A01(k, hashCode);
        }
        if (A01 >= 0) {
            int i = (A01 << 1) + 1;
            Object[] objArr = this.A02;
            V value = (V) objArr[i];
            objArr[i] = v;
            return value;
        }
        int i2 = A01 ^ (-1);
        if (n >= this.A01.length) {
            int i3 = 4;
            if (n >= 8) {
                i3 = (n >> 1) + n;
            } else if (n >= 4) {
                i3 = 8;
            }
            int[] iArr = this.A01;
            Object[] objArr2 = this.A02;
            A06(i3);
            if (n == this.A00) {
                int[] iArr2 = this.A01;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
                }
                A07(iArr, objArr2, n);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 < n) {
            int[] iArr3 = this.A01;
            System.arraycopy(iArr3, i2, iArr3, i2 + 1, n - i2);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i2 << 1, objArr3, (i2 + 1) << 1, (this.A00 - i2) << 1);
        }
        int i4 = this.A00;
        if (n == i4) {
            int[] iArr4 = this.A01;
            if (i2 < iArr4.length) {
                iArr4[i2] = hashCode;
                Object[] objArr4 = this.A02;
                objArr4[i2 << 1] = k;
                objArr4[(i2 << 1) + 1] = v;
                this.A00 = i4 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int A09 = A09(obj);
        if (A09 >= 0) {
            return A0B(A09);
        }
        String[] strArr = A08;
        if (strArr[2].charAt(15) != strArr[4].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[5] = "POG7nMkVNzdGaGlGxNMu0E80q";
        strArr2[5] = "POG7nMkVNzdGaGlGxNMu0E80q";
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2S != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (isEmpty()) {
            return A03(12, 2, 31);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < i; i++) {
            if (i > 0) {
                sb.append(A03(10, 2, 45));
            }
            K A0A = A0A(i);
            if (A08[5].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "5MoFeGsxqoTSR8Y6IShdOiE5VevAoRo0";
            strArr[3] = "kGPruxXsJMcA49LPD5OztVvQJS4oto1Y";
            String A032 = A03(0, 10, 42);
            if (A0A != this) {
                sb.append(A0A);
            } else {
                sb.append(A032);
            }
            sb.append('=');
            Object value = A0C(i);
            if (value != this) {
                sb.append(value);
            } else {
                sb.append(A032);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}