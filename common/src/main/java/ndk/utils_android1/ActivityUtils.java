package ndk.utils_android1;

import android.content.Context;
import android.content.Intent;

public class ActivityUtils {

    public static void start_activity(Context context, Class activity) {
        context.startActivity(new Intent(context, activity));
    }

}
