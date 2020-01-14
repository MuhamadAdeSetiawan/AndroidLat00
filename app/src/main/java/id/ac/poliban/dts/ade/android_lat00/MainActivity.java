package id.ac.poliban.dts.ade.android_lat00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mengenalkan/Mengaitkan koponen (View) yang ada di dalam layout
        //sehinga dikenali sebagai variable./object dalam source code java kita
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btForth = findViewById(R.id.btForth);

        //Memasang pendeteksi event (event listener) pada komponen
        //dan menangani kejadian (event handler) jika erjadi kejadian
        //pada komponen tersebut

        btFirst.setOnClickListener(this);
        btSecond.setOnClickListener(this);
        btThird.setOnClickListener(this);
        btForth.setOnClickListener(this);

    }

    @Override
    public void onClick(View View) {
        switch(View.getId()){
            case R.id.btFirst :
                Toast.makeText(this, "Anda Memilih Button First !", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSecond :
                Toast.makeText(this, "Anda Memilih Untuk Menekan Buton Second!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btThird :
                Toast.makeText(this, "Apakah AndaMenekan Button Third?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btForth :
                Toast.makeText(this, "Anda Ingin Menggunakan Button Forth?", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
