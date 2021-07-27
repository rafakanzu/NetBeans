package game;


public class Hero extends Gameobject{
    
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
    public void setID (int ID){
        this.ID = ID;
    }
    public int getID (){
        return ID;
    }
    public void display(){
        System.out.println("nama" +getName());
        System.out.println("HP " +getHP());
        System.out.println("Damage " +getDamage());
        System.out.println("ID "+getID());
        
    }
    
    
}
