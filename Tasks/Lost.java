package scripts.Tasks;

import org.powerbot.script.Area;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.*;
import scripts.RCrafter;
import scripts.Tasks.Walker;
import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Random;

public abstract class Lost extends Task {


    public Lost(ClientContext ctx) {
        super(ctx);
    }

    /**
     *  tile ( EW(E+,W-),NS(s-,n+,0)
     */
    private Tile OuroTele = new Tile(2467, 3245, 0);
    private Tile LadderDownTile = new Tile(2453,3231,0);
    private Tile OuroDest = new Tile(3058, 5579, 0);
    private Tile Bank = new Tile(3015, 5626, 0);


    @Override
    public boolean activate() {

        return  (ctx.movement.energyLevel()==100 && ctx.players.local().animation()==-1) ||
                (ctx.players.local().tile().y()<=5570 && ctx.players.local().tile().y()>=3252) || (ctx.players.local().tile().x()<=2475 && ctx.players.local().tile().x()>=3065);
    }

    @Override
    public void execute(){
        RCrafter.status = "Lost - Tele to altar";
        ctx.magic.cast(Magic.LunarSpell.OURANIA_TELEPORT);
        Condition.sleep(2000);

    }

}