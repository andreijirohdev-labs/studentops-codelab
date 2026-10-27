package dev.andreijiroh.studentops.projects.dsaLabs;
import java.util.HashMap;
import java.util.Scanner;

public class HashSetLabs {
  public static int showMenu(Scanner input) {
    System.out.println("1 - Add or update entry\n2 - Search by platform/app name\n3 - Show all entries\n4 - Delete entry\n5 - Exit");
    System.out.print("Select an option to proceed: ");
    return input.nextInt();
  }
  /**
   * Guesses the base URL for a given platform.
   */
  public static String[] guessBaseUrl(String platform) {
    String[] result;
    if (platform.toLowerCase().equals("facebook") || platform.toLowerCase().equals("fb")) {
      result = new String[]{"facebook", "https://facebook.com/"};
    } else if (platform.toLowerCase().equals("twitter") || platform.toLowerCase().equals("x")) {
      result = new String[]{"twitter", "https://x.com/"};
    } else if (platform.toLowerCase().equals("instagram") || platform.toLowerCase().equals("ig")) {
      result = new String[]{"instagram", "https://instagram.com/"};
    } else if (platform.toLowerCase().equals("threads")) {
      result = new String[]{"threads","https://threads.net/@"};
    } else if (platform.toLowerCase().equals("youtube") || platform.toLowerCase().equals("yt")) {
      result = new String[]{"youtube", "https://youtube.com/@"};
    } else if (platform.toLowerCase().equals("tiktok")) {
      result = new String[]{"tiktok", "https://tiktok.com/@"};
    } else if (platform.toLowerCase().equals("medium")) {
      result = new String[]{"medium", "https://medium.com/@"};
    } else if (platform.toLowerCase().equals("substack")) {
      result = new String[]{"substack", "https://substack.com/@"};
    } else if (platform.toLowerCase().equals("bsky") || platform.toLowerCase().equals("bluesky") || platform.toLowerCase().equals("atmosphere")) {
      result = new String[]{"bluesky", "https://bsky.app/profile/"};
    } else if (platform.toLowerCase().equals("fediverse") || platform.toLowerCase().equals("fedi") || platform.toLowerCase().equals("activitypub") || platform.toLowerCase().equals("mastodon") || platform.toLowerCase().equals("peertube") || platform.toLowerCase().equals("writefreely") || platform.toLowerCase().equals("pixelfed")) {
      result = new String[]{"fediverse", ""};
    } else {
      result = new String[]{"unknown", ""};
    }

    return result;
  }
  public static void promptForHandle(Scanner input, HashMap<String, String> directory) {
    String platform;
    String fullUrl;

    System.out.print("Enter platform name: ");
    platform = input.nextLine();

    String[] guessedPlatformMetadata = guessBaseUrl(platform);
    if (guessedPlatformMetadata[0] != "unknown" && guessedPlatformMetadata[1] != "") {
      System.out.print("Enter handle: ");
      String handle = input.nextLine();
      fullUrl = guessedPlatformMetadata[1] + handle;
      platform = guessedPlatformMetadata[0];
    } else {
      System.out.print("Enter full URL: ");
      fullUrl = input.nextLine();
    }

    directory.put(platform, fullUrl);
  }
  public static void promptToLookup(Scanner input, HashMap<String, String> directory) {
    String searchQuery;
    System.out.print("Enter platform name to search: ");
    searchQuery = input.nextLine();

    if (directory.containsKey(searchQuery)) {
      System.out.println("Found: " + directory.get(searchQuery));
    } else {
      System.out.println("Not found.");
    }
  }
  public static void showAllEntries(HashMap<String, String> directory) {
    System.out.println("All social handles: "+ directory);
  }

  public static void promptToDelete(Scanner input, HashMap<String, String> directory) {
    System.out.print("Enter platform name to delete: ");
    String searchQuery = input.nextLine();

    if (directory.containsKey(searchQuery)) {
      directory.remove(searchQuery);
      System.out.println("Deleted: " + searchQuery);
    } else {
      System.out.println("Not found.");
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<String, String> handles = new HashMap<>();

    System.out.println("Social handles directory");
    do {
      int prompt = showMenu(input);
      input.nextLine();
      switch (prompt) {
        case 1:
          promptForHandle(input, handles);
          break;
        case 2:
          promptToLookup(input, handles);
          break;
        case 3:
          showAllEntries(handles);
          break;
        case 4:
          promptToDelete(input, handles);
          break;
        case 5:
          input.close();
          System.exit(0);
        default:
          System.out.println("Invalid option. Please try again.");
          break;
      }
    } while (true);
  }
}
