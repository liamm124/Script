package scripts.Tasks;
import scripts.RCrafter;


import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.rt4.*;
import scripts.Task;

import java.awt.*;
import java.util.concurrent.Callable;

public class AntiBan extends Task {

    public AntiBan(ClientContext arg0) {
        super(arg0);
    }

    final Npc manbank = ctx.npcs.select().name("Eniola").nearest().poll();
    final GameObject altar =  ctx.objects.select().name("Chaos altar").nearest().poll();
    final GameObject rcaltar = ctx.objects.select().name("Runecrafting altar").nearest().poll();

    public boolean inHouse() {
        if (rcaltar.inViewport() || altar.inViewport() || manbank.inViewport() || ctx.inventory.select().count()>=27){
            return true;
        }else {return false;}
    }

    @Override
    public boolean activate() {
        Random r = new Random();
        int ra = r.nextInt(1,350);
        return inHouse() &&  (ra == 25 || ra == 50 || ra == 75);
    }


    @Override
    public void execute() {
        RCrafter.status = "Antiban";
        int r = Random.nextInt(0,15);

        switch (r){
            case 0:
                if (ctx.inventory.select().count()>=27){

                } else{
                Condition.sleep(Random.nextInt(1500,4500));
                System.out.println("Antipattern-Case0:Sleeping");
                break;}
            case 1:
                if (ctx.inventory.select().count()>=27){

                }else{
                ctx.input.move(-100,Random.nextInt(100,350));
                Condition.sleep(Random.nextInt(2500,5500));
                System.out.println("Antipattern-Case1:Moving mouse offscreen");

                break;}
            case 2:
                if (ctx.inventory.select().count()>=27){
                    System.out.println("Antipattern-Case2:Hovering a Player");

                    Player pl = ctx.players.select().nearest().poll();

                    pl.hover();
                    Condition.sleep(Random.nextInt(500,2500));
                    break;
                } else {
                    System.out.println("Antipattern-Case2:Hovering a Player");

                    Player pl = ctx.players.select().nearest().poll();
                    pl.hover();
                    Condition.sleep(Random.nextInt(500,2500));
                    break;
                }

            case 3:
                if (ctx.inventory.select().count()>=27){

                    System.out.println("Antipattern-Case3:Moving mouse offscreen");

                    int x = Random.nextInt(-500, -100);
                    int y = Random.nextInt(-500, -100);
                    ctx.input.move(x, y);
                    ctx.input.defocus();

                    Condition.sleep(Random.nextInt(700, 1500));

                    ctx.input.focus();
                    x = Random.nextInt(16, 512);
                    y = Random.nextInt(45, 334);
                    ctx.input.move(x, y);

                }else{
                System.out.println("Antipattern-Case3:Moving mouse offscreen");

                int x = Random.nextInt(-500, -100);
                int y = Random.nextInt(-500, -100);
                ctx.input.move(x, y);
                ctx.input.defocus();

                Condition.sleep(Random.nextInt(5000, 13000));

                ctx.input.focus();
                x = Random.nextInt(16, 512);
                y = Random.nextInt(45, 334);
                ctx.input.move(x, y);
                break;}
            case 4:
                if (ctx.inventory.select().count()>=27){
                    ctx.camera.turnTo(ctx.players.select().nearest().poll());

                    break;
                }else{
                ctx.camera.turnTo(ctx.players.select().nearest().poll());

                break;
                }
            case 5:
                if (ctx.inventory.select().count()>=27){
                    System.out.println("Antipattern-Case5:Random mouse moving");

                    int maxDistance = 0;
                    int minDistance = 0;
                    double xvec = Math.random();
                    if (Random.nextInt(0, 2) == 1) {
                        xvec = -xvec;
                    }
                    double yvec = Math.sqrt(1 - xvec * xvec);
                    if (Random.nextInt(0, 2) == 1) {
                        yvec = -yvec;
                    }
                    double distance = maxDistance;
                    Point p = ctx.input.getLocation();
                    int maxX = (int) Math.round(xvec * distance + p.x);
                    distance -= Math.abs((maxX - Math.max(0,
                            Math.min(ctx.game.dimensions().getWidth(), maxX)))
                            / xvec);
                    int maxY = (int) Math.round(yvec * distance + p.y);
                    distance -= Math.abs((maxY - Math.max(0,
                            Math.min(ctx.game.dimensions().getHeight(), maxY)))
                            / yvec);
                    if (distance < minDistance) {
                        return;
                    }
                    distance = Random.nextInt(minDistance, (int) distance);
                    ctx.input.move((int) (xvec * distance) + p.x, (int) (yvec * distance) + p.y);
                    break;


                }else{
                System.out.println("Antipattern-Case5:Random mouse moving");

                int maxDistance = 0;
                int minDistance = 0;
                double xvec = Math.random();
                if (Random.nextInt(0, 2) == 1) {
                    xvec = -xvec;
                }
                double yvec = Math.sqrt(1 - xvec * xvec);
                if (Random.nextInt(0, 2) == 1) {
                    yvec = -yvec;
                }
                double distance = maxDistance;
                Point p = ctx.input.getLocation();
                int maxX = (int) Math.round(xvec * distance + p.x);
                distance -= Math.abs((maxX - Math.max(0,
                        Math.min(ctx.game.dimensions().getWidth(), maxX)))
                        / xvec);
                int maxY = (int) Math.round(yvec * distance + p.y);
                distance -= Math.abs((maxY - Math.max(0,
                        Math.min(ctx.game.dimensions().getHeight(), maxY)))
                        / yvec);
                if (distance < minDistance) {
                    return;
                }
                distance = Random.nextInt(minDistance, (int) distance);
                ctx.input.move((int) (xvec * distance) + p.x, (int) (yvec * distance) + p.y);
                break;}
            case 6:
                if (ctx.inventory.select().count()>=27){
                    System.out.println("Antipattern-Case6:Hovering RC EXP");
                    ctx.widgets.widget(548).component(49).click();
                    Condition.sleep(Random.nextInt(300, 500));
                    if (ctx.widgets.widget(320).component(7).valid()) {
                        ctx.widgets.widget(320).component(7).hover();
                        Condition.sleep(Random.nextInt(1200, 3000));
                        ctx.widgets.widget(548).component(51).click();
                    }
                }else {
                    System.out.println("Antipattern-Case6:Hovering RC EXP");
                    if (inHouse() && ctx.players.local().inMotion()) {
                        ctx.widgets.widget(548).component(49).click();
                        Condition.sleep(Random.nextInt(300, 500));
                        if (ctx.widgets.widget(320).component(7).valid()) {
                            ctx.widgets.widget(320).component(7).hover();
                            Condition.sleep(Random.nextInt(1200, 3000));
                            ctx.widgets.widget(548).component(51).click();
                        }
                    }
                    break;
                }
            case 7:
                if (ctx.inventory.select().count()>=27){
                    ctx.camera.turnTo(ctx.players.select().nearest().poll());

                    break;
                }else{
                    ctx.camera.turnTo(ctx.players.select().nearest().poll());

                    break;
                }

            case 8:
                if (ctx.inventory.select().count()>=27){
                    ctx.camera.turnTo(ctx.players.select().nearest().poll());

                    break;
                }else{
                    ctx.camera.turnTo(ctx.players.select().nearest().poll());

                    break;
                }



            case 9:
                if (ctx.inventory.select().count()>=27){
                    System.out.println("Antipattern-Case9:Changing mouse speed");
                    ctx.input.speed(Random.nextInt(65, 100));

                    break;
                }else {
                    System.out.println("Antipattern-Case9:Changing mouse speed");
                    ctx.input.speed(Random.nextInt(65, 100));

                    break;
                }
            case 10:
                if (ctx.inventory.select().count()>=27){
                    ctx.camera.turnTo(ctx.players.select().nearest().poll());

                    break;
                }else{
                    ctx.camera.turnTo(ctx.players.select().nearest().poll());

                    break;
                }


            default:

                    System.out.println("Antipattern-Case-default:Changing mouse speed");
                    ctx.input.speed(Random.nextInt(65, 100));

        }

    }
}