package scripts.Tasks;

import scripts.RCrafter;
import scripts.Task;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.Npc;
import org.powerbot.script.*;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.PollingScript;
import org.powerbot.script.rt4.Player;
import org.powerbot.script.Area;
import org.powerbot.script.rt4.Movement;
import org.powerbot.script.Script.Manifest;
import org.powerbot.script.rt4.TileMatrix;
import org.powerbot.script.rt4.*;
import org.powerbot.script.rt4.Movement;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.Condition;
import java.util.concurrent.Callable;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Npc;




public abstract class EssBanking extends Task{

    public EssBanking(ClientContext ctx) {
        super(ctx);
    }


    private Tile Ladder = new Tile(3015, 5629, 0);
    private Tile FirstStep = new Tile(3015,5624,0);


    @Override
    public boolean activate() {
        return ctx.inventory.select().name("Pure Essence").count() <=5 && ctx.players.local().tile().distanceTo(Ladder)<=10
                ;
    }

    @Override
    public void execute(){
        RCrafter.status = "Banking";
        int POrder = Random.nextInt(1,4);

        if (!ctx.bank.open()) {

            ctx.npcs.select().id(7417).poll().interact("Bank");

            Condition.wait(new Callable<Boolean>() {

                @Override
                public Boolean call() throws Exception {
                    return ctx.bank.open();
                }

            });

        }
        if (ctx.bank.open()) {
            Condition.sleep(Random.nextInt(150, 300));

            ctx.bank.depositInventory();
            Condition.sleep(Random.nextInt(250, 500));
            if (ctx.inventory.select().name("Stamina potion(1)").count() == 0) {
                if (ctx.inventory.select().name("Stamina potion(2)").count() == 0) {
                    if (ctx.inventory.select().name("Stamina potion(3)").count() == 0) {
                        if (ctx.inventory.select().name("Stamina potion(4)").count() == 0) {
                            ctx.bank.select().name("Stamina potion(4)").poll().interact("Withdraw-1");
                        }
                    }
                }

            }


            ctx.bank.select().name("Pure Essence").poll().interact("Withdraw-All");
            Condition.sleep(Random.nextInt(150, 300));


            if (POrder == 1) {
                ctx.inventory.select().name("Giant pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(250, 500));
                ctx.bank.select().name("Pure Essence").poll().interact("Withdraw-All");
                Condition.sleep(Random.nextInt(150, 300));
                ctx.inventory.select().name("Small pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(250, 500));
                ctx.inventory.select().name("Medium pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(200, 300));

                ctx.inventory.select().name("Large pouch").poll().interact("Fill");
            }
            if (POrder == 2) {
                ctx.inventory.select().name("Medium pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(250, 500));

                ctx.inventory.select().name("Small pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(200, 300));
                ctx.inventory.select().name("Giant pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(250, 500));
                ctx.bank.select().name("Pure Essence").poll().interact("Withdraw-All");
                Condition.sleep(Random.nextInt(150, 300));
                ctx.inventory.select().name("Large pouch").poll().interact("Fill");
            }
            if (POrder == 3) {
                ctx.inventory.select().name("Large pouch").poll().interact("Fill");

                Condition.sleep(Random.nextInt(250, 500));
                ctx.inventory.select().name("Medium pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(200, 300));
                ctx.inventory.select().name("Small pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(150, 300));
                ctx.bank.select().name("Pure Essence").poll().interact("Withdraw-All");
                Condition.sleep(Random.nextInt(150, 300));
                ctx.inventory.select().name("Giant pouch").poll().interact("Fill");
            }
            if (POrder == 4) {
                ctx.inventory.select().name("Large pouch").poll().interact("Fill");

                Condition.sleep(Random.nextInt(250, 500));
                ctx.inventory.select().name("Giant pouch").poll().interact("Fill");
                Condition.sleep(Random.nextInt(250, 500));
                ctx.bank.select().name("Pure Essence").poll().interact("Withdraw-All");
                Condition.sleep(Random.nextInt(150, 300));
                ctx.inventory.select().name("Small pouch").poll().interact("Fill");

                Condition.sleep(Random.nextInt(200, 300));
                ctx.inventory.select().name("Medium pouch").poll().interact("Fill");
            }


            if (ctx.inventory.select().name("Stamina potion(1)").count() == 0 && ctx.inventory.select().name("Stamina potion(2)").count() == 0 &&
                    ctx.inventory.select().name("Stamina potion(3)").count() == 0 && ctx.inventory.select().name("Stamina potion(4)").count() == 0) {

                            ctx.bank.select().name("Stamina potion(4)").poll().interact("Withdraw-1");


            }


            ctx.bank.select().name("Pure Essence").poll().interact("Withdraw-All");
            Condition.sleep(Random.nextInt(350, 450));
            if (ctx.inventory.select().count() <= 27) {

                ctx.bank.select().name("Pure Essence").poll().interact("Withdraw-All");
                Condition.sleep(Random.nextInt(50, 250));
            }
            ctx.movement.newTilePath(FirstStep);

        }

    }

    /**  if (!ctx.movement.running() && ctx.movement.energyLevel()<10){
     ctx.movement.running(true);
     } widget76  - compoennt13
     }
     */
}