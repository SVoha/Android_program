package ru.mirea.selvich.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ToastApp extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_app);

        editText = findViewById(R.id.editText);
    }

    public void countSymbols(View view) {

        String text = editText.getText().toString();

        int count = text.length();

        Toast toast = Toast.makeText(
                getApplicationContext(),
                "СТУДЕНТ №21 ГРУППА БСБО-51-24 Количество символов - " + count,
                Toast.LENGTH_LONG
        );

        toast.show();
    }
}