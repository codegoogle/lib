package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.lg0;
import com.p7700g.p99005.ng0;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.superapp.filemanager.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FourBtnActivity extends og0 {
    private RecyclerView V;
    private ArrayList<Integer> W = new ArrayList<>();
    private ImageView X;

    /* loaded from: classes.dex */
    public class a implements lg0.d {
        public a() {
        }

        @Override // com.p7700g.p99005.lg0.d
        public void a(View v) {
            FourBtnActivity.this.z0(v);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FourBtnActivity.this.z0(view);
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

    /* loaded from: classes.dex */
    public class d implements wg3 {
        public d() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
            FourBtnActivity.this.startActivity(new Intent(FourBtnActivity.this, FourBtnActivity_Slider.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(View view) {
        ug3.i(this, view);
        ng3.d(this, new d());
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (RecyclerView) findViewById(R.id.recyclerView);
        this.X = (ImageView) findViewById(R.id.btn1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ng3.f(this, new c());
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
        return R.layout.activity_four_btn;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.W.add(Integer.valueOf((int) R.drawable.four_btn_2));
        this.W.add(Integer.valueOf((int) R.drawable.four_btn_3));
        this.W.add(Integer.valueOf((int) R.drawable.four_btn_4));
        this.W.add(Integer.valueOf((int) R.drawable.four_btn_5));
        this.V.setNestedScrollingEnabled(false);
        this.V.A0();
        this.V.setLayoutManager(new GridLayoutManager(this, 2));
        this.V.setAdapter(new lg0(this, this.W, Integer.valueOf((int) R.layout.adapter_col_btn), ng0.b.none, new a()));
        this.X.setOnClickListener(new b());
    }
}