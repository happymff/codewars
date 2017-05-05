/**
 * Created by mengfeifei on 2017/4/30.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class DirReductionTest {
    @Test
    public void testSimpleDirReduc() throws Exception {
        //assertEquals("\"EAST\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\", \"EAST\", \"EAST\", \"SOUTH\", \"NORTH\", \"WEST\"",
            //    new String[]{"EAST", "NORTH"}, DirReduction.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"}));
        assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
               new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

        assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
               new String[]{"NORTH", "WEST", "SOUTH", "EAST"}, DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
        assertEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{}, DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));



        assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\", \"SOUTH\", \"EAST\"",
                new String[]{"NORTH", "WEST", "SOUTH", "EAST", "SOUTH", "EAST"}, DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST", "SOUTH", "EAST"}));
    }
}
