package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.j;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.e.d;
import com.anythink.expressad.widget.FeedBackButton;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkVideoView extends AnythinkBaseView implements f, j {
    private static int A = 0;
    private static int B = 0;
    private static final String C = "2";
    public static final String TAG = "AnythinkVideoView";
    private static boolean an = false;
    private static final String s = "anythink_reward_videoview_item";
    private static final int t = 1;
    private static final float u = 1280.0f;
    private static final float v = 720.0f;
    private static final float w = 0.1f;
    private static int x;
    private static int y;
    private static int z;
    private PlayerView D;
    private SoundImageView E;
    private TextView F;
    private View G;
    private RelativeLayout H;
    private ImageView I;
    private ProgressBar J;
    private FeedBackButton K;
    private boolean L;
    private com.anythink.expressad.video.module.a.a M;
    private boolean N;
    private boolean O;
    private String P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private com.anythink.expressad.widget.a.a U;
    private com.anythink.expressad.widget.a.b V;
    private String W;
    private AlphaAnimation aA;
    private b aB;
    private boolean aC;
    private double aa;
    private double ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private int al;
    private boolean am;
    private int ao;
    private String ap;
    private int aq;
    private int ar;
    private int as;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkVideoView.this.aj = true;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public int a;
        public int b;
        public boolean c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProgressData{curPlayPosition=");
            sb.append(this.a);
            sb.append(", allDuration=");
            return wo1.y(sb, this.b, '}');
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends DefaultVideoPlayerStatusListener {
        private AnythinkVideoView a;
        private int b;
        private int c;
        private boolean d;
        private boolean i;
        private String j;
        private c k;
        private int l;
        private int m;
        private a e = new a();
        private boolean f = false;
        private boolean g = false;
        private boolean h = false;
        private boolean n = false;

        public b(AnythinkVideoView anythinkVideoView) {
            this.a = anythinkVideoView;
        }

        private c c() {
            return this.k;
        }

        public final void a(c cVar) {
            this.k = cVar;
        }

        public final void b() {
            this.a = null;
            boolean unused = AnythinkVideoView.an = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                this.a.e_.a(14, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                this.a.e_.a(13, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            this.a.ax = true;
            c cVar = this.k;
            if (cVar == null) {
                this.a.F.setText("0");
            } else {
                if (cVar.i() > 0) {
                    this.a.F.setText(h.a(m.a().e(), "anythink_reward_video_view_reward_time_complete", "string"));
                } else {
                    this.a.F.setText("0");
                }
                if (this.k.f() == 2) {
                    this.a.G.setVisibility(4);
                    if (this.a.K != null) {
                        this.a.K.setClickable(false);
                    }
                    this.a.E.setClickable(false);
                }
            }
            this.a.D.setClickable(false);
            String b = this.a.b(true);
            this.a.e_.a(121, "");
            this.a.e_.a(11, b);
            this.b = this.c;
            boolean unused = AnythinkVideoView.an = true;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            n.d(DefaultVideoPlayerStatusListener.TAG, "errorStr".concat(String.valueOf(str)));
            super.onPlayError(str);
            this.a.e_.a(12, str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i, int i2) {
            int i3;
            String str;
            String str2;
            super.onPlayProgress(i, i2);
            if (this.a.f_) {
                int i4 = 0;
                c cVar = this.k;
                if (cVar != null) {
                    i4 = cVar.i();
                    com.anythink.expressad.foundation.f.b.a().a(this.k.I() + "_1", i);
                }
                if (i4 > i2) {
                    i4 = i2;
                }
                int i5 = i4 <= 0 ? i2 - i : i4 - i;
                if (i5 <= 0) {
                    str2 = i4 <= 0 ? "0" : (String) this.a.getContext().getResources().getText(h.a(m.a().e(), "anythink_reward_video_view_reward_time_complete", "string"));
                } else if (i4 <= 0) {
                    str2 = String.valueOf(i5);
                } else {
                    str2 = i5 + ((String) this.a.getContext().getResources().getText(h.a(m.a().e(), "anythink_reward_video_view_reward_time_left", "string")));
                }
                this.a.F.setText(str2);
                if (this.a.J != null && this.a.J.getVisibility() == 0) {
                    this.a.J.setProgress(i);
                }
            }
            this.c = i2;
            a aVar = this.e;
            aVar.a = i;
            aVar.b = i2;
            aVar.c = this.a.ay;
            this.b = i;
            this.a.e_.a(15, this.e);
            if (this.a.am && !this.a.at && this.a.aq == com.anythink.expressad.foundation.g.a.cs) {
                this.a.e();
            }
            int i6 = this.l;
            if (i6 == 100 || this.n || i6 == 0) {
                return;
            }
            if (this.m > i6) {
                this.m = i6 / 2;
            }
            int i7 = this.m;
            if (i7 < 0 || i < (i3 = (i2 * i7) / 100)) {
                return;
            }
            if (this.k.u() != 94 && this.k.u() != 287) {
                str = this.k.aZ() + this.k.R() + this.k.z();
            } else {
                str = this.k.aa() + this.k.aZ() + this.k.R();
            }
            if (com.anythink.expressad.videocommon.b.c.a().a(this.j, str) != null) {
                this.n = true;
                n.d(DefaultVideoPlayerStatusListener.TAG, "CDRate is : " + i3 + " and start download !");
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.d) {
                AnythinkVideoView anythinkVideoView = this.a;
                if (anythinkVideoView != null) {
                    anythinkVideoView.L = true;
                }
                this.a.e_.a(10, this.e);
                this.d = true;
            }
            c cVar = this.k;
            if (cVar == null || cVar.i() <= 0) {
                this.a.F.setBackgroundResource(h.a(m.a().e(), "anythink_reward_shape_progress", h.c));
            } else {
                this.a.F.setBackgroundResource(h.a(m.a().e(), "anythink_reward_video_time_count_num_bg", h.c));
                if (this.k.j()) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.a.F.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -2;
                        layoutParams.height = s.b(m.a().e(), 25.0f);
                        this.a.F.setLayoutParams(layoutParams);
                    }
                    int b = s.b(m.a().e(), 5.0f);
                    this.a.F.setPadding(b, 0, b, 0);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, s.b(m.a().e(), 30.0f));
                    int b2 = s.b(m.a().e(), 5.0f);
                    layoutParams2.addRule(1, h.a(m.a().e(), "anythink_native_endcard_feed_btn", "id"));
                    layoutParams2.setMargins(b2, 0, 0, 0);
                    this.a.F.setPadding(b2, 0, b2, 0);
                    this.a.F.setLayoutParams(layoutParams2);
                }
            }
            if (this.a.J != null) {
                this.a.J.setMax(i);
            }
            c cVar2 = this.k;
            if (cVar2 != null && cVar2.f() == 2) {
                this.a.H.setVisibility(0);
            }
            if (this.a.F.getVisibility() == 0) {
                this.a.n();
            }
            boolean unused = AnythinkVideoView.an = false;
        }

        public final void a(boolean z) {
            this.i = z;
        }

        public final void a(String str) {
            this.j = str;
        }

        public final int a() {
            return this.b;
        }

        public final void a(int i, int i2) {
            this.l = i;
            this.m = i2;
        }
    }

    public AnythinkVideoView(Context context) {
        super(context);
        this.N = false;
        this.O = false;
        this.W = "";
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.ao = 2;
        this.at = false;
        this.au = false;
        this.av = false;
        this.aw = true;
        this.ax = false;
        this.ay = false;
        this.az = false;
        this.aB = new b(this);
        this.aC = false;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void alertWebViewShowed() {
        this.N = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void closeVideoOperate(int i, int i2) {
        if (i == 1) {
            this.az = true;
            if (getVisibility() == 0) {
                e();
            }
        }
        if (i2 == 1) {
            gonePlayingCloseView();
        } else if (i2 == 2) {
            if ((this.ay && getVisibility() == 0) || !this.f_ || this.G.getVisibility() == 0) {
                return;
            }
            if (!this.i_ || this.L) {
                this.G.setVisibility(0);
            }
            this.ag = true;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
        this.ac = true;
        showVideoLocation(0, 0, s.f(this.a_), s.e(this.a_), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.Q == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void dismissAllAlert() {
        com.anythink.expressad.widget.a.a aVar = this.U;
        if (aVar != null) {
            aVar.dismiss();
        }
        com.anythink.expressad.video.module.a.a aVar2 = this.e_;
        if (aVar2 != null) {
            aVar2.a(125, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewHeight() {
        return B;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewLeft() {
        return z;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewRadius() {
        return x;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewTop() {
        return y;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewWidth() {
        return A;
    }

    public int getCloseAlert() {
        return this.S;
    }

    @Override // com.anythink.expressad.video.signal.j
    public String getCurrentProgress() {
        try {
            int a2 = this.aB.a();
            c cVar = this.b_;
            int bi = cVar != null ? cVar.bi() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(a2, bi));
            jSONObject.put("time", a2);
            jSONObject.put("duration", String.valueOf(bi));
            return jSONObject.toString();
        } catch (Throwable th) {
            n.b(TAG, th.getMessage(), th);
            return "{}";
        }
    }

    public int getMute() {
        return this.ao;
    }

    public String getUnitId() {
        return this.W;
    }

    public int getVideoSkipTime() {
        return this.Q;
    }

    public void gonePlayingCloseView() {
        if (this.f_ && this.G.getVisibility() != 8) {
            this.G.setVisibility(8);
            this.ag = false;
        }
        if (this.aC || this.aj || this.ah) {
            return;
        }
        this.aC = true;
        int i = this.Q;
        if (i >= 0) {
            if (i == 0) {
                this.aj = true;
            } else {
                new Handler().postDelayed(new AnonymousClass7(), this.Q * 1000);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void hideAlertView(int i) {
        if (this.N) {
            this.N = false;
            this.at = true;
            setShowingAlertViewCover(false);
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false);
            if (i == 0) {
                i();
                if (this.am) {
                    int i2 = this.aq;
                    if (i2 == com.anythink.expressad.foundation.g.a.cs || i2 == com.anythink.expressad.foundation.g.a.cr) {
                        this.au = true;
                        com.anythink.expressad.video.module.a.a aVar = this.e_;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        this.ay = true;
                        gonePlayingCloseView();
                        return;
                    }
                    return;
                }
                return;
            }
            this.av = true;
            boolean z2 = this.am;
            if (z2 && this.aq == com.anythink.expressad.foundation.g.a.cs) {
                i();
            } else if (z2 && this.aq == com.anythink.expressad.foundation.g.a.cr) {
                com.anythink.expressad.video.module.a.a aVar2 = this.e_;
                if (aVar2 != null) {
                    aVar2.a(2, b(this.ax));
                }
            } else {
                com.anythink.expressad.video.module.a.a aVar3 = this.e_;
                if (aVar3 != null) {
                    aVar3.a(2, "");
                }
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // com.anythink.expressad.video.signal.j
    public boolean isH5Canvas() {
        return getLayoutParams().height < s.e(this.a_.getApplicationContext());
    }

    public boolean isInstallDialogShowing() {
        return this.O;
    }

    public boolean isMiniCardShowing() {
        return this.af;
    }

    public boolean isShowingAlertView() {
        return this.N;
    }

    public boolean isShowingTransparent() {
        return this.ak;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int indexOfChild = viewGroup.indexOfChild(this);
            int childCount = viewGroup.getChildCount();
            int i = indexOfChild + 1;
            boolean z2 = false;
            while (i <= childCount - 1) {
                if (viewGroup.getChildAt(i).getVisibility() == 0 && this.af) {
                    return false;
                }
                i++;
                z2 = true;
            }
            return z2;
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.ah = true;
            this.aj = false;
        } else if (i == 1) {
            this.ai = true;
        }
    }

    public void notifyVideoClose() {
        this.e_.a(2, "");
    }

    public void onBackPress() {
        if (this.af || this.N || this.au) {
            return;
        }
        if (this.ag) {
            e();
            return;
        }
        boolean z2 = this.ah;
        if (z2 && this.ai) {
            e();
        } else if (z2 || !this.aj) {
        } else {
            e();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.b_;
        if ((cVar == null || !cVar.j()) && this.f_ && this.ac) {
            l();
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        c cVar;
        if (this.f_ && !TextUtils.isEmpty(this.P) && (cVar = this.b_) != null) {
            if (cVar != null && v.b(cVar.T())) {
                String T = this.b_.T();
                n.b(TAG, "AnythinkBaseView videoResolution:".concat(String.valueOf(T)));
                String[] split = T.split("x");
                if (split.length == 2) {
                    if (s.b(split[0]) > zg2.s) {
                        this.aa = s.b(split[0]);
                    }
                    if (s.b(split[1]) > zg2.s) {
                        this.ab = s.b(split[1]);
                    }
                    n.b(TAG, "AnythinkBaseView mVideoW:" + this.aa + "  mVideoH:" + this.ab);
                }
                if (this.aa <= zg2.s) {
                    this.aa = 1280.0d;
                }
                if (this.ab <= zg2.s) {
                    this.ab = 720.0d;
                }
            }
            this.D.initBufferIngParam(this.R);
            PlayerView playerView = this.D;
            String str = this.P;
            String R = this.b_.R();
            playerView.initVFPData(str, R, this.b_.aa() + this.P, this.aB);
            soundOperate(this.ao, -1, null);
        }
        an = false;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressBarOperate(int i) {
        ProgressBar progressBar;
        if (this.f_) {
            if (i == 1) {
                ProgressBar progressBar2 = this.J;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
            } else if (i != 2 || (progressBar = this.J) == null) {
            } else {
                progressBar.setVisibility(0);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressOperate(int i, int i2) {
        if (this.f_) {
            n.b(TAG, "progressOperate progress:".concat(String.valueOf(i)));
            c cVar = this.b_;
            int bi = cVar != null ? cVar.bi() : 0;
            if (i > 0 && i <= bi && this.D != null) {
                n.b(TAG, "progressOperate progress:".concat(String.valueOf(i)));
                this.D.seekTo(i * 1000);
            }
            if (i2 == 1) {
                this.F.setVisibility(8);
            } else if (i2 == 2) {
                this.F.setVisibility(0);
            }
            if (this.F.getVisibility() == 0) {
                n();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.D;
            if (playerView != null && !this.ae) {
                playerView.release();
            }
            b bVar = this.aB;
            if (bVar != null) {
                bVar.b();
            }
            if (this.M != null) {
                this.M = null;
            }
        } catch (Exception e) {
            n.d(TAG, e.getMessage());
        }
    }

    public void setBufferTimeout(int i) {
        this.R = i;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setCampaign(c cVar) {
        int v2;
        super.setCampaign(cVar);
        b bVar = this.aB;
        if (bVar != null) {
            bVar.a(cVar);
            b bVar2 = this.aB;
            if (cVar != null) {
                if (cVar.as() != -1) {
                    v2 = cVar.as();
                } else {
                    v2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false).v();
                }
            } else {
                v2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false).v();
            }
            bVar2.a(v2, com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false).x());
        }
    }

    public void setCloseAlert(int i) {
        this.S = i;
    }

    public void setContainerViewOnNotifyListener(com.anythink.expressad.video.module.a.a aVar) {
        this.M = aVar;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setCover(boolean z2) {
        if (this.f_) {
            this.D.setIsCovered(z2);
        }
    }

    public void setDialogRole(int i) {
        this.aw = i == 1;
        n.d(TAG, i + " " + this.aw);
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.aq = i;
        this.ar = i2;
        this.as = i3;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setInstallDialogState(boolean z2) {
        this.O = z2;
        this.D.setIsCovered(z2);
    }

    public void setIsIV(boolean z2) {
        this.am = z2;
        b bVar = this.aB;
        if (bVar != null) {
            bVar.a(z2);
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setMiniEndCardState(boolean z2) {
        this.af = z2;
    }

    public void setNotchPadding(final int i, final int i2, final int i3, final int i4) {
        n.d(TAG, "NOTCH VideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (!(Math.max(Math.max(layoutParams.leftMargin, layoutParams.rightMargin), Math.max(layoutParams.topMargin, layoutParams.bottomMargin)) > Math.max(Math.max(i, i2), Math.max(i3, i4)))) {
            this.H.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.8
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = AnythinkVideoView.this.b_;
                    if (cVar != null && !cVar.j() && AnythinkVideoView.this.b_.f() != 2) {
                        AnythinkVideoView.this.H.setPadding(i, i3, i2, i4);
                        AnythinkVideoView.this.H.startAnimation(AnythinkVideoView.this.aA);
                    }
                    AnythinkVideoView.this.H.setVisibility(0);
                }
            }, 200L);
        }
        if (this.F.getVisibility() == 0) {
            n();
        }
    }

    public void setPlayURL(String str) {
        this.P = str;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setScaleFitXY(int i) {
        this.al = i;
    }

    public void setShowingAlertViewCover(boolean z2) {
        this.D.setIsCovered(z2);
    }

    public void setShowingTransparent(boolean z2) {
        this.ak = z2;
    }

    public void setSoundState(int i) {
        this.ao = i;
    }

    public void setUnitId(String str) {
        this.W = str;
        b bVar = this.aB;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public void setVideoLayout(c cVar) {
        if (cVar != null) {
            this.b_ = cVar;
            this.i_ = cVar.j();
        }
        if (this.i_) {
            new com.anythink.expressad.video.dynview.i.c();
            com.anythink.expressad.video.dynview.c a2 = com.anythink.expressad.video.dynview.i.c.a(this, cVar);
            com.anythink.expressad.video.dynview.b.a();
            com.anythink.expressad.video.dynview.b.a(a2, new AnonymousClass1(this));
            return;
        }
        int findLayout = findLayout(s);
        if (findLayout > 0) {
            this.c_.inflate(findLayout, this);
            b();
        }
        an = false;
    }

    public void setVideoSkipTime(int i) {
        this.Q = i;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setVisible(int i) {
        setVisibility(i);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showAlertView() {
        if (this.af) {
            return;
        }
        if (this.V == null) {
            this.V = new com.anythink.expressad.widget.a.b() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.6
                @Override // com.anythink.expressad.widget.a.b
                public final void a() {
                    AnythinkVideoView.this.N = false;
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.N);
                    if (AnythinkVideoView.this.am && (AnythinkVideoView.this.aq == com.anythink.expressad.foundation.g.a.cs || AnythinkVideoView.this.aq == com.anythink.expressad.foundation.g.a.cr)) {
                        AnythinkVideoView.this.au = true;
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.e_;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        AnythinkVideoView.this.ay = true;
                        AnythinkVideoView.this.gonePlayingCloseView();
                    }
                    AnythinkVideoView.this.i();
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void b() {
                    AnythinkVideoView.this.N = false;
                    AnythinkVideoView.this.av = true;
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.N);
                    if (!AnythinkVideoView.this.am || AnythinkVideoView.this.aq != com.anythink.expressad.foundation.g.a.cr) {
                        if (AnythinkVideoView.this.am && AnythinkVideoView.this.aq == com.anythink.expressad.foundation.g.a.cs) {
                            AnythinkVideoView.this.i();
                            return;
                        }
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.e_;
                        if (aVar != null) {
                            aVar.a(2, "");
                            return;
                        }
                        return;
                    }
                    AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                    com.anythink.expressad.video.module.a.a aVar2 = anythinkVideoView2.e_;
                    if (aVar2 != null) {
                        aVar2.a(2, anythinkVideoView2.b(anythinkVideoView2.ax));
                    }
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void c() {
                    a();
                }
            };
        }
        if (this.U == null) {
            this.U = new com.anythink.expressad.widget.a.a(getContext(), this.V);
        }
        if (this.am) {
            this.U.a(this.aq, this.W);
        } else {
            this.U.b();
        }
        PlayerView playerView = this.D;
        if (playerView == null || playerView.isComplete()) {
            return;
        }
        this.U.show();
        this.at = true;
        this.N = true;
        setShowingAlertViewCover(true);
        com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false);
        this.ap = d.I();
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.e_.a(8, "");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        n.b(TAG, "showVideoLocation marginTop:" + i + " marginLeft:" + i2 + " width:" + i3 + "  height:" + i4 + " radius:" + i5 + " borderTop:" + i6 + " borderLeft:" + i7 + " borderWidth:" + i8 + " borderHeight:" + i9);
        if (this.f_) {
            this.H.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.H.getVisibility() != 0) {
                this.H.setVisibility(0);
            }
            if (this.F.getVisibility() == 0) {
                n();
            }
            if ((i3 > 0 && i4 > 0 && s.f(this.a_) >= i3 && s.e(this.a_) >= i4) && !this.ac) {
                y = i6;
                z = i7;
                A = i8 + 4;
                B = i9 + 4;
                float f = i3 / i4;
                float f2 = 0.0f;
                try {
                    f2 = (float) (this.aa / this.ab);
                } catch (Throwable th) {
                    n.b(TAG, th.getMessage(), th);
                }
                if (i5 > 0) {
                    x = i5;
                    if (i5 > 0) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(s.b(getContext(), i5));
                        gradientDrawable.setColor(-1);
                        gradientDrawable.setStroke(1, 0);
                        setBackground(gradientDrawable);
                        this.D.setBackground(gradientDrawable);
                        setClipToOutline(true);
                        this.D.setClipToOutline(true);
                    }
                }
                if (Math.abs(f - f2) > 0.1f && this.al != 1) {
                    l();
                    videoOperate(1);
                    return;
                }
                l();
                if (this.ak) {
                    setLayoutCenter(i3, i4);
                    if (an) {
                        this.e_.a(114, "");
                        return;
                    } else {
                        this.e_.a(116, "");
                        return;
                    }
                }
                setLayoutParam(i2, i, i3, i4);
                return;
            }
            l();
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i, int i2) {
        soundOperate(i, i2, "2");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void videoOperate(int i) {
        wo1.Z(i, "VideoView videoOperate:", TAG);
        if (this.f_) {
            if (i == 1) {
                if (getVisibility() == 0 && isfront()) {
                    n.a(TAG, "VideoView videoOperate:play");
                    if (this.N || this.af || this.O || com.anythink.expressad.foundation.f.b.c) {
                        return;
                    }
                    i();
                }
            } else if (i == 2) {
                if (getVisibility() == 0) {
                    n.a(TAG, "VideoView videoOperate:pause");
                    h();
                }
            } else if (i == 3) {
                if (this.ae) {
                    return;
                }
                this.D.release();
                this.ae = true;
            } else if (i == 5) {
                this.O = true;
                if (this.ae) {
                    return;
                }
                h();
            } else if (i == 4) {
                this.O = false;
                if (this.ae || isMiniCardShowing()) {
                    return;
                }
                i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        boolean f = f();
        this.f_ = f;
        if (!f) {
            n.d(TAG, "AnythinkVideoView init fail");
        }
        c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.aA = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int i;
        com.anythink.expressad.video.module.a.a aVar;
        try {
            if (this.am && ((i = this.aq) == com.anythink.expressad.foundation.g.a.cr || i == com.anythink.expressad.foundation.g.a.cs)) {
                if (this.at) {
                    if (i != com.anythink.expressad.foundation.g.a.cs || (aVar = this.e_) == null) {
                        return;
                    }
                    aVar.a(2, b(this.ax));
                    return;
                } else if (i == com.anythink.expressad.foundation.g.a.cs && this.az) {
                    com.anythink.expressad.video.module.a.a aVar2 = this.e_;
                    if (aVar2 != null) {
                        aVar2.a(2, b(this.ax));
                        return;
                    }
                    return;
                } else if (this.aw) {
                    int curPosition = this.D.getCurPosition() / 1000;
                    int bi = (int) ((curPosition / (this.D.getDuration() == 0 ? this.b_.bi() : this.D.getDuration())) * 100.0f);
                    if (this.aq == com.anythink.expressad.foundation.g.a.cr) {
                        h();
                        int i2 = this.ar;
                        if (i2 == com.anythink.expressad.foundation.g.a.ct && bi >= this.as) {
                            com.anythink.expressad.video.module.a.a aVar3 = this.e_;
                            if (aVar3 != null) {
                                aVar3.a(2, b(this.ax));
                                return;
                            }
                            return;
                        } else if (i2 == com.anythink.expressad.foundation.g.a.cu && curPosition >= this.as) {
                            com.anythink.expressad.video.module.a.a aVar4 = this.e_;
                            if (aVar4 != null) {
                                aVar4.a(2, b(this.ax));
                                return;
                            }
                            return;
                        } else {
                            com.anythink.expressad.video.module.a.a aVar5 = this.e_;
                            if (aVar5 != null) {
                                aVar5.a(8, "");
                            }
                        }
                    }
                    if (this.aq == com.anythink.expressad.foundation.g.a.cs) {
                        int i3 = this.ar;
                        if (i3 == com.anythink.expressad.foundation.g.a.ct && bi >= this.as) {
                            h();
                            com.anythink.expressad.video.module.a.a aVar6 = this.e_;
                            if (aVar6 != null) {
                                aVar6.a(8, "");
                                return;
                            }
                            return;
                        } else if (i3 != com.anythink.expressad.foundation.g.a.cu || curPosition < this.as) {
                            return;
                        } else {
                            h();
                            com.anythink.expressad.video.module.a.a aVar7 = this.e_;
                            if (aVar7 != null) {
                                aVar7.a(8, "");
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            c cVar = this.b_;
            if (cVar != null && cVar.f() != 2) {
                int i4 = this.b_.i();
                if (((i4 > 0 && this.D.getCurPosition() / 1000 < i4) || i4 == 0) && this.S == 1 && !this.ak) {
                    h();
                    com.anythink.expressad.video.module.a.a aVar8 = this.e_;
                    if (aVar8 != null) {
                        aVar8.a(8, "");
                        return;
                    }
                    return;
                }
                com.anythink.expressad.video.module.a.a aVar9 = this.e_;
                if (aVar9 != null) {
                    aVar9.a(2, "");
                    return;
                }
                return;
            }
            com.anythink.expressad.video.module.a.a aVar10 = this.e_;
            if (aVar10 != null) {
                aVar10.a(2, "");
            }
        } catch (Exception e) {
            n.d(TAG, e.getMessage());
        }
    }

    private boolean f() {
        try {
            this.D = (PlayerView) findViewById(findID("anythink_vfpv"));
            this.E = (SoundImageView) findViewById(findID("anythink_sound_switch"));
            this.F = (TextView) findViewById(findID("anythink_tv_count"));
            View findViewById = findViewById(findID("anythink_rl_playing_close"));
            this.G = findViewById;
            findViewById.setVisibility(4);
            this.H = (RelativeLayout) findViewById(findID("anythink_top_control"));
            this.I = (ImageView) findViewById(findID("anythink_videoview_bg"));
            this.J = (ProgressBar) findViewById(findID("anythink_video_progress_bar"));
            this.K = (FeedBackButton) findViewById(findID("anythink_native_endcard_feed_btn"));
            return isNotNULL(this.D, this.E, this.F, this.G);
        } catch (Throwable th) {
            n.b(TAG, th.getMessage(), th);
            return false;
        }
    }

    private void g() {
        c cVar = this.b_;
        if (cVar == null || !v.b(cVar.T())) {
            return;
        }
        String T = this.b_.T();
        n.b(TAG, "AnythinkBaseView videoResolution:".concat(String.valueOf(T)));
        String[] split = T.split("x");
        if (split.length == 2) {
            if (s.b(split[0]) > zg2.s) {
                this.aa = s.b(split[0]);
            }
            if (s.b(split[1]) > zg2.s) {
                this.ab = s.b(split[1]);
            }
            n.b(TAG, "AnythinkBaseView mVideoW:" + this.aa + "  mVideoH:" + this.ab);
        }
        if (this.aa <= zg2.s) {
            this.aa = 1280.0d;
        }
        if (this.ab <= zg2.s) {
            this.ab = 720.0d;
        }
    }

    private void h() {
        boolean z2;
        c cVar;
        try {
            PlayerView playerView = this.D;
            if (playerView != null) {
                if (!this.O && !this.N) {
                    z2 = false;
                    playerView.setIsCovered(z2);
                    this.D.onPause();
                    cVar = this.b_;
                    if (cVar != null || cVar.J() == null || this.b_.ay()) {
                        return;
                    }
                    this.b_.az();
                    Context e = m.a().e();
                    c cVar2 = this.b_;
                    com.anythink.expressad.a.a.a(e, cVar2, this.W, cVar2.J().m(), false);
                    return;
                }
                z2 = true;
                playerView.setIsCovered(z2);
                this.D.onPause();
                cVar = this.b_;
                if (cVar != null) {
                }
            }
        } catch (Throwable th) {
            n.b(TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            if (!this.ad) {
                boolean playVideo = this.D.playVideo();
                c cVar = this.b_;
                if (cVar != null && cVar.H() != 2 && !playVideo) {
                    n.d("MediaPlayer", "播放失败");
                    b bVar = this.aB;
                    if (bVar != null) {
                        bVar.onPlayError("play video failed");
                    }
                }
                this.ad = true;
            } else if (this.O || this.N) {
            } else {
                this.D.setIsCovered(false);
                this.D.onResume();
            }
        } catch (Exception e) {
            n.b(TAG, e.getMessage(), e);
        }
    }

    private void j() {
        if (!this.f_ || this.G.getVisibility() == 0) {
            return;
        }
        if (!this.i_ || this.L) {
            this.G.setVisibility(0);
        }
        this.ag = true;
    }

    private void k() {
        if (this.aC || this.aj || this.ah) {
            return;
        }
        this.aC = true;
        int i = this.Q;
        if (i >= 0) {
            if (i == 0) {
                this.aj = true;
            } else {
                new Handler().postDelayed(new AnonymousClass7(), this.Q * 1000);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0168 A[Catch: all -> 0x018a, TryCatch #0 {all -> 0x018a, blocks: (B:33:0x00f7, B:35:0x00fb, B:37:0x0101, B:46:0x013f, B:48:0x014b, B:53:0x015c, B:55:0x0168, B:56:0x0172, B:43:0x0123, B:44:0x0132), top: B:64:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172 A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #0 {all -> 0x018a, blocks: (B:33:0x00f7, B:35:0x00fb, B:37:0x0101, B:46:0x013f, B:48:0x014b, B:53:0x015c, B:55:0x0168, B:56:0x0172, B:43:0x0123, B:44:0x0132), top: B:64:0x00f7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l() {
        double d;
        double d2;
        float f;
        float f2 = s.f(this.a_);
        float e = s.e(this.a_);
        int b2 = s.b(getContext(), 58.0f);
        int b3 = s.b(getContext(), 104.0f);
        c cVar = this.b_;
        if (cVar != null && cVar.f() == 2) {
            int c = this.b_.L().c();
            if (c == 1) {
                f2 -= b2 * 2;
                e -= b3 * 2;
            }
            if (c == 2) {
                f2 -= b3 * 2;
                e -= b2 * 2;
            }
            if (c == 0) {
                if (this.d_ == 1) {
                    f2 -= b2 * 2;
                    f = b3 * 2;
                } else {
                    f2 -= b3 * 2;
                    f = b2 * 2;
                }
                e -= f;
            }
        }
        double d3 = this.aa;
        if (d3 > zg2.s) {
            double d4 = this.ab;
            if (d4 > zg2.s && f2 > 0.0f && e > 0.0f) {
                double d5 = d3 / d4;
                double d6 = f2 / e;
                n.b(TAG, "videoWHDivide:" + d5 + "  screenWHDivide:" + d6);
                double a2 = s.a(Double.valueOf(d5));
                double a3 = s.a(Double.valueOf(d6));
                n.b(TAG, "videoWHDivideFinal:" + a2 + "  screenWHDivideFinal:" + a3);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D.getLayoutParams();
                if (a2 > a3) {
                    layoutParams.width = -1;
                    layoutParams.height = (int) ((f2 * this.ab) / this.aa);
                    layoutParams.gravity = 17;
                } else if (a2 < a3) {
                    layoutParams.width = (int) (e * d5);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    c cVar2 = this.b_;
                    if (cVar2 != null && cVar2.j()) {
                        int b4 = this.b_.L().b();
                        int c2 = this.b_.L().c();
                        if (b4 != 102) {
                            if (b4 == 202) {
                            }
                            if (b4 == 202 && !TextUtils.isEmpty(this.b_.be())) {
                                a(this.b_.be());
                            }
                            if (b4 != 302 || b4 == 802) {
                                d = this.aa;
                                d2 = this.ab;
                                if (d / d2 <= 1.0d) {
                                    layoutParams.width = -1;
                                    layoutParams.height = (int) ((d2 * f2) / d);
                                } else {
                                    int b5 = s.b(getContext(), 220.0f);
                                    layoutParams.width = (int) ((this.aa * b5) / this.ab);
                                    layoutParams.height = b5;
                                }
                            }
                        }
                        if (c2 == 1) {
                            layoutParams.width = -1;
                            layoutParams.gravity = 17;
                            layoutParams.height = (int) (this.ab / (this.aa / f2));
                        } else {
                            layoutParams.height = -1;
                            layoutParams.gravity = 17;
                            layoutParams.width = (int) (e * d5);
                        }
                        if (b4 == 202) {
                            a(this.b_.be());
                        }
                        if (b4 != 302) {
                        }
                        d = this.aa;
                        d2 = this.ab;
                        if (d / d2 <= 1.0d) {
                        }
                    }
                } catch (Throwable th) {
                    n.d(TAG, th.getMessage());
                }
                this.D.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        m();
    }

    private void m() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f_) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D.getLayoutParams();
            int f = s.f(this.a_);
            layoutParams.width = -1;
            layoutParams.height = (f * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.b_.j(this.W);
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), this.W, "_1"), this.b_);
            com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), this.W, "_1"), this.K);
            return;
        }
        FeedBackButton feedBackButton = this.K;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    private int o() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false).x();
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f_) {
            if (this.i_) {
                if (com.anythink.expressad.video.dynview.h.c.a(this.b_) == -1 || com.anythink.expressad.video.dynview.h.c.a(this.b_) == 100) {
                    this.D.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.e_;
                            if (aVar != null) {
                                aVar.a(1, "");
                            }
                        }
                    });
                }
            } else {
                this.D.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.e_;
                        if (aVar != null) {
                            aVar.a(1, "");
                        }
                    }
                });
            }
            this.E.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = 2;
                    if (AnythinkVideoView.this.D != null && AnythinkVideoView.this.D.isSilent()) {
                        i = 1;
                    }
                    com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.e_;
                    if (aVar != null) {
                        aVar.a(5, i);
                    }
                }
            });
            this.G.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkVideoView.this.am) {
                        AnythinkVideoView.this.az = true;
                        if (AnythinkVideoView.this.aw) {
                            AnythinkVideoView.this.e();
                            return;
                        }
                        com.anythink.expressad.video.module.a.a aVar = AnythinkVideoView.this.e_;
                        if (aVar != null) {
                            aVar.a(123, "");
                            return;
                        }
                        return;
                    }
                    AnythinkVideoView.this.e();
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i, int i2, String str) {
        com.anythink.expressad.video.module.a.a aVar;
        if (this.f_) {
            this.ao = i;
            if (i == 1) {
                this.E.setSoundStatus(false);
                this.D.closeSound();
            } else if (i == 2) {
                this.E.setSoundStatus(true);
                this.D.openSound();
            }
            c cVar = this.b_;
            if (cVar != null && cVar.j()) {
                this.E.setVisibility(0);
            } else if (i2 == 1) {
                this.E.setVisibility(8);
            } else if (i2 == 2) {
                this.E.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.e_) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i));
    }

    private void a() {
        int findLayout = findLayout(s);
        if (findLayout > 0) {
            this.c_.inflate(findLayout, this);
            b();
        }
        an = false;
    }

    private void b(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(s.b(getContext(), i));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.D.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.D.setClipToOutline(true);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkVideoView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements com.anythink.expressad.video.dynview.e.d {
        public final /* synthetic */ ViewGroup a;

        public AnonymousClass1(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            if (this.a != null && aVar.a() != null) {
                aVar.a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.a.addView(aVar.a());
            }
            if (aVar.b() != null) {
                for (View view : aVar.b()) {
                    view.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.1.1
                        @Override // com.anythink.expressad.widget.a
                        public final void a(View view2) {
                            JSONObject jSONObject;
                            JSONException e;
                            if (AnythinkVideoView.this.M != null) {
                                try {
                                    jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put(com.anythink.expressad.foundation.g.a.ce, AnythinkVideoView.this.a(0));
                                    } catch (JSONException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        AnythinkVideoView.this.M.a(105, jSONObject);
                                        m.a();
                                    }
                                } catch (JSONException e3) {
                                    jSONObject = null;
                                    e = e3;
                                }
                                AnythinkVideoView.this.M.a(105, jSONObject);
                                m.a();
                            }
                        }
                    });
                }
            }
            AnythinkVideoView.this.b();
            boolean unused = AnythinkVideoView.an = false;
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.c.a aVar) {
            n.d(AnythinkVideoView.TAG, "errorMsg：" + aVar.b());
        }
    }

    private void a(ViewGroup viewGroup, c cVar) {
        new com.anythink.expressad.video.dynview.i.c();
        com.anythink.expressad.video.dynview.c a2 = com.anythink.expressad.video.dynview.i.c.a(viewGroup, cVar);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a2, new AnonymousClass1(viewGroup));
    }

    private static String a(int i, int i2) {
        if (i2 != 0) {
            double d = i / i2;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(s.a(Double.valueOf(d)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i2);
    }

    private int a(c cVar) {
        if (cVar != null) {
            if (cVar.as() != -1) {
                return cVar.as();
            }
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.W, false).v();
    }

    private boolean b(int i, int i2) {
        return i > 0 && i2 > 0 && s.f(this.a_) >= i && s.e(this.a_) >= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z2) {
        if (this.am) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!this.at) {
                    jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cv);
                }
                if (this.av) {
                    jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cx);
                }
                if (this.au) {
                    jSONObject.put("Alert_window_status", com.anythink.expressad.foundation.g.a.cw);
                }
                jSONObject.put("complete_info", z2 ? 1 : 2);
                return jSONObject.toString();
            } catch (Exception unused) {
                n.d(TAG, "getIVRewardStatusString ERROR");
                return "";
            }
        }
        return "";
    }

    private void a(String str) {
        wo1.m0().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.9
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                if (bitmap != null) {
                    try {
                        if (bitmap.isRecycled() || AnythinkVideoView.this.I == null) {
                            return;
                        }
                        AnythinkVideoView.this.I.setVisibility(0);
                        ImageView imageView = AnythinkVideoView.this.I;
                        com.anythink.expressad.video.dynview.h.b.a();
                        imageView.setImageBitmap(com.anythink.expressad.video.dynview.h.b.a(bitmap, 20));
                    } catch (Throwable th) {
                        n.d(AnythinkVideoView.TAG, th.getMessage());
                    }
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                n.d(AnythinkVideoView.TAG, str2);
            }
        });
    }

    public AnythinkVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = false;
        this.O = false;
        this.W = "";
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = false;
        this.ao = 2;
        this.at = false;
        this.au = false;
        this.av = false;
        this.aw = true;
        this.ax = false;
        this.ay = false;
        this.az = false;
        this.aB = new b(this);
        this.aC = false;
    }
}