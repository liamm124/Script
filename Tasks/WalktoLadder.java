package scripts.Tasks;

import org.powerbot.script.rt4.*;

import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Random;
import org.powerbot.script.Condition;
import scripts.RCrafter;
import java.util.concurrent.Callable;

public abstract class WalktoLadder extends Task {


    public WalktoLadder(ClientContext ctx) {
        super(ctx);
    }

    private static final Tile[] path1 = {new Tile(2460,3250,0),new Tile (2456,3240+Random.nextInt(0,5),0),new Tile(2453,3231,0)};
    private static final Tile[] path2 = {new Tile(2460,3250,0),new Tile (2454,3244+Random.nextInt(-2,4),0), new Tile(2452,3232,0)};
    private Tile LadderDownMiddle = new Tile(2454,3242,0);
    private Tile ladderDown = new Tile(2453,3231,0);
    private Tile OuroTele = new Tile(2467, 3245, 0);
    final GameObject ladder = ctx.objects.select().name("Ladder").nearest().poll();
    @Override
    public boolean activate() {
        return
                ctx.players.local().tile().distanceTo(OuroTele) <=15 || ctx.players.local().tile().distanceTo(LadderDownMiddle) <=7  ;
    }

    @Override
    public void execute(){
        RCrafter.status = "Walking to ladder";
        int R = Random.nextInt(1,2);

        switch (R) {
            case 1:

                RCrafter.status = "Walking to ladder 1";
                if (ctx.game.tab() != Game.Tab.INVENTORY){
                    ctx.game.tab(Game.Tab.INVENTORY);
                }
                if (ctx.players.local().tile().distanceTo(ladderDown) <=6 ){
                    ctx.movement.newTilePath(path1).traverse();

                    ctx.camera.turnTo(LadderDownMiddle);
                    Condition.sleep(Random.nextInt(250,400));

                }



            case 2:
                RCrafter.status = "Walking to ladder 2";
                if (ctx.game.tab() != Game.Tab.INVENTORY){
                    ctx.game.tab(Game.Tab.INVENTORY);
                if (ctx.players.local().tile().distanceTo(ladderDown) <=6 ){
                    ctx.movement.newTilePath(path2).traverse();

                    }
                    ctx.camera.turnTo(LadderDownMiddle);
                    Condition.sleep(Random.nextInt(250,400));

                }



            default:
                ctx.movement.newTilePath(path2).traverse();

        }







    }}