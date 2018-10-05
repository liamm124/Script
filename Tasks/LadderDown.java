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
        return ctx.players.local().tile().distanceTo(Trapdoor)<=5 && ctx.prayer.prayerPoints()>=25;
    }

    public void execute(){
        RCrafter.status = "Praying and going down ladder";
        if (ctx.game.tab() != Game.Tab.INVENTORY){
            ctx.game.tab(Game.Tab.INVENTORY);
        }

        final GameObject ladder = ctx.objects.select().name("Ladder").nearest().poll();




        ladder.interact("Climb");

    }
}
