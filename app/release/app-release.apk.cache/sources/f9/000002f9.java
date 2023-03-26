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
public class TwoBtnActivity_Video extends og0 implements View.OnClickListener {
    private VideoView V;
    private ImageView W;
    private ImageView X;

    /* loaded from: classes.dex */
    public class a implements MediaPlayer.OnPreparedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setLooping(true);
        }
    }

    /* loaded from: classes.dex */
    public class b implements wg3 {
        public b() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements wg3 {
        public c() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
            TwoBtnActivity_Video.this.startActivity(new Intent(TwoBtnActivity_Video.this, RowBtnActivity.class));
        }
    }

    private void y0(View view) {
        ug3.i(this, view);
        ng3.d(this, new c());
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (VideoView) findViewById(R.id.videoView);
        this.W = (ImageView) findViewById(R.id.btnOne);
        this.X = (ImageView) findViewById(R.id.btnTwo);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new b());
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne /* 2131231096 */:
                y0(view);
                return;
            case R.id.btnTwo /* 2131231097 */:
                y0(view);
                return;
            default:
                return;
        }
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
        return R.layout.activity_two_btn_video;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.W.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.V.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.two_btn_video));
        this.V.start();
        this.V.requestFocus();
        this.V.setOnPreparedListener(new a());
    }
}