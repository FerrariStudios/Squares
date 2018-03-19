package com.example.SquaresFerrariLealLuu;

import android.content.Context;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;


public class DrawView extends View {
    public int cX=0;
    public int cY=0;
    public int eX = 0;
    public int eY = 0;
    public int sX = 0;
    public int sY = 0;
    public int jX = 0;
    public int jY = 0;
    public int mX = 0;
    public int mY = 0;
    private int z1State = 1;
    private int z2State = 1;
    private int z3State = 1;
    private int z4State = 1;
    private int z5State = 1;
    private int z6State = 1;
    private int z7State = 1;
    private int z8State = 1;
    private int z9State = 1;
    public int selector = 0;
    public int eX1 = 0;
    public int eY1 = 0;
    public int eXX = 0;
    public int sX1 = 0;
    public int sY1 = 0;
    public boolean loaded = false;
    int touch=0;
    private int x1State1 = 1;
    private int x2State1 = 1;
    private int x3State1 = 1;
    private int x4State1 = 1;
    private int x5State1 = 1;
    private int x6State1 = 1;
    private int x7State1 = 1;
    private int x8State11 = 1;
    private int x9State1 = 1;
    private int count1 = 0;
    public static int center = 0;
    public static int corners = 0;
    public static int other = 0;
    public static int block = 0;
    public static int win = 0;

    private boolean hasWon1= false;
    private int x1State = 1;
    private int x2State = 1;
    private int x3State = 1;
    private int x4State = 1;
    private int x5State = 1;
    private int x6State = 1;
    private int x7State = 1;
    private int x8State = 1;
    private int x9State = 1;
    private int f1State = 1;
    private int f2State = 1;
    private int f3State = 1;
    private int f4State = 1;
    private int f5State = 1;
    private int f6State = 1;
    private int f7State = 1;
    private int f8State = 1;
    private int f9State = 1;
    private int f10State = 1;
    private int f11State = 1;
    private int f12State = 1;
    private int f13State = 1;
    private int f14State = 1;
    private int f15State = 1;
    private int f16State = 1;
    private int e1State = 1;
    private int e2State = 1;
    private int e3State = 1;
    private int e4State = 1;
    private int e5State = 1;
    private int e6State = 1;
    private int e7State = 1;
    private int e8State = 1;
    private int e9State = 1;
    private int e10State = 1;
    private int e11State = 1;
    private int e12State = 1;
    private int e13State = 1;
    private int e14State = 1;
    private int e15State = 1;
    private int e16State = 1;
    private int count = 0;
    private Context myContext;
    private boolean hasWon;
    private boolean hasWonFour;
    private boolean hasWonExtreme;
    private boolean gameStart;
    private boolean gameStartTic;
    private boolean gameStartFour;
    private boolean gameStartExtreme;
    private boolean gameStartAI;
    private boolean hasWonAI;
    private Bitmap soundOFFBmp;
    private Bitmap soundONBmp;
    public boolean look=true;
    private Bitmap homeIcon;
    private float w = getWidth();
    private float h = getHeight();

    public DrawView(Context context) {
        super(context);
        hasWon = false;
        hasWonFour = false;
        hasWonExtreme = false;
        hasWonAI=false;
        gameStartAI=false;
        gameStart = false;
        gameStartFour = false;
        gameStartTic = false;
        gameStartExtreme = false;
        myContext = context;
        homeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.home_icon);
        soundOFFBmp = BitmapFactory.decodeResource(getResources(), R.drawable.soundoff);
        soundONBmp = BitmapFactory.decodeResource(getResources(), R.drawable.soundon);


