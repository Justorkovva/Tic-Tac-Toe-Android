package justor.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.color.black;

public class Game extends AppCompatActivity {
    private boolean x = true;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

    }


    public void button_click(View v) {

        TextView text=(TextView) findViewById(R.id.textView);
        Button button = (Button) v;
        if(button.getText().equals("."))
        {
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
       // check();
    }
   /* public void check()
    {Button b1=(Button) findViewById(R.id.button1);
        CharSequence b1t,b2t,b3t,b4t,b5t,b6t,b7t,b8t,b9t;
        b1t=b1.getText();
        if(b1t.equals("X"))
        {
            text.setText("X have won");
        }
    }
    */

}
