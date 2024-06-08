/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game_scissor_rock;
import java.util.Random;
import java.util.Scanner;
        
/**
 *
 * @author Shoaib Ahmed Bullo <your.name at your.org>
 */
public class Game_Scissor_Rock {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random ran=new Random();;
        Scanner sc=new Scanner(System.in);
        String choice[]={"Scissor ", "Rock" , "Paper"};
        System.out.println("Scissor Rock Paper");
        int computer=ran.nextInt(3);
        int user=sc.nextInt();
        System.out.println("the computer is "+choice[computer]+"you'r "+choice[user]+" ");
        String result;
        if(user==computer){
        result="it is draw ";
        }
        else if((user==0 && computer==2)||  (user==1 && computer==0) || (user==2 && computer==1)){
        result="You won";
        }
        else{
        result="You lose ";
        }
        System.out.println(result);
    
    
    }
    
}
