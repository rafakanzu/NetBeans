package game;


public class Enemy  extends Gameobject{
    
    public void setName (String name){
            super.name = name;
         }
    public String getName(){
        return name;
        }
    public void setHP(int HP){
        super.HP = HP;
        }
    public int getHP(){
        return HP;
    }
    public void setDamage(int Damage){
        super.Damage = Damage;
    }
    public int getDamage(){
        return Damage;
    }
    public void display(){
        System.out.println("Name "+getName());
        System.out.println("HP "+getHP());
        System.out.println("Damage "+getDamage());
    }
}
