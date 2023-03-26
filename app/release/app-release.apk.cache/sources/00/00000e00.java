package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.p7700g.p99005.bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.38  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass38 extends ViewGroup {
    public static byte[] A0u;
    public static String[] A0v;
    public static final int[] A0w;
    public static final Interpolator A0x;
    public static final AnonymousClass37 A0y;
    public static final Comparator<AnonymousClass30> A0z;
    public int A00;
    public AbstractC03382f A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public AnonymousClass33 A0Y;
    public AnonymousClass33 A0Z;
    public AnonymousClass34 A0a;
    public AnonymousClass35 A0b;
    public ClassLoader A0c;
    public ArrayList<View> A0d;
    public List<ViewPager.OnAdapterChangeListener> A0e;
    public List<AnonymousClass33> A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final AnonymousClass30 A0r;
    public final Runnable A0s;
    public final ArrayList<AnonymousClass30> A0t;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0u, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0u = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, 20, -62, 5, 14, 3, 21, 21, -36, -62, -48, 0, 17, 23, 21, 34, -48, 25, 20, -22, -48, -34, 14, 48, 45, 32, bx.W5, 35, 43, 31, 50, 39, 33, -34, 31, 34, 31, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, bx.l7, -26, -26, -25, -20, -104, bx.l7, -36, -36, -104, -24, bx.l7, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, bx.j7, -35, -17, -104, -36, -19, -22, bx.j7, -26, -33, -104, -28, bx.l7, -15, -25, -19, -20, -10, 9, 21, 25, 9, 23, 24, 9, 8, -60, 19, 10, 10, 23, 7, 22, 9, 9, 18, -60, 20, 5, Flags.CD, 9, -60, 16, 13, 17, 13, 24, -60, -10, 10, 7, -62, 3, 18, 18, 14, Flags.CD, 5, 3, 22, Flags.CD, 17, 16, -55, 21, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -62, 5, 10, 3, 16, 9, 7, 6, -62, 22, 10, 7, -62, 3, 6, 3, 18, 22, 7, 20, -55, 21, -62, 5, 17, 16, 22, 7, 16, 22, 21, -62, 25, Flags.CD, 22, 10, 17, 23, 22, -62, 5, 3, 14, 14, Flags.CD, 16, 9, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -59, 16, 17, 22, Flags.CD, 8, 27, -26, 3, 22, 3, -11, 7, 22, -27, 10, 3, 16, 9, 7, 6, -61, -62, -25, 26, 18, 7, 5, 22, 7, 6, -62, 3, 6, 3, 18, 22, 7, 20, -62, Flags.CD, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -62, -19, 0, -4, 14, -25, -8, -2, -4, 9, 25, bx.W5, bx.W5, 39, 47, Flags.CD, 27, bx.W5, 39, 36, 36, -40, 44, bx.W5, 33, 29, 28, -40, 44, 39, -40, 30, 33, 38, 28, -40, 30, 39, 27, 45, 43, -40, 26, 25, 43, 29, 28, -40, 39, 38, -40, 38, 39, 38, -27, 27, 32, 33, 36, 28, -40, 27, 45, bx.W5, bx.W5, 29, 38, 44, -40, 30, 39, 27, 45, 43, 29, 28, -40, 46, 33, 29, 47, -40, 76, 75, 45, 62, 68, 66, 48, 64, 79, 76, 73, 73, 66, 65, -3, 65, 70, 65, -3, 75, 76, 81, -3, 64, 62, 73, 73, -3, 80, 82, 77, 66, 79, 64, 73, 62, 80, 80, -3, 70, 74, 77, 73, 66, 74, 66, 75, 81, 62, 81, 70, 76, 75};
    }

    public static void A0D() {
        A0v = new String[]{"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.ads.redexgen.X.37] */
    static {
        A0D();
        A0C();
        A0w = new int[]{16842931};
        A0z = new Comparator<AnonymousClass30>() { // from class: com.facebook.ads.redexgen.X.2w
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(AnonymousClass30 anonymousClass30, AnonymousClass30 anonymousClass302) {
                return anonymousClass30.A02 - anonymousClass302.A02;
            }
        };
        A0x = new Interpolator() { // from class: com.facebook.ads.redexgen.X.2x
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0y = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.37
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(View view, View view2) {
                AnonymousClass31 anonymousClass31 = (AnonymousClass31) view.getLayoutParams();
                AnonymousClass31 anonymousClass312 = (AnonymousClass31) view2.getLayoutParams();
                if (anonymousClass31.A05 != anonymousClass312.A05) {
                    return anonymousClass31.A05 ? 1 : -1;
                }
                return anonymousClass31.A02 - anonymousClass312.A02;
            }
        };
    }

    public AnonymousClass38(Context context) {
        super(context);
        this.A0t = new ArrayList<>();
        this.A0r = new AnonymousClass30();
        this.A0q = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0c = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0i = true;
        this.A0n = false;
        this.A0s = new Runnable() { // from class: com.facebook.ads.redexgen.X.2y
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass38.this.setScrollState(0);
                AnonymousClass38.this.A0g();
            }
        };
        this.A0P = 0;
        A0E();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.A0H && Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            i += (int) (f + (i >= this.A00 ? 0.4f : 0.6f));
        }
        if (this.A0t.size() > 0) {
            ArrayList<AnonymousClass30> arrayList = this.A0t;
            return Math.max(this.A0t.get(0).A02, Math.min(i, arrayList.get(arrayList.size() - 1).A02));
        }
        return i;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private AnonymousClass30 A03() {
        int clientWidth = getClientWidth();
        float scrollOffset = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        if (clientWidth > 0) {
            float scrollOffset2 = this.A0M;
            scrollOffset = scrollOffset2 / clientWidth;
        }
        int i = -1;
        float leftBound = 0.0f;
        float rightBound = 0.0f;
        boolean z = true;
        AnonymousClass30 anonymousClass30 = null;
        int i2 = 0;
        while (i2 < this.A0t.size()) {
            AnonymousClass30 anonymousClass302 = this.A0t.get(i2);
            if (!z && anonymousClass302.A02 != i + 1) {
                anonymousClass302 = this.A0r;
                anonymousClass302.A00 = leftBound + rightBound + scrollOffset;
                anonymousClass302.A02 = i + 1;
                anonymousClass302.A01 = this.A01.A04(anonymousClass302.A02);
                i2--;
            }
            leftBound = anonymousClass302.A00;
            float rightBound2 = anonymousClass302.A01 + leftBound + scrollOffset;
            if (!z) {
                int i3 = (scrollX > leftBound ? 1 : (scrollX == leftBound ? 0 : -1));
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (i3 < 0) {
                    return anonymousClass30;
                }
            }
            if (scrollX >= rightBound2) {
                int size = this.A0t.size() - 1;
                String[] strArr3 = A0v;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    String[] strArr4 = A0v;
                    strArr4[2] = "sbP3P6ChvdnfvWI";
                    strArr4[2] = "sbP3P6ChvdnfvWI";
                    if (i2 != size) {
                        z = false;
                        i = anonymousClass302.A02;
                        rightBound = anonymousClass302.A01;
                        anonymousClass30 = anonymousClass302;
                        i2++;
                    }
                } else {
                    String[] strArr5 = A0v;
                    strArr5[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    strArr5[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i2 != size) {
                        z = false;
                        i = anonymousClass302.A02;
                        rightBound = anonymousClass302.A01;
                        anonymousClass30 = anonymousClass302;
                        i2++;
                    }
                }
            }
            return anonymousClass302;
        }
        return anonymousClass30;
    }

    private final AnonymousClass30 A04(int i) {
        for (int i2 = 0; i2 < this.A0t.size(); i2++) {
            AnonymousClass30 anonymousClass30 = this.A0t.get(i2);
            if (anonymousClass30.A02 == i) {
                return anonymousClass30;
            }
        }
        return null;
    }

    private final AnonymousClass30 A05(int i, int i2) {
        AnonymousClass30 anonymousClass30 = new AnonymousClass30();
        anonymousClass30.A02 = i;
        anonymousClass30.A03 = this.A01.A08(this, i);
        anonymousClass30.A01 = this.A01.A04(i);
        if (i2 < 0 || i2 >= this.A0t.size()) {
            this.A0t.add(anonymousClass30);
        } else {
            this.A0t.add(i2, anonymousClass30);
        }
        return anonymousClass30;
    }

    private final AnonymousClass30 A06(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    private final AnonymousClass30 A07(View view) {
        for (int i = 0; i < this.A0t.size(); i++) {
            AnonymousClass30 anonymousClass30 = this.A0t.get(i);
            if (this.A01.A0C(view, anonymousClass30.A03)) {
                return anonymousClass30;
            }
        }
        String[] strArr = A0v;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0v;
        strArr2[1] = "T6ty";
        strArr2[1] = "T6ty";
        return null;
    }

    private void A09() {
        this.A0k = false;
        this.A0m = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            strArr2[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    private void A0A() {
        int i = 0;
        while (i < getChildCount()) {
            AnonymousClass31 lp = (AnonymousClass31) getChildAt(i).getLayoutParams();
            if (!lp.A05) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0d;
            if (arrayList == null) {
                this.A0d = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0d.add(getChildAt(i));
            }
            Collections.sort(this.A0d, A0y);
        }
    }

    private final void A0E() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0x);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        C2u.A0A(this, new SH(this));
        if (C2u.A00(this) == 0) {
            C2u.A09(this, 1);
        }
        C2u.A0B(this, new SG(this));
    }

    private void A0F(int i) {
        AnonymousClass33 anonymousClass33 = this.A0Z;
        List<AnonymousClass33> list = this.A0f;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0f.get(i2);
            }
        }
        AnonymousClass33 anonymousClass332 = this.A0Y;
    }

    private void A0G(int i) {
        AnonymousClass33 anonymousClass33 = this.A0Z;
        List<AnonymousClass33> list = this.A0f;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0f.get(i2);
            }
        }
        AnonymousClass33 anonymousClass332 = this.A0Y;
    }

    /* JADX WARN: Incorrect condition in loop: B:152:0x039a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0H(int i) {
        String hexString;
        AnonymousClass30 ii;
        AnonymousClass30 ii2;
        float extraWidthLeft;
        AnonymousClass30 anonymousClass30;
        float extraWidthLeft2;
        AnonymousClass30 anonymousClass302 = null;
        int i2 = this.A00;
        if (i2 != i) {
            anonymousClass302 = A04(i2);
            this.A00 = i;
        }
        if (this.A01 == null) {
            A0B();
        } else if (this.A0o) {
            A0B();
        } else if (getWindowToken() != null) {
            int i3 = this.A0L;
            int max = Math.max(0, this.A00 - i3);
            int pageLimit = this.A01.A05();
            int startPos = this.A00;
            int min = Math.min(pageLimit - 1, startPos + i3);
            int startPos2 = this.A0G;
            if (pageLimit == startPos2) {
                AnonymousClass30 anonymousClass303 = null;
                if (A0v[2].length() != 14) {
                    String[] strArr = A0v;
                    strArr[1] = "Tot0RAE";
                    strArr[1] = "Tot0RAE";
                    int i4 = 0;
                    while (true) {
                        if (i4 >= this.A0t.size()) {
                            break;
                        }
                        AnonymousClass30 anonymousClass304 = this.A0t.get(i4);
                        if (anonymousClass304.A02 >= this.A00) {
                            if (anonymousClass304.A02 == this.A00) {
                                anonymousClass303 = anonymousClass304;
                            }
                        } else {
                            i4++;
                        }
                    }
                    if (anonymousClass303 == null && pageLimit > 0) {
                        int i5 = this.A00;
                        if (A0v[1].length() != 12) {
                            String[] strArr2 = A0v;
                            strArr2[2] = "0";
                            strArr2[2] = "0";
                            anonymousClass303 = A05(i5, i4);
                        } else {
                            String[] strArr3 = A0v;
                            strArr3[4] = "";
                            strArr3[5] = "";
                            anonymousClass303 = A05(i5, i4);
                        }
                    }
                    if (anonymousClass303 != null) {
                        float f = 0.0f;
                        int i6 = i4 - 1;
                        if (i6 >= 0) {
                            AnonymousClass30 ii3 = this.A0t.get(i6);
                            String[] strArr4 = A0v;
                            String str = strArr4[3];
                            String str2 = strArr4[6];
                            int charAt = str.charAt(15);
                            int itemIndex = str2.charAt(15);
                            if (charAt != itemIndex) {
                                String[] strArr5 = A0v;
                                strArr5[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                                strArr5[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                                ii2 = ii3;
                            }
                        } else {
                            ii2 = null;
                        }
                        int clientWidth = getClientWidth();
                        if (clientWidth <= 0) {
                            extraWidthLeft = 0.0f;
                        } else {
                            float f2 = 2.0f - anonymousClass303.A01;
                            int startPos3 = getPaddingLeft();
                            float extraWidthLeft3 = startPos3;
                            extraWidthLeft = (extraWidthLeft3 / clientWidth) + f2;
                        }
                        int itemIndex2 = this.A00;
                        for (int i7 = itemIndex2 - 1; i7 >= 0; i7--) {
                            int itemIndex3 = (f > extraWidthLeft ? 1 : (f == extraWidthLeft ? 0 : -1));
                            if (itemIndex3 >= 0 && i7 < max) {
                                if (ii2 == null) {
                                    break;
                                }
                                int startPos4 = ii2.A02;
                                if (i7 == startPos4 && !ii2.A04) {
                                    this.A0t.remove(i6);
                                    this.A01.A0B(this, i7, ii2.A03);
                                    i6--;
                                    i4--;
                                    if (i6 >= 0) {
                                        ii2 = this.A0t.get(i6);
                                    } else {
                                        ii2 = null;
                                    }
                                }
                            } else {
                                if (ii2 != null) {
                                    int startPos5 = ii2.A02;
                                    if (i7 == startPos5) {
                                        f += ii2.A01;
                                        String[] strArr6 = A0v;
                                        String str3 = strArr6[7];
                                        String str4 = strArr6[0];
                                        int startPos6 = str3.charAt(10);
                                        if (startPos6 == str4.charAt(10)) {
                                            String[] strArr7 = A0v;
                                            strArr7[4] = "";
                                            strArr7[5] = "";
                                            i6--;
                                            if (i6 >= 0) {
                                                AnonymousClass30 ii4 = this.A0t.get(i6);
                                                ii2 = ii4;
                                            } else {
                                                ii2 = null;
                                            }
                                        }
                                    }
                                }
                                AnonymousClass30 ii5 = A05(i7, i6 + 1);
                                f += ii5.A01;
                                i4++;
                                ii2 = i6 >= 0 ? this.A0t.get(i6) : null;
                            }
                        }
                        float f3 = anonymousClass303.A01;
                        int i8 = i4 + 1;
                        int itemIndex4 = (f3 > 2.0f ? 1 : (f3 == 2.0f ? 0 : -1));
                        if (itemIndex4 < 0) {
                            int itemIndex5 = this.A0t.size();
                            if (i8 < itemIndex5) {
                                anonymousClass30 = this.A0t.get(i8);
                            } else {
                                anonymousClass30 = null;
                            }
                            if (clientWidth <= 0) {
                                extraWidthLeft2 = 0.0f;
                            } else {
                                float extraWidthLeft4 = getPaddingRight();
                                float f4 = clientWidth;
                                String[] strArr8 = A0v;
                                String str5 = strArr8[4];
                                String str6 = strArr8[5];
                                int startPos7 = str5.length();
                                if (startPos7 != str6.length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr9 = A0v;
                                strArr9[4] = "";
                                strArr9[5] = "";
                                extraWidthLeft2 = (extraWidthLeft4 / f4) + 2.0f;
                            }
                            for (int i9 = this.A00 + 1; i9 < pageLimit; i9++) {
                                if (f3 >= extraWidthLeft2 && i9 > min) {
                                    if (anonymousClass30 == null) {
                                        break;
                                    } else if (i9 == anonymousClass30.A02 && !anonymousClass30.A04) {
                                        this.A0t.remove(i8);
                                        this.A01.A0B(this, i9, anonymousClass30.A03);
                                        if (i8 < this.A0t.size()) {
                                            anonymousClass30 = this.A0t.get(i8);
                                        } else {
                                            anonymousClass30 = null;
                                        }
                                    }
                                } else if (anonymousClass30 != null && i9 == anonymousClass30.A02) {
                                    f3 += anonymousClass30.A01;
                                    i8++;
                                    anonymousClass30 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                                } else {
                                    AnonymousClass30 A05 = A05(i9, i8);
                                    i8++;
                                    f3 += A05.A01;
                                    anonymousClass30 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                                }
                            }
                        }
                        A0R(anonymousClass303, i4, anonymousClass302);
                    }
                    int childCount = getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = getChildAt(i10);
                        AnonymousClass31 anonymousClass31 = (AnonymousClass31) childAt.getLayoutParams();
                        anonymousClass31.A01 = i10;
                        if (!anonymousClass31.A05 && anonymousClass31.A00 == 0.0f) {
                            AnonymousClass30 A07 = A07(childAt);
                            String[] strArr10 = A0v;
                            if (strArr10[7].charAt(10) != strArr10[0].charAt(10)) {
                                if (A07 == null) {
                                }
                                anonymousClass31.A00 = A07.A01;
                                anonymousClass31.A02 = A07.A02;
                            } else {
                                String[] strArr11 = A0v;
                                strArr11[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                                strArr11[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                                if (A07 == null) {
                                }
                                anonymousClass31.A00 = A07.A01;
                                anonymousClass31.A02 = A07.A02;
                            }
                        }
                    }
                    A0B();
                    String[] strArr12 = A0v;
                    String str7 = strArr12[4];
                    String str8 = strArr12[5];
                    int startPos8 = str7.length();
                    if (startPos8 != str8.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr13 = A0v;
                    strArr13[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
                    strArr13[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
                    if (hasFocus()) {
                        View findFocus = findFocus();
                        String[] strArr14 = A0v;
                        String str9 = strArr14[3];
                        String str10 = strArr14[6];
                        int startPos9 = str9.charAt(15);
                        if (startPos9 == str10.charAt(15)) {
                            throw new RuntimeException();
                        }
                        String[] strArr15 = A0v;
                        strArr15[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                        strArr15[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                        if (findFocus != null) {
                            ii = A06(findFocus);
                        } else {
                            ii = null;
                        }
                        if (ii != null) {
                            int startPos10 = ii.A02;
                            if (startPos10 == this.A00) {
                                return;
                            }
                        }
                        for (int i11 = 0; i11 < i; i11++) {
                            View childAt2 = getChildAt(i11);
                            AnonymousClass30 A072 = A07(childAt2);
                            if (A072 != null) {
                                int startPos11 = A072.A02;
                                if (startPos11 == this.A00 && childAt2.requestFocus(2)) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            } else {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException unused) {
                    int id = getId();
                    int startPos12 = A0v[2].length();
                    if (startPos12 != 14) {
                        String[] strArr16 = A0v;
                        strArr16[2] = "3cJ8G";
                        strArr16[2] = "3cJ8G";
                        hexString = Integer.toHexString(id);
                    }
                }
                throw new IllegalStateException(A08(158, WKSRecord.Service.BL_IDM, 58) + this.A0G + A08(77, 9, 42) + pageLimit + A08(18, 11, 72) + hexString + A08(4, 14, 58) + getClass() + A08(29, 22, 86) + this.A01.getClass());
            }
            throw new RuntimeException();
        }
    }

    private void A0I(int i, float f, int i2) {
        AnonymousClass33 anonymousClass33 = this.A0Z;
        List<AnonymousClass33> list = this.A0f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.A0f.get(i3);
            }
        }
        AnonymousClass33 anonymousClass332 = this.A0Y;
    }

    @CallSuper
    private final void A0J(int scrollX, float f, int paddingLeft) {
        int max;
        if (this.A0D > 0) {
            int i = getScrollX();
            int paddingLeft2 = getPaddingLeft();
            int paddingRight = getPaddingRight();
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
            strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
            int width = getWidth();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                AnonymousClass31 anonymousClass31 = (AnonymousClass31) childAt.getLayoutParams();
                if (anonymousClass31.A05) {
                    int i3 = anonymousClass31.A04 & 7;
                    if (i3 == 1) {
                        int childOffset = childAt.getMeasuredWidth();
                        max = Math.max((width - childOffset) / 2, paddingLeft2);
                    } else if (i3 == 3) {
                        max = paddingLeft2;
                        int childOffset2 = childAt.getWidth();
                        paddingLeft2 += childOffset2;
                    } else if (i3 != 5) {
                        max = paddingLeft2;
                    } else {
                        int childOffset3 = childAt.getMeasuredWidth();
                        max = (width - paddingRight) - childOffset3;
                        int childOffset4 = childAt.getMeasuredWidth();
                        paddingRight += childOffset4;
                    }
                    int childLeft = childAt.getLeft();
                    int i4 = (max + i) - childLeft;
                    if (i4 != 0) {
                        childAt.offsetLeftAndRight(i4);
                    }
                }
            }
        }
        A0I(scrollX, f, paddingLeft);
        if (this.A0a != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = getChildAt(i5);
                if (!((AnonymousClass31) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw null;
                }
            }
        }
        this.A0g = true;
    }

    private final void A0K(int i, int i2, int width) {
        int dy;
        int i3;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        int dx = (scroller == null || scroller.isFinished()) ? 0 : 1;
        if (dx != 0) {
            if (this.A0l) {
                dy = this.A0X.getCurrX();
            } else {
                dy = this.A0X.getStartX();
            }
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            dy = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - dy;
        int velocity = i2 - scrollY;
        if (i4 == 0 && velocity == 0) {
            A0S(false);
            A0g();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i5 = clientWidth / 2;
        float A00 = i5 + (i5 * A00(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth)));
        int halfWidth = Math.abs(width);
        if (halfWidth > 0) {
            float f = halfWidth;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[4] = "";
            strArr[5] = "";
            i3 = Math.round(Math.abs(A00 / f) * 1000.0f) * 4;
        } else {
            float A04 = clientWidth * this.A01.A04(this.A00);
            float abs = Math.abs(i4);
            float pageWidth = this.A0M;
            i3 = (int) ((1.0f + (abs / (pageWidth + A04))) * 100.0f);
        }
        int min = Math.min(i3, 600);
        this.A0l = false;
        this.A0X.startScroll(dy, scrollY, i4, velocity, min);
        C2u.A07(this);
    }

    private void A0L(int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            ArrayList<AnonymousClass30> arrayList = this.A0t;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            strArr2[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean isFinished = this.A0X.isFinished();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0v;
                strArr3[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                strArr3[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!isFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int oldWidthWithMargin = ((i - getPaddingLeft()) - getPaddingRight()) + i3;
                int xpos = ((i2 - getPaddingLeft()) - getPaddingRight()) + i4;
                scrollTo((int) (oldWidthWithMargin * (getScrollX() / xpos)), getScrollY());
                return;
            }
        }
        AnonymousClass30 A04 = A04(this.A00);
        int paddingLeft = (int) (((i - getPaddingLeft()) - getPaddingRight()) * (A04 != null ? Math.min(A04.A00, this.A07) : 0.0f));
        if (paddingLeft != getScrollX()) {
            A0S(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private final void A0M(int i, boolean z) {
        this.A0o = false;
        A0O(i, z, false);
    }

    private void A0N(int destX, boolean z, int i, boolean z2) {
        AnonymousClass30 A04 = A04(destX);
        int i2 = 0;
        if (A04 != null) {
            i2 = (int) (getClientWidth() * Math.max(this.A02, Math.min(A04.A00, this.A07)));
        }
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z) {
            A0K(i2, 0, i);
            if (z2) {
                A0F(destX);
                return;
            }
            return;
        }
        if (z2) {
            A0F(destX);
        }
        A0S(false);
        scrollTo(i2, 0);
        A0a(i2);
    }

    private final void A0O(int i, boolean z, boolean z2) {
        A0P(i, z, z2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r6 < r4) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0P(int i, boolean z, boolean z2, int i2) {
        AbstractC03382f abstractC03382f = this.A01;
        if (abstractC03382f == null || abstractC03382f.A05() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (!z2 && this.A00 == i && this.A0t.size() != 0) {
            setScrollingCacheEnabled(false);
        } else {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.A01.A05()) {
                i = this.A01.A05() - 1;
            }
            int i3 = this.A0L;
            int i4 = this.A00;
            if (i <= i4 + i3) {
                int i5 = i4 - i3;
                String[] strArr = A0v;
                if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[3] = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf";
                strArr2[6] = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF";
            }
            for (int i6 = 0; i6 < this.A0t.size(); i6++) {
                this.A0t.get(i6).A04 = true;
            }
            if (this.A00 == i) {
                z3 = false;
            }
            if (this.A0i) {
                this.A00 = i;
                if (z3) {
                    A0F(i);
                }
                requestLayout();
                return;
            }
            A0H(i);
            A0N(i, z, i2, z3);
        }
    }

    private void A0Q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A08) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[4] = "";
            strArr2[5] = "";
            this.A08 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void A0R(AnonymousClass30 anonymousClass30, int i, AnonymousClass30 anonymousClass302) {
        float f;
        AnonymousClass30 anonymousClass303;
        AnonymousClass30 anonymousClass304;
        int pos = this.A01.A05();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        if (anonymousClass302 != null) {
            int i2 = anonymousClass302.A02;
            if (i2 < anonymousClass30.A02) {
                int i3 = 0;
                float f3 = anonymousClass302.A00 + anonymousClass302.A01 + f2;
                int i4 = i2 + 1;
                while (i4 <= anonymousClass30.A02 && i3 < this.A0t.size()) {
                    AnonymousClass30 anonymousClass305 = this.A0t.get(i3);
                    while (true) {
                        anonymousClass304 = anonymousClass305;
                        if (i4 <= anonymousClass304.A02 || i3 >= this.A0t.size() - 1) {
                            break;
                        }
                        i3++;
                        anonymousClass305 = this.A0t.get(i3);
                    }
                    while (i4 < anonymousClass304.A02) {
                        AbstractC03382f abstractC03382f = this.A01;
                        if (A0v[2].length() == 14) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0v;
                        strArr[2] = "unjnr1JPHveRA3A";
                        strArr[2] = "unjnr1JPHveRA3A";
                        f3 += abstractC03382f.A04(i4) + f2;
                        i4++;
                    }
                    anonymousClass304.A00 = f3;
                    f3 += anonymousClass304.A01 + f2;
                    i4++;
                }
            } else if (i2 > anonymousClass30.A02) {
                int size = this.A0t.size() - 1;
                float f4 = anonymousClass302.A00;
                int i5 = i2 - 1;
                while (i5 >= anonymousClass30.A02 && size >= 0) {
                    AnonymousClass30 anonymousClass306 = this.A0t.get(size);
                    while (true) {
                        anonymousClass303 = anonymousClass306;
                        if (i5 >= anonymousClass303.A02 || size <= 0) {
                            break;
                        }
                        size--;
                        anonymousClass306 = this.A0t.get(size);
                    }
                    while (true) {
                        int i6 = anonymousClass303.A02;
                        String[] strArr2 = A0v;
                        if (strArr2[4].length() != strArr2[5].length()) {
                            String[] strArr3 = A0v;
                            strArr3[1] = "tUoZSKhLB59JJ";
                            strArr3[1] = "tUoZSKhLB59JJ";
                            if (i5 > i6) {
                                f4 -= this.A01.A04(i5) + f2;
                                i5--;
                            }
                        } else {
                            String[] strArr4 = A0v;
                            strArr4[2] = "eK1wjFwqyv9CJUk";
                            strArr4[2] = "eK1wjFwqyv9CJUk";
                            if (i5 > i6) {
                                f4 -= this.A01.A04(i5) + f2;
                                i5--;
                            }
                        }
                    }
                    f4 -= anonymousClass303.A01 + f2;
                    anonymousClass303.A00 = f4;
                    i5--;
                }
            }
        }
        int size2 = this.A0t.size();
        float f5 = anonymousClass30.A00;
        int i7 = anonymousClass30.A02 - 1;
        float offset = anonymousClass30.A02 == 0 ? anonymousClass30.A00 : -3.4028235E38f;
        this.A02 = offset;
        if (anonymousClass30.A02 == pos - 1) {
            float f6 = anonymousClass30.A00;
            float offset2 = anonymousClass30.A01;
            f = (f6 + offset2) - 1.0f;
        } else {
            f = Float.MAX_VALUE;
        }
        this.A07 = f;
        int i8 = i - 1;
        while (i8 >= 0) {
            AnonymousClass30 anonymousClass307 = this.A0t.get(i8);
            while (i7 > anonymousClass307.A02) {
                int i9 = i7 - 1;
                f5 -= this.A01.A04(i7) + f2;
                i7 = i9;
            }
            f5 -= anonymousClass307.A01 + f2;
            anonymousClass307.A00 = f5;
            if (anonymousClass307.A02 == 0) {
                this.A02 = f5;
            }
            i8--;
            i7--;
        }
        float f7 = anonymousClass30.A00 + anonymousClass30.A01 + f2;
        int i10 = anonymousClass30.A02 + 1;
        int i11 = i + 1;
        while (i11 < size2) {
            AnonymousClass30 anonymousClass308 = this.A0t.get(i11);
            while (i10 < anonymousClass308.A02) {
                f7 += this.A01.A04(i10) + f2;
                i10++;
            }
            int i12 = anonymousClass308.A02;
            if (A0v[2].length() != 14) {
                String[] strArr5 = A0v;
                strArr5[3] = "LKMrFShf3NXE5XfaxsCGHUW3hns0S8Wh";
                strArr5[6] = "xptjAJKkekqR5TDnJjimQZvUd22mQJJ9";
                if (i12 != pos - 1) {
                    anonymousClass308.A00 = f7;
                    f7 += anonymousClass308.A01 + f2;
                    i11++;
                    i10++;
                }
                this.A07 = (anonymousClass308.A01 + f7) - 1.0f;
                anonymousClass308.A00 = f7;
                f7 += anonymousClass308.A01 + f2;
                i11++;
                i10++;
            } else {
                if (i12 != pos - 1) {
                    anonymousClass308.A00 = f7;
                    f7 += anonymousClass308.A01 + f2;
                    i11++;
                    i10++;
                }
                this.A07 = (anonymousClass308.A01 + f7) - 1.0f;
                anonymousClass308.A00 = f7;
                f7 += anonymousClass308.A01 + f2;
                i11++;
                i10++;
            }
        }
        this.A0n = false;
    }

    private void A0S(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (true ^ this.A0X.isFinished()) {
                this.A0X.abortAnimation();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[1] = "La7";
                strArr[1] = "La7";
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int oldX = this.A0X.getCurrX();
                int x = this.A0X.getCurrY();
                if (scrollX != oldX || scrollY != x) {
                    scrollTo(oldX, x);
                    if (oldX != scrollX) {
                        A0a(oldX);
                    }
                }
            }
        }
        this.A0o = false;
        for (int i = 0; i < this.A0t.size(); i++) {
            AnonymousClass30 ii = this.A0t.get(i);
            if (ii.A04) {
                z2 = true;
                ii.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                C2u.A0C(this, this.A0s);
            } else {
                this.A0s.run();
            }
        }
    }

    private void A0T(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.A0N : 0, null);
        }
    }

    private void A0U(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0V() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0W() {
        int i = this.A00;
        if (i > 0) {
            A0M(i - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0X() {
        AbstractC03382f abstractC03382f = this.A01;
        if (abstractC03382f != null && this.A00 < abstractC03382f.A05() - 1) {
            A0M(this.A00 + 1, true);
            return true;
        } else if (A0v[2].length() != 14) {
            String[] strArr = A0v;
            strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
            strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
            return false;
        } else {
            throw new RuntimeException();
        }
    }

    private boolean A0Y(float deltaX) {
        ArrayList<AnonymousClass30> arrayList;
        boolean z = false;
        this.A05 = deltaX;
        float scrollX = getScrollX() + (this.A05 - deltaX);
        int clientWidth = getClientWidth();
        float over = clientWidth * this.A02;
        float leftBound = this.A07;
        float f = clientWidth * leftBound;
        boolean z2 = true;
        boolean z3 = true;
        AnonymousClass30 anonymousClass30 = this.A0t.get(0);
        AnonymousClass30 anonymousClass302 = this.A0t.get(arrayList.size() - 1);
        if (anonymousClass30.A02 != 0) {
            z2 = false;
            float f2 = anonymousClass30.A00;
            int width = A0v[1].length();
            if (width == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[1] = "a";
            strArr[1] = "a";
            over = f2 * clientWidth;
        }
        int width2 = anonymousClass302.A02;
        if (width2 != this.A01.A05() - 1) {
            z3 = false;
            f = anonymousClass302.A00 * clientWidth;
        }
        if (scrollX < over) {
            if (z2) {
                this.A0V.onPull(Math.abs(over - scrollX) / clientWidth);
                z = true;
            }
            scrollX = over;
        } else if (scrollX > f) {
            if (z3) {
                EdgeEffect edgeEffect = this.A0W;
                float abs = Math.abs(scrollX - f);
                float f3 = clientWidth;
                String[] strArr2 = A0v;
                String str = strArr2[4];
                String str2 = strArr2[5];
                int width3 = str.length();
                if (width3 != str2.length()) {
                    edgeEffect.onPull(abs / f3);
                    z = true;
                } else {
                    String[] strArr3 = A0v;
                    strArr3[1] = "TwKB2lBmR";
                    strArr3[1] = "TwKB2lBmR";
                    edgeEffect.onPull(abs / f3);
                    z = true;
                }
            }
            scrollX = f;
        }
        this.A05 += scrollX - ((int) scrollX);
        int width4 = (int) scrollX;
        scrollTo(width4, getScrollY());
        A0a((int) scrollX);
        return z;
    }

    private final boolean A0Z(float f, float f2) {
        if (f >= this.A0I || f2 <= 0.0f) {
            if (f > getWidth() - this.A0I) {
                int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (i < 0) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0a(int i) {
        int size = this.A0t.size();
        String A08 = A08(381, 53, 117);
        if (size == 0) {
            if (this.A0i) {
                return false;
            }
            this.A0g = false;
            A0J(0, 0.0f, 0);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[2] = "c3ramapljB1reDSufYjA";
            strArr2[2] = "c3ramapljB1reDSufYjA";
            if (this.A0g) {
                return false;
            }
            throw new IllegalStateException(A08);
        }
        AnonymousClass30 A03 = A03();
        int clientWidth = getClientWidth();
        int i2 = this.A0M;
        int i3 = A03.A02;
        float f = ((i / clientWidth) - A03.A00) / (A03.A01 + (i2 / clientWidth));
        int currentPage = (int) ((clientWidth + i2) * f);
        this.A0g = false;
        A0J(i3, f, currentPage);
        if (this.A0g) {
            return true;
        }
        throw new IllegalStateException(A08);
    }

    private final boolean A0b(int i) {
        View nextFocused = findFocus();
        if (nextFocused == this) {
            nextFocused = null;
        } else if (nextFocused != null) {
            boolean z = false;
            ViewParent parent = nextFocused.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (parent == this) {
                    z = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(nextFocused.getClass().getSimpleName());
                for (ViewParent parent2 = nextFocused.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A08(0, 4, 21));
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(300, 9, 47), A08(309, 72, 80) + sb.toString());
                nextFocused = null;
            }
        }
        boolean z2 = false;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, nextFocused, i);
        if (findNextFocus != null && findNextFocus != nextFocused) {
            if (i == 17) {
                int i2 = A02(this.A0q, findNextFocus).left;
                int currLeft = A02(this.A0q, nextFocused).left;
                z2 = (nextFocused == null || i2 < currLeft) ? findNextFocus.requestFocus() : A0W();
            } else if (i == 66) {
                int i3 = A02(this.A0q, findNextFocus).left;
                int currLeft2 = A02(this.A0q, nextFocused).left;
                z2 = (nextFocused == null || i3 > currLeft2) ? findNextFocus.requestFocus() : A0X();
            }
        } else if (i == 17 || i == 1) {
            z2 = A0W();
        } else if (i == 66 || i == 2) {
            z2 = A0X();
        }
        if (z2) {
            int currLeft3 = SoundEffectConstants.getContantForFocusDirection(i);
            playSoundEffect(currLeft3);
        }
        return z2;
    }

    private final boolean A0c(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return A0W();
            }
            return A0b(17);
        } else if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return A0X();
            }
            return A0b(66);
        } else if (keyCode != 61) {
            return false;
        } else {
            if (keyEvent.hasNoModifiers()) {
                return A0b(2);
            }
            boolean hasModifiers = keyEvent.hasModifiers(1);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[1] = "lC1XoLB2bpdljamdt6Vm";
            strArr2[1] = "lC1XoLB2bpdljamdt6Vm";
            if (!hasModifiers) {
                return false;
            }
            return A0b(1);
        }
    }

    public static boolean A0d(@NonNull View view) {
        Class<?> clazz = view.getClass();
        return clazz.getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0e(View view, boolean z, int scrollX, int scrollY, int count) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX2 = view.getScrollX();
            int scrollY2 = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (scrollY + scrollX2 >= childAt.getLeft() && scrollY + scrollX2 < childAt.getRight() && count + scrollY2 >= childAt.getTop() && count + scrollY2 < childAt.getBottom()) {
                    int left = (scrollY + scrollX2) - childAt.getLeft();
                    int i = count + scrollY2;
                    if (A0v[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0e(childAt, true, scrollX, left, i - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-scrollX);
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x002a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0f() {
        int newCurrItem = this.A01.A05();
        this.A0G = newCurrItem;
        boolean z = this.A0t.size() < (this.A0L * 2) + 1 && this.A0t.size() < newCurrItem;
        int i = this.A00;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < i) {
            AnonymousClass30 anonymousClass30 = this.A0t.get(i2);
            int A06 = this.A01.A06(anonymousClass30.A03);
            if (A06 != -1) {
                if (A06 == -2) {
                    this.A0t.remove(i2);
                    i2--;
                    if (!z2) {
                        z2 = true;
                    }
                    this.A01.A0B(this, anonymousClass30.A02, anonymousClass30.A03);
                    z = true;
                    if (this.A00 == anonymousClass30.A02) {
                        i = Math.max(0, Math.min(this.A00, newCurrItem - 1));
                        z = true;
                    }
                } else if (anonymousClass30.A02 != A06) {
                    if (anonymousClass30.A02 == this.A00) {
                        i = A06;
                    }
                    anonymousClass30.A02 = A06;
                    z = true;
                }
            }
            i2++;
        }
        Collections.sort(this.A0t, A0z);
        if (z) {
            int newCurrItem2 = getChildCount();
            for (int i3 = 0; i3 < newCurrItem2; i3++) {
                View child = getChildAt(i3);
                AnonymousClass31 anonymousClass31 = (AnonymousClass31) child.getLayoutParams();
                if (!anonymousClass31.A05) {
                    anonymousClass31.A00 = 0.0f;
                }
            }
            A0O(i, false, true);
            if (A0v[2].length() == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[2] = "iBz2AIJ6C";
            strArr[2] = "iBz2AIJ6C";
            requestLayout();
        }
    }

    public final void A0g() {
        A0H(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AnonymousClass30 A07;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        AnonymousClass30 A07;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        AnonymousClass31 anonymousClass31 = (AnonymousClass31) layoutParams;
        anonymousClass31.A05 |= A0d(view);
        if (this.A0j) {
            if (!anonymousClass31.A05) {
                anonymousClass31.A03 = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int scrollX = getClientWidth();
        int scrollX2 = getScrollX();
        return i < 0 ? scrollX2 > ((int) (((float) scrollX) * this.A02)) : i > 0 && scrollX2 < ((int) (((float) scrollX) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof AnonymousClass31) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0l = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != currX || scrollY != oldY) {
                scrollTo(currX, oldY);
                if (!A0a(currX)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            C2u.A07(this);
            return;
        }
        A0S(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0c(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AnonymousClass30 ii;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ii = A07(childAt)) != null) {
                int i2 = ii.A02;
                String[] strArr = A0v;
                if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                if (i2 == this.A00 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r4.A05() > 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        r5 = r8.save();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r3 = getWidth();
        r8.rotate(270.0f);
        r0 = getPaddingTop();
        r8.translate((-r4) + r0, r7.A02 * r3);
        r7.A0V.setSize(r4, r3);
        r6 = 0 | r7.A0V.draw(r8);
        r8.restoreToCount(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
        if (r7.A0W.isFinished() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        r3 = r8.save();
        r5 = getWidth();
        r4 = getHeight();
        r0 = getPaddingTop();
        r4 = r4 - r0;
        r0 = getPaddingBottom();
        r4 = r4 - r0;
        r8.rotate(90.0f);
        r0 = getPaddingTop();
        r8.translate(-r0, (-(r7.A07 + 1.0f)) * r5);
        r7.A0W.setSize(r4, r5);
        r6 = r6 | r7.A0W.draw(r8);
        r8.restoreToCount(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int restoreCount = 0;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
                AbstractC03382f abstractC03382f = this.A01;
                String[] strArr = A0v;
                if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[1] = "uCo1AgFx4bPu4bwpitwpleYcuNfeFds";
                strArr2[1] = "uCo1AgFx4bPu4bwpitwpleYcuNfeFds";
                if (abstractC03382f != null) {
                }
            }
            this.A0V.finish();
            this.A0W.finish();
            if (restoreCount == 0) {
                C2u.A07(this);
                return;
            }
            return;
        }
        boolean isFinished = this.A0V.isFinished();
        if (A0v[1].length() != 12) {
            String[] strArr3 = A0v;
            strArr3[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
            strArr3[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
        } else {
            String[] strArr4 = A0v;
            strArr4[4] = "";
            strArr4[5] = "";
        }
        if (restoreCount == 0) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass31();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass31(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC03382f getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return ((AnonymousClass31) this.A0d.get(this.A0F == 2 ? (i - 1) - i2 : i2).getLayoutParams()).A01;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0s);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Incorrect condition in loop: B:14:0x0051 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0t.size() > 0 && this.A01 != null) {
            int firstPos = getScrollX();
            int lastPos = getWidth();
            float widthFactor = this.A0M / lastPos;
            int i = 0;
            AnonymousClass30 anonymousClass30 = this.A0t.get(0);
            float f2 = anonymousClass30.A00;
            int size = this.A0t.size();
            int itemCount = size - 1;
            int itemCount2 = this.A0t.get(itemCount).A02;
            loop0: for (int i2 = anonymousClass30.A02; i2 < itemCount2; i2++) {
                while (i2 > pos && i < size) {
                    i++;
                    AnonymousClass30 anonymousClass302 = this.A0t.get(i);
                    String[] strArr = A0v;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int charAt = str.charAt(10);
                    int pos = str2.charAt(10);
                    if (charAt != pos) {
                        break loop0;
                    }
                    String[] strArr2 = A0v;
                    strArr2[2] = "Qpfq";
                    strArr2[2] = "Qpfq";
                    anonymousClass30 = anonymousClass302;
                }
                int pos2 = anonymousClass30.A02;
                if (i2 == pos2) {
                    f = (anonymousClass30.A00 + anonymousClass30.A01) * lastPos;
                    f2 = anonymousClass30.A00 + anonymousClass30.A01 + widthFactor;
                } else {
                    float A04 = this.A01.A04(i2);
                    float marginOffset = lastPos;
                    f = (f2 + A04) * marginOffset;
                    f2 += A04 + widthFactor;
                }
                int pos3 = this.A0M;
                if (pos3 + f > firstPos) {
                    this.A0S.setBounds(Math.round(f), this.A0Q, Math.round(this.A0M + f), this.A09);
                    Drawable drawable = this.A0S;
                    String[] strArr3 = A0v;
                    if (strArr3[7].charAt(10) != strArr3[0].charAt(10)) {
                        String[] strArr4 = A0v;
                        strArr4[1] = "";
                        strArr4[1] = "";
                        drawable.draw(canvas);
                    } else {
                        String[] strArr5 = A0v;
                        strArr5[4] = "";
                        strArr5[5] = "";
                        drawable.draw(canvas);
                    }
                }
                int i3 = firstPos + lastPos;
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0v;
                strArr6[1] = "DrXdt";
                strArr6[1] = "DrXdt";
                float marginOffset2 = i3;
                if (f > marginOffset2) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0V();
            String[] strArr = A0v;
            if (strArr[4].length() == strArr[5].length()) {
                String[] strArr2 = A0v;
                strArr2[2] = "iW5W";
                strArr2[2] = "iW5W";
                return false;
            }
        } else {
            if (action != 0) {
                if (this.A0k) {
                    return true;
                }
                if (this.A0m) {
                    return false;
                }
            }
            if (action != 0) {
                if (action == 2) {
                    int i = this.A08;
                    if (i != -1) {
                        int pointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(pointerIndex);
                        float x2 = this.A05;
                        float f2 = x - x2;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(pointerIndex);
                        float dx = this.A04;
                        float abs2 = Math.abs(y - dx);
                        if (f2 != 0.0f && !A0Z(this.A05, f2) && A0e(this, false, (int) f2, (int) x, (int) y)) {
                            this.A05 = x;
                            this.A06 = y;
                            this.A0m = true;
                            return false;
                        }
                        float f3 = this.A0R;
                        if (A0v[1].length() != 12) {
                            String[] strArr3 = A0v;
                            strArr3[7] = "NnThZj9Wv9885vPNkfCF8DoAZte0LwUX";
                            strArr3[0] = "g2aolHvSBW8By3vUeqDyYWaFAgdqNGTo";
                            if (abs > f3 && 0.5f * abs > abs2) {
                                this.A0k = true;
                                A0U(true);
                                setScrollState(1);
                                if (f2 > 0.0f) {
                                    float f4 = this.A03;
                                    int i2 = this.A0R;
                                    String[] strArr4 = A0v;
                                    if (strArr4[7].charAt(10) != strArr4[0].charAt(10)) {
                                        f = f4 + i2;
                                    } else {
                                        String[] strArr5 = A0v;
                                        strArr5[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                        strArr5[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                        f = f4 + i2;
                                    }
                                } else {
                                    f = this.A03 - this.A0R;
                                }
                                this.A05 = f;
                                this.A06 = y;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > this.A0R) {
                                this.A0m = true;
                            }
                            if (this.A0k && A0Y(x)) {
                                C2u.A07(this);
                            }
                        }
                    }
                } else if (action == 6) {
                    A0Q(motionEvent);
                }
            } else {
                float yDiff = motionEvent.getX();
                this.A03 = yDiff;
                this.A05 = yDiff;
                float y2 = motionEvent.getY();
                this.A04 = y2;
                this.A06 = y2;
                this.A08 = motionEvent.getPointerId(0);
                this.A0m = false;
                this.A0l = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0S(false);
                    this.A0k = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0o = false;
                    A0g();
                    this.A0k = true;
                    A0U(true);
                    setScrollState(1);
                }
            }
            if (this.A0U == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            return this.A0k;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r2 != 48) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        r14 = com.facebook.ads.redexgen.X.AnonymousClass38.A0v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if (r14[7].charAt(10) == r14[0].charAt(10)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r14 = com.facebook.ads.redexgen.X.AnonymousClass38.A0v;
        r14[2] = "D8xV1TWmEwTp2AdSb5ATv3";
        r14[2] = "D8xV1TWmEwTp2AdSb5ATv3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
        if (r2 == 80) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
        r14 = com.facebook.ads.redexgen.X.AnonymousClass38.A0v;
        r14[3] = "1ewPUp1k8Pl5lyl6fUi6LymHiaJ9xmay";
        r14[6] = "wiWTa2PhZxJDNWnFVxR2jmvUAFeWjohE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
        if (r2 == 80) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
        r0 = r3.getMeasuredHeight();
        r2 = (r8 - r16) - r0;
        r0 = r3.getMeasuredHeight();
        r16 = r16 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
        if (r2 != 48) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
        r2 = r12;
        r0 = r3.getMeasuredHeight();
        r12 = r12 + r0;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        AnonymousClass30 A07;
        int max;
        int max2;
        int paddingBottom = getChildCount();
        int childTop = i3 - i;
        int i5 = i4 - i2;
        int i6 = getPaddingLeft();
        int childLeft = getPaddingTop();
        int paddingRight = getPaddingRight();
        int vgrav = getPaddingBottom();
        int childTop2 = getScrollX();
        int hgrav = 0;
        int paddingLeft = 0;
        while (true) {
            int count = 8;
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                break;
            }
            String[] strArr2 = A0v;
            strArr2[1] = "";
            strArr2[1] = "";
            if (paddingLeft < paddingBottom) {
                View childAt = getChildAt(paddingLeft);
                if (childAt.getVisibility() != 8) {
                    AnonymousClass31 anonymousClass31 = (AnonymousClass31) childAt.getLayoutParams();
                    if (anonymousClass31.A05) {
                        int i7 = anonymousClass31.A04 & 7;
                        int i8 = anonymousClass31.A04 & 112;
                        if (i7 == 1) {
                            int measuredWidth = childAt.getMeasuredWidth();
                            if (A0v[1].length() == 12) {
                                break;
                            }
                            String[] strArr3 = A0v;
                            strArr3[1] = "cEG6crY";
                            strArr3[1] = "cEG6crY";
                            int paddingTop = childTop - measuredWidth;
                            max = Math.max(paddingTop / 2, i6);
                        } else if (i7 == 3) {
                            max = i6;
                            int paddingTop2 = childAt.getMeasuredWidth();
                            i6 += paddingTop2;
                        } else if (i7 != 5) {
                            max = i6;
                        } else {
                            int paddingTop3 = childAt.getMeasuredWidth();
                            max = (childTop - paddingRight) - paddingTop3;
                            int paddingTop4 = childAt.getMeasuredWidth();
                            paddingRight += paddingTop4;
                        }
                        if (i8 != 16) {
                            String[] strArr4 = A0v;
                            if (strArr4[4].length() == strArr4[5].length()) {
                                String[] strArr5 = A0v;
                                strArr5[7] = "MABJA51Hkg88aIvdKLNPKtpDPx4feUgS";
                                strArr5[0] = "re5uoSp4mr8xr4T7F9jmqa7JfXqBIVyF";
                            }
                        } else {
                            int paddingTop5 = childAt.getMeasuredHeight();
                            max2 = Math.max((i5 - paddingTop5) / 2, childLeft);
                        }
                        int i9 = max + childTop2;
                        int paddingTop6 = childAt.getMeasuredHeight();
                        childAt.layout(i9, max2, childAt.getMeasuredWidth() + i9, paddingTop6 + max2);
                        hgrav++;
                    } else {
                        continue;
                    }
                }
                paddingLeft++;
            } else {
                int childTop3 = (childTop - i6) - paddingRight;
                int i10 = 0;
                while (i10 < paddingBottom) {
                    View childAt2 = getChildAt(i10);
                    int paddingTop7 = childAt2.getVisibility();
                    if (paddingTop7 != count) {
                        AnonymousClass31 lp = (AnonymousClass31) childAt2.getLayoutParams();
                        if (!lp.A05 && (A07 = A07(childAt2)) != null) {
                            float f = childTop3;
                            String[] strArr6 = A0v;
                            String str = strArr6[4];
                            String str2 = strArr6[5];
                            int length = str.length();
                            int paddingTop8 = str2.length();
                            if (length == paddingTop8) {
                                String[] strArr7 = A0v;
                                strArr7[4] = "";
                                strArr7[5] = "";
                                int paddingTop9 = (int) (f * A07.A00);
                                int i11 = i6 + paddingTop9;
                                if (lp.A03) {
                                    lp.A03 = false;
                                    int width = (int) (childTop3 * lp.A00);
                                    int loff = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
                                    int width2 = i5 - childLeft;
                                    int paddingLeft2 = width2 - vgrav;
                                    childAt2.measure(loff, View.MeasureSpec.makeMeasureSpec(paddingLeft2, 1073741824));
                                }
                                int count2 = childAt2.getMeasuredWidth();
                                int loff2 = childAt2.getMeasuredHeight();
                                int paddingLeft3 = childLeft;
                                childAt2.layout(i11, paddingLeft3, count2 + i11, loff2 + paddingLeft3);
                            }
                        }
                    }
                    i10++;
                    count = 8;
                }
                this.A0Q = childLeft;
                this.A09 = i5 - vgrav;
                this.A0D = hgrav;
                if (this.A0i) {
                    int loff3 = this.A00;
                    z2 = false;
                    A0N(loff3, false, 0, false);
                } else {
                    z2 = false;
                }
                this.A0i = z2;
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AnonymousClass31 anonymousClass31;
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        int maxGutterSize = measuredWidth / 10;
        this.A0I = Math.min(maxGutterSize, this.A0E);
        int maxGutterSize2 = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredWidth2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount) {
                View childAt = getChildAt(i5);
                int size = childAt.getVisibility();
                if (size != 8) {
                    AnonymousClass31 anonymousClass312 = (AnonymousClass31) childAt.getLayoutParams();
                    int childWidthSize = A0v[1].length();
                    if (childWidthSize == 12) {
                        break;
                    }
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (anonymousClass312 != null && anonymousClass312.A05) {
                        int i6 = anonymousClass312.A04 & 7;
                        int hgrav = anonymousClass312.A04;
                        int i7 = hgrav & 112;
                        int i8 = Integer.MIN_VALUE;
                        int i9 = Integer.MIN_VALUE;
                        boolean z = i7 == 48 || i7 == 80;
                        boolean z2 = i6 == 3 || i6 == 5;
                        if (z) {
                            i8 = 1073741824;
                        } else if (z2) {
                            i9 = 1073741824;
                        }
                        if (anonymousClass312.width != -2) {
                            i8 = 1073741824;
                            if (anonymousClass312.width != -1) {
                                i3 = anonymousClass312.width;
                            } else {
                                i3 = maxGutterSize2;
                            }
                        } else {
                            i3 = maxGutterSize2;
                        }
                        if (anonymousClass312.height != -2) {
                            i9 = 1073741824;
                            if (anonymousClass312.height != -1) {
                                i4 = anonymousClass312.height;
                                if (A0v[1].length() != 12) {
                                    String[] strArr2 = A0v;
                                    strArr2[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                                    strArr2[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                                }
                            } else {
                                i4 = measuredWidth2;
                            }
                        } else {
                            i4 = measuredWidth2;
                        }
                        int widthSpec = View.MeasureSpec.makeMeasureSpec(i3, i8);
                        int heightMode = View.MeasureSpec.makeMeasureSpec(i4, i9);
                        childAt.measure(widthSpec, heightMode);
                        if (z) {
                            int heightMode2 = childAt.getMeasuredHeight();
                            measuredWidth2 -= heightMode2;
                        } else if (z2) {
                            maxGutterSize2 -= childAt.getMeasuredWidth();
                        }
                    }
                }
                i5++;
            } else {
                int heightMode3 = View.MeasureSpec.makeMeasureSpec(maxGutterSize2, 1073741824);
                this.A0B = heightMode3;
                int heightMode4 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                this.A0A = heightMode4;
                this.A0j = true;
                A0g();
                this.A0j = false;
                int childCount2 = getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    View childAt2 = getChildAt(i10);
                    if (childAt2.getVisibility() != 8 && ((anonymousClass31 = (AnonymousClass31) childAt2.getLayoutParams()) == null || !anonymousClass31.A05)) {
                        float f = maxGutterSize2;
                        String[] strArr3 = A0v;
                        if (strArr3[4].length() == strArr3[5].length()) {
                            String[] strArr4 = A0v;
                            strArr4[1] = "11cm9STM7FlxGR3";
                            strArr4[1] = "11cm9STM7FlxGR3";
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (f * anonymousClass31.A00), 1073741824);
                            int widthSpec2 = this.A0A;
                            childAt2.measure(makeMeasureSpec, widthSpec2);
                        }
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int index, Rect rect) {
        int i;
        int i2;
        AnonymousClass30 A07;
        int end = getChildCount();
        if ((index & 2) != 0) {
            i = 0;
            i2 = 1;
        } else {
            i = end - 1;
            i2 = -1;
            end = -1;
        }
        while (i != end) {
            View childAt = getChildAt(i);
            if (A0v[2].length() == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int i3 = childAt.getVisibility();
            if (i3 == 0 && (A07 = A07(childAt)) != null) {
                int i4 = A07.A02;
                int i5 = this.A00;
                if (i4 == i5 && childAt.requestFocus(index, rect)) {
                    return true;
                }
            }
            i += i2;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            int i = viewPager$SavedState.A00;
            String[] strArr = A0v;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            A0O(i, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0c = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.A00 = this.A00;
        AbstractC03382f abstractC03382f = this.A01;
        if (abstractC03382f != null) {
            viewPager$SavedState.A01 = abstractC03382f.A07();
        }
        return viewPager$SavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0M;
            A0L(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC03382f abstractC03382f;
        float f;
        if (this.A0h) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC03382f = this.A01) == null || abstractC03382f.A05() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean z = false;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.A0X.abortAnimation();
            this.A0o = false;
            A0g();
            float x = motionEvent.getX();
            this.A03 = x;
            this.A05 = x;
            float y = motionEvent.getY();
            this.A04 = y;
            this.A06 = y;
            this.A08 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.A0k) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (findPointerIndex == -1) {
                        z = A0V();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.A05);
                        float xDiff = motionEvent.getY(findPointerIndex);
                        float y2 = this.A06;
                        float abs2 = Math.abs(xDiff - y2);
                        float yDiff = this.A0R;
                        if (abs > yDiff && abs > abs2) {
                            this.A0k = true;
                            A0U(true);
                            float f2 = this.A03;
                            if (x2 - f2 > 0.0f) {
                                float yDiff2 = this.A0R;
                                f = f2 + yDiff2;
                            } else {
                                f = f2 - this.A0R;
                            }
                            this.A05 = f;
                            this.A06 = xDiff;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.A0k) {
                    int activePointerIndex = motionEvent.findPointerIndex(this.A08);
                    z = false | A0Y(motionEvent.getX(activePointerIndex));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    float x3 = motionEvent.getX(actionIndex);
                    this.A05 = x3;
                    this.A08 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    A0Q(motionEvent);
                    this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                }
            } else if (this.A0k) {
                A0N(this.A00, true, 0, false);
                z = A0V();
            }
        } else if (this.A0k) {
            VelocityTracker velocityTracker = this.A0U;
            velocityTracker.computeCurrentVelocity(1000, this.A0J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
            this.A0o = true;
            int clientWidth = getClientWidth();
            int width = getScrollX();
            AnonymousClass30 A03 = A03();
            int scrollX = this.A0M;
            int i = A03.A02;
            float f3 = ((width / clientWidth) - A03.A00) / (A03.A01 + (scrollX / clientWidth));
            int currentPage = this.A08;
            int activePointerIndex2 = motionEvent.findPointerIndex(currentPage);
            float x4 = motionEvent.getX(activePointerIndex2);
            float x5 = this.A03;
            A0P(A01(i, f3, xVelocity, (int) (x4 - x5)), true, true, xVelocity);
            z = A0V();
        }
        if (z) {
            C2u.A07(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0j) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.ads.redexgen.X.35] */
    public void setAdapter(AbstractC03382f abstractC03382f) {
        AbstractC03382f abstractC03382f2 = this.A01;
        if (abstractC03382f2 != null) {
            abstractC03382f2.A0A(null);
            for (int i = 0; i < this.A0t.size(); i++) {
                AnonymousClass30 anonymousClass30 = this.A0t.get(i);
                this.A01.A0B(this, anonymousClass30.A02, anonymousClass30.A03);
            }
            this.A0t.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = abstractC03382f;
        this.A0G = 0;
        if (this.A01 != null) {
            if (this.A0b == null) {
                this.A0b = new DataSetObserver() { // from class: com.facebook.ads.redexgen.X.35
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        AnonymousClass38.this.A0f();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        AnonymousClass38.this.A0f();
                    }
                };
            }
            this.A01.A0A(this.A0b);
            this.A0o = false;
            boolean z = this.A0i;
            this.A0i = true;
            this.A0G = this.A01.A05();
            if (this.A0O >= 0) {
                A0O(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0c = null;
            } else if (!z) {
                A0g();
            } else {
                requestLayout();
            }
        }
        List<ViewPager.OnAdapterChangeListener> list = this.A0e;
        if (list != null && !list.isEmpty()) {
            int count = this.A0e.size();
            if (0 < count) {
                this.A0e.get(0);
                throw null;
            }
        }
    }

    public void setCurrentItem(int i) {
        this.A0o = false;
        A0O(i, !this.A0i, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(A08(300, 9, 47), A08(127, 31, 60) + i + A08(51, 26, 90) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0g();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(AnonymousClass33 anonymousClass33) {
        this.A0Z = anonymousClass33;
    }

    public void setPageMargin(int width) {
        int i = this.A0M;
        this.A0M = width;
        int width2 = getWidth();
        A0L(width2, width2, width, i);
        requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(C2B.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (this.A0a != null) {
            A0T(i != 0);
        }
        A0G(i);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0p != z) {
            this.A0p = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}