package scripts.Tasks;

import org.powerbot.script.rt4.*;
import scripts.RCrafter;
import scripts.Tasks.Walker;

import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Random;

public abstract class WalkToAltar5 extends Task {


    public WalkToAltar5(ClientContext ctx) {
        super(ctx);
    }
    private Tile OuroDest = new Tile(3058, 5579, 0);



    private static final Tile[] path1 = {new Tile(3016,5614,0),new Tile(3017,5592,0),new Tile(3027,5577,0), new Tile(3045,5577,0), new Tile(3052,5580,0),new Tile(3058,5579,0)};
    private static final Tile[] path2 = {new Tile(3016,5614+Random.nextInt(-1,1),0),new Tile(3014+Random.nextInt(-1,1),5604+Random.nextInt(-2,5),0),new Tile(3017+Random.nextInt(-1,1),5592+Random.nextInt(-4,2),0),new Tile(3017+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3027+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3037+Random.nextInt(-1,1),5583+Random.nextInt(-1,1),0), new Tile(3045+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0), new Tile(3049+Random.nextInt(-1,1),5582+Random.nextInt(-1,1),0),new Tile(3052+Random.nextInt(-2,2),5580+Random.nextInt(-1,1),0),new Tile(3058+Random.nextInt(-1,1),5579+Random.nextInt(-1,1),0)};
    private static final Tile[] path3 = {new Tile(3016,5614+Random.nextInt(-1,1),0),new Tile(3014+Random.nextInt(-1,1),5604+Random.nextInt(-2,5),0),new Tile(3017+Random.nextInt(-1,1),5592+Random.nextInt(-4,2),0),new Tile(3017+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3027+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3037+Random.nextInt(-1,1),5583+Random.nextInt(-1,1),0), new Tile(3045+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0), new Tile(3049+Random.nextInt(-1,1),5582+Random.nextInt(-1,1),0),new Tile(3052+Random.nextInt(-2,2),5580+Random.nextInt(-1,1),0),new Tile(3058+Random.nextInt(-1,1),5579+Random.nextInt(-1,1),0)};
    private static final Tile[] path4 = {new Tile(3016,5614+Random.nextInt(-1,1),0),new Tile(3014+Random.nextInt(-1,1),5604+Random.nextInt(-2,5),0),new Tile(3017+Random.nextInt(-1,1),5592+Random.nextInt(-4,2),0),new Tile(3017+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3027+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3037+Random.nextInt(-1,1),5583+Random.nextInt(-1,1),0), new Tile(3045+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0), new Tile(3049+Random.nextInt(-1,1),5582+Random.nextInt(-1,1),0),new Tile(3052+Random.nextInt(-2,2),5580+Random.nextInt(-1,1),0),new Tile(3058+Random.nextInt(-1,1),5579+Random.nextInt(-1,1),0)};
    private static final Tile[] path5 = {new Tile(3016,5614+Random.nextInt(-1,1),0),new Tile(3014+Random.nextInt(-1,1),5604+Random.nextInt(-2,5),0),new Tile(3017+Random.nextInt(-1,1),5592+Random.nextInt(-4,2),0),new Tile(3017+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3027+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0),new Tile(3037+Random.nextInt(-1,1),5583+Random.nextInt(-1,1),0), new Tile(3045+Random.nextInt(-1,1),5577+Random.nextInt(-1,1),0), new Tile(3049+Random.nextInt(-1,1),5582+Random.nextInt(-1,1),0),new Tile(3052+Random.nextInt(-2,2),5580+Random.nextInt(-1,1),0),new Tile(3058+Random.nextInt(-1,1),5579+Random.nextInt(-1,1),0)};
    private Tile PreviousStep = new Tile(3045,5577,0);
    private Tile NextStep = new Tile(3058+Random.nextInt(-1,1),5579,0);
    private Tile Bank = new Tile(3015, 5626, 0);

    private final Walker walker = new Walker(ctx);
    final GameObject altar = ctx.objects.select().name("Runecrafting altar").nearest().poll();
    @Override
    public boolean activate() {
        return ( ctx.players.local().tile().distanceTo(PreviousStep)<=6 && ctx.inventory.select().count()==28 )||(ctx.players.local().tile().distanceTo(PreviousStep)<=6  && ctx.inventory.select().count()==27);
    }

    @Override
    public void execute() {
        int rand = 1;
        RCrafter.status = "Walking to altar - 5th Step";

        switch (rand) {
            case 1:
                ctx.movement.step(NextStep);
                ctx.camera.turnTo(altar);

        }

    }





}
