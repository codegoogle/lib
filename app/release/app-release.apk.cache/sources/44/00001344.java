package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.yg1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Ph  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0901Ph {
    public static byte[] A0G;
    public static String[] A0H;
    public static final String A0I;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AbstractRunnableC0770Kc A04;
    public C0902Pi A05;
    public Map<String, Integer> A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final Handler A0B;
    public final View A0C;
    public final C1080Wh A0D;
    public final WeakReference<AbstractC0900Pg> A0E;
    public final boolean A0F;

    public static String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A0G = new byte[]{-40, -32, -35, -26, -23, 30, -35, -35, bx.j7, -28, 45, 55, -28, -60, 27, 13, 24, 12, -60, 22, 9, 5, 23, 19, 18, -34, -60, -79, -91, -19, -62, -89, -54, -122, -49, bx.l7, -122, -43, -44, -122, -38, -43, -42, -122, -43, -52, -122, -38, -50, -53, -122, -78, -43, -55, -47, bx.l7, -55, -40, -53, -53, -44, -108, -58, -28, -15, -15, -14, -9, -93, -22, -24, -9, -93, -17, -14, -26, -28, -9, -20, -14, -15, -93, -14, -15, -93, -10, -26, -11, -24, -24, -15, -79, -86, -43, -53, bx.l7, -44, -115, -38, -122, -45, -57, -47, -53, -122, bx.l7, -53, -44, bx.l7, -53, -122, -38, -43, -122, bx.l7, -53, -38, -122, -55, -50, -53, -55, -47, -122, -49, -44, -38, -53, -40, -36, -57, -46, -122, -52, -43, -40, -122, -44, -43, -44, -109, -40, -53, -42, -53, -57, -38, -122, -55, -50, -53, -55, -47, -53, -40, -108, -16, 10, 30, 12, 26, 6, 23, 9, -59, 14, 24, -59, 20, 7, 24, 25, 23, 26, 8, 25, 14, 19, 12, -59, 27, 14, 10, 28, -45, -23, -7, 8, -5, -5, 4, -74, -1, 9, -74, 4, 5, 10, -74, -1, 4, 10, -5, 8, -9, -7, 10, -1, 12, -5, -60, -64, -44, -47, -116, -32, -43, -49, -41, -47, -34, -116, -49, -51, -38, -38, -37, -32, -116, -50, -47, -116, -38, -47, -45, -51, -32, -43, -30, -47, 28, 47, 43, 61, -26, bx.j7, -19, -21, -84, -28, -33, bx.j7, -29, -32, -19, -19, -23, -84, -33, -30, -15, -84, -25, -20, -14, -29, -16, -20, -33, -22, -84, -12, -25, -29, -11, -84, -60, -13, -22, -22, -47, bx.j7, -16, -29, -29, -20, -65, -30, -46, -19, -19, -22, -32, -33, -16, -2, -46, -11, -25, -6, -10, 8, -79, -7, -14, 4, -79, -6, -1, 7, -6, 4, -6, -13, -3, -10, -79, -11, -6, -2, -10, -1, 4, -6, 0, -1, 4, -79, -71, 8, -50, 40, -4, 31, 17, 36, 32, 50, -37, 35, 28, 46, -37, 41, bx.W5, -37, 43, 28, 45, 32, 41, 47, -23, -28, -72, -37, -51, -32, -36, -18, -105, -32, -22, -105, -27, -26, -21, -105, -35, -20, -29, -29, -16, -105, -26, -27, -105, -22, -38, -23, -36, -36, -27, -105, -33, -26, -23, -32, -15, -26, -27, -21, -40, -29, -29, -16, -91, -29, -73, -38, -52, -33, -37, -19, -106, -33, -23, -106, -28, -27, -22, -106, -20, -33, -23, -33, -40, -30, -37, -106, -36, -24, -27, -29, -106, -22, -34, -37, -106, -40, -27, -22, -22, -27, -29, -92, 4, -40, -5, -19, 0, -4, 14, -73, 0, 10, -73, 5, 6, Flags.CD, -73, 13, 0, 10, 0, -7, 3, -4, -73, -3, 9, 6, 4, -73, Flags.CD, -1, -4, -73, Flags.CD, 6, 7, -59, 54, 10, 45, 31, 50, 46, 64, -23, 50, 60, -23, 55, 62, 53, 53, -9, -17, -61, -26, -40, -21, -25, -7, -94, -21, -11, -94, -10, -15, -15, -94, -10, -12, -29, -16, -11, -14, -29, -12, -25, -16, -10, -80, 40, -4, 31, 17, 36, 32, 50, -37, 36, 46, -37, 49, 36, 46, 36, 29, 39, 32, -23, 62, 18, 53, 39, 58, 54, 72, -15, 65, 50, 67, 54, ax5.a, 69, -15, 58, 68, -15, ax5.a, 64, 69, -15, 68, 54, 69, -15, 69, 64, -15, 39, 26, 36, 26, 19, 29, 22, -1, 64, 20, 55, 41, 60, 56, 74, -13, 73, 60, 70, 60, 53, ax5.a, 56, -13, 52, 69, 56, 52, -13, 60, 70, -13, 71, 66, 66, -13, 70, 64, 52, ax5.a, ax5.a, -13, 46, -8, 1, 5, 57, -8, -8, -13, 73, 60, 70, 60, 53, ax5.a, 56, -1, -13, 54, 72, 69, 69, 56, 65, 71, -13, 71, 59, 69, 56, 70, 59, 66, ax5.a, 55, -13, -8, 1, 5, 57, -8, -8, 48, 22, -22, 13, -1, 18, 14, 32, -55, 32, 18, 23, 13, 24, 32, -55, 18, 28, -55, 23, 24, 29, -55, 28, 14, 29, -55, 29, 24, -55, -1, -14, -4, -14, -21, -11, -18, -41, 39, 40, 45, bx.l7, 47, 34, 30, 48, 26, 27, 37, 30, 34, 20, 18, 5, 1, 19, -3, -2, 8, 1, 59, 53, 9, 5, -10, 19, 17, -19, -33, -28, -38, -27, -19};
    }

    public static void A0N() {
        A0H = new String[]{"4lWoymCKcFFqvR4KGqpukkAdeBkDHFLG", "4SfXhahvn2cvHTwc", "1H78NFRDPNrHyZuRtW6OfnE16", "5zR7eGXCNOES3F", "tNutlosLurIud7dAWRzPLPvdzTHVgEY0", "XrTXE7Mp98Q", "ALMz8CaD4gcY6rgjWR0f79B0Q", "oMfYSWXrIKFBNYq7bMfMNj8ewYt05Dn"};
    }

    static {
        A0N();
        A0M();
        A0I = C0901Ph.class.getSimpleName();
    }

    public C0901Ph(View view, int i, int i2, boolean z, WeakReference<AbstractC0900Pg> weakReference, C1080Wh c1080Wh) {
        this.A0B = new Handler();
        this.A01 = 0;
        this.A02 = 1000;
        this.A08 = true;
        this.A05 = new C0902Pi(C0R.A0M);
        this.A06 = new HashMap();
        this.A03 = 0L;
        this.A00 = 0;
        this.A07 = true;
        this.A0D = c1080Wh;
        this.A0C = view;
        if (this.A0C.getId() == -1) {
            C0795Le.A0N(this.A0C);
        }
        this.A0A = i;
        this.A0E = weakReference;
        this.A0F = z;
        if (i2 < 0) {
            if (BuildConfigApi.isDebug()) {
                Log.w(A0I, A0H(211, 29, 20));
            }
            i2 = 0;
        }
        this.A09 = i2;
    }

    public C0901Ph(View view, int i, WeakReference<AbstractC0900Pg> weakReference, C1080Wh c1080Wh) {
        this(view, i, 0, false, weakReference, c1080Wh);
    }

    public C0901Ph(View view, int i, boolean z, WeakReference<AbstractC0900Pg> weakReference, C1080Wh c1080Wh) {
        this(view, i, 0, z, weakReference, c1080Wh);
    }

    @VisibleForTesting
    public static float A00(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    @VisibleForTesting
    public static int A01(int viewArea, View view) {
        int width = view.getWidth() * view.getHeight();
        return (int) Math.max(viewArea, Math.ceil(width > 0 ? 100.0f / width : 100.0f));
    }

    public static /* synthetic */ int A05(C0901Ph c0901Ph) {
        int i = c0901Ph.A00;
        c0901Ph.A00 = i + 1;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Incorrect condition in loop: B:20:0x00a4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A08(Vector<Rect> vector) {
        int i;
        int size = vector.size();
        int[] iArr = new int[size * 2];
        int[] iArr2 = new int[size * 2];
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, size * 2, size * 2);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Rect elementAt = vector.elementAt(i4);
            int i5 = i2 + 1;
            iArr[i2] = elementAt.left;
            int i6 = i3 + 1;
            int yPos = elementAt.bottom;
            iArr2[i3] = yPos;
            i2 = i5 + 1;
            int yPos2 = elementAt.right;
            iArr[i5] = yPos2;
            i3 = i6 + 1;
            int yPos3 = elementAt.top;
            iArr2[i6] = yPos3;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i7 = 0; i7 < size; i7++) {
            Rect elementAt2 = vector.elementAt(i7);
            int xPos = elementAt2.left;
            int A09 = A09(iArr, xPos);
            int xPos2 = elementAt2.right;
            int A092 = A09(iArr, xPos2);
            int rightEdgeIndex = elementAt2.top;
            int A093 = A09(iArr2, rightEdgeIndex);
            int i8 = elementAt2.bottom;
            int leftEdgeIndex = A0H[0].charAt(24);
            if (leftEdgeIndex != 101) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[5] = "OkBp9M6GoSG";
            strArr[5] = "OkBp9M6GoSG";
            int A094 = A09(iArr2, i8);
            for (int i9 = A09 + 1; i9 <= A092; i9++) {
                for (int m = A093 + 1; m <= A094; m++) {
                    zArr[i9][m] = true;
                }
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i11 < i) {
            int i12 = 0;
            while (true) {
                int i13 = size * 2;
                String[] strArr2 = A0H;
                String str = strArr2[3];
                String str2 = strArr2[6];
                int j = str.length();
                int i14 = str2.length();
                if (j == i14) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0H;
                strArr3[5] = "8mdjYFfHzfR";
                strArr3[5] = "8mdjYFfHzfR";
                if (i12 < i13) {
                    if (zArr[i11][i12]) {
                        int i15 = i11 - 1;
                        int i16 = iArr[i11] - iArr[i15];
                        int j2 = iArr2[i12];
                        int i17 = i12 - 1;
                        i = i16 * (j2 - iArr2[i17]);
                    } else {
                        i = 0;
                    }
                    i10 += i;
                    String[] strArr4 = A0H;
                    String str3 = strArr4[3];
                    String str4 = strArr4[6];
                    int j3 = str3.length();
                    int i18 = str4.length();
                    if (j3 != i18) {
                        String[] strArr5 = A0H;
                        strArr5[5] = "Lo9ucXqSR57";
                        strArr5[5] = "Lo9ucXqSR57";
                        i12++;
                    } else {
                        String[] strArr6 = A0H;
                        strArr6[3] = "Va2huEuqJLy8G9";
                        strArr6[6] = "xLD3f1Ctst12pSyAioan4nQjy";
                        i12 += 0;
                    }
                }
            }
        }
        return i10;
    }

    public static int A09(int[] iArr, int high) {
        int mid = 0;
        int length = iArr.length;
        while (mid < length) {
            int i = ((length - mid) / 2) + mid;
            if (iArr[i] == high) {
                return i;
            }
            int i2 = iArr[i];
            String[] strArr = A0H;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[0] = "QqEyOv5K4c2a7TamOIPTrCyFewVDGSxi";
            strArr2[0] = "QqEyOv5K4c2a7TamOIPTrCyFewVDGSxi";
            if (i2 > high) {
                length = i;
            } else {
                mid = i + 1;
            }
        }
        return -1;
    }

    public static C0902Pi A0E(View view, int i, C1080Wh c1080Wh) {
        DisplayMetrics displayMetrics;
        if (view == null) {
            A0O(null, false, A0H(472, 16, 113));
            return new C0902Pi(C0R.A08);
        }
        boolean A1Y = J8.A1Y(c1080Wh);
        String A0H2 = A0H(534, 37, 121);
        String A0H3 = A0H(331, 22, 99);
        if (A1Y) {
            if (view.getParent() == null) {
                A0O(view, false, A0H3);
                return new C0902Pi(C0R.A0K);
            } else if (!view.isShown()) {
                A0O(view, false, A0H2);
                return new C0902Pi(C0R.A0N);
            }
        } else if (view.getParent() == null) {
            A0O(view, false, A0H3);
            return new C0902Pi(C0R.A0H);
        } else if (!view.isShown()) {
            A0O(view, false, A0H2);
            return new C0902Pi(C0R.A0H);
        }
        if (view.getWindowVisibility() != 0) {
            A0O(view, false, A0H(647, 37, 81));
            return new C0902Pi(C0R.A0I);
        } else if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            A0O(view, false, A0H(295, 36, 57) + view.getMeasuredWidth() + A0H(27, 4, 45) + view.getMeasuredHeight());
            return new C0902Pi(C0R.A0G);
        } else if (A00(view) < 0.9f) {
            A0O(view, false, A0H(488, 27, 42));
            return new C0902Pi(C0R.A0B);
        } else {
            int targetVisibleAreaSize = view.getWidth();
            int height = view.getHeight();
            if (A0H[4].charAt(15) == 'A') {
                String[] strArr = A0H;
                strArr[4] = "6urEtCeD4ew6lB3ALfyGXwnH3LBfrVYN";
                strArr[4] = "6urEtCeD4ew6lB3ALfyGXwnH3LBfrVYN";
                int[] iArr = new int[2];
                try {
                    view.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return new C0902Pi(C0R.A07);
                    }
                    int heightPixels = Build.VERSION.SDK_INT;
                    if (A0H[1].length() == 16) {
                        String[] strArr2 = A0H;
                        strArr2[1] = "Od97VXu84qI514kY";
                        strArr2[1] = "Od97VXu84qI514kY";
                        if (heightPixels >= 17) {
                            Display display = ((WindowManager) c1080Wh.getSystemService(A0H(713, 6, 30))).getDefaultDisplay();
                            displayMetrics = new DisplayMetrics();
                            display.getRealMetrics(displayMetrics);
                        } else {
                            displayMetrics = c1080Wh.getResources().getDisplayMetrics();
                        }
                        Vector<Rect> rectVector = A0K(view);
                        int areaSize = A08(rectVector);
                        rectVector.add(rect);
                        int targetAreaSize = A08(rectVector) - areaSize;
                        int measuredHeight = view.getMeasuredHeight();
                        int areaSize2 = view.getMeasuredWidth();
                        float f = (targetAreaSize * 1.0f) / (measuredHeight * areaSize2);
                        boolean A1R = J8.A1R(c1080Wh);
                        int heightPixels2 = A01(i, view);
                        float f2 = heightPixels2 / 100.0f;
                        if (A1R) {
                            int mViewabilityThreshold = (f > f2 ? 1 : (f == f2 ? 0 : -1));
                            if (mViewabilityThreshold < 0) {
                                A0O(view, false, String.format(Locale.US, A0H(571, 76, 123), Float.valueOf(f), Float.valueOf(f2)));
                                return new C0902Pi(C0R.A04, f);
                            }
                        } else {
                            int mViewabilityThreshold2 = iArr[0];
                            if (mViewabilityThreshold2 < 0 || displayMetrics.widthPixels - iArr[0] < targetVisibleAreaSize) {
                                A0O(view, false, A0H(353, 44, 31));
                                return new C0902Pi(C0R.A0D, f);
                            }
                            int widthPixels = (int) ((height * (100.0d - heightPixels2)) / 100.0d);
                            if (rect.top - iArr[1] > widthPixels) {
                                A0O(view, false, A0H(436, 36, 63));
                                return new C0902Pi(C0R.A0E, f);
                            } else if ((iArr[1] + height) - rect.bottom > widthPixels) {
                                A0O(view, false, A0H(397, 39, 30));
                                return new C0902Pi(C0R.A0C, f);
                            }
                        }
                        if (!C0812Lv.A03(c1080Wh)) {
                            A0O(view, false, A0H(yg1.F, 26, 62));
                            return new C0902Pi(C0R.A0L, f);
                        }
                        Map<String, String> A01 = C0813Lw.A01(c1080Wh);
                        if (C0796Lf.A05(A01)) {
                            A0O(view, false, A0H(156, 29, 77));
                            return new C0902Pi(C0R.A0A, f);
                        } else if (J8.A18(c1080Wh) && C0796Lf.A04(A01)) {
                            A0O(view, false, A0H(31, 31, 14));
                            return new C0902Pi(C0R.A05, f, A01);
                        } else {
                            A0O(view, true, A0H(515, 19, 99));
                            return new C0902Pi(C0R.A0J, f, A01);
                        }
                    }
                } catch (NullPointerException unused) {
                    A0O(view, false, A0H(62, 30, 43));
                    return new C0902Pi(C0R.A0G);
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Vector<Rect> A0K(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childIndex = viewGroup.indexOfChild(view);
        for (int i = childIndex + 1; i < i; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof OV)) {
                vector.addAll(A0L(childAt));
            }
        }
        vector.addAll(A0K(viewGroup));
        return vector;
    }

    public static Vector<Rect> A0L(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!view.isShown() || (Build.VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        int i = (view.getClass().getName().equals(A0H(WKSRecord.Service.LINK, 50, 38)) && view.getBackground() != null && (view.getBackground() instanceof GradientDrawable)) ? 1 : 0;
        if ((view instanceof ViewGroup) && (A0P(view) || i != 0)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                vector.addAll(A0L(viewGroup.getChildAt(i2)));
            }
            return vector;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            vector.add(rect);
        }
        return vector;
    }

    public static void A0O(View view, boolean z, String str) {
        if (BuildConfigApi.isDebug()) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0H(240, 5, 110));
            sb.append(view);
            sb.append(A0H(9, 4, 108));
            sb.append(z ? A0H(698, 8, 68) : A0H(684, 12, 97));
            sb.append(A0H(13, 14, 76));
            sb.append(str);
            sb.toString();
        }
    }

    public static boolean A0P(View view) {
        return view.getBackground() == null || (Build.VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }

    public final synchronized String A0T() {
        String str;
        C0R c0r = C0R.valuesCustom()[this.A05.A01()];
        str = c0r.toString() + String.format(Locale.US, A0H(0, 9, 96), Float.valueOf(this.A05.A00() * 100.0f));
        String[] strArr = A0H;
        if (strArr[2].length() != strArr[7].length()) {
            String[] strArr2 = A0H;
            strArr2[3] = "JOA7A9ZNQCl2Un";
            strArr2[6] = "QxqmxS0D1VLzWHVOZgw4LxCbp";
            return str;
        }
        throw new RuntimeException();
    }

    public final synchronized Map<String, String> A0U() {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.put(A0H(708, 3, 59), String.valueOf(this.A05.A01()));
        hashMap.put(A0H(aa.h.p, 2, 109), String.valueOf(this.A05.A00()));
        hashMap.put(A0H(696, 2, 84), new JSONObject(this.A06).toString());
        hashMap.put(A0H(711, 2, 69), LW.A05(this.A03));
        hashMap.putAll(this.A05.A03());
        return hashMap;
    }

    public final synchronized void A0V() {
        this.A05 = new C0902Pi(C0R.A0M);
    }

    public final synchronized void A0W() {
        if (this.A04 != null) {
            A0X();
        }
        if (this.A07) {
            this.A0D.A0A().A39();
        }
        this.A04 = new C4H(this, this.A0D);
        this.A0B.postDelayed(this.A04, this.A01);
        this.A08 = false;
        this.A00 = 0;
        this.A05 = new C0902Pi(C0R.A0M);
        this.A06 = new HashMap();
    }

    public final synchronized void A0X() {
        if (this.A07) {
            this.A0D.A0A().A3A();
        }
        this.A0B.removeCallbacks(this.A04);
        this.A04 = null;
        this.A08 = true;
        this.A00 = 0;
    }

    public final void A0Y(int i) {
        this.A01 = i;
    }

    public final void A0Z(int i) {
        if (BuildConfigApi.isDebug() && !this.A0F) {
            Log.w(A0I, A0H(92, 64, 14));
        }
        this.A02 = i;
    }

    public final void A0a(boolean z) {
        this.A07 = z;
    }

    public final synchronized boolean A0b() {
        return this.A08;
    }
}