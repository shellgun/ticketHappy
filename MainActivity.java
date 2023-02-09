package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ticketNumberIn;
    private Button button;
    private TextView txt2;
    private String ticketNumber;

    public MainActivity(EditText ticketNumberIn) {
        this.ticketNumberIn = ticketNumberIn;
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

    button=findViewById (R.id.button);
    txt2=findViewById (R.id.txt2);
    button.setOnClickListener (listener);

}
     Algorithm algorithm=new Algorithm ();
private View.OnClickListener listener = new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {

        String number=ticketNumberIn.getText ().toString () ;
      if  (algorithm.isHappyTicket(number)) {
      txt2.setText ("это число счастливое");
    } else {
      int newItsHappyNumber =algorithm.nextHappyInt (number);
        txt2.setText ("новое счастливое число"+newItsHappyNumber);
        }
  };


};
}