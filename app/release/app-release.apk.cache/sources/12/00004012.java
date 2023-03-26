package com.p7700g.p99005;

import com.p7700g.p99005.f83;
import com.p7700g.p99005.t23;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class e83 extends f83 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e83(@NotNull f83.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    public void w(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        xz2.c(cz2.c(this), c25.C("Ad Opened: ", s()));
        for (x83 x83Var : k()) {
            yq4 yq4Var = null;
            w83 w83Var = x83Var instanceof w83 ? (w83) x83Var : null;
            if (w83Var != null) {
                w83Var.a(bVar);
                yq4Var = yq4.a;
            }
            if (yq4Var == null) {
                String c = cz2.c(this);
                StringBuilder G = wo1.G("This ad with sessionId ");
                G.append((Object) n().B());
                G.append(" was already loaded in another Native/Banner adview. Get in touch with your account manager to resolve the issue.");
                xz2.d(c, G.toString());
            }
        }
    }

    public void x(@NotNull String str) {
        c25.p(str, "error");
        xz2.d(cz2.c(this), c25.C("Failed to show fullscreen ad ", str));
        for (x83 x83Var : k()) {
            yq4 yq4Var = null;
            w83 w83Var = x83Var instanceof w83 ? (w83) x83Var : null;
            if (w83Var != null) {
                w83Var.c();
                yq4Var = yq4.a;
            }
            if (yq4Var == null) {
                String c = cz2.c(this);
                StringBuilder G = wo1.G("This ad with sessionId ");
                G.append((Object) n().B());
                G.append(" was already loaded in another Native/Banner adview. Get in touch with your account manager to resolve the issue.");
                xz2.d(c, G.toString());
            }
        }
    }

    public void y(@NotNull t23.b bVar) {
        c25.p(bVar, "launchMode");
        xz2.c(cz2.c(this), c25.C("Ad Closed: ", s()));
        for (x83 x83Var : k()) {
            yq4 yq4Var = null;
            w83 w83Var = x83Var instanceof w83 ? (w83) x83Var : null;
            if (w83Var != null) {
                w83Var.c(bVar);
                yq4Var = yq4.a;
            }
            if (yq4Var == null) {
                String c = cz2.c(this);
                StringBuilder G = wo1.G("This ad with sessionId ");
                G.append((Object) n().B());
                G.append(" was already loaded in another Native/Banner adview. Get in touch with your account manager to resolve the issue.");
                xz2.d(c, G.toString());
            }
        }
    }
}