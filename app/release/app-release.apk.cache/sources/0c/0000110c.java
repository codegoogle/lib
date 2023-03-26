package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class GM {
    public static String[] A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<GL> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    static {
        A01();
    }

    public static void A01() {
        A08 = new String[]{"cHi9U0Pg", "VGea8qk0EPS8OqQ4obSD5aeRlTRdn39K", "J", "J", "UkvFMUtno93mVTdlP0lNSPxeQZ", "4fCjFf2htdfAP", "I6h5KAyxQwYPDLtwjcMWBd", "QYcuKDWzo7FBs229Db5R79YAEK36tHpY"};
    }

    public GM(int i, int i2) {
        A0A(i);
        A0B(i2);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SpannableString A00() {
        int position;
        int[] iArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int italicStartPosition = spannableStringBuilder.length();
        int colorStartPosition = -1;
        int color = -1;
        int i = 0;
        int nextColor = -1;
        int i2 = 0;
        int i3 = -1;
        for (int nextPosition = 0; nextPosition < underlineStartPosition; nextPosition++) {
            GL gl = this.A06.get(nextPosition);
            boolean z = gl.A02;
            int i4 = gl.A01;
            if (i4 != 8) {
                i2 = i4 == 7 ? 1 : 0;
                if (i4 != 7) {
                    iArr = C03502r.A0K;
                    i3 = iArr[i4];
                }
            }
            int i5 = gl.A00;
            int i6 = nextPosition + 1;
            int position2 = this.A06.size();
            if (i6 < position2) {
                int position3 = nextPosition + 1;
                position = this.A06.get(position3).A00;
            } else {
                position = italicStartPosition;
            }
            if (i5 != position) {
                if (colorStartPosition != -1 && !z) {
                    A03(spannableStringBuilder, colorStartPosition, i5);
                    colorStartPosition = -1;
                } else if (colorStartPosition == -1 && z) {
                    colorStartPosition = i5;
                }
                String[] strArr = A08;
                if (strArr[4].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[4] = "lr4TMFgGLuEdpqEBom9kPNzU6S";
                strArr2[5] = "0zdhGbgYXkwlZ";
                if (color != -1 && i2 == 0) {
                    A02(spannableStringBuilder, color, i5);
                    color = -1;
                } else if (color == -1 && i2 != 0) {
                    color = i5;
                }
                if (i3 != nextColor) {
                    A04(spannableStringBuilder, i, i5, nextColor);
                    nextColor = i3;
                    i = i5;
                }
            }
        }
        if (colorStartPosition != -1 && colorStartPosition != italicStartPosition) {
            A03(spannableStringBuilder, colorStartPosition, italicStartPosition);
        }
        if (color != -1 && color != italicStartPosition) {
            A02(spannableStringBuilder, color, italicStartPosition);
        }
        if (i != italicStartPosition) {
            A04(spannableStringBuilder, i, italicStartPosition, nextColor);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    public final int A05() {
        return this.A03;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GF A06() {
        float f;
        int i;
        int positionAnchor;
        int i2;
        int lineAnchor;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < this.A07.size(); i3++) {
            SpannableString spannableString = this.A07.get(i3);
            String[] strArr = A08;
            if (strArr[7].charAt(17) != strArr[1].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "JfGeCXNtH9OkzyiNPcVTkTkkVF";
            strArr2[5] = "U8fcuMPJKIItC";
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (spannableStringBuilder.length() != 0) {
            int i4 = this.A02 + this.A04;
            int length = (32 - i4) - spannableStringBuilder.length();
            int i5 = i4 - length;
            int endPadding = this.A00;
            if (endPadding == 2) {
                int startPadding = Math.abs(i5);
                if (startPadding < 3 || length < 0) {
                    f = 0.5f;
                    i = 1;
                    positionAnchor = this.A00;
                    if (positionAnchor != 1) {
                        int positionAnchor2 = this.A03;
                        if (positionAnchor2 <= 7) {
                            i2 = 0;
                            lineAnchor = this.A03;
                            return new GF(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, lineAnchor, 1, i2, f, i, Float.MIN_VALUE);
                        }
                    }
                    i2 = 2;
                    lineAnchor = (this.A03 - 15) - 2;
                    return new GF(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, lineAnchor, 1, i2, f, i, Float.MIN_VALUE);
                }
            }
            if (this.A00 == 2 && i5 > 0) {
                f = (0.8f * ((32 - length) / 32.0f)) + 0.1f;
                i = 2;
            } else {
                float position = i4;
                f = (0.8f * (position / 32.0f)) + 0.1f;
                i = 0;
            }
            positionAnchor = this.A00;
            if (positionAnchor != 1) {
            }
            i2 = 2;
            lineAnchor = (this.A03 - 15) - 2;
            return new GF(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, lineAnchor, 1, i2, f, i, Float.MIN_VALUE);
        }
        return null;
    }

    public final void A07() {
        int length = this.A05.length();
        if (length > 0) {
            this.A05.delete(length - 1, length);
            for (int size = this.A06.size() - 1; size >= 0; size--) {
                List<GL> list = this.A06;
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[3];
                int length2 = str.length();
                int i = str2.length();
                if (length2 != i) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "cQse4OX3";
                strArr2[6] = "MGHTHr2HMLcimDeu5sZkGF";
                GL gl = list.get(size);
                int i2 = gl.A00;
                if (i2 == length) {
                    int i3 = gl.A00;
                    gl.A00 = i3 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A08() {
        this.A07.add(A00());
        this.A05.setLength(0);
        this.A06.clear();
        int min = Math.min(this.A01, this.A03);
        while (this.A07.size() >= min) {
            this.A07.remove(0);
        }
    }

    public final void A09(char c) {
        this.A05.append(c);
    }

    public final void A0A(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0B(int i) {
        this.A01 = i;
    }

    public final void A0C(int i) {
        this.A02 = i;
    }

    public final void A0D(int i) {
        this.A03 = i;
    }

    public final void A0E(int i) {
        this.A04 = i;
    }

    public final void A0F(int i, boolean z) {
        this.A06.add(new GL(i, z, this.A05.length()));
    }

    public final boolean A0G() {
        if (this.A06.isEmpty() && this.A07.isEmpty()) {
            StringBuilder sb = this.A05;
            String[] strArr = A08;
            if (strArr[0].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "ONSLHBaiVChTiCDyCbz7MeGvMb5ZJwv8";
            strArr2[1] = "WV9KVve3dIDV1UZxgbczLfOjx2KW4DPJ";
            if (sb.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.A05.toString();
    }
}