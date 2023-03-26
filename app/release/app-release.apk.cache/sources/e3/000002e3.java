package com.adssdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
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
public class RowBtnActivity extends og0 {
    private RecyclerView V;
    private ArrayList<Integer> W = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements lg0.d {
        public a() {
        }

        @Override // com.p7700g.p99005.lg0.d
        public void a(View v) {
            RowBtnActivity.this.z0(v);
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
            RowBtnActivity.this.startActivity(new Intent(RowBtnActivity.this, ColumnBtnActivity.class));
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
        return R.layout.activity_row_btn;
    }

    @Override // com.p7700g.p99005.og0
    public void w0() {
        this.W.add(Integer.valueOf((int) R.drawable.row_1));
        this.W.add(Integer.valueOf((int) R.drawable.row_2));
        this.W.add(Integer.valueOf((int) R.drawable.row_3));
        this.W.add(Integer.valueOf((int) R.drawable.row_4));
        this.W.add(Integer.valueOf((int) R.drawable.row_5));
        this.W.add(Integer.valueOf((int) R.drawable.row_6));
        this.V.setNestedScrollingEnabled(false);
        this.V.A0();
        this.V.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.V.setAdapter(new lg0(this, this.W, Integer.valueOf((int) R.layout.adapter_row_btn), ng0.b.none, new a()));
    }
}