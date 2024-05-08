package devandroid.fernando.applistacurso.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.fernando.applistacurso.R;
import devandroid.fernando.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    // Declarando o objeto pessoa da Classe Pessoa
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Criando o objeto
        pessoa = new Pessoa();
    }
}