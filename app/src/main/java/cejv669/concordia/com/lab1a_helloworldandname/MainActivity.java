package cejv669.concordia.com.lab1a_helloworldandname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText getName = findViewById(R.id.etEnterName);
        Button okBtn = findViewById(R.id.btnEnterNameOk);
        TextView showNameLbl = findViewById(R.id.lblNameReverse);
        Button secondBtn = findViewById(R.id.btnAgain);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                EditText editText = findViewById(R.id.etEnterName);
////                String name = editText.getText().toString();
////
////                StringBuilder revSB = new StringBuilder(name);
////                revSB.reverse();

                CheckBox cb1 = findViewById(R.id.checkBox);
                Switch sw1 = findViewById(R.id.switch1);
                ToggleButton tb1 = findViewById(R.id.toggleButton);
                RatingBar rb1 = findViewById(R.id.ratingBar);

                StringBuilder tsb = new StringBuilder();
                tsb.append(cb1.isChecked()?"Checked ":"Unchecked ");
                tsb.append(sw1.isChecked()?"Checked ":"Unchecked ");
                tsb.append(tb1.isChecked()?"Checked ":"Unchecked ");
                rb1.setNumStars(7);
                tsb.append(rb1.getRating());


                Toast.makeText(getApplicationContext(), tsb.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void btnOkClick(View v) {
        EditText editText = findViewById(R.id.etEnterName);
        String name = editText.getText().toString();

        StringBuilder revSB = new StringBuilder(name);
        revSB.reverse();

        TextView showNameLbl = findViewById(R.id.lblNameReverse);
        showNameLbl.setText(getString(R.string.lblRevName) + revSB.toString());
    }

}
