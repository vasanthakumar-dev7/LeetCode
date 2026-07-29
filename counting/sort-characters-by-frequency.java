class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq  = new HashMap<>();
        for(char ch : s.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0)+1);
        PriorityQueue<Character> q = new PriorityQueue<>(
            (a,b) -> Integer.compare(freq.get(b), freq.get(a))
        );
        for(char ch : freq.keySet()){
            q.offer(ch);
        }
        StringBuilder sb = new StringBuilder();
        int n = q.size();
        for(int i=0; i<n; i++){
            char x = q.poll();
            for(int j=0; j<freq.get(x); j++){
                sb.append(x);
            }
        }
        return sb.toString();
    } 
}