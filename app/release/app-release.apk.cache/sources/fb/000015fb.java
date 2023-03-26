package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.p7700g.p99005.ax5;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class b1 implements InterfaceC0705Hl {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08;
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC1233ay A02;
    public final C0713Ht A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC0704Hk>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, Flags.CD, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, Flags.CD, 66, 69, 88, 95, 74, 69, 72, 78, Flags.CD, 94, 88, 78, 88, Flags.CD, 95, 67, 78, Flags.CD, 77, 68, 71, 79, 78, 89, 17, Flags.CD, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, ax5.a, 54, 115, 53, 50, 58, ax5.a, 54, 55, 28, 30, 28, 23, 26, 27, 32, 28, 16, 17, Flags.CD, 26, 17, Flags.CD, 32, 22, 17, 27, 26, 7, 81, 26, 7, 22};
    }

    public static void A07() {
        A08 = new String[]{"eH4syubUz2tR66H4aXOA", "1d5DSBS1mhWRL66KnLBZBpyHNgki7Rvu", "v9uLJ4dIwyz0Tb4FaO07wTfk2F9lBV8v", "E1Se3PKWItYNl2w7Z0lUvGDZb88eKAvD", "3tvSVqejLSP4DWhBG1hRQ7meIfhtlUpf", "obkGL38LbEEikSiwJ4pDHOfB9GOmWii2", "dwvV", "8LO"};
    }

    static {
        A07();
        A06();
        A09 = new HashSet<>();
    }

    public b1(File file, InterfaceC1233ay interfaceC1233ay) {
        this(file, interfaceC1233ay, null, false);
    }

    public b1(File file, InterfaceC1233ay interfaceC1233ay, C0713Ht c0713Ht) {
        if (A0E(file)) {
            this.A04 = file;
            this.A02 = interfaceC1233ay;
            this.A03 = c0713Ht;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new C0718Hy(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 108) + file);
    }

    public b1(File file, InterfaceC1233ay interfaceC1233ay, byte[] bArr, boolean z) {
        this(file, interfaceC1233ay, new C0713Ht(file, bArr, z));
    }

    private C1236b2 A00(String str, long j) throws C0703Hj {
        C1236b2 A072;
        C0712Hs A0A = this.A03.A0A(str);
        if (A0A == null) {
            return C1236b2.A02(str, j);
        }
        while (true) {
            A072 = A0A.A07(j);
            if (!A072.A05 || A072.A03.exists()) {
                break;
            }
            A05();
        }
        return A072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    /* renamed from: A01 */
    public final synchronized C1236b2 ADL(String str, long j) throws InterruptedException, C0703Hj {
        C1236b2 ADM;
        while (true) {
            ADM = ADM(str, j);
            if (ADM == null) {
                wait();
            }
        }
        return ADM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    /* renamed from: A02 */
    public final synchronized C1236b2 ADM(String str, long j) throws C0703Hj {
        boolean z = this.A01;
        if (A08[0].length() != 10) {
            String[] strArr = A08;
            strArr[3] = "i1JHZi6uUAd1FxW2ulRZEzuIvuRnbT2M";
            strArr[3] = "i1JHZi6uUAd1FxW2ulRZEzuIvuRnbT2M";
            I1.A04(!z);
            C1236b2 A00 = A00(str, j);
            if (A00.A05) {
                C1236b2 A082 = this.A03.A0A(str).A08(A00);
                A0D(A00, A082);
                return A082;
            }
            C0712Hs A0B = this.A03.A0B(str);
            if (!A0B.A0E()) {
                A0B.A0C(true);
                return A00;
            }
            return null;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0F();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 56))) {
                C1236b2 span = file.length() > 0 ? C1236b2.A00(file, this.A03) : null;
                if (span != null) {
                    A0B(span);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0G();
        try {
            this.A03.A0H();
        } catch (C0703Hj e) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e);
        }
    }

    private void A05() throws C0703Hj {
        ArrayList arrayList = new ArrayList();
        for (C0712Hs cachedContent : this.A03.A0E()) {
            Iterator<C1236b2> it = cachedContent.A09().iterator();
            while (it.hasNext()) {
                C1236b2 next = it.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            A09((C0709Hp) arrayList.get(i), false);
        }
        this.A03.A0G();
        this.A03.A0H();
    }

    private void A08(C0709Hp c0709Hp) {
        ArrayList<InterfaceC0704Hk> arrayList = this.A05.get(c0709Hp.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).AAz(this, c0709Hp);
            }
        }
        this.A02.AAz(this, c0709Hp);
    }

    private void A09(C0709Hp c0709Hp, boolean z) throws C0703Hj {
        C0712Hs A0A = this.A03.A0A(c0709Hp.A04);
        if (A0A == null || !A0A.A0F(c0709Hp)) {
            return;
        }
        this.A00 -= c0709Hp.A01;
        if (z) {
            try {
                this.A03.A0I(A0A.A03);
                this.A03.A0H();
            } finally {
                A08(c0709Hp);
            }
        }
    }

    private void A0B(C1236b2 c1236b2) {
        this.A03.A0B(c1236b2.A04).A0A(c1236b2);
        this.A00 += c1236b2.A01;
        A0C(c1236b2);
    }

    private void A0C(C1236b2 c1236b2) {
        ArrayList<InterfaceC0704Hk> arrayList = this.A05.get(c1236b2.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).AAy(this, c1236b2);
            }
        }
        this.A02.AAy(this, c1236b2);
    }

    private void A0D(C1236b2 c1236b2, C0709Hp c0709Hp) {
        ArrayList<InterfaceC0704Hk> arrayList = this.A05.get(c1236b2.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).AB0(this, c1236b2, c0709Hp);
            }
        }
        this.A02.AB0(this, c1236b2, c0709Hp);
    }

    public static synchronized boolean A0E(File file) {
        synchronized (b1.class) {
            if (A06) {
                return true;
            }
            boolean add = A09.add(file.getAbsoluteFile());
            if (A08[3].charAt(1) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[4] = "IKpjWyjLYfQpiBWntIG6MWMycmL9Fi0T";
            strArr[1] = "4yvCWPfRVkN5zdYzJ7yblhOZllwt9yTn";
            return add;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized void A3Q(String str, C0717Hx c0717Hx) throws C0703Hj {
        I1.A04(!this.A01);
        this.A03.A0J(str, c0717Hx);
        this.A03.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized void A44(File file) throws C0703Hj {
        I1.A04(!this.A01);
        C1236b2 A00 = C1236b2.A00(file, this.A03);
        I1.A04(A00 != null);
        C0712Hs A0A = this.A03.A0A(A00.A04);
        I1.A01(A0A);
        I1.A04(A0A.A0E());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = C0716Hw.A00(A0A.A06());
            if (A002 != -1) {
                long j = A00.A02;
                long length = A00.A01;
                I1.A04(j + length <= A002);
            }
            A0B(A00);
            this.A03.A0H();
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized long A5Z() {
        I1.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized long A5a(String str, long j, long j2) {
        C0712Hs A0A;
        I1.A04(!this.A01);
        A0A = this.A03.A0A(str);
        return A0A != null ? A0A.A05(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    @NonNull
    public final synchronized NavigableSet<C0709Hp> A5b(String str) {
        C0712Hs A0A;
        I1.A04(!this.A01);
        A0A = this.A03.A0A(str);
        return (A0A == null || A0A.A0D()) ? new TreeSet() : new TreeSet((Collection) A0A.A09());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized long A5m(String str) {
        return C0716Hw.A00(A5n(str));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized InterfaceC0715Hv A5n(String str) {
        I1.A04(!this.A01);
        return this.A03.A0C(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized void ACH(C0709Hp c0709Hp) {
        I1.A04(!this.A01);
        C0712Hs A0A = this.A03.A0A(c0709Hp.A04);
        I1.A01(A0A);
        I1.A04(A0A.A0E());
        A0A.A0C(false);
        this.A03.A0I(A0A.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized void ACO(C0709Hp c0709Hp) throws C0703Hj {
        I1.A04(!this.A01);
        A09(c0709Hp, true);
        if (A08[0].length() == 10) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "mDPrx6EC7JunlTiRZIITWuDkOY6RMx2Q";
        strArr[2] = "mDPrx6EC7JunlTiRZIITWuDkOY6RMx2Q";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized void ACu(String str, long j) throws C0703Hj {
        C0717Hx c0717Hx = new C0717Hx();
        C0716Hw.A05(c0717Hx, j);
        A3Q(str, c0717Hx);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0705Hl
    public final synchronized File ADJ(String str, long j, long j2) throws C0703Hj {
        C0712Hs A0A;
        I1.A04(!this.A01);
        A0A = this.A03.A0A(str);
        I1.A01(A0A);
        I1.A04(A0A.A0E());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.AB1(this, str, j, j2);
        return C1236b2.A04(this.A04, A0A.A02, j, System.currentTimeMillis());
    }
}