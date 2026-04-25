package id.ac.budiluhur.a2412501591_tugas06_ah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText jariJari;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        jariJari = findViewById(R.id.jariJari);
        hasil    = findViewById(R.id.texthasil);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Lingkaran");
        }
    }

    public void tombolhitung(View view) {
        String inputjari = jariJari.getText().toString();

        if (TextUtils.isEmpty(inputjari)) {
            jariJari.setError("Jari-Jari Harus Di Isi");
            jariJari.requestFocus();
        } else {
            Double nilaiJari   = Double.parseDouble(inputjari);
            Double hasilhitung = Math.PI * nilaiJari * nilaiJari;
            hasil.setText(String.format("%.2f", hasilhitung));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}