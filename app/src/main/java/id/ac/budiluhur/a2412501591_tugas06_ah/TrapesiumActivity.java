package id.ac.budiluhur.a2412501591_tugas06_ah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TrapesiumActivity extends AppCompatActivity {

    EditText sisiA, sisiB, tinggi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        sisiA  = findViewById(R.id.sisiA);
        sisiB  = findViewById(R.id.sisiB);
        tinggi = findViewById(R.id.tinggi);
        hasil  = findViewById(R.id.texthasil);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Trapesium");
        }
    }
    public void tombolhitung(View view) {
        String inputA      = sisiA.getText().toString();
        String inputB      = sisiB.getText().toString();
        String inputTinggi = tinggi.getText().toString();

        if (TextUtils.isEmpty(inputA)) {
            sisiA.setError("Sisi A Harus Di Isi");
            sisiA.requestFocus();
        } else if (TextUtils.isEmpty(inputB)) {
            sisiB.setError("Sisi B Harus Di Isi");
            sisiB.requestFocus();
        } else if (TextUtils.isEmpty(inputTinggi)) {
            tinggi.setError("Tinggi Harus Di Isi");
            tinggi.requestFocus();
        } else {
            Double a           = Double.parseDouble(inputA);
            Double b           = Double.parseDouble(inputB);
            Double t           = Double.parseDouble(inputTinggi);
            Double hasilhitung = 0.5 * (a + b) * t;
            hasil.setText(String.format("%.2f", hasilhitung));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}