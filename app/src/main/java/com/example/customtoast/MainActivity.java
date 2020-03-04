package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btn);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This is the Toast message",Toast.LENGTH_LONG).show();

                toastMessage("This is the Toast message");
            }
        });
    }

    public void toastMessage(String message) {
        View viewToast = getLayoutInflater().inflate(R.layout.toast, (ViewGroup) findViewById(R.id.linearLayout));

        TextView tvToast = (TextView) viewToast.findViewById(R.id.tvToastMessage);

        tvToast.setText(message);

        Toast toast1 = new Toast(MainActivity.this);
        toast1.setDuration(Toast.LENGTH_LONG);
        toast1.setView(viewToast);
        toast1.setGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL, 0, 0);
        toast1.show();

    }
}
