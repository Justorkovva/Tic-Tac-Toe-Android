package justor.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.color.black;

public class Game extends AppCompatActivity {
    private boolean x = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void button_click(View v) {
        Button button = (Button) v;
        if(button.getText().equals("."))
        {
            if (x) {
                ((Button) v).setText("X");
                button.setTextColor(getResources().getColor(black));
                x = false;
            } else {
                ((Button) v).setText("O");
                button.setTextColor(getResources().getColor(black));
                x = true;
            }
        }
    }
}
