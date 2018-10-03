package scripts.Tasks;


import org.powerbot.script.rt4.*;
import scripts.RCrafter;
import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Random;
import org.powerbot.script.Condition;

public abstract class LadderDown extends Task {



    public LadderDown(ClientContext ctx) {
        super(ctx);
    }

    private  Tile Trapdoor = new Tile (2455,3233,0);

    @Override
    public boolean activate() {
        return ctx.players.local().tile().distanceTo(Trapdoor)<=5;
    }

    public void execute(){
        RCrafter.status = "Praying and going down ladder";

        final GameObject ladder = ctx.objects.select().name("Ladder").nearest().poll();
        final GameObject altar = ctx.objects.select().name("Chaos altar").nearest().poll();
        if (ctx.prayer.prayerPoints()<=30){

            altar.click();
            Condition.sleep(Random.nextInt(25, 50));
            altar.click();
            Condition.sleep(Random.nextInt(100, 200));

        }
        if (ctx.prayer.prayerPoints()<=30){

            altar.click();
            Condition.sleep(Random.nextInt(25, 50));
            altar.click();
            Condition.sleep(Random.nextInt(100, 200));

        }
        if (ctx.prayer.prayerPoints()<=30){

            altar.click();
            Condition.sleep(Random.nextInt(25, 50));
            altar.click();
            Condition.sleep(Random.nextInt(100, 200));

        }
        if (ctx.prayer.prayerPoints()<=30){

            altar.click();
            Condition.sleep(Random.nextInt(25, 50));
            altar.click();
            Condition.sleep(Random.nextInt(100, 200));

        }


        if (ctx.inventory.viewable().name("Small pouch").count()==0) {

            ctx.game.tab(Game.Tab.INVENTORY);


        }


        ladder.interact("Climb");

    }
}
