package com.example.project_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void getAppKeyHash() {
        try { PackageInfo info = getPackageManager().getPackageInfo(getPackageName(),
                PackageManager.GET_SIGNATURES); for (Signature signature : info.signatures)
                { MessageDigest md; md = MessageDigest.getInstance("SHA");
                    md.update(signature.toByteArray());
                    String something = new String(Base64.encode(md.digest(), 0)); Log.d("yyg", "key: " + something); } } catch (Exception e) {
        // TODO Auto-generated catch block Log.e("name not found", e.toString());
        }
    }


}