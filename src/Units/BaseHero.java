package Units;

public class BaseHero {

    protected int hp, maxHp, armor, damage, stamina, lvl;
    //double position, speed;

    public BaseHero(int hp, int maxHp, int armor, int damage, int stamina, int lvl) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.damage = damage;
        this.stamina = stamina;
        this.lvl = lvl;
    }

    protected void move(double direction) {
        //this.position += direction * this.speed;
    }

    protected void attack(Object aim) {
        //aim.getDamage(this.damage);
    }

    protected void getDamage(int damage) {
        //this.hp -= damage - this.armor;
    }

    protected void heal(Object aim) {
        //aim.getHeal();
    }

    protected void getHeal(int heal) {
        //this.hp += heal;
    }
}