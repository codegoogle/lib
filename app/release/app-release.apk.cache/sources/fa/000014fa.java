package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC1087Wo extends C0845Nd implements View.OnClickListener {
    @Nullable
    public String A00;
    @Nullable
    public String A01;
    public final C0843Nb A02;
    public final Map<String, String> A03;

    public View$OnClickListenerC1087Wo(C1080Wh c1080Wh, String str, C1H c1h, JE je, M6 m6, C0901Ph c0901Ph, LX lx) {
        super(c1080Wh, c1h);
        this.A03 = new HashMap();
        this.A02 = new C0843Nb(c1080Wh, str, c0901Ph, lx, je, m6);
        setOnClickListener(this);
        C0795Le.A0J(1001, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A00) && !TextUtils.isEmpty(this.A01)) {
                this.A02.A08(this.A00, this.A01, this.A03);
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    public void setCta(C1I c1i, String str, Map<String, String> map) {
        setCta(c1i, str, map, null);
    }

    public void setCta(C1I c1i, String str, Map<String, String> map, @Nullable InterfaceC0842Na interfaceC0842Na) {
        this.A00 = str;
        this.A01 = c1i.A04();
        Map<String, String> extraData = this.A03;
        extraData.putAll(map);
        this.A02.A07(interfaceC0842Na);
        String A03 = c1i.A03();
        if (TextUtils.isEmpty(A03) || TextUtils.isEmpty(this.A01)) {
            setVisibility(8);
        } else {
            setText(A03);
        }
    }

    public void setIsInAppBrowser(boolean z) {
        this.A02.A09(z);
    }
}