package leetCode;

import java.util.*;

public class PathCrossing1496 {

    public boolean isPathCrossing(String path) {
        //
        int x=0;
        int y=0;
        Set<String> visited=new HashSet<>();
        visited.add("0,0");
        for(char c:path.toCharArray()){
            switch (c) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
            }
            String currPos=x+","+y;
            if(visited.contains(currPos)){
                return true;
            }
            visited.add(currPos);
        }
        return false;
       /* HashMap<Character, int[]> hashMaP= new HashMap<>();
        hashMaP.put('N', new int[]{0, 1});
        hashMaP.put('S', new int[]{0, -1});
        hashMaP.put('E', new int[]{1, 0});
        hashMaP.put('W', new int[]{-1, 0});
        int xPosition = 0;
        int yPosition = 0;
        boolean result = false;
        for (int i = 0; i < path.length(); i++) {
            int[] ints = hashMaP.get(path.charAt(i));
            switch (path.charAt(i)) {
                case 'N', 'W', 'S', 'E' -> {
                    xPosition += ints[0];
                    yPosition += ints[1];
                    if (xPosition == 0 && yPosition == 0)
                        result = true;

                }
            }
        }
        return result;*/

    }

    public static void main(String[] args) {
        PathCrossing1496 p = new PathCrossing1496();
//        System.out.println(p.isPathCrossing("NES"));//false
//        System.out.println(p.isPathCrossing("NESWW"));//true
        System.out.println(p.isPathCrossing("NNSWWEWSSESSWENNW"));//true
    }


}

