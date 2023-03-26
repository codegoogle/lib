package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.p7700g.p99005.j3;
import com.p7700g.p99005.nb2;
import com.p7700g.p99005.pg2;
import com.p7700g.p99005.ui2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends j3 {
    @Override // com.p7700g.p99005.j3
    @x1
    public AppCompatAutoCompleteTextView c(@x1 Context context, @z1 AttributeSet attributeSet) {
        return new ui2(context, attributeSet);
    }

    @Override // com.p7700g.p99005.j3
    @x1
    public AppCompatButton d(@x1 Context context, @x1 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // com.p7700g.p99005.j3
    @x1
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new nb2(context, attributeSet);
    }

    @Override // com.p7700g.p99005.j3
    @x1
    public AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new pg2(context, attributeSet);
    }

    @Override // com.p7700g.p99005.j3
    @x1
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}