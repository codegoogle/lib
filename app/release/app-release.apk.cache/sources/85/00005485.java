package com.p7700g.p99005;

import com.p7700g.p99005.jm3;

/* compiled from: OSInAppMessagePushPrompt.java */
/* loaded from: classes3.dex */
public class ok3 extends nk3 {
    public static final String b = "push";

    public static /* synthetic */ void e(jm3.c1 c1Var, boolean z) {
        jm3.j1 j1Var;
        if (z) {
            j1Var = jm3.j1.PERMISSION_GRANTED;
        } else {
            j1Var = jm3.j1.PERMISSION_DENIED;
        }
        c1Var.a(j1Var);
    }

    @Override // com.p7700g.p99005.nk3
    public String a() {
        return b;
    }

    @Override // com.p7700g.p99005.nk3
    public void b(final jm3.c1 c1Var) {
        jm3.W1(true, new jm3.k1() { // from class: com.p7700g.p99005.ei3
            @Override // com.p7700g.p99005.jm3.k1
            public final void a(boolean z) {
                ok3.e(jm3.c1.this, z);
            }
        });
    }
}