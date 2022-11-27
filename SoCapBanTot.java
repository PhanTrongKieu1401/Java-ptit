/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

import java.util.*;

/**
 *
 * @author DELL
 */
public class SoCapBanTot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
        Integer t = Integer.parseInt(sc.next());
        Integer k = Integer.parseInt(sc.next());
        ArrayList<String> S = new ArrayList<>();
        while (t-- > 0) {
            S.add(sc.next());
        }
        for (int i = 0; i < S.size(); i++) {
            String s = S.get(i);
            if (!m.containsKey(s.length())) {
                ArrayList<Integer> a = new ArrayList<>();
                a.add(i);
                m.put(s.length(), a);
            } else {
                m.get(s.length()).add(i);
            }
        }
        int tmp = 0;
        for (Map.Entry<Integer, ArrayList<Integer>> e : m.entrySet()) {
            ArrayList<Integer> a = e.getValue();
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < a.size(); i++) {
                if (q.isEmpty()) {
                    q.offer(a.get(i));
                } else {
                    if (a.get(i) - q.peek() <= k)
                        q.offer(a.get(i));
                    else{
                        while(a.get(i) - q.peek() > k){
                            tmp+=q.size()-1;
                            q.poll();
                        }
                        q.offer(a.get(i));
                    }
                }
            }
            while(!q.isEmpty()){
                tmp+=q.size()-1;
                q.poll();
            }
        }
        System.out.println(tmp);
    }
}
