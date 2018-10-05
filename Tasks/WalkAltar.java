package scripts.Tasks;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.*;
import scripts.RCrafter;
import scripts.Constants.Constants;

import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Random;

public abstract class WalkAltar extends Task {
    final GameObject altar = ctx.objects.select().name("Runecrafting altar").nearest().poll();
    private Tile bank = new Tile(3015, 5626, 0);
    public WalkAltar(ClientContext ctx) {
        super(ctx);
    }
    private int Ran = Random.nextInt(0,100);
@Override
    public boolean activate(){
    return ( ctx.players.local().tile().distanceTo(bank)<=10 && ctx.players.local().tile().distanceTo(bank)>=2 && ctx.inventory.select().count()==28 )||(ctx.players.local().tile().distanceTo(bank)<=10 && ctx.players.local().tile().distanceTo(bank)>=2 &&  ctx.inventory.select().count()==27);
}

    private    Tile firstStep = new Tile(3016+Random.nextInt(-1,1),5614+Random.nextInt(-1,1),0);
    private Tile to;
    private Tile from;


@Override
    public void execute(){
            Step1AltarR1();


}

    public void Step1AltarR1(){
        RCrafter.status = "Walking to altar - 1st Step";
        int rand = Random.nextInt(1,3);
        switch (rand) {
            case 1:
                  Tile firstStep = new Tile(3016+Random.nextInt(-1,1),5614+Random.nextInt(-1,1),0);
                    ctx.movement.step(firstStep);
                while (ctx.players.local().tile().distanceTo(firstStep)>=10 ){
                    Condition.sleep(Random.nextInt(550,800));

                }
                Step2Altarr1(firstStep);
                break;

            case 2:
                Tile firstStep2 = new Tile(3014+Random.nextInt(-1,1),5608+Random.nextInt(-1,1),0);
                ctx.movement.step(firstStep2);
                while (ctx.players.local().tile().distanceTo(firstStep2)>=10 ){
                    Condition.sleep(Random.nextInt(450,700));
                    new AntiBan(ctx).execute();

                }

                Step2Altarr1(firstStep2);
                break;

            case 3:
                Tile firstStep3 = new Tile(3013+Random.nextInt(-1,1),5611+Random.nextInt(-1,1),0);
                ctx.movement.step(firstStep3);
                while (ctx.players.local().tile().distanceTo(firstStep3)>=10 ){
                    Condition.sleep(Random.nextInt(550,700));
                    new AntiBan(ctx).execute();
                }
                Step2Altarr1(firstStep3);
                break;
        }


    }


    public void Step2Altarr1(Tile from1) {
        RCrafter.status = "Walking to altar - 2nd Step";
        /**if (ctx.players.local().tile().distanceTo(PreviousStep)<=6 && ctx.inventory.select().count()==28 )||(ctx.players.local().tile().distanceTo(Previous1Step)<=6  && ctx.inventory.select().count()==27)
         */

        if ((ctx.players.local().tile().distanceTo(from1) <= 6 && ctx.inventory.select().count() == 28)||
        (ctx.players.local().tile().distanceTo(from1) <= 6 && ctx.inventory.select().count() == 27));
        {

            int rand = Random.nextInt(1,3);
            switch (rand) {
                case 1:
                    Tile secondStep = new Tile(3016+Random.nextInt(-1,1),5592+Random.nextInt(-1,1),0);
                    ctx.movement.step(secondStep);
                    while (ctx.players.local().tile().distanceTo(secondStep)>=8 ){
                        Condition.sleep(Random.nextInt(550,800));

                        ctx.movement.step(secondStep);

                    }


                    Step3Altarr1(secondStep);
                    break;

                case 2:
                    Tile secondStep2 = new Tile(3012+Random.nextInt(-1,1),5596+Random.nextInt(-1,1),0);
                    ctx.movement.step(secondStep2);
                    while (ctx.players.local().tile().distanceTo(secondStep2)>=8 ){
                        Condition.sleep(Random.nextInt(450,700));
                        ctx.movement.step(secondStep2);
                        new AntiBan(ctx).execute();
                    }


                    Step3Altarr1(secondStep2);
                    break;

                case 3:
                    Tile secondStep3 = new Tile(3018+Random.nextInt(-1,1),5585+Random.nextInt(-1,1),0);
                    ctx.movement.step(secondStep3);
                    while (ctx.players.local().tile().distanceTo(secondStep3)>=8 ){
                        Condition.sleep(Random.nextInt(650,800));
                        ctx.movement.step(secondStep3);

                        ctx.camera.turnTo(altar);
                    }


                    Step3Altarr1(secondStep3);
                    break;
            }

        }
    }

