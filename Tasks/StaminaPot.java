package scripts.Tasks;


import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Game;
import scripts.RCrafter;
import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.Path;
import org.powerbot.script.rt4.Player;
import org.powerbot.script.Random;
import org.powerbot.script.Condition;

public abstract class StaminaPot extends Task {


    public StaminaPot(ClientContext ctx) {
        super(ctx);
    }




    public boolean activate() {
        return ctx.movement.energyLevel()<=Random.nextInt(30,42);


    }

    public void execute() {
        RCrafter.status = "Drinking potions";
        if (ctx.game.tab() != Game.Tab.INVENTORY){
            ctx.game.tab(Game.Tab.INVENTORY);
        }
        ctx.inventory.select().name("Stamina potion(1)").poll().interact("Drink");
        ctx.inventory.select().name("Stamina potion(2)").poll().interact("Drink");
        ctx.inventory.select().name("Stamina potion(3)").poll().interact("Drink");
        ctx.inventory.select().name("Stamina potion(4)").poll().interact("Drink");
        Condition.sleep(Random.nextInt(110, 200));


    }

}
