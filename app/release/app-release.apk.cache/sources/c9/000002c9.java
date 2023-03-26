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
public class OneBtnActivity_BgBorder extends og0 {
    private ImageView V;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.adssdk.OneBtnActivity_BgBorder$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0005a implements wg3 {
            public C0005a() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                OneBtnActivity_BgBorder.this.startActivity(new Intent(OneBtnActivity_BgBorder.this, OneBtnActivity_BgImg.class));
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ug3.i(OneBtnActivity_BgBorder.this, view);
            ng3.d(OneBtnActivity_BgBorder.this, new C0005a());
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

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (ImageView) findViewById(R.id.next);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new b());
        super.onBackPressed();
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        return R.layout.activity_one_btn_bg_border;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.V.setOnClickListener(new a());
    }
}