    private void Step3Altarr1(Tile from2){
        RCrafter.status = "Walking to altar - 3rd Step";
        if ((ctx.players.local().tile().distanceTo(from2) <= 6 && ctx.inventory.select().count() == 28)||
                (ctx.players.local().tile().distanceTo(from2) <= 6 && ctx.inventory.select().count() == 27));{
            int rand = Random.nextInt(1,3);
            switch (rand) {
                case 1:
                    Tile thirdStep = new Tile(3023+Random.nextInt(-1,1),5579+Random.nextInt(-2,2),0);
                    ctx.movement.step(thirdStep);
                    while (ctx.players.local().tile().distanceTo(thirdStep)>=8 ){

                        Condition.sleep(Random.nextInt(350,600));
                        ctx.movement.step(thirdStep);
                        new AntiBan(ctx).execute();
                    }
                    Step4Altarr1(thirdStep);
                    break;

                case 2:
                    Tile thirdStep2 = new Tile(3023+Random.nextInt(-1,1),5579+Random.nextInt(-2,2),0);
                    ctx.movement.step(thirdStep2);
                    while (ctx.players.local().tile().distanceTo(thirdStep2)>=8 ){

                        Condition.sleep(Random.nextInt(550,750));
                        ctx.movement.step(thirdStep2);

                    }
                    Step4Altarr1(thirdStep2);
                    break;

                case 3:
                    Tile thirdStep3 = new Tile(3023+Random.nextInt(-1,1),5579+Random.nextInt(-2,2),0);
                    ctx.movement.step(thirdStep3);
                    while (ctx.players.local().tile().distanceTo(thirdStep3)>=8 ){

                        Condition.sleep(Random.nextInt(550,800));
                        ctx.movement.step(thirdStep3);
                        new AntiBan(ctx).execute();
                        ctx.camera.turnTo(altar);
                    }
                    Step4Altarr1(thirdStep3);
                    break;
            }


        }

    }

    private void Step4Altarr1(Tile from3){
        RCrafter.status = "Walking to altar - 4th Step";

        if ((ctx.players.local().tile().distanceTo(from3) <= 6 && ctx.inventory.select().count() == 28 && ctx.players.local().tile().distanceTo(altar) >= 10 )||
                (ctx.players.local().tile().distanceTo(from3) <= 6 && ctx.inventory.select().count() == 27 && ctx.players.local().tile().distanceTo(altar) >= 10 ));{
            int rand = Random.nextInt(1,3);
            switch (rand) {
                case 1:
                    Tile forthStep = new Tile(3043+Random.nextInt(-1,1),5577+Random.nextInt(-2,2),0);
                    ctx.movement.step(forthStep);
                    while (ctx.players.local().tile().distanceTo(forthStep)>=8 ){

                        Condition.sleep(Random.nextInt(550,700));
                        ctx.movement.step(forthStep);

                    }
                    Step5Altarr1(forthStep);
                    break;
                case 2:
                    Tile forthStep2 = new Tile(3045+Random.nextInt(-1,1),5581+Random.nextInt(-2,2),0);
                    ctx.movement.step(forthStep2);
                    while (ctx.players.local().tile().distanceTo(forthStep2)>=8 ){

                        Condition.sleep(Random.nextInt(450,700));
                        ctx.movement.step(forthStep2);

                    }
                    Step5Altarr1(forthStep2);
                    break;

                case 3:
                    Tile forthStep3 = new Tile(3041+Random.nextInt(-1,1),5580+Random.nextInt(-2,2),0);
                    ctx.movement.step(forthStep3);
                    while (ctx.players.local().tile().distanceTo(forthStep3)>=8 ){

                        Condition.sleep(Random.nextInt(550,700));
                        ctx.movement.step(forthStep3);
                        ctx.camera.turnTo(altar);
                        new AntiBan(ctx).execute();
                    }
                    Step5Altarr1(forthStep3);
                    break;
            }


        }


    }
    private void Step5Altarr1(Tile from4){
    RCrafter.status = "Walking to altar - 5th Step";

        if ((ctx.players.local().tile().distanceTo(from4) <= 6 && ctx.inventory.select().count() == 28)||
                (ctx.players.local().tile().distanceTo(from4) <= 6 && ctx.inventory.select().count() == 27));{
            int rand = Random.nextInt(1,3);
            switch (rand) {
                case 1:
                    Tile fifthStep = new Tile(3058+Random.nextInt(-1,1),5579,0);
                    ctx.movement.step(fifthStep);
                    Condition.sleep(100);
                    while (ctx.players.local().tile().distanceTo(fifthStep)>=6 ){

                        Condition.sleep(Random.nextInt(550,700));
                        ctx.movement.step(fifthStep);

                        ctx.camera.turnTo(altar);

                    }
                    break;

                case 2:
                    Tile fifthStep2 = new Tile(3058+Random.nextInt(-1,1),5580,0);
                    ctx.movement.step(fifthStep2);
                    Condition.sleep(100);
                    while (ctx.players.local().tile().distanceTo(fifthStep2)>=6 ){

                        Condition.sleep(Random.nextInt(450,700));
                        ctx.movement.step(fifthStep2);
                        ctx.camera.turnTo(altar);
                    }
                    ctx.movement.step(fifthStep2);
                    break;

                case 3:
                    Tile fifthStep3 = new Tile(3058+Random.nextInt(-1,1),5581,0);
                    ctx.movement.step(fifthStep3);
                    Condition.sleep(100);
                    while (ctx.players.local().tile().distanceTo(fifthStep3)>=6 ){

                        Condition.sleep(Random.nextInt(550,800));
                        ctx.movement.step(fifthStep3);
                        ctx.camera.turnTo(altar);
                    }
                    ctx.movement.step(fifthStep3);
                    break;
            }


        }




    }


}