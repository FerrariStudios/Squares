package com.example.SquaresFerrariLealLuu;

/**
 * Created by 1388965 on 2/12/2016.
 */

public class AI {
    public int eX = 0;
    public int eY = 0;
    public int eXX = 0;
    public int sX = 0;
    public int sY = 0;
    public static int count = 0;
    public static int center = 0;
    public static int corners = 0;
    public static int other = 0;
    public static int block = 0;
    public static int win = 0;
    public boolean loaded = false;
    private static int x1State = 1;
    private static int x2State = 1;
    private static int x3State = 1;
    private static int x4State = 1;
    private static int x5State = 1;
    private static int x6State = 1;
    private static int x7State = 1;
    private static int x8State = 1;
    private static int x9State = 1;

    public static void win() {

        if (x1State + x2State + x3State == 21) { //horizontal top check
            if (x1State == 1) {
                x1State = 10;
                count++;
            } else {
                if (x2State == 1) {
                    x2State = 10;
                    count++;
                } else {
                    if (x3State == 1) {
                        x3State = 10;
                        count++;
                    }
                }
            }
        } else if (x4State + x5State + x6State == 21) { //horizontal mid check
            if (x4State == 1) {
                x4State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else if (x6State == 1) {
                    x6State = 10;
                    count++;
                }
            }
        } else if (x7State + x8State + x9State == 21) { //horizontal bot check
            if (x7State == 1) {
                x7State = 10;
                count++;
            } else {
                if (x8State == 1) {
                    x8State = 10;
                    count++;
                } else if (x9State == 1) {
                    x9State = 10;
                    count++;
                }
            }
        } else if (x1State + x4State + x7State == 21) { //vertical left check
            if (x1State == 1) {
                x1State = 10;
                count++;
            } else {
                if (x4State == 1) {
                    x4State = 10;
                    count++;
                } else if (x7State == 1) {
                    x7State = 10;
                    count++;
                }
            }
        } else if (x2State + x5State + x8State == 21) { //vertical mid check
            if (x2State == 1) {
                x2State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else if (x8State == 1) {
                    x8State = 10;
                    count++;
                }
            }
        } else if (x3State + x6State + x9State == 21) { //vertical right check
            if (x3State == 1) {
                x3State = 10;
                count++;
            } else {
                if (x6State == 1) {
                    x6State = 10;
                    count++;
                } else {
                    if (x9State == 1) {
                        x9State = 10;
                        count++;
                    }
                }
            }
        } else if (x1State + x5State + x9State == 21) { //diag. topL to botR check
            if (x1State == 1) {
                x1State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else {
                    if (x9State == 1) {
                        x9State = 10;
                        count++;
                    }
                }
            }
        } else if (x3State + x5State + x8State == 21) { //diag. topR to botL check
            if (x3State == 1) {
                x3State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else {
                    if (x8State == 1) {
                        x8State = 10;
                        count++;
                    }
                }
            }
        }
    }


