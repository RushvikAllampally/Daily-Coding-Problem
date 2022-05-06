

import java.util.LinkedList;
import java.util.Queue;

class Element {
  int x;
  int y;
  int dist;
public Element(int x, int y, int dist) {
	super();
	this.x = x;
	this.y = y;
	this.dist = dist;
}
  
}


public class Day23 {

	public static void main(String[] args) {
		boolean[][] board = new boolean[][] {{false, false, false, false},{true, true, false, true},{false, false, false, false},{false, false, false, false}};
		
		System.out.println(ShortestPathInAMaze(board,3,0,0,0));
	}
	
	private static boolean isValid(boolean[][] board, int M, int N, boolean[][] visited, int i, int j) {
		  return (i >= 0 && j >= 0 && i < M && j < N && !board[i][j] && !visited[i][j]);
		}

		public static int ShortestPathInAMaze(boolean[][] board, int srcX, int srcY, int destX, int destY) {
		  int M = board.length;
		  int N = M>0 ? board[0].length : 0;
		  
		  boolean[][] visited = new boolean[M][N];
		  
		  Queue<Element> elementQueue = new LinkedList<>(); 
		  
		  if(isValid(board, M, N, visited, srcX, srcY)) {
		    elementQueue.add(new Element(srcX, srcY, 0));
		    visited[srcX][srcY] = true;
		  }
		  
		  while(!elementQueue.isEmpty()) {
		    Element tempElement = elementQueue.poll();
		    
		    if(tempElement.x == destX && tempElement.y == destY) {
		      return tempElement.dist;
		    }
		    
		    // checking if the 4 elements are valid or not and pushing in the queue
		    
		    if(isValid(board, M, N, visited, tempElement.x + 1, tempElement.y)) {
		      elementQueue.add(new Element(tempElement.x + 1, tempElement.y, tempElement.dist + 1));
		      visited[tempElement.x + 1][tempElement.y] = true;
		    }
		    
		    if(isValid(board, M, N, visited, tempElement.x - 1, tempElement.y)) {
		      elementQueue.add(new Element(tempElement.x - 1, tempElement.y, tempElement.dist + 1));
		      visited[tempElement.x - 1][tempElement.y] = true;
		    }
		    
		    if(isValid(board, M, N, visited, tempElement.x , tempElement.y + 1)) {
		      elementQueue.add(new Element(tempElement.x , tempElement.y + 1, tempElement.dist + 1));
		      visited[tempElement.x ][tempElement.y + 1] = true;
		    }
		    
		    if(isValid(board, M, N, visited, tempElement.x , tempElement.y - 1)) {
		      elementQueue.add(new Element(tempElement.x , tempElement.y - 1, tempElement.dist + 1));
		      visited[tempElement.x][tempElement.y-1] = true;
		    }
		  } 

		  // -1 indicates no path exists.
		  return -1;
		}


}
