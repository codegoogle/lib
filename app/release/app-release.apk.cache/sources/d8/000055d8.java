package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pa3 {
    @NotNull
    public static final pa3 a = new pa3();

    /* loaded from: classes3.dex */
    public enum a {
        UII("uii"),
        EXTERNAL("external");
        
        @NotNull
        private final String v;

        a(String str) {
            this.v = str;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.v;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        UNIT("unit"),
        UII("uii");
        
        @NotNull
        private final String v;

        b(String str) {
            this.v = str;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.v;
        }
    }

    private pa3() {
    }
}