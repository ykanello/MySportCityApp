package com.app.MysportcityApp.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.app.MysportcityApp.activities.CartList;
import com.app.MysportcityApp.activities.CategoryNewsList;
import com.app.MysportcityApp.activities.Images;
import com.app.MysportcityApp.activities.NewsDetail;
import com.app.MysportcityApp.activities.SplashScreen;
import com.app.MysportcityApp.activities.BaseActivity;
import com.app.MysportcityApp.activities.ForgotPasswordActivity;
import com.app.MysportcityApp.activities.LoginActivity;
import com.app.MysportcityApp.activities.RegisterActivity;
import com.app.MysportcityApp.activities.TempWebYoutube;
import com.app.MysportcityApp.objects.Category;
import com.app.MysportcityApp.objects.CategorySer;
import com.app.MysportcityApp.objects.NewsList;
import com.app.MysportcityApp.objects.Post;

import java.util.List;

/**
 * Created by Robz on 6/29/2016.
 */
public class Opener {
    static Intent i;


    public static void LoginActivity(Activity activity) {
        startActivity(activity, LoginActivity.class);
    }

    public static void SplashActivity(Activity activity) {
        startActivity(activity, SplashScreen.class);
    }

    public static void BaseActivity(Activity activity) {
        startActivity(activity, BaseActivity.class);
    }

    /**
     * Starts the given activity
     *
     * @param activity      : instance of the current activity
     * @param activityClass : Activity to be opened
     */
    private static void startActivity(Activity activity, Class<?> activityClass) {
        i = new Intent(activity, activityClass);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(i);
    }

    public static void RegisterActivity(Activity activity) {
        startActivity(activity, RegisterActivity.class);
    }

    public static void ForgotPwdActivity(Activity activity) {
        startActivity(activity, ForgotPasswordActivity.class);
    }

    public static void CategoryNewsListing(Activity activity, int position) {
        i = new Intent(activity, CategoryNewsList.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.putExtra("pos", position);
        activity.startActivity(i);
    }

    public static void NewsDetails(Activity activity, Post newsList) {
//        i = new Intent(activity, TempWebYoutube.class);
        i = new Intent(activity, NewsDetail.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.putExtra("news_details", newsList);
        activity.startActivity(i);
    }

    public static void NewsList(Activity activity, int catId, String title) {
        i = new Intent(activity, com.app.MysportcityApp.activities.NewsList.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.putExtra("catId", catId);
        i.putExtra("catTitle", title);
        activity.startActivity(i);
    }

    public static void OpenShareSheet(Activity activity, String msg){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, msg); // Simple text and URL to share
        sendIntent.setType("text/plain");
        activity.startActivity(sendIntent);
    }

    public static void CartList(Activity activity) {
        startActivity(activity, CartList.class);
    }
    public static void Shop(Activity activity) {
        startActivity(activity, Images.class);
    }
}