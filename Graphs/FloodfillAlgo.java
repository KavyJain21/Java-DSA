package Graphs;

public class FloodfillAlgo {
     public void helper(int[][]image,int sr,int sc,int color,boolean vis[][],int orgCol){
if(sr < 0 || sc < 0 || sr >= image. length  || sc >= image[0].length|| vis[sr] [sc] || image[sr] [sc] != orgCol) {
   return;

}
image[sr][sc]=color;
        helper(image, sr, sc-1, color, vis, orgCol);
helper(image, sr, sc+1, color, vis, orgCol);
helper(image, sr-1, sc, color, vis, orgCol);
helper(image, sr+1, sc, color, vis, orgCol);
     }
    public int[][]Floodfill(int[][]image,int sr,int sc,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
          FloodfillAlgo ffa = new FloodfillAlgo();

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1, sc = 1, newColor = 2;

        System.out.println("Original Image:");
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }

        int[][] result = ffa.Floodfill(image, sr, sc, newColor);

        System.out.println("\nFlood Filled Image:");
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    
}
