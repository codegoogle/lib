package com.adssdk;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.play.AppUtil;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getLayoutResourceId();

    protected abstract void init();

    protected abstract void initListner();

    private Dialog dialog = null;

    private int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            | View.SYSTEM_UI_FLAG_FULLSCREEN
            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().getDecorView().setSystemUiVisibility(flags);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        setContentView(getLayoutResourceId());

        checkNet();
        init();
        initListner();
    }

    public void checkNet() {
        if (AppUtil.isNetworkConnected(this)) {
            if (dialog != null) {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                    dialog.cancel();
                }
            }
        } else {
            showNoInternetDialog();
        }
    }

    private void showNoInternetDialog() {

        if (dialog == null) {
            dialog = new Dialog(this);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(com.google.ads.R.layout.dialog_no_internet);
            dialog.getWindow().setAttributes(layoutParams);
        }

        if (!dialog.isShowing()) {
            dialog.show();
            ((LinearLayout) dialog.findViewById(com.google.ads.R.id.ln_try_again)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    checkNet();
                }
            });
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        checkNet();
    }
}
