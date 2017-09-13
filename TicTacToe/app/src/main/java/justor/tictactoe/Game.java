package justor.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.color.black;

public class Game extends AppCompatActivity {
    private boolean x = true;
    private boolean done=false;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
    public void button_click(View v) {

        TextView text=(TextView) findViewById(R.id.textView);
        Button button = (Button) v;
        if(!done) {
            if (button.getText().equals(".")) {
                if (x) {
                    ((Button) v).setText("X");
                    button.setTextColor(getResources().getColor(black));
                    text.setText("O's turn");
                    x = false;
                } else {
                    ((Button) v).setText("O");
                    button.setTextColor(getResources().getColor(black));
                    text.setText("X's turn");
                    x = true;
                }
            }
            check();
        }
    }
    public void check()

    // i couldn't come up with a better idea for this method :/

    {Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);
        Button b4=(Button) findViewById(R.id.button4);
        Button b5=(Button) findViewById(R.id.button5);
        Button b6=(Button) findViewById(R.id.button6);
        Button b7=(Button) findViewById(R.id.button7);
        Button b8=(Button) findViewById(R.id.button8);
        Button b9=(Button) findViewById(R.id.button9);

        TextView text=(TextView) findViewById(R.id.textView);

        CharSequence b1t,b2t,b3t,b4t,b5t,b6t,b7t,b8t,b9t;

        b1t=b1.getText();
        b2t=b2.getText();
        b3t=b3.getText();
        b4t=b4.getText();
        b5t=b5.getText();
        b6t=b6.getText();
        b7t=b7.getText();
        b8t=b8.getText();
        b9t=b9.getText();
//horizontally
        if((b1t.equals("X") && b2t.equals("X") && b3t.equals("X"))
                || (b4t.equals("X") && b5t.equals("X") && b6t.equals("X"))
            || (b7t.equals("X") && b8t.equals("X") && b9t.equals("X")))
        {
            text.setText("X is a winner :D");
            done=true;
        }
        else if ((b1t.equals("O") && b2t.equals("O") && b3t.equals("O"))
                || (b4t.equals("O") && b5t.equals("O") && b6t.equals("O"))
                || (b7t.equals("O") && b8t.equals("O") && b9t.equals("O")))
        {
            text.setText("O is a winner :D");
            done=true;
        }
        //vertically
        else if((b1t.equals("X") && b4t.equals("X") && b7t.equals("X"))
                || (b2t.equals("X") && b5t.equals("X") && b8t.equals("X"))
                || (b3t.equals("X") && b6t.equals("X") && b9t.equals("X")))
        {
            text.setText("X is a winner :D");
            done=true;
        }
        else if ((b1t.equals("O") && b4t.equals("O") && b7t.equals("O"))
                || (b2t.equals("O") && b5t.equals("O") && b8t.equals("O"))
                || (b3t.equals("O") && b6t.equals("O") && b9t.equals("O")))
        {
            text.setText("O is a winner :D");
            done=true;
        }
        //diagonally
       else if((b1t.equals("X") && b5t.equals("X") && b9t.equals("X"))
                || (b3t.equals("X") && b5t.equals("X") && b7t.equals("X")))
        {
            text.setText("X is a winner :D");
            done=true;
        }
        else if ((b1t.equals("O") && b5t.equals("O") && b9t.equals("O"))
                || (b3t.equals("O") && b5t.equals("O") && b7t.equals("O")))
        {
            text.setText("O is a winner :D");
            done=true;
        }
    }



}
