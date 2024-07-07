import java.util.*;


public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        boolean res=false;
        //base lenght case
        if(s1.length()!=s2.length()){
            System.out.print(res);
            return;
        } 
        //setting values to set and map
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(Character ch:s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            set1.add(ch);
        }
        for(Character ch:s2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            set2.add(ch);
        }
        //set length check
        if(set1.size()!=set2.size()) {
            System.out.print(res);
            return;
        }
        //map value check
        for(int i=0;i<s1.length();i++){
            if(map1.get(s1.charAt(i))<=map2.get(s2.charAt(i))){
                continue;
            }else{
                System.out.print(res);
                return;
            }
        }
        System.out.print(true);
    }
}
