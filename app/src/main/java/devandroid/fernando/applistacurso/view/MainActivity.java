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
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Criando o objeto
        pessoa = new Pessoa();
        // Atribuir conteúdo, dados, valores para o objeto
        // Conforme o teu modelo TEMPLATE
        pessoa.setPrimeiroNome("Mickey");
        pessoa.setSobrenome("Mouse");
        pessoa.setCursoDesejado("Java");
        pessoa.setTelefoneContato("11 96351-5333");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Harry");
        outraPessoa.setSobrenome("Potter");
        outraPessoa.setCursoDesejado("Feitiço");
        outraPessoa.setTelefoneContato("11 99735-6123");

        dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobrenome();
        dadosPessoa += "Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += "Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += "Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobrenome();
        dadosOutraPessoa += "Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += "Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();


        int parada = 0;

    }
}