package com.p7700g.p99005;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.p7700g.p99005.i2;

/* compiled from: TextViewOnReceiveContentListener.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class pt implements kr {
    private static final String a = "ReceiveContent";

    /* compiled from: TextViewOnReceiveContentListener.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public static CharSequence a(@x1 Context context, @x1 ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* compiled from: TextViewOnReceiveContentListener.java */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public static CharSequence a(@x1 Context context, @x1 ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    private static CharSequence b(@x1 Context context, @x1 ClipData.Item item, int i) {
        return a.a(context, item, i);
    }

    private static void c(@x1 Editable editable, @x1 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // com.p7700g.p99005.kr
    @z1
    public hq a(@x1 View view, @x1 hq hqVar) {
        if (Log.isLoggable(a, 3)) {
            String str = "onReceive: " + hqVar;
        }
        if (hqVar.g() == 2) {
            return hqVar;
        }
        ClipData c = hqVar.c();
        int e = hqVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            CharSequence b2 = b(context, c.getItemAt(i), e);
            if (b2 != null) {
                if (!z) {
                    c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
        }
        return null;
    }
}