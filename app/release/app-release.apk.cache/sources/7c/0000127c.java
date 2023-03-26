package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class MR extends ImageView {
    public static String[] A01;
    @Nullable
    public ImageView.ScaleType A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"", "xAgTXbjVi62PdicRvipr2yH2TBkp", "gkbD2s1xpJQg4uStKBrjHXnqoYLvnFUr", "soe6jIArtiQ", "3Vk7uiWTp4D98Qq5DBFXHdZ3JTbv3qUy", "5FE99nP0vOH07stjGxCxhCer", "JVbWipYt4YB", ""};
    }

    public MR(C1080Wh c1080Wh) {
        super(c1080Wh);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int widthSpecSize, int i) {
        ImageView.ScaleType scaleType;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthSpecSize);
        if (View.MeasureSpec.getMode(widthSpecSize) == 1073741824) {
            int mode = View.MeasureSpec.getMode(i);
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "LPpzUfvPRnl";
            strArr2[3] = "8xYze5Yy4ig";
            if (mode == 1073741824) {
                int min = Math.min(size2, size);
                setMeasuredDimension(min, min);
                scaleType = this.A00;
                if (scaleType == null) {
                    super.setScaleType(scaleType);
                    return;
                }
                return;
            }
        }
        if (View.MeasureSpec.getMode(widthSpecSize) == 1073741824) {
            if (size > 0) {
                size2 = Math.min(size2, size);
            }
            setMeasuredDimension(size2, size2);
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (size2 > 0) {
                size = Math.min(size2, size);
            }
            setMeasuredDimension(size, size);
        } else {
            super.onMeasure(widthSpecSize, i);
        }
        scaleType = this.A00;
        if (scaleType == null) {
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}