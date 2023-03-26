package com.anythink.expressad.video.dynview.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.d;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.video.dynview.f.a;
import com.anythink.expressad.video.dynview.widget.ATRotationView;
import com.anythink.expressad.video.dynview.widget.AnyThinkImageView;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {
    public static final String a = "DataEnergizeWrapper";
    private com.anythink.expressad.video.dynview.h.c.b b;
    private Map<String, Bitmap> c;
    private volatile boolean d;
    private String e = "#FFFFFFFF";
    private String f = "#60000000";
    private String g = "#FF5F5F5F";
    private String h = "#90ECECEC";
    private volatile long i = 0;

    /* renamed from: com.anythink.expressad.video.dynview.i.a$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends com.anythink.expressad.widget.a {
        public final /* synthetic */ Map a;

        public AnonymousClass3(Map map) {
            this.a = map;
        }

        @Override // com.anythink.expressad.widget.a
        public final void a(View view) {
            if (a.this.d) {
                return;
            }
            a.this.d = true;
            a.a(a.this, this.a);
        }
    }

    public final void b(com.anythink.expressad.video.dynview.c cVar, View view, com.anythink.expressad.video.dynview.e.b bVar) {
        if (bVar == null) {
            return;
        }
        if (cVar == null) {
            bVar.a(com.anythink.expressad.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(a("anythink_iv_adbanner_bg"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.h));
            }
            ImageView imageView2 = (ImageView) view.findViewById(a("anythink_iv_adbanner"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.h));
            }
            bVar.a(view, new ArrayList());
        } catch (Exception e) {
            n.a(a, e.getMessage());
            bVar.a(com.anythink.expressad.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.expressad.video.dynview.c cVar, View view, final Map map, com.anythink.expressad.video.dynview.e.b bVar) {
        com.anythink.expressad.foundation.d.c cVar2;
        com.anythink.expressad.foundation.d.c cVar3;
        float f;
        float f2;
        float f3;
        int i;
        RoundImageView roundImageView;
        TextView textView;
        RelativeLayout relativeLayout;
        AnyThinkImageView anyThinkImageView;
        int i2;
        RoundImageView roundImageView2;
        TextView textView2;
        long parseLong;
        ImageView imageView;
        FrameLayout.LayoutParams layoutParams;
        if (this.c == null) {
            this.c = new HashMap();
        }
        final List<com.anythink.expressad.foundation.d.c> g = cVar.g();
        Context context = view.getContext();
        if (context == null) {
            bVar.a(com.anythink.expressad.video.dynview.c.a.NOT_FOUND_CONTEXT);
            return;
        }
        if (g == null || g.size() <= 1) {
            cVar2 = null;
            cVar3 = null;
        } else {
            cVar2 = g.get(0);
            cVar3 = g.get(1);
        }
        if (cVar2 == null && bVar != null) {
            bVar.a(com.anythink.expressad.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
        } else if (cVar3 == null && bVar != null) {
            bVar.a(com.anythink.expressad.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(a("anythink_top_item_rl"));
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.dynview.i.a.1
                    @Override // com.anythink.expressad.widget.a
                    public final void a(View view2) {
                        if (a.this.d) {
                            return;
                        }
                        a.this.d = true;
                        a.a(a.this, map, g, 0);
                    }
                });
            }
            AnyThinkImageView anyThinkImageView2 = (AnyThinkImageView) view.findViewById(a("anythink_top_iv"));
            if (anyThinkImageView2 != null) {
                f2 = 200.0f;
                f = 0.45f;
                anyThinkImageView2.setCustomBorder(20, 20, 0, 0, 10, sr.t);
                a(cVar2.be(), anyThinkImageView2, cVar, view);
                ATRotationView aTRotationView = (ATRotationView) view.findViewById(a("anythink_top_ration"));
                if (aTRotationView != null) {
                    if (cVar2.aF()) {
                        if (!TextUtils.isEmpty(cVar2.bd())) {
                            ImageView imageView2 = new ImageView(cVar.a());
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, s.b(cVar.a(), 200.0f)));
                            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            aTRotationView.addView(imageView2);
                            a(cVar2.bd(), imageView2);
                            aTRotationView.setWidthRatio(0.45f);
                            f3 = 0.9f;
                            aTRotationView.setHeightRatio(0.9f);
                            aTRotationView.setAutoscroll(true);
                            i = 0;
                        } else {
                            f3 = 0.9f;
                            aTRotationView.setWidthRatio(1.0f);
                            aTRotationView.setHeightRatio(1.0f);
                            i = 0;
                            aTRotationView.setAutoscroll(false);
                        }
                    } else {
                        f3 = 0.9f;
                        i = 0;
                        aTRotationView.setWidthRatio(1.0f);
                        aTRotationView.setHeightRatio(1.0f);
                        aTRotationView.setAutoscroll(false);
                    }
                    roundImageView = (RoundImageView) view.findViewById(a("anythink_top_icon_iv"));
                    if (roundImageView != null) {
                        roundImageView.setType(i);
                        a(cVar2.bd(), roundImageView);
                    }
                    textView = (TextView) view.findViewById(a("anythink_top_title_tv"));
                    if (textView != null) {
                        if (!TextUtils.isEmpty(cVar2.bb())) {
                            textView.setText(cVar2.bb());
                        } else {
                            textView.setVisibility(8);
                        }
                    }
                    relativeLayout = (RelativeLayout) view.findViewById(a("anythink_bottom_item_rl"));
                    if (relativeLayout != null) {
                        relativeLayout.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.dynview.i.a.2
                            @Override // com.anythink.expressad.widget.a
                            public final void a(View view2) {
                                if (a.this.d) {
                                    return;
                                }
                                a.this.d = true;
                                a.a(a.this, map, g, 1);
                            }
                        });
                    }
                    anyThinkImageView = (AnyThinkImageView) view.findViewById(a("anythink_bottom_iv"));
                    if (anyThinkImageView != null) {
                        anyThinkImageView.setCustomBorder(20, 20, 0, 0, 10, sr.t);
                        a(cVar3.be(), anyThinkImageView, cVar, view);
                        ATRotationView aTRotationView2 = (ATRotationView) view.findViewById(a("anythink_bottom_ration"));
                        if (aTRotationView2 != null) {
                            if (cVar3.aF()) {
                                if (!TextUtils.isEmpty(cVar3.bd())) {
                                    ImageView imageView3 = new ImageView(cVar.a());
                                    imageView3.setLayoutParams(new FrameLayout.LayoutParams(-1, s.b(cVar.a(), f2)));
                                    imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    aTRotationView2.addView(imageView3);
                                    a(cVar3.bd(), imageView3);
                                    aTRotationView2.setWidthRatio(f);
                                    aTRotationView2.setHeightRatio(f3);
                                    aTRotationView2.setAutoscroll(true);
                                } else {
                                    aTRotationView2.setWidthRatio(1.0f);
                                    aTRotationView2.setHeightRatio(1.0f);
                                    i2 = 0;
                                    aTRotationView2.setAutoscroll(false);
                                }
                            } else {
                                i2 = 0;
                                aTRotationView2.setWidthRatio(1.0f);
                                aTRotationView2.setHeightRatio(1.0f);
                                aTRotationView2.setAutoscroll(false);
                            }
                            roundImageView2 = (RoundImageView) view.findViewById(a("anythink_bottom_icon_iv"));
                            if (roundImageView2 != null) {
                                roundImageView2.setType(i2);
                                a(cVar3.bd(), roundImageView2);
                            }
                            textView2 = (TextView) view.findViewById(a("anythink_bottom_title_tv"));
                            if (textView2 != null) {
                                textView2.setText(cVar3.bb());
                            }
                            String au = cVar2.au();
                            int e = cVar.e();
                            String a2 = w.a(au, "cltp");
                            parseLong = !TextUtils.isEmpty(a2) ? Long.parseLong(a2) : 0L;
                            if (parseLong != 0) {
                                TextView textView3 = (TextView) view.findViewById(a("anythink_choice_one_countdown_tv"));
                                textView3.setTextSize(11.0f);
                                textView3.setTextColor(Color.parseColor(this.e));
                                String str = this.f;
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(Color.parseColor(str));
                                gradientDrawable.setCornerRadius(s.b(textView3.getContext(), 12.0f));
                                gradientDrawable.setStroke(s.b(textView3.getContext(), 1.0f), Color.parseColor(str));
                                textView3.setBackgroundDrawable(gradientDrawable);
                                if (e == 2 && (layoutParams = (FrameLayout.LayoutParams) textView3.getLayoutParams()) != null) {
                                    int d = s.d(context);
                                    int b = s.b(context, 10.0f);
                                    layoutParams.setMargins(b, b, d, b);
                                }
                                textView3.setVisibility(0);
                                textView3.setOnClickListener(new AnonymousClass3(map));
                                com.anythink.expressad.video.dynview.h.c.b a3 = new com.anythink.expressad.video.dynview.h.c.b().a(parseLong * 1000).a().a(new AnonymousClass4(textView3, map));
                                this.b = a3;
                                a3.b();
                            }
                            imageView = (ImageView) view.findViewById(a("anythink_reward_choice_one_like_iv"));
                            if (imageView != null) {
                                if (cVar.e() == 1) {
                                    imageView.setImageResource(h.a(context.getApplicationContext(), com.anythink.expressad.video.dynview.h.c.a(context, 1), h.c));
                                } else {
                                    imageView.setImageResource(h.a(context.getApplicationContext(), com.anythink.expressad.video.dynview.h.c.a(context, 2), h.c));
                                }
                            }
                            if (bVar != null) {
                                bVar.a(view, null);
                                return;
                            }
                            return;
                        }
                    }
                    i2 = 0;
                    roundImageView2 = (RoundImageView) view.findViewById(a("anythink_bottom_icon_iv"));
                    if (roundImageView2 != null) {
                    }
                    textView2 = (TextView) view.findViewById(a("anythink_bottom_title_tv"));
                    if (textView2 != null) {
                    }
                    String au2 = cVar2.au();
                    int e2 = cVar.e();
                    String a22 = w.a(au2, "cltp");
                    if (!TextUtils.isEmpty(a22)) {
                    }
                    if (parseLong != 0) {
                    }
                    imageView = (ImageView) view.findViewById(a("anythink_reward_choice_one_like_iv"));
                    if (imageView != null) {
                    }
                    if (bVar != null) {
                    }
                }
            } else {
                f = 0.45f;
                f2 = 200.0f;
            }
            f3 = 0.9f;
            i = 0;
            roundImageView = (RoundImageView) view.findViewById(a("anythink_top_icon_iv"));
            if (roundImageView != null) {
            }
            textView = (TextView) view.findViewById(a("anythink_top_title_tv"));
            if (textView != null) {
            }
            relativeLayout = (RelativeLayout) view.findViewById(a("anythink_bottom_item_rl"));
            if (relativeLayout != null) {
            }
            anyThinkImageView = (AnyThinkImageView) view.findViewById(a("anythink_bottom_iv"));
            if (anyThinkImageView != null) {
            }
            i2 = 0;
            roundImageView2 = (RoundImageView) view.findViewById(a("anythink_bottom_icon_iv"));
            if (roundImageView2 != null) {
            }
            textView2 = (TextView) view.findViewById(a("anythink_bottom_title_tv"));
            if (textView2 != null) {
            }
            String au22 = cVar2.au();
            int e22 = cVar.e();
            String a222 = w.a(au22, "cltp");
            if (!TextUtils.isEmpty(a222)) {
            }
            if (parseLong != 0) {
            }
            imageView = (ImageView) view.findViewById(a("anythink_reward_choice_one_like_iv"));
            if (imageView != null) {
            }
            if (bVar != null) {
            }
        }
    }

    private static void b(com.anythink.expressad.video.dynview.c cVar, View view) {
        a.C0079a a2 = com.anythink.expressad.video.dynview.f.a.a();
        a2.a(cVar.e()).a();
        if (cVar.e() == 2) {
            if (cVar.d() > cVar.c()) {
                a2.a(cVar.d()).b(cVar.c());
            } else {
                a2.a(cVar.c()).b(cVar.d());
            }
        } else {
            a2.a(cVar.d()).b(cVar.c());
        }
        if (view.getBackground() == null) {
            view.setBackgroundDrawable(a2.b());
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.i.a$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements com.anythink.expressad.video.dynview.h.c.a {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ Map b;

        public AnonymousClass4(TextView textView, Map map) {
            this.a = textView;
            this.b = map;
        }

        @Override // com.anythink.expressad.video.dynview.h.c.a
        public final void a(long j) {
            String str;
            long j2 = j / 1000;
            String f = d.f(this.a.getContext());
            if (f.startsWith(com.anythink.expressad.video.dynview.a.a.N)) {
                if (!f.contains(com.anythink.expressad.video.dynview.a.a.V) && !f.contains(com.anythink.expressad.video.dynview.a.a.W)) {
                    str = j2 + com.anythink.expressad.video.dynview.a.a.w;
                } else {
                    str = j2 + com.anythink.expressad.video.dynview.a.a.x;
                }
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.O)) {
                str = j2 + com.anythink.expressad.video.dynview.a.a.z;
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.P)) {
                str = com.anythink.expressad.video.dynview.a.a.A + j2 + " Sekunden";
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.Q)) {
                str = j2 + com.anythink.expressad.video.dynview.a.a.B;
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.R)) {
                str = com.anythink.expressad.video.dynview.a.a.C + j2 + " secondes";
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.S)) {
                str = " ثوان" + j2 + com.anythink.expressad.video.dynview.a.a.D;
            } else if (f.startsWith(com.anythink.expressad.video.dynview.a.a.T)) {
                str = com.anythink.expressad.video.dynview.a.a.E + j2 + " секунд";
            } else {
                str = com.anythink.expressad.video.dynview.a.a.y + j2 + " s";
            }
            this.a.setText(str);
            a.this.i++;
        }

        @Override // com.anythink.expressad.video.dynview.h.c.a
        public final void a() {
            a.a(a.this, this.b);
        }
    }

    private void b() {
        com.anythink.expressad.video.dynview.h.a.a.a().b();
        com.anythink.expressad.video.dynview.h.c.b bVar = this.b;
        if (bVar != null) {
            bVar.c();
            this.b = null;
        }
        Map<String, Bitmap> map = this.c;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.c.clear();
        }
    }

    public final void a(com.anythink.expressad.video.dynview.c cVar, View view, com.anythink.expressad.video.dynview.e.b bVar) {
        if (bVar == null) {
            return;
        }
        if (cVar == null) {
            bVar.a(com.anythink.expressad.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<com.anythink.expressad.foundation.d.c> g = cVar.g();
        if (g != null && g.size() > 0) {
            com.anythink.expressad.foundation.d.c cVar2 = g.get(0);
            if (cVar2 != null) {
                RoundImageView roundImageView = (RoundImageView) view.findViewById(a("anythink_reward_icon_riv"));
                if (roundImageView != null) {
                    roundImageView.setBorderRadius(10);
                    a(cVar2.bd(), roundImageView);
                }
                TextView textView = (TextView) view.findViewById(a("anythink_reward_title_tv"));
                if (textView != null) {
                    textView.setText(cVar2.bb());
                }
                TextView textView2 = (TextView) view.findViewById(a("anythink_reward_desc_tv"));
                if (textView2 != null) {
                    textView2.setText(cVar2.bc());
                }
                AnyThinkLevelLayoutView anyThinkLevelLayoutView = (AnyThinkLevelLayoutView) view.findViewById(a("anythink_reward_stars_mllv"));
                if (anyThinkLevelLayoutView != null) {
                    double aX = cVar2.aX();
                    if (aX <= zg2.s) {
                        aX = 5.0d;
                    }
                    anyThinkLevelLayoutView.setRatingAndUser(aX, cVar2.aY());
                }
                TextView textView3 = (TextView) view.findViewById(a("anythink_reward_click_tv"));
                if (textView3 != null) {
                    textView3.setText(cVar2.cS);
                }
                int h = cVar.h();
                if (h == 102 || h == 202 || h == 302) {
                    if (textView3 != null) {
                        arrayList.add(textView3);
                    }
                } else if (h != 802) {
                    if (h == 904 && cVar.j()) {
                        arrayList.add(view);
                    }
                } else {
                    if (roundImageView != null) {
                        arrayList.add(roundImageView);
                    }
                    if (textView3 != null) {
                        arrayList.add(textView3);
                    }
                    a((ImageView) view.findViewById(a("anythink_videoview_bg")), cVar2.be(), h);
                }
                bVar.a(view, arrayList);
                return;
            }
            bVar.a(com.anythink.expressad.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        bVar.a(com.anythink.expressad.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
    }

    private void a(String str, Context context, View view, int i, Map map) {
        FrameLayout.LayoutParams layoutParams;
        String a2 = w.a(str, "cltp");
        long parseLong = !TextUtils.isEmpty(a2) ? Long.parseLong(a2) : 0L;
        if (parseLong != 0) {
            TextView textView = (TextView) view.findViewById(a("anythink_choice_one_countdown_tv"));
            textView.setTextSize(11.0f);
            textView.setTextColor(Color.parseColor(this.e));
            String str2 = this.f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(s.b(textView.getContext(), 12.0f));
            gradientDrawable.setStroke(s.b(textView.getContext(), 1.0f), Color.parseColor(str2));
            textView.setBackgroundDrawable(gradientDrawable);
            if (i == 2 && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                int d = s.d(context);
                int b = s.b(context, 10.0f);
                layoutParams.setMargins(b, b, d, b);
            }
            textView.setVisibility(0);
            textView.setOnClickListener(new AnonymousClass3(map));
            com.anythink.expressad.video.dynview.h.c.b a3 = new com.anythink.expressad.video.dynview.h.c.b().a(parseLong * 1000).a().a(new AnonymousClass4(textView, map));
            this.b = a3;
            a3.b();
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(final ImageView imageView, String str, final int i) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.dynview.i.a.5
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    if (i != 802) {
                        imageView.setImageBitmap(bitmap);
                        return;
                    }
                    ImageView imageView2 = imageView;
                    com.anythink.expressad.video.dynview.h.b.a();
                    imageView2.setImageBitmap(com.anythink.expressad.video.dynview.h.b.a(bitmap, 0));
                    return;
                }
                int a2 = h.a(imageView.getContext(), "anythink_icon_play_bg", h.c);
                imageView.setBackgroundColor(Color.parseColor(a.this.g));
                imageView.setImageResource(a2);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                try {
                    int a2 = h.a(imageView.getContext(), "anythink_icon_play_bg", h.c);
                    imageView.setBackgroundColor(Color.parseColor(a.this.g));
                    imageView.setImageResource(a2);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                } catch (Exception e) {
                    n.a(a.a, e.getMessage());
                }
            }
        });
    }

    private void a(final String str, final ImageView imageView, final com.anythink.expressad.video.dynview.c cVar, final View view) {
        com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.dynview.i.a.6
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                ImageView imageView2;
                if (bitmap == null || bitmap.isRecycled() || (imageView2 = imageView) == null) {
                    return;
                }
                imageView2.setImageBitmap(bitmap);
                if (a.this.c != null) {
                    a.this.c.put(o.a(str), bitmap);
                    a.a(a.this, cVar, view);
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }
        });
        if (a() != null) {
            b(cVar, view);
        }
    }

    private void a(Map map, List<com.anythink.expressad.foundation.d.c> list, int i) {
        if (map == null || !map.containsKey(com.anythink.expressad.video.dynview.a.a.v) || !(map.get(com.anythink.expressad.video.dynview.a.a.v) instanceof com.anythink.expressad.video.dynview.e.a) || list == null || list.size() <= 1) {
            return;
        }
        ((com.anythink.expressad.video.dynview.e.a) map.get(com.anythink.expressad.video.dynview.a.a.v)).a(list.get(i));
        b();
    }

    private void a(Map map) {
        if (map != null && map.containsKey(com.anythink.expressad.video.dynview.a.a.v) && (map.get(com.anythink.expressad.video.dynview.a.a.v) instanceof com.anythink.expressad.video.dynview.e.a)) {
            ((com.anythink.expressad.video.dynview.e.a) map.get(com.anythink.expressad.video.dynview.a.a.v)).a();
            b();
        }
    }

    private void a(com.anythink.expressad.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.c;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.anythink.expressad.video.dynview.g.b();
        Map<String, Bitmap> map2 = this.c;
        if (view != null) {
            com.anythink.expressad.video.dynview.h.a.a.a().a(map2, cVar, view);
        }
    }

    private static int a(String str) {
        return h.a(m.a().e(), str, "id");
    }

    private Bitmap a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmap.eraseColor(Color.parseColor(this.h));
            return bitmap;
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
                return bitmap;
            }
            return bitmap;
        }
    }

    public static /* synthetic */ void a(a aVar, Map map, List list, int i) {
        if (map == null || !map.containsKey(com.anythink.expressad.video.dynview.a.a.v) || !(map.get(com.anythink.expressad.video.dynview.a.a.v) instanceof com.anythink.expressad.video.dynview.e.a) || list == null || list.size() <= 1) {
            return;
        }
        ((com.anythink.expressad.video.dynview.e.a) map.get(com.anythink.expressad.video.dynview.a.a.v)).a((com.anythink.expressad.foundation.d.c) list.get(i));
        aVar.b();
    }

    public static /* synthetic */ void a(a aVar, Map map) {
        if (map != null && map.containsKey(com.anythink.expressad.video.dynview.a.a.v) && (map.get(com.anythink.expressad.video.dynview.a.a.v) instanceof com.anythink.expressad.video.dynview.e.a)) {
            ((com.anythink.expressad.video.dynview.e.a) map.get(com.anythink.expressad.video.dynview.a.a.v)).a();
            aVar.b();
        }
    }

    public static /* synthetic */ void a(a aVar, com.anythink.expressad.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = aVar.c;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.anythink.expressad.video.dynview.g.b();
        Map<String, Bitmap> map2 = aVar.c;
        if (view != null) {
            com.anythink.expressad.video.dynview.h.a.a.a().a(map2, cVar, view);
        }
    }
}