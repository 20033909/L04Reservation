package sg.edu.rp.c346.id20033909.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;

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

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Click",Toast.LENGTH_LONG).show();







            }
        });


    }
}