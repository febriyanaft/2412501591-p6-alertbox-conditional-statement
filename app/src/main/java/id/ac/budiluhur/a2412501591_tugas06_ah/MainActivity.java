package id.ac.budiluhur.a2412501591_tugas06_ah;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setBackgroundDrawable(
                    new android.graphics.drawable.ColorDrawable(
                            android.graphics.Color.parseColor("#F5F5F5")
                    )
            );
            getSupportActionBar().setTitle("Matematika");
        }
        
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                showExitDialog();
            }

        });
    }

    public void panjang(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Persegi Panjang")
                .setMessage("Apakah anda yakin ingin menghitung luas Persegi Panjang?")
                .setPositiveButton("Ya", (d, i) ->
                        startActivity(new Intent(this, PersegiPanjangActivity.class)))
                .setNegativeButton("Tidak", (d, i) -> d.cancel())
                .show();
    }
    public void bujur(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Bujur Sangkar")
                .setMessage("Apakah anda yakin ingin menghitung luas Bujur Sangkar?")
                .setPositiveButton("Ya", (d, i) ->
                        startActivity(new Intent(this, BujurSangkarActivity.class)))
                .setNegativeButton("Tidak", (d, i) -> d.cancel())
                .show();
    }
    public void segitiga(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Segitiga")
                .setMessage("Apakah anda yakin ingin menghitung luas Segitiga?")
                .setPositiveButton("Ya", (d, i) ->
                        startActivity(new Intent(this, SegitigaActivity.class)))
                .setNegativeButton("Tidak", (d, i) -> d.cancel())
                .show();
    }
    public void lingkaran(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Lingkaran")
                .setMessage("Apakah anda yakin ingin menghitung luas Lingkaran?")
                .setPositiveButton("Ya", (d, i) ->
                        startActivity(new Intent(this, LingkaranActivity.class)))
                .setNegativeButton("Tidak", (d, i) -> d.cancel())
                .show();
    }
    public void trapesium(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Trapesium")
                .setMessage("Apakah anda yakin ingin menghitung luas Trapesium?")
                .setPositiveButton("Ya", (d, i) ->
                        startActivity(new Intent(this, TrapesiumActivity.class)))
                .setNegativeButton("Tidak", (d, i) -> d.cancel())
                .show();
    }
    public void jajargenjang(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Jajar Genjang")
                .setMessage("Apakah anda yakin ingin menghitung luas Jajar Genjang?")
                .setPositiveButton("Ya", (d, i) ->
                        startActivity(new Intent(this, JajarGenjangActivity.class)))
                .setNegativeButton("Tidak", (d, i) -> d.cancel())
                .show();
    }
    private void showExitDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Keluar Aplikasi")
                .setMessage("Apakah Anda Yakin Ingin Keluar Dari Aplikasi ini?")
                .setPositiveButton("Ya", (d, i) -> finish())
                .setNegativeButton("Tidak", (d, i) -> d.dismiss())
                .setNeutralButton("Batal", (d, i) -> d.cancel())
                .show();
    }
}
















