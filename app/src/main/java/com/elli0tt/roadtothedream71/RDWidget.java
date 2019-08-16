package com.elli0tt.roadtothedream71;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RemoteViews;

import com.elli0tt.roadtothedream71.data.Actions;
import com.elli0tt.roadtothedream71.data.Keys;


public class RDWidget extends AppWidgetProvider {

    public static final String SHARED_PREFERENCES = "rd_widget_shared_preferences";
    //public static final int DEFAULT_BUTTON_IMAGE_RESOURCE = R.drawable.ic_check_box_outline_blank_black_24dp;
    public static final int DEFAULT_BUTTON_IMAGE_RESOURCE = R.drawable.checkbox_unchecked_background;

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.rdwidget);
        setImageButtonsResources(remoteViews, sharedPreferences);
        setOnClickPendingIntents(context, remoteViews, appWidgetId);
        appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
    }

    static void setImageButtonsResources(RemoteViews rv, SharedPreferences sp) {
        rv.setImageViewResource(R.id.button_1, sp.getInt(Keys.KEY_BUTTON_1_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_2, sp.getInt(Keys.KEY_BUTTON_2_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_3, sp.getInt(Keys.KEY_BUTTON_3_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_4, sp.getInt(Keys.KEY_BUTTON_4_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_5, sp.getInt(Keys.KEY_BUTTON_5_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_6, sp.getInt(Keys.KEY_BUTTON_6_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_7, sp.getInt(Keys.KEY_BUTTON_7_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_8, sp.getInt(Keys.KEY_BUTTON_8_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_9, sp.getInt(Keys.KEY_BUTTON_9_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_10, sp.getInt(Keys.KEY_BUTTON_10_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_11, sp.getInt(Keys.KEY_BUTTON_11_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_12, sp.getInt(Keys.KEY_BUTTON_12_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_13, sp.getInt(Keys.KEY_BUTTON_13_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_14, sp.getInt(Keys.KEY_BUTTON_14_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_15, sp.getInt(Keys.KEY_BUTTON_15_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_16, sp.getInt(Keys.KEY_BUTTON_16_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_17, sp.getInt(Keys.KEY_BUTTON_17_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_18, sp.getInt(Keys.KEY_BUTTON_18_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_19, sp.getInt(Keys.KEY_BUTTON_19_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_20, sp.getInt(Keys.KEY_BUTTON_20_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_21, sp.getInt(Keys.KEY_BUTTON_21_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_22, sp.getInt(Keys.KEY_BUTTON_22_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_23, sp.getInt(Keys.KEY_BUTTON_23_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_24, sp.getInt(Keys.KEY_BUTTON_24_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_25, sp.getInt(Keys.KEY_BUTTON_25_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_26, sp.getInt(Keys.KEY_BUTTON_26_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_27, sp.getInt(Keys.KEY_BUTTON_27_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_28, sp.getInt(Keys.KEY_BUTTON_28_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_29, sp.getInt(Keys.KEY_BUTTON_29_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_30, sp.getInt(Keys.KEY_BUTTON_30_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_31, sp.getInt(Keys.KEY_BUTTON_31_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_32, sp.getInt(Keys.KEY_BUTTON_32_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_33, sp.getInt(Keys.KEY_BUTTON_33_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_34, sp.getInt(Keys.KEY_BUTTON_34_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_35, sp.getInt(Keys.KEY_BUTTON_35_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_36, sp.getInt(Keys.KEY_BUTTON_36_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_37, sp.getInt(Keys.KEY_BUTTON_37_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_38, sp.getInt(Keys.KEY_BUTTON_38_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_39, sp.getInt(Keys.KEY_BUTTON_39_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_40, sp.getInt(Keys.KEY_BUTTON_40_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_41, sp.getInt(Keys.KEY_BUTTON_41_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_42, sp.getInt(Keys.KEY_BUTTON_42_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_43, sp.getInt(Keys.KEY_BUTTON_43_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_44, sp.getInt(Keys.KEY_BUTTON_44_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_45, sp.getInt(Keys.KEY_BUTTON_45_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_46, sp.getInt(Keys.KEY_BUTTON_46_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_47, sp.getInt(Keys.KEY_BUTTON_47_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_48, sp.getInt(Keys.KEY_BUTTON_48_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_49, sp.getInt(Keys.KEY_BUTTON_49_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_50, sp.getInt(Keys.KEY_BUTTON_50_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_51, sp.getInt(Keys.KEY_BUTTON_51_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_52, sp.getInt(Keys.KEY_BUTTON_52_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_53, sp.getInt(Keys.KEY_BUTTON_53_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_54, sp.getInt(Keys.KEY_BUTTON_54_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_55, sp.getInt(Keys.KEY_BUTTON_55_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_56, sp.getInt(Keys.KEY_BUTTON_56_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_57, sp.getInt(Keys.KEY_BUTTON_57_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_58, sp.getInt(Keys.KEY_BUTTON_58_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_59, sp.getInt(Keys.KEY_BUTTON_59_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_60, sp.getInt(Keys.KEY_BUTTON_60_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_61, sp.getInt(Keys.KEY_BUTTON_61_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_62, sp.getInt(Keys.KEY_BUTTON_62_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_63, sp.getInt(Keys.KEY_BUTTON_63_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_64, sp.getInt(Keys.KEY_BUTTON_64_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_65, sp.getInt(Keys.KEY_BUTTON_65_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_66, sp.getInt(Keys.KEY_BUTTON_66_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_67, sp.getInt(Keys.KEY_BUTTON_67_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_68, sp.getInt(Keys.KEY_BUTTON_68_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_69, sp.getInt(Keys.KEY_BUTTON_69_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_70, sp.getInt(Keys.KEY_BUTTON_70_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
        rv.setImageViewResource(R.id.button_71, sp.getInt(Keys.KEY_BUTTON_71_IMAGE_RESOURCE, DEFAULT_BUTTON_IMAGE_RESOURCE));
    }

    static void setOnClickPendingIntent(Context context, int appWidgetId, RemoteViews remoteViews, int buttonId, String action){
        Intent checkBoxIntent = new Intent(context, RDWidget.class);
        checkBoxIntent.setAction(action);
        checkBoxIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, appWidgetId, checkBoxIntent, 0);
        remoteViews.setOnClickPendingIntent(buttonId, pendingIntent);
    }

    //values are the numbers from 1 to 71
    static void setOnClickPendingIntents(Context context, RemoteViews remoteViews, int appWidgetId){
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_1, Actions.CHECK_BOX_ACTION_1);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_2, Actions.CHECK_BOX_ACTION_2);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_3, Actions.CHECK_BOX_ACTION_3);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_4, Actions.CHECK_BOX_ACTION_4);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_5, Actions.CHECK_BOX_ACTION_5);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_6, Actions.CHECK_BOX_ACTION_6);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_7, Actions.CHECK_BOX_ACTION_7);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_8, Actions.CHECK_BOX_ACTION_8);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_9, Actions.CHECK_BOX_ACTION_9);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_10, Actions.CHECK_BOX_ACTION_10);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_11, Actions.CHECK_BOX_ACTION_11);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_12, Actions.CHECK_BOX_ACTION_12);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_13, Actions.CHECK_BOX_ACTION_13);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_14, Actions.CHECK_BOX_ACTION_14);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_15, Actions.CHECK_BOX_ACTION_15);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_16, Actions.CHECK_BOX_ACTION_16);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_17, Actions.CHECK_BOX_ACTION_17);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_18, Actions.CHECK_BOX_ACTION_18);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_19, Actions.CHECK_BOX_ACTION_19);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_20, Actions.CHECK_BOX_ACTION_20);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_21, Actions.CHECK_BOX_ACTION_21);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_22, Actions.CHECK_BOX_ACTION_22);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_23, Actions.CHECK_BOX_ACTION_23);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_24, Actions.CHECK_BOX_ACTION_24);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_25, Actions.CHECK_BOX_ACTION_25);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_26, Actions.CHECK_BOX_ACTION_26);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_27, Actions.CHECK_BOX_ACTION_27);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_28, Actions.CHECK_BOX_ACTION_28);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_29, Actions.CHECK_BOX_ACTION_29);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_30, Actions.CHECK_BOX_ACTION_30);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_31, Actions.CHECK_BOX_ACTION_31);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_32, Actions.CHECK_BOX_ACTION_32);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_33, Actions.CHECK_BOX_ACTION_33);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_34, Actions.CHECK_BOX_ACTION_34);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_35, Actions.CHECK_BOX_ACTION_35);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_36, Actions.CHECK_BOX_ACTION_36);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_37, Actions.CHECK_BOX_ACTION_37);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_38, Actions.CHECK_BOX_ACTION_38);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_39, Actions.CHECK_BOX_ACTION_39);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_40, Actions.CHECK_BOX_ACTION_40);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_41, Actions.CHECK_BOX_ACTION_41);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_42, Actions.CHECK_BOX_ACTION_42);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_43, Actions.CHECK_BOX_ACTION_43);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_44, Actions.CHECK_BOX_ACTION_44);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_45, Actions.CHECK_BOX_ACTION_45);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_46, Actions.CHECK_BOX_ACTION_46);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_47, Actions.CHECK_BOX_ACTION_47);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_48, Actions.CHECK_BOX_ACTION_48);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_49, Actions.CHECK_BOX_ACTION_49);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_50, Actions.CHECK_BOX_ACTION_50);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_51, Actions.CHECK_BOX_ACTION_51);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_52, Actions.CHECK_BOX_ACTION_52);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_53, Actions.CHECK_BOX_ACTION_53);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_54, Actions.CHECK_BOX_ACTION_54);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_55, Actions.CHECK_BOX_ACTION_55);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_56, Actions.CHECK_BOX_ACTION_56);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_57, Actions.CHECK_BOX_ACTION_57);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_58, Actions.CHECK_BOX_ACTION_58);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_59, Actions.CHECK_BOX_ACTION_59);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_60, Actions.CHECK_BOX_ACTION_60);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_61, Actions.CHECK_BOX_ACTION_61);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_62, Actions.CHECK_BOX_ACTION_62);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_63, Actions.CHECK_BOX_ACTION_63);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_64, Actions.CHECK_BOX_ACTION_64);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_65, Actions.CHECK_BOX_ACTION_65);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_66, Actions.CHECK_BOX_ACTION_66);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_67, Actions.CHECK_BOX_ACTION_67);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_68, Actions.CHECK_BOX_ACTION_68);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_69, Actions.CHECK_BOX_ACTION_69);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_70, Actions.CHECK_BOX_ACTION_70);
        setOnClickPendingIntent(context, appWidgetId, remoteViews, R.id.button_71, Actions.CHECK_BOX_ACTION_71);


    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    private int getWidgetIdFromExtras(Bundle extras){
        if (extras != null) {
            return extras.getInt(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
        }
        return AppWidgetManager.INVALID_APPWIDGET_ID;
    }

    private void onCheckBoxActionChosen(int appWidgetId, Context context, String KeyButtonImageResource){
        if (appWidgetId != AppWidgetManager.INVALID_APPWIDGET_ID) {
            SharedPreferences sharedPreferences = context
                    .getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
            int current_resource = sharedPreferences
                    .getInt(KeyButtonImageResource, DEFAULT_BUTTON_IMAGE_RESOURCE);
            sharedPreferences.edit()
                    .putInt(KeyButtonImageResource, getCheckBoxNextResource(current_resource))
                    .apply();
            updateAppWidget(context, AppWidgetManager.getInstance(context), appWidgetId);
        }
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        int appWidgetId = getWidgetIdFromExtras(intent.getExtras());
        switch (intent.getAction()){
            case Actions.CHECK_BOX_ACTION_1: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_1_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_2: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_2_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_3: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_3_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_4: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_4_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_5: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_5_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_6: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_6_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_7: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_7_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_8: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_8_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_9: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_9_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_10: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_10_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_11: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_11_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_12: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_12_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_13: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_13_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_14: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_14_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_15: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_15_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_16: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_16_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_17: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_17_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_18: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_18_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_19: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_19_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_20: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_20_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_21: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_21_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_22: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_22_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_23: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_23_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_24: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_24_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_25: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_25_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_26: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_26_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_27: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_27_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_28: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_28_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_29: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_29_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_30: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_30_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_31: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_31_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_32: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_32_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_33: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_33_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_34: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_34_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_35: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_35_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_36: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_36_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_37: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_37_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_38: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_38_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_39: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_39_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_40: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_40_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_41: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_41_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_42: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_42_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_43: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_43_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_44: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_44_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_45: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_45_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_46: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_46_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_47: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_47_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_48: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_48_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_49: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_49_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_50: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_50_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_51: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_51_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_52: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_52_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_53: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_53_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_54: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_54_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_55: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_55_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_56: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_56_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_57: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_57_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_58: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_58_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_59: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_59_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_60: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_60_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_61: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_61_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_62: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_62_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_63: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_63_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_64: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_64_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_65: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_65_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_66: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_66_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_67: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_67_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_68: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_68_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_69: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_69_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_70: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_70_IMAGE_RESOURCE); break;
            case Actions.CHECK_BOX_ACTION_71: onCheckBoxActionChosen(appWidgetId, context, Keys.KEY_BUTTON_71_IMAGE_RESOURCE); break;
        }


    }


//    private static int getCheckBoxNextResource(int previous_resource) {
//        if (previous_resource == R.drawable.ic_check_box_black_24dp) {
//            return R.drawable.ic_check_box_outline_blank_black_24dp;
//        } else {
//            return R.drawable.ic_check_box_black_24dp;
//        }
//    }

    private static int getCheckBoxNextResource(int previous_resource) {
        if (previous_resource == R.drawable.checkbox_checked_background) {
            return R.drawable.checkbox_unchecked_background;
        } else {
            return R.drawable.checkbox_checked_background;
        }
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {

    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }


}

