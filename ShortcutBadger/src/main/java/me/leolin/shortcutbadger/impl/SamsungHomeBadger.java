package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import java.util.Arrays;
import java.util.List;

import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.util.BroadcastHelper;
import me.leolin.shortcutbadger.util.Utils;

import static me.leolin.shortcutbadger.util.Utils.UNABLE_TO_RESOLVE_INTENT_ERROR_;

/**
 * @author Leo Lin
 */
public class SamsungHomeBadger implements Badger {
    public SamsungHomeBadger() {
    }

    @Override
    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws Exception {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", badgeCount);
        intent.putExtra("badge_count_package_name", context.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());

        if (Utils.getInstance().canResolveBroadcast(context.getApplicationContext(), intent)) {
            BroadcastHelper.sendIntentExplicitly(context, intent);
        } else {
            throw new Exception(UNABLE_TO_RESOLVE_INTENT_ERROR_ + intent.toString());
        }
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList(
                "com.sec.android.app.launcher",
                "com.sec.android.app.twlauncher"
        );
    }
}
