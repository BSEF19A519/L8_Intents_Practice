package com.example.l8_intents_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CallingIntent(View view)
    {
        Uri uri=Uri.parse("tel:+925678997543");
        Intent intent =new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);

    }
    public void openWebPage(View view) {

     Uri webpage = Uri.parse("https://pucit.edu.pk");
     Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

     startActivity(intent);
    }
    @SuppressLint({"IntentReset", "QueryPermissionsNeeded"})
    public void composeEmail(View view)
    {   Intent intent = new Intent(Intent.ACTION_SENDTO);

//        intent.setType("*/*");
        intent.setData(Uri.parse("mailto:xyz@abc.com"));

        intent.putExtra(Intent.EXTRA_SUBJECT, "MailPractice");
        if (intent.resolveActivity(getPackageManager()) != null) {

            startActivity(intent);   }
    }


    public void SecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

//        String message = editText.getText().toString();
//        intent.putExtra("ETM", message);
        String staticString = "السلام علیکم";
        intent.putExtra("SS", staticString);
        intent.putExtra("text" ,"It is another text");
        startActivity(intent);

    }
}