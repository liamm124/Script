package scripts.Tasks;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.*;
import scripts.RCrafter;


import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Random;

public abstract class WalkAltar extends Task {
    final GameObject altar = ctx.objects.select().name("Runecrafting altar").nearest().poll();
    private Tile Bank = new Tile(3015, 5626, 0);
    public WalkAltar(ClientContext ctx) {
        super(ctx);
    }
    private int Ran = Random.nextInt(0,100);
@Override
    public boolean activate(){
    return ( ctx.players.local().tile().distanceTo(Bank)<=7 && ctx.players.local().tile().distanceTo(Bank)>=2 && ctx.inventory.select().count()==28 )||(ctx.players.local().tile().distanceTo(Bank)<=7 && ctx.players.local().tile().distanceTo(Bank)>=2 &&  ctx.inventory.select().count()==27);
}

    private    Tile FirstStep = new Tile(3016+Random.nextInt(-1,1),5614+Random.nextInt(-1,1),0);
    private Tile To;
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
                  Tile FirstStep = new Tile(3016+Random.nextInt(-1,1),5614+Random.nextInt(-1,1),0);
                    ctx.movement.step(FirstStep);
                while (ctx.players.local().tile().distanceTo(FirstStep)>=6 ){
                    Condition.sleep(Random.nextInt(250,500));

                }
                Step2Altarr1(FirstStep);
                break;

            case 2:
                Tile FirstStep2 = new Tile(3014+Random.nextInt(-1,1),5608+Random.nextInt(-1,1),0);
                ctx.movement.step(FirstStep2);
                while (ctx.players.local().tile().distanceTo(FirstStep2)>=6 ){
                    Condition.sleep(Random.nextInt(250,600));
                    new AntiBan(ctx).execute();

                }

                Step2Altarr1(FirstStep2);
                break;

            case 3:
                Tile FirstStep3 = new Tile(3013+Random.nextInt(-1,1),5611+Random.nextInt(-1,1),0);
                ctx.movement.step(FirstStep3);
                while (ctx.players.local().tile().distanceTo(FirstStep3)>=6 ){
                    Condition.sleep(Random.nextInt(250,400));
                    new AntiBan(ctx).execute();
                }
                Step2Altarr1(FirstStep3);
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
                        Condition.sleep(Random.nextInt(250,400));

                        ctx.movement.step(secondStep);

                    }


                    Step3Altarr1(secondStep);
                    break;

                case 2:
                    Tile secondStep2 = new Tile(3012+Random.nextInt(-1,1),5596+Random.nextInt(-1,1),0);
                    ctx.movement.step(secondStep2);
                    while (ctx.players.local().tile().distanceTo(secondStep2)>=8 ){
                        Condition.sleep(Random.nextInt(250,500));
                        ctx.movement.step(secondStep2);
                        new AntiBan(ctx).execute();
                    }


                    Step3Altarr1(secondStep2);
                    break;

                case 3:
                    Tile secondStep3 = new Tile(3018+Random.nextInt(-1,1),5585+Random.nextInt(-1,1),0);
                    ctx.movement.step(secondStep3);
                    while (ctx.players.local().tile().distanceTo(secondStep3)>=8 ){
                        Condition.sleep(Random.nextInt(250,400));
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
                    Tile ThirdStep = new Tile(3023+Random.nextInt(-1,1),5579+Random.nextInt(-2,2),0);
                    ctx.movement.step(ThirdStep);
                    while (ctx.players.local().tile().distanceTo(ThirdStep)>=8 ){

                        Condition.sleep(Random.nextInt(250,600));
                        ctx.movement.step(ThirdStep);
                        new AntiBan(ctx).execute();
                    }
                    Step4Altarr1(ThirdStep);
                    break;

                case 2:
                    Tile ThirdStep2 = new Tile(3023+Random.nextInt(-1,1),5579+Random.nextInt(-2,2),0);
                    ctx.movement.step(ThirdStep2);
                    while (ctx.players.local().tile().distanceTo(ThirdStep2)>=8 ){

                        Condition.sleep(Random.nextInt(250,700));
                        ctx.movement.step(ThirdStep2);

                    }
                    Step4Altarr1(ThirdStep2);
                    break;

                case 3:
                    Tile ThirdStep3 = new Tile(3023+Random.nextInt(-1,1),5579+Random.nextInt(-2,2),0);
                    ctx.movement.step(ThirdStep3);
                    while (ctx.players.local().tile().distanceTo(ThirdStep3)>=8 ){

                        Condition.sleep(Random.nextInt(250,600));
                        ctx.movement.step(ThirdStep3);
                        new AntiBan(ctx).execute();
                        ctx.camera.turnTo(altar);
                    }
                    Step4Altarr1(ThirdStep3);
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
                    Tile ForthStep = new Tile(3043+Random.nextInt(-1,1),5577+Random.nextInt(-2,2),0);
                    ctx.movement.step(ForthStep);
                    while (ctx.players.local().tile().distanceTo(ForthStep)>=8 ){

                        Condition.sleep(Random.nextInt(250,600));
                        ctx.movement.step(ForthStep);

                    }
                    Step5Altarr1(ForthStep);
                    break;
                case 2:
                    Tile ForthStep2 = new Tile(3045+Random.nextInt(-1,1),5581+Random.nextInt(-2,2),0);
                    ctx.movement.step(ForthStep2);
                    while (ctx.players.local().tile().distanceTo(ForthStep2)>=8 ){

                        Condition.sleep(Random.nextInt(250,700));
                        ctx.movement.step(ForthStep2);

                    }
                    Step5Altarr1(ForthStep2);
                    break;

                case 3:
                    Tile ForthStep3 = new Tile(3041+Random.nextInt(-1,1),5580+Random.nextInt(-2,2),0);
                    ctx.movement.step(ForthStep3);
                    while (ctx.players.local().tile().distanceTo(ForthStep3)>=8 ){

                        Condition.sleep(Random.nextInt(250,600));
                        ctx.movement.step(ForthStep3);
                        ctx.camera.turnTo(altar);
                        new AntiBan(ctx).execute();
                    }
                    Step5Altarr1(ForthStep3);
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
                    Tile FifthStep = new Tile(3058+Random.nextInt(-1,1),5579,0);
                    ctx.movement.step(FifthStep);
                    Condition.sleep(100);
                    while (ctx.players.local().tile().distanceTo(FifthStep)>=6 ){

                        Condition.sleep(Random.nextInt(250,600));
                        ctx.movement.step(FifthStep);

                        ctx.camera.turnTo(altar);

                    }
                    break;

                case 2:
                    Tile FifthStep2 = new Tile(3058+Random.nextInt(-1,1),5580,0);
                    ctx.movement.step(FifthStep2);
                    Condition.sleep(100);
                    while (ctx.players.local().tile().distanceTo(FifthStep2)>=6 ){

                        Condition.sleep(Random.nextInt(250,600));
                        ctx.movement.step(FifthStep2);
                        ctx.camera.turnTo(altar);
                    }
                    ctx.movement.step(FifthStep2);
                    break;

                case 3:
                    Tile FifthStep3 = new Tile(3058+Random.nextInt(-1,1),5581,0);
                    ctx.movement.step(FifthStep3);
                    Condition.sleep(100);
                    while (ctx.players.local().tile().distanceTo(FifthStep3)>=6 ){

                        Condition.sleep(Random.nextInt(250,600));
                        ctx.movement.step(FifthStep3);
                        ctx.camera.turnTo(altar);
                    }
                    ctx.movement.step(FifthStep3);
                    break;
            }


        }




    }


}