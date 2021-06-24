package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File(args[0]).getAbsoluteFile();

        String[] table = new String[1000];
        int counter = 0;
        int counterChar = 0;

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNext()) {
                table[counter] = scan.nextLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + args[0]);
        }


        try {
            for (int i = 0; i < counter; i++) {
                if (table[i + 1].equals("null")) {
                    table[0] = table[0];
                } else {
                    table[0] = table[0] + table[i + 1];
                }

            }
        } catch (NullPointerException e) {

        }

        System.out.println("This is the text:");
        System.out.println(table[0]);
        System.out.println("");


        String[] wordsTable = table[0].split(" ");
        double words = wordsTable.length;
        double counterPolysyllables = 0;
        double temp = 0;
        String[] tempTable;
        double counterSyllables = 0;


        for (String wordsPost : wordsTable) {

            tempTable = wordsPost.split("");

            for (int l = 0; l < tempTable.length; l++) {

                if (tempTable[l].equals("a") || tempTable[l].equals("A")) {
                    temp++;

                } else if (tempTable[l].equals("e") || tempTable[l].equals("E")) {
                    temp++;

                } else if (tempTable[l].equals("i") || tempTable[l].equals("I")) {
                    temp++;

                } else if (tempTable[l].equals("o") || tempTable[l].equals("O")) {
                    temp++;

                } else if (tempTable[l].equals("u") || tempTable[l].equals("U")) {
                    temp++;

                } else if (tempTable[l].equals("y") || tempTable[l].equals("Y")) {
                    temp++;

                }


                if (tempTable.length > 1 && l == tempTable.length - 1 && tempTable[tempTable.length - 1].equals("e")) {
                    if (temp >= 3) {
                        temp--;
                    } else if (temp == 2 && tempTable.length <= 6) {
                        temp--;
                    } else if (temp == 0) {
                        temp = 0;
                    } else if (temp == 1) {
                        temp = 0;
                    }

                } else if ( tempTable.length > 1 && l == tempTable.length - 1 && tempTable[tempTable.length - 2].equals("e")
                        && ((tempTable[tempTable.length - 1].equals(".")
                        || tempTable[tempTable.length - 1].equals("?") || tempTable[tempTable.length - 1].equals("!")))) {
                    if (temp >= 3) {
                        temp--;
                    } else if (temp == 2 && tempTable.length <= 6) {
                        temp--;
                    } else if (temp == 0) {
                        temp = 0;
                    } else if (temp == 1) {
                        temp = 0;
                    }
                }


                if (l < tempTable.length - 1) {
                    if (tempTable[l].equals("a") || tempTable[l].equals("e") ||
                            tempTable[l].equals("i") || tempTable[l].equals("o") ||
                            tempTable[l].equals("u") || tempTable[l].equals("y")) {

                        if ((tempTable[l + 1].equals("a") || tempTable[l + 1].equals("e") ||
                                tempTable[l + 1].equals("i") || tempTable[l + 1].equals("o") ||
                                tempTable[l + 1].equals("u") || tempTable[l + 1].equals("y")) && temp >= 1) {
                            temp--;

                        } else {
                            temp = temp;
                        }


                    } else if (tempTable[l].equals("A") || tempTable[l].equals("E") ||
                            tempTable[l].equals("I") || tempTable[l].equals("O") ||
                            tempTable[l].equals("U") || tempTable[l].equals("Y")) {

                        if ((tempTable[l + 1].equals("A") || tempTable[l + 1].equals("E") ||
                                tempTable[l + 1].equals("I") || tempTable[l + 1].equals("O") ||
                                tempTable[l + 1].equals("U") || tempTable[l + 1].equals("Y")) && temp >= 2) {
                            temp--;

                        } else if ((tempTable[l + 1].equals("a") || tempTable[l + 1].equals("e") ||
                                tempTable[l + 1].equals("i") || tempTable[l + 1].equals("o") ||
                                tempTable[l + 1].equals("u") || tempTable[l + 1].equals("y")) && temp >= 2) {
                            temp--;


                        } else {
                            temp = temp;
                        }


                    } else {
                        temp = temp;
                    }


                }

                if (l == tempTable.length - 1 && temp >= 3) {

                    if (tempTable.length > 3) {
                        counterPolysyllables++;
                    }
                    //System.out.println(wordsPost + " " + temp);


                    counterSyllables = counterSyllables + temp;


                    temp = 0;
                } else if (l == tempTable.length - 1 && temp < 3) {

                    counterPolysyllables = counterPolysyllables;
                    if (temp == 0) {

                        if (!isNumeric(tempTable[0])) {
                            temp = temp + 1;
                            counterSyllables = counterSyllables + temp;
                            //System.out.println(wordsPost + " " + temp);
                        } else if (isNumeric(tempTable[0])) {
                            counterSyllables = counterSyllables;
                        }


                    } else {
                        counterSyllables = counterSyllables + temp;
                        //System.out.println(wordsPost + " " + temp);

                    }

                    temp = 0;
                }


            }


        }


        System.out.println("Words: " + (int) words);

        String[] sentencesTable = table[0].split("[.?!]");
        double sentences = sentencesTable.length;
        System.out.println("Sentences: " + (int) sentences);


        String[] charactersTable = table[0].split("");


        try {

            for (int j = 0; j < charactersTable.length; j++) {
                if (!charactersTable[j].equals(" ")) {

                    counterChar++;
                } else {
                    counterChar = counterChar;
                }

            }


        } catch (
                NullPointerException e) {
            System.out.println(e.getMessage());

        }

        double characters = counterChar;
        counterSyllables = counterSyllables - 1;

        System.out.println("Characters: " + (int) characters);
        System.out.println("Syllables: " + counterSyllables);
        System.out.print("Polysyllables: " + counterPolysyllables);

        System.out.println("");
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");

        Scanner scanNew = new Scanner(System.in);
        String scoreCalculate = scanNew.nextLine();
        System.out.println("");
        String scoreGrade = " ";


        if (scoreCalculate.equals("ARI")) {

            scoreGrade = Score.getARI(scoreCalculate, characters, words, sentences);

        } else if (scoreCalculate.equals("FK")) {

            scoreGrade = Score.getFK(scoreCalculate, words, sentences, counterSyllables);
        } else if (scoreCalculate.equals("SMOG")) {

            scoreGrade = Score.getSMOG(scoreCalculate, sentences, counterPolysyllables);
        } else if (scoreCalculate.equals("CL")) {

            scoreGrade = Score.getCL(scoreCalculate, characters, words, sentences);
        } else if (scoreCalculate.equals("all")) {
            Score.getAll(scoreCalculate, characters, words, sentences, counterSyllables, counterPolysyllables);
        }


        if (!scoreCalculate.equals("all")) {
            switch (scoreGrade) {
                case "1":
                    System.out.println("This text should be understood by 5-6 year olds.");
                    break;
                case "2":
                    System.out.println("This text should be understood by 6-7 year olds.");
                    break;
                case "3":
                    System.out.println("This text should be understood by 7-9 year olds.");
                    break;
                case "4":
                    System.out.println("This text should be understood by 9-10 year olds.");
                    break;
                case "5":
                    System.out.println("This text should be understood by 10-11 year olds.");
                    break;
                case "6":
                    System.out.println("This text should be understood by 11-12 year olds.");
                    break;
                case "7":
                    System.out.println("This text should be understood by 12-13 year olds.");
                    break;
                case "8":
                    System.out.println("This text should be understood by 13-14 year olds.");
                    break;
                case "9":
                    System.out.println("This text should be understood by 14-15 year olds.");
                    break;
                case "10":
                    System.out.println("This text should be understood by 15-16 year olds.");
                    break;
                case "11":
                    System.out.println("This text should be understood by 16-17 year olds.");
                    break;
                case "12":
                    System.out.println("This text should be understood by 17-18 year olds.");
                    break;
                case "13":
                    System.out.println("This text should be understood by 18-24 year olds.");
                    break;
                default:
                    System.out.println("This text should be understood in average by 24+ year olds");
                    break;


            }
        }


    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
}


