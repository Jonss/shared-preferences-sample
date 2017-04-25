package jonss.com.github.sharedpreferencessample.utils;

import android.view.View;

/**
 * Created by joao on 25/04/17.
 */
public class ViewUtils {

    public static void setVisibility(View view, boolean aBoolean) {
            if(aBoolean) {
                view.setVisibility(View.VISIBLE);
            } else {
                view.setVisibility(View.INVISIBLE);
            }
    }
}
