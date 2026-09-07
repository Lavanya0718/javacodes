
package CIET;

import java.util.concurrent.ConcurrentHashMap;

class UserRequest {
    long startTime;
    int count;

    UserRequest(long startTime, int count) {
        this.startTime = startTime;
        this.count = count;
    }
}

public class cocurrentHashMap_example_code {

    private static final int MAX_REQUESTS = 5;
    private static final long WINDOW = 60_000; // 1 minute

    private final ConcurrentHashMap<Integer, UserRequest> requests =
            new ConcurrentHashMap<>();

    public boolean allowRequest(int userId) {

        long currentTime = System.currentTimeMillis();

        UserRequest request = requests.computeIfAbsent(
                userId,
                id -> new UserRequest(currentTime, 0)
        );

        synchronized (request) {

            // Reset the request count after 1 minute
            if (currentTime - request.startTime >= WINDOW) {
                request.startTime = currentTime;
                request.count = 0;
            }

            // Check request limit
            if (request.count < MAX_REQUESTS) {
                request.count++;
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {

        cocurrentHashMap_example_code limiter =
                new cocurrentHashMap_example_code();

        int userId = 101;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Request " + i + ": " +limiter.allowRequest(userId)
            );
        }
    }
}

