package com.p7700g.p99005;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.p7700g.p99005.fv;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.mv;
import java.util.Arrays;

/* compiled from: EmojiProcessor.java */
@e2(19)
@i2({i2.a.LIBRARY})
@o0
/* loaded from: classes.dex */
public final class iv {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    @x1
    private final fv.l d;
    @x1
    private final mv e;
    @x1
    private fv.e f;
    private final boolean g;
    @z1
    private final int[] h;

    /* compiled from: EmojiProcessor.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static final class a {
        private static final int a = -1;

        private a() {
        }

        public static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class b {
        private static final int a = 1;
        private static final int b = 2;
        private int c = 1;
        private final mv.a d;
        private mv.a e;
        private mv.a f;
        private int g;
        private int h;
        private final boolean i;
        private final int[] j;

        public b(mv.a aVar, boolean z, int[] iArr) {
            this.d = aVar;
            this.e = aVar;
            this.i = z;
            this.j = iArr;
        }

        private static boolean d(int i) {
            return i == 65039;
        }

        private static boolean f(int i) {
            return i == 65038;
        }

        private int g() {
            this.c = 1;
            this.e = this.d;
            this.h = 0;
            return 1;
        }

        private boolean h() {
            if (this.e.b().l() || d(this.g)) {
                return true;
            }
            if (this.i) {
                if (this.j == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.j, this.e.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public int a(int i) {
            mv.a a2 = this.e.a(i);
            int i2 = 3;
            if (this.c == 2) {
                if (a2 != null) {
                    this.e = a2;
                    this.h++;
                } else if (f(i)) {
                    i2 = g();
                } else if (!d(i)) {
                    if (this.e.b() != null) {
                        if (this.h == 1) {
                            if (h()) {
                                this.f = this.e;
                                g();
                            } else {
                                i2 = g();
                            }
                        } else {
                            this.f = this.e;
                            g();
                        }
                    } else {
                        i2 = g();
                    }
                }
                i2 = 2;
            } else if (a2 == null) {
                i2 = g();
            } else {
                this.c = 2;
                this.e = a2;
                this.h = 1;
                i2 = 2;
            }
            this.g = i;
            return i2;
        }

        public hv b() {
            return this.e.b();
        }

        public hv c() {
            return this.f.b();
        }

        public boolean e() {
            return this.c == 2 && this.e.b() != null && (this.h > 1 || h());
        }
    }

    public iv(@x1 mv mvVar, @x1 fv.l lVar, @x1 fv.e eVar, boolean z, @z1 int[] iArr) {
        this.d = lVar;
        this.e = mvVar;
        this.f = eVar;
        this.g = z;
        this.h = iArr;
    }

    private void a(@x1 Spannable spannable, hv hvVar, int i, int i2) {
        spannable.setSpan(this.d.a(hvVar), i, i2, 33);
    }

    private static boolean b(@x1 Editable editable, @x1 KeyEvent keyEvent, boolean z) {
        jv[] jvVarArr;
        if (i(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!h(selectionStart, selectionEnd) && (jvVarArr = (jv[]) editable.getSpans(selectionStart, selectionEnd, jv.class)) != null && jvVarArr.length > 0) {
            for (jv jvVar : jvVarArr) {
                int spanStart = editable.getSpanStart(jvVar);
                int spanEnd = editable.getSpanEnd(jvVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(@x1 InputConnection inputConnection, @x1 Editable editable, @p1(from = 0) int i, @p1(from = 0) int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (h(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i, 0));
                min = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            jv[] jvVarArr = (jv[]) editable.getSpans(max, min, jv.class);
            if (jvVarArr != null && jvVarArr.length > 0) {
                for (jv jvVar : jvVarArr) {
                    int spanStart = editable.getSpanStart(jvVar);
                    int spanEnd = editable.getSpanEnd(jvVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean f(@x1 Editable editable, int i, @x1 KeyEvent keyEvent) {
        boolean b2;
        if (i != 67) {
            b2 = i != 112 ? false : b(editable, keyEvent, true);
        } else {
            b2 = b(editable, keyEvent, false);
        }
        if (b2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean g(CharSequence charSequence, int i, int i2, hv hvVar) {
        if (hvVar.e() == 0) {
            hvVar.n(this.f.a(charSequence, i, i2, hvVar.i()));
        }
        return hvVar.e() == 2;
    }

    private static boolean h(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    private static boolean i(@x1 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public int c(@x1 CharSequence charSequence) {
        return d(charSequence, this.e.h());
    }

    public int d(@x1 CharSequence charSequence, int i) {
        b bVar = new b(this.e.i(), this.g, this.h);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            int a2 = bVar.a(codePointAt);
            hv b2 = bVar.b();
            if (a2 == 1) {
                i2 += Character.charCount(codePointAt);
                i4 = 0;
            } else if (a2 == 2) {
                i2 += Character.charCount(codePointAt);
            } else if (a2 == 3) {
                b2 = bVar.c();
                if (b2.d() <= i) {
                    i3++;
                }
            }
            if (b2 != null && b2.d() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!bVar.e() || bVar.b().d() > i) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
        ((com.p7700g.p99005.nv) r10).d();
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:84:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:84:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #0 {all -> 0x012c, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x009b, B:48:0x00ab, B:51:0x00b7, B:52:0x00c1, B:53:0x00cb, B:55:0x00d2, B:56:0x00d7, B:58:0x00e2, B:60:0x00e9, B:64:0x00f3, B:67:0x00ff, B:68:0x0105, B:70:0x010e, B:15:0x002b), top: B:84:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence j(@x1 CharSequence charSequence, @p1(from = 0) int i, @p1(from = 0) int i2, @p1(from = 0) int i3, boolean z) {
        b bVar;
        pv pvVar;
        int codePointAt;
        int i4;
        int a2;
        jv[] jvVarArr;
        boolean z2 = charSequence instanceof nv;
        if (z2) {
            ((nv) charSequence).a();
        }
        pv pvVar2 = null;
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, jv.class) <= i2) {
                        pvVar2 = new pv(charSequence);
                    }
                    if (pvVar2 != null && (jvVarArr = (jv[]) pvVar2.getSpans(i, i2, jv.class)) != null && jvVarArr.length > 0) {
                        for (jv jvVar : jvVarArr) {
                            int spanStart = pvVar2.getSpanStart(jvVar);
                            int spanEnd = pvVar2.getSpanEnd(jvVar);
                            if (spanStart != i2) {
                                pvVar2.removeSpan(jvVar);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    if (i != i2 && i < charSequence.length()) {
                        if (i3 != Integer.MAX_VALUE && pvVar2 != null) {
                            i3 -= ((jv[]) pvVar2.getSpans(0, pvVar2.length(), jv.class)).length;
                        }
                        bVar = new b(this.e.i(), this.g, this.h);
                        pvVar = pvVar2;
                        codePointAt = Character.codePointAt(charSequence, i);
                        int i5 = 0;
                        loop1: while (true) {
                            i4 = i;
                            while (i < i2 && i5 < i3) {
                                a2 = bVar.a(codePointAt);
                                if (a2 != 1) {
                                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                                    if (i4 < i2) {
                                        codePointAt = Character.codePointAt(charSequence, i4);
                                    }
                                    i = i4;
                                } else if (a2 == 2) {
                                    i += Character.charCount(codePointAt);
                                    if (i < i2) {
                                        codePointAt = Character.codePointAt(charSequence, i);
                                    }
                                } else if (a2 == 3) {
                                    if (z || !g(charSequence, i4, i, bVar.c())) {
                                        if (pvVar == null) {
                                            pvVar = new pv((Spannable) new SpannableString(charSequence));
                                        }
                                        a(pvVar, bVar.c(), i4, i);
                                        i5++;
                                    }
                                }
                            }
                        }
                        if (bVar.e() && i5 < i3 && (z || !g(charSequence, i4, i, bVar.b()))) {
                            if (pvVar == null) {
                                pvVar = new pv(charSequence);
                            }
                            a(pvVar, bVar.b(), i4, i);
                        }
                        if (pvVar == null) {
                            return pvVar.b();
                        }
                        if (z2) {
                            ((nv) charSequence).d();
                        }
                        return charSequence;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((nv) charSequence).d();
                }
            }
        }
        pvVar2 = new pv((Spannable) charSequence);
        if (pvVar2 != null) {
            while (r5 < r4) {
            }
        }
        if (i != i2) {
            if (i3 != Integer.MAX_VALUE) {
                i3 -= ((jv[]) pvVar2.getSpans(0, pvVar2.length(), jv.class)).length;
            }
            bVar = new b(this.e.i(), this.g, this.h);
            pvVar = pvVar2;
            codePointAt = Character.codePointAt(charSequence, i);
            int i52 = 0;
            loop1: while (true) {
                i4 = i;
                while (i < i2) {
                    a2 = bVar.a(codePointAt);
                    if (a2 != 1) {
                    }
                }
            }
            if (bVar.e()) {
                if (pvVar == null) {
                }
                a(pvVar, bVar.b(), i4, i);
            }
            if (pvVar == null) {
            }
        }
        return charSequence;
    }
}