package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import javax.annotation.Nullable;

@SuppressLint({"StringFormatUse", "SharedPreferencesUse"})
/* renamed from: com.facebook.ads.redexgen.X.72  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass72 {
    public static AnonymousClass72 A01;
    public static byte[] A02;
    public static String[] A03;
    public final HashMap<Integer, String> A00 = new HashMap<>();

    static {
        A04();
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{103, 114, 116, -70};
    }

    public static void A04() {
        A03 = new String[]{"rLDjBgKz63Bn2bjdq5T9imrieVp5PIBM", "m8wp0Vw9GL6Om21Qq8m8Tj5zfu0l", "YgqNWwRBt3ccTC8L8vt9EnrOaTNX", "Ji4mlDElrKKLO0fU8k8hI0n9H2FXwyxW", "wf5MYK5ehGzLy7SkBsWbSYGwiXhb8bxZ", "VWIuBm7xkqaJ1AqGCIKfvhlqUEnKMMIs", "Q1uyQO5SpdafJkDIvdpZDIFmVDRWB0Ou", "30w5jfTvH5e90EUSXrOKs1RMT2PDXB24"};
    }

    @SuppressLint({"CatchGeneralException"})
    public AnonymousClass72(Context context, EnumC04456m enumC04456m, @Nullable String str) {
        try {
            A05(context);
            if (enumC04456m.A05() == EnumC04456m.A0G.A05()) {
                A06(context, str);
            }
        } catch (Throwable th) {
            C6B.A04(th);
        }
    }

    public static AnonymousClass72 A00(Context context, EnumC04456m enumC04456m, @Nullable String str) {
        if (A01 == null) {
            A01 = new AnonymousClass72(context, enumC04456m, str);
        }
        return A01;
    }

    public static String A02(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format(A01(0, 4, 62), Byte.valueOf(bArr[i])));
        }
        String sb2 = sb.toString();
        String[] strArr = A03;
        if (strArr[5].charAt(8) != strArr[6].charAt(8)) {
            String[] strArr2 = A03;
            strArr2[0] = "YeSBMNELIt08AqlHIfsrA8EpBPFL6cGm";
            strArr2[0] = "YeSBMNELIt08AqlHIfsrA8EpBPFL6cGm";
            return sb2;
        }
        throw new RuntimeException();
    }

    private void A05(Context context) throws Exception {
        int read;
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir)), 1024);
            MessageDigest messageDigest = MessageDigest.getInstance(AnonymousClass75.A04.A03());
            MessageDigest messageDigest2 = MessageDigest.getInstance(AnonymousClass75.A05.A03());
            MessageDigest messageDigest3 = MessageDigest.getInstance(AnonymousClass75.A06.A03());
            byte[] bArr = new byte[1024];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                    messageDigest2.update(bArr, 0, read);
                    messageDigest3.update(bArr, 0, read);
                }
                if (A03[7].charAt(26) != 'P') {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[7] = "sHaOy6LtIlfUQKDjNh2L68IGHQPvVrDu";
                strArr[7] = "sHaOy6LtIlfUQKDjNh2L68IGHQPvVrDu";
            } while (read != -1);
            HashMap<Integer, String> hashMap = this.A00;
            byte[] buffer = messageDigest.digest();
            hashMap.put(10003, A02(buffer));
            HashMap<Integer, String> hashMap2 = this.A00;
            byte[] buffer2 = messageDigest2.digest();
            hashMap2.put(10004, A02(buffer2));
            HashMap<Integer, String> hashMap3 = this.A00;
            byte[] buffer3 = messageDigest3.digest();
            hashMap3.put(10005, A02(buffer3));
            bufferedInputStream.close();
        } catch (Throwable th) {
            String[] strArr2 = A03;
            if (strArr2[4].charAt(30) != strArr2[3].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A03;
            strArr3[5] = "XS9zpWe4kggJPLQjl3jzxSvjjqaK1CvG";
            strArr3[6] = "1gkHVsehFegipbXpJD0YhFUDmEZYz3Bw";
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    private void A06(Context context, @Nullable String str) throws Throwable {
        int read;
        if (str == null || str.isEmpty()) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AnonymousClass75.A04.A03());
            byte[] bArr = new byte[1024];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            HashMap<Integer, String> hashMap = this.A00;
            byte[] buffer = messageDigest.digest();
            hashMap.put(10010, A02(buffer));
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Nullable
    public final String A07(int i) {
        String str = this.A00.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        return null;
    }
}