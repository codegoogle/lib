package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.ads.Activity.ExitActivity;
import com.google.ads.Activity.PrivacyPolicyActivity;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.superapp.filemanager.R;

/* loaded from: classes.dex */
public class StartActivity_Two extends og0 implements View.OnClickListener {
    public ImageView V;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.adssdk.StartActivity_Two$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0010a implements wg3 {
            public C0010a() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                if (!ug3.a()) {
                    StartActivity_Two.this.z0();
                } else {
                    StartActivity_Two.this.startActivity(new Intent(StartActivity_Two.this, OneBtnActivity_BgBorder.class));
                }
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng3.v(StartActivity_Two.this, new C0010a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        if (ug3.d().intValue() == 0) {
            startActivity(new Intent(this, OneBtnActivity_BgBorder.class));
        } else if (ug3.d().intValue() == 1) {
            startActivity(new Intent(this, OneBtnActivity_BgBorder.class));
        } else {
            startActivity(new Intent(this, OneBtnActivity_BgBorder.class));
        }
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (ImageView) findViewById(R.id.start);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, ExitActivity.class));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.policy) {
            startActivity(new Intent(this, PrivacyPolicyActivity.class));
        } else if (id == R.id.rate) {
            ug3.g(this);
        } else if (id != R.id.share) {
        } else {
            ug3.h(this);
        }
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        super.onResume();
        ng3.j(this, (ViewGroup) findViewById(R.id.nativeTop));
        ng3.q(this, (ViewGroup) findViewById(R.id.nativeBottom));
        ng3.g(this, (ViewGroup) findViewById(R.id.bg_layer));
    }

    @Override // com.p7700g.p99005.og0
    public int v0() {
        return R.layout.activity_start_two;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.V.setOnClickListener(new a());
        findViewById(R.id.share).setOnClickListener(this);
        findViewById(R.id.rate).setOnClickListener(this);
        findViewById(R.id.policy).setOnClickListener(this);
    }
}