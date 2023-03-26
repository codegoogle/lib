package com.p7700g.p99005;

/* compiled from: AddressParseData.java */
/* loaded from: classes3.dex */
public class p64 extends k64 {
    private static final long B0 = 4;
    private boolean C0;
    private boolean D0;
    private a E0;

    /* compiled from: AddressParseData.java */
    /* loaded from: classes3.dex */
    public enum a {
        DASHED('-'),
        COLON_DELIMITED(':'),
        DOTTED('.'),
        SPACE_DELIMITED(gl4.R);
        
        private char x;

        a(char c) {
            this.x = c;
        }

        public char f() {
            return this.x;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder G = wo1.G("mac format:");
            wo1.d0(G, super.toString(), '\n', "segment separator:");
            G.append(this.x);
            G.append('\n');
            return G.toString();
        }
    }

    public p64(CharSequence charSequence) {
        super(charSequence);
    }

    public k64 i3() {
        return this;
    }

    public a j3() {
        return this.E0;
    }

    public boolean k3() {
        return this.C0;
    }

    public boolean n3() {
        return this.D0;
    }

    public void p3(boolean z) {
        this.C0 = z;
    }

    public void t3(boolean z) {
        this.D0 = z;
    }

    @Override // com.p7700g.p99005.k64
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(i3());
        if (k3()) {
            sb.append("is double segment");
            sb.append('\n');
        }
        sb.append("bit length:");
        sb.append(n3() ? 64 : 48);
        sb.append('\n');
        a j3 = j3();
        if (j3 != null) {
            sb.append(j3);
        }
        return sb.toString();
    }

    public void w3(a aVar) {
        this.E0 = aVar;
    }
}