        SoundPlayer.initSounds(getContext());


    }
    public void win() {

        if (x1State1 + x2State1 + x3State1 == 21) { //horizontal top check
            if (x1State1 == 1) {
                x1State1 = 10;
                count1++;
            } else {
                if (x2State1 == 1) {
                    x2State1 = 10;
                    count1++;
                } else {
                    if (x3State1 == 1) {
                        x3State1 = 10;
                        count1++;
                    }
                }
            }
        } else if (x4State1 + x5State1 + x6State1 == 21) { //horizontal mid check
            if (x4State1 == 1) {
                x4State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else if (x6State1 == 1) {
                    x6State1 = 10;
                    count1++;
                }
            }
        } else if (x7State1 + x8State11 + x9State1 == 21) { //horizontal bot check
            if (x7State1 == 1) {
                x7State1 = 10;
                count1++;
            } else {
                if (x8State11 == 1) {
                    x8State11 = 10;
                    count1++;
                } else if (x9State1 == 1) {
                    x9State1 = 10;
                    count1++;
                }
            }
        } else if (x1State1 + x4State1 + x7State1 == 21) { //vertical left check
            if (x1State1 == 1) {
                x1State1 = 10;
                count1++;
            } else {
                if (x4State1 == 1) {
                    x4State1 = 10;
                    count1++;
                } else if (x7State1 == 1) {
                    x7State1 = 10;
                    count1++;
                }
            }
        } else if (x2State1 + x5State1 + x8State11 == 21) { //vertical mid check
            if (x2State1 == 1) {
                x2State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else if (x8State11 == 1) {
                    x8State11 = 10;
                    count1++;
                }
            }
        } else if (x3State1 + x6State1 + x9State1 == 21) { //vertical right check
            if (x3State1 == 1) {
                x3State1 = 10;
                count1++;
            } else {
                if (x6State1 == 1) {
                    x6State1 = 10;
                    count1++;
                } else {
                    if (x9State1 == 1) {
                        x9State1 = 10;
                        count1++;
                    }
                }
            }
        } else if (x1State1 + x5State1 + x9State1 == 21) { //diag. topL to botR check
            if (x1State1 == 1) {
                x1State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else {
                    if (x9State1 == 1) {
                        x9State1 = 10;
                        count1++;
                    }
                }
            }
        } else if (x3State1 + x5State1 + x8State11 == 21) { //diag. topR to botL check
            if (x3State1 == 1) {
                x3State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else {
                    if (x8State11 == 1) {
                        x8State11 = 10;
                        count1++;
                    }
                }
            }
        }
    }


    public void block() {
        if (x1State1 + x2State1 + x3State1 == 1) { //horizontal top check
            if (x1State1 == 1) {
                x1State1 = 10;
                count1++;
            } else {
                if (x2State1 == 1) {
                    x2State1 = 10;
                    count1++;
                } else {
                    if (x3State1 == 1) {
                        x3State1 = 10;
                        count1++;
                    }
                }
            }
        } else if (x4State1 + x5State1 + x6State1 == 1) { //horizontal mid check
            if (x4State1 == 1) {
                x4State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else if (x6State1 == 1) {
                    x6State1 = 10;
                    count1++;
                }
            }
        } else if (x7State1 + x8State11 + x9State1 == 1) { //horizontal bot check
            if (x7State1 == 1) {
                x7State1 = 10;
                count1++;
            } else {
                if (x8State11 == 1) {
                    x8State11 = 10;
                    count1++;
                } else if (x9State1 == 1) {
                    x9State1 = 10;
                    count1++;

                }
            }
        } else if (x1State1 + x4State1 + x7State1 == 1) { //vertical left check
            if (x1State1 == 1) {
                x1State1 = 10;
                count1++;
            } else {
                if (x4State1 == 1) {
                    x4State1 = 10;
                    count1++;
                } else if (x7State1 == 1) {
                    x7State1 = 10;
                    count1++;
                }
            }
        } else if (x2State1 + x5State1 + x8State11 == 1) { //vertical mid check
            if (x2State1 == 1) {
                x2State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else if (x8State11 == 1) {
                    x8State11 = 10;
                    count1++;
                }
            }
        } else if (x3State1 + x6State1 + x9State1 == 1) { //vertical right check
            if (x3State1 == 1) {
                x3State1 = 10;
                count1++;
            } else {
                if (x6State1 == 1) {
                    x6State1 = 10;
                    count1++;
                } else {
                    if (x9State1 == 1) {
                        x9State1 = 10;
                        count1++;
                    }
                }
            }
        } else if (x1State1 + x5State1 + x9State1 == 1) { //diag. topL to botR check
            if (x1State1 == 1) {
                x1State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else {
                    if (x9State1 == 1) {
                        x9State1 = 10;
                        count1++;
                    }
                }
            }
        } else if (x3State1 + x5State1 + x8State11 == 1) { //diag. topR to botL check
            if (x3State1 == 1) {
                x3State1 = 10;
                count1++;
            } else {
                if (x5State1 == 1) {
                    x5State1 = 10;
                    count1++;
                } else {
                    if (x8State11 == 1) {
                        x8State11 = 10;
                        count1++;
                    }
                }
            }
        }
    }

    public void checkBlock() {
        if (x1State1 + x2State1 + x3State1 == 1)
            block++;
        if (x4State1 + x5State1 + x6State1 == 1)
            block++;
        if (x7State1 + x8State11 + x9State1 == 1)
            block++;
        if (x1State1 + x4State1 + x7State1 == 1)
            block++;
        if (x2State1 + x5State1 + x8State11 == 1)
            block++;
        if (x3State1 + x6State1 + x9State1 == 1)
            block++;
        if (x1State1 + x5State1 + x9State1 == 1)
            block++;
        if (x7State1 + x5State1 + x3State1 == 1)
            block++;
    }

    public void checkWin() {
        if (x1State1 + x2State1 + x3State1 == 21)
            win++;
        if (x4State1 + x5State1 + x6State1 == 21)
            win++;
        if (x7State1 + x8State11 + x9State1 == 21)
            win++;
        if (x1State1 + x4State1 + x7State1 == 21)
            win++;
        if (x2State1 + x5State1 + x8State11 == 21)
            win++;
        if (x3State1 + x6State1 + x9State1 == 21)
            win++;
        if (x1State1 + x5State1 + x9State1 == 21)
            win++;
        if (x7State1 + x5State1 + x3State1 == 21)
            win++;
    }

    public void checkCenter() {
        if (x5State1 == 1)
            center++;
    }

    public void checkCorners() {
        if (x1State1 == 1)
            corners++;
        if (x3State1 == 1)
            corners++;
        if (x7State1 == 1)
            corners++;
        if (x9State1 == 1)
            corners++;
    }

    public void checkOthers() {
        if (x2State1 == 1)
            other++;
        if (x4State1 == 1)
            other++;
        if (x6State1 == 1)
            other++;
        if (x8State11 == 1)
            other++;
    }

    public void takeCenter() {
        x5State1 = 10;
        count1++;
    }

    public void takeCorner() {
        if (x1State1 == 1) {
            x1State1 = 10;
        } else if (x3State1 == 1) {
            x3State1 = 10;
        } else if (x7State1 == 1) {
            x7State1 = 10;
        } else if (x9State1 == 1) {
            x9State1 = 10;
        }
        count1++;
    }

    public void takeOther() {
        if (x2State1 == 1) {
            x2State1 = 10;
        } else if (x4State1 == 1) {
            x4State1 = 10;
        } else if (x6State1 == 1) {
            x6State1 = 10;
        } else if (x8State11 == 1) {
            x8State11 = 10;
        }
        count1++;

    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w = getWidth();
        h = getHeight();
        setBackgroundColor(Color.DKGRAY);
        Paint text = new Paint();
        text.setColor(Color.DKGRAY);
        text.setTextSize((float) (6 * 0.01 * w));
        Typeface font1 = Typeface.createFromAsset(myContext.getAssets(), "Fonts/CollegiateBlackFLF.ttf");
        text.setTypeface(font1);
        Paint cyan = new Paint();
        cyan.setColor(Color.CYAN);
        RectF tictactoe = Draw.createRectF(15, 20, 85, 30, canvas);
        RectF sound = Draw.createRectF(77, 95, 85, 101, canvas);
        if(sound.contains(cX,cY) && look){
            touch++;
            look=false;
        }
        if (touch%2==0){
            canvas.drawBitmap(soundONBmp, null, sound, null);
            invalidate();

        }
        if (!(touch%2==0)){
            canvas.drawBitmap(soundOFFBmp, null, sound, null);
            invalidate();
        }
        RectF fourinarow = Draw.createRectF(15, 35, 85, 45, canvas);
        RectF extreme = Draw.createRectF(15, 50, 85, 60, canvas);
        RectF ai = Draw.createRectF(15, 65, 85, 75, canvas);
        RectF cred = Draw.createRectF(15, 80, 85, 90, canvas);
        Paint title = new Paint();
        title.setTypeface(font1);
        title.setColor(Color.CYAN);
        title.setTextSize((float) (16 * 0.01 * w));
        Paint text1 = new Paint();
        text1.setColor(Color.DKGRAY);
        text1.setTextSize((float) ((float) (4.1) * 0.01 * w));
        text1.setTypeface(font1);
        Paint title1 = new Paint();
        title1.setTypeface(font1);
        title1.setColor(Color.CYAN);
        title1.setTextSize((float) ((float) (5.4) * 0.01 * w));
        Paint title2 = new Paint();
        title2.setTypeface(font1);
        title2.setColor(Color.CYAN);
        title2.setTextSize((float) ((float) (9) * 0.01 * w));
        invalidate();
        hasWon = true;
        hasWonFour = true;
        hasWonExtreme = true;



        if (!gameStart) {

            canvas.drawRoundRect(tictactoe, 25, 25, cyan);
            Draw.drawText("Play Tic-Tac-Toe", 22, (float) (26.5), text, canvas);
            Draw.drawText("Squares", 6, 12, title, canvas);
            canvas.drawRoundRect(fourinarow, 25, 25, cyan);
            Draw.drawText("Play Four-in-a-Row", 17, (float) (41.5), text, canvas);
            canvas.drawRoundRect(extreme, 25, 25, cyan);
            Draw.drawText("Play Four-in-a-Row Extreme", 18, (float) (56), text1, canvas);
            canvas.drawRoundRect(ai, 25, 25, cyan);
            Draw.drawText("Play Tic-Tac-Toe vs Computer", 17, (float) (70), text1, canvas);
            canvas.drawRoundRect(cred, 25, 25, cyan);
            Draw.drawText("FireFerrari Studios", 29, (float) (83), text1, canvas);
            Draw.drawText("Squares© 2016", 32, (float) (87), text1, canvas);
        }

        if (tictactoe.contains(sX, sY) && !gameStartFour && !gameStartExtreme&& !gameStartAI) {

            gameStartTic = true;
            gameStart = true;
            gameStartFour = false;
            gameStartExtreme = false;
            gameStartAI=false;
            invalidate();
        }

        if (fourinarow.contains(sX, sY) && !gameStartTic && !gameStartExtreme && !gameStartAI) {


            gameStart = true;
            gameStartFour = true;
            gameStartTic = false;
            gameStartExtreme = false;
            invalidate();
        }

        if (extreme.contains(sX, sY) && !gameStartTic && !gameStartFour && !gameStartAI) {


            gameStart = true;
            gameStartFour = false;
            gameStartTic = false;
            gameStartExtreme = true;
            gameStartAI=false;
            invalidate();
        }
        if (ai.contains(sX, sY) && !gameStartTic && !gameStartFour && !gameStartExtreme) {


            gameStart = true;
            gameStartFour = false;
            gameStartTic = false;
            gameStartExtreme = false;
            gameStartAI=true;
            invalidate();
        }




        if (gameStartExtreme) {
            hasWonExtreme = false;
            hasWonFour = false;
            hasWon = false;
            tictactoe.setEmpty();
            fourinarow.setEmpty();
            invalidate();


            title.setTextSize((float) (3 * 0.01 * w));

            RectF startOver = Draw.createRectF(66, 0, 105, 12, canvas);
            Draw.drawText("New Game", 78, 5, title, canvas);

            RectF home1 = Draw.createRectF(90, 95, 100, 101, canvas);
            canvas.drawBitmap(homeIcon, null, home1, null);

            if (home1.contains(sX, sY)) {
                hasWonExtreme = false;
                invalidate();
                gameStart = false;
                gameStartFour = false;
                gameStartExtreme = false;
                e1State = 1;
                e2State = 1;
                e3State = 1;
                e4State = 1;
                e5State = 1;
                e6State = 1;
                e7State = 1;
                e8State = 1;
                e9State = 1;
                e10State = 1;
                e11State = 1;
                e12State = 1;
                e13State = 1;
                e14State = 1;
                e15State = 1;
                e16State = 1;
                count = 0;
                jX = -10;
                jY = -10;
                sX = -10;
                sY = -10;
                mX = -10;
                mY = -10;

            }


            if (startOver.contains(sX, sY)) {
                hasWonExtreme = false;
                e1State = 1;
                e2State = 1;
                e3State = 1;
                e4State = 1;
                e5State = 1;
                e6State = 1;
                e7State = 1;
                e8State = 1;
                e9State = 1;
                e10State = 1;
                e11State = 1;
                e12State = 1;
                e13State = 1;
                e14State = 1;
                e15State = 1;
                e16State = 1;
                count = 0;
                jX = -10;
                jY = -10;
                sX = -10;
                sY = -10;
                mX = -10;
                mY = -10;
            }
            Paint orange = new Paint();
            orange.setARGB(255, 255, 25, 194);
            cyan.setStrokeWidth(10);
            Paint a = new Paint();
            a.setColor(Color.DKGRAY);
            a.setStyle(Paint.Style.STROKE);
            a.setStrokeWidth(10);
            setBackgroundColor(Color.DKGRAY);
            RectF playerOneText = Draw.createRectF(12, 99, 20, 101, canvas);
            Draw.drawText("Player 1 (X)", playerOneText, title, canvas);
            RectF playerTwoText = Draw.createRectF(50, 99, 58, 101, canvas);
            Draw.drawText("Player 2 (O)", playerTwoText, title, canvas);
            title.setTextSize((float) (10 * 0.01 * w));
            Draw.drawText("Four-in-a-Row Extreme", 4, 7, title1, canvas);
            RectF e1 = Draw.createRectF((float) 12.5, (float) 12.5, (float) 31.25, (float) 31.25, canvas);
            canvas.drawRect(e1, a);
            RectF e01 = Draw.createRectF((float) 14.5, (float) 14.5, (float) 29.25, (float) 29.25, canvas);
            RectF e2 = Draw.createRectF((float) 31.25, (float) 12.5, 50, (float) 31.25, canvas);
            canvas.drawRect(e2, a);
            RectF e02 = Draw.createRectF((float) 33.25, (float) 14.5, (float) 48, (float) 29.25, canvas);
            RectF e3 = Draw.createRectF(50, (float) 12.5, (float) 68.75, (float) 31.25, canvas);
            canvas.drawRect(e3, a);
            RectF e03 = Draw.createRectF(52, (float) 14.5, (float) 66.75, (float) 29.25, canvas);
            RectF e4 = Draw.createRectF((float) 68.75, (float) 12.5, (float) 87.5, (float) 31.25, canvas);
            canvas.drawRect(e4, a);
            RectF e04 = Draw.createRectF((float) 70.75, (float) 14.5, (float) 85.5, (float) 29.25, canvas);
            RectF e5 = Draw.createRectF((float) 12.5, (float) 31.25, (float) 31.25, (float) 50, canvas);
            canvas.drawRect(e5, a);
            RectF e05 = Draw.createRectF((float) 14.5, (float) 33.25, (float) 29.25, 48, canvas);
            RectF e6 = Draw.createRectF((float) 31.25, (float) 31.25, (float) 50, 50, canvas);
            canvas.drawRect(e6, a);
            RectF e06 = Draw.createRectF((float) 33.25, (float) 33.25, 48, 48, canvas);
            RectF e7 = Draw.createRectF((float) 50, (float) 31.25, (float) 68.75, 50, canvas);
            canvas.drawRect(e7, a);
            RectF e07 = Draw.createRectF(52, (float) 33.25, (float) 66.75, 48, canvas);
            RectF e8 = Draw.createRectF((float) 68.75, (float) 31.25, (float) 87.5, 50, canvas);
            canvas.drawRect(e8, a);
            RectF e08 = Draw.createRectF((float) 70.75, (float) 33.25, (float) 85.5, 48, canvas);
            RectF e9 = Draw.createRectF((float) 12.5, 50, (float) 31.25, (float) 68.75, canvas);
            canvas.drawRect(e9, a);
            RectF e09 = Draw.createRectF((float) 14.5, 52, (float) 29.25, (float) 66.75, canvas);
            RectF e10 = Draw.createRectF((float) 31.25, 50, (float) 50, (float) 68.75, canvas);
            canvas.drawRect(e10, a);
            RectF e010 = Draw.createRectF((float) 33.25, 52, (float) 48, (float) 66.75, canvas);
            RectF e11 = Draw.createRectF((float) 50, 50, (float) 68.75, (float) 68.75, canvas);
            canvas.drawRect(e11, a);
            RectF e011 = Draw.createRectF((float) 52, 52, (float) 66.75, (float) 66.75, canvas);
            RectF e12 = Draw.createRectF((float) 68.75, 50, (float) 87.5, (float) 68.75, canvas);
            canvas.drawRect(e12, a);
            RectF e012 = Draw.createRectF((float) 70.75, 52, (float) 85.5, (float) 66.75, canvas);
            RectF e13 = Draw.createRectF((float) 12.5, (float) 68.75, (float) 31.25, (float) 87.5, canvas);
            canvas.drawRect(e13, a);
            RectF e013 = Draw.createRectF((float) 14.5, (float) 70.75, (float) 29.25, (float) 85.5, canvas);
            RectF e14 = Draw.createRectF((float) 31.25, (float) 68.75, (float) 50, (float) 87.5, canvas);
            canvas.drawRect(e14, a);
            RectF e014 = Draw.createRectF((float) 33.25, (float) 70.75, (float) 48, (float) 85.5, canvas);
            RectF e15 = Draw.createRectF(50, (float) 68.75, (float) 68.75, (float) 87.5, canvas);
            canvas.drawRect(e15, a);
            RectF e015 = Draw.createRectF((float) 52, (float) 70.75, (float) 66.75, (float) 85.5, canvas);
            RectF e16 = Draw.createRectF((float) 68.75, (float) 68.75, (float) 87.5, (float) 87.5, canvas);
            canvas.drawRect(e16, a);
            RectF e016 = Draw.createRectF((float) 70.75, (float) 70.75, (float) 85.5, (float) 85.5, canvas);
            canvas.drawLine(e1.right, e1.top, e13.right, e13.bottom, cyan);
            canvas.drawLine(e2.right, e2.top, e14.right, e14.bottom, cyan);
            canvas.drawLine(e3.right, e3.top, e15.right, e15.bottom, cyan);
            canvas.drawLine(e1.left, e5.top, e4.right, e4.bottom, cyan);
            canvas.drawLine(e5.left, e9.top, e8.right, e12.top, cyan);
            canvas.drawLine(e13.left, e13.top, e16.right, e12.bottom, cyan);


            cyan.setTextSize((float) 0.05 * w);
            cyan.setStyle(Paint.Style.STROKE);
            Paint cyanFill = new Paint();
            cyanFill.setColor(Color.CYAN);
            cyanFill.setStyle(Paint.Style.STROKE);
            Paint cyanFill2 = new Paint();
            cyanFill2.setColor(Color.CYAN);
            cyanFill2.setStyle(Paint.Style.STROKE);
            orange.setStrokeWidth(10);
            orange.setStyle(Paint.Style.STROKE);
            RectF playerOneSymbol = Draw.createRectF(5, 96, 12, 101, canvas);
            RectF playerOneSymbol1 = Draw.createRectF(5, 96, 12, 101, canvas);
            canvas.drawRect(playerOneSymbol, orange);
            RectF playerTwoSymbol = Draw.createRectF(44, 96, 51, 101, canvas);
            RectF playerTwoSymbol2 = Draw.createRectF(44, 96, 51, 101, canvas);
            canvas.drawRect(playerTwoSymbol, orange);
            if
                    (e1.contains(mX, mY) && e1State == 1) {
                if
                        (count % 2 == 0) {
                    e1State = 0;
                } else {
                    e1State = 10;
                }
                count++;
            }
            if
                    (e2.contains(mX, mY) && e2State == 1) {
                if
                        (count % 2 == 0) {
                    e2State = 0;
                } else {
                    e2State = 10;
                }
                count++;
            }
            if
                    (e3.contains(mX, mY) && e3State == 1) {
                if
                        (count % 2 == 0) {
                    e3State = 0;
                } else {
                    e3State = 10;
                }
                count++;
            }
            if
                    (e4.contains(mX, mY) && e4State == 1) {
                if
                        (count % 2 == 0) {
                    e4State = 0;
                } else {
                    e4State = 10;
                }
                count++;
            }
            if
                    (e5.contains(mX, mY) && e5State == 1) {
                if
                        (count % 2 == 0) {
                    e5State = 0;
                } else {
                    e5State = 10;
                }
                count++;
            }
            if
                    (e6.contains(mX, mY) && e6State == 1) {
                if
                        (count % 2 == 0) {
                    e6State = 0;
                } else {
                    e6State = 10;
                }
                count++;
            }
            if
                    (e7.contains(mX, mY) && e7State == 1) {
                if
                        (count % 2 == 0) {
                    e7State = 0;
                } else {
                    e7State = 10;
                }
                count++;
            }
            if
                    (e8.contains(mX, mY) && e8State == 1) {
                if
                        (count % 2 == 0) {
                    e8State = 0;
                } else {
                    e8State = 10;
                }
                count++;
            }
            if
                    (e9.contains(mX, mY) && e9State == 1) {
                if
                        (count % 2 == 0) {
                    e9State = 0;
                } else {
                    e9State = 10;
                }
                count++;
            }
            if
                    (e10.contains(mX, mY) && e10State == 1) {
                if
                        (count % 2 == 0) {
                    e10State = 0;
                } else {
                    e10State = 10;
                }
                count++;
            }
            if
                    (e11.contains(mX, mY) && e11State == 1) {
                if
                        (count % 2 == 0) {
                    e11State = 0;
                } else {
                    e11State = 10;
                }
                count++;
            }
            if
                    (e12.contains(mX, mY) && e12State == 1) {
                if
                        (count % 2 == 0) {
                    e12State = 0;
                } else {
                    e12State = 10;
                }
                count++;
            }
            if
                    (e13.contains(mX, mY) && e13State == 1) {
                if
                        (count % 2 == 0) {
                    e13State = 0;
                } else {
                    e13State = 10;
                }
                count++;
            }
            if
                    (e14.contains(mX, mY) && e14State == 1) {
                if
                        (count % 2 == 0) {
                    e14State = 0;
                } else {
                    e14State = 10;
                }
                count++;
            }
            if
                    (e15.contains(mX, mY) && e15State == 1) {
                if
                        (count % 2 == 0) {
                    e15State = 0;
                } else {
                    e15State = 10;
                }
                count++;
            }
            if
                    (e16.contains(mX, mY) && e16State == 1) {
                if
                        (count % 2 == 0) {
                    e16State = 0;
                } else {
                    e16State = 10;
                }
                count++;
            }


            if
                    (e1State == 0) {
                Draw.drawX(e01, orange, canvas);
            } else {
                if
                        (e1State == 10) {
                    Draw.drawCircle(e01, orange, canvas);
                }
            }
            if
                    (e2State == 0) {
                Draw.drawX(e02, orange, canvas);
            } else {
                if
                        (e2State == 10) {
                    Draw.drawCircle(e02, orange, canvas);

                }
            }
            if
                    (e3State == 0) {
                Draw.drawX(e03, orange, canvas);
            } else {
                if
                        (e3State == 10) {
                    Draw.drawCircle(e03, orange, canvas);
                }
            }
            if
                    (e4State == 0) {
                Draw.drawX(e04, orange, canvas);
            } else {
                if
                        (e4State == 10) {
                    Draw.drawCircle(e04, orange, canvas);
                }
            }
            if
                    (e5State == 0) {
                Draw.drawX(e05, orange, canvas);
            } else {
                if
                        (e5State == 10) {
                    Draw.drawCircle(e05, orange, canvas);
                }
            }
            if
                    (e6State == 0) {
                Draw.drawX(e06, orange, canvas);
            } else {
                if
                        (e6State == 10) {
                    Draw.drawCircle(e06, orange, canvas);
                }
            }
            if
                    (e7State == 0) {
                Draw.drawX(e07, orange, canvas);
            } else {
                if
                        (e7State == 10) {
                    Draw.drawCircle(e07, orange, canvas);
                }
            }
            if
                    (e8State == 0) {
                Draw.drawX(e08, orange, canvas);
            } else {
                if
                        (e8State == 10) {
                    Draw.drawCircle(e08, orange, canvas);
                }
            }
            if
                    (e9State == 0) {
                Draw.drawX(e09, orange, canvas);
            } else {
                if
                        (e9State == 10) {
                    Draw.drawCircle(e09, orange, canvas);
                }
            }
            if
                    (e10State == 0) {
                Draw.drawX(e010, orange, canvas);
            } else {
                if
                        (e10State == 10) {
                    Draw.drawCircle(e010, orange, canvas);
                }
            }
            if
                    (e11State == 0) {
                Draw.drawX(e011, orange, canvas);
            } else {
                if
                        (e11State == 10) {
                    Draw.drawCircle(e011, orange, canvas);
                }
            }
            if
                    (e12State == 0) {
                Draw.drawX(e012, orange, canvas);
            } else {
                if
                        (e12State == 10) {
                    Draw.drawCircle(e012, orange, canvas);
                }
            }
            if
                    (e13State == 0) {
                Draw.drawX(e013, orange, canvas);
            } else {
                if
                        (e13State == 10) {
                    Draw.drawCircle(e013, orange, canvas);
                }
            }
            if
                    (e14State == 0) {
                Draw.drawX(e014, orange, canvas);
            } else {
                if
                        (e14State == 10) {
                    Draw.drawCircle(e014, orange, canvas);
                }
            }
            if
                    (e15State == 0) {
                Draw.drawX(e015, orange, canvas);
            } else {
                if
                        (e15State == 10) {
                    Draw.drawCircle(e015, orange, canvas);
                }
            }
            if
                    (e16State == 0) {
                Draw.drawX(e016, orange, canvas);
            } else {
                if
                        (e16State == 10) {
                    Draw.drawCircle(e016, orange, canvas);
                }
            }

            if (count % 2 == 0) {
                cyanFill.setStyle(Paint.Style.FILL);
            }
            if (count % 2 != 0) {
                cyanFill2.setStyle(Paint.Style.FILL);
            }
            canvas.drawRect(playerOneSymbol1, cyanFill);
            canvas.drawRect(playerTwoSymbol2, cyanFill2);
            RectF outcome = Draw.createRectF(0, 88, 105, 102, canvas);
            title.setTextSize((float) (10 * 0.01 * w));
            Paint gray = new Paint();
            gray.setStyle(Paint.Style.FILL);
            gray.setColor(Color.DKGRAY);
            if
                    (e1State + e2State + e3State + e4State == 0) { //straight across top x
                canvas.drawLine(e1.left, 23 * e1.bottom / 32, e4.right, 23 * e1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;

            }
            if
                    (e1State + e2State + e3State + e4State == 40) { //straight across top O
                canvas.drawLine(e1.left, 23 * e1.bottom / 32, e4.right, 23 * e1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;

            }
            if
                    (e1State + e5State + e9State + e13State == 0) { //straight down left
                //  x
                canvas.drawLine(17 * e1.left / 10, e1.top, 17 * e1.left / 10, e13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e1State + e5State + e9State + e13State == 40) { //straight down left
                // O
                canvas.drawLine(17 * e1.left / 10, e1.top, 17 * e1.left / 10, e13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e5State + e6State + e7State + e8State == 0) { //straight across upper middle x
                canvas.drawLine(e1.left, 26 * e5.bottom / 32, e8.right, 26 * e8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e5State + e6State + e7State + e8State == 40) { //straight across  upper middle O
                canvas.drawLine(e1.left
                        , 26 * e5.bottom / 32, e8.right, 26 * e8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e13State + e14State + e15State + e16State == 0) { //straight across bottom x
                canvas.drawLine(e1.left, 28 * e13.bottom / 32, e4.right, 28 * e16.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e13State + e14State + e15State + e16State == 40) { //straight across bottom O
                canvas.drawLine(e1.left, 28 * e13.bottom / 32, e4.right, 28 * e16.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e1State + e6State + e11State + e16State == 0) { //Diagonal topleft
                // -botright across middle x
                canvas.drawLine(e1.left
                        , e1.top, e16.right, e16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e1State + e6State + e11State + e16State == 40) { //Diagonal topleft
                // -botright across middle O
                canvas.drawLine(e1.left
                        , e1.top, e16.right, e16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e4State + e7State + e10State + e13State == 0) { //Diagonal topright-botleft
                // across middle x
                canvas.drawLine(e4.right, e3.top, e13.left, e13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e4State + e7State + e10State + e13State == 40) { //Diagonal topright-botleft
                // across middle O
                canvas.drawLine(e4.right, e3.top, e13.left, e13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e2State + e6State + e10State + e14State == 0) {  //straight down middle left
                // x
                canvas.drawLine((float) .82 * e2.right, e2.top, (float) .82 * e14.right, e14.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e2State + e6State + e10State + e14State == 40) {  //straight down middle left
                // 0
                canvas.drawLine((float) .82 * e2.right, e2.top, (float) .82 * e14.right, e14.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }


            if
                    (e4State + e8State + e12State + e16State == 0) { //straight down right x
                canvas.drawLine(((e4.left + e4.right) / 2), e4.top, ((e16.left + e16.right) / 2), e16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e4State + e8State + e12State + e16State == 40) { //straight down right 0
                canvas.drawLine(((e4.left + e4.right) / 2), e4.top,  ((e16.left + e16.right) / 2), e16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }

            if
                    (e3State + e7State + e11State + e15State == 0) { //straight down middle right x
                canvas.drawLine((float) .865 * e3.right, e3.top, (float) .865 * e15.right, e15.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e3State + e7State + e11State + e15State == 40) { //straight down middle right o
                canvas.drawLine((float) .865 * e3.right, e3.top, (float) .865 * e15.right, e15.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }

            if
                    (e9State + e10State + e12State + e11State == 0) { //straight across lower middle x
                canvas.drawLine(e1.left, ((e9.top + e9.bottom) / 2), e8.right, ((e9.top + e9.bottom) / 2), cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e9State + e10State + e12State + e11State == 40) { //straight across lower middle 0
                canvas.drawLine(e1.left, ((e9.top + e9.bottom) / 2), e8.right, ((e9.top + e9.bottom) / 2), cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }

            if
                    (e1State + e4State + e13State + e16State == 40) { //Corners 0
                canvas.drawLine(((e4.left + e4.right) / 2),( (e4.top + e4.bottom) / 2 ), ((e16.left + e16.right) / 2),(( e16.bottom + e16.top) /2) ,cyan);
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2), ((e13.left +  e13.right) / 2), ((e13.bottom + e13.top) / 2), cyan);
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2), ((e4.left + e4.right) / 2), ((e4.bottom + e4.top) / 2), cyan);
                canvas.drawLine(((e13.left + e13.right) / 2),( (e13.top + e13.bottom) / 2 ), ((e16.left + e16.right) / 2),(( e16.bottom + e16.top) /2) ,cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e1State + e4State + e13State + e16State == 0) { //Corners X
                canvas.drawLine(((e4.left + e4.right) / 2),( (e4.top + e4.bottom) / 2 ), ((e16.left + e16.right) / 2),(( e16.bottom + e16.top) /2) ,cyan);
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2), ((e13.left +  e13.right) / 2), ((e13.bottom + e13.top) / 2), cyan);
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2), ((e4.left + e4.right) / 2), ((e4.bottom + e4.top) / 2), cyan);
                canvas.drawLine(((e13.left + e13.right) / 2),( (e13.top + e13.bottom) / 2 ), ((e16.left + e16.right) / 2),(( e16.bottom + e16.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }

            if
                    (e1State + e2State + e5State + e6State == 0) { //box top right x
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2 ), ((e2.left + e2.right) / 2),(( e2.bottom + e2.top) /2) ,cyan);
                canvas.drawLine(((e2.left + e2.right) / 2), ((e2.top + e2.bottom) / 2), ((e6.left +  e6.right) / 2), ((e6.bottom + e6.top) / 2), cyan);
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2), ((e5.left + e5.right) / 2), ((e5.bottom + e5.top) / 2), cyan);
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2 ), ((e5.left + e5.right) / 2),(( e5.bottom + e5.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }

            if
                    (e1State + e2State + e5State + e6State == 40) { //box top right o
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2 ), ((e2.left + e2.right) / 2),(( e2.bottom + e2.top) /2) ,cyan);
                canvas.drawLine(((e2.left + e2.right) / 2), ((e2.top + e2.bottom) / 2), ((e6.left +  e6.right) / 2), ((e6.bottom + e6.top) / 2), cyan);
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2), ((e5.left + e5.right) / 2), ((e5.bottom + e5.top) / 2), cyan);
                canvas.drawLine(((e1.left + e1.right) / 2), ((e1.top + e1.bottom) / 2 ), ((e5.left + e5.right) / 2),(( e5.bottom + e5.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }

            if
                    (e2State + e3State + e6State + e7State == 40) { //box middle  o
                canvas.drawLine(((e2.left + e2.right) / 2), ((e2.top + e2.bottom) / 2 ), ((e3.left + e3.right) / 2),(( e3.bottom + e3.top) /2) ,cyan);
                canvas.drawLine(((e3.left + e3.right) / 2), ((e3.top + e3.bottom) / 2), ((e7.left +  e7.right) / 2), ((e7.bottom + e7.top) / 2), cyan);
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2), ((e6.left + e6.right) / 2), ((e6.bottom + e6.top) / 2), cyan);
                canvas.drawLine(((e2.left + e2.right) / 2), ((e2.top + e2.bottom) / 2 ), ((e6.left + e6.right) / 2),(( e6.bottom + e6.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e2State + e3State + e6State + e7State == 0) { //box middle  x
                canvas.drawLine(((e2.left + e2.right) / 2), ((e2.top + e2.bottom) / 2 ), ((e3.left + e3.right) / 2),(( e3.bottom + e3.top) /2) ,cyan);
                canvas.drawLine(((e3.left + e3.right) / 2), ((e3.top + e3.bottom) / 2), ((e7.left +  e7.right) / 2), ((e7.bottom + e7.top) / 2), cyan);
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2), ((e6.left + e6.right) / 2), ((e6.bottom + e6.top) / 2), cyan);
                canvas.drawLine(((e2.left + e2.right) / 2), ((e2.top + e2.bottom) / 2 ), ((e6.left + e6.right) / 2),(( e6.bottom + e6.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e3State + e4State + e7State + e8State == 40) { //box  right o
                canvas.drawLine(((e3.left + e3.right) / 2), ((e3.top + e3.bottom) / 2 ), ((e4.left + e4.right) / 2),(( e4.bottom + e4.top) /2) ,cyan);
                canvas.drawLine(((e4.left + e4.right) / 2), ((e4.top + e4.bottom) / 2), ((e8.left +  e8.right) / 2), ((e8.bottom + e8.top) / 2), cyan);
                canvas.drawLine(((e8.left + e8.right) / 2), ((e8.top + e8.bottom) / 2), ((e7.left + e7.right) / 2), ((e7.bottom + e7.top) / 2), cyan);
                canvas.drawLine(((e3.left + e3.right) / 2), ((e3.top + e3.bottom) / 2 ), ((e7.left + e7.right) / 2),(( e7.bottom + e7.top) /2) ,cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e3State + e4State + e7State + e8State == 0) { //box  right X
                canvas.drawLine(((e3.left + e3.right) / 2), ((e3.top + e3.bottom) / 2 ), ((e4.left + e4.right) / 2),(( e4.bottom + e4.top) /2) ,cyan);
                canvas.drawLine(((e4.left + e4.right) / 2), ((e4.top + e4.bottom) / 2), ((e8.left +  e8.right) / 2), ((e8.bottom + e8.top) / 2), cyan);
                canvas.drawLine(((e8.left + e8.right) / 2), ((e8.top + e8.bottom) / 2), ((e7.left + e7.right) / 2), ((e7.bottom + e7.top) / 2), cyan);
                canvas.drawLine(((e3.left + e3.right) / 2), ((e3.top + e3.bottom) / 2 ), ((e7.left + e7.right) / 2),(( e7.bottom + e7.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e5State + e6State + e9State + e10State == 0) { //box  right X
                canvas.drawLine(((e5.left + e5.right) / 2), ((e5.top + e5.bottom) / 2 ), ((e6.left + e6.right) / 2),(( e6.bottom + e6.top) /2) ,cyan);
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2), ((e10.left +  e10.right) / 2), ((e10.bottom + e10.top) / 2), cyan);
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2), ((e9.left + e9.right) / 2), ((e9.bottom + e9.top) / 2), cyan);
                canvas.drawLine(((e5.left + e5.right) / 2), ((e5.top + e5.bottom) / 2 ), ((e9.left + e9.right) / 2),(( e9.bottom + e9.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e5State + e6State + e9State + e10State == 40) { //box  right 0
                canvas.drawLine(((e5.left + e5.right) / 2), ((e5.top + e5.bottom) / 2 ), ((e6.left + e6.right) / 2),(( e6.bottom + e6.top) /2) ,cyan);
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2), ((e10.left +  e10.right) / 2), ((e10.bottom + e10.top) / 2), cyan);
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2), ((e9.left + e9.right) / 2), ((e9.bottom + e9.top) / 2), cyan);
                canvas.drawLine(((e5.left + e5.right) / 2), ((e5.top + e5.bottom) / 2 ), ((e9.left + e9.right) / 2),(( e9.bottom + e9.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e6State + e7State + e10State + e11State == 40) { //box  right 0
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2 ), ((e7.left + e7.right) / 2),(( e7.bottom + e7.top) /2) ,cyan);
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2), ((e11.left +  e11.right) / 2), ((e11.bottom + e11.top) / 2), cyan);
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2), ((e10.left + e10.right) / 2), ((e10.bottom + e10.top) / 2), cyan);
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2 ), ((e10.left + e10.right) / 2),(( e10.bottom + e10.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e6State + e7State + e10State + e11State == 0) { //box  right X
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2 ), ((e7.left + e7.right) / 2),(( e7.bottom + e7.top) /2) ,cyan);
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2), ((e11.left +  e11.right) / 2), ((e11.bottom + e11.top) / 2), cyan);
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2), ((e10.left + e10.right) / 2), ((e10.bottom + e10.top) / 2), cyan);
                canvas.drawLine(((e6.left + e6.right) / 2), ((e6.top + e6.bottom) / 2 ), ((e10.left + e10.right) / 2),(( e10.bottom + e10.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e7State + e8State + e11State + e12State == 0) { //box  right X
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2 ), ((e8.left + e8.right) / 2),(( e8.bottom + e8.top) /2) ,cyan);
                canvas.drawLine(((e8.left + e8.right) / 2), ((e8.top + e8.bottom) / 2), ((e12.left +  e12.right) / 2), ((e12.bottom + e12.top) / 2), cyan);
                canvas.drawLine(((e12.left + e12.right) / 2), ((e12.top + e12.bottom) / 2), ((e11.left + e11.right) / 2), ((e11.bottom + e11.top) / 2), cyan);
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2 ), ((e11.left + e11.right) / 2),(( e11.bottom + e11.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e7State + e8State + e11State + e12State == 40) { //box  right 0
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2 ), ((e8.left + e8.right) / 2),(( e8.bottom + e8.top) /2) ,cyan);
                canvas.drawLine(((e8.left + e8.right) / 2), ((e8.top + e8.bottom) / 2), ((e12.left +  e12.right) / 2), ((e12.bottom + e12.top) / 2), cyan);
                canvas.drawLine(((e12.left + e12.right) / 2), ((e12.top + e12.bottom) / 2), ((e11.left + e11.right) / 2), ((e11.bottom + e11.top) / 2), cyan);
                canvas.drawLine(((e7.left + e7.right) / 2), ((e7.top + e7.bottom) / 2 ), ((e11.left + e11.right) / 2),(( e11.bottom + e11.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e9State + e10State + e13State + e14State == 0) { //box  right X
                canvas.drawLine(((e9.left + e9.right) / 2), ((e9.top + e9.bottom) / 2 ), ((e10.left + e10.right) / 2),(( e10.bottom + e10.top) /2) ,cyan);
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2), ((e14.left +  e14.right) / 2), ((e14.bottom + e14.top) / 2), cyan);
                canvas.drawLine(((e14.left + e14.right) / 2), ((e14.top + e14.bottom) / 2), ((e13.left + e13.right) / 2), ((e13.bottom + e13.top) / 2), cyan);
                canvas.drawLine(((e9.left + e9.right) / 2), ((e9.top + e9.bottom) / 2 ), ((e13.left + e13.right) / 2),(( e13.bottom + e13.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e9State + e10State + e13State + e14State == 40) { //box  right 0
                canvas.drawLine(((e9.left + e9.right) / 2), ((e9.top + e9.bottom) / 2 ), ((e10.left + e10.right) / 2),(( e10.bottom + e10.top) /2) ,cyan);
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2), ((e14.left +  e14.right) / 2), ((e14.bottom + e14.top) / 2), cyan);
                canvas.drawLine(((e14.left + e14.right) / 2), ((e14.top + e14.bottom) / 2), ((e13.left + e13.right) / 2), ((e13.bottom + e13.top) / 2), cyan);
                canvas.drawLine(((e9.left + e9.right) / 2), ((e9.top + e9.bottom) / 2 ), ((e13.left + e13.right) / 2),(( e13.bottom + e13.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e10State + e11State + e14State + e15State == 0) { //box  right X
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2 ), ((e11.left + e11.right) / 2),(( e11.bottom + e11.top) /2) ,cyan);
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2), ((e15.left +  e15.right) / 2), ((e15.bottom + e15.top) / 2), cyan);
                canvas.drawLine(((e15.left + e15.right) / 2), ((e15.top + e15.bottom) / 2), ((e14.left + e14.right) / 2), ((e14.bottom + e14.top) / 2), cyan);
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2 ), ((e14.left + e14.right) / 2),(( e14.bottom + e14.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e10State + e11State + e14State + e15State == 40) { //box  right 0
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2 ), ((e11.left + e11.right) / 2),(( e11.bottom + e11.top) /2) ,cyan);
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2), ((e15.left +  e15.right) / 2), ((e15.bottom + e15.top) / 2), cyan);
                canvas.drawLine(((e15.left + e15.right) / 2), ((e15.top + e15.bottom) / 2), ((e14.left + e14.right) / 2), ((e14.bottom + e14.top) / 2), cyan);
                canvas.drawLine(((e10.left + e10.right) / 2), ((e10.top + e10.bottom) / 2 ), ((e14.left + e14.right) / 2),(( e14.bottom + e14.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e11State + e12State + e15State + e16State == 0) { //box  right X
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2 ), ((e12.left + e12.right) / 2),(( e12.bottom + e12.top) /2) ,cyan);
                canvas.drawLine(((e12.left + e12.right) / 2), ((e12.top + e12.bottom) / 2), ((e16.left +  e16.right) / 2), ((e16.bottom + e16.top) / 2), cyan);
                canvas.drawLine(((e16.left + e16.right) / 2), ((e16.top + e16.bottom) / 2), ((e15.left + e15.right) / 2), ((e15.bottom + e15.top) / 2), cyan);
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2 ), ((e15.left + e15.right) / 2),(( e15.bottom + e15.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (e11State + e12State + e15State + e16State == 40) { //box  right 0
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2 ), ((e12.left + e12.right) / 2),(( e12.bottom + e12.top) /2) ,cyan);
                canvas.drawLine(((e12.left + e12.right) / 2), ((e12.top + e12.bottom) / 2), ((e16.left +  e16.right) / 2), ((e16.bottom + e16.top) / 2), cyan);
                canvas.drawLine(((e16.left + e16.right) / 2), ((e16.top + e16.bottom) / 2), ((e15.left + e15.right) / 2), ((e15.bottom + e15.top) / 2), cyan);
                canvas.drawLine(((e11.left + e11.right) / 2), ((e11.top + e11.bottom) / 2 ), ((e15.left + e15.right) / 2),(( e15.bottom + e15.top) /2) ,cyan);

                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonExtreme = true;
            }
            if
                    (count == 16 && e1State + e2State + e3State + e4State != 0 && e1State + e2State + e3State + e4State != 40 && e1State + e5State + e9State + e13State != 0 &&
                    e1State + e5State + e9State + e13State != 40 && e5State + e6State + e7State + e8State != 0 && e5State + e6State + e7State + e8State != 40 &&
                    e1State + e6State + e11State + e16State != 0 && e1State + e6State + e11State + e16State != 40 && e4State + e7State + e10State + +e13State != 0 &&
                    e4State + e7State + e10State + +e13State != 40 && e2State + e6State + e10State + e14State != 40 && e2State + e6State + e10State + e14State != 0 &&
                    e4State + e8State + e12State + e16State != 40 && e4State + e8State + e12State + e16State != 0 && e13State + e14State + e15State + e16State != 40
                    && e13State + e14State + e15State + e16State != 40 && e3State + e7State + e11State + e15State != 40 && e3State + e7State + e11State + e15State != 0
                    && e9State + e10State + e11State + e12State != 40 && e9State + e10State + e11State + e12State != 0 && e1State + e4State + e13State + e16State != 40
                    && e1State + e4State + e13State + e16State != 0 && e1State + e2State + e5State + e6State != 0 && e1State + e2State + e5State + e6State != 40
                    && e2State + e3State + e6State + e7State != 0&& e2State + e3State + e6State + e7State != 40 && e3State + e4State + e7State + e8State != 0
                    && e3State + e4State + e7State + e8State != 40 && e5State + e6State + e9State + e10State != 0 && e5State + e6State + e9State + e10State != 40
                    && e6State + e7State + e10State + e11State != 0 && e6State + e7State + e10State + e11State != 40 && e7State + e8State + e11State + e12State != 0
                    && e7State + e8State + e11State + e12State != 40 && e9State + e10State + e13State + e14State != 0  && e9State + e10State + e13State + e14State != 40
                    && e10State + e11State + e14State + e15State != 0&& e10State + e11State + e14State + e15State != 40 && e11State + e12State + e15State + e16State != 0
                    && e11State + e12State + e15State + e16State != 40) {
                canvas.drawRect(outcome, gray);
                Draw.drawText("Draw!", 32, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
            }
        }


//-----------------------------------------------------------------------------------------------------------------------------


        if (gameStartFour) {

            hasWonFour = false;
            hasWon = false;
            tictactoe.setEmpty();
            extreme.setEmpty();
            invalidate();


            title.setTextSize((float) (3 * 0.01 * w));

            RectF startOver = Draw.createRectF(66, 0, 105, 12, canvas);
            Draw.drawText("New Game", 78, 5, title, canvas);

            RectF home1 = Draw.createRectF(90, 95, 100, 101, canvas);
            canvas.drawBitmap(homeIcon, null, home1, null);


            if (home1.contains(sX, sY)) {
                hasWonFour = false;
                invalidate();
                gameStart = false;
                gameStartFour = false;
                f1State = 1;
                f2State = 1;
                f3State = 1;
                f4State = 1;
                f5State = 1;
                f6State = 1;
                f7State = 1;
                f8State = 1;
                f9State = 1;
                f10State = 1;
                f11State = 1;
                f12State = 1;
                f13State = 1;
                f14State = 1;
                f15State = 1;
                f16State = 1;
                count = 0;
                jX = 0;
                jY = 0;
                sX = -10;
                sY = -10;


            }


            if (startOver.contains(sX, sY)) {
                hasWonFour = false;
                f1State = 1;
                f2State = 1;
                f3State = 1;
                f4State = 1;
                f5State = 1;
                f6State = 1;
                f7State = 1;
                f8State = 1;
                f9State = 1;
                f10State = 1;
                f11State = 1;
                f12State = 1;
                f13State = 1;
                f14State = 1;
                f15State = 1;
                f16State = 1;


                count = 0;
                jX = 0;
                jY = 0;
            }
            Paint orange = new Paint();
            orange.setARGB(255, 255, 25, 194);
            cyan.setStrokeWidth(10);
            Paint a = new Paint();
            a.setColor(Color.DKGRAY);
            a.setStyle(Paint.Style.STROKE);
            a.setStrokeWidth(10);
            setBackgroundColor(Color.DKGRAY);
            RectF playerOneText = Draw.createRectF(12, 99, 20, 101, canvas);
            Draw.drawText("Player 1 (X)", playerOneText, title, canvas);
            RectF playerTwoText = Draw.createRectF(50, 99, 58, 101, canvas);
            Draw.drawText("Player 2 (O)", playerTwoText, title, canvas);
            title.setTextSize((float) (10 * 0.01 * w));
            Draw.drawText("Four-in-a-Row", 3, 7, title2, canvas);
            RectF f1 = Draw.createRectF((float) 12.5, (float) 12.5, (float) 31.25, (float) 31.25, canvas);
            canvas.drawRect(f1, a);
            RectF f01 = Draw.createRectF((float) 14.5, (float) 14.5, (float) 29.25, (float) 29.25, canvas);
            RectF f2 = Draw.createRectF((float) 31.25, (float) 12.5, 50, (float) 31.25, canvas);
            canvas.drawRect(f2, a);
            RectF f02 = Draw.createRectF((float) 33.25, (float) 14.5, (float) 48, (float) 29.25, canvas);
            RectF f3 = Draw.createRectF(50, (float) 12.5, (float) 68.75, (float) 31.25, canvas);
            canvas.drawRect(f3, a);
            RectF f03 = Draw.createRectF(52, (float) 14.5, (float) 66.75, (float) 29.25, canvas);
            RectF f4 = Draw.createRectF((float) 68.75, (float) 12.5, (float) 87.5, (float) 31.25, canvas);
            canvas.drawRect(f4, a);
            RectF f04 = Draw.createRectF((float) 70.75, (float) 14.5, (float) 85.5, (float) 29.25, canvas);
            RectF f5 = Draw.createRectF((float) 12.5, (float) 31.25, (float) 31.25, (float) 50, canvas);
            canvas.drawRect(f5, a);
            RectF f05 = Draw.createRectF((float) 14.5, (float) 33.25, (float) 29.25, 48, canvas);
            RectF f6 = Draw.createRectF((float) 31.25, (float) 31.25, (float) 50, 50, canvas);
            canvas.drawRect(f6, a);
            RectF f06 = Draw.createRectF((float) 33.25, (float) 33.25, 48, 48, canvas);
            RectF f7 = Draw.createRectF((float) 50, (float) 31.25, (float) 68.75, 50, canvas);
            canvas.drawRect(f7, a);
            RectF f07 = Draw.createRectF(52, (float) 33.25, (float) 66.75, 48, canvas);
            RectF f8 = Draw.createRectF((float) 68.75, (float) 31.25, (float) 87.5, 50, canvas);
            canvas.drawRect(f8, a);
            RectF f08 = Draw.createRectF((float) 70.75, (float) 33.25, (float) 85.5, 48, canvas);
            RectF f9 = Draw.createRectF((float) 12.5, 50, (float) 31.25, (float) 68.75, canvas);
            canvas.drawRect(f9, a);
            RectF f09 = Draw.createRectF((float) 14.5, 52, (float) 29.25, (float) 66.75, canvas);
            RectF f10 = Draw.createRectF((float) 31.25, 50, (float) 50, (float) 68.75, canvas);
            canvas.drawRect(f10, a);
            RectF f010 = Draw.createRectF((float) 33.25, 52, (float) 48, (float) 66.75, canvas);
            RectF f11 = Draw.createRectF((float) 50, 50, (float) 68.75, (float) 68.75, canvas);
            canvas.drawRect(f11, a);
            RectF f011 = Draw.createRectF((float) 52, 52, (float) 66.75, (float) 66.75, canvas);
            RectF f12 = Draw.createRectF((float) 68.75, 50, (float) 87.5, (float) 68.75, canvas);
            canvas.drawRect(f12, a);
            RectF f012 = Draw.createRectF((float) 70.75, 52, (float) 85.5, (float) 66.75, canvas);
            RectF f13 = Draw.createRectF((float) 12.5, (float) 68.75, (float) 31.25, (float) 87.5, canvas);
            canvas.drawRect(f13, a);
            RectF f013 = Draw.createRectF((float) 14.5, (float) 70.75, (float) 29.25, (float) 85.5, canvas);
            RectF f14 = Draw.createRectF((float) 31.25, (float) 68.75, (float) 50, (float) 87.5, canvas);
            canvas.drawRect(f14, a);
            RectF f014 = Draw.createRectF((float) 33.25, (float) 70.75, (float) 48, (float) 85.5, canvas);
            RectF f15 = Draw.createRectF(50, (float) 68.75, (float) 68.75, (float) 87.5, canvas);
            canvas.drawRect(f15, a);
            RectF f015 = Draw.createRectF((float) 52, (float) 70.75, (float) 66.75, (float) 85.5, canvas);
            RectF f16 = Draw.createRectF((float) 68.75, (float) 68.75, (float) 87.5, (float) 87.5, canvas);
            canvas.drawRect(f16, a);
            RectF f016 = Draw.createRectF((float) 70.75, (float) 70.75, (float) 85.5, (float) 85.5, canvas);

            canvas.drawLine(f1.right, f1.top, f13.right, f13.bottom, cyan);
            canvas.drawLine(f2.right, f2.top, f14.right, f14.bottom, cyan);
            canvas.drawLine(f3.right, f3.top, f15.right, f15.bottom, cyan);
            canvas.drawLine(f1.left, f5.top, f4.right, f4.bottom, cyan);
            canvas.drawLine(f5.left, f9.top, f8.right, f12.top, cyan);
            canvas.drawLine(f13.left, f13.top, f16.right, f12.bottom, cyan);


            cyan.setTextSize((float) 0.05 * w);
            cyan.setStyle(Paint.Style.STROKE);
            Paint cyanFill = new Paint();
            cyanFill.setColor(Color.CYAN);
            cyanFill.setStyle(Paint.Style.STROKE);
            Paint cyanFill2 = new Paint();
            cyanFill2.setColor(Color.CYAN);
            cyanFill2.setStyle(Paint.Style.STROKE);
            orange.setStrokeWidth(10);
            orange.setStyle(Paint.Style.STROKE);
            RectF playerOneSymbol = Draw.createRectF(5, 96, 12, 101, canvas);
            RectF playerOneSymbol1 = Draw.createRectF(5, 96, 12, 101, canvas);
            canvas.drawRect(playerOneSymbol, orange);
            RectF playerTwoSymbol = Draw.createRectF(44, 96, 51, 101, canvas);
            RectF playerTwoSymbol2 = Draw.createRectF(44, 96, 51, 101, canvas);
            canvas.drawRect(playerTwoSymbol, orange);
            if (f1.contains(jX, jY) && f1State == 1) {
                if (count % 2 == 0) {
                    f1State = 0;
                } else {
                    f1State = 10;
                }
                count++;
            }
            if (f2.contains(jX, jY) && f2State == 1) {
                if (count % 2 == 0) {
                    f2State = 0;
                } else {
                    f2State = 10;
                }
                count++;
            }
            if (f3.contains(jX, jY) && f3State == 1) {
                if (count % 2 == 0) {
                    f3State = 0;
                } else {
                    f3State = 10;
                }
                count++;
            }
            if (f4.contains(jX, jY) && f4State == 1) {
                if (count % 2 == 0) {
                    f4State = 0;
                } else {
                    f4State = 10;
                }
                count++;
            }
            if (f5.contains(jX, jY) && f5State == 1) {
                if (count % 2 == 0) {
                    f5State = 0;
                } else {
                    f5State = 10;
                }
                count++;
            }
            if (f6.contains(jX, jY) && f6State == 1) {
                if (count % 2 == 0) {
                    f6State = 0;
                } else {
                    f6State = 10;
                }
                count++;
            }
            if (f7.contains(jX, jY) && f7State == 1) {
                if (count % 2 == 0) {
                    f7State = 0;
                } else {
                    f7State = 10;
                }
                count++;
            }
            if (f8.contains(jX, jY) && f8State == 1) {
                if (count % 2 == 0) {
                    f8State = 0;
                } else {
                    f8State = 10;
                }
                count++;
            }
            if (f9.contains(jX, jY) && f9State == 1) {
                if (count % 2 == 0) {
                    f9State = 0;
                } else {
                    f9State = 10;
                }
                count++;
            }
            if (f10.contains(jX, jY) && f10State == 1) {
                if (count % 2 == 0) {
                    f10State = 0;
                } else {
                    f10State = 10;
                }
                count++;
            }
            if (f11.contains(jX, jY) && f11State == 1) {
                if (count % 2 == 0) {
                    f11State = 0;
                } else {
                    f11State = 10;
                }
                count++;
            }
            if (f12.contains(jX, jY) && f12State == 1) {
                if (count % 2 == 0) {
                    f12State = 0;
                } else {
                    f12State = 10;
                }
                count++;
            }
            if (f13.contains(jX, jY) && f13State == 1) {
                if (count % 2 == 0) {
                    f13State = 0;
                } else {
                    f13State = 10;
                }
                count++;
            }
            if (f14.contains(jX, jY) && f14State == 1) {
                if (count % 2 == 0) {
                    f14State = 0;
                } else {
                    f14State = 10;
                }
                count++;
            }
            if (f15.contains(jX, jY) && f15State == 1) {
                if (count % 2 == 0) {
                    f15State = 0;
                } else {
                    f15State = 10;
                }
                count++;
            }
            if (f16.contains(jX, jY) && f16State == 1) {
                if (count % 2 == 0) {
                    f16State = 0;
                } else {
                    f16State = 10;
                }
                count++;
            }


            if (f1State == 0) {
                Draw.drawX(f01, orange, canvas);
            } else {
                if (f1State == 10) {
                    Draw.drawCircle(f01, orange, canvas);
                }
            }
            if (f2State == 0) {
                Draw.drawX(f02, orange, canvas);
            } else {
                if (f2State == 10) {
                    Draw.drawCircle(f02, orange, canvas);
                }
            }
            if (f3State == 0) {
                Draw.drawX(f03, orange, canvas);
            } else {
                if (f3State == 10) {
                    Draw.drawCircle(f03, orange, canvas);
                }
            }
            if (f4State == 0) {
                Draw.drawX(f04, orange, canvas);
            } else {
                if (f4State == 10) {
                    Draw.drawCircle(f04, orange, canvas);
                }
            }
            if (f5State == 0) {
                Draw.drawX(f05, orange, canvas);
            } else {
                if (f5State == 10) {
                    Draw.drawCircle(f05, orange, canvas);
                }
            }
            if (f6State == 0) {
                Draw.drawX(f06, orange, canvas);
            } else {
                if (f6State == 10) {
                    Draw.drawCircle(f06, orange, canvas);
                }
            }
            if (f7State == 0) {
                Draw.drawX(f07, orange, canvas);
            } else {
                if (f7State == 10) {
                    Draw.drawCircle(f07, orange, canvas);
                }
            }
            if (f8State == 0) {
                Draw.drawX(f08, orange, canvas);
            } else {
                if (f8State == 10) {
                    Draw.drawCircle(f08, orange, canvas);
                }
            }
            if (f9State == 0) {
                Draw.drawX(f09, orange, canvas);
            } else {
                if (f9State == 10) {
                    Draw.drawCircle(f09, orange, canvas);
                }
            }
            if (f10State == 0) {
                Draw.drawX(f010, orange, canvas);
            } else {
                if (f10State == 10) {
                    Draw.drawCircle(f010, orange, canvas);
                }
            }
            if (f11State == 0) {
                Draw.drawX(f011, orange, canvas);
            } else {
                if (f11State == 10) {
                    Draw.drawCircle(f011, orange, canvas);
                }
            }
            if (f12State == 0) {
                Draw.drawX(f012, orange, canvas);
            } else {
                if (f12State == 10) {
                    Draw.drawCircle(f012, orange, canvas);
                }
            }
            if (f13State == 0) {
                Draw.drawX(f013, orange, canvas);
            } else {
                if (f13State == 10) {
                    Draw.drawCircle(f013, orange, canvas);
                }
            }
            if (f14State == 0) {
                Draw.drawX(f014, orange, canvas);
            } else {
                if (f14State == 10) {
                    Draw.drawCircle(f014, orange, canvas);
                }
            }
            if (f15State == 0) {
                Draw.drawX(f015, orange, canvas);
            } else {
                if (f15State == 10) {
                    Draw.drawCircle(f015, orange, canvas);
                }
            }
            if (f16State == 0) {
                Draw.drawX(f016, orange, canvas);
            } else {
                if (f16State == 10) {
                    Draw.drawCircle(f016, orange, canvas);
                }
            }

            if (count % 2 == 0) {
                cyanFill.setStyle(Paint.Style.FILL);
            }
            if (count % 2 != 0) {
                cyanFill2.setStyle(Paint.Style.FILL);
            }
            canvas.drawRect(playerOneSymbol1, cyanFill);
            canvas.drawRect(playerTwoSymbol2, cyanFill2);
            RectF outcome = Draw.createRectF(0, 88, 105, 102, canvas);
            title.setTextSize((float) (10 * 0.01 * w));
            Paint gray = new Paint();
            gray.setStyle(Paint.Style.FILL);
            gray.setColor(Color.DKGRAY);
            if (f1State + f2State + f3State + f4State == 0) { //straight across top f
                canvas.drawLine(f1.left, 23 * f1.bottom / 32, f4.right, 23 * f1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f1State + f2State + f3State + f4State == 40) { //straight across top O
                canvas.drawLine(f1.left, 23 * f1.bottom / 32, f4.right, 23 * f1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f1State + f5State + f9State + f13State == 0) { //straight down left  f
                canvas.drawLine(17 * f1.left / 10, f1.top, 17 * f1.left / 10, f13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f1State + f5State + f9State + f13State == 40) { //straight down left O
                canvas.drawLine(17 * f1.left / 10, f1.top, 17 * f1.left / 10, f13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f5State + f6State + f7State + f8State == 0) { //straight across upper middle f
                canvas.drawLine(f1.left, 26 * f5.bottom / 32, f8.right, 26 * f8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f5State + f6State + f7State + f8State == 40) { //straight across  upper middle O
                canvas.drawLine(f1.left, 26 * f5.bottom / 32, f8.right, 26 * f8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f13State + f14State + f15State + f16State == 0) { //straight across bottom f
                canvas.drawLine(f1.left, 28 * f13.bottom / 32, f4.right, 28 * f16.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f13State + f14State + f15State + f16State == 40) { //straight across bottom O
                canvas.drawLine(f1.left, 28 * f13.bottom / 32, f4.right, 28 * f16.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f1State + f6State + f11State + f16State == 0) { //Diagonal topleft-botright across middle
                canvas.drawLine(f1.left, f1.top, f16.right, f16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f1State + f6State + f11State + f16State == 40) { //Diagonal topleft-botright across middle O
                canvas.drawLine(f1.left, f1.top, f16.right, f16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f4State + f7State + f10State + f13State == 0) { //Diagonal topright-botleft across middle f
                canvas.drawLine(f4.right, f3.top, f13.left, f13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f4State + f7State + f10State + f13State == 40) { //Diagonal topright-botleft across middle O
                canvas.drawLine(f4.right, f3.top, f13.left, f13.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f2State + f6State + f10State + f14State == 0) {  //straight down middle left f
                canvas.drawLine((float) .82 * f2.right, f2.top, (float) .82 * f14.right, f14.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f2State + f6State + f10State + f14State == 40) {  //straight down middle left 0
                canvas.drawLine((float) .82 * f2.right, f2.top, (float) .82 * f14.right, f14.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }


            if (f4State + f8State + f12State + f16State == 0) { //straight down right f
                canvas.drawLine( ((f4.left + f4.right) / 2), f4.top,  ((f16.left + f16.right) / 2), f16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f4State + f8State + f12State + f16State == 40) { //straight down right 0
                canvas.drawLine(((f4.left + f4.right) / 2), f4.top,  ((f16.left + f16.right) / 2), f16.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }

            if (f3State + f7State + f11State + f15State == 0) { //straight down middle right f
                canvas.drawLine((float) .865 * f3.right, f3.top, (float) .865 * f15.right, f15.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f3State + f7State + f11State + f15State == 40) { //straight down middle right o
                canvas.drawLine((float) .865 * f3.right, f3.top, (float) .865 * f15.right, f15.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }

            if (f9State + f10State + f12State + f11State == 0) { //straight across lower middle f
                canvas.drawLine(f1.left, ((f9.top + f9.bottom) / 2), f8.right, ((f9.top + f9.bottom) / 2), cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }
            if (f9State + f10State + f12State + f11State == 40) { //straight across lower middle 0
                canvas.drawLine(f1.left, ((f9.top + f9.bottom) / 2), f8.right, ((f9.top + f9.bottom) / 2), cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWonFour = true;
            }

            if (count == 16 && f1State + f2State + f3State + f4State != 0 && f1State + f2State + f3State + f4State != 40 && f1State + f5State + f9State + f13State != 0 &&
                    f1State + f5State + f9State + f13State != 40 && f5State + f6State + f7State + f8State != 0 && f5State + f6State + f7State + f8State != 40 &&
                    f1State + f6State + f11State + f16State != 0 && f1State + f6State + f11State + f16State != 40 && f4State + f7State + f10State + +f13State != 0 &&
                    f4State + f7State + f10State + +f13State != 40 && f2State + f6State + f10State + f14State != 40 && f2State + f6State + f10State + f14State != 0 &&
                    f4State + f8State + f12State + f16State != 40 && f4State + f8State + f12State + f16State != 0 && f13State + f14State + f15State + f16State != 40
                    && f13State + f14State + f15State + f16State != 40 && f3State + f7State + f11State + f15State != 40 && f3State + f7State + f11State + f15State != 0
                    && f9State + f10State + f11State + f12State != 40 && f9State + f10State + f11State + f12State != 0) {
                canvas.drawRect(outcome, gray);
                Draw.drawText("Draw!", 32, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
            }
        }


        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        if (gameStartTic) {

            hasWon = false;
            fourinarow.setEmpty();
            extreme.setEmpty();
            invalidate();


            title.setTextSize((float) (3 * 0.01 * w));

            RectF startOver = Draw.createRectF(66, 0, 105, 12, canvas);
            Draw.drawText("New Game", 78, 5, title, canvas);

            RectF home = Draw.createRectF(90, 88, 105, 105, canvas);
            RectF home1 = Draw.createRectF(90, 95, 100, 101, canvas);
            canvas.drawBitmap(homeIcon, null, home1, null);


            if (home.contains(sX, sY)) {
                hasWon = false;
                invalidate();
                gameStart = false;
                gameStartTic = false;
                x1State = 1;
                x2State = 1;
                x3State = 1;
                x4State = 1;
                x5State = 1;
                x6State = 1;
                x7State = 1;
                x8State = 1;
                x9State = 1;
                count = 0;
                eX = 0;
                eY = 0;
                sX = -10;
                sY = -10;


            }


            if (startOver.contains(sX, sY)) {
                hasWon = false;
                x1State = 1;
                x2State = 1;
                x3State = 1;
                x4State = 1;
                x5State = 1;
                x6State = 1;
                x7State = 1;
                x8State = 1;
                x9State = 1;
                count = 0;
                eX = 0;
                eY = 0;
            }
            Paint orange = new Paint();
            orange.setARGB(255, 255, 25, 194);
            cyan.setStrokeWidth(10);
            Paint a = new Paint();
            a.setColor(Color.DKGRAY);
            a.setStyle(Paint.Style.STROKE);
            a.setStrokeWidth(10);
            setBackgroundColor(Color.DKGRAY);
            RectF playerOneText = Draw.createRectF(12, 99, 20, 101, canvas);
            Draw.drawText("Player 1 (X)", playerOneText, title, canvas);
            RectF playerTwoText = Draw.createRectF(50, 99, 58, 101, canvas);
            Draw.drawText("Player 2 (O)", playerTwoText, title, canvas);
            title.setTextSize((float) (10 * 0.01 * w));
            Draw.drawText("Tic-Tac-Toe", 4, 10, title, canvas);
            RectF x1 = Draw.createRectF(16, 16, 38, 38, canvas);
            canvas.drawRect(x1, a);
            RectF x11 = Draw.createRectF(18, 18, 36, 36, canvas);
            RectF x2 = Draw.createRectF(38, 16, 60, 38, canvas);
            canvas.drawRect(x2, a);
            RectF x12 = Draw.createRectF(40, 18, 58, 36, canvas);
            RectF x3 = Draw.createRectF(60, 16, 82, 38, canvas);
            canvas.drawRect(x3, a);
            RectF x13 = Draw.createRectF(62, 18, 80, 36, canvas);
            RectF x4 = Draw.createRectF(16, 38, 38, 60, canvas);
            canvas.drawRect(x4, a);
            RectF x14 = Draw.createRectF(18, 40, 36, 58, canvas);
            RectF x5 = Draw.createRectF(38, 38, 60, 60, canvas);
            canvas.drawRect(x5, a);
            RectF x15 = Draw.createRectF(40, 40, 58, 58, canvas);
            RectF x6 = Draw.createRectF(60, 38, 82, 60, canvas);
            canvas.drawRect(x6, a);
            RectF x16 = Draw.createRectF(62, 40, 80, 58, canvas);
            RectF x7 = Draw.createRectF(16, 60, 38, 82, canvas);
            canvas.drawRect(x7, a);
            RectF x17 = Draw.createRectF(18, 62, 36, 80, canvas);
            RectF x8 = Draw.createRectF(38, 60, 60, 82, canvas);
            canvas.drawRect(x8, a);
            RectF x18 = Draw.createRectF(40, 62, 58, 80, canvas);
            RectF x9 = Draw.createRectF(60, 60, 82, 82, canvas);
            canvas.drawRect(x9, a);
            RectF x19 = Draw.createRectF(62, 62, 80, 80, canvas);
            canvas.drawLine(x1.right, x1.top, x7.right, x7.bottom, cyan);
            canvas.drawLine(x2.right, x2.top, x8.right, x8.bottom, cyan);
            canvas.drawLine(x1.left, x4.top, x3.right, x3.bottom, cyan);
            canvas.drawLine(x7.left, x7.top, x9.right, x9.top, cyan);
            cyan.setTextSize((float) 0.05 * w);
            cyan.setStyle(Paint.Style.STROKE);
            Paint cyanFill = new Paint();
            cyanFill.setColor(Color.CYAN);
            cyanFill.setStyle(Paint.Style.STROKE);
            Paint cyanFill2 = new Paint();
            cyanFill2.setColor(Color.CYAN);
            cyanFill2.setStyle(Paint.Style.STROKE);
            orange.setStrokeWidth(10);
            orange.setStyle(Paint.Style.STROKE);
            RectF playerOneSymbol = Draw.createRectF(5, 96, 12, 101, canvas);
            RectF playerOneSymbol1 = Draw.createRectF(5, 96, 12, 101, canvas);
            canvas.drawRect(playerOneSymbol, orange);
            RectF playerTwoSymbol = Draw.createRectF(44, 96, 51, 101, canvas);
            RectF playerTwoSymbol2 = Draw.createRectF(44, 96, 51, 101, canvas);
            canvas.drawRect(playerTwoSymbol, orange);
            if (x1.contains(eX, eY) && x1State == 1) {
                if (count % 2 == 0) {
                    x1State = 0;
                } else {
                    x1State = 10;
                }
                count++;
            }
            if (x2.contains(eX, eY) && x2State == 1) {
                if (count % 2 == 0) {
                    x2State = 0;
                } else {
                    x2State = 10;
                }
                count++;
            }
            if (x3.contains(eX, eY) && x3State == 1) {
                if (count % 2 == 0) {
                    x3State = 0;
                } else {
                    x3State = 10;
                }
                count++;
            }
            if (x4.contains(eX, eY) && x4State == 1) {
                if (count % 2 == 0) {
                    x4State = 0;
                } else {
                    x4State = 10;
                }
                count++;
            }
            if (x5.contains(eX, eY) && x5State == 1) {
                if (count % 2 == 0) {
                    x5State = 0;
                } else {
                    x5State = 10;
                }
                count++;
            }
            if (x6.contains(eX, eY) && x6State == 1) {
                if (count % 2 == 0) {
                    x6State = 0;
                } else {
                    x6State = 10;
                }
                count++;
            }
            if (x7.contains(eX, eY) && x7State == 1) {
                if (count % 2 == 0) {
                    x7State = 0;
                } else {
                    x7State = 10;
                }
                count++;
            }
            if (x8.contains(eX, eY) && x8State == 1) {
                if (count % 2 == 0) {
                    x8State = 0;
                } else {
                    x8State = 10;
                }
                count++;
            }
            if (x9.contains(eX, eY) && x9State == 1) {
                if (count % 2 == 0) {
                    x9State = 0;
                } else {
                    x9State = 10;
                }
                count++;
            }
            if (x1State == 0) {
                Draw.drawX(x11, orange, canvas);
            } else {
                if (x1State == 10) {
                    Draw.drawCircle(x11, orange, canvas);
                }
            }
            if (x2State == 0) {
                Draw.drawX(x12, orange, canvas);
            } else {
                if (x2State == 10) {
                    Draw.drawCircle(x12, orange, canvas);
                }
            }
            if (x3State == 0) {
                Draw.drawX(x13, orange, canvas);
            } else {
                if (x3State == 10) {
                    Draw.drawCircle(x13, orange, canvas);
                }
            }
            if (x4State == 0) {
                Draw.drawX(x14, orange, canvas);
            } else {
                if (x4State == 10) {
                    Draw.drawCircle(x14, orange, canvas);
                }
            }
            if (x5State == 0) {
                Draw.drawX(x15, orange, canvas);
            } else {
                if (x5State == 10) {
                    Draw.drawCircle(x15, orange, canvas);
                }
            }
            if (x6State == 0) {
                Draw.drawX(x16, orange, canvas);
            } else {
                if (x6State == 10) {
                    Draw.drawCircle(x16, orange, canvas);
                }
            }
            if (x7State == 0) {
                Draw.drawX(x17, orange, canvas);
            } else {
                if (x7State == 10) {
                    Draw.drawCircle(x17, orange, canvas);
                }
            }
            if (x8State == 0) {
                Draw.drawX(x18, orange, canvas);
            } else {
                if (x8State == 10) {
                    Draw.drawCircle(x18, orange, canvas);
                }
            }
            if (x9State == 0) {
                Draw.drawX(x19, orange, canvas);
            } else {
                if (x9State == 10) {
                    Draw.drawCircle(x19, orange, canvas);
                }
            }
            if (count % 2 == 0) {
                cyanFill.setStyle(Paint.Style.FILL);
            }
            if (count % 2 != 0) {
                cyanFill2.setStyle(Paint.Style.FILL);
            }
            canvas.drawRect(playerOneSymbol1, cyanFill);
            canvas.drawRect(playerTwoSymbol2, cyanFill2);
            RectF outcome = Draw.createRectF(0, 82, 105, 102, canvas);
            title.setTextSize((float) (10 * 0.01 * w));
            Paint gray = new Paint();
            gray.setStyle(Paint.Style.FILL);
            gray.setColor(Color.DKGRAY);
            if (x1State + x2State + x3State == 0) { //straight across top x
                canvas.drawLine(x1.left, 23 * x1.bottom / 32, x3.right, 23 * x1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x1State + x2State + x3State == 30) { //straight across top O
                canvas.drawLine(x1.left, 23 * x1.bottom / 32, x3.right, 23 * x1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x1State + x4State + x7State == 0) { //straight down left top X
                canvas.drawLine(17 * x1.left / 10, x1.top, 17 * x1.left / 10, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x1State + x4State + x7State == 30) { //straight down left top O
                canvas.drawLine(17 * x1.left / 10, x1.top, 17 * x1.left / 10, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x4State + x5State + x6State == 0) { //straight across middle x
                canvas.drawLine(x1.left, 26 * x4.bottom / 32, x3.right, 26 * x4.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x4State + x5State + x6State == 30) { //straight across middle O
                canvas.drawLine(x1.left, 26 * x4.bottom / 32, x3.right, 26 * x4.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x7State + x8State + x9State == 0) { //straight across bottom X
                canvas.drawLine(x1.left, 28 * x8.bottom / 32, x3.right, 28 * x8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x7State + x8State + x9State == 30) { //straight across middle O
                canvas.drawLine(x1.left, 28 * x8.bottom / 32, x3.right, 28 * x8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x1State + x5State + x9State == 0) { //Diagonal topleft-botright across middle X
                canvas.drawLine(x1.left, x1.top, x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x1State + x5State + x9State == 30) { //Diagonal topleft-botright across middle O
                canvas.drawLine(x1.left, x1.top, x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x3State + x5State + x7State == 0) { //Diagonal topright-botleft across middle X
                canvas.drawLine(x3.right, x3.top, x7.left, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x3State + x5State + x7State == 30) { //Diagonal topright-botleft across middle O
                canvas.drawLine(x3.right, x1.top, x7.left, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x2State + x5State + x8State == 30) {  //straight down middle X
                canvas.drawLine((float) .82 * x2.right, x2.top, (float) .82 * x8.right, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x2State + x5State + x8State == 0) {  //straight down middle 0
                canvas.drawLine((float) .82 * x2.right, x2.top, (float) .82 * x8.right, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x3State + x6State + x9State == 30) { //straight down right x
                canvas.drawLine((float) .865 * x3.right, x3.top, (float) .865 * x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 2 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (x3State + x6State + x9State == 0) { //straight down right 0
                canvas.drawLine((float) .865 * x3.right, x3.top, (float) .865 * x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Player 1 Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon = true;
            }
            if (count == 9 && x1State + x2State + x3State != 0 && x1State + x2State + x3State != 30 && x1State + x4State + x7State != 0 &&
                    x1State + x4State + x7State != 30 && x4State + x5State + x6State != 0 && x4State + x5State + x6State != 30 &&
                    x1State + x5State + x9State != 0 && x1State + x5State + x9State != 30 && x3State + x5State + x7State != 0 &&
                    x3State + x5State + x7State != 30 && x2State + x5State + x8State != 30 && x2State + x5State + x8State != 0 && x3State + x6State + x9State != 30 &&
                    x3State + x6State + x9State != 0 && x7State + x8State + x9State != 30 && x7State + x8State + x9State != 0) {
                canvas.drawRect(outcome, gray);
                Draw.drawText("Draw!", 32, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
            }
        }

        if(gameStartAI) {
            hasWonExtreme = false;
            hasWonFour = false;
            hasWon = false;
            tictactoe.setEmpty();
            fourinarow.setEmpty();
            invalidate();

            cyan.setColor(Color.CYAN);
            int w = (getWidth());


            title.setTypeface(font1);
            title.setColor(Color.CYAN);
            title.setTextSize(25);
            RectF startOver = Draw.createRectF(66, 4, 96, 12, canvas);
            Draw.drawText("New Game", startOver, title, canvas);
            if (startOver.contains(sX1, sY1)) {
                hasWon1 = false;
                x1State1 = 1;
                x2State1 = 1;
                x3State1 = 1;
                x4State1 = 1;
                x5State1 = 1;
                x6State1 = 1;
                x7State1 = 1;
                x8State11 = 1;
                x9State1 = 1;
                count1 = 0;
                eX1 = 0;
                eY1 = 0;
            }
            RectF home1 = Draw.createRectF(90, 95, 100, 101, canvas);
            canvas.drawBitmap(homeIcon, null, home1, null);

            if (home1.contains(sX, sY)) {
                hasWon1 = false;
                invalidate();
                gameStart = false;
                gameStartAI = false;

                x1State1 = 1;
                x2State1 = 1;
                x3State1 = 1;
                x4State1 = 1;
                x5State1 = 1;
                x6State1 = 1;
                x7State1 = 1;
                x8State11 = 1;
                x9State1 = 1;
                count1 = 0;
                eX1 = 0;
                eY1 = 0;
                eX1 = 0;
                eY1 = 0;
                sX1 = -10;
                sY1 = -10;


            }
            Paint orange = new Paint();
            orange.setARGB(255, 255, 25, 194);
            cyan.setStrokeWidth(10);
            Paint a = new Paint();
            a.setColor(Color.DKGRAY);
            a.setStyle(Paint.Style.STROKE);
            a.setStrokeWidth(10);
            setBackgroundColor(Color.DKGRAY);
            title.setTextSize(25);
            RectF playerOneText = Draw.createRectF(12, 99, 20, 101, canvas);
            Draw.drawText("Player 1 (X)", playerOneText, title, canvas);
            RectF playerTwoText = Draw.createRectF(50, 99, 58, 101, canvas);
            Draw.drawText("Computer (O)", playerTwoText, title, canvas);
            title.setTextSize(65);
            Draw.drawText("Tic-Tac-Toe Single Player", 3, 9, title1, canvas);
            RectF x1 = Draw.createRectF(16, 16, 38, 38, canvas);
            canvas.drawRect(x1, a);
            RectF x11 = Draw.createRectF(18, 18, 36, 36, canvas);
            RectF x2 = Draw.createRectF(38, 16, 60, 38, canvas);
            canvas.drawRect(x2, a);
            RectF x12 = Draw.createRectF(40, 18, 58, 36, canvas);
            RectF x3 = Draw.createRectF(60, 16, 82, 38, canvas);
            canvas.drawRect(x3, a);
            RectF x13 = Draw.createRectF(62, 18, 80, 36, canvas);
            RectF x4 = Draw.createRectF(16, 38, 38, 60, canvas);
            canvas.drawRect(x4, a);
            RectF x14 = Draw.createRectF(18, 40, 36, 58, canvas);
            RectF x5 = Draw.createRectF(38, 38, 60, 60, canvas);
            canvas.drawRect(x5, a);
            RectF x15 = Draw.createRectF(40, 40, 58, 58, canvas);
            RectF x6 = Draw.createRectF(60, 38, 82, 60, canvas);
            canvas.drawRect(x6, a);
            RectF x16 = Draw.createRectF(62, 40, 80, 58, canvas);
            RectF x7 = Draw.createRectF(16, 60, 38, 82, canvas);
            canvas.drawRect(x7, a);
            RectF x17 = Draw.createRectF(18, 62, 36, 80, canvas);
            RectF x8 = Draw.createRectF(38, 60, 60, 82, canvas);
            canvas.drawRect(x8, a);
            RectF x18 = Draw.createRectF(40, 62, 58, 80, canvas);
            RectF x9 = Draw.createRectF(60, 60, 82, 82, canvas);
            canvas.drawRect(x9, a);
            RectF x19 = Draw.createRectF(62, 62, 80, 80, canvas);
            canvas.drawLine(x1.right, x1.top, x7.right, x7.bottom, cyan);
            canvas.drawLine(x2.right, x2.top, x8.right, x8.bottom, cyan);
            canvas.drawLine(x1.left, x4.top, x3.right, x3.bottom, cyan);
            canvas.drawLine(x7.left, x7.top, x9.right, x9.top, cyan);
            cyan.setTextSize((float) 0.05 * w);
            cyan.setStyle(Paint.Style.STROKE);
            Paint cyanFill = new Paint();
            cyanFill.setColor(Color.CYAN);
            cyanFill.setStyle(Paint.Style.STROKE);
            Paint cyanFill2 = new Paint();
            cyanFill2.setColor(Color.CYAN);
            cyanFill2.setStyle(Paint.Style.STROKE);
            orange.setStrokeWidth(10);
            orange.setStyle(Paint.Style.STROKE);
            RectF playerOnesY1mbol = Draw.createRectF(5, 96, 12, 101, canvas);
            RectF playerOnesY1mbol1 = Draw.createRectF(5, 96, 12, 101, canvas);
            canvas.drawRect(playerOnesY1mbol, orange);
            RectF playerTwosY1mbol = Draw.createRectF(44, 96, 51, 101, canvas);
            RectF playerTwosY1mbol2 = Draw.createRectF(44, 96, 51, 101, canvas);
            canvas.drawRect(playerTwosY1mbol, orange);

            if (x1.contains(eX1, eY1) && x1State1 == 1) {
                if (count1 % 2 == 0) {
                    SoundPlayer.playSound(getContext(), 1);
                    x1State1 = 0;
                } else {
                    x1State1 = 10;
                }
                count1++;
            }
            if (x2.contains(eX1, eY1) && x2State1 == 1) {
                if (count1 % 2 == 0) {
                    x2State1 = 0;
                } else {
                    x2State1 = 10;
                }
                count1++;
            }
            if (x3.contains(eX1, eY1) && x3State1 == 1) {
                if (count1 % 2 == 0) {
                    x3State1 = 0;
                } else {
                    x3State1 = 10;
                }
                count1++;
            }
            if (x4.contains(eX1, eY1) && x4State1 == 1) {
                if (count1 % 2 == 0) {
                    x4State1 = 0;
                } else {
                    x4State1 = 10;
                }
                count1++;
            }
            if (x5.contains(eX1, eY1) && x5State1 == 1) {
                if (count1 % 2 == 0) {
                    x5State1 = 0;
                } else {
                    x5State1 = 10;
                }
                count1++;
            }
            if (x6.contains(eX1, eY1) && x6State1 == 1) {
                if (count1 % 2 == 0) {
                    x6State1 = 0;
                } else {
                    x6State1 = 10;
                }
                count1++;
            }
            if (x7.contains(eX1, eY1) && x7State1 == 1) {
                if (count1 % 2 == 0) {
                    x7State1 = 0;
                } else {
                    x7State1 = 10;
                }
                count1++;
            }
            if (x8.contains(eX1, eY1) && x8State11 == 1) {
                if (count1 % 2 == 0) {
                    x8State11 = 0;
                } else {
                    x8State11 = 10;
                }
                count1++;
            }
            if (x9.contains(eX1, eY1) && x9State1 == 1) {
                if (count1 % 2 == 0) {
                    x9State1 = 0;
                } else {
                    x9State1 = 10;
                }
                count1++;
            }
            if (x1State1 == 0) {
                Draw.drawX(x11, orange, canvas);
            } else {
                if (x1State1 == 10) {
                    Draw.drawCircle(x11, orange, canvas);
                }
            }
            if (x2State1 == 0) {
                Draw.drawX(x12, orange, canvas);
            } else {
                if (x2State1 == 10) {
                    Draw.drawCircle(x12, orange, canvas);
                }
            }
            if (x3State1 == 0) {
                Draw.drawX(x13, orange, canvas);
            } else {
                if (x3State1 == 10) {
                    Draw.drawCircle(x13, orange, canvas);
                }
            }
            if (x4State1 == 0) {
                Draw.drawX(x14, orange, canvas);
            } else {
                if (x4State1 == 10) {
                    Draw.drawCircle(x14, orange, canvas);
                }
            }
            if (x5State1 == 0) {
                Draw.drawX(x15, orange, canvas);
            } else {
                if (x5State1 == 10) {
                    Draw.drawCircle(x15, orange, canvas);
                }
            }
            if (x6State1 == 0) {
                Draw.drawX(x16, orange, canvas);
            } else {
                if (x6State1 == 10) {
                    Draw.drawCircle(x16, orange, canvas);
                }
            }
            if (x7State1 == 0) {
                Draw.drawX(x17, orange, canvas);
            } else {
                if (x7State1 == 10) {
                    Draw.drawCircle(x17, orange, canvas);
                }
            }
            if (x8State11 == 0) {
                Draw.drawX(x18, orange, canvas);
            } else {
                if (x8State11 == 10) {
                    Draw.drawCircle(x18, orange, canvas);
                }
            }
            if (x9State1 == 0) {
                Draw.drawX(x19, orange, canvas);
            } else {
                if (x9State1 == 10) {
                    Draw.drawCircle(x19, orange, canvas);
                }
            }
            if (count1 % 2 == 0) {
                cyanFill.setStyle(Paint.Style.FILL);
            }
            if (count1 % 2 != 0) {
                cyanFill2.setStyle(Paint.Style.FILL);
            }

            canvas.drawRect(playerOnesY1mbol1, cyanFill);
            canvas.drawRect(playerTwosY1mbol2, cyanFill2);
            RectF outcome = Draw.createRectF(0, 82, 105, 102, canvas);
            title.setTextSize(70);
            Paint gray = new Paint();
            gray.setStyle(Paint.Style.FILL);
            gray.setColor(Color.DKGRAY);
            if (x1State1 + x2State1 + x3State1 == 0) { //straight across top x
                canvas.drawLine(x1.left, 23 * x1.bottom / 32, x3.right, 23 * x1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                hasWon1 = true;
                canvas.drawBitmap(homeIcon, null, home1, null);
            }
            if (x1State1 + x2State1 + x3State1 == 30) { //straight across top O
                canvas.drawLine(x1.left, 23 * x1.bottom / 32, x3.right, 23 * x1.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x1State1 + x4State1 + x7State1 == 0) { //straight down left top X
                canvas.drawLine(17 * x1.left / 10, x1.top, 17 * x1.left / 10, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x1State1 + x4State1 + x7State1 == 30) { //straight down left top O
                canvas.drawLine(17 * x1.left / 10, x1.top, 17 * x1.left / 10, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x4State1 + x5State1 + x6State1 == 0) { //straight across middle x
                canvas.drawLine(x1.left, 26 * x4.bottom / 32, x3.right, 26 * x4.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x4State1 + x5State1 + x6State1 == 30) { //straight across middle O
                canvas.drawLine(x1.left, 26 * x4.bottom / 32, x3.right, 26 * x4.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x7State1 + x8State11 + x9State1 == 0) { //straight across bottom X
                canvas.drawLine(x1.left, 28 * x8.bottom / 32, x3.right, 28 * x8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                canvas.drawBitmap(homeIcon, null, home1, null);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                hasWon1 = true;
            }
            if (x7State1 + x8State11 + x9State1 == 30) { //straight across middle O
                canvas.drawLine(x1.left, 28 * x8.bottom / 32, x3.right, 28 * x8.bottom / 32, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x1State1 + x5State1 + x9State1 == 0) { //Diagonal topleft-botright across middle X
                canvas.drawLine(x1.left, x1.top, x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x1State1 + x5State1 + x9State1 == 30) { //Diagonal topleft-botright across middle O
                canvas.drawLine(x1.left, x1.top, x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x3State1 + x5State1 + x7State1 == 0) { //Diagonal topright-botleft across middle X
                canvas.drawLine(x3.right, x3.top, x7.left, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x3State1 + x5State1 + x7State1 == 30) { //Diagonal topright-botleft across middle O
                canvas.drawLine(x3.right, x1.top, x7.left, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x2State1 + x5State1 + x8State11 == 30) {  //straight down middle X
                canvas.drawLine((float) .82 * x2.right, x2.top, (float) .82 * x8.right, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x2State1 + x5State1 + x8State11 == 0) {  //straight down middle 0
                canvas.drawLine((float) .82 * x2.right, x2.top, (float) .82 * x8.right, x8.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x3State1 + x6State1 + x9State1 == 30) { //straight down right x
                canvas.drawLine((float) .865 * x3.right, x3.top, (float) .865 * x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                Draw.drawText("Computer Wins!", 10, 92, title, canvas);
                canvas.drawBitmap(homeIcon, null, home1, null);
                hasWon1 = true;
            }
            if (x3State1 + x6State1 + x9State1 == 0) { //straight down right 0
                canvas.drawLine((float) .865 * x3.right, x3.top, (float) .865 * x9.right, x9.bottom, cyan);
                canvas.drawRect(outcome, gray);
                canvas.drawBitmap(homeIcon, null, home1, null);
                Draw.drawText("You Win!", 28, 92, title, canvas);
                hasWon1 = true;
            }
            if (count1 == 9 && x1State1 + x2State1 + x3State1 != 0 && x1State1 + x2State1 + x3State1 != 30 && x1State1 + x4State1 + x7State1 != 0 &&
                    x1State1 + x4State1 + x7State1 != 30 && x4State1 + x5State1 + x6State1 != 0 && x4State1 + x5State1 + x6State1 != 30 &&
                    x1State1 + x5State1 + x9State1 != 0 && x1State1 + x5State1 + x9State1 != 30 && x3State1 + x5State1 + x7State1 != 0 &&
                    x3State1 + x5State1 + x7State1 != 30 && x2State1 + x5State1 + x8State11 != 30 && x2State1 + x5State1 + x8State11 != 0 && x3State1 + x6State1 + x9State1 != 30 &&
                    x3State1 + x6State1 + x9State1 != 0 && x7State1 + x8State11 + x9State1 != 30 && x7State1 + x8State11 + x9State1 != 0) {
                canvas.drawRect(outcome, gray);
                canvas.drawBitmap(homeIcon, null, home1, null);
                Draw.drawText("Draw!", 32, 92, title, canvas);
            }

            if (!hasWon1) {
                if (count1 == 1) {
                    if (center >= 1)
                        takeCenter();
                    else
                        takeCorner();
                }
                if (count1 == 3) {
                    if (block >= 1)
                        block();
                    else
                        takeCorner();
                }
                if (count1 == 5) {
                    if (win >= 1)
                        win();
                    else if (block >= 1)
                        block();
                    else if (corners >= 1) {
                        takeCorner();
                    } else
                        takeOther();
                }
                if (count1 == 7) {
                    if (win >= 1)
                        win();
                    else if (win >= 1)
                        block();
                    else if (corners >= 1) {
                        takeCorner();
                    } else
                        takeOther();
                }

                if (x1State1 == 10) {
                    Draw.drawCircle(x11, orange, canvas);
                }
                if (x2State1 == 10) {
                    Draw.drawCircle(x12, orange, canvas);
                }
                if (x3State1 == 10) {
                    Draw.drawCircle(x13, orange, canvas);
                }
                if (x4State1 == 10) {
                    Draw.drawCircle(x14, orange, canvas);
                }
                if (x5State1 == 10) {
                    Draw.drawCircle(x15, orange, canvas);
                }
                if (x6State1 == 10) {
                    Draw.drawCircle(x16, orange, canvas);
                }
                if (x7State1 == 10) {
                    Draw.drawCircle(x17, orange, canvas);
                }
                if (x8State11 == 10) {
                    Draw.drawCircle(x18, orange, canvas);
                }
                if (x9State1 == 10) {
                    Draw.drawCircle(x19, orange, canvas);
                }


            }

        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        sX = (int) event.getX();
        sY = (int) event.getY();

        if (!hasWon) {
            eX = (int) event.getX();
            eY = (int) event.getY();

        }
        if (!hasWonFour) {
            jX = (int) event.getX();
            jY = (int) event.getY();

        }

        if (!hasWonExtreme) {
            mX = (int) event.getX();
            mY = (int) event.getY();

        }
        if (action == MotionEvent.ACTION_DOWN) {

            cX = (int) event.getX();
            cY = (int) event.getY();
            invalidate();
        }
        if (action == MotionEvent.ACTION_UP) {
            look=true;
            invalidate();
            cX=-1;cY=-1;
        }
        if(gameStartAI) {
            sX1 = (int) event.getX();
            sY1 = (int) event.getY();
        }
        if (!hasWon1 && gameStartAI) {
            eX1 = (int) event.getX();
            eY1 = (int) event.getY();
        }
        return true;
    }
}