package com.app.MysportcityApp.pushnotification;

import android.util.Log;

import com.app.MysportcityApp.activities.SplashScreen;
import com.app.MysportcityApp.utils.CommonMethods;
import com.app.MysportcityApp.utils.MySharedPreference;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();
    private MySharedPreference prefs;

    @Override
    public void onTokenRefresh() {
        try {

            //Getting registration token
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            Log.d(TAG, "notificationToken => "+refreshedToken);
            prefs = new MySharedPreference(getApplicationContext());
            prefs.setKeyValues(CommonMethods.FIREBASE_TOKEN, refreshedToken);
            RegisterFirebaseToken registerFirebaseToken = new RegisterFirebaseToken(getApplicationContext());
            registerFirebaseToken.tokenRequestAndRegister();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }
}