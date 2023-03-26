package com.adssdk;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p7700g.p99005.eq3;
import com.p7700g.p99005.kr3;
import com.p7700g.p99005.mg0;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.smarteist.autoimageslider.SliderView;
import com.superapp.filemanager.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FourBtnActivity_Slider extends og0 implements View.OnClickListener {
    private ImageView V;
    private ImageView W;
    private ImageView X;
    private ImageView Y;
    private SliderView Z;
    private ArrayList<Integer> u0 = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements mg0.c {
        public a() {
        }

        @Override // com.p7700g.p99005.mg0.c
        public void a(View v) {
            FourBtnActivity_Slider.this.z0(v);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(View view) {
        ug3.i(this, view);
        ng3.d(this, new c());
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.Z = (SliderView) findViewById(R.id.slider);
        this.V = (ImageView) findViewById(R.id.btn1);
        this.W = (ImageView) findViewById(R.id.btn2);
        this.X = (ImageView) findViewById(R.id.btn3);
        this.Y = (ImageView) findViewById(R.id.btn4);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new b());
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
        z0(view);
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
        return R.layout.activity_four_btn_slider;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.V.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.Y.setOnClickListener(this);
        ArrayList<Integer> arrayList = this.u0;
        Integer valueOf = Integer.valueOf((int) R.drawable.four_btn_slider_1);
        arrayList.add(valueOf);
        this.u0.add(valueOf);
        this.u0.add(valueOf);
        this.Z.setSliderAdapter(new mg0(this, this.u0, new a()));
        this.Z.setIndicatorAnimation(eq3.WORM);
        this.Z.setSliderTransformAnimation(kr3.SIMPLETRANSFORMATION);
        this.Z.setAutoCycleDirection(2);
        this.Z.setIndicatorSelectedColor(-1);
        this.Z.setIndicatorUnselectedColor(-7829368);
        this.Z.setScrollTimeInSec(1);
        this.Z.n();
    }
}