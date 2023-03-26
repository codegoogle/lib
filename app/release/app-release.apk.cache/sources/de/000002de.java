package com.adssdk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.superapp.filemanager.R;

/* loaded from: classes.dex */
public class OneBtnActivity_Video extends og0 {
    private VideoView V;
    private ImageView W;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.adssdk.OneBtnActivity_Video$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0008a implements wg3 {
            public C0008a() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                OneBtnActivity_Video.this.startActivity(new Intent(OneBtnActivity_Video.this, TwoBtnActivity_BgImg.class));
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ug3.i(OneBtnActivity_Video.this, view);
            ng3.d(OneBtnActivity_Video.this, new C0008a());
        }
    }

    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setLooping(true);
        }
    }

    /* loaded from: classes.dex */
    public class c implements wg3 {
        public c() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
        }
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (VideoView) findViewById(R.id.videoView);
        this.W = (ImageView) findViewById(R.id.next);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new c());
        super.onBackPressed();
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onPause() {
        this.V.stopPlayback();
        this.V.start();
        super.onPause();
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        if (this.V != null) {
            w0();
        }
        ng3.q(this, (ViewGroup) findViewById(R.id.nativeBottom));
        ng3.g(this, (ViewGroup) findViewById(R.id.bg_layer));
        super.onResume();
    }

    @Override // com.p7700g.p99005.og0
    public int v0() {
        return R.layout.activity_one_btn_video;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.W.setOnClickListener(new a());
        this.V.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bg_one_btn_video));
        this.V.start();
        this.V.requestFocus();
        this.V.setOnPreparedListener(new b());
    }
}