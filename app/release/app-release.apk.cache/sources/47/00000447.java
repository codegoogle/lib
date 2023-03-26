package com.anythink.basead.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.v;
import com.anythink.core.common.e.x;

/* loaded from: classes2.dex */
public final class g extends v {
    public String a;
    public String b;

    public g(com.anythink.core.common.e.i iVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
    }

    @Override // com.anythink.core.common.e.v
    public final void a(Activity activity) {
        try {
            com.anythink.core.common.e.i iVar = this.c;
            String T = iVar instanceof x ? ((x) iVar).T() : "";
            if (TextUtils.isEmpty(T)) {
                T = this.c.m();
            }
            final Context e = m.a().e();
            View inflate = LayoutInflater.from(activity).inflate(com.anythink.core.common.j.h.a(e, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(com.anythink.core.common.j.h.a(e, "myoffer_confirm_give_up", "id"));
            TextView textView2 = (TextView) inflate.findViewById(com.anythink.core.common.j.h.a(e, "myoffer_confirm_continue", "id"));
            ((TextView) inflate.findViewById(com.anythink.core.common.j.h.a(e, "myoffer_confirm_msg", "id"))).setText("立即打开\"" + T + "\"?");
            textView.setText("取 消");
            textView2.setText("确 定");
            final Dialog dialog = new Dialog(activity, com.anythink.core.common.j.h.a(e, "style_full_screen_translucent_dialog", com.anythink.expressad.foundation.h.h.e));
            dialog.setContentView(inflate);
            dialog.setCancelable(false);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.c.g.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g gVar = g.this;
                    com.anythink.core.common.i.c.a(gVar.b, gVar.c.k(), g.this.a, 7, (String) null, 0L, 0L);
                    try {
                        dialog.dismiss();
                    } catch (Throwable unused) {
                    }
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.c.g.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        g gVar = g.this;
                        com.anythink.core.common.i.c.a(gVar.b, gVar.c.k(), g.this.a, 8, (String) null, 0L, 0L);
                        if (com.anythink.basead.a.b.a(e, g.this.c)) {
                            g gVar2 = g.this;
                            com.anythink.core.common.i.c.a(gVar2.b, gVar2.c.k(), g.this.a, 9, (String) null, 0L, 0L);
                        }
                        dialog.dismiss();
                    } catch (Throwable unused) {
                    }
                }
            });
            dialog.show();
        } catch (Throwable unused) {
        }
    }
}