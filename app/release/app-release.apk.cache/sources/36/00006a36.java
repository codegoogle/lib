package com.p7700g.p99005;

import android.text.TextUtils;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringUtils.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/zz2;", "", "", "input", "b", "(Ljava/lang/String;)Ljava/lang/String;", "clazz", "a", "(Ljava/lang/Object;)Ljava/lang/String;", "value", "", "c", "(Ljava/lang/String;)I", "Ljava/lang/String;", "TAG", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class zz2 {
    @NotNull
    public static final zz2 a = new zz2();
    @NotNull
    private static final String b = "StrUtls";

    private zz2() {
    }

    @jz4
    @NotNull
    public static final String a(@NotNull Object obj) {
        String name;
        c25.p(obj, "clazz");
        Package r7 = obj.getClass().getPackage();
        if (r7 == null || (name = r7.getName()) == null) {
            name = "";
        }
        if (TextUtils.isEmpty(name)) {
            return "";
        }
        if (c95.V2(name, CryptoConstants.ALIAS_SEPARATOR, false, 2, null)) {
            String substring = name.substring(c95.F3(name, CryptoConstants.ALIAS_SEPARATOR, 0, false, 6, null) + 1, name.length());
            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return name;
    }

    @jz4
    @NotNull
    public static final String b(@NotNull String str) {
        c25.p(str, "input");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(f85.b);
            c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
            String bigInteger = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = c25.C("0", bigInteger);
            }
            c25.o(bigInteger, "md5");
            return bigInteger;
        } catch (NoSuchAlgorithmException e) {
            xz2.c(b, c25.C("[ERROR] MD5 algo not found", e.getMessage()));
            return String.valueOf(str.hashCode());
        } catch (Exception unused) {
            xz2.c(b, "[ERROR] Exception in generating MD5 Hash");
            return String.valueOf(str.hashCode());
        }
    }

    @jz4
    public static final int c(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            xz2.b(b, "cannot convert number to int", e);
            return 0;
        }
    }
}