package com.example.admin.randomquote;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String colors[] = {"#F44336","#9C27B0","#69F0AE","#2196F3","#00BFA5","#673AB7","#FF9800","#03A9F4","#00BCD4",
                        "#29B6F6","#E91E63","#3F51B5","#4CAF50","#FFC107","#FF5722","#FF5722","#3f62a8","#82ee48",
                        "#759aff","#ff5050","#96ff93","#0051ff","#ff0a0a","#ff006f","#ffadff","#8d4cba","#72e5be",
                        "#bdff00"};

    String quotes[] = {"Don't cry because it's over, smile because it happened",
                        "Be yourself; everyone else is already taken",
                        "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe",
                        "A room without books is like a body without a soul",
                        "You know you're in love when you can't fall asleep because reality is finally better than your dreams",
                        "Be the change that you wish to see in the world",
                        "In three words I can sum up everything I've learned about life: it goes on",
                        "Always forgive your enemies; nothing annoys them so much",
                        "Live as if you were to die tomorrow. Learn as if you were to live forever",
                        "Without music, life would be a mistake",
                        "Walk Beside me, and be my friend",
                        "Friends are medicine for a wounded heart and vitamins for a hopeful soul",
                        "All men should strive to learn before they die, what they are running from, and to, and why",
                        "I am always doing that which I cannot do, in order that I may learn how to do it",
                        "Tell me and I forget. Teach me and I remember. Involve me and I learn",
                        "I am not the same, having seen the moon shine on the other side of the world",
                        "Let yourself be silently drawn by the stronger pull of what you really love",
                        "The wound is the place where the Light enters you",
                        "Let the beauty we love be what we do",
                        "Butterflies cannot see their own Beauty",
                        "Happiness is not something ready made. It comes from your own actions",
                        "Remember that sometimes not getting what you want is a wonderful stroke of luck",
                        "If you only do what you can do, you'll never be better than what you are",
                        "I've failed over and over and over again in my life and that is why I succeed",
                        "Talent wins games, but teamwork and intelligence wins championships",
                        "Before Judging others, make sure you're perfect",
                        "There is no secret Ingredient, It's just YOU",
            "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart",
            "What we think, we become","Man needs his difficulties because they are necessary to enjoy success",
            "You have to dream before your dreams can come true","It always seems Impossible until it's done",
            "If you can dream it, you can do it","What defines us is how well we rise after falling",
            "Everything you need is on the other side of fear","The best revenge is Massive Success"};

    String authors[] = {"Dr. Seuss", "Oscar Wilde", "Albert Einstein", "Marcus Tullius Cicero",
                        "Dr. Seuss", "Mahatma Gandhi","Robert Frost","Oscar Wilde",
                        "Mahatma Gandhi", "Friedrich Nietzsche", "Albert Camus", "Steve Maraboli",
                        "James Thurber", "Pablo Picasso", "Benjamin Franklin", "Mary Anne Radmacher",
                        "Rumi","Rumi","Rumi","Naya Rivera","Dalai Lama","Dalai Lama",
                        "Shifu(Kung-Fu Panda)","Michael Jordon","Michael Jordon","Anonymous","Kung-fu Panda",
                        "Hellen Keller","Buddha","Dr. A.P.J. Abdul Kalam","Dr. A.P.J. Abdul Kalam",
                        "Nelson Mandela","Walt Disney","Batman","ScareCrow","Frank Sinatra"};

    LinearLayout backGround;
    TextView quote;
    TextView author;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hiding the Status Bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        quote = (TextView)findViewById(R.id.quote);
        author = (TextView)findViewById(R.id.author);


        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/fontawesome-webfont.ttf");
        quote.setTypeface(font);
        backGround = (LinearLayout) findViewById(R.id.activity_main);

        backGround.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Generating a Random number to pick color
                Random r = new Random();
                int max_color = colors.length;
                int pos_color = (r.nextInt(max_color));

                //Random to pick a Quote
                int max_quote = quotes.length;
                int pos_quote = (r.nextInt(max_quote));

                //Changing the  Color
                quote.setTextColor(Color.parseColor(colors[pos_color]));
                author.setTextColor(Color.parseColor(colors[pos_color]));
                backGround.setBackgroundColor(Color.parseColor(colors[pos_color]));

                //Setting the Text
                quote.setText("\uf10d " + quotes[pos_quote]);
                author.setText("- " + authors[pos_quote]);

            }
        });
    }
}
