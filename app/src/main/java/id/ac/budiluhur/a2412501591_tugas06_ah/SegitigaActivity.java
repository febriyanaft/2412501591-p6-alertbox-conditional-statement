package id.ac.budiluhur.a2412501591_tugas06_ah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    EditText alas, tinggi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas   = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        hasil  = findViewById(R.id.texthasil);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Segitiga");
        }
    }

    public void tombolhitung(View view) {
        String inputalas   = alas.getText().toString();
        String inputtinggi = tinggi.getText().toString();

        if (TextUtils.isEmpty(inputalas)) {
            alas.setError("Alas Harus Di Isi");
            alas.requestFocus();
        } else if (TextUtils.isEmpty(inputtinggi)) {
            tinggi.setError("Tinggi Harus Di Isi");
            tinggi.requestFocus();
        } else {
            Double nilaialas   = Double.parseDouble(inputalas);
            Double nilaitinggi = Double.parseDouble(inputtinggi);
            Double hasilhitung = 0.5 * nilaialas * nilaitinggi;
            hasil.setText(hasilhitung.toString());
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}