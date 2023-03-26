package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.kg0;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.og0;
import com.p7700g.p99005.qg0;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.wg3;
import com.superapp.filemanager.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ChooseRowBtnActivity extends og0 {
    private RecyclerView V;
    private ArrayList<qg0> W = new ArrayList<>();
    private ArrayList<qg0> X = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements kg0.b {
        public a() {
        }

        @Override // com.p7700g.p99005.kg0.b
        public void a(View v, Integer pos) {
            ChooseRowBtnActivity.this.z0(v);
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
            ChooseRowBtnActivity.this.startActivity(new Intent(ChooseRowBtnActivity.this, FourBtnActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(View view) {
        ug3.i(this, view);
        ng3.d(this, new c());
    }

    @Override // com.p7700g.p99005.og0
    public void N() {
        this.V = (RecyclerView) findViewById(R.id.recyclerView);
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
        return R.layout.activity_choose_row_btn;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.W.add(new qg0(R.drawable.choose_row_1_unselect, false));
        this.W.add(new qg0(R.drawable.choose_row_2_unselect, false));
        this.W.add(new qg0(R.drawable.choose_row_3_unselect, false));
        this.W.add(new qg0(R.drawable.choose_row_4_unselect, false));
        this.W.add(new qg0(R.drawable.choose_row_5_unselect, false));
        this.W.add(new qg0(R.drawable.choose_row_6_unselect, false));
        this.W.add(new qg0(R.drawable.choose_row_7_unselect, false));
        this.X.add(new qg0(R.drawable.choose_row_1_select, false));
        this.X.add(new qg0(R.drawable.choose_row_2_select, false));
        this.X.add(new qg0(R.drawable.choose_row_3_select, false));
        this.X.add(new qg0(R.drawable.choose_row_4_select, false));
        this.X.add(new qg0(R.drawable.choose_row_5_select, false));
        this.X.add(new qg0(R.drawable.choose_row_6_select, false));
        this.X.add(new qg0(R.drawable.choose_row_7_select, false));
        this.V.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.V.setAdapter(new kg0(this, this.W, this.X, Integer.valueOf((int) R.layout.adapter_choose_row_btn), new a()));
    }
}