package p02Fundamentals.TheMidExamRetake;

import java.util.*;
import java.util.stream.Collectors;

public class T03SpiceShelf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> spicesOnShelf = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("done")) {
            String[] commandParameters = command.split("\\s+");
            switch (commandParameters[0]) {
                case "AddSpice":
                    if (!spicesOnShelf.contains(commandParameters[1])) {
                        spicesOnShelf.add(commandParameters[1]);
                    }
                    break;
                case "AddManySpices":
                    List<String> addedSpices = Arrays.stream(commandParameters[2].split("\\|")).collect(Collectors.toList());
//                    String[] addedSpices = commandParameters[2].split("\\|");
//                    for (int i = 0; i < addedSpices.length; i++) {
//                        spicesOnShelf.add(Integer.parseInt(commandParameters[1]) + i, addedSpices[i]);
//                    }
                    spicesOnShelf.addAll(Integer.parseInt(commandParameters[1]), addedSpices);
                    break;
                case "SwapSpices":
                    int index1 = spicesOnShelf.indexOf(commandParameters[1]);
                    int index2 = spicesOnShelf.indexOf(commandParameters[2]);
                    String tempSpice = spicesOnShelf.get(index1);
                    spicesOnShelf.set(index1, spicesOnShelf.get(index2));
                    spicesOnShelf.set(index2, tempSpice);
                    break;
                case "ThrowAwaySpices":
                    if (spicesOnShelf.contains(commandParameters[1])) {
                        int startingSpice = spicesOnShelf.indexOf(commandParameters[1]);
                        int startIndex = startingSpice + Integer.parseInt(commandParameters[2]) - 1;
                        if (startIndex < spicesOnShelf.size()) {
                            for (int i = startingSpice + Integer.parseInt(commandParameters[2]) - 1; i >= startingSpice; i--) {
                                spicesOnShelf.remove(i);
                            }
                        }
                    }
                    break;
                case "Arrange":
                    Collections.sort(spicesOnShelf);

            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", spicesOnShelf));
    }
}
