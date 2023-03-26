package com.anythink.core.common.h;

import android.text.TextUtils;
import android.util.Base64;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.l64;
import com.p7700g.p99005.ni4;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.xbill.DNS.Flags;

/* loaded from: classes2.dex */
public final class a {
    private static Map<Character, Character> a;
    private static char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', ni4.Z, 't', 'u', l64.d, 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', j14.P};
    private static char[] c = {'5', 'P', 'V', 'u', '3', 'J', 'j', 'l', 'e', 'Q', 'b', 'H', '9', 'A', l64.d, 'h', 't', ni4.Z, 'g', 'W', 'I', 'C', 'U', 'i', 'F', '2', 'a', 'd', 'M', '8', 'D', 'y', 'Z', 'O', 'N', 'k', j14.P, '4', 'R', '7', '0', 'f', 'n', '+', 'z', 'G', 'Y', 'L', 'X', 'p', 'm', '1', 'E', 'K', 'S', 'T', 'o', 'x', '6', 'q', 'w', 'r', 'c', 'B'};
    private static byte[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, ax5.a, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Flags.CD, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, bx.W5, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static b a(String str, String str2) {
        byte[] doFinal;
        b bVar = new b();
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
            int bitLength = generatePublic instanceof RSAPublicKey ? ((RSAPublicKey) generatePublic).getModulus().bitLength() : 0;
            Cipher cipher = Cipher.getInstance(CryptoConstants.CIPHER_RSA);
            cipher.init(1, generatePublic);
            int i = (bitLength / 8) - 11;
            if (i > 0) {
                doFinal = a(cipher, str2.getBytes(), i);
            } else {
                doFinal = cipher.doFinal(str2.getBytes());
            }
            bVar.a(new String(Base64.encode(doFinal, 2)));
        } catch (Throwable th) {
            bVar.b(th.getMessage());
        }
        return bVar;
    }

    private static byte[] b(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3;
        byte b4;
        int i4;
        byte b5;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i5 = 0;
        while (i5 < length) {
            while (true) {
                i = i5 + 1;
                b2 = d[bytes[i5]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i5 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = d[bytes[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
            while (true) {
                i3 = i2 + 1;
                byte b6 = bytes[i2];
                if (b6 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b4 = d[b6];
                if (i3 >= length || b4 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & 15) << 4) | ((b4 & 60) >>> 2));
            while (true) {
                i4 = i3 + 1;
                byte b7 = bytes[i3];
                if (b7 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b5 = d[b7];
                if (i4 >= length || b5 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b5 == -1) {
                break;
            }
            byteArrayOutputStream.write(b5 | ((b4 & 3) << 6));
            i5 = i4;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] a(Cipher cipher, byte[] bArr, int i) {
        byte[] doFinal;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = length - i2;
            if (i4 > 0) {
                if (i4 > i) {
                    doFinal = cipher.doFinal(bArr, i2, i);
                } else {
                    doFinal = cipher.doFinal(bArr, i2, i4);
                }
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i3++;
                i2 = i3 * i;
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public static String a(String str) {
        Character valueOf;
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    char c2 = charArray[i];
                    if (a == null) {
                        a = new HashMap();
                        for (int i2 = 0; i2 < b.length; i2++) {
                            a.put(Character.valueOf(c[i2]), Character.valueOf(b[i2]));
                        }
                    }
                    if (a.containsKey(Character.valueOf(c2))) {
                        valueOf = a.get(Character.valueOf(c2));
                    } else {
                        valueOf = Character.valueOf(c2);
                    }
                    cArr[i] = valueOf.charValue();
                }
                str2 = new String(cArr);
            }
            return new String(b(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    private static Character a(char c2) {
        if (a == null) {
            a = new HashMap();
            for (int i = 0; i < b.length; i++) {
                a.put(Character.valueOf(c[i]), Character.valueOf(b[i]));
            }
        }
        if (a.containsKey(Character.valueOf(c2))) {
            return a.get(Character.valueOf(c2));
        }
        return Character.valueOf(c2);
    }
}