package game;

import java.util.Scanner;
public class Play { 
    
public static void main(String[] args) {
    Gameobject Run =  new Gameobject();
    Hero Shooter = new Hero();
    Enemy Troop = new Enemy();
    
    
    Run.display();
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan ID Hero");
    Shooter.setID(input.nextInt());
    
    System.out.print("Masukkan Nama Hero");
    Shooter.setName(input.next());
    
    System.out.print("Masukkan HP Hero");
    Shooter.setHP(input.nextInt());
    
    System.out.print("Masukkan Damage Hero");
    Shooter.setDamage(input.nextInt());
    
    System.out.println("-------------------------------");
    
    System.out.print("Masukkan Nama Enemy");
    Troop.setName(input.next());
    
    System.out.print("Masukkan HP Enemy");
    Troop.setHP(input.nextInt());
    
    System.out.print("Masukkan Damage Enemy");
    Troop.setDamage(input.nextInt());
    
    Shooter.display();
    Troop.display();
    
    if (Shooter.HP>Troop.HP ){
        
        
    }
    
    
    
    
    
    
    
    



    
    }
}
