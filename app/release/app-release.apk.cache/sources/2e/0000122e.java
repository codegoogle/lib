package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LB {
    public static byte[] A00;
    public static String[] A01;

    static {
        A06();
        A05();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 5);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-75, -40, -37, -44, -113, -35, -34, -29, -113, -43, -34, -28, -35, -45, -113, -34, bx.j7, -113, -35, -34, -29, -113, -48, -46, -46, -44, -30, -30, -40, -47, -37, -44, -99, -98, -92, 117, -70, -51, -72, -70, -59, -55, -66, -60, -61, -125, -69, -78, -93, -84, -51, 126, -47, -45, -63, -58, 126, -65, -54, -59, -51, -48, -57, -46, -58, -53, -116};
    }

    public static void A06() {
        A01 = new String[]{"IOEZorjxOvw6WLkUEnC6RZ8kEO9", "tHPeSZxRvwouZJrSTjrDS", "TwGUtlC7GZyiucHxYkx3tmK4C4H8dlEQ", "GjCU5mOPxx9IT2wExHvtqMTRFU0QzxAJ", "XmpOvjLSyfhgS8Wil7aGxd4h0rPRF491", "y4S9iPYd4rIMIRQ9MJO3pBhIPGP4T8Jh", "23Thg1fStvZGySLsE7bFCmDmP0GXJhTR", "jegZiJVYRtoFlccHEdL0d7ywmKE0efBM"};
    }

    @Nullable
    public static String A01(File file) throws Exception {
        FileInputStream fileInputStream;
        int read;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(A00(46, 3, 105));
                    byte[] bArr = new byte[1024];
                    do {
                        read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        }
                    } while (read != -1);
                    return A04(messageDigest.digest());
                } catch (IOException unused) {
                    throw new Exception(A00(33, 13, 80));
                } catch (NoSuchAlgorithmException unused2) {
                    throw new Exception(A00(49, 18, 89));
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
            }
        } catch (FileNotFoundException unused4) {
            throw new Exception(A00(0, 33, 106));
        }
    }

    @Nullable
    public static final String A02(String str) throws Exception {
        return A01(new File(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[LOOP:1: B:5:0x0010->B:14:0x0046, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A03(byte[] bArr) {
        int two_halfs;
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int halfbyte = bArr[i];
            int two_halfs2 = (halfbyte >>> 4) & 15;
            int i2 = 0;
            while (true) {
                if (two_halfs2 >= 0) {
                    String[] strArr = A01;
                    String str = strArr[2];
                    String str2 = strArr[3];
                    int charAt = str.charAt(24);
                    int two_halfs3 = str2.charAt(24);
                    if (charAt == two_halfs3) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[2] = "WYC0eM9KSy1kpGQhaCsWuh8F6Di5rl0B";
                    strArr2[3] = "cvJ0Eg1FAjPz1pwRpU9xefwXrHpQMXjt";
                    if (two_halfs2 <= 9) {
                        two_halfs = two_halfs2 + 48;
                        sb.append((char) two_halfs);
                        two_halfs2 = halfbyte & 15;
                        int i3 = i2 + 1;
                        if (i2 < 1) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                two_halfs = (two_halfs2 - 10) + 97;
                sb.append((char) two_halfs);
                two_halfs2 = halfbyte & 15;
                int i32 = i2 + 1;
                if (i2 < 1) {
                }
            }
        }
        return sb.toString();
    }

    public static String A04(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}