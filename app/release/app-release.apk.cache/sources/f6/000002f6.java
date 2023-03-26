package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.superapp.filemanager.R;

/* loaded from: classes.dex */
public class TwoBtnActivity_BgImg extends og0 implements View.OnClickListener {
    private ImageView V;
    private ImageView W;

    /* loaded from: classes.dex */
    public class a implements wg3 {
        public a() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements wg3 {
        public b() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
            TwoBtnActivity_BgImg.this.startActivity(new Intent(TwoBtnActivity_BgImg.this, TwoBtnActivity_Video.class));
        }
    }

    private void y0(View view) {
        ug3.i(this, view);
        ng3.d(this, new b());
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (ImageView) findViewById(R.id.btnOne);
        this.W = (ImageView) findViewById(R.id.btnTwo);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new a());
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

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        ng3.i(this, (ViewGroup) findViewById(R.id.nativeTop));
        ng3.q(this, (ViewGroup) findViewById(R.id.nativeBottom));
        ng3.g(this, (ViewGroup) findViewById(R.id.bg_layer));
        super.onResume();
    }

    @Override // com.p7700g.p99005.og0
    public int v0() {
        return R.layout.activity_two_btn_bg_img;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.V.setOnClickListener(this);
        this.W.setOnClickListener(this);
    }
}