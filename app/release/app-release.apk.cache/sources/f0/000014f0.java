package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.We  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1077We implements C0M {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ C1081Wi A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            strArr[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, Flags.CD, 9};
    }

    public static void A02() {
        A02 = new String[]{"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    }

    public C1077We(C1081Wi c1081Wi) {
        this.A00 = c1081Wi;
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void A7w(Throwable th) {
        this.A00.A04().A82(A00(0, 5, 0), C04848i.A1K, new C04858j(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void A85(Throwable th) {
        this.A00.A04().A82(A00(0, 5, 0), C04848i.A1M, new C04858j(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void AC6(String str, int i, @Nullable String str2, @Nullable Integer num, @Nullable Long l, AnonymousClass06 anonymousClass06) {
        C7K.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i, str2, num, l, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void AC7(String str, boolean z, AnonymousClass06 anonymousClass06) {
        C7K.A04(this.A00, new C7J(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z);
    }
}