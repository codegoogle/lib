package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import com.p7700g.p99005.sr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class GZ {
    public static byte[] A07;
    public static String[] A08;
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final GR A04;
    public final GS A05;
    public final GY A06;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 74);
            String[] strArr = A08;
            if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "o838eL9fL";
            strArr2[5] = "J6qCpr7RcsAqb79Ub3PrHCSZxMucifP";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-109, -80, -61, -80, 111, -75, -72, -76, -69, -77, 111, -69, -76, -67, -74, -61, -73, 111, -76, -57, -78, -76, -76, -77, -62, 111, -69, -72, -68, -72, -61, -16, 34, 14, -4, 13, 30, 31, 17, 30};
    }

    public static void A0B() {
        A08 = new String[]{"0rGqU9QbqgRhw9xCYiy2ikjdJF0tZxW0", "O5zJjRmwn", "Zuwvbdj2tlT5lxRkpa9deVxz18dZQdtj", "3cu9YvSu9oYTgNu7SXt0BZa9RO8c3dJe", "fSpgVoQESo9i788g3Yt2BRpnP7rxN0lE", "PNJ5rPmEA0nUP9bGeJM8wQu7KuAYrDy", "AGqKR696jXLUBqkrCQSQW886irj6NtRI", "IRr9cxFu4Mtz1eOchhtcqFpk7Zjv6sDY"};
    }

    static {
        A0B();
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public GZ(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new GS(719, 575, 0, 719, 0, 575);
        this.A04 = new GR(0, A0G(), A0H(), A0I());
        this.A06 = new GY(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(IP ip, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        int column = 0;
        do {
            int runLength = 0;
            byte A05 = ip.A05(2);
            if (A05 != 0) {
                runLength = 1;
            } else {
                boolean A0G = ip.A0G();
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "NWJ2j8DR8";
                strArr2[5] = "tuFwEgjWv5QsbV2rgY7O01mW2P3xd0b";
                if (A0G) {
                    runLength = ip.A05(3) + 3;
                    A05 = ip.A05(2);
                } else if (ip.A0G()) {
                    runLength = 1;
                    A05 = 0;
                } else {
                    int A052 = ip.A05(2);
                    if (A052 == 0) {
                        column = 1;
                        A05 = 0;
                    } else if (A052 != 1) {
                        if (A052 == 2) {
                            runLength = ip.A05(4) + 12;
                            A05 = ip.A05(2);
                        } else if (A052 != 3) {
                            A05 = 0;
                        } else {
                            int A053 = ip.A05(8);
                            String[] strArr3 = A08;
                            if (strArr3[1].length() == strArr3[5].length()) {
                                String[] strArr4 = A08;
                                strArr4[1] = "EWrEb5ztJ";
                                strArr4[5] = "osfW1bR5YMm4TxT0YESgxQn9EHcmZGy";
                                runLength = A053 + 12;
                                A05 = ip.A05(2);
                            } else {
                                String[] strArr5 = A08;
                                strArr5[7] = "aK1SAaExMssx18Id1roywrSfe1Et1yGa";
                                strArr5[7] = "aK1SAaExMssx18Id1roywrSfe1Et1yGa";
                                runLength = A053 + 29;
                                A05 = ip.A05(2);
                            }
                        }
                    } else {
                        runLength = 2;
                        A05 = 0;
                    }
                }
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    A05 = bArr[A05];
                }
                paint.setColor(iArr[A05]);
                canvas.drawRect(i3, i2, i3 + runLength, i2 + 1, paint);
            }
            i3 += runLength;
        } while (column == 0);
        return i3;
    }

    public static int A02(IP ip, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int runLength = i;
        int column = 0;
        do {
            int clutIndex = 0;
            byte A05 = ip.A05(4);
            if (A05 != 0) {
                clutIndex = 1;
            } else if (!ip.A0G()) {
                int A052 = ip.A05(3);
                if (A052 != 0) {
                    clutIndex = A052 + 2;
                    A05 = 0;
                } else {
                    column = 1;
                    A05 = 0;
                }
            } else if (!ip.A0G()) {
                clutIndex = ip.A05(2) + 4;
                A05 = ip.A05(4);
            } else {
                int A053 = ip.A05(2);
                if (A053 == 0) {
                    clutIndex = 1;
                    A05 = 0;
                } else if (A053 == 1) {
                    clutIndex = 2;
                    A05 = 0;
                } else if (A053 == 2) {
                    clutIndex = ip.A05(4) + 9;
                    A05 = ip.A05(4);
                } else if (A053 != 3) {
                    A05 = 0;
                } else {
                    clutIndex = ip.A05(8) + 25;
                    A05 = ip.A05(4);
                }
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A05 = bArr[A05];
                }
                paint.setColor(iArr[A05]);
                canvas.drawRect(runLength, i2, runLength + clutIndex, i2 + 1, paint);
            }
            runLength += clutIndex;
        } while (column == 0);
        return runLength;
    }

    public static int A03(IP ip, int[] iArr, byte[] bArr, int i, int peek, Paint paint, Canvas canvas) {
        int A05;
        int runLength = i;
        int column = 0;
        do {
            byte A052 = ip.A05(8);
            if (A052 != 0) {
                A05 = 1;
            } else if (!ip.A0G()) {
                A05 = ip.A05(7);
                if (A05 != 0) {
                    A052 = 0;
                } else {
                    column = 1;
                    A05 = 0;
                    A052 = 0;
                }
            } else {
                A05 = ip.A05(7);
                A052 = ip.A05(8);
                String[] strArr = A08;
                if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[7] = "oE62i0kU0YacGkvCLxgFzKdMfiudOn3o";
                strArr2[7] = "oE62i0kU0YacGkvCLxgFzKdMfiudOn3o";
            }
            if (A05 != 0 && paint != null) {
                if (bArr != null) {
                    A052 = bArr[A052];
                }
                paint.setColor(iArr[A052]);
                canvas.drawRect(runLength, peek, runLength + A05, peek + 1, paint);
            }
            runLength += A05;
            String[] strArr3 = A08;
            if (strArr3[1].length() == strArr3[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A08;
            strArr4[6] = "jmdilAXdKLha38CDbN17xGIpmuplWnFc";
            strArr4[3] = "1PNl1axnrexK2c7Nxi5CJrHaXY90XFpd";
        } while (column == 0);
        return runLength;
    }

    public static GR A04(IP ip, int i) {
        int[] iArr;
        int A05;
        int clutId;
        int i2;
        int cb;
        int b = 8;
        int A052 = ip.A05(8);
        ip.A09(8);
        int i3 = i - 2;
        int[] clutEntries8Bit = A0G();
        int[] A0H = A0H();
        int[] A0I = A0I();
        while (i3 > 0) {
            int r = ip.A05(b);
            int t = ip.A05(b);
            int y = i3 - 2;
            if ((t & 128) != 0) {
                iArr = clutEntries8Bit;
            } else {
                int cr = t & 64;
                if (cr != 0) {
                    iArr = A0H;
                } else {
                    iArr = A0I;
                }
            }
            if ((t & 1) != 0) {
                A05 = ip.A05(b);
                clutId = ip.A05(b);
                i2 = ip.A05(b);
                cb = ip.A05(b);
                i3 = y - 4;
            } else {
                A05 = ip.A05(6) << 2;
                int remainingLength = ip.A05(4);
                clutId = remainingLength << 4;
                int cr2 = ip.A05(4);
                i2 = cr2 << 4;
                int cr3 = ip.A05(2);
                cb = cr3 << 6;
                i3 = y - 2;
            }
            if (A05 == 0) {
                clutId = 0;
                i2 = 0;
                cb = 255;
            }
            byte b2 = (byte) (255 - (cb & 255));
            int a = clutId - 128;
            int i4 = (int) (A05 + (a * 1.402d));
            int cb2 = i2 - 128;
            double d = A05 - (cb2 * 0.34414d);
            int cb3 = clutId - 128;
            int i5 = (int) (d - (cb3 * 0.71414d));
            int cb4 = i2 - 128;
            int a2 = C0726Ig.A06(i4, 0, 255);
            int b3 = C0726Ig.A06(i5, 0, 255);
            iArr[r] = A00(b2, a2, b3, C0726Ig.A06((int) (A05 + (cb4 * 1.772d)), 0, 255));
            b = 8;
        }
        return new GR(A052, clutEntries8Bit, A0H, A0I);
    }

    public static GS A05(IP ip) {
        int verticalPositionMinimum;
        int width;
        int verticalPositionMaximum;
        int height;
        ip.A09(4);
        boolean A0G = ip.A0G();
        ip.A09(3);
        int A05 = ip.A05(16);
        int A052 = ip.A05(16);
        if (A0G) {
            verticalPositionMinimum = ip.A05(16);
            verticalPositionMaximum = ip.A05(16);
            width = ip.A05(16);
            height = ip.A05(16);
        } else {
            verticalPositionMinimum = 0;
            width = 0;
            verticalPositionMaximum = A05;
            height = A052;
        }
        return new GS(A05, A052, verticalPositionMinimum, verticalPositionMaximum, width, height);
    }

    public static GT A06(IP ip) {
        int objectCodingMethod = ip.A05(16);
        ip.A09(4);
        int A05 = ip.A05(2);
        boolean A0G = ip.A0G();
        ip.A09(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (A05 == 1) {
            ip.A09(ip.A05(8) * 16);
        } else if (A05 == 0) {
            int A052 = ip.A05(16);
            int objectId = ip.A05(16);
            String[] strArr = A08;
            String str = strArr[4];
            String str2 = strArr[0];
            int charAt = str.charAt(19);
            int topFieldDataLength = str2.charAt(19);
            if (charAt != topFieldDataLength) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[2] = "pcqe5F2CDJi5oBWvBkq2zbdYSROcg8Hm";
            strArr2[2] = "pcqe5F2CDJi5oBWvBkq2zbdYSROcg8Hm";
            if (A052 > 0) {
                bArr = new byte[A052];
                ip.A0F(bArr, 0, A052);
            }
            if (objectId > 0) {
                bArr2 = new byte[objectId];
                ip.A0F(bArr2, 0, objectId);
            } else {
                bArr2 = bArr;
            }
        }
        return new GT(objectCodingMethod, A0G, bArr, bArr2);
    }

    public static GU A07(IP ip, int timeoutSecs) {
        int remainingLength = ip.A05(8);
        int A05 = ip.A05(4);
        int A052 = ip.A05(2);
        ip.A09(2);
        int regionHorizontalAddress = timeoutSecs - 2;
        SparseArray sparseArray = new SparseArray();
        while (regionHorizontalAddress > 0) {
            int A053 = ip.A05(8);
            ip.A09(8);
            regionHorizontalAddress -= 6;
            sparseArray.put(A053, new GV(ip.A05(16), ip.A05(16)));
        }
        return new GU(remainingLength, A05, A052, sparseArray);
    }

    public static GW A08(IP ip, int i) {
        int i2 = 8;
        int A05 = ip.A05(8);
        ip.A09(4);
        boolean A0G = ip.A0G();
        ip.A09(3);
        int A052 = ip.A05(16);
        int A053 = ip.A05(16);
        int A054 = ip.A05(3);
        int A055 = ip.A05(3);
        ip.A09(2);
        int id = ip.A05(8);
        int A056 = ip.A05(8);
        int width = ip.A05(4);
        int height = ip.A05(2);
        ip.A09(2);
        int pixelCode8Bit = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (pixelCode8Bit > 0) {
            int pixelCode4Bit = ip.A05(16);
            int pixelCode2Bit = ip.A05(2);
            int remainingLength = ip.A05(2);
            int objectHorizontalPosition = ip.A05(12);
            ip.A09(4);
            int objectVerticalPosition = ip.A05(12);
            pixelCode8Bit -= 6;
            int remainingLength2 = 0;
            int objectType = 0;
            if (pixelCode2Bit == 1 || pixelCode2Bit == 2) {
                remainingLength2 = ip.A05(i2);
                objectType = ip.A05(i2);
                pixelCode8Bit -= 2;
                int objectProvider = A08[2].charAt(23);
                if (objectProvider == 111) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[4] = "2juIiSC4ZxHJWLrTtxN2ANki5argYjtZ";
                strArr[0] = "MWq7TNsVs7aXK0A5Gh22llfb9AkLnJo6";
            }
            sparseArray.put(pixelCode4Bit, new GX(pixelCode2Bit, remainingLength, objectHorizontalPosition, objectVerticalPosition, remainingLength2, objectType));
            i2 = 8;
        }
        return new GW(A05, A0G, A052, A053, A054, A055, id, A056, width, height, sparseArray);
    }

    public static void A0C(GT gt, GR gr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = gr.A03;
        } else if (i == 2) {
            iArr = gr.A02;
        } else {
            iArr = gr.A01;
        }
        A0E(gt.A03, iArr, i, i2, i3, paint, canvas);
        A0E(gt.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    public static void A0D(IP ip, GY gy) {
        int dataFieldLimit = ip.A05(8);
        int A05 = ip.A05(16);
        int A052 = ip.A05(16);
        int A03 = ip.A03() + A052;
        int i = A052 * 8;
        int pageId = ip.A02();
        if (i > pageId) {
            Log.w(A09(31, 9, 98), A09(0, 31, 5));
            int pageId2 = ip.A02();
            ip.A09(pageId2);
            return;
        }
        switch (dataFieldLimit) {
            case 16:
                if (A05 == gy.A03) {
                    GU gu = gy.A01;
                    GU A072 = A07(ip, A052);
                    if (A072.A00 != 0) {
                        gy.A01 = A072;
                        gy.A08.clear();
                        gy.A06.clear();
                        gy.A07.clear();
                        break;
                    } else if (gu != null && gu.A02 != A072.A02) {
                        gy.A01 = A072;
                        break;
                    }
                }
                break;
            case 17:
                GU gu2 = gy.A01;
                if (A05 == gy.A03 && gu2 != null) {
                    GW A082 = A08(ip, A052);
                    if (gu2.A00 == 0) {
                        A082.A00(gy.A08.get(A082.A03));
                    }
                    gy.A08.put(A082.A03, A082);
                    break;
                }
                break;
            case 18:
                if (A05 == gy.A03) {
                    GR A04 = A04(ip, A052);
                    gy.A06.put(A04.A00, A04);
                    break;
                } else if (A05 == gy.A02) {
                    GR A042 = A04(ip, A052);
                    gy.A04.put(A042.A00, A042);
                    break;
                }
                break;
            case 19:
                if (A05 == gy.A03) {
                    GT A06 = A06(ip);
                    gy.A07.put(A06.A00, A06);
                    break;
                } else if (A05 == gy.A02) {
                    GT A062 = A06(ip);
                    gy.A05.put(A062.A00, A062);
                    break;
                }
                break;
            case 20:
                if (A05 == gy.A03) {
                    gy.A00 = A05(ip);
                    break;
                }
                break;
        }
        int pageId3 = ip.A03();
        ip.A0A(A03 - pageId3);
    }

    public static void A0E(byte[] bArr, int[] iArr, int i, int column, int i2, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int line = i2;
        IP ip = new IP(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] bArr4 = null;
        int dataType = column;
        while (ip.A02() != 0) {
            int A05 = ip.A05(8);
            if (A05 != 240) {
                switch (A05) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArr4 == null ? A0A : bArr4;
                        } else if (i == 2) {
                            bArr3 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                        } else {
                            bArr3 = null;
                        }
                        dataType = A01(ip, iArr, bArr3, dataType, line, paint, canvas);
                        ip.A06();
                        continue;
                    case 17:
                        if (i == 3) {
                            bArr2 = 0 == 0 ? A0B : null;
                        } else {
                            bArr2 = null;
                            String[] strArr = A08;
                            if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[2] = "ywEr7H1ZkU3fUIk8F5vLu65dTGZjfu1h";
                            strArr2[2] = "ywEr7H1ZkU3fUIk8F5vLu65dTGZjfu1h";
                        }
                        dataType = A02(ip, iArr, bArr2, dataType, line, paint, canvas);
                        ip.A06();
                        continue;
                    case 18:
                        dataType = A03(ip, iArr, null, dataType, line, paint, canvas);
                        continue;
                    default:
                        String[] strArr3 = A08;
                        if (strArr3[1].length() == strArr3[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A08;
                        strArr4[6] = "nnJuFIsGV5CjoI7UJHQ2Bk6wbONoIcvD";
                        strArr4[3] = "B7N9QxouVzPbBX96zhiMkNdTz6ghfWa9";
                        switch (A05) {
                            case 32:
                                clutMapTable2To8 = A0F(4, 4, ip);
                                continue;
                            case 33:
                                bArr4 = A0F(4, 8, ip);
                                continue;
                            case 34:
                                bArr4 = A0F(16, 8, ip);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                dataType = column;
                if (A08[2].charAt(23) != 'o') {
                    String[] strArr5 = A08;
                    strArr5[6] = "9tyozG4lbSXUGnB14yX0PwlmOZMu8mKn";
                    strArr5[3] = "zB65tdLGIFDHc3IIcHjCnZN0WwQ6SUlQ";
                    line += 2;
                } else {
                    line += 2;
                }
            }
        }
    }

    public static byte[] A0F(int i, int i2, IP ip) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ip.A05(i2);
        }
        return bArr;
    }

    public static int[] A0G() {
        return new int[]{0, -1, sr.t, -8421505};
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] A0H() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < i; i++) {
            if (i < 8) {
                int i2 = i & 1;
                int i3 = i2 != 0 ? 255 : 0;
                int i4 = i & 2;
                int i5 = i4 != 0 ? 255 : 0;
                int i6 = i & 4;
                int i7 = i6 != 0 ? 255 : 0;
                iArr[i] = A00(255, i3, i5, i7);
            } else {
                int i8 = i & 1;
                int i9 = i8 != 0 ? 127 : 0;
                int i10 = i & 2;
                int i11 = i10 != 0 ? 127 : 0;
                int i12 = i & 4;
                int i13 = A00(255, i9, i11, i12 == 0 ? 0 : 127);
                iArr[i] = i13;
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0152, code lost:
        r0 = 170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016a, code lost:
        if (r9 != 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x016d, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0192, code lost:
        if (r7 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0194, code lost:
        r2 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01db, code lost:
        if (r7 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01de, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
        r0 = A00(255, r9, r3, r8 + r6);
        r5[r4] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e6, code lost:
        if (r0 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
        r0 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0115, code lost:
        if (r0 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0118, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0150, code lost:
        if (r9 != 0) goto L133;
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] A0I() {
        int i;
        int i2;
        int i3;
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i4 = 0;
        while (i4 < i) {
            if (A08[7].charAt(0) != 'p') {
                String[] strArr = A08;
                strArr[7] = "7y54aHaRl5REI13HJ3s1imsDPHbTblVp";
                strArr[7] = "7y54aHaRl5REI13HJ3s1imsDPHbTblVp";
                if (i4 < 8) {
                    int i5 = i4 & 1;
                    int i6 = i5 != 0 ? 255 : 0;
                    int i7 = i4 & 2;
                    int i8 = i7 != 0 ? 255 : 0;
                    int i9 = i4 & 4;
                    int i10 = A00(63, i6, i8, i9 == 0 ? 0 : 255);
                    iArr[i4] = i10;
                } else {
                    int i11 = i4 & WKSRecord.Service.PROFILE;
                    if (i11 != 0) {
                        if (i11 != 8) {
                            if (i11 == 128) {
                                int i12 = i4 & 1;
                                int i13 = (i12 != 0 ? 43 : 0) + 127;
                                if (A08[2].charAt(23) != 'o') {
                                    String[] strArr2 = A08;
                                    strArr2[6] = "8rwGXlyeTkBDctGAAe0ybw2U4QS8yLu8";
                                    strArr2[3] = "b3XBP5juEUhRB0eBqHayBxF2ov8DVqZh";
                                    int i14 = i4 & 16;
                                } else {
                                    int i15 = i4 & 16;
                                }
                                int i16 = i13 + i3;
                                int i17 = i4 & 2;
                                int i18 = (i17 != 0 ? 43 : 0) + 127;
                                int i19 = i4 & 32;
                                int i20 = i19 != 0 ? 85 : 0;
                                int i21 = i18 + i20;
                                int i22 = i4 & 4;
                                int i23 = (i22 == 0 ? 0 : 43) + 127;
                                int i24 = i4 & 64;
                                int i25 = A00(255, i16, i21, i23 + (i24 == 0 ? 0 : 85));
                                iArr[i4] = i25;
                            } else if (i11 == 136) {
                                int i26 = i4 & 1;
                                int i27 = i26 != 0 ? 43 : 0;
                                int i28 = i4 & 16;
                                int i29 = i28 != 0 ? 85 : 0;
                                int i30 = i27 + i29;
                                int i31 = i4 & 2;
                                int i32 = i31 != 0 ? 43 : 0;
                                int i33 = i4 & 32;
                                int i34 = i33 != 0 ? 85 : 0;
                                int i35 = i32 + i34;
                                int i36 = i4 & 4;
                                int i37 = i36 == 0 ? 0 : 43;
                                int i38 = i4 & 64;
                                if (A08[7].charAt(0) != 'p') {
                                    String[] strArr3 = A08;
                                    strArr3[7] = "rqpSBs3vuZ0ERZdVV6yaRn8vqIGdmkwB";
                                    strArr3[7] = "rqpSBs3vuZ0ERZdVV6yaRn8vqIGdmkwB";
                                } else {
                                    String[] strArr4 = A08;
                                    strArr4[6] = "2QJGhvhuyca3nv8SEdFx1xy9G3klEgNt";
                                    strArr4[3] = "r0SxrSAMbEoy1xhAukRyPN5ngWlJAOxP";
                                }
                            }
                        } else {
                            int i39 = i4 & 1;
                            if (A08[2].charAt(23) != 'o') {
                                String[] strArr5 = A08;
                                strArr5[1] = "zD6Csp8ux";
                                strArr5[5] = "ABdM1nmFS67IaChkXEo7C65oL6pHbci";
                            }
                            int i40 = i4 & 16;
                            int i41 = i40 != 0 ? 170 : 0;
                            int i42 = i2 + i41;
                            int i43 = i4 & 2;
                            int i44 = i43 != 0 ? 85 : 0;
                            int i45 = i4 & 32;
                            int i46 = i45 != 0 ? 170 : 0;
                            int i47 = i44 + i46;
                            int i48 = i4 & 4;
                            r6 = i48 == 0 ? 0 : 85;
                            int i49 = i4 & 64;
                            int A00 = A00(127, i42, i47, r6 + (i49 == 0 ? 0 : 170));
                            String[] strArr6 = A08;
                            String str = strArr6[4];
                            String str2 = strArr6[0];
                            int charAt = str.charAt(19);
                            int i50 = str2.charAt(19);
                            if (charAt == i50) {
                                String[] strArr7 = A08;
                                strArr7[7] = "bDBxdZVxANiceBpFScFowteWsfRZjeai";
                                strArr7[7] = "bDBxdZVxANiceBpFScFowteWsfRZjeai";
                                iArr[i4] = A00;
                            }
                        }
                    } else {
                        int i51 = i4 & 1;
                        int i52 = i51 != 0 ? 85 : 0;
                        int i53 = i4 & 16;
                        int i54 = i53 != 0 ? 170 : 0;
                        int i55 = i52 + i54;
                        int i56 = i4 & 2;
                        int i57 = i56 != 0 ? 85 : 0;
                        int i58 = i4 & 32;
                        String[] strArr8 = A08;
                        String str3 = strArr8[6];
                        String str4 = strArr8[3];
                        int charAt2 = str3.charAt(3);
                        int i59 = str4.charAt(3);
                        if (charAt2 != i59) {
                            String[] strArr9 = A08;
                            strArr9[2] = "wHDyMipoRF4Sy41BpQnebh5fQe1LXtvR";
                            strArr9[2] = "wHDyMipoRF4Sy41BpQnebh5fQe1LXtvR";
                        }
                        int i60 = i57 + i;
                        int i61 = i4 & 4;
                        r6 = i61 == 0 ? 0 : 85;
                        int i62 = i4 & 64;
                        int i63 = A00(255, i55, i60, r6 + (i62 == 0 ? 0 : 170));
                        iArr[i4] = i63;
                    }
                }
                i4++;
            }
            throw new RuntimeException();
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0123, code lost:
        r11 = r20.A06;
        r10 = com.facebook.ads.redexgen.X.GZ.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0136, code lost:
        if (r10[6].charAt(3) == r10[3].charAt(3)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0138, code lost:
        r10 = com.facebook.ads.redexgen.X.GZ.A08;
        r10[4] = "FqzyOIY2SO0zI5B62Gz2koPoL8lG6Y83";
        r10[0] = "OO5P85uWBDMqMzJuElY2BFz2z3H1SOXI";
        r14 = r11.A04.get(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0150, code lost:
        r14 = r20.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
        r10 = r1.A09;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
        r12 = r10.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0166, code lost:
        if (com.facebook.ads.redexgen.X.GZ.A08[2].charAt(23) == 'o') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0168, code lost:
        r13 = com.facebook.ads.redexgen.X.GZ.A08;
        r13[2] = "8CBvTLi9MCYkuIvOm7pX0icqjNgV3H5L";
        r13[2] = "8CBvTLi9MCYkuIvOm7pX0icqjNgV3H5L";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:
        if (r9 >= r12) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
        r12 = r10.keyAt(r9);
        r11 = r10.valueAt(r9);
        r13 = r20.A06.A07.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018a, code lost:
        if (r13 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018c, code lost:
        r13 = r20.A06.A05.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0196, code lost:
        if (r13 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x019a, code lost:
        if (r13.A01 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019c, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019d, code lost:
        A0C(r13, r14, r1.A01, r4 + r11.A02, r3 + r11.A05, r8, r20.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b0, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b3, code lost:
        r8 = r20.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b8, code lost:
        if (r1.A0A == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bd, code lost:
        if (r1.A01 != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bf, code lost:
        r9 = r14.A03[r1.A07];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c5, code lost:
        r20.A03.setColor(r9);
        r20.A01.drawRect(r4, r3, r1.A08 + r4, r1.A02 + r3, r20.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0218, code lost:
        if (r1.A01 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x021a, code lost:
        r9 = r14.A02[r1.A06];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0221, code lost:
        r11 = r14.A01;
        r10 = com.facebook.ads.redexgen.X.GZ.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0235, code lost:
        if (r10[4].charAt(19) == r10[0].charAt(19)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023c, code lost:
        r10 = com.facebook.ads.redexgen.X.GZ.A08;
        r10[1] = "SK7qwpqeD";
        r10[5] = "H8yQ2FZGH97VM0iLZGupvWVfM60nEcr";
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024e, code lost:
        r14 = r11.A04.get(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0258, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0296, code lost:
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02a2, code lost:
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<GF> A0J(byte[] bArr, int i) {
        GS gs;
        GW gw;
        int objectId;
        String[] strArr;
        int i2;
        GR gr;
        IP ip = new IP(bArr, i);
        while (ip.A02() >= 48 && ip.A05(8) == 15) {
            A0D(ip, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        GS gs2 = this.A06.A00;
        String[] strArr2 = A08;
        if (strArr2[1].length() != strArr2[5].length()) {
            String[] strArr3 = A08;
            strArr3[1] = "z8hrEfHRE";
            strArr3[5] = "tEcTk7NjBKTGmUTfvqHNNfUFGTzpRsq";
            if (gs2 != null) {
                gs = this.A06.A00;
            } else {
                gs = this.A05;
            }
            if (this.A00 == null || gs.A05 + 1 != this.A00.getWidth() || gs.A00 + 1 != this.A00.getHeight()) {
                this.A00 = Bitmap.createBitmap(gs.A05 + 1, gs.A00 + 1, Bitmap.Config.ARGB_8888);
                this.A01.setBitmap(this.A00);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<GV> sparseArray = this.A06.A01.A03;
            int i3 = 0;
            loop1: while (true) {
                int size = sparseArray.size();
                String[] strArr4 = A08;
                if (strArr4[6].charAt(3) != strArr4[3].charAt(3)) {
                    String[] strArr5 = A08;
                    strArr5[6] = "TprGMNp3AYOmeYIcCj9alnxqC4oFWUd6";
                    strArr5[3] = "Eq3XgCegRXd5fB5msr1SXwFGWzY9w5wa";
                    if (i3 >= size) {
                        break;
                    }
                    GV valueAt = sparseArray.valueAt(i3);
                    gw = this.A06.A08.get(sparseArray.keyAt(i3));
                    objectId = valueAt.A00 + gs.A02;
                    strArr = A08;
                    if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                        String[] strArr6 = A08;
                        strArr6[4] = "TY5GWswnGZgqU5TBTRN2XTUe2O3rblrN";
                        strArr6[0] = "yCdfjvFRPQZrw6b6gB422Kgbwhe9KBG1";
                        i2 = valueAt.A01 + gs.A04;
                        this.A01.clipRect(objectId, i2, Math.min(gw.A08 + objectId, gs.A01), Math.min(gw.A02 + i2, gs.A03), Region.Op.REPLACE);
                        gr = this.A06.A06.get(gw.A00);
                    } else {
                        String[] strArr7 = A08;
                        strArr7[2] = "9LKzldxuFJaIme257qc067WNURDIagQu";
                        strArr7[2] = "9LKzldxuFJaIme257qc067WNURDIagQu";
                        i2 = valueAt.A01 + gs.A04;
                        this.A01.clipRect(objectId, i2, Math.min(gw.A08 + objectId, gs.A01), Math.min(gw.A02 + i2, gs.A03), Region.Op.REPLACE);
                        gr = this.A06.A06.get(gw.A00);
                    }
                } else {
                    if (i3 >= size) {
                        break;
                    }
                    GV valueAt2 = sparseArray.valueAt(i3);
                    gw = this.A06.A08.get(sparseArray.keyAt(i3));
                    objectId = valueAt2.A00 + gs.A02;
                    strArr = A08;
                    if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(this.A00, objectId, i2, gw.A08, gw.A02);
                float f = objectId / gs.A05;
                float f2 = i2 / gs.A00;
                float f3 = gw.A08 / gs.A05;
                int color = gw.A02;
                float f4 = color;
                int color2 = gs.A00;
                arrayList.add(new GF(createBitmap, f, 0, f2, 0, f3, f4 / color2));
                this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
                i3++;
            }
        }
        throw new RuntimeException();
    }

    public final void A0K() {
        this.A06.A00();
    }
}