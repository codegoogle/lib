package com.lib.adssdk.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.d3;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.zg3;

/* loaded from: classes3.dex */
public class ExitActivity extends d3 {
    public final int T = 5894;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ExitActivity.this.finishAffinity();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ExitActivity.this.onBackPressed();
        }
    }

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        if (d0() != null) {
            d0().w();
        }
        setContentView(zg3.g.a);
        findViewById(zg3.e.v).setOnClickListener(new a());
        findViewById(zg3.e.u).setOnClickListener(new b());
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        ng3.j(this, (ViewGroup) findViewById(zg3.e.i0));
        ng3.g(this, (ViewGroup) findViewById(zg3.e.p));
        super.onResume();
    }
}