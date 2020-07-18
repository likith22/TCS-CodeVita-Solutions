package tcsCodeVita;
import java.util.*;
import java.util.Map.Entry;
public class FootballLeague {
	static <K,V extends Comparable<? super V>> 
    List<Entry<K, V>> entriesSortedByValues(Map<K,V> map) {

List<Entry<K,V>> sortedEntries = new ArrayList<Entry<K,V>>(map.entrySet());

Collections.sort(sortedEntries, 
    new Comparator<Entry<K,V>>() {
        @Override
        public int compare(Entry<K,V> e1, Entry<K,V> e2) {
            return e2.getValue().compareTo(e1.getValue());
        }
    }
);

return sortedEntries;
}
	public static void main(String[] args) {
		Map<String,Integer> teams = new HashMap<>();
		Scanner sc =  new Scanner(System.in);
		int noOfTeams = sc.nextInt();
		String[] team = new String[noOfTeams];
		for(int i = 0; i< team.length; i++) {
			team[i] = sc.next();
			//teams.put(team[i], 0);
		}
		Arrays.sort(team);
		for(int i = 0; i <team.length; i++) {
			teams.put(team[i],0);
		}
		int noOfMatches = sc.nextInt();
		String s1,s2;
		int sc1,sc2;
		int sum = 0;
		for(int i= 0; i < noOfMatches; i++){
			s1 = sc.next();
			s2 = sc.next();
			if(s1.equals(s2)) {
				System.out.println("invalid input");
				break;
			}
			sc1 = sc.nextInt();
			sc2 = sc.nextInt();
			sum = sc1 + teams.get(s1); 
			teams.replace(s1, sum);
			sum = 0;
			sum = sc2 + teams.get(s2);
			teams.replace(s2, sum);
		}
		//Map<String,Integer> temp = sortByValue(teams);
		System.out.println(entriesSortedByValues(teams));
		sc.close();
	}

}
