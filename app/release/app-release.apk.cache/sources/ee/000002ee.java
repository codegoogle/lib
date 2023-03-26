package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import com.p7700g.p99005.d3;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.mf3;
import com.superapp.filemanager.R;

/* loaded from: classes.dex */
public class SplashActivity extends d3 {
    private int T = 5894;

    /* loaded from: classes.dex */
    public class a implements mf3.n {
        public a() {
        }

        @Override // com.p7700g.p99005.mf3.n
        public void a(String error) {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this, StartActivity_One.class));
        }

        @Override // com.p7700g.p99005.mf3.n
        public void b() {
        }

        @Override // com.p7700g.p99005.mf3.n
        public void c() {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this, StartActivity_One.class));
        }
    }

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    @e2(api = 23)
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().getDecorView().setSystemUiVisibility(this.T);
        if (d0() != null) {
            d0().w();
        }
        setContentView(R.layout.activity_splash);
        mf3.j(this, new a());
    }
}