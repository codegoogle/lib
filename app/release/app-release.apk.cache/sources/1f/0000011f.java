package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.jp;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public final class AppCompatTextClassifierHelper {
    @z1
    private TextClassifier mTextClassifier;
    @x1
    private TextView mTextView;

    @e2(26)
    /* loaded from: classes.dex */
    public static final class Api26Impl {
        private Api26Impl() {
        }

        @x1
        @e1
        public static TextClassifier getTextClassifier(@x1 TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(@x1 TextView textView) {
        this.mTextView = (TextView) jp.l(textView);
    }

    @e2(api = 26)
    @x1
    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        return textClassifier == null ? Api26Impl.getTextClassifier(this.mTextView) : textClassifier;
    }

    @e2(api = 26)
    public void setTextClassifier(@z1 TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }
}