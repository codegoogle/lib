package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import com.p7700g.p99005.z1;
import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbbs {
    public static int zza(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c8, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c9, code lost:
        r4 = true;
     */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] zzb(@z1 String str, boolean z) {
        Character.UnicodeBlock of;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt) && ((of = Character.UnicodeBlock.of(codePointAt)) == Character.UnicodeBlock.BOPOMOFO || of == Character.UnicodeBlock.BOPOMOFO_EXTENDED || of == Character.UnicodeBlock.CJK_COMPATIBILITY || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || of == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || of == Character.UnicodeBlock.HANGUL_JAMO || of == Character.UnicodeBlock.HANGUL_SYLLABLES || of == Character.UnicodeBlock.HIRAGANA || of == Character.UnicodeBlock.KATAKANA || of == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500)))) {
                if (z2) {
                    arrayList.add(new String(charArray, i2, i - i2));
                }
                arrayList.add(new String(charArray, i, charCount));
            } else {
                if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                    if (!z || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                        if (z2) {
                            arrayList.add(new String(charArray, i2, i - i2));
                        }
                    }
                }
                i += charCount;
            }
            z2 = false;
            i += charCount;
        }
        if (z2) {
            arrayList.add(new String(charArray, i2, i - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}