package scripts.Tasks;


import org.powerbot.script.rt4.ClientContext;
import scripts.RCrafter;
import scripts.Task;
import org.powerbot.script.rt4.Magic;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.Path;
import org.powerbot.script.rt4.Player;
import org.powerbot.script.Random;
import org.powerbot.script.rt4.Component;
import org.powerbot.script.rt4.Widget;

import java.awt.event.KeyEvent;

public abstract class AltarCraft extends Task {


    private Tile OuroDest = new Tile(3058, 5579, 0);

    public AltarCraft(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.inventory.select().count() >= 27 &&
                ctx.players.local().tile().distanceTo(OuroDest) <= 5;
    }

    public void execute() {
        int POrder = Random.nextInt(1,3);
        RCrafter.status = "Crafting runes";
        final GameObject altar = ctx.objects.select().name("Runecrafting altar").nearest().poll();
        altar.interact("Craft-rune");
        Condition.sleep(Random.nextInt(25, 50));
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }
        if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 150));
        }


        if (POrder ==1){
        Condition.sleep(Random.nextInt(800, 1050));
            ctx.inventory.select().name("Giant pouch").poll().hover();
            Condition.sleep(Random.nextInt(600, 950));
            ctx.input.press(KeyEvent.VK_SHIFT);

            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 500));
            ctx.input.release(KeyEvent.VK_SHIFT);
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 50));
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 50));
            altar.interact("Craft-rune");

            Condition.sleep(Random.nextInt(800, 1050));
        ctx.inventory.select().name("Small pouch").poll().hover();
            Condition.sleep(Random.nextInt(600, 950));
            ctx.input.press(KeyEvent.VK_SHIFT);



        ctx.inventory.select().name("Small pouch").poll().interact("Empty");
        Condition.sleep(Random.nextInt(250, 500));

        ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);
        altar.interact("Craft-rune");
        Condition.sleep(Random.nextInt(300 , 500));
            ctx.inventory.select().name("Large pouch").poll().hover();
            Condition.sleep(Random.nextInt(1500, 1700));
            ctx.input.press(KeyEvent.VK_SHIFT);
        ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);
        altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 50));
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 50));
            altar.interact("Craft-rune");

        Condition.sleep(Random.nextInt(1400, 1800));
            ctx.input.press(KeyEvent.VK_SHIFT);
            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 400));
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));

            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);
            Condition.sleep(Random.nextInt(150, 400));
            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(1400, 1800));
            }



        }
        if (POrder==2){
            Condition.sleep(Random.nextInt(600, 950));

            ctx.inventory.select().name("Giant pouch").poll().hover();
            Condition.sleep(Random.nextInt(800, 1250));
            ctx.input.press(KeyEvent.VK_SHIFT);

            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");

            ctx.input.release(KeyEvent.VK_SHIFT);
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(100 , 400));



            ctx.inventory.select().name("Medium pouch").poll().hover();
            Condition.sleep(Random.nextInt(1400, 1700));
            ctx.input.press(KeyEvent.VK_SHIFT);

            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 500));
            ;
            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(100 , 400));
            ctx.inventory.select().name("Large pouch").poll().hover();
            Condition.sleep(Random.nextInt(1400, 1700));
            ctx.input.press(KeyEvent.VK_SHIFT);
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 50));
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 50));
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(1400, 1800));
            ctx.input.press(KeyEvent.VK_SHIFT);
            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));
            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 400));
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));
            ctx.input.release(KeyEvent.VK_SHIFT);


            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(1400, 1800));
            }


        }
        if (POrder==3){
            Condition.sleep(Random.nextInt(900, 1050));
            ctx.inventory.select().name("Giant pouch").poll().hover();
            Condition.sleep(Random.nextInt(600, 950));
            ctx.inventory.shiftDroppingEnabled();
            ctx.input.press(KeyEvent.VK_SHIFT);
            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);

            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(100 , 400));

            ctx.inventory.select().name("Large pouch").poll().hover();
            Condition.sleep(Random.nextInt(1400, 1700));

            ctx.input.press(KeyEvent.VK_SHIFT);
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);

            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(300 , 500));
            ctx.inventory.select().name("Medium pouch").poll().hover();
            Condition.sleep(Random.nextInt(1200, 1400));
            ctx.input.press(KeyEvent.VK_SHIFT);
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(250, 500));

            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            ctx.input.release(KeyEvent.VK_SHIFT);
            altar.interact("Craft-rune");
            Condition.sleep(Random.nextInt(25, 50));

            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 50));
            }
            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 150));
            }
            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 150));
            }
            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 150));
            }
            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(25, 150));
            }
            Condition.sleep(Random.nextInt(1200, 1500));
            ctx.input.press(KeyEvent.VK_SHIFT);
            ctx.inventory.select().name("Medium pouch").poll().interact("Empty");

            Condition.sleep(Random.nextInt(250, 400));
            ctx.inventory.select().name("Giant pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));

            ctx.inventory.select().name("Small pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));
            ctx.inventory.select().name("Large pouch").poll().interact("Empty");
            Condition.sleep(Random.nextInt(150, 400));
            ctx.input.release(KeyEvent.VK_SHIFT);

            if (!ctx.inventory.select().name("Pure Essence").isEmpty()) {
                altar.interact("Craft-rune");
                Condition.sleep(Random.nextInt(1400, 1800));
            }


        }

        if (ctx.inventory.select().id(5515).count() == 1) {

            if (!ctx.inventory.select().name("Cosmic rune").isEmpty()) {
                ctx.magic.cast(Magic.LunarSpell.NPC_CONTACT);
                Condition.sleep(Random.nextInt(550, 700));
                ctx.widgets.widget(75).component(13).click();

                Condition.sleep(Random.nextInt(5500, 6000));
                ctx.input.send("{VK_SPACE}");
                Condition.sleep(Random.nextInt(50, 100));
                ctx.input.send("{VK_SPACE}");
                Condition.sleep(Random.nextInt(50, 100));
                ctx.input.send("{VK_SPACE}");
                Condition.sleep(Random.nextInt(0, 100));
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
                }
                if (Random.nextInt(0,100)<=25) {
                    ctx.input.send("{VK_SPACE}");
                    Condition.sleep(Random.nextInt(0, 50));
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

 ctx.input.press(KeyEvent.VK_SHIFT);
 ctx.input.release(KeyEvent.VK_SHIFT);

 */
