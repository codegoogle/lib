package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Oq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0884Oq extends RelativeLayout {
    public static String[] A03;
    @Nullable
    public C04597a A00;
    public WeakReference<InterfaceC0883Op> A01;
    public final InterfaceC0896Pc A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    }

    public C0884Oq(C1080Wh c1080Wh, InterfaceC0896Pc interfaceC0896Pc) {
        super(c1080Wh);
        this.A02 = interfaceC0896Pc;
        C0795Le.A0M((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A01(K6 k6) {
        addView(k6, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C04597a) k6;
    }

    public final void A02(K6 k6) {
        C0795Le.A0M(k6);
        this.A00 = null;
    }

    public final boolean A03() {
        return this.A02.A7M();
    }

    public final boolean A04(int i) {
        return this.A02.getCurrentPosition() > i;
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C04597a c04597a = this.A00;
        if (c04597a != null) {
            c04597a.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
        r4 = (r0 * r8) / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        if (r0 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int mVideoWidth, int mVideoHeight) {
        int width = 0;
        int widthSpecMode = this.A02.getVideoWidth();
        int heightSpecMode = this.A02.getVideoHeight();
        int heightSpecSize = getDefaultSize(widthSpecMode, mVideoWidth);
        int defaultSize = getDefaultSize(heightSpecMode, mVideoHeight);
        if (widthSpecMode > 0 && heightSpecMode > 0) {
            width = 1;
            int mode = View.MeasureSpec.getMode(mVideoWidth);
            String[] strArr = A03;
            String str = strArr[5];
            String str2 = strArr[4];
            int charAt = str.charAt(24);
            int height = str2.charAt(24);
            if (charAt == height) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "CDDJeYuNvDEJubiWpvjZnzRFdpaPIWUA";
            strArr2[1] = "CDDJeYuNvDEJubiWpvjZnzRFdpaPIWUA";
            int size = View.MeasureSpec.getSize(mVideoWidth);
            int mode2 = View.MeasureSpec.getMode(mVideoHeight);
            int size2 = View.MeasureSpec.getSize(mVideoHeight);
            if (mode != 1073741824 || mode2 != 1073741824) {
                if (mode == 1073741824) {
                    heightSpecSize = size;
                    defaultSize = (heightSpecSize * heightSpecMode) / widthSpecMode;
                    if (mode2 == Integer.MIN_VALUE && defaultSize > size2) {
                        defaultSize = size2;
                    }
                } else if (mode2 == 1073741824) {
                    defaultSize = size2;
                    heightSpecSize = (defaultSize * widthSpecMode) / heightSpecMode;
                    String[] strArr3 = A03;
                    if (strArr3[7].charAt(1) != strArr3[0].charAt(1)) {
                        String[] strArr4 = A03;
                        strArr4[7] = "6OY3VkVRTo9gTvB5T4EFQBtDC7FaIDf0";
                        strArr4[0] = "lXHmnICBdoyL7DjWTMRRGmshSxtLnfI6";
                    }
                } else {
                    heightSpecSize = widthSpecMode;
                    defaultSize = heightSpecMode;
                    if (mode2 == Integer.MIN_VALUE && defaultSize > size2) {
                        defaultSize = size2;
                        heightSpecSize = (defaultSize * widthSpecMode) / heightSpecMode;
                    }
                    if (mode == Integer.MIN_VALUE && heightSpecSize > size) {
                        heightSpecSize = size;
                        defaultSize = (heightSpecSize * heightSpecMode) / widthSpecMode;
                    }
                }
            } else {
                heightSpecSize = size;
                defaultSize = size2;
                if (widthSpecMode * defaultSize < heightSpecSize * heightSpecMode) {
                    heightSpecSize = (defaultSize * widthSpecMode) / heightSpecMode;
                } else {
                    int i = widthSpecMode * defaultSize;
                    int i2 = heightSpecSize * heightSpecMode;
                    if (A03[3].charAt(9) != 'h') {
                        String[] strArr5 = A03;
                        strArr5[3] = "fC7LLJ1Dm89Wzyv9Y7CU7RKyEHK0kUw2";
                        strArr5[3] = "fC7LLJ1Dm89Wzyv9Y7CU7RKyEHK0kUw2";
                    }
                }
            }
        }
        setMeasuredDimension(heightSpecSize, defaultSize);
        if (A03[3].charAt(9) != 'h') {
            String[] strArr6 = A03;
            strArr6[1] = "jUvlMuc6V7f2FSIr4bukaecFyxTPY1HC";
            strArr6[1] = "jUvlMuc6V7f2FSIr4bukaecFyxTPY1HC";
            if (width == 0) {
                return;
            }
        } else if (width == 0) {
            return;
        }
        WeakReference<InterfaceC0883Op> weakReference = this.A01;
        if (weakReference != null && weakReference.get() != null) {
            this.A01.get().ABI();
        }
    }

    public void setViewImplInflationListener(InterfaceC0883Op interfaceC0883Op) {
        this.A01 = new WeakReference<>(interfaceC0883Op);
    }
}