class Score {


    public static String getARI(String scoreCalculate, double characters, double words, double sentences) {
        String scoreGrade = " ";
        if (scoreCalculate.equals("ARI")) {

            double score = 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
            DecimalFormat df2 = new DecimalFormat("0.00");
            df2.setRoundingMode(RoundingMode.DOWN);
            System.out.print("Automated Readability Index: " + df2.format(score) + " ");


            DecimalFormat df = new DecimalFormat("0");
            df.setRoundingMode(RoundingMode.UP);
            scoreGrade = df.format(score);


        }


        return scoreGrade;
    }


    public static String getFK(String scoreCalculate, double words, double sentences, double syllables) {
        String scoreGrade = " ";
        if (scoreCalculate.equals("FK")) {

            double score = 0.39 * (words / sentences) + 11.8 * (syllables / words) - 15.59;
            DecimalFormat df2 = new DecimalFormat("0.00");
            df2.setRoundingMode(RoundingMode.DOWN);
            System.out.print("Flesch-Kincaid readability tests: " + df2.format(score) + " ");


            DecimalFormat df = new DecimalFormat("0");
            df.setRoundingMode(RoundingMode.UP);
            scoreGrade = df.format(score);


        }


        return scoreGrade;
    }

    public static String getSMOG(String scoreCalculate, double sentences, double polysyllables) {
        String scoreGrade = " ";
        if (scoreCalculate.equals("SMOG")) {

            double score = 1.043 * Math.sqrt(polysyllables * (30 / sentences)) + 3.1291;
            DecimalFormat df2 = new DecimalFormat("0.00");
            df2.setRoundingMode(RoundingMode.DOWN);
            System.out.print("Simple Measure of Gobbledygook: " + df2.format(score) + " ");


            DecimalFormat df = new DecimalFormat("0");
            df.setRoundingMode(RoundingMode.UP);
            scoreGrade = df.format(score);


        }


        return scoreGrade;
    }

