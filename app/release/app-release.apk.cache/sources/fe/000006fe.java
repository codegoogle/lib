package com.anythink.core.common;

import com.anythink.core.api.AdError;
import com.anythink.core.common.g.a.b;
import com.p7700g.p99005.wo1;
import java.util.List;

/* loaded from: classes2.dex */
public class s {
    private static s c;
    private String b = s.class.getSimpleName();
    public int a = 0;

    private s() {
    }

    public final synchronized void b() {
        if (this.a == 0) {
            List<com.anythink.core.common.e.o> c2 = com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.m.a().e())).c();
            if (c2 != null && c2.size() > 0) {
                this.a = c2.size();
                com.anythink.core.common.j.e.d(this.b, "neet to send request count:" + this.a);
                for (final com.anythink.core.common.e.o oVar : c2) {
                    if (System.currentTimeMillis() - oVar.f >= 604800000) {
                        this.a--;
                        com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.m.a().e())).b(oVar);
                    } else if (oVar.b == 3) {
                        new com.anythink.core.common.g.a.d(oVar.e).a(new b.a() { // from class: com.anythink.core.common.s.1
                            @Override // com.anythink.core.common.g.a.b.a
                            public final void a(Object obj) {
                                com.anythink.core.common.j.e.d(s.this.b, "re-send tk success....");
                                com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.m.a().e())).b(oVar);
                                s sVar = s.this;
                                sVar.a--;
                            }

                            @Override // com.anythink.core.common.g.a.b.a
                            public final void a(Throwable th) {
                                String str = s.this.b;
                                com.anythink.core.common.j.e.d(str, "re-send tk fail....:" + th.getMessage());
                                s sVar = s.this;
                                sVar.a = sVar.a + (-1);
                            }
                        });
                    } else {
                        final com.anythink.core.common.g.j jVar = new com.anythink.core.common.g.j(oVar);
                        jVar.a(0, new com.anythink.core.common.g.h() { // from class: com.anythink.core.common.s.2
                            @Override // com.anythink.core.common.g.h
                            public final void onLoadCanceled(int i) {
                                s sVar = s.this;
                                sVar.a--;
                            }

                            @Override // com.anythink.core.common.g.h
                            public final void onLoadError(int i, String str, AdError adError) {
                                String str2 = s.this.b;
                                StringBuilder sb = new StringBuilder("re-send tk fail....:");
                                if (str == null) {
                                    str = "";
                                }
                                sb.append(str);
                                com.anythink.core.common.j.e.d(str2, sb.toString());
                                s sVar = s.this;
                                sVar.a--;
                            }

                            @Override // com.anythink.core.common.g.h
                            public final void onLoadFinish(int i, Object obj) {
                                com.anythink.core.common.j.e.d(s.this.b, "re-send tk success....");
                                com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.m.a().e())).b(jVar.q());
                                s sVar = s.this;
                                sVar.a--;
                            }

                            @Override // com.anythink.core.common.g.h
                            public final void onLoadStart(int i) {
                            }
                        });
                    }
                }
                return;
            }
            com.anythink.core.common.j.e.d(this.b, "neet to send request count:0");
        }
    }

    public static synchronized s a() {
        s sVar;
        synchronized (s.class) {
            if (c == null) {
                c = new s();
            }
            sVar = c;
        }
        return sVar;
    }

    public final void a(int i, String str, String str2, String str3) {
        com.anythink.core.common.e.o oVar = new com.anythink.core.common.e.o();
        oVar.b = i;
        oVar.d = str;
        oVar.c = str2;
        oVar.e = str3;
        oVar.f = System.currentTimeMillis();
        StringBuilder G = wo1.G(str);
        G.append(oVar.f);
        G.append(str3);
        oVar.a = com.anythink.core.common.j.f.a(G.toString() != null ? str3 : "");
        String str4 = this.b;
        com.anythink.core.common.j.e.d(str4, "save request:" + str + "--content:" + str3);
        com.anythink.core.common.c.g.a(com.anythink.core.common.c.c.a(com.anythink.core.common.b.m.a().e())).a(oVar);
    }
}