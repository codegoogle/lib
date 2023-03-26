package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.My  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0840My extends LinearLayout {
    public static final int A03 = (int) (C0795Le.A01 * 40.0f);
    public static final int A04 = (int) (C0795Le.A01 * 20.0f);
    public static final int A05 = (int) (C0795Le.A01 * 10.0f);
    public final AnonymousClass26 A00;
    public final C1080Wh A01;
    public final InterfaceC0825Mi A02;

    public C0840My(C1080Wh c1080Wh, AnonymousClass26 anonymousClass26, InterfaceC0825Mi interfaceC0825Mi, EnumC0803Lm enumC0803Lm) {
        this(c1080Wh, anonymousClass26, interfaceC0825Mi, null, enumC0803Lm);
    }

    public C0840My(C1080Wh c1080Wh, AnonymousClass26 anonymousClass26, InterfaceC0825Mi interfaceC0825Mi, @Nullable String str, EnumC0803Lm enumC0803Lm) {
        super(c1080Wh);
        this.A01 = c1080Wh;
        this.A00 = anonymousClass26;
        this.A02 = interfaceC0825Mi;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A02 = A02(str);
            A02.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            C0795Le.A0P(view, -10459280);
            addView(A02, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A01 = A01(enumC0803Lm, this.A00.A03());
            int i = A05;
            A01.setPadding(0, i, 0, i);
            addView(A01, layoutParams);
        }
        View A00 = A00();
        A00.setPadding(0, A05, 0, 0);
        addView(A00, layoutParams);
    }

    private View A00() {
        N4 n4 = new N4(this.A01);
        for (AnonymousClass26 anonymousClass26 : this.A00.A05()) {
            C0827Mk c0827Mk = new C0827Mk(this.A01);
            c0827Mk.setData(anonymousClass26.A04(), null);
            c0827Mk.setOnClickListener(new View$OnClickListenerC0839Mx(this, c0827Mk, anonymousClass26));
            n4.addView(c0827Mk);
        }
        return n4;
    }

    private View A01(EnumC0803Lm enumC0803Lm, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(C0804Ln.A00(enumC0803Lm));
        TextView textView = new TextView(getContext());
        C0795Le.A0b(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A02(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(C0804Ln.A00(EnumC0803Lm.BACK_ARROW));
        int i = A05;
        imageView.setPadding(0, i, i * 2, i);
        int i2 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        imageView.setOnClickListener(new View$OnClickListenerC0838Mw(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        C0795Le.A0b(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A03, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}