    public static void block() {
        if (x1State + x2State + x3State == 1) { //horizontal top check
            if (x1State == 1) {
                x1State = 10;
                count++;
            } else {
                if (x2State == 1) {
                    x2State = 10;
                    count++;
                } else {
                    if (x3State == 1) {
                        x3State = 10;
                        count++;
                    }
                }
            }
        } else if (x4State + x5State + x6State == 1) { //horizontal mid check
            if (x4State == 1) {
                x4State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else if (x6State == 1) {
                    x6State = 10;
                    count++;
                }
            }
        } else if (x7State + x8State + x9State == 1) { //horizontal bot check
            if (x7State == 1) {
                x7State = 10;
                count++;
            } else {
                if (x8State == 1) {
                    x8State = 10;
                    count++;
                } else if (x9State == 1) {
                    x9State = 10;
                    count++;

                }
            }
        } else if (x1State + x4State + x7State == 1) { //vertical left check
            if (x1State == 1) {
                x1State = 10;
                count++;
            } else {
                if (x4State == 1) {
                    x4State = 10;
                    count++;
                } else if (x7State == 1) {
                    x7State = 10;
                    count++;
                }
            }
        } else if (x2State + x5State + x8State == 1) { //vertical mid check
            if (x2State == 1) {
                x2State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else if (x8State == 1) {
                    x8State = 10;
                    count++;
                }
            }
        } else if (x3State + x6State + x9State == 1) { //vertical right check
            if (x3State == 1) {
                x3State = 10;
                count++;
            } else {
                if (x6State == 1) {
                    x6State = 10;
                    count++;
                } else {
                    if (x9State == 1) {
                        x9State = 10;
                        count++;
                    }
                }
            }
        } else if (x1State + x5State + x9State == 1) { //diag. topL to botR check
            if (x1State == 1) {
                x1State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else {
                    if (x9State == 1) {
                        x9State = 10;
                        count++;
                    }
                }
            }
        } else if (x3State + x5State + x8State == 1) { //diag. topR to botL check
            if (x3State == 1) {
                x3State = 10;
                count++;
            } else {
                if (x5State == 1) {
                    x5State = 10;
                    count++;
                } else {
                    if (x8State == 1) {
                        x8State = 10;
                        count++;
                    }
                }
            }
        }
    }

    public static void checkBlock(){
        if (x1State + x2State + x3State == 1)
        block++;
        if (x4State + x5State + x6State == 1)
            block++;
        if (x7State + x8State + x9State == 1)
            block++;
        if (x1State + x4State + x7State == 1)
            block++;
        if (x2State + x5State + x8State == 1)
            block++;
        if (x3State + x6State + x9State == 1)
            block++;
        if (x1State + x5State + x9State == 1)
            block++;
        if (x7State + x5State + x3State == 1)
            block++;
    }

    public static void checkWin(){
        if (x1State + x2State + x3State == 21)
            win++;
        if (x4State + x5State + x6State == 21)
            win++;
        if (x7State + x8State + x9State == 21)
            win++;
        if (x1State + x4State + x7State == 21)
            win++;
        if (x2State + x5State + x8State == 21)
            win++;
        if (x3State + x6State + x9State == 21)
            win++;
        if (x1State + x5State + x9State == 21)
            win++;
        if (x7State + x5State + x3State == 21)
            win++;
    }

    public static void checkCenter(){
        if (x5State == 1)
            center++;
    }

    public static void checkCorners(){
        if (x1State == 1)
            corners++;
        if (x3State == 1)
            corners++;
        if (x7State == 1)
            corners++;
        if (x9State == 1)
            corners++;
    }

    public static void checkOthers(){
        if (x2State == 1)
            other++;
        if (x4State == 1)
            other++;
        if (x6State == 1)
            other++;
        if (x8State == 1)
            other++;
    }

    public static void takeCenter() {
        x5State = 10;
        count++;
    }

    public static void takeCorner() {
        if (x1State == 1) {
            x1State = 10;
        } else if (x3State == 1) {
            x3State = 10;
        } else if (x7State == 1) {
            x7State = 10;
        } else if (x9State == 1) {
            x9State = 10;
        }
        count++;
    }

    public static void takeOther() {
        if (x2State == 1) {
            x2State = 10;
        } else if (x4State == 1) {
            x4State = 10;
        } else if (x6State == 1) {
            x6State = 10;
        } else if (x8State == 1) {
            x8State = 10;
        }
        count++;
    }



    public static void gameOn(int count)
    {
        if (count == 2) {
            if (center >= 1)
                takeCenter();
            else
                takeCorner();
        }
        if (count == 4) {
            if(block>= 1)
            block();
            else
            takeCorner();
        }
        if (count == 6) {
            if (win >= 1)
            win();
            else if(block>= 1)
                block();
            else if (corners >= 1) {
                takeCorner();
            }
            else
                takeOther();
        }
        if (count == 8) {
            if (win >= 1)
            win();
            else if (win>= 1)
            block();
            else if (corners >= 1){
                takeCorner();
            }
            else
                takeOther();
        }
    }

}

