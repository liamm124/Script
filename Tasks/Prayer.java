package scripts.Tasks;


import org.powerbot.script.rt4.*;
import scripts.RCrafter;
import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Random;
import org.powerbot.script.Condition;

public abstract class Prayer extends Task {



    public Prayer(ClientContext ctx) {
        super(ctx);
    }

    private  Tile Trapdoor = new Tile (2455,3233,0);

    @Override
    public boolean activate() {
        return ctx.players.local().tile().distanceTo(Trapdoor)<=5 && ctx.prayer.prayerPoints()<=30;
    }

    public void execute(){
        RCrafter.status = "Praying and going down ladder";


        final GameObject altar = ctx.objects.select().name("Chaos altar").nearest().poll();
        altar.click();
        Condition.sleep(Random.nextInt(100, 150));





    }
}
