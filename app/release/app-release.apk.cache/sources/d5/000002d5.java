package com.adssdk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;
import com.hanks.htextview.scale.ScaleTextView;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.superapp.filemanager.R;

/* loaded from: classes.dex */
public class OneBtnActivity_BgVideo extends og0 {
    private ScaleTextView V;
    private VideoView W;
    private ImageView X;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.adssdk.OneBtnActivity_BgVideo$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0007a implements wg3 {
            public C0007a() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                OneBtnActivity_BgVideo.this.startActivity(new Intent(OneBtnActivity_BgVideo.this, OneBtnActivity_Video.class));
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ug3.i(OneBtnActivity_BgVideo.this, view);
            ng3.d(OneBtnActivity_BgVideo.this, new C0007a());
        }
    }

    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            float videoWidth = (mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight()) / (OneBtnActivity_BgVideo.this.W.getWidth() / OneBtnActivity_BgVideo.this.W.getHeight());
            if (videoWidth >= 1.0f) {
                OneBtnActivity_BgVideo.this.W.setScaleX(videoWidth);
            } else {
                OneBtnActivity_BgVideo.this.W.setScaleY(1.0f / videoWidth);
            }
            mediaPlayer.setLooping(true);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgVideo.this.V.setTextColor(OneBtnActivity_BgVideo.this.getResources().getColor(R.color.white));
            OneBtnActivity_BgVideo.this.V.a("Welcome to");
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgVideo.this.V.setTextColor(OneBtnActivity_BgVideo.this.getResources().getColor(R.color.white));
            OneBtnActivity_BgVideo.this.V.a("Caller Screen Theme");
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgVideo.this.V.setTextColor(OneBtnActivity_BgVideo.this.getResources().getColor(R.color.colorAccent));
            OneBtnActivity_BgVideo.this.V.a("Set a live wallpaper,");
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgVideo.this.V.setTextColor(OneBtnActivity_BgVideo.this.getResources().getColor(R.color.white));
            OneBtnActivity_BgVideo.this.V.a("Customize Call Button");
        }
    }

    /* loaded from: classes.dex */
    public class g implements wg3 {
        public g() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
        }
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (ScaleTextView) findViewById(R.id.scaleTextView);
        this.W = (VideoView) findViewById(R.id.videoView);
        this.X = (ImageView) findViewById(R.id.next);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new g());
        super.onBackPressed();
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new c(), 500L);
        new Handler().postDelayed(new d(), 2500L);
        new Handler().postDelayed(new e(), 4000L);
        new Handler().postDelayed(new f(), 6500L);
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onPause() {
        this.W.stopPlayback();
        this.W.start();
        super.onPause();
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        if (this.W != null) {
            w0();
        }
        ng3.q(this, (ViewGroup) findViewById(R.id.nativeBottom));
        ng3.g(this, (ViewGroup) findViewById(R.id.bg_layer));
        super.onResume();
    }

    @Override // com.p7700g.p99005.og0
    public int v0() {
        return R.layout.activity_one_btn_bg_video;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.X.setOnClickListener(new a());
        this.W.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bg_one_btn_video));
        this.W.start();
        this.W.requestFocus();
        this.W.setOnPreparedListener(new b());
    }
}