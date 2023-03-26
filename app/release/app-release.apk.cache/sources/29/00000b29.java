package com.anythink.expressad.widget.a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.u;
import com.p7700g.p99005.oq;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a extends Dialog {
    private static final String a = "ATAlertDialog";
    private b b;
    private TextView c;
    private TextView d;
    private Button e;
    private Button f;

    public a(Context context, final b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(h.a(context, "anythink_cm_alertview", "layout"), (ViewGroup) null);
        this.b = bVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.c = (TextView) inflate.findViewById(h.a(context, "anythink_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                n.a(a, e.getMessage());
            }
            try {
                this.d = (TextView) inflate.findViewById(h.a(context, "anythink_video_common_alertview_contentview", "id"));
                this.e = (Button) inflate.findViewById(h.a(context, "anythink_video_common_alertview_confirm_button", "id"));
                this.f = (Button) inflate.findViewById(h.a(context, "anythink_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                n.a(a, e2.getMessage());
            }
        }
        Button button = this.f;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.widget.a.a.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                    a.this.cancel();
                    a.this.a();
                }
            });
        }
        Button button2 = this.e;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.widget.a.a.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    a.this.cancel();
                    a.this.a();
                }
            });
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    private void b(String str) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void c(String str) {
        Button button = this.e;
        if (button != null) {
            button.setText(str);
        }
    }

    private void d(String str) {
        Button button = this.f;
        if (button != null) {
            button.setText(str);
        }
    }

    private void e() {
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
            a("确认关闭？");
            b("关闭后您将不会获得任何奖励噢~ ");
            c("确认关闭");
            d("继续试玩");
            return;
        }
        a("Confirm to close? ");
        b("You will not be rewarded after closing the window");
        c("Close it");
        d("Continue");
    }

    public final void a() {
        if (this.b != null) {
            this.b = null;
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
                int i = Build.VERSION.SDK_INT;
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(oq.l);
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -1);
                window.setGravity(17);
            }
            getWindow().clearFlags(8);
        } catch (Exception e) {
            n.d(a, e.getMessage());
            super.show();
        }
    }

    private void a(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void c() {
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
            a("确认关闭？");
            b("关闭后您将不会获得任何奖励噢~ ");
            c("确认关闭");
            d("继续观看");
            return;
        }
        a("Confirm to close? ");
        b("You will not be rewarded after closing the window");
        c("Close it");
        d("Continue");
    }

    private void d() {
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
        if (b != null) {
            a(b.D(), b.E(), b.F(), b.G());
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
            a("确认关闭？");
            b("关闭后您将不会获得任何奖励噢~ ");
            c("确认关闭");
            d("继续试玩");
            return;
        }
        a("Confirm to close? ");
        b("You will not be rewarded after closing the window");
        c("Close it");
        d("Continue");
    }

    public final void b() {
        try {
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
                a("确认关闭？");
                b("关闭后您将不会获得任何奖励噢~ ");
                c("确认关闭");
                d("继续观看");
                return;
            }
            a("Confirm to close? ");
            b("You will not be rewarded after closing the window");
            c("Close it");
            d("Continue");
        } catch (Exception e) {
            n.a(a, e.getMessage());
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        a(str);
        b(str2);
        c(str3);
        d(str4);
    }

    private void a(int i) {
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
            a(i == com.anythink.expressad.foundation.g.a.cr ? "确认关闭？" : "提示");
            b(i == com.anythink.expressad.foundation.g.a.cr ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
            c(i == com.anythink.expressad.foundation.g.a.cr ? "确认关闭" : "取消");
            d("继续");
            return;
        }
        a(i == com.anythink.expressad.foundation.g.a.cr ? "Confirm" : "Tips");
        b(i == com.anythink.expressad.foundation.g.a.cr ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
        c(i == com.anythink.expressad.foundation.g.a.cr ? "Close" : "Cancel");
        d("Continue");
    }

    public final void a(int i, String str) {
        try {
            String obj = u.b(getContext(), "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
            String obj2 = u.b(getContext(), "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
            String obj3 = u.b(getContext(), "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
            String obj4 = u.b(getContext(), "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
            if (TextUtils.isEmpty(obj) && TextUtils.isEmpty(obj2) && TextUtils.isEmpty(obj3) && TextUtils.isEmpty(obj4)) {
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
                    a(i == com.anythink.expressad.foundation.g.a.cr ? "确认关闭？" : "提示");
                    b(i == com.anythink.expressad.foundation.g.a.cr ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
                    c(i == com.anythink.expressad.foundation.g.a.cr ? "确认关闭" : "取消");
                    d("继续");
                    return;
                }
                a(i == com.anythink.expressad.foundation.g.a.cr ? "Confirm" : "Tips");
                b(i == com.anythink.expressad.foundation.g.a.cr ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
                c(i == com.anythink.expressad.foundation.g.a.cr ? "Close" : "Cancel");
                d("Continue");
                return;
            }
            a(obj, obj2, obj3, obj4);
        } catch (Exception e) {
            n.a(a, e.getMessage());
        }
    }

    private static void a(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            int i = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(oq.l);
            if (i >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }
}