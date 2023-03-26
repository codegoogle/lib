package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nf;
import com.p7700g.p99005.os;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class ls {
    public static final int A = 2048;
    public static final int B = 4096;
    public static final int C = 8192;
    public static final int D = 16384;
    public static final int E = 32768;
    public static final int F = 65536;
    public static final int G = 131072;
    public static final int H = 262144;
    public static final int I = 524288;
    public static final int J = 1048576;
    public static final int K = 2097152;
    public static final String L = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String M = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String N = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String O = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String P = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String Q = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String R = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String S = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String T = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String U = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String V = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    @SuppressLint({"ActionValue"})
    public static final String W = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 1;
    private static final String a = "AccessibilityNodeInfo.roleDescription";
    public static final int a0 = 2;
    private static final String b = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    public static final int b0 = 4;
    private static final String c = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    public static final int c0 = 8;
    private static final String d = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final int d0 = 16;
    private static final String e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static int e0 = 0;
    private static final String f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    private static final String g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    private static final String h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    private static final String i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    private static final String j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    private static final String k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 4;
    private static final int o = 8;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 4;
    public static final int s = 8;
    public static final int t = 16;
    public static final int u = 32;
    public static final int v = 64;
    public static final int w = 128;
    public static final int x = 256;
    public static final int y = 512;
    public static final int z = 1024;
    private final AccessibilityNodeInfo f0;
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int g0 = -1;
    private int h0 = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        @x1
        public static final a D;
        @x1
        public static final a E;
        @x1
        public static final a F;
        @x1
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        @x1
        public static final a M;
        @x1
        public static final a N;
        private static final String a = "A11yActionCompat";
        public static final a b = new a(1, null);
        public static final a c = new a(2, null);
        public static final a d = new a(4, null);
        public static final a e = new a(8, null);
        public static final a f = new a(16, null);
        public static final a g = new a(32, null);
        public static final a h = new a(64, null);
        public static final a i = new a(128, null);
        public static final a j = new a(256, (CharSequence) null, os.b.class);
        public static final a k = new a(512, (CharSequence) null, os.b.class);
        public static final a l = new a(1024, (CharSequence) null, os.c.class);
        public static final a m = new a(2048, (CharSequence) null, os.c.class);
        public static final a n = new a(4096, null);
        public static final a o = new a(8192, null);
        public static final a p = new a(16384, null);
        public static final a q = new a(32768, null);
        public static final a r = new a(65536, null);
        public static final a s = new a(131072, (CharSequence) null, os.g.class);
        public static final a t = new a(262144, null);
        public static final a u = new a(524288, null);
        public static final a v = new a(1048576, null);
        public static final a w = new a(2097152, (CharSequence) null, os.h.class);
        public static final a x;
        public static final a y;
        public static final a z;
        public final Object O;
        private final int P;
        private final Class<? extends os.a> Q;
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public final os R;

        static {
            int i2 = Build.VERSION.SDK_INT;
            x = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            y = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, os.e.class);
            z = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            A = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            B = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            C = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            D = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            E = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            F = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            G = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            H = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            I = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, os.f.class);
            J = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, os.d.class);
            K = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            L = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            M = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            N = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, os osVar) {
            return new a(null, this.P, charSequence, osVar, this.Q);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.O).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.O).getLabel();
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            if (this.R != null) {
                os.a aVar = null;
                Class<? extends os.a> cls = this.Q;
                if (cls != null) {
                    try {
                        os.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            newInstance.a(bundle);
                            aVar = newInstance;
                        } catch (Exception unused) {
                            aVar = newInstance;
                            Class<? extends os.a> cls2 = this.Q;
                            if (cls2 != null) {
                                cls2.getName();
                            }
                            return this.R.a(view, aVar);
                        }
                    } catch (Exception unused2) {
                    }
                }
                return this.R.a(view, aVar);
            }
            return false;
        }

        public boolean equals(@z1 Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.O;
                return obj2 == null ? aVar.O == null : obj2.equals(aVar.O);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.O;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public a(int i2, CharSequence charSequence, os osVar) {
            this(null, i2, charSequence, osVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends os.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, os osVar, Class<? extends os.a> cls) {
            this.P = i2;
            this.R = osVar;
            if (obj == null) {
                this.O = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.O = obj;
            }
            this.Q = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public final Object d;

        public b(Object obj) {
            this.d = obj;
        }

        public static b e(int i, int i2, boolean z) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        public static b f(int i, int i2, boolean z, int i3) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.d).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.d).getRowCount();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.d).getSelectionMode();
        }

        public boolean d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.d).isHierarchical();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public static c g(int i, int i2, int i3, int i4, boolean z) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        public static c h(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowSpan();
        }

        @Deprecated
        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isHeading();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isSelected();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public final Object d;

        public d(Object obj) {
            this.d = obj;
        }

        public static d e(int i, float f, float f2, float f3) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.d).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.d).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.d).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.d).getType();
        }
    }

    @Deprecated
    public ls(Object obj) {
        this.f0 = (AccessibilityNodeInfo) obj;
    }

    public static ls C0() {
        return X1(AccessibilityNodeInfo.obtain());
    }

    public static ls D0(View view) {
        return X1(AccessibilityNodeInfo.obtain(view));
    }

    public static ls E0(View view, int i2) {
        return Y1(AccessibilityNodeInfo.obtain(view, i2));
    }

    public static ls F0(ls lsVar) {
        return X1(AccessibilityNodeInfo.obtain(lsVar.f0));
    }

    private SparseArray<WeakReference<ClickableSpan>> M(View view) {
        SparseArray<WeakReference<ClickableSpan>> S2 = S(view);
        if (S2 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(nf.e.e0, sparseArray);
            return sparseArray;
        }
        return S2;
    }

    private void N0(View view) {
        SparseArray<WeakReference<ClickableSpan>> S2 = S(view);
        if (S2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < S2.size(); i2++) {
                if (S2.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                S2.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void Q0(int i2, boolean z2) {
        Bundle D2 = D();
        if (D2 != null) {
            int i3 = D2.getInt(e, 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            D2.putInt(e, i2 | i3);
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> S(View view) {
        return (SparseArray) view.getTag(nf.e.e0);
    }

    public static ls X1(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new ls(accessibilityNodeInfo);
    }

    public static ls Y1(Object obj) {
        if (obj != null) {
            return new ls(obj);
        }
        return null;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        i(g).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(h).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(i).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(f).add(Integer.valueOf(i2));
    }

    private boolean e0() {
        return !i(g).isEmpty();
    }

    private int f0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = e0;
        e0 = i3 + 1;
        return i3;
    }

    private void h() {
        this.f0.getExtras().remove(g);
        this.f0.getExtras().remove(h);
        this.f0.getExtras().remove(i);
        this.f0.getExtras().remove(f);
    }

    private List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.f0.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f0.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private static String o(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                switch (i2) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i2) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i2) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean r(int i2) {
        Bundle D2 = D();
        return D2 != null && (D2.getInt(e, 0) & i2) == i2;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] x(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        return this.f0.getContentDescription();
    }

    public boolean A0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f0.isTextEntryKey();
        }
        return r(8);
    }

    public void A1(View view, int i2) {
        this.g0 = i2;
        this.f0.setParent(view, i2);
    }

    public int B() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f0.getDrawingOrder();
        }
        return 0;
    }

    public boolean B0() {
        return this.f0.isVisibleToUser();
    }

    public void B1(boolean z2) {
        this.f0.setPassword(z2);
    }

    public CharSequence C() {
        return this.f0.getError();
    }

    public void C1(d dVar) {
        this.f0.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.d);
    }

    public Bundle D() {
        return this.f0.getExtras();
    }

    public void D1(@z1 CharSequence charSequence) {
        this.f0.getExtras().putCharSequence(a, charSequence);
    }

    @z1
    public CharSequence E() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f0.getHintText();
        }
        return this.f0.getExtras().getCharSequence(d);
    }

    public void E1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f0.setScreenReaderFocusable(z2);
        } else {
            Q0(1, z2);
        }
    }

    @Deprecated
    public Object F() {
        return this.f0;
    }

    public void F1(boolean z2) {
        this.f0.setScrollable(z2);
    }

    public int G() {
        return this.f0.getInputType();
    }

    public boolean G0(int i2) {
        return this.f0.performAction(i2);
    }

    public void G1(boolean z2) {
        this.f0.setSelected(z2);
    }

    public ls H() {
        return Y1(this.f0.getLabelFor());
    }

    public boolean H0(int i2, Bundle bundle) {
        return this.f0.performAction(i2, bundle);
    }

    public void H1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f0.setShowingHintText(z2);
        } else {
            Q0(4, z2);
        }
    }

    public ls I() {
        return Y1(this.f0.getLabeledBy());
    }

    public void I0() {
        this.f0.recycle();
    }

    public void I1(View view) {
        this.h0 = -1;
        this.f0.setSource(view);
    }

    public int J() {
        return this.f0.getLiveRegion();
    }

    public boolean J0() {
        return this.f0.refresh();
    }

    public void J1(View view, int i2) {
        this.h0 = i2;
        this.f0.setSource(view, i2);
    }

    public int K() {
        return this.f0.getMaxTextLength();
    }

    public boolean K0(a aVar) {
        return this.f0.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.O);
    }

    public void K1(@z1 CharSequence charSequence) {
        if (jm.h()) {
            this.f0.setStateDescription(charSequence);
        } else {
            this.f0.getExtras().putCharSequence(k, charSequence);
        }
    }

    public int L() {
        return this.f0.getMovementGranularities();
    }

    public boolean L0(View view) {
        return this.f0.removeChild(view);
    }

    public void L1(CharSequence charSequence) {
        this.f0.setText(charSequence);
    }

    public boolean M0(View view, int i2) {
        return this.f0.removeChild(view, i2);
    }

    public void M1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f0.setTextEntryKey(z2);
        } else {
            Q0(8, z2);
        }
    }

    public CharSequence N() {
        return this.f0.getPackageName();
    }

    public void N1(int i2, int i3) {
        this.f0.setTextSelection(i2, i3);
    }

    @z1
    public CharSequence O() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f0.getPaneTitle();
        }
        return this.f0.getExtras().getCharSequence(b);
    }

    public void O0(boolean z2) {
        this.f0.setAccessibilityFocused(z2);
    }

    public void O1(@z1 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f0.setTooltipText(charSequence);
        } else {
            this.f0.getExtras().putCharSequence(c, charSequence);
        }
    }

    public ls P() {
        return Y1(this.f0.getParent());
    }

    public void P0(@x1 List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f0.setAvailableExtraData(list);
        }
    }

    public void P1(@x1 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f0.setTouchDelegateInfo(eVar.a);
        }
    }

    public d Q() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f0.getRangeInfo();
        if (rangeInfo != null) {
            return new d(rangeInfo);
        }
        return null;
    }

    public void Q1(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f0.setTraversalAfter(view);
        }
    }

    @z1
    public CharSequence R() {
        return this.f0.getExtras().getCharSequence(a);
    }

    @Deprecated
    public void R0(Rect rect) {
        this.f0.setBoundsInParent(rect);
    }

    public void R1(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f0.setTraversalAfter(view, i2);
        }
    }

    public void S0(Rect rect) {
        this.f0.setBoundsInScreen(rect);
    }

    public void S1(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f0.setTraversalBefore(view);
        }
    }

    @z1
    public CharSequence T() {
        if (jm.h()) {
            return this.f0.getStateDescription();
        }
        return this.f0.getExtras().getCharSequence(k);
    }

    public void T0(boolean z2) {
        this.f0.setCanOpenPopup(z2);
    }

    public void T1(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f0.setTraversalBefore(view, i2);
        }
    }

    public CharSequence U() {
        if (e0()) {
            List<Integer> i2 = i(g);
            List<Integer> i3 = i(h);
            List<Integer> i4 = i(i);
            List<Integer> i5 = i(f);
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f0.getText(), 0, this.f0.getText().length()));
            for (int i6 = 0; i6 < i2.size(); i6++) {
                spannableString.setSpan(new is(i5.get(i6).intValue(), this, D().getInt(j)), i2.get(i6).intValue(), i3.get(i6).intValue(), i4.get(i6).intValue());
            }
            return spannableString;
        }
        return this.f0.getText();
    }

    public void U0(boolean z2) {
        this.f0.setCheckable(z2);
    }

    public void U1(String str) {
        this.f0.setViewIdResourceName(str);
    }

    public int V() {
        return this.f0.getTextSelectionEnd();
    }

    public void V0(boolean z2) {
        this.f0.setChecked(z2);
    }

    public void V1(boolean z2) {
        this.f0.setVisibleToUser(z2);
    }

    public int W() {
        return this.f0.getTextSelectionStart();
    }

    public void W0(CharSequence charSequence) {
        this.f0.setClassName(charSequence);
    }

    public AccessibilityNodeInfo W1() {
        return this.f0;
    }

    @z1
    public CharSequence X() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f0.getTooltipText();
        }
        return this.f0.getExtras().getCharSequence(c);
    }

    public void X0(boolean z2) {
        this.f0.setClickable(z2);
    }

    @z1
    public e Y() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f0.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new e(touchDelegateInfo);
    }

    public void Y0(Object obj) {
        this.f0.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).d);
    }

    public ls Z() {
        if (Build.VERSION.SDK_INT >= 22) {
            return Y1(this.f0.getTraversalAfter());
        }
        return null;
    }

    public void Z0(Object obj) {
        this.f0.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a);
    }

    public void a(int i2) {
        this.f0.addAction(i2);
    }

    public ls a0() {
        if (Build.VERSION.SDK_INT >= 22) {
            return Y1(this.f0.getTraversalBefore());
        }
        return null;
    }

    public void a1(CharSequence charSequence) {
        this.f0.setContentDescription(charSequence);
    }

    public void b(a aVar) {
        this.f0.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.O);
    }

    public String b0() {
        return this.f0.getViewIdResourceName();
    }

    public void b1(boolean z2) {
        this.f0.setContentInvalid(z2);
    }

    public void c(View view) {
        this.f0.addChild(view);
    }

    public ps c0() {
        return ps.r(this.f0.getWindow());
    }

    public void c1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f0.setContextClickable(z2);
        }
    }

    public void d(View view, int i2) {
        this.f0.addChild(view, i2);
    }

    public int d0() {
        return this.f0.getWindowId();
    }

    public void d1(boolean z2) {
        this.f0.setDismissable(z2);
    }

    public void e1(int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f0.setDrawingOrder(i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ls)) {
            ls lsVar = (ls) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f0;
            if (accessibilityNodeInfo == null) {
                if (lsVar.f0 != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(lsVar.f0)) {
                return false;
            }
            return this.h0 == lsVar.h0 && this.g0 == lsVar.g0;
        }
        return false;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            N0(view);
            ClickableSpan[] x2 = x(charSequence);
            if (x2 == null || x2.length <= 0) {
                return;
            }
            D().putInt(j, nf.e.a);
            SparseArray<WeakReference<ClickableSpan>> M2 = M(view);
            for (int i2 = 0; i2 < x2.length; i2++) {
                int f0 = f0(x2[i2], M2);
                M2.put(f0, new WeakReference<>(x2[i2]));
                e(x2[i2], (Spanned) charSequence, f0);
            }
        }
    }

    public void f1(boolean z2) {
        this.f0.setEditable(z2);
    }

    public boolean g() {
        return this.f0.canOpenPopup();
    }

    public boolean g0() {
        return this.f0.isAccessibilityFocused();
    }

    public void g1(boolean z2) {
        this.f0.setEnabled(z2);
    }

    public boolean h0() {
        return this.f0.isCheckable();
    }

    public void h1(CharSequence charSequence) {
        this.f0.setError(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f0;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean i0() {
        return this.f0.isChecked();
    }

    public void i1(boolean z2) {
        this.f0.setFocusable(z2);
    }

    public List<ls> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f0.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(X1(findAccessibilityNodeInfosByText.get(i2)));
        }
        return arrayList;
    }

    public boolean j0() {
        return this.f0.isClickable();
    }

    public void j1(boolean z2) {
        this.f0.setFocused(z2);
    }

    public List<ls> k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f0.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo accessibilityNodeInfo : findAccessibilityNodeInfosByViewId) {
            arrayList.add(X1(accessibilityNodeInfo));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f0.isContentInvalid();
    }

    public void k1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f0.setHeading(z2);
        } else {
            Q0(2, z2);
        }
    }

    public ls l(int i2) {
        return Y1(this.f0.findFocus(i2));
    }

    public boolean l0() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f0.isContextClickable();
        }
        return false;
    }

    public void l1(@z1 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f0.setHintText(charSequence);
        } else {
            this.f0.getExtras().putCharSequence(d, charSequence);
        }
    }

    public ls m(int i2) {
        return Y1(this.f0.focusSearch(i2));
    }

    public boolean m0() {
        return this.f0.isDismissable();
    }

    public void m1(boolean z2) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f0.setImportantForAccessibility(z2);
        }
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f0.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new a(actionList.get(i2)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public boolean n0() {
        return this.f0.isEditable();
    }

    public void n1(int i2) {
        this.f0.setInputType(i2);
    }

    public boolean o0() {
        return this.f0.isEnabled();
    }

    public void o1(View view) {
        this.f0.setLabelFor(view);
    }

    public int p() {
        return this.f0.getActions();
    }

    public boolean p0() {
        return this.f0.isFocusable();
    }

    public void p1(View view, int i2) {
        this.f0.setLabelFor(view, i2);
    }

    @x1
    public List<String> q() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f0.getAvailableExtraData();
        }
        return Collections.emptyList();
    }

    public boolean q0() {
        return this.f0.isFocused();
    }

    public void q1(View view) {
        this.f0.setLabeledBy(view);
    }

    public boolean r0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f0.isHeading();
        }
        if (r(2)) {
            return true;
        }
        c z2 = z();
        return z2 != null && z2.e();
    }

    public void r1(View view, int i2) {
        this.f0.setLabeledBy(view, i2);
    }

    @Deprecated
    public void s(Rect rect) {
        this.f0.getBoundsInParent(rect);
    }

    public boolean s0() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f0.isImportantForAccessibility();
        }
        return true;
    }

    public void s1(int i2) {
        this.f0.setLiveRegion(i2);
    }

    public void t(Rect rect) {
        this.f0.getBoundsInScreen(rect);
    }

    public boolean t0() {
        return this.f0.isLongClickable();
    }

    public void t1(boolean z2) {
        this.f0.setLongClickable(z2);
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb.append("; boundsInParent: " + rect);
        t(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(N());
        sb.append("; className: ");
        sb.append(w());
        sb.append("; text: ");
        sb.append(U());
        sb.append("; contentDescription: ");
        sb.append(A());
        sb.append("; viewId: ");
        sb.append(b0());
        sb.append("; checkable: ");
        sb.append(h0());
        sb.append("; checked: ");
        sb.append(i0());
        sb.append("; focusable: ");
        sb.append(p0());
        sb.append("; focused: ");
        sb.append(q0());
        sb.append("; selected: ");
        sb.append(y0());
        sb.append("; clickable: ");
        sb.append(j0());
        sb.append("; longClickable: ");
        sb.append(t0());
        sb.append("; enabled: ");
        sb.append(o0());
        sb.append("; password: ");
        sb.append(v0());
        sb.append("; scrollable: " + x0());
        sb.append("; [");
        List<a> n2 = n();
        for (int i2 = 0; i2 < n2.size(); i2++) {
            a aVar = n2.get(i2);
            String o2 = o(aVar.b());
            if (o2.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                o2 = aVar.c().toString();
            }
            sb.append(o2);
            if (i2 != n2.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public ls u(int i2) {
        return Y1(this.f0.getChild(i2));
    }

    public boolean u0() {
        return this.f0.isMultiLine();
    }

    public void u1(int i2) {
        this.f0.setMaxTextLength(i2);
    }

    public int v() {
        return this.f0.getChildCount();
    }

    public boolean v0() {
        return this.f0.isPassword();
    }

    public void v1(int i2) {
        this.f0.setMovementGranularities(i2);
    }

    public CharSequence w() {
        return this.f0.getClassName();
    }

    public boolean w0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f0.isScreenReaderFocusable();
        }
        return r(1);
    }

    public void w1(boolean z2) {
        this.f0.setMultiLine(z2);
    }

    public boolean x0() {
        return this.f0.isScrollable();
    }

    public void x1(CharSequence charSequence) {
        this.f0.setPackageName(charSequence);
    }

    public b y() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f0.getCollectionInfo();
        if (collectionInfo != null) {
            return new b(collectionInfo);
        }
        return null;
    }

    public boolean y0() {
        return this.f0.isSelected();
    }

    public void y1(@z1 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f0.setPaneTitle(charSequence);
        } else {
            this.f0.getExtras().putCharSequence(b, charSequence);
        }
    }

    public c z() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f0.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new c(collectionItemInfo);
        }
        return null;
    }

    public boolean z0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f0.isShowingHintText();
        }
        return r(4);
    }

    public void z1(View view) {
        this.g0 = -1;
        this.f0.setParent(view);
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final AccessibilityNodeInfo.TouchDelegateInfo a;

        public e(@x1 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = new AccessibilityNodeInfo.TouchDelegateInfo(map);
            } else {
                this.a = null;
            }
        }

        @z1
        public Region a(@p1(from = 0) int i) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.a.getRegionAt(i);
            }
            return null;
        }

        @p1(from = 0)
        public int b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.a.getRegionCount();
            }
            return 0;
        }

        @z1
        public ls c(@x1 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.a.getTargetForRegion(region)) == null) {
                return null;
            }
            return ls.X1(targetForRegion);
        }

        public e(@x1 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.a = touchDelegateInfo;
        }
    }

    private ls(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f0 = accessibilityNodeInfo;
    }
}