package com.example.amestickers;


import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by User on 30/05/2018.
 */

public class MiFirebaseInstancedService extends FirebaseInstanceIdService {

    public  static  final String TAG  =  " NOTICIAS " ;
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();


        String token =  FirebaseInstanceId. getInstance () . getToken ();

        Log. d ( TAG , " Token: "  + token);

    }
}