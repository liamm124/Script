package scripts;
import org.powerbot.script.*;
import org.powerbot.script.rt4.ClientContext;
import scripts.Tasks.*;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.Constants;
import org.powerbot.script.PollingScript;

import java.awt.event.MouseListener;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;



@Script.Manifest(name = "Rc tester",description = "testing parts for rc")
public class RCrafter extends PollingScript<ClientContext> implements PaintListener {
    private List<Task> taskList = new ArrayList<Task>();
    private int startExp;

    public static String status = "Waiting for input";

    @Override
    public void start() {
        taskList.addAll(Arrays.asList(new EssBanking(ctx) {
                                      }, new LadderDown(ctx) {
                                      }, new EssBanking(ctx) {
                                      }, new AltarCraft(ctx) {
                                      }, new WalkAltar(ctx) {

                                      }, new StaminaPot(ctx) {
                                      }, new WalkToLadder(ctx){
                                      }, new AntiBan(ctx){
                                      }, new Lost(ctx){
                                      }
        ));

        this.startExp = ctx.skills.experience(Constants.SKILLS_RUNECRAFTING);


    }

    @Override
    public void poll(){
        for (Task task : taskList) {
            if (task.activate()){
                task.execute();
            }
        }
    }



    @Override
    public void repaint(Graphics graphics) {
        long milliseconds = this.getTotalRuntime();
        long seconds = (milliseconds / 1000) % 60;
        long minutes = (milliseconds / (1000 * 60) % 60);
        long hours = (milliseconds / (1000 * 60 * 60)) % 24;

        int expGained = ctx.skills.experience(Constants.SKILLS_RUNECRAFTING) - startExp;


        Graphics2D g = (Graphics2D) graphics;

        g.setColor(new Color(0, 0, 0, 180));
        g.fillRect(0, 0, 200, 110);

        g.setColor(new Color(255, 255, 255));
        g.drawRect(0, 0, 200, 110);

        g.drawString("RCrafter - Liam", 20, 20);
        g.drawString("Running: " + String.format("%02d:%02d:%02d", hours, minutes, seconds), 20, 40);
        g.drawString("Exp/Hour " + ((int) (expGained * (3600000D / milliseconds))), 20, 60);
        g.drawString("Exp Gained: " + expGained,20,80);
        g.drawString("Status: " + status,20,100);




    }

}
