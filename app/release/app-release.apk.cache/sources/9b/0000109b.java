package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class EV extends AbstractC0980Sl {
    public static TimeInterpolator A0B;
    public static String[] A0C;
    public ArrayList<C4X> A0A = new ArrayList<>();
    public ArrayList<C4X> A07 = new ArrayList<>();
    public ArrayList<C03703n> A09 = new ArrayList<>();
    public ArrayList<C03693m> A08 = new ArrayList<>();
    public ArrayList<ArrayList<C4X>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C03703n>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C03693m>> A03 = new ArrayList<>();
    public ArrayList<C4X> A00 = new ArrayList<>();
    public ArrayList<C4X> A04 = new ArrayList<>();
    public ArrayList<C4X> A06 = new ArrayList<>();
    public ArrayList<C4X> A02 = new ArrayList<>();

    static {
        A01();
    }

    public static void A01() {
        A0C = new String[]{"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    }

    private void A02(C03693m c03693m) {
        if (c03693m.A05 != null) {
            A07(c03693m, c03693m.A05);
        }
        if (c03693m.A04 != null) {
            A07(c03693m, c03693m.A04);
        }
    }

    private void A03(final C4X c4x) {
        final View view = c4x.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(c4x);
        animate.setDuration(A06()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3h
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                EV.this.A0Q(c4x);
                EV.this.A06.remove(c4x);
                EV.this.A0Y();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                EV.this.A0R(c4x);
            }
        }).start();
    }

    private void A04(C4X c4x) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        c4x.A0H.animate().setInterpolator(A0B);
        A0E(c4x);
    }

    private final void A05(List<C4X> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<C03693m> list, C4X c4x) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C03693m c03693m = list.get(size);
            if (A07(c03693m, c4x) && c03693m.A05 == null && c03693m.A04 == null) {
                list.remove(c03693m);
            }
        }
    }

    private boolean A07(C03693m c03693m, C4X c4x) {
        boolean z = false;
        if (c03693m.A04 == c4x) {
            c03693m.A04 = null;
        } else if (c03693m.A05 == c4x) {
            c03693m.A05 = null;
            z = true;
        } else {
            return false;
        }
        c4x.A0H.setAlpha(1.0f);
        c4x.A0H.setTranslationX(0.0f);
        c4x.A0H.setTranslationY(0.0f);
        A0S(c4x, z);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void A0C() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C03703n c03703n = this.A09.get(size);
            View view = c03703n.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c03703n.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0Q(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            C4X c4x = this.A07.get(size3);
            c4x.A0H.setAlpha(1.0f);
            A0M(c4x);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A02(this.A08.get(size4));
        }
        this.A08.clear();
        if (!A0F()) {
            return;
        }
        int listCount = this.A05.size();
        for (int i = listCount - 1; i >= 0; i--) {
            ArrayList<C03703n> arrayList = this.A05.get(i);
            int listCount2 = arrayList.size();
            for (int i2 = listCount2 - 1; i2 >= 0; i2--) {
                C03703n moveInfo = arrayList.get(i2);
                View view2 = moveInfo.A04.A0H;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                A0O(moveInfo.A04);
                arrayList.remove(i2);
                if (arrayList.isEmpty()) {
                    this.A05.remove(arrayList);
                }
            }
        }
        for (int size5 = this.A01.size() - 1; size5 >= 0; size5--) {
            ArrayList<C4X> arrayList2 = this.A01.get(size5);
            int i3 = arrayList2.size();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                C4X item = arrayList2.get(i4);
                item.A0H.setAlpha(1.0f);
                A0M(item);
                arrayList2.remove(i4);
                if (arrayList2.isEmpty()) {
                    this.A01.remove(arrayList2);
                }
            }
        }
        for (int size6 = this.A03.size() - 1; size6 >= 0; size6--) {
            ArrayList<C03693m> arrayList3 = this.A03.get(size6);
            int j = arrayList3.size();
            for (int i5 = j - 1; i5 >= 0; i5--) {
                A02(arrayList3.get(i5));
                if (arrayList3.isEmpty()) {
                    this.A03.remove(arrayList3);
                }
            }
        }
        A05(this.A06);
        A05(this.A04);
        A05(this.A00);
        A05(this.A02);
        A09();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.X.C4B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0D() {
        boolean additionsPending = !this.A0A.isEmpty();
        boolean z = !this.A09.isEmpty();
        boolean movesPending = this.A08.isEmpty();
        boolean z2 = !movesPending;
        boolean changesPending = this.A07.isEmpty();
        boolean z3 = !changesPending;
        if (!additionsPending && !z && !z3 && !z2) {
            return;
        }
        Iterator<C4X> it = this.A0A.iterator();
        while (changesPending) {
            C4X holder = it.next();
            A03(holder);
        }
        this.A0A.clear();
        if (z) {
            final ArrayList<C03703n> arrayList = new ArrayList<>();
            arrayList.addAll(this.A09);
            this.A05.add(arrayList);
            this.A09.clear();
            Runnable runnable = new Runnable() { // from class: com.facebook.ads.redexgen.X.3e
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C03703n moveInfo = (C03703n) it2.next();
                        EV.this.A0b(moveInfo.A04, moveInfo.A00, moveInfo.A01, moveInfo.A02, moveInfo.A03);
                    }
                    arrayList.clear();
                    EV.this.A05.remove(arrayList);
                }
            };
            if (additionsPending) {
                C2u.A0D(arrayList.get(0).A04.A0H, runnable, A06());
            } else {
                runnable.run();
            }
        }
        if (z2) {
            final ArrayList<C03693m> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.A08);
            this.A03.add(arrayList2);
            this.A08.clear();
            Runnable runnable2 = new Runnable() { // from class: com.facebook.ads.redexgen.X.3f
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        EV.this.A0Z((C03693m) it2.next());
                    }
                    arrayList2.clear();
                    EV.this.A03.remove(arrayList2);
                }
            };
            if (additionsPending) {
                C4X holder2 = arrayList2.get(0).A05;
                C2u.A0D(holder2.A0H, runnable2, A06());
            } else {
                runnable2.run();
            }
        }
        if (z3) {
            final ArrayList<C4X> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.A07);
            this.A01.add(arrayList3);
            this.A07.clear();
            Runnable runnable3 = new Runnable() { // from class: com.facebook.ads.redexgen.X.3g
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        EV.this.A0a((C4X) it2.next());
                    }
                    arrayList3.clear();
                    EV.this.A01.remove(arrayList3);
                }
            };
            if (!additionsPending && !z && !z2) {
                runnable3.run();
                return;
            }
            if (A0C[0].charAt(3) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "oGS3g0YSOogxL8fDiPQ9wWzcLRV8E0qu";
            strArr[3] = "UwBhVdK7HoWqzQqehBBKiWd5H5AJwN9O";
            long A06 = additionsPending ? A06() : 0L;
            long changeDuration = z ? A05() : 0L;
            long A04 = z2 ? A04() : 0L;
            View view = arrayList3.get(0).A0H;
            C2u.A0D(view, runnable3, Math.max(changeDuration, A04) + A06);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void A0E(C4X c4x) {
        View view = c4x.A0H;
        view.animate().cancel();
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C03703n moveInfo = this.A09.get(size);
            if (moveInfo.A04 == c4x) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(c4x);
                this.A09.remove(size);
            }
        }
        A06(this.A08, c4x);
        if (this.A0A.remove(c4x)) {
            view.setAlpha(1.0f);
            A0Q(c4x);
        }
        if (this.A07.remove(c4x)) {
            view.setAlpha(1.0f);
            A0M(c4x);
        }
        for (int size2 = this.A03.size() - 1; size2 >= 0; size2--) {
            ArrayList<C03693m> arrayList = this.A03.get(size2);
            A06(arrayList, c4x);
            if (arrayList.isEmpty()) {
                this.A03.remove(size2);
            }
        }
        for (int size3 = this.A05.size() - 1; size3 >= 0; size3--) {
            ArrayList<C03703n> arrayList2 = this.A05.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).A04 == c4x) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int charAt = str.charAt(9);
                    int j = str2.charAt(9);
                    if (charAt != j) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0C;
                    strArr2[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    strArr2[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    A0O(c4x);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        int size5 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0C;
        strArr3[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        strArr3[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i = size5 - 1; i >= 0; i--) {
            ArrayList<C4X> arrayList3 = this.A01.get(i);
            if (arrayList3.remove(c4x)) {
                view.setAlpha(1.0f);
                A0M(c4x);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i);
                }
            }
        }
        this.A06.remove(c4x);
        this.A00.remove(c4x);
        this.A02.remove(c4x);
        this.A04.remove(c4x);
        A0Y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r4.A02.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r4.A05.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r4.A01.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        r3 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (com.facebook.ads.redexgen.X.EV.A0C[7].charAt(30) == 'w') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r2 = com.facebook.ads.redexgen.X.EV.A0C;
        r2[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
        r2[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
        if (r3.isEmpty() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
        return false;
     */
    @Override // com.facebook.ads.redexgen.X.C4B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0F() {
        if (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty()) {
            boolean isEmpty = this.A04.isEmpty();
            String[] strArr = A0C;
            if (strArr[2].charAt(18) != strArr[5].charAt(18)) {
                String[] strArr2 = A0C;
                strArr2[4] = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw";
                strArr2[3] = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5";
                if (isEmpty && this.A06.isEmpty()) {
                    boolean isEmpty2 = this.A00.isEmpty();
                    String[] strArr3 = A0C;
                    if (strArr3[2].charAt(18) != strArr3[5].charAt(18)) {
                        String[] strArr4 = A0C;
                        strArr4[7] = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk";
                        strArr4[7] = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk";
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final boolean A0G(@NonNull C4X c4x, @NonNull List<Object> list) {
        return !list.isEmpty() || super.A0G(c4x, list);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Sl
    public final boolean A0U(C4X c4x) {
        A04(c4x);
        c4x.A0H.setAlpha(0.0f);
        this.A07.add(c4x);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Sl
    public final boolean A0V(C4X c4x) {
        A04(c4x);
        this.A0A.add(c4x);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Sl
    public final boolean A0W(C4X c4x, int i, int i2, int i3, int i4) {
        View view = c4x.A0H;
        int deltaY = i + ((int) c4x.A0H.getTranslationX());
        int fromX = (int) c4x.A0H.getTranslationY();
        int i5 = i2 + fromX;
        A04(c4x);
        int fromY = i3 - deltaY;
        int i6 = i4 - i5;
        if (fromY == 0 && i6 == 0) {
            A0O(c4x);
            return false;
        }
        if (fromY != 0) {
            int deltaX = -fromY;
            view.setTranslationX(deltaX);
        }
        if (i6 != 0) {
            int deltaX2 = -i6;
            view.setTranslationY(deltaX2);
        }
        this.A09.add(new C03703n(c4x, deltaY, i5, i3, i4));
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Sl
    public final boolean A0X(C4X c4x, C4X c4x2, int deltaX, int deltaY, int i, int i2) {
        if (c4x == c4x2) {
            return A0W(c4x, deltaX, deltaY, i, i2);
        }
        float translationX = c4x.A0H.getTranslationX();
        float translationY = c4x.A0H.getTranslationY();
        float alpha = c4x.A0H.getAlpha();
        A04(c4x);
        int i3 = (int) ((i - deltaX) - translationX);
        int i4 = (int) ((i2 - deltaY) - translationY);
        c4x.A0H.setTranslationX(translationX);
        c4x.A0H.setTranslationY(translationY);
        c4x.A0H.setAlpha(alpha);
        if (c4x2 != null) {
            A04(c4x2);
            c4x2.A0H.setTranslationX(-i3);
            c4x2.A0H.setTranslationY(-i4);
            c4x2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C03693m(c4x, c4x2, deltaX, deltaY, i, i2));
        return true;
    }

    public final void A0Y() {
        if (!A0F()) {
            A09();
        }
    }

    public final void A0Z(final C03693m c03693m) {
        final View view;
        C4X c4x = c03693m.A05;
        if (c4x == null) {
            view = null;
        } else {
            view = c4x.A0H;
        }
        C4X c4x2 = c03693m.A04;
        final View view2 = c4x2 != null ? c4x2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(A04());
            this.A02.add(c03693m.A05);
            duration.translationX(c03693m.A02 - c03693m.A00);
            duration.translationY(c03693m.A03 - c03693m.A01);
            ViewPropertyAnimator oldViewAnim = duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3k
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    EV.this.A0S(c03693m.A05, true);
                    EV.this.A02.remove(c03693m.A05);
                    EV.this.A0Y();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    EV.this.A0T(c03693m.A05, true);
                }
            });
            oldViewAnim.start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(c03693m.A04);
            ViewPropertyAnimator newViewAnimation = animate.translationX(0.0f);
            newViewAnimation.translationY(0.0f).setDuration(A04()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3l
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    EV.this.A0S(c03693m.A04, false);
                    EV.this.A02.remove(c03693m.A04);
                    EV.this.A0Y();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    EV.this.A0T(c03693m.A04, false);
                }
            }).start();
        }
    }

    public final void A0a(final C4X c4x) {
        final View view = c4x.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(c4x);
        animate.alpha(1.0f).setDuration(A03()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3i
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                EV.this.A0M(c4x);
                EV.this.A00.remove(c4x);
                EV.this.A0Y();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                EV.this.A0N(c4x);
            }
        }).start();
    }

    public final void A0b(final C4X c4x, int i, int i2, int i3, int deltaX) {
        final View view = c4x.A0H;
        final int i4 = i3 - i;
        final int deltaX2 = deltaX - i2;
        if (i4 != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaX2 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(c4x);
        ViewPropertyAnimator animation = animate.setDuration(A05());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3j
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i4 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (deltaX2 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                EV.this.A0O(c4x);
                EV.this.A04.remove(c4x);
                EV.this.A0Y();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                EV.this.A0P(c4x);
            }
        }).start();
    }
}