    public static String getCL(String scoreCalculate, double characters, double words, double sentences) {
        String scoreGrade = " ";
        double averageLetter = (characters / words) * 100;
        double averangeSentence = (sentences / words) * 100;
        if (scoreCalculate.equals("CL")) {

            double score = (0.0588 * averageLetter) - (0.296 * averangeSentence) - 15.8;
            DecimalFormat df2 = new DecimalFormat("0.00");
            df2.setRoundingMode(RoundingMode.DOWN);
            System.out.print("Coleman-Liau index: " + df2.format(score) + " ");

            DecimalFormat df = new DecimalFormat("0");
            df.setRoundingMode(RoundingMode.UP);
            scoreGrade = df.format(score);


        }


        return scoreGrade;
    }


    public static void getAll(String scoreCalculate, double characters, double words, double sentences, double syllables, double polysyllables) {

        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        double averangeResult = 0;
        String scoreGrade;
        double temporary = 0;


        result1 = Double.parseDouble(Score.getARI("ARI", characters, words, sentences));
        DecimalFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.UP);
        scoreGrade = df.format(result1);
        temporary = Grade.getGrade(scoreGrade);

        result2 = Double.parseDouble(Score.getFK("FK", words, sentences, syllables));
        DecimalFormat df1 = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.UP);
        scoreGrade = df.format(result2);
        temporary = temporary + Grade.getGrade(scoreGrade);

        result3 = Double.parseDouble(Score.getSMOG("SMOG", sentences, polysyllables));
        DecimalFormat df2 = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.UP);
        scoreGrade = df.format(result3);
        temporary = temporary + Grade.getGrade(scoreGrade);

        result4 = Double.parseDouble(Score.getCL("CL", characters, words, sentences));
        DecimalFormat df3 = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.UP);
        scoreGrade = df.format(result4);
        temporary = temporary + Grade.getGrade(scoreGrade);

        averangeResult = (temporary) / 4;


        System.out.println("This text should be understood in average by " +  averangeResult + " year olds.");


    }


}


class Grade {


    public static Double getGrade(String scoreGrade) {
        double temp = 0;
        switch (scoreGrade) {
            case "1":
                System.out.println("(about 6 year olds).");
                temp = temp + 6;
                break;
            case "2":
                System.out.println("(about 7 year olds).");
                temp = temp + 7;
                break;
            case "3":
                System.out.println("(about 9 year olds).");
                temp = temp + 9;
                break;
            case "4":
                System.out.println("(about 10 year olds).");
                temp = temp + 10;
                break;
            case "5":
                System.out.println("(about 11 year olds).");
                temp = temp + 11;
                break;
            case "6":
                System.out.println("(about 12 year olds).");
                temp = temp + 12;
                break;
            case "7":
                System.out.println("(about 13 year olds).");
                temp = temp + 13;
                break;
            case "8":
                System.out.println("(about 14 year olds).");
                temp = temp + 14;
                break;
            case "9":
                System.out.println("(about 15 year olds).");
                temp = temp + 15;
                break;
            case "10":
                System.out.println("(about 16 year olds).");
                temp = temp + 16;
                break;
            case "11":
                System.out.println("(about 17 year olds).");
                temp = temp + 17;
                break;
            case "12":
                System.out.println("(about 18 year olds).");
                temp = temp + 18;
                break;
            default:
                System.out.println("(about 24 year olds).");
                temp = temp + 24;
                break;

        }

        return temp;
    }

}