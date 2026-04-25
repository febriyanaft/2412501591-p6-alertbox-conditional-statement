package id.ac.budiluhur.a2412501591_tugas06_ah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class JajarGenjangActivity extends AppCompatActivity {

    EditText alas, tinggi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);
        alas   = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        hasil  = findViewById(R.id.texthasil);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Jajar Genjang");
        }
    }

    public void tombolhitung(View view) {
        String inputAlas   = alas.getText().toString();
        String inputTinggi = tinggi.getText().toString();

        if (TextUtils.isEmpty(inputAlas)) {
            alas.setError("Alas Harus Di Isi");
            alas.requestFocus();
        } else if (TextUtils.isEmpty(inputTinggi)) {
            tinggi.setError("Tinggi Harus Di Isi");
            tinggi.requestFocus();
        } else {
            Double a           = Double.parseDouble(inputAlas);
            Double t           = Double.parseDouble(inputTinggi);
            Double hasilhitung = a * t;
            hasil.setText(String.format("%.2f", hasilhitung));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}