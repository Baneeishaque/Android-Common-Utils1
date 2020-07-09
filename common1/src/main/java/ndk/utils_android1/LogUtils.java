package ndk.utils_android1;

import android.util.Log;

public class LogUtils {

    public static void debug(String tag, String message) {

        if (BuildConfig.DEBUG) {

            Log.d(tag, message);
        }
    }
}
