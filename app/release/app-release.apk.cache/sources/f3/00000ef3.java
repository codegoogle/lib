package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A04 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.75  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass75 {
    public static byte[] A01;
    public static String[] A02;
    public static final /* synthetic */ AnonymousClass75[] A03;
    public static final AnonymousClass75 A04;
    public static final AnonymousClass75 A05;
    public static final AnonymousClass75 A06;
    public String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[0].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "";
            strArr[1] = "";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{61, 52, 69, 81, 74, 67, 47, 51, 49, bx.W5, 35, 79, 80, 87, 84, 36, ax5.a, 54, 70, 25, 2, Flags.CD, 120, g15.c, 124};
    }

    public static void A02() {
        A02 = new String[]{"fU4XiUh", "4ASLCGhodwv3fY7yqE", "BFhkWaiQLcBXUQO4Yi7KFwSjCE1nMNEL", "IBfibZ8IWoONy44J9jH8jZ0p3ibNlB3T", "FmTm3wR2K52Lz7zbwKhVmki4cB", "JxTEYV1Vluo7DhPyeTARHiExSqxbiuYf", "t7Mb3YBBhyhswQ5hXIhgNczDQ93Q9bzO", "oX4F1jUgCDnefIZx9v8TRjWfCJBhCFOT"};
    }

    static {
        A02();
        A01();
        A06 = new AnonymousClass75(A00(19, 6, 91), 0, A00(8, 7, 115));
        A05 = new AnonymousClass75(A00(15, 4, 102), 1, A00(3, 5, 19));
        String A00 = A00(0, 3, 97);
        A04 = new AnonymousClass75(A00, 2, A00);
        A03 = new AnonymousClass75[]{A06, A05, A04};
    }

    public AnonymousClass75(String str, int i, String str2) {
        this.A00 = str2;
    }

    public final String A03() {
        return this.A00;
    }

    public static AnonymousClass75 valueOf(String str) {
        return (AnonymousClass75) Enum.valueOf(AnonymousClass75.class, str);
    }

    public static AnonymousClass75[] values() {
        return (AnonymousClass75[]) A03.clone();
    }
}