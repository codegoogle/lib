package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.hanks.htextview.scale.ScaleTextView;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.superapp.filemanager.R;

/* loaded from: classes.dex */
public class OneBtnActivity_BgImg extends og0 {
    private ScaleTextView V;
    private ImageView W;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.adssdk.OneBtnActivity_BgImg$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0006a implements wg3 {
            public C0006a() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                OneBtnActivity_BgImg.this.startActivity(new Intent(OneBtnActivity_BgImg.this, OneBtnActivity_BgVideo.class));
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ug3.i(OneBtnActivity_BgImg.this, view);
            ng3.d(OneBtnActivity_BgImg.this, new C0006a());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgImg.this.V.a("Welcome to");
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgImg.this.V.setTextColor(OneBtnActivity_BgImg.this.getResources().getColor(R.color.colorAccent));
            OneBtnActivity_BgImg.this.V.a("Powerful Video Player ");
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgImg.this.V.setTextColor(OneBtnActivity_BgImg.this.getResources().getColor(R.color.colorAccent));
            OneBtnActivity_BgImg.this.V.a("to play videos in all formats");
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OneBtnActivity_BgImg.this.V.setTextColor(OneBtnActivity_BgImg.this.getResources().getColor(R.color.black));
            OneBtnActivity_BgImg.this.V.a("Free Movies in all languages");
        }
    }

    /* loaded from: classes.dex */
    public class f implements wg3 {
        public f() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
        }
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (ScaleTextView) findViewById(R.id.scaleTextView);
        this.W = (ImageView) findViewById(R.id.next);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new f());
        super.onBackPressed();
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new b(), 500L);
        new Handler().postDelayed(new c(), 2500L);
        new Handler().postDelayed(new d(), 4000L);
        new Handler().postDelayed(new e(), 6500L);
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        ng3.r(this, (ViewGroup) findViewById(R.id.nativeTop));
        ng3.q(this, (ViewGroup) findViewById(R.id.nativeBottom));
        ng3.g(this, (ViewGroup) findViewById(R.id.bg_layer));
        super.onResume();
    }

    @Override // com.p7700g.p99005.og0
    public int v0() {
        return R.layout.activity_one_btn_bg_img;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.W.setOnClickListener(new a());
    }
}