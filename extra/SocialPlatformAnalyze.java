import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialPlatformAnalyze {
    public static void main(String[] args) {
        List<String> str_array = Arrays.asList(
                "Alice||Hello #Greetings||1635739200||Bob||",
                // Add more events as needed
                "John||Awesome day #happy||1635740000||Bob||Alice");

        String result = maxFollowerCount(str_array);
        System.out.println(result);
    }

    public static String maxFollowerCount(List<String> str_array) {
        Map<String, Integer> followersCount = new HashMap<>();

        for (String event : str_array) {
            String[] parts = event.split("\\|\\|");

            String userName = parts[0];
            String[] newFollowers = parts[3].split(",");
            int newFollowersCount = newFollowers.length;

            followersCount.put(userName, followersCount.getOrDefault(userName, 0) + newFollowersCount);
        }

        String resultUser = "None";
        int maxFollowers = 0;

        for (Map.Entry<String, Integer> entry : followersCount.entrySet()) {
            String userName = entry.getKey();
            int userFollowersCount = entry.getValue();

            if (userFollowersCount > maxFollowers) {
                resultUser = userName;
                maxFollowers = userFollowersCount;
            }
        }

        return resultUser;
    }
}
