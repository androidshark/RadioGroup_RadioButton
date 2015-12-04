package armonysoft.com.radiogroup_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//-----------------------------------------------------------
// 1. se crea el objeto
//-----------------------------------------------------------

    public EditText et1,et2;
    public TextView tv3;
    public RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//-----------------------------------------------------------
// 2. se inicializa los objetos
//-----------------------------------------------------------

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//-----------------------------------------------------------
// 3. Metodo Operar
//-----------------------------------------------------------
    public void operar(View view){
        //se recupera el valor de et1 y se pasa a string
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        //se convierte a entero
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);

        //if para saber cual radiobutton esta seleccionado.
        //== se utiliza para comparar en java
        if(r1.isChecked()==true){
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            tv3.setText(resu);
        } else {
            if(r2.isChecked()==true){
                int resta = nro1 - nro2;
                String resu = String.valueOf(resta);
                tv3.setText(resu);
            }
        }
    }


}
