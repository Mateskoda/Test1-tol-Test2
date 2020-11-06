package progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Tvprogram {
    String nameOfChannel;

    String programme;
    HashMap<String, ArrayList<String>> channels;
    ArrayList<String> allProgisArrayList = new ArrayList<>();
    HashSet<String> cntProgis = new HashSet<>(allProgisArrayList);

    public Tvprogram() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("musorok.txt"));
        Scanner sc2 = new Scanner(new File("musorok2.txt"));
        ArrayList<String> channels = new ArrayList<>();
        HashMap<String, ArrayList<String>> tv = new HashMap<>();
        for (int i = 0; sc.hasNext(); i++) {
            String channel = sc.next();
            String prog = sc.nextLine().trim();
            tv.putIfAbsent(channel, new ArrayList<>());
            tv.get(channel).add(prog);

        }
//        for (int i = 0; sc2.hasNext() ; i++) {
//            String channel = sc2.next();
//            String prog = sc2.nextLine().trim();
//            tv.putIfAbsent(channel,new ArrayList<>());
//            tv.get(channel).add(prog);

//        }
        this.channels = tv;
    }

    public int cntProgrammes() {
//        HashSet<String> cntProgis= new HashSet<>();
        ArrayList<String> allProgisArrayList = new ArrayList<>();
        for (String s : channels.keySet()) {
            for (String s1 : channels.get(s)) {
                allProgisArrayList.add(s1);
            }
        }
        HashSet<String> cntProgis = new HashSet<>(allProgisArrayList);
        System.out.println(allProgisArrayList);
        System.out.println(cntProgis);
        this.allProgisArrayList = allProgisArrayList;
        this.cntProgis = cntProgis;
        return cntProgis.size();
    }

    public int oneChannelCnt(String channel) {
        return channels.get(channel).size();
    }

    public int oneProgrammeCnt(String programme) {
//        HashSet<String> cntProgis= new HashSet<>();
//        ArrayList<String> cntAllProgis = new ArrayList<>();
        int cnt = 0;
        for (String s : channels.keySet()) {
            for (String s1 : channels.get(s)) {
                if (s1.equals(programme)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public boolean isOnThisChannel(String channel, String programme) {
        for (String s : channels.keySet()) {
            if (s.equals(channel)) {
                for (String s1 : channels.get(s)) {
                    if (s1.equals(programme)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

//    public String whichProgIsOnMostChannels() {
//        int max = Integer.MIN_VALUE;
//    }
}

