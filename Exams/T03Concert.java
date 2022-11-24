package p02Fundamentals.TheFinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class T03Concert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Band> bands = new LinkedHashMap<>();
        int totalTime = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start!")) {
            String[] commands = input.split("; ");

            String command = commands[0];
            String bandName = commands[1];
            Band band = new Band(bandName);
            switch (command) {
                case "Add":
                    List<String> members = Arrays.stream(commands[2].split(", "))
                            .collect(Collectors.toList());
                    bands.putIfAbsent(bandName, band);
                    for (int i = 0; i < members.size(); i++) {
                        if (!bands.get(bandName).getMembers().contains(members.get(i))) {
                            bands.get(bandName).getMembers().add(members.get(i));
                        }
                    }
                    break;
                case "Play":
                    int time = Integer.parseInt(commands[2]);
                    bands.putIfAbsent(bandName, band);
                    bands.get(bandName).setTime(bands.get(bandName).getTime() + time);
                    totalTime += time;
            }

            input = scanner.nextLine();
        }

        System.out.println("Total time: " + totalTime);

        for(Map.Entry<String, Band> entry : bands.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue().getTime());
        }

        Map.Entry<String, Band> entry = bands.entrySet().iterator().next();
        String band = entry.getKey();
        List<String> members = entry.getValue().getMembers();
        System.out.println(band);
        for (int i = 0; i < members.size(); i++) {
            System.out.println("=> " + members.get(i));
        }
    }

    public static class Band {
        String name;
        List<String> members = new LinkedList<>();
        int time = 0;

        public Band(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getMembers() {
            return members;
        }

        public void setMembers(List<String> members) {
            this.members = members;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }

}
