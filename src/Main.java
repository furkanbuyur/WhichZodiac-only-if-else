import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int month, day;
        String zodiac = "";
        boolean isError = false;

        System.out.print("Month of bird : ");
        month = inp.nextInt();
        System.out.print("Day of bird : ");
        day = inp.nextInt();

        if (month == 1) {
            if (day > 0 && day < 32) {
                if (day < 22) {
                    zodiac = "Capricornus";
                } else {
                    zodiac = "Aquarius";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day > 0 && day < 32) {
                if (day < 20) {
                    zodiac = "Aquarius";
                } else {
                    zodiac = "Pisces";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day > 0 && day < 32) {
                if (day < 21) {
                    zodiac = "Pisces";
                } else {
                    zodiac = "Aries";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day > 0 && day < 32) {
                if (day < 21) {
                    zodiac = "Aries";
                } else {
                    zodiac = "Taurus";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day > 0 && day < 32) {
                if (day < 22) {
                    zodiac = "Taurus";
                } else {
                    zodiac = "Gemini";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zodiac = "Gemini";
                } else {
                    zodiac = "Cancer";
                }
            } else {
                isError = true;
            }
        }else if (month == 7) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zodiac = "Cancer";
                } else {
                    zodiac = "Leo";
                }
            } else {
                isError = true;
            }
        }else if (month == 8) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zodiac = "Leo";
                } else {
                    zodiac = "Virgo";
                }
            } else {
                isError = true;
            }
        }else if (month == 9) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zodiac = "Virgo";
                } else {
                    zodiac = "Libra";
                }
            } else {
                isError = true;
            }
        }else if (month == 10) {
            if (day > 0 && day < 32) {
                if (day < 23) {
                    zodiac = "Libra";
                } else {
                    zodiac = "Scorpius";
                }
            } else {
                isError = true;
            }
        }else if (month == 11) {
            if (day > 0 && day < 32) {
                if (day < 22) {
                    zodiac = "Scorpius";
                } else {
                    zodiac = "Sagittarius";
                }
            } else {
                isError = true;
            }
        }else if (month == 12) {
            if (day > 0 && day < 32) {
                if (day < 22) {
                    zodiac = "Sagittarius";
                } else {
                    zodiac = "Capricornus";
                }
            } else {
                isError = true;
            }
        }else {
            isError = true;
        }
        if (!isError){
            System.out.println("Your zodiac is " + zodiac);
        }else {
            System.out.println("Invalid month or day entered...");
        }
    }
}