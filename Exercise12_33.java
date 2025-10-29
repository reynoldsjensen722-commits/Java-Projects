package chapter_12;

import java.net.URL;
import java.util.*;

public class Exercise12_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String word = input.nextLine();

        System.out.print("Enter starting URL: ");
        String startURL = input.nextLine();

        crawl(startURL, word);
    }

    public static void crawl(String startURL, String keyword) {
        LinkedList<String> list = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        list.add(startURL);

        while (!list.isEmpty()) {
            String url = list.removeFirst();
            if (visited.contains(url)) continue;

            visited.add(url);
            System.out.println("Visiting: " + url);

            try {
                URL link = new URL(url);
                Scanner input = new Scanner(link.openStream());

                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    if (line.toLowerCase().contains(keyword.toLowerCase())) {
                        System.out.println("Word '" + keyword + "' found at: " + url);
                        return;
                    }

                    for (String subUrl : getSubURLs(line, url)) {
                        if (!visited.contains(subUrl)) {
                            list.add(subUrl);
                        }
                    }
                }

            } catch (Exception e) {
                // Fail silently for broken links
            }
        }

        System.out.println("Word not found.");
    }

    public static List<String> getSubURLs(String line, String baseURL) {
        List<String> list = new ArrayList<>();
        int index = 0;

        while ((index = line.indexOf("http", index)) != -1) {
            int endIndex = line.indexOf("\"", index);
            if (endIndex != -1) {
                list.add(line.substring(index, endIndex));
                index = endIndex;
            } else {
                break;
            }
        }

        return list;
    }
}
