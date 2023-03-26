package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.1U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1U extends C2A implements ON {
    public static String[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MB A04;
    public boolean A05;
    public final C05259x A06;

    static {
        A02();
    }

    public static void A02() {
        A07 = new String[]{"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    }

    public C1U(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C05259x(c1080Wh, new OK(), new OJ());
        A01();
    }

    public C1U(C1080Wh c1080Wh, AttributeSet attributeSet) {
        super(c1080Wh, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C05259x(c1080Wh, new OK(), new OJ());
        A01();
    }

    public C1U(C1080Wh c1080Wh, AttributeSet attributeSet, int i) {
        super(c1080Wh, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C05259x(c1080Wh, new OK(), new OJ());
        A01();
    }

    private int A00(int availableWidth) {
        int numFullItems = this.A00 * 2;
        int itemSize = (getMeasuredWidth() - getPaddingLeft()) - numFullItems;
        int A0E = getAdapter().A0E();
        int i = 0;
        int numItems = Integer.MAX_VALUE;
        while (numItems > availableWidth) {
            i++;
            if (i >= A0E) {
                return availableWidth;
            }
            int numItems2 = i * numFullItems;
            numItems = (int) ((itemSize - numItems2) / (i + 0.333f));
        }
        return numItems;
    }

    private void A01() {
        this.A06.A2F(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        C0795Le.A0N(this);
    }

    private void A03(int i, int i2) {
        if (i == this.A03 && i2 == this.A02) {
            return;
        }
        this.A03 = i;
        if (A07[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "hNBaptvkpj";
        strArr[6] = "hNBaptvkpj";
        this.A02 = i2;
        if (this.A04 != null) {
            throw null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2A
    public final void A23(int i, boolean z) {
        super.A23(i, z);
        A03(i, 0);
    }

    @Override // com.facebook.ads.redexgen.X.ON
    public final int A6n(int i) {
        int abs = Math.abs(i);
        if (abs <= ((C2A) this).A06) {
            return 0;
        }
        int i2 = this.A01;
        if (i2 == 0) {
            return 1;
        }
        return 1 + (abs / i2);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.ES, android.view.View
    public final void onMeasure(int i, int itemSize) {
        int round;
        int A00;
        super.onMeasure(i, itemSize);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            round = (((int) C0795Le.A01) * J8.A0C(getContext())) + paddingTop;
        } else {
            round = Math.round(getMeasuredWidth() / 1.91f);
        }
        int mode = View.MeasureSpec.getMode(itemSize);
        if (mode == Integer.MIN_VALUE) {
            round = Math.min(View.MeasureSpec.getSize(itemSize), round);
        } else if (mode == 1073741824) {
            round = View.MeasureSpec.getSize(itemSize);
        }
        int i2 = round - paddingTop;
        if (this.A05) {
            A00 = Math.min(M8.A09, i2);
        } else {
            A00 = A00(i2);
        }
        setMeasuredDimension(getMeasuredWidth(), A00 + paddingTop);
        if (!this.A05) {
            setChildWidth((this.A00 * 2) + A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ES
    public void setAdapter(@Nullable AnonymousClass43 anonymousClass43) {
        this.A06.A2M(anonymousClass43 == null ? -1 : anonymousClass43.hashCode());
        super.setAdapter(anonymousClass43);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        this.A06.A2N((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.A01) / 2);
        this.A06.A2L(this.A01 / measuredWidth);
    }

    public void setCurrentPosition(int i) {
        A23(i, false);
    }

    public void setOnPageChangedListener(MB mb) {
        this.A04 = mb;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}