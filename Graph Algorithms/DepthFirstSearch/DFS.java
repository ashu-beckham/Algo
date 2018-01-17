import java.util.*;

public class DFS  {
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
		dfs(0);
	}
	static void dfs(int v) {
		done++;
		visited[v] = true;
		if (done < graph.length)
			System.out.print(v + " --> ");
		else
			System.out.print(v + ". ");
		for (int u : graph[v])
			if (!visited[u])
				dfs(u);
	}
}
