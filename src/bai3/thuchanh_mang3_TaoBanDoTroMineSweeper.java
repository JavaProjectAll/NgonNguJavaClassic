package bai3;

public class thuchanh_mang3_TaoBanDoTroMineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", ".", "*", ".", "*"}
        };
        final int MAP_WIDTH = map[0].length;
        String[][] mapReport = new String[1][MAP_WIDTH];
        for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
            String curentCell = map[0][xOrdinate];
            if (curentCell.equals("*")) {
                mapReport[0][xOrdinate] = "*";
            } else {
                final int[][] NEIGHBOURS_ORDINATE = {
                        {0, xOrdinate - 1}, {0, xOrdinate + 1}
                };

                int minesAround = 0;
                boolean hasNeighbourAtLeft = xOrdinate - 1 >= 0;
                boolean hasMineAtLeft = hasNeighbourAtLeft && map[0][xOrdinate].equals("*");
                if (hasMineAtLeft) minesAround++;

                boolean hasNeighnourAtRight = xOrdinate - 1 < MAP_WIDTH;
                boolean hasMineAtRight = hasNeighnourAtRight && map[0][xOrdinate].equals("*");
                if (hasMineAtRight) minesAround++;

                mapReport[0][xOrdinate] = String.valueOf(minesAround);
            }
        }

        for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
            String currentCellReport = mapReport[0][xOrdinate];
            System.out.println(currentCellReport);
        }
    }
}
