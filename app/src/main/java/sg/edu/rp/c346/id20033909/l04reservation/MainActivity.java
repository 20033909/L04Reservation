package sg.edu.rp.c346.id20033909.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText mobile;
    EditText size;
    TimePicker tp;
    DatePicker dp;
    CheckBox smokingArea;
    Button confirm;
    Button reset;
    TextView display;


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
        smokingArea = findViewById(R.id.checkBox);
        display = findViewById(R.id.display);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";
                String displayTxt = "";
                int hour = tp.getHour();
                int min = tp.getMinute();
                int year = dp.getYear();
                int month = dp.getMonth() + 1;
                int day = dp.getDayOfMonth();
                String date = day+"/"+month+"/"+year;


                if (name.getText().toString().trim().length()==0){
                    message += "Please provide a Name";
                } else if (mobile.getText().toString().trim().length()==0) {
                    message += "Please provide a Mobile Number";
                } else if (size.getText().toString().trim().length()==0){
                    message += "Please provide Group Size";
                } else {
                    message += "Reservation Confirmed!";
                    displayTxt += "Name: " + name + "\nMobile: "+mobile+"\nGroup Size: "+size+"\nBooking Date: "+date+"\nTime Booked: "+hour+":"+min+"\nSmoking Area Preferred: "+smokingArea.isChecked()+"\n\nPlease be Punctual!";
                    display.setText(displayTxt);

                }
                Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.updateDate(2023,6,1);
                tp.setHour(19);
                tp.setMinute(30);
                name.setText("");
                mobile.setText("");
                size.setText("");
                smokingArea.setChecked(false);
                display.setText("");
            }
        });




    }
}