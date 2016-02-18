/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pemberleyGame.control;

import byui.cit260.pemberleyGame.model.Player;
import pemberley_game.PemberleyGame;

/**
 *
 * @author mbp
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name ==null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        PemberleyGame.setPlayer(player); // save the player
        
        return player;
    }
}
    