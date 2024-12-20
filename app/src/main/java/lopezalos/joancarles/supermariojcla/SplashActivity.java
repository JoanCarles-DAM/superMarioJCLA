package lopezalos.joancarles.supermariojcla;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Establece el layout de la pantalla de carga

        // Retraso de 2-3 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Después de 2 segundos, abre la actividad principal
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra la SplashActivity
            }
        }, 2000); // 2000 milisegundos = 2 segundos
    }
}
