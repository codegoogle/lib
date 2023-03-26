package com.lib.adssdk.Vpage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.airbnb.lottie.LottieAnimationView;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.R;
import com.lib.adssdk.Utils.Const;


public class VpageActivity extends Dialog {

    public Activity activity;
    public ClickOnButton clickOnButton;

    public interface ClickOnButton {
        public void buttonClick();
    }

    public VpageActivity(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    public void setClickOnButton(ClickOnButton clickOnButton) {
        this.clickOnButton = clickOnButton;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_vpage);

        LottieAnimationView lottie = findViewById(R.id.lottie);
        TextView texttt = findViewById(R.id.texttt);
        TextView textData = findViewById(R.id.textData);
        RelativeLayout continue_btn = findViewById(R.id.continue_btn);

        if (!MyApp.getString(Const.v_policy_page).equals("")) {
            textData.setText("" + MyApp.getString(Const.v_policy_page));
        }

        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lottie.setVisibility(View.VISIBLE);
                texttt.setVisibility(View.GONE);

                clickOnButton.buttonClick();
            }
        });

    }
}
