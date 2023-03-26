package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.eq3;
import com.p7700g.p99005.kr3;
import com.p7700g.p99005.lg0;
import com.p7700g.p99005.mg0;
import com.p7700g.p99005.ng0;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.p7700g.p99005.z1;
import com.smarteist.autoimageslider.SliderView;
import com.superapp.filemanager.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Slider_RecycerViewActivity extends og0 {
    private ArrayList<Integer> V = new ArrayList<>();
    private ArrayList<Integer> W = new ArrayList<>();
    private ArrayList<Integer> X = new ArrayList<>();
    private ArrayList<Integer> Y = new ArrayList<>();
    private SliderView Z;
    private RecyclerView u0;
    private RecyclerView v0;
    private RecyclerView w0;

    /* loaded from: classes.dex */
    public class a implements mg0.c {
        public a() {
        }

        @Override // com.p7700g.p99005.mg0.c
        public void a(View v) {
            Slider_RecycerViewActivity.this.z0(v);
        }
    }

    /* loaded from: classes.dex */
    public class b implements lg0.d {
        public b() {
        }

        @Override // com.p7700g.p99005.lg0.d
        public void a(View v) {
            Slider_RecycerViewActivity.this.z0(v);
        }
    }

    /* loaded from: classes.dex */
    public class c implements lg0.d {
        public c() {
        }

        @Override // com.p7700g.p99005.lg0.d
        public void a(View v) {
            Slider_RecycerViewActivity.this.z0(v);
        }
    }

    /* loaded from: classes.dex */
    public class d implements lg0.d {
        public d() {
        }

        @Override // com.p7700g.p99005.lg0.d
        public void a(View v) {
            Slider_RecycerViewActivity.this.z0(v);
        }
    }

    /* loaded from: classes.dex */
    public class e implements wg3 {
        public e() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
            Slider_RecycerViewActivity.this.startActivity(new Intent(Slider_RecycerViewActivity.this, ChooseRowBtnActivity.class));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(View view) {
        ug3.i(this, view);
        ng3.d(this, new e());
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.Z = (SliderView) findViewById(R.id.slider);
        this.u0 = (RecyclerView) findViewById(R.id.recyclerView1);
        this.v0 = (RecyclerView) findViewById(R.id.recyclerView2);
        this.w0 = (RecyclerView) findViewById(R.id.recyclerView3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new f());
        super.onBackPressed();
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(@z1 Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.p7700g.p99005.og0, com.p7700g.p99005.hx, android.app.Activity
    public void onResume() {
        ng3.q(this, (ViewGroup) findViewById(R.id.nativeBottom));
        ng3.g(this, (ViewGroup) findViewById(R.id.bg_layer));
        super.onResume();
    }

    @Override // com.p7700g.p99005.og0
    public int v0() {
        return R.layout.activity_slider_recycer_view;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.V.add(Integer.valueOf((int) R.drawable.slider_1));
        this.V.add(Integer.valueOf((int) R.drawable.slider_2));
        this.V.add(Integer.valueOf((int) R.drawable.slider_3));
        this.Z.setSliderAdapter(new mg0(this, this.V, new a()));
        this.Z.setIndicatorAnimation(eq3.WORM);
        this.Z.setSliderTransformAnimation(kr3.SIMPLETRANSFORMATION);
        this.Z.setAutoCycleDirection(2);
        this.Z.setIndicatorSelectedColor(-1);
        this.Z.setIndicatorUnselectedColor(-7829368);
        this.Z.setScrollTimeInSec(1);
        this.Z.n();
        this.W.add(Integer.valueOf((int) R.drawable.sr_1_1));
        this.W.add(Integer.valueOf((int) R.drawable.sr_1_2));
        this.W.add(Integer.valueOf((int) R.drawable.sr_1_3));
        this.u0.setLayoutManager(new LinearLayoutManager(this, 0, false));
        RecyclerView recyclerView = this.u0;
        ArrayList<Integer> arrayList = this.W;
        Integer valueOf = Integer.valueOf((int) R.layout.adapter_slider_recycler_view);
        ng0.b bVar = ng0.b.none;
        recyclerView.setAdapter(new lg0(this, arrayList, valueOf, bVar, new b()));
        this.X.add(Integer.valueOf((int) R.drawable.sr_2_1));
        this.X.add(Integer.valueOf((int) R.drawable.sr_2_2));
        this.X.add(Integer.valueOf((int) R.drawable.sr_2_3));
        this.v0.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.v0.setAdapter(new lg0(this, this.X, valueOf, bVar, new c()));
        this.Y.add(Integer.valueOf((int) R.drawable.sr_3_1));
        this.Y.add(Integer.valueOf((int) R.drawable.sr_3_2));
        this.Y.add(Integer.valueOf((int) R.drawable.sr_3_3));
        this.w0.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.w0.setAdapter(new lg0(this, this.Y, valueOf, bVar, new d()));
    }
}