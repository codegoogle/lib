package com.p7700g.p99005;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.superapp.filemanager.R;

/* compiled from: BaseActivity.java */
/* loaded from: classes.dex */
public abstract class og0 extends d3 {
    private Dialog T = null;
    private int U = 5380;

    /* compiled from: BaseActivity.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            og0.this.u0();
        }
    }

    private void x0() {
        if (this.T == null) {
            this.T = new Dialog(this);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.T.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.T.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.T.requestWindowFeature(1);
            this.T.setCancelable(false);
            this.T.setContentView(R.layout.dialog_no_internet);
            this.T.getWindow().setAttributes(layoutParams);
        }
        if (this.T.isShowing()) {
            return;
        }
        this.T.show();
        ((LinearLayout) this.T.findViewById(R.id.ln_try_again)).setOnClickListener(new a());
    }

    public abstract void N();

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(@z1 Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().getDecorView().setSystemUiVisibility(this.U);
        if (d0() != null) {
            d0().w();
        }
        setContentView(v0());
        u0();
        N();
        w0();
    }

    @Override // com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        super.onResume();
        u0();
    }

    public void u0() {
        if (ug3.k(this)) {
            Dialog dialog = this.T;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.T.dismiss();
            this.T.cancel();
            return;
        }
        x0();
    }

    public abstract int v0();

    public abstract void w0();
}