package Units;

public abstract class BaseHero implements GameInterface{

    protected int hp, maxHp, armor, damage, lvl;
    protected String name;
    //double position, speed;

    public BaseHero(int hp, int maxHp, int armor, int damage, int lvl, String name) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.damage = damage;
        this.lvl = lvl;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return name + " (" + lvl + " лвл), здоровье: " + hp + "/" + maxHp + ", броня: " + armor + ", урон: " + damage;
    }

    @Override
    public void step() {}

//    protected void move(double direction) {
//        //this.position += direction * this.speed;
//    }
//
//    protected void attack(Object aim) {
//        //aim.getDamage(this.damage);
//    }
//
//    protected void getDamage(int damage) {
//        //this.hp -= damage - this.armor;
//    }
//
//    protected void heal(Object aim) {
//        //aim.getHeal();
//    }
//
//    protected void getHeal(int heal) {
//        //this.hp += heal;
//    }
}