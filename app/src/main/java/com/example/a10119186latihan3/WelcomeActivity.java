package com.example.a10119186latihan3;

import static com.example.a10119186latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

//Rika Nur'adila IF5 10119186, 26 April 2022


public class WelcomeActivity extends AppCompatActivity{

    /*
    * Library butterknife digunakan untuk mendeklarasikan atau
    * binding value-value view sebagai pengganti findviewbyid.
    * Dapat digunakan juga untuk deklarasi String, dimen, color, drawable
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //mendeklarasikan butterknife di activity
        ButterKnife.bind(this);

        // logika untuk menampung nilai putekstra dari kelas DoneActivity,
        // agar ketika dihalaman akhir (DoneActivity) ditekan button ok,
        // Semua activity dapat tertutup juga (finish).
        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }

    //Method dari butterknife untuk mengklik tombol dengan id btnWalkthroughStart
    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        // Perintah pindah halaman
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}
