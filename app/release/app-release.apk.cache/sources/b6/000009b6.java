package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.f.b;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerErrorConstant;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.bt.a.c;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.widget.FeedBackButton;
import com.p7700g.p99005.wo1;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkBTVideoView extends BTBaseView {
    private static boolean H = false;
    private static final String N = "2";
    private static final String p = "anythink_reward_videoview_item";
    private a A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private int F;
    private String G;
    private boolean I;
    private boolean J;
    private boolean K;
    private RelativeLayout L;
    private ProgressBar M;
    private PlayerView q;
    private SoundImageView r;
    private TextView s;
    private View t;
    private FeedBackButton u;
    private WebView v;
    private com.anythink.expressad.videocommon.b.a w;
    private int x;
    private int y;
    private int z;

    /* loaded from: classes2.dex */
    public static final class a extends DefaultVideoPlayerStatusListener {
        private AnythinkBTVideoView a;
        private WebView b;
        private String c;
        private String d;
        private int e;
        private int f;
        private boolean g;
        private int k;
        private int l;
        private boolean h = false;
        private boolean i = false;
        private boolean j = false;
        private boolean m = false;

        public a(AnythinkBTVideoView anythinkBTVideoView, WebView webView) {
            this.a = anythinkBTVideoView;
            this.b = webView;
            this.c = anythinkBTVideoView.d;
            this.d = anythinkBTVideoView.c;
        }

        private int a() {
            return this.e;
        }

        private void b() {
            this.a = null;
            this.b = null;
            boolean unused = AnythinkBTVideoView.H = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals("play buffering tiemout")) && this.b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.n);
                        jSONObject.put("id", this.c);
                        jSONObject.put("data", new JSONObject());
                        j.a();
                        j.a(this.b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        c.a();
                        c.a(this.b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            AnythinkBTVideoView anythinkBTVideoView = this.a;
            com.anythink.expressad.foundation.d.c cVar = anythinkBTVideoView.b;
            if (cVar == null) {
                anythinkBTVideoView.s.setText("0");
            } else if (cVar.i() > 0) {
                this.a.s.setText(h.a(m.a().e(), "anythink_reward_video_view_reward_time_complete", "string"));
            } else {
                this.a.s.setText("0");
            }
            this.a.q.setClickable(false);
            WebView webView = this.b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.c);
            }
            this.e = this.f;
            boolean unused = AnythinkBTVideoView.H = true;
            this.a.stop();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.o);
                    jSONObject.put("id", this.c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.c);
                    jSONObject.put("data", jSONObject2);
                    j.a();
                    j.a(this.b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    c.a();
                    c.a(this.b, e.getMessage());
                }
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i, int i2) {
            String str;
            super.onPlayProgress(i, i2);
            AnythinkBTVideoView anythinkBTVideoView = this.a;
            if (anythinkBTVideoView.h) {
                int i3 = 0;
                com.anythink.expressad.foundation.d.c cVar = anythinkBTVideoView.b;
                if (cVar != null) {
                    i3 = cVar.i();
                    b.a().a(this.a.b.I() + "_1", i);
                }
                if (i3 > i2) {
                    i3 = i2;
                }
                int i4 = i3 <= 0 ? i2 - i : i3 - i;
                if (i4 <= 0) {
                    str = i3 <= 0 ? "0" : (String) this.a.getContext().getResources().getText(h.a(m.a().e(), "anythink_reward_video_view_reward_time_complete", "string"));
                } else if (i3 <= 0) {
                    str = String.valueOf(i4);
                } else {
                    str = i4 + ((String) this.a.getContext().getResources().getText(h.a(m.a().e(), "anythink_reward_video_view_reward_time_left", "string")));
                }
                this.a.s.setText(str);
            }
            this.f = i2;
            this.e = i;
            this.a.M.setMax(this.f);
            this.a.M.setProgress(this.e);
            if (this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.n);
                    jSONObject.put("id", this.c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.c);
                    jSONObject2.put("progress", AnythinkBTVideoView.b(i, i2));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put("duration", String.valueOf(i2));
                    jSONObject.put("data", jSONObject2);
                    j.a();
                    j.a(this.b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    c.a();
                    c.a(this.b, e.getMessage());
                }
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.g) {
                this.a.M.setMax(i);
                WebView webView = this.b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.c);
                }
                this.g = true;
            }
            boolean unused = AnythinkBTVideoView.H = false;
        }

        public final void a(int i, int i2) {
            this.k = i;
            this.l = i2;
        }
    }

    public AnythinkBTVideoView(Context context) {
        super(context);
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.B = 2;
        this.D = false;
        this.E = 2;
        this.F = 1;
        this.I = false;
        this.J = false;
        this.K = false;
    }

    private int f() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.c, false).x();
    }

    public int getMute() {
        return this.B;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout(p);
        if (findLayout > 0) {
            this.f.inflate(findLayout, this);
            boolean b = b();
            this.h = b;
            if (!b) {
                n.d(BTBaseView.TAG, "AnythinkVideoView init fail");
            }
            a();
        }
        H = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.K) {
            c.a();
            this.E = c.e(this.c);
        }
        View view = this.t;
        if (view != null) {
            view.setVisibility(this.y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.r;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.z == 0 ? 8 : 0);
        }
        TextView textView = this.s;
        if (textView != null) {
            textView.setVisibility(this.x != 0 ? 0 : 8);
            if (this.s.getVisibility() == 0 && b.a().b()) {
                this.b.j(this.c);
                b.a().a(wo1.C(new StringBuilder(), this.c, "_1"), this.b);
                b.a().a(wo1.C(new StringBuilder(), this.c, "_1"), this.u);
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.q;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.q.release();
                this.q = null;
            }
            SoundImageView soundImageView = this.r;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.t;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.v != null) {
                this.v = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            n.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.q;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.J = isPlayIng;
            this.q.setIsBTVideoPlaying(isPlayIng);
            this.q.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.q;
        if (playerView != null) {
            playerView.setDesk(true);
            this.q.setIsCovered(false);
            if (this.J) {
                this.q.start(true);
            }
        }
    }

    public void onStop() {
        PlayerView playerView = this.q;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.q;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.d);
                }
            }
        } catch (Exception e) {
            n.b(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void play() {
        try {
            if (!this.K) {
                if (this.E == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                if (!this.q.playVideo()) {
                    n.d("MediaPlayer", "播放失败");
                    a aVar = this.A;
                    if (aVar != null) {
                        aVar.onPlayError("play video failed");
                    }
                }
                this.K = true;
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.d);
                    return;
                }
                return;
            }
            if (this.D) {
                this.q.playVideo(0);
                this.D = false;
            } else {
                this.q.start(false);
            }
            WebView webView2 = this.v;
            if (webView2 != null) {
                BTBaseView.a(webView2, "onPlayerPlay", this.d);
            }
        } catch (Exception e) {
            n.b(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.q;
            if (playerView != null && this.v != null) {
                playerView.closeSound();
                this.r.setSoundStatus(false);
                this.B = 1;
                BTBaseView.a(this.v, "onPlayerMute", this.d);
                return true;
            }
        } catch (Exception e) {
            n.d(BTBaseView.TAG, e.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.q;
            if (playerView == null || this.v == null) {
                return false;
            }
            playerView.openSound();
            this.r.setSoundStatus(true);
            this.B = 2;
            BTBaseView.a(this.v, "onUnmute", this.d);
            return true;
        } catch (Exception e) {
            n.d(BTBaseView.TAG, e.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        String str;
        int v;
        if (this.b.u() != 94 && this.b.u() != 287) {
            str = this.b.aZ() + this.b.R() + this.b.z();
        } else {
            str = this.b.aa() + this.b.aZ() + this.b.R();
        }
        com.anythink.expressad.videocommon.b.a a2 = com.anythink.expressad.videocommon.b.c.a().a(this.c, str);
        if (a2 != null) {
            this.w = a2;
        }
        this.C = e();
        String d = d();
        this.G = d;
        if (this.h && !TextUtils.isEmpty(d) && this.b != null) {
            a aVar = new a(this, this.v);
            this.A = aVar;
            com.anythink.expressad.foundation.d.c cVar = this.b;
            if (cVar != null) {
                if (cVar.as() != -1) {
                    v = cVar.as();
                } else {
                    v = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.c, false).v();
                }
            } else {
                v = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.c, false).v();
            }
            aVar.a(v, com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.c, false).x());
            this.q.setDesk(false);
            this.q.initBufferIngParam(this.C);
            this.q.initVFPData(this.G, this.b.R(), this.w.p(), this.A);
            soundOperate(this.B, -1, null);
        }
        H = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.q;
            if (playerView != null) {
                if (this.D) {
                    playerView.playVideo(0);
                    this.D = false;
                } else {
                    playerView.onResume();
                }
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.d);
                }
            }
        } catch (Exception e) {
            n.d(BTBaseView.TAG, e.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setCampaign(com.anythink.expressad.foundation.d.c cVar) {
        super.setCampaign(cVar);
        if (cVar != null && cVar.i() > 0) {
            this.s.setBackgroundResource(h.a(m.a().e(), "anythink_reward_video_time_count_num_bg", h.c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, s.b(m.a().e(), 30.0f));
            int b = s.b(m.a().e(), 5.0f);
            layoutParams.setMargins(b, 0, 0, 0);
            this.s.setPadding(b, 0, b, 0);
            this.s.setLayoutParams(layoutParams);
            return;
        }
        this.s.setBackgroundResource(h.a(m.a().e(), "anythink_reward_shape_progress", h.c));
        this.s.setWidth(s.b(m.a().e(), 30.0f));
    }

    public void setCloseViewVisable(int i) {
        this.t.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.v = webView;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.L.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.L.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.L.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.L.getPaddingBottom();
        }
        n.d(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.L.setPadding(i, i3, i2, i4);
    }

    public void setOrientation(int i) {
        this.F = i;
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.q;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.M;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
        }
    }

    public void setShowClose(int i) {
        this.y = i;
    }

    public void setShowMute(int i) {
        this.z = i;
    }

    public void setShowTime(int i) {
        this.x = i;
    }

    public void setSoundImageViewVisble(int i) {
        this.r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.q;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.h) {
            this.B = i;
            if (i == 1) {
                this.r.setSoundStatus(false);
                this.q.closeSound();
            } else if (i == 2) {
                this.r.setSoundStatus(true);
                this.q.openSound();
            }
            if (i2 == 1) {
                this.r.setVisibility(8);
            } else if (i2 == 2) {
                this.r.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.q;
            if (playerView != null) {
                playerView.pause();
                this.q.stop();
                try {
                    this.q.prepare();
                    this.q.justSeekTo(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.d);
                }
            }
        } catch (Exception e2) {
            n.b(BTBaseView.TAG, e2.getMessage(), e2);
        }
    }

    private boolean b() {
        try {
            this.q = (PlayerView) findViewById(findID("anythink_vfpv"));
            this.r = (SoundImageView) findViewById(findID("anythink_sound_switch"));
            this.s = (TextView) findViewById(findID("anythink_tv_count"));
            this.t = findViewById(findID("anythink_rl_playing_close"));
            this.L = (RelativeLayout) findViewById(findID("anythink_top_control"));
            this.M = (ProgressBar) findViewById(findID("anythink_video_progress_bar"));
            this.q.setIsBTVideo(true);
            this.u = (FeedBackButton) findViewById(findID("anythink_native_endcard_feed_btn"));
            return isNotNULL(this.q, this.r, this.s, this.t);
        } catch (Throwable th) {
            n.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private void c() {
        String str;
        if (this.b.u() != 94 && this.b.u() != 287) {
            str = this.b.aZ() + this.b.R() + this.b.z();
        } else {
            str = this.b.aa() + this.b.aZ() + this.b.R();
        }
        com.anythink.expressad.videocommon.b.a a2 = com.anythink.expressad.videocommon.b.c.a().a(this.c, str);
        if (a2 != null) {
            this.w = a2;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.b.R();
            com.anythink.expressad.videocommon.b.a aVar = this.w;
            if (aVar == null || aVar.h() != 5) {
                return str;
            }
            String d = this.w.d();
            return !v.a(d) ? new File(d).exists() ? d : str : str;
        } catch (Throwable th) {
            n.b(BTBaseView.TAG, th.getMessage(), th);
            return str;
        }
    }

    private static int e() {
        try {
            com.anythink.expressad.videocommon.e.a b = com.anythink.expressad.videocommon.e.c.a().b();
            if (b == null) {
                com.anythink.expressad.videocommon.e.c.a();
                com.anythink.expressad.videocommon.e.c.c();
            }
            r0 = b != null ? (int) b.g() : 5;
            n.b(BTBaseView.TAG, "AnythinkBaseView buffetTimeout:".concat(String.valueOf(r0)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.h) {
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean isSilent = AnythinkBTVideoView.this.q.isSilent();
                    if (AnythinkBTVideoView.this.v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.n);
                            jSONObject.put("id", AnythinkBTVideoView.this.d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", AnythinkBTVideoView.this.B);
                            jSONObject.put("data", jSONObject2);
                            j.a();
                            j.a(AnythinkBTVideoView.this.v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            n.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + AnythinkBTVideoView.this.B);
                        } catch (Exception e) {
                            c.a();
                            c.a(AnythinkBTVideoView.this.v, e.getMessage());
                        }
                    }
                }
            });
            this.t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.v != null) {
                        BTBaseView.a(AnythinkBTVideoView.this.v, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.n);
                            jSONObject.put("id", AnythinkBTVideoView.this.d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            j.a();
                            j.a(AnythinkBTVideoView.this.v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            c.a();
                            c.a(AnythinkBTVideoView.this.v, "onClicked", AnythinkBTVideoView.this.d);
                        }
                    }
                }
            });
        }
    }

    private int a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            if (cVar.as() != -1) {
                return cVar.as();
            }
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.c, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.c, false).v();
    }

    public AnythinkBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.B = 2;
        this.D = false;
        this.E = 2;
        this.F = 1;
        this.I = false;
        this.J = false;
        this.K = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, int i2) {
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
}