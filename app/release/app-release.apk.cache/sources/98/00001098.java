package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public class ES extends ViewGroup implements SD {
    public static byte[] A18;
    public static String[] A19;
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public SS A00;
    public C03603d A01;
    public ST A02;
    public RunnableC03733q A03;
    public AnonymousClass43 A04;
    public C4B A05;
    @VisibleForTesting
    public C4F A06;
    public C4O A07;
    public C4W A08;
    public C0979Sk A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    @VisibleForTesting
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C03352c A0d;
    public AnonymousClass46 A0e;
    public AnonymousClass49 A0f;
    public C4I A0g;
    public C4J A0h;
    public C4K A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<C4K> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C4N A0r;
    public final C4U A0s;
    public final C03874f A0t;
    public final Runnable A0u;
    public final ArrayList<C4C> A0v;
    @VisibleForTesting
    public final List<C4X> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final C0977Sg A11;
    public final InterfaceC03864e A12;
    public final ArrayList<C4J> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A18, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A0X() {
        A18 = new byte[]{-74, -74, -96, -74, -20, -1, -5, 13, -74, -34, 5, 2, -6, -5, 8, -74, -56, -48, -100, -33, -35, -22, -22, -21, -16, -100, -34, bx.j7, -100, -30, -21, -15, -22, -32, -100, -34, -15, -16, -100, -27, -16, -100, -27, -17, -100, -22, bx.j7, -33, bx.j7, -17, -17, -35, -18, -11, -100, -30, -21, -18, -100, 126, -57, -47, 126, -65, -54, -48, -61, -65, -62, -41, 126, -65, -46, -46, -65, -63, -58, -61, -62, 126, -46, -51, 126, -65, 126, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, -104, -12, 61, 71, -12, 66, 67, 72, -12, 53, -12, 56, 61, 70, 57, 55, 72, -12, 55, 60, 61, 64, 56, -12, 67, 58, -12, -93, -15, -14, -9, -93, -23, -14, -8, -15, -25, -79, -93, -57, -20, -25, -93, -28, -15, -4, -93, -48, -14, -9, -20, -14, -15, -56, -7, -24, -15, -9, -10, -93, -22, -24, -9, -93, -10, -18, -20, -13, -13, -24, -25, -62, -45, -57, 8, Flags.CD, 8, 23, 27, 12, 25, bx.j7, -117, g15.c, -62, -50, -51, -45, -60, -41, -45, -103, -56, -68, 8, -3, 21, Flags.CD, 17, 16, -42, 9, -18, 67, 65, 55, 60, 53, -18, 50, 51, 52, 47, 67, 58, 66, -18, 68, 47, 58, 67, 51, -67, -37, -26, -26, -33, -34, -102, -20, -33, -25, -23, -16, -33, -66, -33, -18, -37, -35, -30, -33, -34, -48, -29, -33, -15, -102, -15, -29, -18, -30, -102, -37, -102, -16, -29, -33, -15, -102, -15, -30, -29, -35, -30, -102, -29, -19, -102, -24, -23, -18, -102, -32, -26, -37, bx.j7, bx.j7, -33, -34, -102, -37, -19, -102, -18, -25, -22, -102, -34, -33, -18, -37, -35, -30, -33, -34, -88, -80, -50, -37, -37, -36, bx.j7, -115, -48, -50, bx.l7, bx.l7, -115, bx.j7, -43, -42, -32, -115, -38, -46, bx.j7, -43, -36, -47, -115, -42, -37, -115, -50, -115, -32, -48, -33, -36, bx.l7, bx.l7, -115, -48, -50, bx.l7, bx.l7, -49, -50, -48, -40, -101, -115, -64, -48, -33, -36, bx.l7, bx.l7, -115, -48, -50, bx.l7, bx.l7, -49, -50, -48, -40, -32, -115, -38, -42, -44, -43, bx.j7, -49, -46, -115, -33, -30, -37, -115, -47, -30, -33, -42, -37, -44, -115, -50, -115, -38, -46, -50, -32, -30, -33, -46, -115, -109, -115, bx.l7, -50, -26, -36, -30, bx.j7, -115, -35, -50, -32, -32, -115, -28, -43, -46, -33, -46, -115, -26, -36, -30, -115, -48, -50, -37, -37, -36, bx.j7, -115, -48, -43, -50, -37, -44, -46, -115, bx.j7, -43, -46, -65, -46, -48, -26, -48, bx.l7, -46, -33, -61, -42, -46, -28, -115, -47, -50, bx.j7, -50, -101, -115, -82, -37, -26, -115, -38, -46, bx.j7, -43, -36, -47, -115, -48, -50, bx.l7, bx.l7, -115, bx.j7, -43, -50, bx.j7, -115, -38, -42, -44, -43, bx.j7, -115, -48, -43, -50, -37, -44, -46, -115, bx.j7, -43, -46, -115, -32, bx.j7, -33, -30, -48, bx.j7, -30, -33, -46, -36, -45, -115, bx.j7, -43, -46, -115, -65, -46, -48, -26, -48, bx.l7, -46, -33, -61, -42, -46, -28, -115, -36, -33, -115, bx.j7, -43, -46, -115, -50, -47, -50, -35, bx.j7, -46, -33, -115, -48, -36, -37, bx.j7, -46, -37, bx.j7, -32, -115, -32, -43, -36, -30, bx.l7, -47, -115, -49, -46, -115, -35, -36, -32, bx.j7, -35, -36, -37, -46, -47, -115, bx.j7, -36, bx.j7, -43, -46, -115, -37, -46, -27, bx.j7, -115, -45, -33, -50, -38, -46, -101, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -6, -18, -17, -7, -90, -13, -21, -6, -18, -11, -22, -90, -3, -18, -17, -14, -21, -90, -40, -21, -23, -1, -23, -14, -21, -8, -36, -17, -21, -3, -90, -17, -7, -90, -23, -11, -13, -10, -5, -6, -17, -12, -19, -90, -25, -90, -14, -25, -1, -11, -5, -6, -90, -11, -8, -90, -7, -23, -8, -11, -14, -14, -17, -12, -19, -28, 2, 15, 15, 16, 21, -63, 7, 13, 10, 15, 8, -63, 24, 10, 21, 9, 16, 22, 21, -63, 2, -63, -19, 2, 26, 16, 22, 21, -18, 2, 15, 2, 8, 6, 19, -63, 20, 6, 21, -49, -63, -28, 2, 13, 13, -63, 20, 6, 21, -19, 2, 26, 16, 22, 21, -18, 2, 15, 2, 8, 6, 19, -63, 24, 10, 21, 9, -63, 2, -63, 15, 16, 15, -50, 15, 22, 13, 13, -63, 2, 19, 8, 22, 14, 6, 15, 21, -49, -35, -5, 8, 8, 9, 14, -70, 13, -3, 12, 9, 6, 6, -70, 14, 9, -70, 10, 9, 13, 3, 14, 3, 9, 8, -70, -5, -70, -26, -5, 19, 9, 15, 14, -25, -5, 8, -5, 1, -1, 12, -70, 13, -1, 14, -56, -70, -35, -5, 6, 6, -70, 13, -1, 14, -26, -5, 19, 9, 15, 14, -25, -5, 8, -5, 1, -1, 12, -70, 17, 3, 14, 2, -70, -5, -70, 8, 9, 8, -57, 8, 15, 6, 6, -70, -5, 12, 1, 15, 7, -1, 8, 14, -56, -33, -3, 10, 10, Flags.CD, 16, -68, 15, -1, 14, Flags.CD, 8, 8, -68, 19, 5, 16, 4, Flags.CD, 17, 16, -68, -3, -68, -24, -3, 21, Flags.CD, 17, 16, -23, -3, 10, -3, 3, 1, 14, -68, 15, 1, 16, -54, -68, -33, -3, 8, 8, -68, 15, 1, 16, -24, -3, 21, Flags.CD, 17, 16, -23, -3, 10, -3, 3, 1, 14, -68, 19, 5, 16, 4, -68, -3, -68, 10, Flags.CD, 10, -55, 10, 17, 8, 8, -68, -3, 14, 3, 17, 9, 1, 10, 16, -54, -29, 1, 14, 14, 15, 20, -64, 19, 13, 15, 15, 20, 8, -64, 19, 3, 18, 15, 12, 12, -64, 23, 9, 20, 8, 15, 21, 20, -64, 1, -64, -20, 1, 25, 15, 21, 20, -19, 1, 14, 1, 7, 5, 18, -64, 19, 5, 20, -50, -64, -29, 1, 12, 12, -64, 19, 5, 20, -20, 1, 25, 15, 21, 20, -19, 1, 14, 1, 7, 5, 18, -64, 23, 9, 20, 8, 
        -64, 1, -64, 14, 15, 14, -51, 14, 21, 12, 12, -64, 1, 18, 7, 21, 13, 5, 14, 20, -50, -18, 25, -54, 24, 25, 30, -54, 29, 15, 30, -10, Flags.CD, 35, 25, 31, 30, -16, 28, 25, 36, 15, 24, -54, 19, 24, -54, 22, Flags.CD, 35, 25, 31, 30, -54, 25, 28, -54, 29, 13, 28, 25, 22, 22, -52, -7, -7, -10, -7, -89, -9, -7, -10, -22, -20, -6, -6, -16, -11, -18, -89, -6, -22, -7, -10, -13, -13, -62, -89, -9, -10, -16, -11, -5, -20, -7, -89, -16, -11, -21, -20, -1, -89, -19, -10, -7, -89, -16, -21, -89, -7, 14, 38, 28, 34, 33, -6, 14, 27, 14, 20, 18, 31, -51, -53, -20, -99, -34, bx.j7, -34, -19, -15, -30, -17, -99, -34, -15, -15, -34, -32, -27, -30, bx.j7, -72, -99, -16, -24, -26, -19, -19, -26, -21, -28, -99, -23, -34, -10, -20, -14, -15, -52, -19, -98, -22, -33, -9, -19, -13, -14, -98, -21, -33, -20, -33, -27, -29, -16, -98, -33, -14, -14, -33, bx.j7, -26, -29, -30, -71, -98, -15, -23, -25, -18, -18, -25, -20, -27, -98, -22, -33, -9, -19, -13, -14, -1, 33, 30, 17, 27, 20, 28, -49, 38, 23, 24, 27, 20, -49, 28, 16, 35, 18, 23, 24, 29, 22, -49, 18, 23, 16, 29, 22, 20, 19, -49, 37, 24, 20, 38, -49, 23, 30, 27, 19, 20, 33, 34, -49, 38, 24, 35, 23, -49, 35, 23, 20, -49, 29, 20, 38, 30, 29, 20, 34, -35, -49, 3, 23, 20, -49, 31, 33, 20, -36, 27, 16, 40, 30, 36, 35, -49, 24, 29, 21, 30, 33, 28, 16, 35, 24, 30, 29, -49, 21, 30, 33, -49, 35, 23, 20, -49, 18, 23, 16, 29, 22, 20, -49, 23, 30, 27, 19, 20, 33, -49, 5, 9, -45, -7, 40, 31, 31, -4, 33, 41, 20, 31, 28, 23, 20, 39, 24, -3, 1, -53, -6, 25, -9, 12, 36, 26, 32, 31, -7, -3, -57, -9, 8, 25, 27, 16, 8, 19, -16, 21, 29, 8, 19, 16, Flags.CD, 8, 27, 12, -14, -10, -64, -13, 3, 18, 15, 12, 12, -10, 9, 7, 29, 7, 16, 9, 22, -6, 13, 9, 27, 1, 20, 18, 40, 18, 27, 20, 33, 5, 24, 20, 38, -49, 19, 30, 20, 34, -49, 29, 30, 35, -49, 34, 36, 31, 31, 30, 33, 35, -49, 34, 18, 33, 30, 27, 27, 24, 29, 22, -49, 35, 30, -49, 16, 29, -49, 16, 17, 34, 30, 27, 36, 35, 20, -49, 31, 30, 34, 24, 35, 24, 30, 29, -35, -49, 4, 34, 20, -49, 34, 18, 33, 30, 27, 27, 3, 30, -1, 30, 34, 24, 35, 24, 30, 29, -49, 24, 29, 34, 35, 20, 16, 19, -72, -53, -55, -33, -55, -46, -53, -40, -68, -49, -53, -35, -122, -50, -57, bx.l7, -122, -44, -43, -122, -78, -57, -33, -43, -37, -38, -77, -57, -44, -57, -51, -53, -40, 29, 64, 56, -23, 45, 50, 47, 47, 46, 59, 46, 55, 61, -23, 31, 50, 46, 64, 17, 56, 53, 45, 46, 59, 60, -23, 49, bx.W5, ax5.a, 46, -23, 61, 49, 46, -23, 60, bx.W5, 54, 46, -23, 44, 49, bx.W5, 55, 48, 46, -23, 18, 13, -9, -23, 29, 49, 50, 60, -23, 54, 50, 48, 49, 61, -23, 49, bx.W5, 57, 57, 46, 55, -23, 45, 62, 46, -23, 61, 56, -23, 50, 55, 44, 56, 55, 60, 50, 60, 61, 46, 55, 61, -23, 10, 45, bx.W5, 57, 61, 46, 59, -23, 62, 57, 45, bx.W5, 61, 46, -23, 46, ax5.a, 46, 55, 61, 60, -23, 56, 59, -23, 50, 47, -23, 61, 49, 46, -23, 21, bx.W5, 66, 56, 62, 61, 22, bx.W5, 55, bx.W5, 48, 46, 59, -23, 53, bx.W5, 66, 60, -23, 56, 62, 61, -23, 61, 49, 46, -23, 60, bx.W5, 54, 46, -23, 31, 50, 46, 64, -23, 54, 62, 53, 61, 50, 57, 53, 46, -23, 61, 50, 54, 46, 60, -9, -45, -23, 31, 50, 46, 64, 17, 56, 53, 45, 46, 59, -23, -6, 3, -10, 25, 17, -62, 6, Flags.CD, 8, 8, 7, 20, 7, 16, 22, -62, -8, Flags.CD, 7, 25, -22, 17, 14, 6, 7, 20, 21, -62, 10, 3, 24, 7, -62, 22, 10, 7, -62, 21, 3, 15, 7, -62, 21, 22, 3, 4, 14, 7, -62, -21, -26, -48, -62, -11, 22, 3, 4, 14, 7, -62, -21, -26, 21, -62, Flags.CD, 16, -62, 27, 17, 23, 20, -62, 3, 6, 3, 18, 22, 7, 20, -62, -17, -9, -11, -10, -62, -28, -25, -62, 23, 16, Flags.CD, 19, 23, 7, -62, 3, 16, 6, -62, -11, -22, -15, -9, -18, -26, -62, -16, -15, -10, -62, 5, 10, 3, 16, 9, 7, -48, -84, -62, -8, Flags.CD, 7, 25, -22, 17, 14, 6, 7, 20, -62, -45, -36, -29, -10, -14, 4, -83, 7, 9, 9, Flags.CD, 25, 25, 15, 8, 15, 18, 15, 26, 31, 31, 36, 45, 32, 30, 47, 36, bx.W5, 41, -37, 40, 48, 46, 47, -37, 29, 32, -37, 28, 29, 46, bx.W5, 39, 48, 47, 32, -23, -37, 45, 32, 30, 32, 36, 49, 32, 31, -11, -38, -52, -37, -70, -54, bx.l7, -42, -45, -45, -48, -43, -50, -69, -42, -36, -54, -49, -70, -45, -42, -41, -113, -112, -95, -121, -55, -56, -53, -121, -56, bx.l7, -50, -36, -44, -52, -43, -37, -121, -54, -42, -43, -38, -37, -56, -43, -37, -121};
    }

    public static void A0Y() {
        A19 = new String[]{"EzQ8zede2M", "Jhjgeach8ubRdn89CHbftPIFCkhy8Cmz", "AI0RoC", "LwFgY3t3Qwi2PJUU36Pvm2", "gOCwMU1oDfpLVyXTNaTi7eQdHjis00sx", "GZYggCcl1OWg4VOzBYKk2kBvqjxmktta", "Te26Sy6xLG0KtVPzJaOHws0Kts3F9NRb", "K773CdyIAwEU"};
    }

    static {
        A0Y();
        A0X();
        A1I = new int[]{16843830};
        A1H = new int[]{16842987};
        A1C = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = Build.VERSION.SDK_INT >= 16;
        A1E = Build.VERSION.SDK_INT >= 21;
        A1F = Build.VERSION.SDK_INT <= 15;
        A1G = Build.VERSION.SDK_INT <= 15;
        A1J = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        A1A = new Interpolator() { // from class: com.facebook.ads.redexgen.X.42
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public ES(Context context) {
        this(context, null);
    }

    public ES(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ES(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A11 = new C0977Sg(this);
        this.A0r = new C4N(this);
        this.A0t = new C03874f();
        this.A0u = new Runnable() { // from class: com.facebook.ads.redexgen.X.40
            @Override // java.lang.Runnable
            public final void run() {
                if (!ES.this.A0D || ES.this.isLayoutRequested()) {
                    return;
                }
                if (!ES.this.A0F) {
                    ES.this.requestLayout();
                } else if (ES.this.A0I) {
                    ES.this.A0J = true;
                } else {
                    ES.this.A1K();
                }
            }
        };
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new EV();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new C4W(this);
        this.A02 = A1E ? new ST() : null;
        this.A0s = new C4U();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new C0974Sd(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new Runnable() { // from class: com.facebook.ads.redexgen.X.41
            @Override // java.lang.Runnable
            public final void run() {
                if (ES.this.A05 != null) {
                    ES.this.A05.A0D();
                }
                ES.this.A0K = false;
            }
        };
        this.A12 = new C0972Sa(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i, 0);
            this.A0B = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = C03532v.A00(viewConfiguration, context);
        this.A0M = C03532v.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0A(this.A0f);
        A0g();
        A0P();
        if (C2u.A00(this) == 0) {
            C2u.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0J(1831, 13, 81));
        setAccessibilityDelegateCompat(new C0979Sk(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private final long A0C(C4X c4x) {
        return this.A04.A0C() ? c4x.A0L() : c4x.A03;
    }

    @Nullable
    private View A0D() {
        C4X A0E;
        int i = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int A03 = this.A0s.A03();
        for (int i2 = i; i2 < A03; i2++) {
            C4X A0E2 = A0E(i2);
            if (A0E2 == null) {
                break;
            } else if (A0E2.A0H.hasFocusable()) {
                return A0E2.A0H;
            }
        }
        for (int min = Math.min(A03, i) - 1; min >= 0 && (A0E = A0E(min)) != null; min--) {
            if (A0E.A0H.hasFocusable()) {
                return A0E.A0H;
            }
        }
        return null;
    }

    private final C4X A0E(int i) {
        if (this.A0C) {
            return null;
        }
        int A07 = this.A01.A07();
        C4X c4x = null;
        for (int i2 = 0; i2 < A07; i2++) {
            C4X A0G = A0G(this.A01.A0B(i2));
            if (A0G != null && !A0G.A0d() && A1E(A0G) == i) {
                if (this.A01.A0L(A0G.A0H)) {
                    c4x = A0G;
                } else {
                    return A0G;
                }
            }
        }
        return c4x;
    }

    private final C4X A0F(long j) {
        AnonymousClass43 anonymousClass43 = this.A04;
        if (anonymousClass43 == null || !anonymousClass43.A0C()) {
            return null;
        }
        int A07 = this.A01.A07();
        C4X c4x = null;
        for (int i = 0; i < A07; i++) {
            C4X A0G = A0G(this.A01.A0B(i));
            if (A0G != null && !A0G.A0d()) {
                long A0L = A0G.A0L();
                String[] strArr = A19;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[2] = "zZZE93";
                strArr2[7] = "VhF552wVYFMR";
                if (A0L != j) {
                    continue;
                } else if (this.A01.A0L(A0G.A0H)) {
                    c4x = A0G;
                } else {
                    return A0G;
                }
            }
        }
        return c4x;
    }

    public static C4X A0G(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[6] = "BAOGG7B6SgQWpjs0haC4kmkQlPV7A4k9";
        strArr[4] = "PAhaNRNZ3VZ1U75Bha3wwWQKZTmx8jYI";
        return ((C4G) layoutParams).A00;
    }

    @Nullable
    private final C4X A0H(View view) {
        View A1G2 = A1G(view);
        if (A1G2 == null) {
            return null;
        }
        return A1I(A1G2);
    }

    @Nullable
    public static ES A0I(@NonNull View view) {
        if (view instanceof ViewGroup) {
            boolean z = view instanceof ES;
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[1] = "St3OXKQiThZ0lO5vTnfaG6NXMltPJG5W";
            strArr[1] = "St3OXKQiThZ0lO5vTnfaG6NXMltPJG5W";
            if (z) {
                return (ES) view;
            }
            ViewGroup parent = (ViewGroup) view;
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ES descendant = A0I(parent.getChildAt(i));
                if (descendant != null) {
                    return descendant;
                }
            }
            return null;
        }
        return null;
    }

    private void A0K() {
        A0U();
        setScrollState(0);
    }

    private void A0L() {
        int i = this.A0P;
        this.A0P = 0;
        if (i != 0) {
            boolean A1t = A1t();
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "eU2cwXbbXfV7oR8qPBCYPw";
            strArr2[0] = "cj1lHsGs8Y";
            if (A1t) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                C3D.A01(obtain, i);
                sendAccessibilityEventUnchecked(obtain);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0M() {
        C4X A0G;
        boolean z = true;
        this.A0s.A04(1);
        A1m(this.A0s);
        this.A0s.A0A = false;
        A1L();
        this.A0t.A07();
        A1M();
        A0Q();
        A0V();
        C4U c4u = this.A0s;
        c4u.A0E = (c4u.A0C && this.A0H) ? false : false;
        this.A0H = false;
        this.A0G = false;
        C4U c4u2 = this.A0s;
        c4u2.A09 = c4u2.A0B;
        this.A0s.A03 = this.A04.A0E();
        A0z(this.A14);
        if (this.A0s.A0C) {
            int A06 = this.A01.A06();
            for (int i = 0; i < A06; i++) {
                C4X A0G2 = A0G(this.A01.A0A(i));
                boolean A0i = A0G2.A0i();
                String[] strArr = A19;
                if (strArr[2].length() != strArr[7].length()) {
                    String[] strArr2 = A19;
                    strArr2[5] = "UNYHKTM9Pgc2Q8zoabZHHBhpghLQMYt4";
                    strArr2[5] = "UNYHKTM9Pgc2Q8zoabZHHBhpghLQMYt4";
                    if (!A0i) {
                        boolean A0c = A0G2.A0c();
                        String[] strArr3 = A19;
                        if (strArr3[2].length() != strArr3[7].length()) {
                            String[] strArr4 = A19;
                            strArr4[5] = "yAYMfY7gQPsOXL0bw1Y8FO5LYSWRNpHN";
                            strArr4[5] = "yAYMfY7gQPsOXL0bw1Y8FO5LYSWRNpHN";
                            if (A0c) {
                                AnonymousClass43 anonymousClass43 = this.A04;
                                if (A19[5].charAt(2) != 'Y') {
                                    String[] strArr5 = A19;
                                    strArr5[2] = "S1msfb";
                                    strArr5[7] = "DqMDNTpz3t0S";
                                    if (!anonymousClass43.A0C()) {
                                        continue;
                                    }
                                } else {
                                    String[] strArr6 = A19;
                                    strArr6[6] = "3GcQR0gwPdJ7qG9NsafqkCoBzG49WZbm";
                                    strArr6[4] = "xwZbJMHEvrrw2fWE8anB3sW9hLiJiwUw";
                                    if (!anonymousClass43.A0C()) {
                                        continue;
                                    }
                                }
                            }
                            this.A0t.A0G(A0G2, this.A05.A08(this.A0s, A0G2, C4B.A00(A0G2), A0G2.A0M()));
                            if (this.A0s.A0E && A0G2.A0g() && !A0G2.A0d() && !A0G2.A0i() && !A0G2.A0c()) {
                                long A0C = A0C(A0G2);
                                C03874f c03874f = this.A0t;
                                if (A19[1].length() == 32) {
                                    String[] strArr7 = A19;
                                    strArr7[3] = "VKmUie50Iu1ZqeQWLORu5w";
                                    strArr7[0] = "PYciOOvrvR";
                                    c03874f.A09(A0C, A0G2);
                                }
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        if (this.A0s.A0B) {
            A0k();
            boolean z2 = this.A0s.A0D;
            C4U c4u3 = this.A0s;
            c4u3.A0D = false;
            this.A06.A1z(this.A0r, c4u3);
            this.A0s.A0D = z2;
            for (int i2 = 0; i2 < this.A01.A06(); i2++) {
                C03603d c03603d = this.A01;
                if (A19[1].length() != 32) {
                    String[] strArr8 = A19;
                    strArr8[2] = "4lQmW8";
                    strArr8[7] = "2Uq8uzi7rIEU";
                    View child = c03603d.A0A(i2);
                    A0G = A0G(child);
                    if (A0G.A0i()) {
                    }
                    if (this.A0t.A0J(A0G)) {
                        int A00 = C4B.A00(A0G);
                        boolean A0l = A0G.A0l(8192);
                        if (!A0l) {
                            A00 |= 4096;
                        }
                        C4A animationInfo = this.A05.A08(this.A0s, A0G, A00, A0G.A0M());
                        if (A0l) {
                            A1n(A0G, animationInfo);
                        } else {
                            this.A0t.A0E(A0G, animationInfo);
                        }
                    }
                } else {
                    String[] strArr9 = A19;
                    strArr9[1] = "EzPEwBDGhSnYyJadD6vqsk9WPl8azgQD";
                    strArr9[1] = "EzPEwBDGhSnYyJadD6vqsk9WPl8azgQD";
                    View child2 = c03603d.A0A(i2);
                    A0G = A0G(child2);
                    if (A0G.A0i()) {
                    }
                    if (this.A0t.A0J(A0G)) {
                    }
                }
            }
            A0Z();
        } else {
            A0Z();
        }
        A1N();
        A1s(false);
        this.A0s.A04 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0N() {
        boolean z;
        A1L();
        A1M();
        this.A0s.A04(6);
        this.A00.A0H();
        this.A0s.A03 = this.A04.A0E();
        C4U c4u = this.A0s;
        c4u.A00 = 0;
        c4u.A09 = false;
        this.A06.A1z(this.A0r, c4u);
        C4U c4u2 = this.A0s;
        c4u2.A0D = false;
        this.A0j = null;
        if (c4u2.A0C) {
            C4B c4b = this.A05;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "QyMu0uKDVMcIUQ2WaaKkjpUJvINNzfF4";
            strArr2[4] = "jnZHkwnP1Z9tC9uQsacmbdRp3FaoK01F";
            if (c4b != null) {
                z = true;
                c4u2.A0C = z;
                C4U c4u3 = this.A0s;
                if (A19[1].length() == 32) {
                    c4u3.A04 = 4;
                    A1N();
                    A1s(false);
                    return;
                }
                String[] strArr3 = A19;
                strArr3[1] = "3IsVIAoReRfPbfS1EeUcjIwVgXkj1JVv";
                strArr3[1] = "3IsVIAoReRfPbfS1EeUcjIwVgXkj1JVv";
                c4u3.A04 = 4;
                A1N();
                A1s(false);
                return;
            }
        }
        z = false;
        c4u2.A0C = z;
        C4U c4u32 = this.A0s;
        if (A19[1].length() == 32) {
        }
    }

    private void A0O() {
        this.A0s.A04(4);
        A1L();
        A1M();
        C4U c4u = this.A0s;
        c4u.A04 = 1;
        if (c4u.A0C) {
            for (int i = this.A01.A06() - 1; i >= 0; i--) {
                C4X A0G = A0G(this.A01.A0A(i));
                if (!A0G.A0i()) {
                    long key = A0C(A0G);
                    C4A A07 = this.A05.A07(this.A0s, A0G);
                    C4X A06 = this.A0t.A06(key);
                    if (A06 != null && !A06.A0i()) {
                        boolean A0I = this.A0t.A0I(A06);
                        C03874f c03874f = this.A0t;
                        if (A19[5].charAt(2) != 'Y') {
                            break;
                        }
                        String[] strArr = A19;
                        strArr[1] = "oIS3LUWJBkP0D1bim3OID749wsN9UxnV";
                        strArr[1] = "oIS3LUWJBkP0D1bim3OID749wsN9UxnV";
                        boolean A0I2 = c03874f.A0I(A0G);
                        if (A0I && A06 == A0G) {
                            this.A0t.A0F(A0G, A07);
                        } else {
                            C4A A05 = this.A0t.A05(A06);
                            this.A0t.A0F(A0G, A07);
                            C4A A04 = this.A0t.A04(A0G);
                            if (A05 == null) {
                                A0o(key, A0G, A06);
                            } else {
                                A0v(A06, A0G, A05, A04, A0I, A0I2);
                            }
                        }
                    } else {
                        this.A0t.A0F(A0G, A07);
                    }
                }
            }
            this.A0t.A0H(this.A12);
        }
        this.A06.A1H(this.A0r);
        C4U c4u2 = this.A0s;
        c4u2.A05 = c4u2.A03;
        this.A0C = false;
        C4U c4u3 = this.A0s;
        c4u3.A0C = false;
        c4u3.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            ArrayList<C4X> arrayList = this.A0r.A02;
            String[] strArr2 = A19;
            if (strArr2[3].length() != strArr2[0].length()) {
                String[] strArr3 = A19;
                strArr3[1] = "DxhhwSm2KO29M0snTVs4N8QFyNW6c8YZ";
                strArr3[1] = "DxhhwSm2KO29M0snTVs4N8QFyNW6c8YZ";
                arrayList.clear();
            }
            throw new RuntimeException();
        }
        if (this.A06.A08) {
            C4F c4f = this.A06;
            c4f.A00 = 0;
            c4f.A08 = false;
            this.A0r.A0P();
        }
        this.A06.A20(this.A0s);
        A1N();
        A1s(false);
        this.A0t.A07();
        int[] iArr = this.A14;
        if (A13(iArr[0], iArr[1])) {
            A1c(0, 0);
        }
        A0R();
        A0T();
    }

    private void A0P() {
        this.A01 = new C03603d(new Sb(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0Q() {
        boolean z;
        C4U c4u;
        if (this.A0C) {
            this.A00.A0J();
            this.A06.A1N(this);
        }
        if (A11()) {
            this.A00.A0I();
        } else {
            this.A00.A0H();
        }
        boolean z2 = false;
        boolean z3 = this.A0G || this.A0H;
        C4U c4u2 = this.A0s;
        if (this.A0D && this.A05 != null && (this.A0C || z3 || this.A06.A09)) {
            boolean z4 = this.A0C;
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "q3lLGfTGOOnJqHZydaTklLew08TAvgTY";
            strArr[4] = "cayAc0YyiA2wrQyaXaOul4VyYlz5tKdZ";
            if (!z4 || this.A04.A0C()) {
                z = true;
                c4u2.A0C = z;
                c4u = this.A0s;
                if (c4u.A0C && z3 && !this.A0C && A11()) {
                    z2 = true;
                }
                c4u.A0B = z2;
                if (A19[1].length() == 32) {
                    String[] strArr2 = A19;
                    strArr2[2] = "gWU7AH";
                    strArr2[7] = "O2IXTNL1mXfE";
                    return;
                }
                String[] strArr3 = A19;
                strArr3[5] = "vAY5NMbknnGVxibfJ54Fdf4KbFDo9MxQ";
                strArr3[5] = "vAY5NMbknnGVxibfJ54Fdf4KbFDo9MxQ";
                return;
            }
        }
        z = false;
        c4u2.A0C = z;
        c4u = this.A0s;
        if (c4u.A0C) {
            z2 = true;
        }
        c4u.A0B = z2;
        if (A19[1].length() == 32) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0R() {
        View findViewById;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            boolean isFocused = isFocused();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[5] = "GSYhD7ljhsNq0QcPBhSV8ATJlhol3xt1";
            strArr[5] = "GSYhD7ljhsNq0QcPBhSV8ATJlhol3xt1";
            if (!isFocused) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A06() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0L(focusedChild)) {
                    return;
                }
            }
            C4X c4x = null;
            if (this.A0s.A08 != -1 && this.A04.A0C()) {
                c4x = A0F(this.A0s.A08);
            }
            View view = null;
            if (c4x != null) {
                C03603d c03603d = this.A01;
                View viewToFocus = c4x.A0H;
                if (!c03603d.A0L(viewToFocus)) {
                    View viewToFocus2 = c4x.A0H;
                    if (viewToFocus2.hasFocusable()) {
                        view = c4x.A0H;
                        if (view == null) {
                            if (this.A0s.A02 != -1 && (findViewById = view.findViewById(this.A0s.A02)) != null && findViewById.isFocusable()) {
                                view = findViewById;
                            }
                            view.requestFocus();
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.A01.A06() > 0) {
                view = A0D();
            }
            if (view == null) {
            }
        }
    }

    private void A0S() {
        boolean z = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A0a.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A0c.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0b;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A0b.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0Z;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A0Z.isFinished();
        }
        if (z) {
            C2u.A07(this);
        }
    }

    private void A0T() {
        C4U c4u = this.A0s;
        c4u.A08 = -1L;
        c4u.A01 = -1;
        c4u.A02 = -1;
    }

    private void A0U() {
        VelocityTracker velocityTracker = this.A0Y;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A1Y(0);
        A0S();
    }

    private void A0V() {
        int A0H;
        View view = null;
        if (this.A0o && hasFocus() && this.A04 != null) {
            view = getFocusedChild();
        }
        C4X A0H2 = view == null ? null : A0H(view);
        if (A0H2 == null) {
            A0T();
            return;
        }
        this.A0s.A08 = this.A04.A0C() ? A0H2.A0L() : -1L;
        C4U c4u = this.A0s;
        if (this.A0C) {
            A0H = -1;
        } else {
            A0H = A0H2.A0d() ? A0H2.A01 : A0H2.A0H();
        }
        c4u.A01 = A0H;
        this.A0s.A02 = A0B(A0H2.A0H);
    }

    private void A0W() {
        this.A08.A09();
        C4F c4f = this.A06;
        if (c4f != null) {
            c4f.A0y();
        }
    }

    private final void A0Z() {
        int A07 = this.A01.A07();
        for (int i = 0; i < A07; i++) {
            C03603d c03603d = this.A01;
            String[] strArr = A19;
            String str = strArr[3];
            String str2 = strArr[0];
            int length = str.length();
            int i2 = str2.length();
            if (length == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "VFyFJGthyduvDNyVUqu48D";
            strArr2[0] = "uBjdUWzzez";
            C4X A0G = A0G(c03603d.A0B(i));
            if (!A0G.A0i()) {
                A0G.A0N();
            }
        }
        this.A0r.A0L();
    }

    private final void A0a() {
        AnonymousClass43 anonymousClass43 = this.A04;
        String A0J = A0J(1370, 12, 79);
        if (anonymousClass43 == null) {
            Log.e(A0J, A0J(1123, 36, 40));
        } else if (this.A06 == null) {
            Log.e(A0J, A0J(1159, 43, 41));
        } else {
            C4U c4u = this.A0s;
            c4u.A0A = false;
            if (c4u.A04 == 1) {
                A0M();
                this.A06.A1P(this);
                A0N();
            } else if (this.A00.A0L() || this.A06.A0i() != getWidth() || this.A06.A0Y() != getHeight()) {
                this.A06.A1P(this);
                A0N();
            } else {
                this.A06.A1P(this);
            }
            A0O();
        }
    }

    private final void A0b() {
        int i;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            C4X c4x = this.A0w.get(size);
            if (c4x.A0H.getParent() == this && !c4x.A0i() && (i = c4x.A02) != -1) {
                C2u.A09(c4x.A0H, i);
                c4x.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0c() {
        if (this.A0Z != null) {
            return;
        }
        this.A0Z = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0Z.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.A0Z.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0d() {
        if (this.A0a != null) {
            return;
        }
        this.A0a = new EdgeEffect(getContext());
        if (this.A0B) {
            EdgeEffect edgeEffect = this.A0a;
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int measuredWidth = getMeasuredWidth() - getPaddingLeft();
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "GMHrLIeJxdXYoHZyaa7kSwSfzExGbrBL";
            strArr2[4] = "0YT1HYXH3vPYSlLI8aOL6WZeFeHH6VHe";
            edgeEffect.setSize(measuredHeight, measuredWidth - getPaddingRight());
            return;
        }
        this.A0a.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private final void A0e() {
        if (this.A0b != null) {
            return;
        }
        this.A0b = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0b.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.A0b.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0f() {
        if (this.A0c != null) {
            return;
        }
        this.A0c = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        EdgeEffect edgeEffect = this.A0c;
        int measuredWidth = getMeasuredWidth();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "10JS50";
        strArr[7] = "NY78MD5eAiV9";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0g() {
        this.A00 = new SS(new C0973Sc(this));
    }

    private final void A0h() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0i() {
        int A07 = this.A01.A07();
        for (int i = 0; i < A07; i++) {
            ((C4G) this.A01.A0B(i).getLayoutParams()).A01 = true;
        }
        this.A0r.A0N();
    }

    private final void A0j() {
        int A07 = this.A01.A07();
        for (int i = 0; i < A07; i++) {
            C4X A0G = A0G(this.A01.A0B(i));
            if (A0G != null && !A0G.A0i()) {
                A0G.A0U(6);
            }
        }
        A0i();
        this.A0r.A0O();
    }

    private final void A0k() {
        int A07 = this.A01.A07();
        for (int i = 0; i < A07; i++) {
            C4X A0G = A0G(this.A01.A0B(i));
            if (!A0G.A0i()) {
                A0G.A0S();
            }
        }
    }

    private void A0l(float f, float f2, float f3, float f4) {
        boolean z = false;
        if (f2 < 0.0f) {
            A0d();
            C3U.A00(this.A0a, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
            z = true;
        } else if (f2 > 0.0f) {
            A0e();
            C3U.A00(this.A0b, f2 / getWidth(), f3 / getHeight());
            z = true;
        }
        if (f4 < 0.0f) {
            A0f();
            C3U.A00(this.A0c, (-f4) / getHeight(), f / getWidth());
            z = true;
        } else if (f4 > 0.0f) {
            A0c();
            C3U.A00(this.A0Z, f4 / getHeight(), 1.0f - (f / getWidth()));
            z = true;
        }
        if (z || f2 != 0.0f || f4 != 0.0f) {
            C2u.A07(this);
        }
    }

    private final void A0m(int i) {
        C4F c4f = this.A06;
        C4K c4k = this.A0i;
        if (c4k != null) {
            c4k.A0V(this, i);
        }
        List<C4K> list = this.A0m;
        String[] strArr = A19;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[2] = "mB2qLC";
        strArr2[7] = "mQXIqdAaLius";
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0V(this, i);
            }
        }
    }

    private final void A0n(int i, int i2, Interpolator interpolator) {
        C4F c4f = this.A06;
        if (c4f == null) {
            Log.e(A0J(1370, 12, 79), A0J(924, 97, 75));
            return;
        }
        boolean z = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "pqK8Y9";
        strArr[7] = "UiASdGbGWO9v";
        if (z) {
            return;
        }
        if (!c4f.A25()) {
            i = 0;
        }
        if (!this.A06.A26()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            this.A08.A0E(i, i2, interpolator);
        }
    }

    private void A0o(long j, C4X other, C4X c4x) {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            C4X A0G = A0G(this.A01.A0A(i));
            if (A0G != other && A0C(A0G) == j) {
                AnonymousClass43 anonymousClass43 = this.A04;
                String A0J = A0J(1, 17, 65);
                if (anonymousClass43 != null && anonymousClass43.A0C()) {
                    throw new IllegalStateException(A0J(1696, WKSRecord.Service.CISCO_FNA, 77) + A0G + A0J + other + A1J());
                }
                throw new IllegalStateException(A0J(1508, 188, 116) + A0G + A0J + other + A1J());
            }
        }
        Log.e(A0J(1370, 12, 79), A0J(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, 111, 90) + c4x + A0J(18, 41, 39) + other + A1J());
    }

    private void A0p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) != this.A0V) {
            return;
        }
        int i = actionIndex == 0 ? 1 : 0;
        this.A0V = motionEvent.getPointerId(i);
        int x = (int) (motionEvent.getX(i) + 0.5f);
        this.A0S = x;
        this.A0Q = x;
        int y = (int) (motionEvent.getY(i) + 0.5f);
        this.A0T = y;
        this.A0R = y;
    }

    public static void A0q(View view, Rect insets) {
        C4G c4g = (C4G) view.getLayoutParams();
        Rect rect = c4g.A03;
        insets.set((view.getLeft() - rect.left) - c4g.leftMargin, (view.getTop() - rect.top) - c4g.topMargin, view.getRight() + rect.right + c4g.rightMargin, view.getBottom() + rect.bottom + c4g.bottomMargin);
    }

    private void A0r(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C4G) {
            C4G c4g = (C4G) layoutParams;
            if (!c4g.A01) {
                Rect rect = c4g.A03;
                this.A0p.left -= rect.left;
                this.A0p.right += rect.right;
                this.A0p.top -= rect.top;
                this.A0p.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1f(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0s(AnonymousClass43 anonymousClass43, boolean z, boolean z2) {
        AnonymousClass43 anonymousClass432 = this.A04;
        if (anonymousClass432 != null) {
            C0977Sg c0977Sg = this.A11;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "W0We85FJJqvSsXa60a6gd4EA7hDdiGkp";
            strArr2[4] = "7sp9VzUFxAlBM78ItapDbGKr6NkpOVCZ";
            anonymousClass432.A0A(c0977Sg);
        }
        if (!z || z2) {
            A1P();
        }
        this.A00.A0J();
        AnonymousClass43 anonymousClass433 = this.A04;
        this.A04 = anonymousClass43;
        if (anonymousClass43 != null) {
            anonymousClass43.A09(this.A11);
        }
        C4F c4f = this.A06;
        this.A0r.A0Z(anonymousClass433, this.A04, z);
        this.A0s.A0D = true;
        A1R();
    }

    private void A0t(C4X c4x) {
        View view = c4x.A0H;
        boolean z = view.getParent() == this;
        this.A0r.A0d(A1I(view));
        if (c4x.A0f()) {
            C03603d c03603d = this.A01;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "yAMck033yUmsKAwrNaBuaPdrYuAtD8a4";
            strArr2[4] = "2F1g5meBaFaT8Ughfaz4Efd5BOFwzFG2";
            c03603d.A0I(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.A01.A0K(view, true);
        } else {
            this.A01.A0F(view);
        }
    }

    public static void A0u(@NonNull C4X c4x) {
        if (c4x.A09 != null) {
            WeakReference<ES> weakReference = c4x.A09;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "Lp0Vudgnjyr9htx58aJuOXSG6zR0Rms0";
            strArr[4] = "QnOoNSP4qihOpTYseackLt73SA9jbFjz";
            ES es = weakReference.get();
            while (es != null) {
                if (es == c4x.A0H) {
                    return;
                }
                ViewParent parent = es.getParent();
                if (parent instanceof View) {
                    es = (View) parent;
                } else {
                    es = null;
                }
            }
            c4x.A09 = null;
        }
    }

    private void A0v(@NonNull C4X c4x, @NonNull C4X c4x2, @NonNull C4A c4a, @NonNull C4A c4a2, boolean z, boolean z2) {
        c4x.A0a(false);
        if (z) {
            A0t(c4x);
        }
        if (c4x != c4x2) {
            if (z2) {
                A0t(c4x2);
            }
            c4x.A06 = c4x2;
            A0t(c4x);
            this.A0r.A0d(c4x);
            c4x2.A0a(false);
            c4x2.A07 = c4x;
        }
        if (this.A05.A0L(c4x, c4x2, c4a, c4a2)) {
            A1O();
        }
    }

    private void A0z(int[] iArr) {
        int minPositionPreLayout = this.A01.A06();
        if (minPositionPreLayout == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int pos = Integer.MAX_VALUE;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < minPositionPreLayout; i2++) {
            C4X A0G = A0G(this.A01.A0A(i2));
            if (!A0G.A0i()) {
                int A0J = A0G.A0J();
                if (A0J < pos) {
                    pos = A0J;
                }
                if (A0J > i) {
                    i = A0J;
                }
            }
        }
        iArr[0] = pos;
        iArr[1] = i;
    }

    private boolean A10() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            C4X A0G = A0G(this.A01.A0A(i));
            if (A0G != null && !A0G.A0i() && A0G.A0g()) {
                return true;
            }
        }
        return false;
    }

    private boolean A11() {
        return this.A05 != null && this.A06.A27();
    }

    private boolean A13(int i, int i2) {
        A0z(this.A14);
        int[] iArr = this.A14;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private final boolean A14(int nestedScrollAxis, int i) {
        C4F c4f = this.A06;
        if (c4f == null) {
            Log.e(A0J(1370, 12, 79), A0J(651, 89, 76));
            return false;
        } else if (this.A0I) {
            return false;
        } else {
            boolean A25 = c4f.A25();
            boolean A26 = this.A06.A26();
            nestedScrollAxis = (!A25 || Math.abs(nestedScrollAxis) < this.A0y) ? 0 : 0;
            i = (!A26 || Math.abs(i) < this.A0y) ? 0 : 0;
            if ((nestedScrollAxis != 0 || i != 0) && !dispatchNestedPreFling(nestedScrollAxis, i)) {
                boolean z = A25 || A26;
                dispatchNestedFling(nestedScrollAxis, i, z);
                C4I c4i = this.A0g;
                if (c4i != null && c4i.A0D(nestedScrollAxis, i)) {
                    return true;
                }
                if (z) {
                    int i2 = 0;
                    if (A25) {
                        i2 = 0 | 1;
                    }
                    if (A26) {
                        i2 |= 2;
                    }
                    A1x(i2, 1);
                    int i3 = this.A0x;
                    int max = Math.max(-i3, Math.min(nestedScrollAxis, i3));
                    int i4 = this.A0x;
                    this.A08.A0A(max, Math.max(-i4, Math.min(i, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    private final boolean A15(int unconsumedY, int consumedX, MotionEvent motionEvent) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        A1K();
        if (this.A04 != null) {
            A1L();
            A1M();
            C2H.A01(A0J(1361, 9, 75));
            A1m(this.A0s);
            if (unconsumedY != 0) {
                i3 = this.A06.A1i(unconsumedY, this.A0r, this.A0s);
                i = unconsumedY - i3;
            }
            if (consumedX != 0) {
                i4 = this.A06.A1j(consumedX, this.A0r, this.A0s);
                i2 = consumedX - i4;
            }
            C2H.A00();
            A1Q();
            A1N();
            A1s(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1y(i3, i4, i, i2, this.A17, 0)) {
            int consumedY = this.A0S;
            int[] iArr = this.A17;
            int unconsumedX = iArr[0];
            this.A0S = consumedY - unconsumedX;
            int consumedY2 = this.A0T;
            int unconsumedX2 = iArr[1];
            this.A0T = consumedY2 - unconsumedX2;
            if (motionEvent != null) {
                int unconsumedX3 = iArr[0];
                float f = unconsumedX3;
                int unconsumedX4 = iArr[1];
                motionEvent.offsetLocation(f, unconsumedX4);
            }
            int[] iArr2 = this.A15;
            int i5 = iArr2[0];
            int[] iArr3 = this.A17;
            int unconsumedX5 = iArr3[0];
            int i6 = i5 + unconsumedX5;
            String[] strArr = A19;
            String str = strArr[6];
            String str2 = strArr[4];
            int consumedY3 = str.charAt(17);
            int unconsumedX6 = str2.charAt(17);
            if (consumedY3 != unconsumedX6) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[1] = "TzjapWGLjdNwrlMHhQTvw0KTjubTnl9R";
            strArr2[1] = "TzjapWGLjdNwrlMHhQTvw0KTjubTnl9R";
            iArr2[0] = i6;
            int consumedY4 = iArr2[1];
            int unconsumedX7 = iArr3[1];
            iArr2[1] = consumedY4 + unconsumedX7;
        } else {
            int consumedY5 = getOverScrollMode();
            if (consumedY5 != 2) {
                if (motionEvent != null && !C03332a.A00(motionEvent, 8194)) {
                    float x = motionEvent.getX();
                    float f2 = i;
                    float y = motionEvent.getY();
                    float f3 = i2;
                    int consumedY6 = A19[1].length();
                    if (consumedY6 != 32) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A19;
                    strArr3[1] = "Rb7Wd2rB1Bk4FJnk1H23iqiZozoKDKpI";
                    strArr3[1] = "Rb7Wd2rB1Bk4FJnk1H23iqiZozoKDKpI";
                    A0l(x, f2, y, f3);
                }
                A1a(unconsumedY, consumedX);
            }
        }
        if (i3 != 0 || i4 != 0) {
            A1c(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i3 == 0 && i4 == 0) ? false : true;
    }

    private boolean A16(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.A0h != null) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.A13.size();
            for (int i = 0; i < size; i++) {
                C4J c4j = this.A13.get(i);
                if (c4j.onInterceptTouchEvent(this, motionEvent)) {
                    this.A0h = c4j;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean A17(MotionEvent motionEvent) {
        int listenerCount = motionEvent.getAction();
        if (listenerCount == 3 || listenerCount == 0) {
            this.A0h = null;
        }
        int size = this.A13.size();
        for (int i = 0; i < size; i++) {
            C4J c4j = this.A13.get(i);
            if (c4j.onInterceptTouchEvent(this, motionEvent) && listenerCount != 3) {
                this.A0h = c4j;
                return true;
            }
        }
        return false;
    }

    private boolean A18(View view, View view2, int i) {
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i == 2 || i == 1) {
            if (A19(view, view2, (i == 2) ^ (this.A06.A0b() == 1) ? 66 : 17)) {
                return true;
            }
            if (i == 2) {
                return A19(view, view2, WKSRecord.Service.CISCO_FNA);
            }
            return A19(view, view2, 33);
        }
        return A19(view, view2, i);
    }

    private boolean A19(View view, View view2, int i) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        if (i == 17) {
            return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
        }
        String[] strArr = A19;
        if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[1] = "Yc6OUsH3chOpt4vkJfacRirYduge3wUm";
        strArr2[1] = "Yc6OUsH3chOpt4vkJfacRirYduge3wUm";
        if (i == 33) {
            return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
        } else if (i == 66) {
            return (this.A0p.left < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
        } else if (i == 130) {
            return (this.A0p.top < this.A0z.top || this.A0p.bottom <= this.A0z.top) && this.A0p.bottom < this.A0z.bottom;
        } else {
            throw new IllegalArgumentException(A0J(1844, 37, 102) + i + A1J());
        }
    }

    private final boolean A1A(AccessibilityEvent accessibilityEvent) {
        if (A1v()) {
            int i = 0;
            if (accessibilityEvent != null) {
                i = C3D.A00(accessibilityEvent);
            }
            if (i == 0) {
                i = 0;
            }
            this.A0P |= i;
            return true;
        }
        return false;
    }

    public final int A1D(View view) {
        C4X A0G = A0G(view);
        if (A0G != null) {
            return A0G.A0J();
        }
        return -1;
    }

    public final int A1E(C4X c4x) {
        if (c4x.A0l(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT) || !c4x.A0b()) {
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "S0wUd1";
            strArr[7] = "zF1SY7WsjbFG";
            return -1;
        }
        return this.A00.A0F(c4x.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Rect A1F(View view) {
        C4G c4g = (C4G) view.getLayoutParams();
        if (!c4g.A01) {
            return c4g.A03;
        }
        if (this.A0s.A07()) {
            if (!c4g.A01()) {
                boolean A03 = c4g.A03();
                if (A19[5].charAt(2) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "R8RZJpxNRYJLmE7KdaIYiTLeL7r3Y7bS";
                strArr[4] = "BRrnvNJfpVwihHaR5a5gEdBxu0vp26qH";
            }
            return c4g.A03;
        }
        Rect rect = c4g.A03;
        rect.set(0, 0, 0, 0);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0p.set(0, 0, 0, 0);
            this.A0v.get(i).A01(this.A0p, view, this, this.A0s);
            int i2 = rect.left;
            int i3 = this.A0p.left;
            rect.left = i2 + i3;
            int i4 = rect.top;
            int i5 = this.A0p.top;
            rect.top = i4 + i5;
            int i6 = rect.right;
            int i7 = this.A0p.right;
            rect.right = i6 + i7;
            int i8 = rect.bottom;
            int i9 = this.A0p.bottom;
            rect.bottom = i8 + i9;
        }
        c4g.A01 = false;
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A1G(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4X A1H(int i, boolean z) {
        String[] strArr;
        int A07 = this.A01.A07();
        C4X c4x = null;
        for (int i2 = 0; i2 < A07; i2++) {
            C4X A0G = A0G(this.A01.A0B(i2));
            if (A0G != null && !A0G.A0d()) {
                if (z) {
                    if (A0G.A03 != i) {
                        continue;
                    }
                    C03603d c03603d = this.A01;
                    View view = A0G.A0H;
                    strArr = A19;
                    if (strArr[6].charAt(17) == strArr[4].charAt(17)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[6] = "j0pgcyCAMmCuelBFBaEKhw82BLWYdvOX";
                    strArr2[4] = "bxiKg4TrHtXBSvyNTaSo7IOhyUGlGIW4";
                    if (c03603d.A0L(view)) {
                        c4x = A0G;
                    } else {
                        return A0G;
                    }
                } else {
                    if (A0G.A0J() != i) {
                        continue;
                    }
                    C03603d c03603d2 = this.A01;
                    View view2 = A0G.A0H;
                    strArr = A19;
                    if (strArr[6].charAt(17) == strArr[4].charAt(17)) {
                    }
                }
            }
        }
        return c4x;
    }

    public final C4X A1I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0G(view);
        }
        throw new IllegalArgumentException(A0J(1826, 5, 56) + view + A0J(98, 26, 127) + this);
    }

    public final String A1J() {
        return A0J(0, 1, 65) + super.toString() + A0J(169, 10, 82) + this.A04 + A0J(189, 9, 71) + this.A06 + A0J(179, 10, 10) + getContext();
    }

    public final void A1K() {
        boolean z = this.A0D;
        String A0J = A0J(1313, 17, 94);
        if (!z || this.A0C) {
            C2H.A01(A0J);
            A0a();
            C2H.A00();
        } else if (!this.A00.A0K()) {
        } else {
            if (this.A00.A0M(4)) {
                boolean A0M = this.A00.A0M(11);
                if (A19[5].charAt(2) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "e84NaKOnn7I9zpRn8aasqpcOMtbsg9mo";
                strArr[4] = "iuEMZhfSQYSf3gJ7Ya7A7FZe771rQXKi";
                if (!A0M) {
                    C2H.A01(A0J(1341, 20, 82));
                    A1L();
                    A1M();
                    this.A00.A0I();
                    if (!this.A0J) {
                        if (A10()) {
                            A0a();
                        } else {
                            this.A00.A0G();
                        }
                    }
                    A1s(true);
                    A1N();
                    C2H.A00();
                    return;
                }
            }
            if (this.A00.A0K()) {
                C2H.A01(A0J);
                A0a();
                C2H.A00();
            }
        }
    }

    public final void A1L() {
        this.A0O++;
        if (this.A0O == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1M() {
        this.A0U++;
    }

    public final void A1N() {
        A1r(true);
    }

    public final void A1O() {
        if (!this.A0K && this.A0F) {
            C2u.A0C(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1P() {
        C4B c4b = this.A05;
        if (c4b != null) {
            c4b.A0C();
        }
        C4F c4f = this.A06;
        if (c4f != null) {
            c4f.A1J(this.A0r);
            this.A06.A1H(this.A0r);
        }
        this.A0r.A0Q();
    }

    public final void A1Q() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            View A0A = this.A01.A0A(i);
            C4X A1I2 = A1I(A0A);
            if (A1I2 != null && A1I2.A07 != null) {
                View view = A1I2.A07.A0H;
                int left = A0A.getLeft();
                int top = A0A.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    int width = view.getWidth();
                    String[] strArr = A19;
                    String str = strArr[2];
                    String str2 = strArr[7];
                    int top2 = str.length();
                    if (top2 == str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "Uubm7UlJXcXPQblsDCbwus";
                    strArr2[0] = "kvvVMTFBun";
                    view.layout(left, top, width + left, view.getHeight() + top);
                }
            }
        }
    }

    public final void A1R() {
        this.A0C = true;
        A0j();
    }

    public final void A1S() {
        setScrollState(0);
        A0W();
    }

    public final void A1T(int i) {
        C4F c4f = this.A06;
        if (c4f == null) {
            return;
        }
        c4f.A1u(i);
        awakenScrollBars();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "0QEBPr";
        strArr[7] = "MYIDRbA0xlXg";
    }

    public final void A1U(int i) {
        int A06 = this.A01.A06();
        for (int i2 = 0; i2 < A06; i2++) {
            this.A01.A0A(i2).offsetLeftAndRight(i);
        }
    }

    public final void A1V(int i) {
        int A06 = this.A01.A06();
        for (int i2 = 0; i2 < A06; i2++) {
            this.A01.A0A(i2).offsetTopAndBottom(i);
        }
    }

    public final void A1W(int i) {
        if (this.A0I) {
            return;
        }
        A1S();
        C4F c4f = this.A06;
        if (c4f == null) {
            String A0J = A0J(1370, 12, 79);
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "bKq2dxkRCeugdKx9Xa6GvrcP2g1fh08B";
            strArr2[4] = "kU2aPHyT0THRQATybaGwdbwAtHBBu9qc";
            Log.e(A0J, A0J(740, 94, 69));
            return;
        }
        c4f.A1u(i);
        awakenScrollBars();
    }

    public final void A1X(int i) {
        if (this.A0I) {
            return;
        }
        C4F c4f = this.A06;
        String[] strArr = A19;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[6] = "WdHf0lV4QkHUB6jMNa4hJVyYAF4qnaeC";
        strArr2[4] = "5gGhKJie0DBDDFfkhapEv4fZOrT4upMj";
        if (c4f != null) {
            c4f.A22(this, this.A0s, i);
            return;
        }
        String[] strArr3 = A19;
        if (strArr3[6].charAt(17) != strArr3[4].charAt(17)) {
            String[] strArr4 = A19;
            strArr4[6] = "tnW8WJDd0hyAXA7zkanproBVQy0r1bMC";
            strArr4[4] = "4Fp0w8uFB0Hn5lDXLaIQvmhL07bdVyXH";
            Log.e(A0J(1370, 10, 13), A0J(858, 46, 16));
            return;
        }
        String[] strArr5 = A19;
        strArr5[3] = "z3A7CLBHtBtrAEYqxn9jPo";
        strArr5[0] = "loKczzo2gT";
        Log.e(A0J(1370, 12, 79), A0J(924, 97, 75));
    }

    public final void A1Y(int i) {
        getScrollingChildHelper().A04(i);
    }

    public final void A1Z(int i, int i2) {
        if (i < 0) {
            A0d();
            this.A0a.onAbsorb(-i);
        } else if (i > 0) {
            A0e();
            this.A0b.onAbsorb(i);
        }
        if (i2 < 0) {
            A0f();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[1] = "gyhAwDIMjNJoK3bJ2ki6wxmL7XFPannX";
            strArr[1] = "gyhAwDIMjNJoK3bJ2ki6wxmL7XFPannX";
            this.A0c.onAbsorb(-i2);
        } else if (i2 > 0) {
            A0c();
            this.A0Z.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C2u.A07(this);
        }
    }

    public final void A1a(int i, int i2) {
        boolean z = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A0a.onRelease();
            z = this.A0a.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0b;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A0b.onRelease();
            z |= this.A0b.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            EdgeEffect edgeEffect4 = this.A0c;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "CkvbraPTkuNHVjG6c5toq1";
            strArr[0] = "anwNoWvWLV";
            edgeEffect4.onRelease();
            z |= this.A0c.isFinished();
        }
        EdgeEffect edgeEffect5 = this.A0Z;
        if (edgeEffect5 != null && !edgeEffect5.isFinished() && i2 < 0) {
            this.A0Z.onRelease();
            z |= this.A0Z.isFinished();
        }
        if (z) {
            C2u.A07(this);
        }
    }

    public final void A1b(int i, int i2) {
        setMeasuredDimension(C4F.A00(i, getPaddingLeft() + getPaddingRight(), C2u.A03(this)), C4F.A00(i2, getPaddingTop() + getPaddingBottom(), C2u.A02(this)));
    }

    public final void A1c(int scrollY, int i) {
        this.A0N++;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        onScrollChanged(scrollX, scrollY2, scrollX, scrollY2);
        C4K c4k = this.A0i;
        if (c4k != null) {
            c4k.A0W(this, scrollY, i);
        }
        List<C4K> list = this.A0m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0W(this, scrollY, i);
            }
        }
        this.A0N--;
    }

    public final void A1d(int i, int i2) {
        int A07 = this.A01.A07();
        for (int i3 = 0; i3 < A07; i3++) {
            C4X A0G = A0G(this.A01.A0B(i3));
            if (A0G != null && !A0G.A0i()) {
                int i4 = A0G.A03;
                if (A19[5].charAt(2) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[1] = "WfIl2QLxhpsV1cZ5bwDa0wyCBTSIuEWm";
                strArr[1] = "WfIl2QLxhpsV1cZ5bwDa0wyCBTSIuEWm";
                if (i4 >= i) {
                    A0G.A0X(i2, false);
                    this.A0s.A0D = true;
                }
            }
        }
        this.A0r.A0S(i, i2);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r10 == r12) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        r0 = r13 - r12;
        r9.A0X(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r10 == r12) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        r9.A0X(r4, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1e(int start, int end) {
        int i;
        int i2;
        int i3;
        int i4 = this.A01.A07();
        if (start < end) {
            i = start;
            i2 = end;
            i3 = -1;
        } else {
            i = end;
            i2 = start;
            i3 = 1;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            C4X A0G = A0G(this.A01.A0B(i5));
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "SA2Eyd";
            strArr[7] = "XMtlHmP9rGs3";
            if (A0G != null) {
                int inBetweenOffset = A0G.A03;
                if (inBetweenOffset >= i) {
                    int inBetweenOffset2 = A0G.A03;
                    if (inBetweenOffset2 <= i2) {
                        int i6 = A0G.A03;
                        String[] strArr2 = A19;
                        String str = strArr2[6];
                        String str2 = strArr2[4];
                        int charAt = str.charAt(17);
                        int inBetweenOffset3 = str2.charAt(17);
                        if (charAt == inBetweenOffset3) {
                            String[] strArr3 = A19;
                            strArr3[6] = "BcaezuMb6aDfAWKozakh45MfYrs0kuIc";
                            strArr3[4] = "5erwLY6dW1OUzDMynaZgWLcHWlHtC3ze";
                        }
                        this.A0s.A0D = true;
                    }
                }
            }
        }
        this.A0r.A0T(start, end);
        requestLayout();
    }

    public final void A1f(int i, int i2) {
        A0n(i, i2, null);
    }

    public final void A1g(int positionEnd, int i, Object obj) {
        int A07 = this.A01.A07();
        int i2 = positionEnd + i;
        for (int i3 = 0; i3 < A07; i3++) {
            View A0B = this.A01.A0B(i3);
            C4X A0G = A0G(A0B);
            if (A0G != null && !A0G.A0i()) {
                int i4 = A0G.A03;
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[2] = "87XYbE";
                strArr[7] = "GV1T0vfadOcw";
                if (i4 >= positionEnd && A0G.A03 < i2) {
                    A0G.A0U(2);
                    A0G.A0Z(obj);
                    ((C4G) A0B.getLayoutParams()).A01 = true;
                }
            }
        }
        this.A0r.A0U(positionEnd, i);
    }

    public final void A1h(int childCount, int i, boolean z) {
        int i2 = childCount + i;
        int A07 = this.A01.A07();
        for (int i3 = 0; i3 < A07; i3++) {
            C4X A0G = A0G(this.A01.A0B(i3));
            if (A0G != null && !A0G.A0i()) {
                if (A0G.A03 >= i2) {
                    A0G.A0X(-i, z);
                    this.A0s.A0D = true;
                } else if (A0G.A03 >= childCount) {
                    A0G.A0W(childCount - 1, -i, z);
                    if (A19[1].length() != 32) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A19;
                    strArr[2] = "dcjb0S";
                    strArr[7] = "CcIDXd599Ygw";
                    this.A0s.A0D = true;
                } else {
                    continue;
                }
            }
        }
        this.A0r.A0V(childCount, i, z);
        requestLayout();
    }

    public final void A1i(View view) {
        int i;
        A0G(view);
        AnonymousClass43 anonymousClass43 = this.A04;
        List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[5] = "qDYnzfveQxKkK3O0opuqDthRtcgsED9a";
        strArr[5] = "qDYnzfveQxKkK3O0opuqDthRtcgsED9a";
        if (list != null && list.size() - 1 >= 0) {
            this.A0l.get(i);
            throw null;
        }
    }

    public final void A1j(View view) {
        int i;
        A0G(view);
        AnonymousClass43 anonymousClass43 = this.A04;
        List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
        if (list != null && list.size() - 1 >= 0) {
            this.A0l.get(i);
            throw null;
        }
    }

    public final void A1k(C4K c4k) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(c4k);
    }

    public final void A1l(C4K c4k) {
        List<C4K> list = this.A0m;
        if (list != null) {
            list.remove(c4k);
        }
    }

    public final void A1m(C4U c4u) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            c4u.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            c4u.A07 = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        c4u.A06 = 0;
        c4u.A07 = 0;
    }

    public final void A1n(C4X c4x, C4A c4a) {
        c4x.A0V(0, 8192);
        if (this.A0s.A0E && c4x.A0g() && !c4x.A0d() && !c4x.A0i()) {
            this.A0t.A09(A0C(c4x), c4x);
        }
        this.A0t.A0G(c4x, c4a);
    }

    public final void A1o(@NonNull C4X c4x, @Nullable C4A c4a, @NonNull C4A c4a2) {
        c4x.A0a(false);
        if (this.A05.A0I(c4x, c4a, c4a2)) {
            A1O();
        }
    }

    public final void A1p(@NonNull C4X c4x, @NonNull C4A c4a, @Nullable C4A c4a2) {
        A0t(c4x);
        c4x.A0a(false);
        if (this.A05.A0J(c4x, c4a, c4a2)) {
            A1O();
        }
    }

    public final void A1q(String str) {
        if (A1v()) {
            if (str == null) {
                throw new IllegalStateException(A0J(574, 77, 49) + A1J());
            }
            throw new IllegalStateException(str);
        } else if (this.A0N > 0) {
            Log.w(A0J(1370, 12, 79), A0J(294, 280, 24), new IllegalStateException(A0J(0, 0, 62) + A1J()));
        }
    }

    public final void A1r(boolean z) {
        this.A0U--;
        if (this.A0U < 1) {
            this.A0U = 0;
            if (z) {
                A0L();
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "clcdgLago0QzUCUQna9RqUvMnx3zufId";
                strArr[4] = "dGTmnJIudyc2xKqsUaVYnInX4VXDIHXZ";
                A0b();
            }
        }
    }

    public final void A1s(boolean z) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z && this.A0J && !this.A0I && this.A06 != null && this.A04 != null) {
                A0a();
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1t() {
        AccessibilityManager accessibilityManager = this.A10;
        if (accessibilityManager != null) {
            boolean isEnabled = accessibilityManager.isEnabled();
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[5] = "qqYNnQooq1iBe19qNxONRBmcR9jcXf5d";
            strArr2[5] = "qqYNnQooq1iBe19qNxONRBmcR9jcXf5d";
            if (isEnabled) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1u() {
        return !this.A0D || this.A0C || this.A00.A0K();
    }

    public final boolean A1v() {
        return this.A0U > 0;
    }

    public final boolean A1w(int i) {
        return getScrollingChildHelper().A0A(i);
    }

    public final boolean A1x(int i, int i2) {
        return getScrollingChildHelper().A0C(i, i2);
    }

    public final boolean A1y(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A0E(i, i2, i3, i4, iArr, i5);
    }

    public final boolean A1z(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().A0G(i, i2, iArr, iArr2, i3);
    }

    public final boolean A20(View view) {
        A1L();
        boolean A0M = this.A01.A0M(view);
        if (A0M) {
            C4X A0G = A0G(view);
            this.A0r.A0d(A0G);
            this.A0r.A0c(A0G);
        }
        A1s(!A0M);
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[3] = "2BT72D7B0XXfHPWJs3DbS8";
        strArr[0] = "RgGvPpmRJD";
        return A0M;
    }

    public final boolean A21(C4X c4x) {
        C4B c4b = this.A05;
        return c4b == null || c4b.A0G(c4x, c4x.A0M());
    }

    @VisibleForTesting
    public final boolean A22(C4X c4x, int i) {
        if (A1v()) {
            c4x.A02 = i;
            this.A0w.add(c4x);
            return false;
        }
        C2u.A09(c4x.A0H, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C4F c4f = this.A06;
        if (c4f != null) {
            boolean A1h = c4f.A1h(this, arrayList, i, i2);
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "qzNrCd";
            strArr[7] = "bMAkXN6Kp1Dd";
            if (A1h) {
                return;
            }
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4G) && this.A06.A1d((C4G) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        C4F c4f = this.A06;
        if (c4f != null && c4f.A25()) {
            return this.A06.A1k(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        C4F c4f = this.A06;
        if (c4f != null && c4f.A25()) {
            return this.A06.A1l(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        C4F c4f = this.A06;
        if (c4f == null) {
            return 0;
        }
        boolean A25 = c4f.A25();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[1] = "GzwOa56ahdwGOmec9vc3XIggLcxaXOnz";
        strArr[1] = "GzwOa56ahdwGOmec9vc3XIggLcxaXOnz";
        if (A25) {
            return this.A06.A1m(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C4F c4f = this.A06;
        if (c4f == null) {
            return 0;
        }
        boolean A26 = c4f.A26();
        String[] strArr = A19;
        if (strArr[3].length() != strArr[0].length()) {
            String[] strArr2 = A19;
            strArr2[2] = "Wsbuah";
            strArr2[7] = "lDl9g1VSjrmk";
            if (!A26) {
                return 0;
            }
            C4F c4f2 = this.A06;
            String[] strArr3 = A19;
            if (strArr3[3].length() != strArr3[0].length()) {
                String[] strArr4 = A19;
                strArr4[5] = "sfYwg45p3roym5legx720iFNlg07mmUN";
                strArr4[5] = "sfYwg45p3roym5legx720iFNlg07mmUN";
                return c4f2.A1n(this.A0s);
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C4F c4f = this.A06;
        if (c4f != null && c4f.A26()) {
            return this.A06.A1o(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C4F c4f = this.A06;
        if (c4f != null && c4f.A26()) {
            C4F c4f2 = this.A06;
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "NPPquBudgt65Kfhzva46C14iIBYgw5ng";
            strArr[4] = "gzaMlk0wrsXS1BjbnaI8sjsGlzE0u55w";
            return c4f2.A1p(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A09(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A08(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0F(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A0D(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x012b, code lost:
        if (r3.A0F() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012d, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0144, code lost:
        if (r3.A0F() != false) goto L77;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int width;
        super.draw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
        int padding = 0;
        EdgeEffect edgeEffect = this.A0a;
        int i2 = 1;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            int paddingBottom = this.A0B ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A0a;
            padding = (edgeEffect2 == null || !edgeEffect2.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.A0B) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.A0c;
            padding |= (edgeEffect4 == null || !edgeEffect4.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.A0b;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width2 = getWidth();
            int paddingTop = this.A0B ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            int width3 = -paddingTop;
            float f = width3;
            int width4 = -width2;
            canvas.translate(f, width4);
            EdgeEffect edgeEffect6 = this.A0b;
            if (edgeEffect6 != null) {
                boolean draw = edgeEffect6.draw(canvas);
                String[] strArr = A19;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int width5 = str2.length();
                if (length == width5) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[5] = "ItYbouux6ivob9pa5cwYanZ1Qwg84bbh";
                strArr2[5] = "ItYbouux6ivob9pa5cwYanZ1Qwg84bbh";
                if (draw) {
                    width = 1;
                    padding |= width;
                    canvas.restoreToCount(save3);
                }
            }
            width = 0;
            padding |= width;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.A0Z;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.A0B) {
                int width6 = getWidth();
                int i3 = -width6;
                int width7 = getPaddingRight();
                float f2 = i3 + width7;
                int width8 = getHeight();
                int i4 = -width8;
                int width9 = getPaddingBottom();
                canvas.translate(f2, i4 + width9);
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.A0Z;
            padding |= (edgeEffect8 == null || !edgeEffect8.draw(canvas)) ? 0 : 0;
            canvas.restoreToCount(save4);
        }
        if (padding == 0 && this.A05 != null && this.A0v.size() > 0) {
            C4B c4b = this.A05;
            if (A19[5].charAt(2) == 'Y') {
                String[] strArr3 = A19;
                strArr3[5] = "slYCg9imVkQI2IB5irC0agqTwBjTAdyw";
                strArr3[5] = "slYCg9imVkQI2IB5irC0agqTwBjTAdyw";
            }
        }
        if (padding != 0) {
            C2u.A07(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        boolean z;
        FocusFinder focusFinder;
        View findNextFocus;
        View A0v = this.A06.A0v(view, i);
        if (A0v != null) {
            return A0v;
        }
        if (this.A04 != null) {
            C4F c4f = this.A06;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "RhZxCClAx00iKsBYiNgalY";
            strArr2[0] = "xpwAZ9hAV8";
            if (c4f != null && !A1v() && !this.A0I) {
                z = true;
                focusFinder = FocusFinder.getInstance();
                if (!z && (i == 2 || i == 1)) {
                    int i2 = 0;
                    if (this.A06.A26()) {
                        int i3 = i == 2 ? WKSRecord.Service.CISCO_FNA : 33;
                        i2 = focusFinder.findNextFocus(this, view, i3) == null ? 1 : 0;
                        if (A1F) {
                            i = i3;
                        }
                    }
                    if (i2 == 0 && this.A06.A25()) {
                        int i4 = (i == 2) ^ (this.A06.A0b() == 1) ? 66 : 17;
                        int absDir = focusFinder.findNextFocus(this, view, i4) != null ? 0 : 1;
                        i2 = absDir;
                        if (A1F) {
                            i = i4;
                        }
                    }
                    if (i2 != 0) {
                        A1K();
                        if (A1G(view) == null) {
                            return null;
                        }
                        A1L();
                        this.A06.A1s(view, i, this.A0r, this.A0s);
                        A1s(false);
                    }
                    findNextFocus = focusFinder.findNextFocus(this, view, i);
                } else {
                    findNextFocus = focusFinder.findNextFocus(this, view, i);
                    if (findNextFocus == null && z) {
                        A1K();
                        if (A1G(view) != null) {
                            return null;
                        }
                        A1L();
                        findNextFocus = this.A06.A1s(view, i, this.A0r, this.A0s);
                        A1s(false);
                    }
                }
                if (findNextFocus != null || findNextFocus.hasFocusable()) {
                    return !A18(view, findNextFocus, i) ? findNextFocus : super.focusSearch(view, i);
                } else if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                } else {
                    A0r(findNextFocus, null);
                    return view;
                }
            }
        }
        z = false;
        focusFinder = FocusFinder.getInstance();
        if (!z) {
        }
        findNextFocus = focusFinder.findNextFocus(this, view, i);
        if (findNextFocus == null) {
            A1K();
            if (A1G(view) != null) {
            }
        }
        if (findNextFocus != null) {
        }
        if (!A18(view, findNextFocus, i)) {
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C4F c4f = this.A06;
        if (c4f != null) {
            return c4f.A1t();
        }
        throw new IllegalStateException(A0J(1475, 33, 17) + A1J());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C4F c4f = this.A06;
        if (c4f != null) {
            return c4f.A0w(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0J(1475, 33, 17) + A1J());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C4F c4f = this.A06;
        if (c4f != null) {
            C4G A0x = c4f.A0x(layoutParams);
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "4uZ9QAUZcjEo06EXHPHPN1";
            strArr[0] = "ePNmh1lbEA";
            return A0x;
        }
        throw new IllegalStateException(A0J(1475, 33, 17) + A1J());
    }

    public AnonymousClass43 getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        C4F c4f = this.A06;
        if (c4f != null) {
            int A0W = c4f.A0W();
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[1] = "WUntfQVcja1qFzj09nDprclvV6sI7lKs";
            strArr[1] = "WUntfQVcja1qFzj09nDprclvV6sI7lKs";
            return A0W;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        AnonymousClass46 anonymousClass46 = this.A0e;
        if (anonymousClass46 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return anonymousClass46.onGetChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C0979Sk getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public C4B getItemAnimator() {
        return this.A05;
    }

    public C4F getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public C4I getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C4M getRecycledViewPool() {
        return this.A0r.A0I();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C03352c getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C03352c(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A07();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z = true;
        this.A0F = true;
        this.A0D = (!this.A0D || isLayoutRequested()) ? false : false;
        C4F c4f = this.A06;
        if (c4f != null) {
            c4f.A1O(this);
        }
        this.A0K = false;
        if (A1E) {
            this.A03 = RunnableC03733q.A07.get();
            if (this.A03 == null) {
                this.A03 = new RunnableC03733q();
                Display A04 = C2u.A04(this);
                float f = 60.0f;
                if (!isInEditMode() && A04 != null) {
                    float refreshRate = A04.getRefreshRate();
                    String[] strArr = A19;
                    if (strArr[2].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "HPKMSTrO6rgllPECADdom7";
                    strArr2[0] = "yPSN9KqlOS";
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.A03.A00 = 1.0E9f / f;
                RunnableC03733q.A07.set(this.A03);
            }
            this.A03.A0A(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC03733q runnableC03733q;
        super.onDetachedFromWindow();
        C4B c4b = this.A05;
        if (c4b != null) {
            c4b.A0C();
        }
        A1S();
        this.A0F = false;
        C4F c4f = this.A06;
        if (c4f != null) {
            c4f.A1V(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A08();
        if (A1E && (runnableC03733q = this.A03) != null) {
            runnableC03733q.A0B(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if ((r4 & 4194304) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        r1 = r7.getAxisValue(26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r6.A06.A26() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        r0 = -r1;
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if ((r4 & 4194304) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r6.A06.A25() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
        r0 = 0.0f;
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
        r0 = 0.0f;
        r1 = 0.0f;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float hScroll;
        float f;
        if (this.A06 == null) {
            return false;
        }
        boolean z = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "hfCCVZ";
        strArr[7] = "6Rxn0wTGDCgs";
        if (!z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A26()) {
                    hScroll = -motionEvent.getAxisValue(9);
                } else {
                    hScroll = 0.0f;
                }
                if (this.A06.A25()) {
                    f = motionEvent.getAxisValue(10);
                } else {
                    f = 0.0f;
                }
            } else {
                int source = motionEvent.getSource();
                if (A19[5].charAt(2) == 'Y') {
                    String[] strArr2 = A19;
                    strArr2[5] = "SrYzqcFycO4E61WX0CCI79FBiQDWLxq8";
                    strArr2[5] = "SrYzqcFycO4E61WX0CCI79FBiQDWLxq8";
                }
            }
            if (hScroll != 0.0f || f != 0.0f) {
                A15((int) (this.A0L * f), (int) (this.A0M * hScroll), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            return false;
        }
        if (A17(motionEvent)) {
            A0K();
            return true;
        }
        C4F c4f = this.A06;
        if (c4f == null) {
            return false;
        }
        boolean A25 = c4f.A25();
        boolean A26 = this.A06.A26();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        this.A0Y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        String[] strArr = A19;
        String str = strArr[2];
        String str2 = strArr[7];
        int length = str.length();
        int action = str2.length();
        if (length != action) {
            String[] strArr2 = A19;
            strArr2[3] = "Oz3Y31ex0QABqFtFM6aXix";
            strArr2[0] = "OpGO9pAa6R";
            if (actionMasked == 0) {
                boolean startScroll = this.A0n;
                if (startScroll) {
                    this.A0n = false;
                }
                this.A0V = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.A0S = x;
                this.A0Q = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.A0T = y;
                this.A0R = y;
                if (this.A0W == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
                int[] iArr = this.A15;
                iArr[1] = 0;
                iArr[0] = 0;
                int nestedScrollAxis = 0;
                if (A25) {
                    nestedScrollAxis = 0 | 1;
                }
                if (A26) {
                    nestedScrollAxis |= 2;
                }
                A1x(nestedScrollAxis, 0);
            } else if (actionMasked == 1) {
                this.A0Y.clear();
                A1Y(0);
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.A0V);
                if (findPointerIndex < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0J(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, 46, 50));
                    int index = this.A0V;
                    sb.append(index);
                    sb.append(A0J(124, 45, 46));
                    Log.e(A0J(1370, 12, 79), sb.toString());
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int x3 = this.A0W;
                if (x3 != 1) {
                    int x4 = this.A0Q;
                    int i = x2 - x4;
                    int x5 = this.A0R;
                    int i2 = y2 - x5;
                    boolean z = false;
                    if (A25 && Math.abs(i) > this.A0X) {
                        this.A0S = x2;
                        z = true;
                    }
                    if (A26 && Math.abs(i2) > this.A0X) {
                        this.A0T = y2;
                        z = true;
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
            } else if (actionMasked == 3) {
                A0K();
            } else if (actionMasked == 5) {
                this.A0V = motionEvent.getPointerId(actionIndex);
                int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.A0S = x6;
                this.A0Q = x6;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.A0T = y3;
                this.A0R = y3;
            } else if (actionMasked == 6) {
                A0p(motionEvent);
            }
            int action2 = this.A0W;
            return action2 == 1;
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2H.A01(A0J(1330, 11, 86));
        A0a();
        C2H.A00();
        this.A0D = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (r3 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (r3 != false) goto L49;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        C4F c4f = this.A06;
        if (c4f == null) {
            A1b(i, i2);
            return;
        }
        boolean z = false;
        if (c4f.A06) {
            int mode = View.MeasureSpec.getMode(i);
            int heightMode = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && heightMode == 1073741824) {
                z = true;
            }
            this.A06.A1K(this.A0r, this.A0s, i, i2);
            if (z || this.A04 == null) {
                return;
            }
            if (this.A0s.A04 == 1) {
                A0M();
            }
            this.A06.A12(i, i2);
            this.A0s.A0A = true;
            A0N();
            this.A06.A13(i, i2);
            if (this.A06.A24()) {
                this.A06.A12(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.A0s.A0A = true;
                A0N();
                this.A06.A13(i, i2);
                return;
            }
            return;
        }
        boolean z2 = this.A0E;
        String[] strArr = A19;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[6] = "KQlS07WJlXQIeKT2EaNKgCMREedmurGg";
        strArr2[4] = "TSw2akNEB1AJctHCwaDYxiu1Uwr65JPJ";
        if (z2) {
            this.A06.A1K(this.A0r, this.A0s, i, i2);
            return;
        }
        if (this.A0A) {
            A1L();
            A1M();
            A0Q();
            A1N();
            if (this.A0s.A0B) {
                this.A0s.A09 = true;
            } else {
                this.A00.A0H();
                this.A0s.A09 = false;
            }
            this.A0A = false;
            A1s(false);
        } else {
            boolean z3 = this.A0s.A0B;
            if (A19[1].length() != 32) {
                String[] strArr3 = A19;
                strArr3[6] = "SNs0MIA5NFIkFiTpWaOkIZpcAnFttQ5E";
                strArr3[4] = "fXihHPq3ps5k4WwfOaG7U1bhyi9cbGtD";
            } else {
                String[] strArr4 = A19;
                strArr4[3] = "mxGjlxdGGYffeE2i6ToSoo";
                strArr4[0] = "9Nm63BEsB7";
            }
        }
        AnonymousClass43 anonymousClass43 = this.A04;
        if (anonymousClass43 != null) {
            this.A0s.A03 = anonymousClass43.A0E();
        } else {
            this.A0s.A03 = 0;
        }
        A1L();
        this.A06.A1K(this.A0r, this.A0s, i, i2);
        A1s(false);
        this.A0s.A09 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (A1v()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.A0j = (RecyclerView$SavedState) parcelable;
        super.onRestoreInstanceState(this.A0j.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1x(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState recyclerView$SavedState2 = this.A0j;
        if (recyclerView$SavedState2 != null) {
            recyclerView$SavedState.A03(recyclerView$SavedState2);
        } else {
            C4F c4f = this.A06;
            if (c4f != null) {
                recyclerView$SavedState.A00 = c4f.A1q();
            } else {
                recyclerView$SavedState.A00 = null;
            }
        }
        return recyclerView$SavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021e, code lost:
        if (A14((int) r7, (int) r2) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0220, code lost:
        setScrollState(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0223, code lost:
        A0U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0216, code lost:
        if (r2 != 0.0f) goto L101;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float xvel;
        float f;
        if (this.A0I || this.A0n) {
            return false;
        }
        boolean A16 = A16(motionEvent);
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[5] = "8sYT0RnpvG2arPES2UJ12JYFoUL9IQDo";
        strArr[5] = "8sYT0RnpvG2arPES2UJ12JYFoUL9IQDo";
        if (A16) {
            A0K();
            return true;
        }
        C4F c4f = this.A06;
        if (c4f == null) {
            return false;
        }
        boolean A25 = c4f.A25();
        boolean A26 = this.A06.A26();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        boolean z = false;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.A15;
            iArr[1] = 0;
            String[] strArr2 = A19;
            String str = strArr2[2];
            String str2 = strArr2[7];
            int length = str.length();
            int actionIndex2 = str2.length();
            if (length != actionIndex2) {
                String[] strArr3 = A19;
                strArr3[5] = "w9Y7A1oKaVmj8Ov6eZqRiF6tVMdmRve8";
                strArr3[5] = "w9Y7A1oKaVmj8Ov6eZqRiF6tVMdmRve8";
                iArr[0] = 0;
            } else {
                String[] strArr4 = A19;
                strArr4[6] = "DE62WFMw5Qbi4eBk1auhfUxeLGhnsE7e";
                strArr4[4] = "A6rUAAhMCRWi1Exz9agrYLVLW1oNRabf";
                iArr[0] = 0;
            }
        }
        int[] iArr2 = this.A15;
        int actionIndex3 = iArr2[0];
        float f2 = actionIndex3;
        int actionIndex4 = iArr2[1];
        obtain.offsetLocation(f2, actionIndex4);
        if (actionMasked == 0) {
            this.A0V = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.A0S = x;
            this.A0Q = x;
            int x2 = (int) (motionEvent.getY() + 0.5f);
            this.A0T = x2;
            this.A0R = x2;
            int x3 = 0;
            if (A25) {
                x3 = 0 | 1;
            }
            if (A26) {
                x3 |= 2;
            }
            A1x(x3, 0);
        } else if (actionMasked == 1) {
            this.A0Y.addMovement(obtain);
            z = true;
            this.A0Y.computeCurrentVelocity(1000, this.A0x);
            if (A25) {
                VelocityTracker velocityTracker = this.A0Y;
                int dy = this.A0V;
                String[] strArr5 = A19;
                if (strArr5[2].length() != strArr5[7].length()) {
                    String[] strArr6 = A19;
                    strArr6[5] = "cvYQb2BcK3cjm46xX51a5wS3GdK3mOIc";
                    strArr6[5] = "cvYQb2BcK3cjm46xX51a5wS3GdK3mOIc";
                    xvel = -velocityTracker.getXVelocity(dy);
                } else {
                    String[] strArr7 = A19;
                    strArr7[2] = "HePLvk";
                    strArr7[7] = "sISGhSA4Sc4c";
                    xvel = -velocityTracker.getXVelocity(dy);
                }
            } else {
                xvel = 0.0f;
            }
            if (A26) {
                VelocityTracker velocityTracker2 = this.A0Y;
                int i = this.A0V;
                String[] strArr8 = A19;
                if (strArr8[6].charAt(17) != strArr8[4].charAt(17)) {
                    f = -velocityTracker2.getYVelocity(i);
                } else {
                    String[] strArr9 = A19;
                    strArr9[5] = "lUYbAzGh0vj4LSfow0o2VnAou7QhBgLk";
                    strArr9[5] = "lUYbAzGh0vj4LSfow0o2VnAou7QhBgLk";
                    f = -velocityTracker2.getYVelocity(i);
                }
            } else {
                f = 0.0f;
            }
            if (xvel == 0.0f) {
            }
        } else if (actionMasked == 2) {
            int actionIndex5 = this.A0V;
            int findPointerIndex = motionEvent.findPointerIndex(actionIndex5);
            if (findPointerIndex >= 0) {
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i2 = this.A0S - x4;
                int dx = this.A0T - y;
                if (A1z(i2, dx, this.A16, this.A17, 0)) {
                    int[] iArr3 = this.A16;
                    i2 -= iArr3[0];
                    dx -= iArr3[1];
                    int[] iArr4 = this.A17;
                    obtain.offsetLocation(iArr4[0], iArr4[1]);
                    int[] iArr5 = this.A15;
                    int index = iArr5[0];
                    int[] iArr6 = this.A17;
                    iArr5[0] = index + iArr6[0];
                    int index2 = iArr5[1];
                    iArr5[1] = index2 + iArr6[1];
                }
                if (this.A0W != 1) {
                    boolean z2 = false;
                    if (A25) {
                        int index3 = Math.abs(i2);
                        int x5 = this.A0X;
                        if (index3 > x5) {
                            if (i2 > 0) {
                                i2 -= x5;
                            } else {
                                i2 += x5;
                            }
                            z2 = true;
                        }
                    }
                    if (A26) {
                        int index4 = Math.abs(dx);
                        int x6 = this.A0X;
                        if (index4 > x6) {
                            if (dx > 0) {
                                dx -= x6;
                            } else {
                                dx += x6;
                            }
                            z2 = true;
                        }
                    }
                    if (z2) {
                        setScrollState(1);
                    }
                }
                if (this.A0W == 1) {
                    int[] iArr7 = this.A17;
                    this.A0S = x4 - iArr7[0];
                    this.A0T = y - iArr7[1];
                    if (A15(A25 ? i2 : 0, A26 ? dx : 0, obtain)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    if (this.A03 != null && (i2 != 0 || dx != 0)) {
                        this.A03.A0C(this, i2, dx);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(A0J(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, 46, 50));
                int actionIndex6 = this.A0V;
                sb.append(actionIndex6);
                sb.append(A0J(124, 45, 46));
                Log.e(A0J(1370, 12, 79), sb.toString());
                return false;
            }
        } else if (actionMasked == 3) {
            A0K();
        } else if (actionMasked == 5) {
            int actionIndex7 = motionEvent.getPointerId(actionIndex);
            this.A0V = actionIndex7;
            int actionIndex8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.A0S = actionIndex8;
            this.A0Q = actionIndex8;
            int actionIndex9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.A0T = actionIndex9;
            this.A0R = actionIndex9;
        } else if (actionMasked == 6) {
            A0p(motionEvent);
        }
        if (!z) {
            this.A0Y.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        C4X A0G = A0G(view);
        if (A0G != null) {
            if (A0G.A0f()) {
                A0G.A0Q();
            } else if (!A0G.A0i()) {
                throw new IllegalArgumentException(A0J(219, 75, 37) + A0G + A1J());
            }
        }
        view.clearAnimation();
        A1j(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1g(this, this.A0s, view, view2) && view2 != null) {
            A0r(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A06.A1e(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.A13.size();
        for (int i = 0; i < size; i++) {
            this.A13.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0 && !this.A0I) {
            super.requestLayout();
        } else {
            this.A0J = true;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        C4F c4f = this.A06;
        if (c4f == null) {
            Log.e(A0J(1370, 12, 79), A0J(834, 90, 71));
        } else if (this.A0I) {
        } else {
            boolean A25 = c4f.A25();
            boolean A26 = this.A06.A26();
            if (A25 || A26) {
                if (!A25) {
                    i = 0;
                }
                A15(i, A26 ? i2 : 0, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w(A0J(1370, 12, 79), A0J(1382, 93, 90));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A1A(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0979Sk c0979Sk) {
        this.A09 = c0979Sk;
        C2u.A0A(this, this.A09);
    }

    public void setAdapter(AnonymousClass43 anonymousClass43) {
        setLayoutFrozen(false);
        A0s(anonymousClass43, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AnonymousClass46 anonymousClass46) {
        if (anonymousClass46 == this.A0e) {
            return;
        }
        this.A0e = anonymousClass46;
        setChildrenDrawingOrderEnabled(this.A0e != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0B) {
            A0h();
        }
        this.A0B = z;
        super.setClipToPadding(z);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0E = z;
    }

    public void setItemAnimator(C4B c4b) {
        C4B c4b2 = this.A05;
        if (c4b2 != null) {
            c4b2.A0C();
            this.A05.A0A(null);
        }
        this.A05 = c4b;
        C4B c4b3 = this.A05;
        if (c4b3 != null) {
            AnonymousClass49 anonymousClass49 = this.A0f;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "lbql160khUomfa8gG92Y7q";
            strArr[0] = "AtGY6u7EZb";
            c4b3.A0A(anonymousClass49);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.A0r.A0R(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0I) {
            A1q(A0J(1021, 42, 85));
            if (!z) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent cancelEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            onTouchEvent(cancelEvent);
            this.A0I = true;
            this.A0n = true;
            A1S();
        }
    }

    public void setLayoutManager(C4F c4f) {
        if (c4f == this.A06) {
            return;
        }
        A1S();
        if (this.A06 != null) {
            C4B c4b = this.A05;
            if (c4b != null) {
                c4b.A0C();
            }
            this.A06.A1J(this.A0r);
            this.A06.A1H(this.A0r);
            this.A0r.A0Q();
            if (this.A0F) {
                this.A06.A1V(this, this.A0r);
            }
            this.A06.A1Q(null);
            this.A06 = null;
        } else {
            this.A0r.A0Q();
        }
        this.A01.A0C();
        this.A06 = c4f;
        if (c4f != null) {
            ES es = c4f.A03;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "5zwSvF43vthb6lIFeaOoDRJ244Dq07FI";
            strArr[4] = "COyIsU8he0MLuT7wFa9x9SZ5A7LzgdfA";
            if (es == null) {
                this.A06.A1Q(this);
                if (this.A0F) {
                    this.A06.A1O(this);
                }
            } else {
                throw new IllegalArgumentException(A0J(1109, 14, 88) + c4f + A0J(59, 39, 9) + c4f.A03.A1J());
            }
        }
        this.A0r.A0P();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A05(z);
    }

    public void setOnFlingListener(@Nullable C4I c4i) {
        this.A0g = c4i;
    }

    @Deprecated
    public void setOnScrollListener(C4K c4k) {
        this.A0i = c4k;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0o = z;
    }

    public void setRecycledViewPool(C4M c4m) {
        this.A0r.A0a(c4m);
    }

    public void setRecyclerListener(C4O c4o) {
        this.A07 = c4o;
    }

    public void setScrollState(int i) {
        if (i == this.A0W) {
            return;
        }
        this.A0W = i;
        if (i != 2) {
            A0W();
        }
        A0m(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(A0J(1370, 12, 79), A0J(1881, 47, 18) + i + A0J(198, 21, 121));
            } else {
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C4V c4v) {
        this.A0r.A0b(c4v);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0B(i);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.X.InterfaceC03342b
    public final void stopNestedScroll() {
        getScrollingChildHelper().A03();
    }
}