package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class G7 extends AsyncTask<AbstractC0918Py, Void, InterfaceC0905Pl> implements InterfaceC0915Pv {
    public static byte[] A04;
    public static String[] A05;
    public InterfaceC0907Pn A00;
    public G2 A01;
    public Exception A02;
    public Executor A03;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, -2, Flags.CD, 29, 21, -54, 30, Flags.CD, 21, 15, 29, -54, 15, 34, Flags.CD, 13, 30, 22, 35, -54, 25, 24, 15, -54, Flags.CD, 28, 17, 31, 23, 15, 24, 30, -54, 25, 16, -54, 30, 35, 26, 15, -54, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, 15, 27, 27, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, bx.l7, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public static void A03() {
        A05 = new String[]{"ISBjHjbUPhJT7DGB2JvjH8pRJ4THrNWM", "OPg7gsPnZP3QsQWue6lzrISH1J86h", "XeTxlXzdRCOD7SBCy0O7kO4k", "wF1PTlVBDnka4lPn0WIHxf3evs", "myOhX4xCY5Mi9IbsU0pUOVW5bZkAtWyQ", "1AepsAli0TWWKf1w83zMf6wttDUWZa9Z", "XTBsgsEzxuO7TTQvYMtR1VxTZpUl2a6R", "C8VCTESPpZtI8Zr0pzMJK5rADprlDNCz"};
    }

    public G7(G2 g2, InterfaceC0907Pn interfaceC0907Pn, Executor executor) {
        this.A01 = g2;
        this.A00 = interfaceC0907Pn;
        this.A03 = executor;
    }

    private final InterfaceC0905Pl A00(AbstractC0918Py... abstractC0918PyArr) {
        if (KU.A02(this)) {
            return null;
        }
        try {
            if (abstractC0918PyArr != null) {
                try {
                    if (abstractC0918PyArr.length > 0) {
                        InterfaceC0905Pl A0J = this.A01.A0J(abstractC0918PyArr[0]);
                        if (A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(A0J.A74()), A0J.getUrl(), A0J.A5U());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e) {
                    this.A02 = e;
                    String.format(Locale.US, A01(64, 23, 98), e.getMessage());
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            KU.A00(th, this);
            String[] strArr = A05;
            if (strArr[6].charAt(29) != strArr[5].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "7Z9SEUfEEdRKQwGPWQmPRdvkxtWIqa6k";
            strArr2[5] = "25jJFjyuRcytvXC4wurkJewgVtIZaaql";
            return null;
        }
    }

    private final void A04(InterfaceC0905Pl interfaceC0905Pl) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A9C(interfaceC0905Pl);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0915Pv
    public final void A4z(AbstractC0918Py abstractC0918Py) {
        super.executeOnExecutor(this.A03, abstractC0918Py);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC0905Pl doInBackground(AbstractC0918Py[] abstractC0918PyArr) {
        if (KU.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC0918PyArr);
        } catch (Throwable th) {
            KU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.A9Y(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC0905Pl interfaceC0905Pl) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(interfaceC0905Pl);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}