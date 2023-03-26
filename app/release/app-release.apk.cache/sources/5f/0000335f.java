package com.hanks.htextview.scale;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p7700g.p99005.ce3;
import com.p7700g.p99005.qd3;
import com.p7700g.p99005.xd3;

/* loaded from: classes3.dex */
public class ScaleTextView extends xd3 {
    private ce3 s;

    public ScaleTextView(Context context) {
        this(context, null);
    }

    @Override // com.p7700g.p99005.xd3
    public void a(CharSequence charSequence) {
        this.s.c(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.s.b(canvas);
    }

    @Override // com.p7700g.p99005.xd3
    public void setAnimationListener(qd3 qd3Var) {
        this.s.a(qd3Var);
    }

    @Override // com.p7700g.p99005.xd3
    public void setProgress(float f) {
        this.s.j(f);
    }

    public ScaleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ce3 ce3Var = new ce3();
        this.s = ce3Var;
        ce3Var.d(this, attributeSet, i);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}