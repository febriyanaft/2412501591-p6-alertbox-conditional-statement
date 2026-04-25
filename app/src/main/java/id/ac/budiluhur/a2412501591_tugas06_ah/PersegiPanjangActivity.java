package id.ac.budiluhur.a2412501591_tugas06_ah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {

    EditText panjang, lebar;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        panjang = findViewById(R.id.panjang);
        lebar   = findViewById(R.id.lebar);
        hasil   = findViewById(R.id.texthasil);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Persegi Panjang");
        }
    }

    public void tombolhitung(View view) {
        String inputpanjang = panjang.getText().toString();
        String inputlebar   = lebar.getText().toString();

        if (TextUtils.isEmpty(inputpanjang)) {
            panjang.setError("Panjang Harus Di Isi");
            panjang.requestFocus();
        } else if (TextUtils.isEmpty(inputlebar)) {
            lebar.setError("Lebar Harus Di Isi");
            lebar.requestFocus();
        } else {
            Double nilaipanjang  = Double.parseDouble(inputpanjang);
            Double nilailebar    = Double.parseDouble(inputlebar);
            Double hasilhitung   = nilaipanjang * nilailebar;
            hasil.setText(hasilhitung.toString());
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}