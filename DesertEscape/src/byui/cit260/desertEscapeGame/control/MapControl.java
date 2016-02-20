/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscapeGame.control;

/**
 *
 * @author Mambou & Paez
 */
public class MapControl {
    
     public void visitLocation(String nameOfPlayer, String location) {
        
        String nameSite;
        
        if (nameOfPlayer == null || location == null) {
            nameSite = "Can not visit this Location";
        }
        
        // locations to visit
        System.out.println("Welcome " + nameOfPlayer.toString() + "\n");
        System.out.println("Site to visit:\n");
        System.out.println("1. The Alien Camp");
        System.out.println("2. The Terrible Caves");
        System.out.println("3. Big Cliffs");
        System.out.println("4. Climb the Mountains");
        System.out.println("5. Walk in the Desert");
        System.out.println("6. Search the Pyramids");
        
        // select location
        String selectSite = System.in.toString();
                
        // valid location
        nameSite = moveLocation(nameOfPlayer, selectSite);
        
        if (validLocation(nameOfPlayer, nameSite))
            System.out.println("Time to win: " + nameSite);
        else
            System.out.println("Can not visit this Location, please restart");
                
    }
    
    public String moveLocation(String player, String location) {
        
        // verifying the parameters are not null
        String moveMessage = "Invalid Location";
        if (player == null || location == null)
            return moveMessage;
                
        // Assign the name of the location to visit
        if ("1".equals(location))
            moveMessage = "\"The Alien Camp\"";
        if ("2".equals(location))
            moveMessage = "\"The Terrible Caves\"";
        if ("3".equals(location))
            moveMessage = "\"Big Cliffs\"";
        if ("4".equals(location))
            moveMessage = "\"Climb the Mountains\"";
        if ("5".equals(location))
            moveMessage = "\"Walk in the Desert\"";
        if ("6".equals(location))
            moveMessage = "\"Search the Pyramids\"";
        
        // not a valid site
        return moveMessage;
        
    }
    
    public boolean validLocation(String player, String location) {
        
        if (player == null || location == null)
            return false;
        
        String nameSite = moveLocation(player, location);
        
        if (nameSite == "Invalid Location")
            return false;
        
        return true;
        
    }
    
  }
