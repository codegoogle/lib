package com.p7700g.p99005;

import java.io.Serializable;

/* compiled from: FunInterfaceConstructorReference.java */
@tp4(version = "1.7")
/* loaded from: classes3.dex */
public class t15 extends x15 implements Serializable {
    private final Class B;

    public t15(Class cls) {
        super(1);
        this.B = cls;
    }

    @Override // com.p7700g.p99005.x15, com.p7700g.p99005.i15
    /* renamed from: J4 */
    public z55 H4() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // com.p7700g.p99005.x15
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t15) {
            return this.B.equals(((t15) obj).B);
        }
        return false;
    }

    @Override // com.p7700g.p99005.x15
    public int hashCode() {
        return this.B.hashCode();
    }

    @Override // com.p7700g.p99005.x15
    public String toString() {
        StringBuilder G = wo1.G("fun interface ");
        G.append(this.B.getName());
        return G.toString();
    }
}