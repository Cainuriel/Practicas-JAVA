package javacontroldacces;

import java.util.ArrayList;
   
/**
 *
 * @author Guillem
 */
public class ControlDAcces {
    public static final int AFORO = 340;
    public ArrayList<String> usuarisVetats;
    public ArrayList<String> usuarisDinsDelRecinte;
    public static int numusuaris=0;
      
/**
* Constructor.
* Incializa les llistes d'usuaris dins del recinte i
* d'usuaris amb l'entrada vetada.
*/
    
 public ControlDAcces() {
        usuarisVetats = new ArrayList <String>();
        usuarisDinsDelRecinte = new ArrayList <String>();
        
    }    
    
/**
* Afegeix un usuari a la llista d'usuaris
* Que tenen l'entrada prohibida al recinte.
*
* @ Param id Identificador de l'usuari.
*/
    public void vetaUsuari(String id) {

        if (!usuarisVetats.contains(id)) {
            usuarisVetats.add(id);
        }
    }
/**
* Per saber si un usuari pot entrar al recinte.
*
* L'usuari pot entrar si
* 1. no és a la llista d'usuaris vetats i
* 2. no s'ha assolit l'aforament del recinte.
*
* Si l'usuari finalment pot entrar, s'afegeix
* A la llista d'usuaris que es troben dins del recinte.
*
* @ Param id Identificador de l'usuari.
* @ Return true si l'usuari pot entrar;
* False en cas contrari.
*/

   public boolean entraUsuari (String id) {
   if (usuarisVetats.contains(id) || (!usuarisDinsDelRecinte.contains(id)) ) {
            return false;
        }else {
        usuarisDinsDelRecinte.add(id);
        numusuaris++;
   return true;
   }
   
}

}