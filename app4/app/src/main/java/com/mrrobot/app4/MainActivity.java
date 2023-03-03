package com.mrrobot.app4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Toast Message",Toast.LENGTH_LONG).show();
    }

    public void save(View view){
        
        AlertDialog.Builder alert=new AlertDialog.Builder(this);//Uyarı ekranı oluşturuyoruz
        alert.setTitle("Save");//Başlık kısmı
        alert.setMessage("Are you sure?");//Mesaj kısmı
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            //Yes butonunda olacaklar burada
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Save
                Toast.makeText(MainActivity.this,"New Toast Message",Toast.LENGTH_LONG).show();
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            //No butonunda olacaklar burada
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"New New Toast Message",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();


    }


}