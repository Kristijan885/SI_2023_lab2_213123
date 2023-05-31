import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
     void everyBranchTest() {
        LinkedList<User> theLIst = new LinkedList<>();
        theLIst.add(new User("Kiko", "hjhjhjhj", "kiko@gmaail.com"));
        RuntimeException exception = assertThrows(RuntimeException.class,() -> SILab2.function(null, null));
        assertEquals("Mandatory information missing!", exception.getMessage());
        //Koga userot e null
        //Pateka od 1 do 2 i frla exception direktno do 23

        assertFalse(SILab2.function(new User(null, " !Kikygygyo", "kikogma ailcom"), theLIst));
        //Koga ima prazno mesto passwordot, email nema @ i . i usernameot e null
        //Patekata ide od 1 do 3 pa do 4 do 5 posle 14 pa 16 pa posle 17 pa 22 i na kraj terminira na 23

        assertFalse(SILab2.function(new User("Kiko", "hjhjhjhjhg", "kiko@gmaail.com"), theLIst));
        //Koga nemash specijalni karakter ima @ i . emailot username ne e null i nema " " passwordot
        //Patekata zapocinja so 1; 3; 5; 6; 7.1; 7.2; 8; 9; 10; 11; 12; 7.3;7.2; 13; 14; 16; 17; 18.1; 18.2; 19; 20; i na kraj terminira kodot so 23

        assertFalse(SILab2.function(new User("kiko", "kikouhuh", "blah@hmail.com"), theLIst));
        //Koga passwordot go ima usernamot username ne e null i email ima @ i .
        //Patekata zapocinja od 1 pa 3 pa 5 do 6 pa 7.1; 7.2; 8; 9; 11; 7.3; 7.2; 13; 14; 15, pa terminira na 23

        assertTrue(SILab2.function(new User("tiko", "panchev!ski", "skiko@gmaail.com"), theLIst));
        //Koga pasvordot ima specijalni karakteri
        //Patekata zapocinja od 1 pa 3; 5; 6; 7.1; 7.2; 8; 9; 11; 7.3,7,2; 13; 14; 16; 17; 18.1; 18.2, 19,18.3,18,2; 21 pa 22 i finalno terminira so 23.

    }

    void multipleCondition() {
        RuntimeException exception;
        //True, NotImportant, NotImportant
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertEquals("Mandatory information missing!", exception.getMessage());
        //False, True, NotImportant
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Username", null, null), null));
        assertEquals("Mandatory information missing!", exception.getMessage());
        //False, False, True
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Name", "Password!", null), null));
        assertEquals("Mandatory information missing!", exception.getMessage());
        //False, False, False
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("MyName", "djsdjsidjsij&*&", "kpancevski88@gmail.com"), null));
        assertNotEquals("Mandatory information missing!", exception.getMessage());


    }

}
