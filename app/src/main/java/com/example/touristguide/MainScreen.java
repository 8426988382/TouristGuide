package com.example.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {


    ImageView img1 , img2 , img3 , img4 , img5 , img6 , img7 , img8;
    ImageView showpro;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mainscreen);


        img1 = findViewById(R.id.imageView2);
        img2 = findViewById(R.id.imageView3);
        img3 = findViewById(R.id.imageView4);
        img4 = findViewById(R.id.imageView5);
        img5 = findViewById(R.id.imageView6);
        img6 = findViewById(R.id.imageView7);
        img7 = findViewById(R.id.imageView8);
        img8 = findViewById(R.id.imageView9);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);

            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Expand.class);
                startActivity(intent);
            }
        });


        // navigate to profile
        showpro = findViewById(R.id.showprofile);

        showpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , Profile.class);
                startActivity(intent);
            }
        });

    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.setting_menu, popup.getMenu());
        popup.show();


        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if(item.getItemId() == R.id.signout)
                {
                    Intent intent = new Intent(MainScreen.this , LogoutSplash.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext()  , "TBA" , Toast.LENGTH_SHORT).show();
                }


                return false;
            }
        });
    }

}
