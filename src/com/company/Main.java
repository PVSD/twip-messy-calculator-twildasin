package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        double n1 = 0;
        double n2 = 0;
        String eq = "";
        int mclass;
        String act;
        Scanner kbin = new Scanner(System.in);
        Random val = new Random();
        double out = 0;
        String end;


        System.out.println("Welcome to the Messy Calculator Program\nPlease type the math equation you would like to use from the list");
        System.out.println("Add = Addition\nSub = Subtraction\nDiv = Division\nMul = Multiplication\nPow = Power");



        while (1==1)
        {
            eq = kbin.nextLine();

            if (Objects.equals(eq.toLowerCase() , "pow") || Objects.equals(eq.toLowerCase() , "mul") || Objects.equals(eq.toLowerCase() , "div") || Objects.equals(eq.toLowerCase() , "add") || Objects.equals(eq.toLowerCase() , "sub"))
            {
                System.out.println("\"" + eq + "\"" + " selected");
                break;
            }
            else
            {
                System.out.println("Invalid input, please choose a function from the list");
                System.out.println("Add = Addition\nSub = Subtraction\nDiv = Division\nMul = Multiplication\nPow = Power");
            }
        }

        System.out.println("Please input the first number you want the system to use:");
        n1 = kbin.nextDouble();
        System.out.println("Please input the second number");
        n2 = kbin.nextDouble();


        mclass = val.nextInt(5) + 1;
        //System.out.println("Testing *********** operation # done: " + mclass);


        if(mclass == 1)
        {
            out = n1 + n2;
            act = "add";
        }
        else if(mclass == 2)
        {
            out = n1 - n2;
            act = "sub";
        }
        else if(mclass == 3)
        {
            out = n1 / n2;
            act = "div";
        }
        else if(mclass == 4)
        {
            out = n1 * n2;
            act = "mul";
        }
        else if(mclass == 5)
        {
            out = Math.pow(n1, n2);
            act = "pow";
        }
        else
        {
            act = "";
        }

        System.out.println("\nThe answer is: " + out + "\n\nAre you satisfied?");
        int tim = 0;


        while(1==1)
        {
            end = kbin.nextLine();
            if(Objects.equals(end.toLowerCase() , "yes") && (Objects.equals(eq.toLowerCase() , act)))
            {
                System.out.println("Correct!\nEnding Program");
                System.exit(0);
                break;
            }
            else if (Objects.equals(end.toLowerCase() , "yes") && (!Objects.equals(eq.toLowerCase() , act)))
            {
                System.out.println("Incorrect, your calculation was not performed. Please input the operation that you think was done to your numbers");
                break;
            }
            else if(Objects.equals(end.toLowerCase() , "no") && (!Objects.equals(eq.toLowerCase() , act)))
            {
                System.out.println("Correct, Please input the operation that you think was done to your numbers");
                break;

            }
            else if (Objects.equals(end.toLowerCase() , "no") && (Objects.equals(eq.toLowerCase() , act)))
            {
                System.out.println("Incorrect, your calculation was performed.\nEnding Program");
                System.exit(0);
                break;
            }
            else if (tim>=1)
            {
                System.out.println("Invalid Input\nPlease input \"yes\" or \"no\"");

            }
            tim++;
        }



        while (1==1)
        {

            end = kbin.nextLine();

            if(Objects.equals(end.toLowerCase() , "add"))
            {
                if(mclass == 1)
                {
                    System.out.println("Congrats!, that is correct!\nEnding Program");
                }
                else
                {
                    System.out.println("Sorry, that is incorrect. The correct operation done was: " + act + "\nEnding Program");

                }
                break;
            }
            else if(Objects.equals(end.toLowerCase() , "sub"))
            {
                if(mclass == 2)
                {
                    System.out.println("Congrats!, that is correct!\nEnding Program");

                }
                else
                {
                    System.out.println("Sorry, that is incorrect. The correct operation done was: " + act + "\nEnding Program");


                }
                break;
            }
            else if(Objects.equals(end.toLowerCase() , "div"))
            {
                if(mclass == 3)
                {
                    System.out.println("Congrats!, that is correct!\nEnding Program");
                }
                else
                {
                    System.out.println("Sorry, that is incorrect. The correct operation done was: " + act + "\nEnding Program");


                }
                break;
            }
            else if(Objects.equals(end.toLowerCase() , "mul"))
            {
                if(mclass == 4)
                {
                    System.out.println("Congrats!, that is correct!\nEnding Program");
                }
                else
                {
                    System.out.println("Sorry, that is incorrect. The correct operation done was: " + act + "\nEnding Program");


                }
                break;
            }
            else if(Objects.equals(end.toLowerCase() , "pow"))
            {
                if(mclass == 5)
                {
                    System.out.println("Congrats!, that is correct!\nEnding Program");
                }
                else
                {
                    System.out.println("Sorry, that is incorrect. The correct operation done was: " + act + "\nEnding Program");

                }
                break;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }









    }




}
