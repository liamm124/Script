package scripts.Tasks;


import org.powerbot.script.rt4.*;
import scripts.RCrafter;
import scripts.Task;
import org.powerbot.script.Tile;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;

import javax.swing.*;
import java.awt.event.KeyEvent;

public abstract class AltarCraft extends Task {


    private Tile ouroDest = new Tile(3058, 5579, 0);

    public AltarCraft(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.inventory.select().count() >= 27 &&
                ctx.players.local().tile().distanceTo(ouroDest) <= 5;
    }

    public void execute() {
        int POrder = Random.nextInt(1,3);
        RCrafter.status = "Crafting runes";
        final GameObject altar = ctx.objects.select().name("Runecrafting altar").nearest().poll();
        altar.interact("Craft-rune");
        Condition.sleep(Random.nextInt(25, 50));

         while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
             altar.interact("Craft-rune");
             Condition.sleep(Random.nextInt(25, 150));


         }



        if (POrder ==1){
        Condition.sleep(Random.nextInt(800, 950));
            ctx.inventory.select().name("Giant pouch").poll().hover();
            Condition.sleep(Random.nextInt(600, 950));
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 50));
            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 500));
            ctx.input.send("{VK_SHIFT up}");
            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 150));


            }

            Condition.sleep(Random.nextInt(800, 900));
        ctx.inventory.select().name("Small pouch").poll().hover();
            Condition.sleep(Random.nextInt(600, 950));
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 50));


        ctx.inventory.select().name("Small pouch").poll().interact("Empty");
        Condition.sleep(Random.nextInt(250, 500));

        ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            ctx.input.send("{VK_SHIFT up}");
        altar.interact("Craft-rune");
        Condition.sleep(Random.nextInt(300 , 500));
            ctx.inventory.select().name("Large pouch").poll().hover();
            Condition.sleep(Random.nextInt(1500, 1600));
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 50));
        ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            ctx.input.send("{VK_SHIFT up}");
            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 150));
            }
        Condition.sleep(Random.nextInt(1400, 1650));
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 50));
            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 200));
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 200));
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 200));

            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            ctx.input.send("{VK_SHIFT up}");
            Condition.sleep(Random.nextInt(250, 350));
            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 150));


            }



        }
        if (POrder==2){
            Condition.sleep(Random.nextInt(600, 950));

            ctx.inventory.select().name("Giant pouch").poll().hover();
            Condition.sleep(Random.nextInt(800, 1250));
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 50));
            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");


            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }
            Condition.sleep(Random.nextInt(100 , 400));



            ctx.inventory.select().name("Medium pouch").poll().hover();
            Condition.sleep(Random.nextInt(1400, 1650));


            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 500));

            ctx.inventory.select().name("Small pouch").poll().interact("Empty");

            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }
            Condition.sleep(Random.nextInt(100 , 400));
            ctx.inventory.select().name("Large pouch").poll().hover();
            Condition.sleep(Random.nextInt(1400, 1650));

            ctx.inventory.select().name("Large pouch").poll().interact("Empty");

            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }
            Condition.sleep(Random.nextInt(1400, 1650));

            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 150));
            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 150));
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 150));
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 150));
            ctx.input.send("{VK_SHIFT up}");


            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }


        }
        if (POrder==3){
            Condition.sleep(Random.nextInt(900, 1050));
            ctx.inventory.select().name("Giant pouch").poll().hover();
            Condition.sleep(Random.nextInt(600, 950));
            ctx.inventory.shiftDroppingEnabled();
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 50));
            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            ctx.input.send("{VK_SHIFT up}");

            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }
            Condition.sleep(Random.nextInt(100 , 400));

            ctx.inventory.select().name("Large pouch").poll().hover();
            Condition.sleep(Random.nextInt(1400, 1700));

            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 50));
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            ctx.input.send("{VK_SHIFT up}");

            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(300 , 500));
            ctx.inventory.select().name("Medium pouch").poll().hover();
            Condition.sleep(Random.nextInt(1200, 1400));
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 150));
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 500));

            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            ctx.input.send("{VK_SHIFT up}");
            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }
            Condition.sleep(Random.nextInt(1200, 1500));
            ctx.input.send("{VK_SHIFT down}");
            Condition.sleep(Random.nextInt(25, 150));
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");

            Condition.sleep(Random.nextInt(50, 150));
            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 150));

            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 150));
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(50, 150));
            ctx.input.send("{VK_SHIFT up}");

            while (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }
                Condition.sleep(Random.nextInt(1400, 1800));






        }
        ctx.game.tab(Game.Tab.MAGIC);
        Condition.sleep(Random.nextInt(125, 250));

        if (ctx.inventory.select().id(5515).count() == 1) {

            if (!ctx.inventory.select().name("Cosmic rune").isEmpty()) {


                ctx.widgets.widget(218).component(103).interact("Dark Mage");


                Condition.sleep(Random.nextInt(5500, 6000));
                while (ctx.chat.canContinue()){
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(50, 100));
                }




            }
        }
        ctx.magic.cast(Magic.LunarSpell.OURANIA_TELEPORT);

    }
}
/**
    ctx.widgets.component(76,13).click()
 } widget76  - compoennt13
 }  ctx.movement.step()
 ctx.camera.turnTO()


 Condition.sleep(Random.nextInt(550, 700));
 ctx.widgets.widget(75).component(13).click();


 ctx.input.press(KeyEvent.VK_SHIFT);
 ctx.input.release(KeyEvent.VK_SHIFT);

 */
