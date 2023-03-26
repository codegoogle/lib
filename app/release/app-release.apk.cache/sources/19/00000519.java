package com.anythink.basead.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.core.common.j.h;

/* loaded from: classes2.dex */
public class RewardExitConfirmDialogActivity extends Activity {
    private static Runnable a;
    private static String b;
    private Dialog c;

    /* renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (RewardExitConfirmDialogActivity.a != null) {
                RewardExitConfirmDialogActivity.a.run();
            }
            RewardExitConfirmDialogActivity.this.finish();
        }
    }

    /* renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
        }
    }

    private void b() {
        try {
            View inflate = LayoutInflater.from(this).inflate(h.a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_give_up", "id"));
            TextView textView2 = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_continue", "id"));
            ((TextView) inflate.findViewById(h.a(this, "myoffer_confirm_msg", "id"))).setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_msg", "string"), b));
            textView.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_give_up", "string")));
            textView2.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_continue", "string")));
            textView.setOnClickListener(new AnonymousClass1());
            textView2.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, h.a(this, "style_full_screen_translucent_dialog", com.anythink.expressad.foundation.h.h.e));
            this.c = dialog;
            dialog.setContentView(inflate);
            this.c.setCancelable(false);
            this.c.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            View inflate = LayoutInflater.from(this).inflate(h.a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_give_up", "id"));
            TextView textView2 = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_continue", "id"));
            ((TextView) inflate.findViewById(h.a(this, "myoffer_confirm_msg", "id"))).setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_msg", "string"), b));
            textView.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_give_up", "string")));
            textView2.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_continue", "string")));
            textView.setOnClickListener(new AnonymousClass1());
            textView2.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, h.a(this, "style_full_screen_translucent_dialog", com.anythink.expressad.foundation.h.h.e));
            this.c = dialog;
            dialog.setContentView(inflate);
            this.c.setCancelable(false);
            this.c.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.dismiss();
            this.c = null;
        }
        a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static void a(Context context, String str, Runnable runnable) {
        b = str;
        a = runnable;
        Intent intent = new Intent(context, RewardExitConfirmDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}