package id.ac.budiluhur.a2412501591_tugas06_ah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BujurSangkarActivity extends AppCompatActivity {

    EditText sisi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);
        sisi  = findViewById(R.id.sisi);
        hasil = findViewById(R.id.texthasil);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Bujur Sangkar");
        }
    }

    public void tombolhitung(View view) {
        String inputsisi = sisi.getText().toString();

        if (TextUtils.isEmpty(inputsisi)) {
            sisi.setError("Sisi Harus Di Isi");
            sisi.requestFocus();
        } else {
            Double nilaisisi    = Double.parseDouble(inputsisi);
            Double hasilhitung  = nilaisisi * nilaisisi;
            hasil.setText(hasilhitung.toString());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Bujur Sangkar");
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}