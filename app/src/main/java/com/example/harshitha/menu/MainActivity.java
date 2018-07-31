package com.example.harshitha.menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
//Initialising textview
    TextView Colortxt;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //Getting Menu Inflater
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //On Item Select Method
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Colortxt =(TextView)findViewById(R.id.textView); //defining colortxt
        //Getting item's id

        int id = item.getItemId();
        //Switch Case Implementation

       switch (id)
       {

           //Setting Textcolor With Black
           case R.id.Subitem4:
               Colortxt.setTextColor(Color.rgb(0,0,0));
               break;
               //Setting Textcolor With Blue
           case R.id.Subitem1:
               Colortxt.setTextColor(Color.rgb(0,0,255));
               break;
           //Setting Textcolor With Yellow
           case R.id.Subitem2:
               Colortxt.setTextColor(Color.rgb(255,255,0));
               break;
           //Setting Textcolor With Red
           case R.id.Subitem3 :
               Colortxt.setTextColor(Color.rgb(255,0,0));
               break;

       }
        return super.onOptionsItemSelected(item);
    }
}
