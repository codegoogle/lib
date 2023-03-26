package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Ig  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0726Ig {
    public static byte[] A00;
    public static String[] A01;
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final int[] A0A;

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A0U() {
        A00 = new byte[]{-40, -32, 4, 33, 38, 45, 48, -13, -7, 38, 28, bx.W5, 39, 33, 28, -40, -51, -48, 3, -23, -43, -18, 9, -43, 14, -40, -43, bx.j7, 5, 35, -38, 37, -47, -6, 46, 54, 46, 54, 46, 54, 46, 54, -5, 46, -1, -6, 46, 54, 46, 54, -5, 46, -1, -6, 46, 54, 46, 54, -5, 45, 38, 70, 47, -6, 46, 54, 46, 54, -5, 12, -6, 46, 54, 46, 54, -5, 12, -6, 46, 54, 46, 54, -5, -6, 45, 46, 0, -2, 47, -6, 46, 54, -3, -5, -5, 17, -6, 45, 44, 76, 47, 78, -6, -6, 46, -3, 78, 46, -1, -5, -6, 46, 54, 17, 46, 54, -5, 12, 17, -6, 46, 54, 46, 54, -5, -5, -5, 17, -16, -25, -8, -20, -55, 2, -54, -3, -12, -43, -15, -26, -2, -22, -9, -47, -18, -25, -76, -73, -77, -67, -77, -71, 1, 0, -14, bx.l7, -28, -1, -55, -50, -54, -32, -15, -55, -55, -4, -47, -50, -38, -2, -53, -54, -6, -54, -32, -55, -55, -4, -47, -50, -38, -2, -53, -54, -18, -54, -32, -55, -55, -4, -47, -50, -38, -2, -53, -54, -27, -54, -32, -55, -11, -55, -55, -4, -47, -50, -38, -2, -53, -54, -23, -54, -32, -55, -55, -4, -47, -50, -38, -2, -53, -54, -18, -54, -32, -55, -55, -4, -47, -50, -38, -49, -2, -53, -54, -12, -54, -32, -54, -32, -59, 3, 6, 9, 2};
    }

    public static void A0V() {
        A01 = new String[]{"OUVH8uooqfZhRjAIdfTByGEz8oRZsv97", "zwLe5czFvrzgWLxx1jU82T7WkmJFGmFa", "eY5LtUfPqkDg74OjVCyNlMlM5clj8vGG", "7e2Wg6fQOHKlG3pOdXEcbT27Kf8nm98Y", "00xy", "XMUm", "8d2GFVLCqYdUjn", "V0KiqMMFF26dnG06XaQkCu6KzWv5VLPl"};
    }

    static {
        A0V();
        A0U();
        A02 = (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(A03);
        String A0J = A0J(WKSRecord.Service.CISCO_FNA, 2, 95);
        sb.append(A0J);
        sb.append(A06);
        sb.append(A0J);
        sb.append(A05);
        sb.append(A0J);
        sb.append(A02);
        A04 = sb.toString();
        A08 = Pattern.compile(A0J(33, 95, 101));
        A09 = Pattern.compile(A0J(157, 84, 52));
        A07 = Pattern.compile(A0J(16, 17, 59));
        A0A = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int A01(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        return 131072;
                    }
                    throw new IllegalStateException();
                }
                return 13107200;
            }
            return 3538944;
        }
        return 16777216;
    }

    public static int A02(int i) {
        if (i != 8) {
            if (i != 16) {
                if (i != 24) {
                    if (A01[7].charAt(9) != 'R') {
                        String[] strArr = A01;
                        strArr[1] = "o2RW8OxNxplgokuXxXMfYyyzs2crag93";
                        strArr[2] = "CC3jMXKkKFYgIdmJh2HVAiafoYaw56yD";
                        if (i != 32) {
                            return 0;
                        }
                        return 1073741824;
                    }
                    throw new RuntimeException();
                }
                return Integer.MIN_VALUE;
            }
            return 2;
        }
        return 3;
    }

    public static int A03(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A04(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int A05(int i, int i2) {
        if (i != Integer.MIN_VALUE) {
            if (i != 1073741824) {
                if (i == 2) {
                    return i2 * 2;
                }
                if (i == 3) {
                    return i2;
                }
                if (A01[0].charAt(22) != 'E') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "xmFnlLfDlkmgoCJzWXOPDTkVceE7vC5Q";
                strArr[2] = "vdv9qgJMAF7gDXTK0FDhsaXIVyCj2cDL";
                if (i != 4) {
                    throw new IllegalArgumentException();
                }
            }
            return i2 * 4;
        }
        return i2 * 3;
    }

    public static int A06(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int A07(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int A08(String str) {
        int result = str.length();
        I1.A03(result <= 4);
        int i = 0;
        for (int i2 = 0; i2 < result; i2++) {
            int i3 = str.charAt(i2);
            i = (i << 8) | i3;
        }
        return i;
    }

    public static int A09(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = (i3 << 8) ^ A0A[((i3 >>> 24) ^ (bArr[i] & 255)) & 255];
            i++;
        }
        return i3;
    }

    public static int A0A(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                binarySearch--;
            }
        }
        return z2 ? Math.min(jArr.length - 1, binarySearch) : binarySearch;
    }

    public static int A0B(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (A01[7].charAt(9) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "bjYgwsFaniVg3KmdX152FYnlIJpDqbBS";
                strArr[2] = "rh3pSGiNWBYg5ggjhnEOewx4qEYSrmXe";
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                binarySearch++;
            }
        }
        return z2 ? Math.max(0, binarySearch) : binarySearch;
    }

    public static long A0C(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = j * f;
        String[] strArr = A01;
        if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "Ir2i9910xeYGEf";
        strArr2[6] = "Ir2i9910xeYGEf";
        return Math.round(d);
    }

    public static long A0D(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j / f);
    }

    public static long A0E(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long A0F(long multiplicationFactor, long j, long j2) {
        if (j2 >= j && j2 % j == 0) {
            long divisionFactor = multiplicationFactor / (j2 / j);
            return divisionFactor;
        } else if (j2 < j && j % j2 == 0) {
            return multiplicationFactor * (j / j2);
        } else {
            double d = j;
            String[] strArr = A01;
            if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "AZlDHNUOPlHgc7R7na69mBD3Abcl9cBo";
            strArr2[2] = "277QpyU1yDygazm68FxNRmoTloUVz7mm";
            return (long) (multiplicationFactor * (d / j2));
        }
    }

    public static long A0G(long result, long j, long j2) {
        long j3 = result + j;
        if (((result ^ j3) & (j ^ j3)) < 0) {
            return j2;
        }
        return j3;
    }

    public static long A0H(long result, long j, long j2) {
        long j3 = result - j;
        if (((result ^ j) & (result ^ j3)) < 0) {
            return j2;
        }
        return j3;
    }

    public static long A0I(long maxPositionUs, C0533Af c0533Af, long j, long j2) {
        if (C0533Af.A04.equals(c0533Af)) {
            return maxPositionUs;
        }
        long A0H = A0H(maxPositionUs, c0533Af.A01, Long.MIN_VALUE);
        long A0G = A0G(maxPositionUs, c0533Af.A00, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = A0H <= j && j <= A0G;
        z = (A0H > j2 || j2 > A0G) ? false : false;
        if (z2 && z) {
            if (Math.abs(j - maxPositionUs) <= Math.abs(j2 - maxPositionUs)) {
                return j;
            }
            return j2;
        } else if (z2) {
            return j;
        } else {
            if (z) {
                return j2;
            }
            return A0H;
        }
    }

    public static String A0K(Context context, String str) {
        String packageName;
        try {
            packageName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            packageName = A0J(WKSRecord.Service.STATSRV, 1, 86);
        }
        return str + A0J(WKSRecord.Service.CISCO_SYS, 1, 45) + packageName + A0J(0, 16, 75) + Build.VERSION.RELEASE + A0J(128, 2, 90) + A0J(WKSRecord.Service.INGRES_NET, 18, 24);
    }

    @Nullable
    public static String A0L(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return A0M(str);
        }
    }

    public static String A0M(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String A0N(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String A0O(String str) {
        int percentCharacterCount = str.length();
        int i = 0;
        for (int i2 = 0; i2 < percentCharacterCount; i2++) {
            if (str.charAt(i2) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i3 = percentCharacterCount - (i * 2);
        StringBuilder sb = new StringBuilder(i3);
        Matcher matcher = A07.matcher(str);
        int i4 = 0;
        while (i > 0 && matcher.find()) {
            int startOfNotEscaped = Integer.parseInt(matcher.group(1), 16);
            char c = (char) startOfNotEscaped;
            int startOfNotEscaped2 = matcher.start();
            sb.append((CharSequence) str, i4, startOfNotEscaped2);
            sb.append(c);
            i4 = matcher.end();
            i--;
        }
        if (i4 < percentCharacterCount) {
            sb.append((CharSequence) str, i4, percentCharacterCount);
        }
        int length = sb.length();
        String[] strArr = A01;
        if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "60ez1RHojKn5oOlO8qVtxWEnppO7SBlh";
        strArr2[0] = "60ez1RHojKn5oOlO8qVtxWEnppO7SBlh";
        if (length != i3) {
            return null;
        }
        return sb.toString();
    }

    public static String A0P(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0Q(byte[] bArr) {
        return new String(bArr, Charset.forName(A0J(152, 5, 63)));
    }

    public static String A0R(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName(A0J(152, 5, 63)));
    }

    public static String A0S(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(A0J(WKSRecord.Service.CISCO_FNA, 2, 95));
            }
        }
        return sb.toString();
    }

    public static ExecutorService A0T(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC0725If(str));
    }

    public static void A0W(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A0X(HM hm) {
        if (hm != null) {
            try {
                hm.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0Y(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0Z(Throwable th) {
        A0a(th);
    }

    public static <T extends Throwable> void A0a(Throwable th) throws Throwable {
        throw th;
    }

    public static void A0b(long[] jArr, long j, long j2) {
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = jArr[i] / j3;
                String[] strArr = A01;
                if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[1] = "s0FY2QjhDMSgaIZxb47pyGCkoKsYBuuX";
                strArr2[2] = "OmWU9dpRSkGgYNmEJrV8zsr2Naib8MwM";
            }
        } else if (j2 < j && j % j2 == 0) {
            long j4 = j / j2;
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = jArr[i2] * j4;
            }
        } else {
            double d = j / j2;
            for (int i3 = 0; i3 < jArr.length; i3++) {
                jArr[i3] = (long) (jArr[i3] * d);
            }
        }
    }

    public static boolean A0c(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    public static boolean A0d(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    public static boolean A0e(int i) {
        return i == 10 || i == 13;
    }

    public static boolean A0f(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String A0J = A0J(241, 4, 48);
            if (A01[0].charAt(22) != 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "8R32";
            strArr[5] = "dLkW";
            if (!A0J.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0g(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A0h(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] A0i(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < i; i++) {
            int i2 = i * 2;
            int stringOffset = Character.digit(str.charAt(i2), 16);
            int i3 = stringOffset << 4;
            int stringOffset2 = i2 + 1;
            bArr[i] = (byte) (i3 + Character.digit(str.charAt(stringOffset2), 16));
        }
        return bArr;
    }

    public static byte[] A0j(String str) {
        return str.getBytes(Charset.forName(A0J(152, 5, 63)));
    }

    public static int[] A0k(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int i = list.size();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        return iArr;
    }

    public static <T> T[] A0l(T[] tArr, int i) {
        I1.A03(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static String[] A0m(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0n(String str, String str2) {
        return str.split(str2, 2);
    }
}