package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.s4;
import com.p7700g.p99005.x4;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements p4.b, x4, AdapterView.OnItemClickListener {
    private static final int[] s = {16842964, 16843049};
    private p4 t;
    private int u;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // com.p7700g.p99005.x4
    public int getWindowAnimations() {
        return this.u;
    }

    @Override // com.p7700g.p99005.x4
    public void initialize(p4 p4Var) {
        this.t = p4Var;
    }

    @Override // com.p7700g.p99005.p4.b
    public boolean invokeItem(s4 s4Var) {
        return this.t.O(s4Var, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((s4) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, s, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider(obtainStyledAttributes.getDrawable(1));
        }
        obtainStyledAttributes.recycle();
    }
}