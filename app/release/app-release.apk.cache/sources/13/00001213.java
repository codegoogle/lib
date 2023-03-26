package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Kj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0777Kj {
    public static String[] A00;
    public static final AtomicReference<InterfaceC0776Ki> A01;

    public static void A01() {
        A00 = new String[]{"XnOcKNlJJ8CDQQR", "VGhv6FkZrITxQRu9gbMUemqcetkh7B5f", "vVz2BTpV32jHfI", "d8hV", "Sy49NQqrKXgvTEWwSBtXX6HecYQBIBGU", "Db46iG0BOxvexN4G9aNEWNZ9mU0XJx13", "mKukGrwwCcIhJco4KmzrvmgYUSCtT5hL", "T8hiTRn5Amgadg81lccjSSIUWb1StHzV"};
    }

    static {
        A01();
        A01 = new AtomicReference<>(null);
    }

    public static InterfaceC0776Ki A00() {
        InterfaceC0776Ki interfaceC0776Ki = A01.get();
        if (A00[5].charAt(26) != '0') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[7] = "JAkiPTeS8Sgp4wJmZ2cE1Xuhf0WoAHfE";
        strArr[4] = "TWyum6rZOmg61QmMcVNeRxvFtffIUfDC";
        if (interfaceC0776Ki == null) {
            InterfaceC0776Ki errorLogger = new C1201aS();
            return errorLogger;
        }
        return interfaceC0776Ki;
    }

    public static void A02(InterfaceC0776Ki interfaceC0776Ki) {
        A01.set(interfaceC0776Ki);
    }
}