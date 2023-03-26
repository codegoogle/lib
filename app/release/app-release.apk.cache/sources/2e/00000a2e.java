package com.anythink.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.video.signal.factory.b;

/* loaded from: classes2.dex */
public class AnythinkLandingPageView extends AnythinkH5EndCardView {

    /* loaded from: classes2.dex */
    public static final class a implements com.anythink.expressad.atsignalcommon.base.a {
        private a() {
        }

        @Override // com.anythink.expressad.atsignalcommon.base.a
        public final boolean a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            r.a(m.a().e(), str, null);
            return true;
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public AnythinkLandingPageView(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        c cVar = this.b_;
        if (cVar != null) {
            return cVar.af();
        }
        return null;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        if (this.f_) {
            this.r.setFilter(new a((byte) 0));
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        try {
            n.a(AnythinkBaseView.TAG, "webviewshow");
            j.a();
            j.a((WebView) this.r, "webviewshow", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AnythinkLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}