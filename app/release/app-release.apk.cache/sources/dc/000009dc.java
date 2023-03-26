package com.anythink.expressad.video.dynview.endcard.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.video.dynview.endcard.cloudview.d;
import com.anythink.expressad.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends d {
    private List<c> a;

    private void a(List<c> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() <= 0) {
            return;
        }
        for (c cVar : list) {
            if (!TextUtils.isEmpty(cVar.bd())) {
                arrayList.add(cVar);
            }
        }
        this.a = arrayList;
    }

    @Override // com.anythink.expressad.video.dynview.endcard.cloudview.d
    public final Object b() {
        return null;
    }

    @Override // com.anythink.expressad.video.dynview.endcard.cloudview.d
    public final void c() {
    }

    @Override // com.anythink.expressad.video.dynview.endcard.cloudview.d
    public final int a() {
        List<c> list = this.a;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.a.size();
    }

    @Override // com.anythink.expressad.video.dynview.endcard.cloudview.d
    public final View a(Context context, int i, ViewGroup viewGroup) {
        List<c> list;
        View inflate = LayoutInflater.from(context).inflate(h.a(viewGroup.getContext(), "anythink_reward_view_tag_item", "layout"), viewGroup, false);
        if (inflate != null) {
            final RoundImageView roundImageView = (RoundImageView) inflate.findViewById(h.a(context, "anythink_tag_icon", "id"));
            if (roundImageView != null && (list = this.a) != null && list.size() > 0) {
                roundImageView.setBorderRadius(2);
                b.a(context).a(this.a.get(i).bd(), new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.dynview.endcard.a.a.1
                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(Bitmap bitmap, String str) {
                        RoundImageView roundImageView2 = roundImageView;
                        if (roundImageView2 != null) {
                            roundImageView2.setImageBitmap(bitmap);
                        }
                    }

                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(String str, String str2) {
                    }
                });
            }
            TextView textView = (TextView) inflate.findViewById(h.a(context, "anythink_tag_title", "id"));
            if (textView != null) {
                textView.setText(this.a.get(i).bb());
            }
        }
        return inflate;
    }

    @Override // com.anythink.expressad.video.dynview.endcard.cloudview.d
    public final int a(int i) {
        return i % 5;
    }
}