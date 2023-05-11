package sg.edu.rp.c346.id20033909.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText mobile;
    EditText size;
    TimePicker tp;
    DatePicker dp;
    RadioGroup radio;
    Button confirm;
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        size = findViewById(R.id.size);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        confirm = findViewById(R.id.confirm);
        reset = findViewById(R.id.reset);
        radio = findViewById(R.id.radio);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";
                if (name.getText().toString().trim().length()==0){
                    message += "Please provide a Name";
                } else if (mobile.getText().toString().trim().length()==0) {
                    message += "Please provide a Mobile Number";
                } else if (size.getText().toString().trim().length()==0){
                    message += "Please provide Group Size";
                } else if (){

                }
                Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();


            }
        });


    }
}