package scripts.Tasks;

import org.powerbot.script.rt4.GameObject;

import org.powerbot.script.rt4.ClientContext;
import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.Path;
import org.powerbot.script.rt4.Player;
import org.powerbot.script.Random;
import org.powerbot.script.Condition;
import scripts.RCrafter;
import java.util.concurrent.Callable;

public abstract class WalkToLadder extends Task {

    private final Walker walker = new Walker(ctx);
    public WalkToLadder(ClientContext ctx) {
        super(ctx);
    }

    private static final Tile[] path1 = {new Tile (2454,3240+Random.nextInt(-2,2),0),new Tile(2453,3231,0)};
    private static final Tile[] path2 = {new Tile (2454,3244+Random.nextInt(-2,2),0), new Tile(2452,3232,0)};
    private Tile LadderDownMiddle = new Tile(2454,3242,0);
    private Tile OuroTele = new Tile(2467, 3245, 0);
    final GameObject ladder = ctx.objects.select().name("Ladder").nearest().poll();
    @Override
    public boolean activate() {
        return
                ctx.players.local().tile().distanceTo(OuroTele) <=10 ||    ctx.players.local().tile().distanceTo(LadderDownMiddle) <=10 ;
    }

    @Override
    public void execute(){
        RCrafter.status = "Walking to ladder";
         int R = Random.nextInt(1,2);
        if (R==1){
            walker.walkPath(path1);
            ctx.camera.turnTo(ladder);
        }
        if (R==2){
            walker.walkPath(path2);
        }



    }







}