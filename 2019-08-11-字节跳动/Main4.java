package cn.deepblog.ByteDance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int V = scanner.nextInt();

        List<List<Integer>> adj = new ArrayList<List<Integer>>(V+1);

        for(int i=0; i<=V; i++){

            adj.add(new ArrayList<>());
        }

        for(int i=0; i<V-1; i++){

            int var1 = scanner.nextInt();
            int var2 = scanner.nextInt();

            adj.get(var1).add(var2);
            adj.get(var2).add(var1);
        }

        boolean[] marked = new boolean[V+1];

        int source = 1;
        List<Integer> lens = new ArrayList<>();

        int cnt = 0;
        marked[source] = true;
        for(int w : adj.get(source)){

            dfs(w, adj, marked, cnt, lens);
        }

        //没来得及取%
        System.out.println(lens);

    }

    private static void dfs(int v, List<List<Integer>> adj, boolean[] marked, int cnt, List<Integer> lens){

        cnt++;
        marked[v] = true;

        for(int w : adj.get(v)){

            if(!marked[w]){
                dfs(w, adj, marked, cnt, lens);
            }
        }

        for(int i=1; i<=cnt; i++){
            lens.add(i);
        }
    }
}
