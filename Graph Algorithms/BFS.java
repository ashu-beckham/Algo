import java.util.*;

public class BFS  {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int done = 0;
	public static void main (String[] args) {
		/*graph
		number of vertex is 4.
		1->2 means there is a edge b/w 1 and 2
		2->3
		3->4
		1->4
		*/
		graph = new ArrayList[4];
		for (int i = 0; i < 4; i++) {
			graph[i] = new ArrayList<>();
		}
		visited = new boolean[4];
		graph[0].add(1);
		graph[1].add(0);
		graph[1].add(2);
		graph[2].add(1);
		graph[2].add(3);
		graph[3].add(2);
		graph[1].add(3);
		graph[3].add(1);
		System.out.println("Path traversal is : \n");
		bfs(0);
	}
	static void bfs(int v) {
		Queue<Integer> q=new LinkedList<>();
		visited[v]=true;
		q.add(v);
		while (q.size()>0){
			int temp=q.poll();
			done++;
		if (done < graph.length)
			System.out.print(temp + " --> ");
		else
			System.out.print(temp + ". \n");
		for(int x:graph[temp])
			if (!visited[x]){
				visited[x]=true;
				q.add(x);
			}
		}
	}
}
