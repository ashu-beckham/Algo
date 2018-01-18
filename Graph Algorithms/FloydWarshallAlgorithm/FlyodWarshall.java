import java.util.*;
import java.math.*;

public class FlyodWarshall{
	static int INF=Integer.MAX_VALUE;
	public static void main(String[] args){

		//lets create a graph having 7 vertices and fill the corresponding distance matrix with some value if there is a edge and large number otherwise.
		
		int n=7; //number of vertices

		long[][] dis = {{INF,3,2,INF,INF,INF,INF},
		{3,INF,INF,INF,4,INF,INF},
		{2,INF,INF,INF,INF,INF,5},
		{INF,INF,INF,INF,1,INF,6},
		{INF,4,INF,1,INF,7,INF},
		{INF,INF,INF,INF,7,INF,9},
		{INF,INF,5,6,INF,9,INF}};

		//dis[i][j] is the distance between the ith and jth vertice

		//lets update the distance metrice with minimum distance between the vertices

		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if (i!=j)
					dis[i][j]=Math.min(dis[i][j],dis[i][k]+dis[k][j]);
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if (i!=j)
				System.out.println("Shortest distance between vertex "+(i+1)+" and "+(j+1)+" is : "+dis[i][j]);
			}
			System.out.println();
		}
	}
}

