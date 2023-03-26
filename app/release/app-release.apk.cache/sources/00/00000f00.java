package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.dynview.a.a;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.7I  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7I {
    public static byte[] A02;
    public static String[] A03;
    public static final String A04;
    public static volatile C7I A05;
    public final C1081Wi A00;
    public final Map<String, C7E> A01 = Collections.synchronizedMap(new HashMap());

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, 27, 57, 59, 48, 61, 120, 61, bx.W5, bx.W5, 55, bx.W5, 118, 120, 26, 49, 44, 53, 57, 40, 120, 49, 43, 120, 54, 45, 52, 52, 118, 98, 69, 77, 72, 65, 64, 4, 80, 75, 4, 71, 75, 84, 93, 4, 72, 75, 71, 69, 72, 4, 77, 73, 69, 67, 65, 4, 77, 74, 80, 75, 4, 71, 69, 71, 76, 65, 4, 12, 81, 86, 72, 25, bx.W5, 17, 30, 29, 19, 26, 95, Flags.CD, 16, 95, 8, 13, 22, Flags.CD, 26, 95, 29, 22, Flags.CD, 18, 30, 15, 95, Flags.CD, 16, 95, 25, 22, 19, 26, 95, 87, 10, 13, 19, 66, 53, 14, 1, 2, 12, 5, 64, 20, 15, 64, 23, 18, 9, 20, 5, 64, 2, 9, 20, 13, 1, 16, 64, 20, 15, 64, 15, 21, 20, 16, 21, 20, 64, 19, 20, 18, 5, 1, 13, 100, 118, 118, 96, 113, ax5.a, bx.W5, bx.W5, bx.W5, 121, 118, 115, 122, 37, 48, 48, 48, 52, 56, 62, 60, 78, 77, 67, 70, 7, 28, 25, 28, 29, 5, 28};
    }

    public static void A09() {
        A03 = new String[]{"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", bx.B4, "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    }

    static {
        A09();
        A08();
        A04 = C7I.class.getSimpleName();
    }

    public C7I(C1081Wi c1081Wi) {
        this.A00 = c1081Wi;
    }

    private int A00(String str, @Nullable Bitmap bitmap) {
        String A07 = A07(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File cacheDir = this.A00.getCacheDir();
        File file = new File(cacheDir, str.hashCode() + A07(2, 4, 85));
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            int size2 = J8.A0D(this.A00);
            if (size >= size2) {
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (FileNotFoundException e) {
            String str2 = A04;
            Log.e(str2, A07(6, 29, 95) + file.getPath() + A07, e);
            A0B(e);
            return 0;
        } catch (IOException e2) {
            A0B(e2);
            String str3 = A04;
            Log.e(str3, A07(106, 36, 38) + str + A07, e2);
            return 0;
        } catch (OutOfMemoryError e3) {
            A0B(e3);
            Log.e(A04, A07(WKSRecord.Service.BL_IDM, 39, 57), e3);
            return 0;
        } finally {
            A0A(byteArrayOutputStream);
            A0A(fileOutputStream);
        }
    }

    @Nullable
    private final Bitmap A01(C8H c8h, C7E c7e, int i, int i2, String str) {
        if (C7K.A06(c8h) && A07(a.n, 4, 123).equals(str)) {
            Map<String, C7E> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "FHlvPh";
            strArr[1] = "FHlvPh";
            map.put(c7e.A07, c7e);
        }
        String str2 = c7e.A07;
        C7J c7j = new C7J(c7e.A05, c7e.A06, A07(197, 5, 0), str, str2);
        File cacheDir = this.A00.getCacheDir();
        File file = new File(cacheDir, str2.hashCode() + A07(2, 4, 85));
        if (!file.exists()) {
            C7K.A04(c8h, c7j, false);
            return str2.startsWith(A07(190, 7, 70)) ? A04(str2, i2, i) : A02(c8h, c7e, str);
        }
        C7K.A04(c8h, c7j, true);
        try {
            if (A0C(i2, i)) {
                return C7L.A02(file.getCanonicalPath(), i2, i, this.A00);
            }
            return BitmapFactory.decodeFile(file.getCanonicalPath());
        } catch (IOException e) {
            A0B(e);
            return null;
        }
    }

    @Nullable
    private Bitmap A02(C8H c8h, C7E c7e, String str) {
        Bitmap A032;
        String failureReason = c7e.A07;
        int i = c7e.A03;
        int i2 = c7e.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e = null;
        if (failureReason.startsWith(A07(181, 9, 92))) {
            try {
                try {
                    try {
                        InputStream open = this.A00.getAssets().open(failureReason.substring(9));
                        if (A0C(i, i2)) {
                            A032 = C7L.A01(open, i, i2);
                        } else {
                            A032 = BitmapFactory.decodeStream(open);
                        }
                        if (open != null) {
                            A0A(open);
                        }
                    } catch (IOException e2) {
                        A0B(e2);
                        if (0 != 0) {
                            A0A(null);
                        }
                        return null;
                    }
                } catch (OutOfMemoryError e3) {
                    A0B(e3);
                    if (0 != 0) {
                        A0A(null);
                    }
                    return null;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    A0A(null);
                }
                throw th;
            }
        } else if (A0C(i, i2)) {
            try {
                A032 = A05(failureReason, i, i2);
            } catch (IOException e4) {
                e = e4;
                A0B(e);
                A032 = A03(failureReason);
            }
            int height = A03[2].length();
            if (height == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            strArr[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
        } else {
            A032 = A03(failureReason);
        }
        String th2 = e != null ? e.toString() : null;
        if (A032 == null) {
            C7K.A03(c8h, c7e, str, C7K.A03, th2, null, null);
        } else {
            int A00 = A00(failureReason, A032);
            long requestTime = System.currentTimeMillis();
            long loadTime = requestTime - currentTimeMillis;
            if (A00 > 0) {
                C7K.A03(c8h, c7e, str, C7K.A02, th2, Integer.valueOf(A00), Long.valueOf(loadTime));
            } else {
                int i3 = C7K.A01;
                String[] strArr2 = A03;
                String str2 = strArr2[0];
                String str3 = strArr2[6];
                int storedSize = str2.charAt(0);
                if (storedSize != str3.charAt(0)) {
                    C7K.A03(c8h, c7e, str, i3, th2, null, null);
                } else {
                    String[] strArr3 = A03;
                    strArr3[1] = "v696HPT8k3klpjO3N";
                    strArr3[1] = "v696HPT8k3klpjO3N";
                    C7K.A03(c8h, c7e, str, i3, th2, null, null);
                }
            }
        }
        return A032;
    }

    @Nullable
    private Bitmap A03(String str) {
        byte[] A5T;
        InterfaceC0905Pl ABc = Q4.A00(this.A00).ABc(str, new Q0());
        if (ABc != null && (A5T = ABc.A5T()) != null) {
            return BitmapFactory.decodeByteArray(A5T, 0, A5T.length);
        }
        return null;
    }

    @Nullable
    private Bitmap A04(String str, int i, int i2) {
        Bitmap A022;
        try {
            boolean A0C = A0C(i, i2);
            String A07 = A07(190, 7, 70);
            if (!A0C) {
                A022 = BitmapFactory.decodeStream(new FileInputStream(str.substring(A07.length())), null, null);
            } else {
                A022 = C7L.A02(str.substring(A07.length()), i, i2, this.A00);
            }
            A00(str, A022);
            return A022;
        } catch (IOException e) {
            String str2 = A04;
            Log.e(str2, A07(63, 43, 125) + str + A07(0, 2, 17), e);
            return null;
        }
    }

    @Nullable
    private Bitmap A05(String str, int i, int i2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap A01 = C7L.A01(inputStream, i, i2);
        A0A(inputStream);
        return A01;
    }

    public static C7I A06(C1081Wi c1081Wi) {
        if (A05 == null) {
            synchronized (C7I.class) {
                if (A05 == null) {
                    A05 = new C7I(c1081Wi);
                }
            }
        }
        return A05;
    }

    public static void A0A(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(@Nullable Throwable th) {
        String A07 = A07(197, 5, 0);
        if (th != null) {
            this.A00.A04().A82(A07, C04848i.A1L, new C04858j(th));
        } else {
            this.A00.A04().A82(A07, C04848i.A1L, new C04858j(A07(35, 28, 1)));
        }
    }

    private boolean A0C(int i, int i2) {
        return i > 0 && i2 > 0 && J8.A0t(this.A00);
    }

    @Nullable
    public final Bitmap A0D(C7E c7e) {
        return A01(this.A00, c7e, c7e.A04, c7e.A03, c7e.A01);
    }

    @Nullable
    public final Bitmap A0E(C8H c8h, String str, int i, int i2, String str2) {
        C7E c7e = this.A01.get(str);
        return (!C7K.A06(c8h) || c7e == null) ? A01(c8h, new C7E(str, i, i2, A07(206, 7, 43), A07(206, 7, 43)), i2, i, str2) : A01(c8h, c7e, i2, i, str2);
    }

    public final String A0F(String str) {
        File cacheDir = this.A00.getCacheDir();
        File file = new File(cacheDir, str.hashCode() + A07(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}