package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.hq;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public final class AppCompatReceiveContentHelper {
    private static final String LOG_TAG = "ReceiveContent";

    @e2(24)
    /* loaded from: classes.dex */
    public static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
        }

        @e1
        public static boolean onDropForTextView(@x1 DragEvent dragEvent, @x1 TextView textView, @x1 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                sr.l1(textView, new hq.b(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @e1
        public static boolean onDropForView(@x1 DragEvent dragEvent, @x1 View view, @x1 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            sr.l1(view, new hq.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    private AppCompatReceiveContentHelper() {
    }

    public static boolean maybeHandleDragEventViaPerformReceiveContent(@x1 View view, @x1 DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && sr.g0(view) != null) {
            Activity tryGetActivity = tryGetActivity(view);
            if (tryGetActivity == null) {
                String str = "Can't handle drop: no activity: view=" + view;
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return OnDropApi24Impl.onDropForTextView(dragEvent, (TextView) view, tryGetActivity);
                    }
                    return OnDropApi24Impl.onDropForView(dragEvent, view, tryGetActivity);
                }
            }
        }
        return false;
    }

    public static boolean maybeHandleMenuActionViaPerformReceiveContent(@x1 TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || sr.g0(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            sr.l1(textView, new hq.b(primaryClip, 1).d(i != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    @z1
    public static Activity tryGetActivity(@x1 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}